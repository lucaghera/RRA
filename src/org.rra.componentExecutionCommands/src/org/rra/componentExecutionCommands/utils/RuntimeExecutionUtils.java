/**
 * Robotics Runtime Adaptation Toolchain
 * 
 * Copyright (c) 2014
 * All rights reserved.
 * 
 * Luca Gherardi
 * Instititute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * Nico Hochgeschwender
 * Department of Computer Science
 * Bonn-Rhine-Sieg University of Applied Sciences
 * 
 * ***********************************************************************************************
 * 
 * Authors: 
 *    <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 *    <A HREF="mailto:nico.hochgeschwender@h-brs.de">Nico Hochgeschwender</A>
 * 
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.rra.componentExecutionCommands.utils;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.roscomponentmodel.Topic;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.ConditionAction;
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.cdmModel.ContextDependentMeasurement;
import org.rra.cdmModel.ContextDependentMeasurementsModel;
import org.rra.cdmModel.ROSContextDependentMeasurement;
import org.rra.dataTypesModel.DataTypesModel;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RuntimeExecutionUtils {


	public static AdaptationModel retrieveAdaptationModel(ExecutionEvent event) throws ExecutionException {

		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		AdaptationModel adaptationModel = null;
		
		if(editor instanceof XtextEditor){

			// retrieve the adaptation model

			XtextEditor dslEditor = (XtextEditor) editor;
			IXtextDocument currentDocument = dslEditor.getDocument();

			adaptationModel =  currentDocument.readOnly(
					new IUnitOfWork<AdaptationModel,XtextResource>() {

						@Override
						public AdaptationModel exec(XtextResource state) throws Exception {
							XtextResource resource = (XtextResource)state;
							return (AdaptationModel)resource.getContents().get(0);

							//return model.getName();
						}
					});

		}
		
		if(adaptationModel == null){
			MessageDialog.openError(null, "Error", 
					"It was not possible to load the Adaptation Model!!!");
			return null;

		}

		return adaptationModel;
		
	}


	public static ContextDependentMeasurementsModel getCDMModel(AdaptationModel adaptationModel){

		ContextDependentMeasurementsModel result = null;

		for( AdaptationRule rule : adaptationModel.getAdaptationRules() ){

			if(rule instanceof AtomicRule){

				RuleBody ruleBody = (RuleBody)((AtomicRule)rule).getRuleBody();
				result = getCDMModel(ruleBody);
				if(result != null){
					return result;
				}

			}else if(rule instanceof RuleSet){

				for(AtomicRuleWithPriority priorityRule : ((RuleSet)rule).getAtomicRules()){

					result = getCDMModel(priorityRule.getRuleBody());
					if(result != null){
						return result;
					}

				}

			}

		}

		return result;

	}

	private static ContextDependentMeasurementsModel getCDMModel(RuleBody ruleBody){

		if(ruleBody instanceof ConditionAction){

			ContextDependentMeasurement cdm = (ContextDependentMeasurement)
					((ConditionAction)ruleBody).getCondition().getMeasurement();
			if(cdm.eContainer() instanceof ContextDependentMeasurementsModel){
				return (ContextDependentMeasurementsModel)cdm.eContainer();
			}

		}

		return null;

	}

	public static FeatureModel getFeatureModel(AdaptationModel adaptationModel){

		FeatureModel result = null;

		for( AdaptationRule rule : adaptationModel.getAdaptationRules() ){

			if(rule instanceof AtomicRule){

				RuleBody ruleBody = (RuleBody)((AtomicRule)rule).getRuleBody();
				result = getFeatureModel(ruleBody.getAtomicAction());
				if(result != null){
					return result;
				}

			}else if(rule instanceof RuleSet){

				for(AtomicRuleWithPriority priorityRule : ((RuleSet)rule).getAtomicRules()){


					result = getFeatureModel(priorityRule.getRuleBody().getAtomicAction());
					if(result != null){
						return result;
					}

				}

			}

		}

		MessageDialog.openError(null, "Error", 
				"It was not possible to load the Feature Model!!!");
		return null;



	}

	private static FeatureModel getFeatureModel(AtomicAction atomicAction){

		if(atomicAction instanceof AtomicActionSelectFeature){

			AtomicActionSelectFeature currentAction = (AtomicActionSelectFeature)atomicAction;

			if(currentAction.getFeature() != null){

				return currentAction.getFeature().getFeatureModel();

			}

		}else if(atomicAction instanceof AtomicActionDeselectFeature){

			AtomicActionDeselectFeature currentAction = (AtomicActionDeselectFeature)atomicAction;

			if(currentAction.getFeature() != null){

				return currentAction.getFeature().getFeatureModel();

			}

		}else if(atomicAction instanceof AtomicActionModifyAttribute){

			AtomicActionModifyAttribute currentAction = (AtomicActionModifyAttribute)atomicAction;

			if(currentAction.getFeatureAttribute() != null){

				return ((Feature)currentAction.getFeatureAttribute().eContainer()).getFeatureModel();

			}


		}else if(atomicAction instanceof AtomicActionQuery){

			AtomicActionQuery currentAction = (AtomicActionQuery)atomicAction;

			if(currentAction.getFeature() != null){

				return currentAction.getFeature().getFeatureModel();

			}


		}

		if(atomicAction.getSecondAction() != null){
			return getFeatureModel(atomicAction.getSecondAction());
		}

		return null;

	}

	public static DataTypesModel getDataTypesModel(ContextDependentMeasurementsModel cdmModel){

		for(ContextDependentMeasurement cdm : cdmModel.getCdms()){

			if(cdm instanceof ROSContextDependentMeasurement){

				ROSContextDependentMeasurement rosCDM = (ROSContextDependentMeasurement)cdm;

				if(rosCDM.getInputDataType() != null){

					return (DataTypesModel)rosCDM.getInputDataType().eContainer();

				}

			}

		}

		return null;


	}

}
