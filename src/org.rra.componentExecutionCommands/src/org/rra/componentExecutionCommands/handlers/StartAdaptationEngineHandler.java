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
package org.rra.componentExecutionCommands.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.Instance;
import org.rra.adaptationEngine.api.AdaptationEngine;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.componentExecutionCommands.utils.RuntimeExecutionUtils;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StartAdaptationEngineHandler extends AbstractHandler {

	
	/**
	 * The constructor.
	 */
	public StartAdaptationEngineHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		if(AdaptationEngine.isRunning() == true){
			MessageDialog.openError(null, "Error", 
					"The Adaptation Engine was alrady launched!!!");
			return null;
		}
		
		if(AdaptationEngine.hasBeenLoaded() == true){
			
			AdaptationEngine adaptationEngine = AdaptationEngine.getInstance();
			adaptationEngine.start();
			
			return null;
			
		}
		
		AdaptationModel adaptationModel = RuntimeExecutionUtils.retrieveAdaptationModel(event);
		
//		FeatureModel featureModel = RuntimeExecutionUtils.getFeatureModel(adaptationModel);

		FeatureModel featureModel = adaptationModel.getFeatureModel();
		
		// retrieve the isntace
		if(featureModel.getInstances().size() < 1){
			MessageDialog.openError(null, "Error", 
					"You have to create at least one instance!!!");
			return null;
		}

		ElementListSelectionDialog instanceDialog = 
				new ElementListSelectionDialog(
						PlatformUI.getWorkbench().getDisplay().getActiveShell(), new LabelProvider());
		instanceDialog.setTitle("Instance Selection");
		instanceDialog.setMessage("Select the desired instance");
		instanceDialog.setElements(featureModel.getInstances().toArray());
		if(instanceDialog.open() != Window.OK){
			return null;
		}
		Instance instance = (Instance)instanceDialog.getResult()[0];

		AdaptationEngine adaptationEngine = AdaptationEngine.getInstance(
				adaptationModel, featureModel, instance,
				adaptationModel.getResolutionModel(),
				adaptationModel.getTempalteSystemModel(),
				adaptationModel.getCdmModel());
		
		adaptationEngine.start();
		
		System.out.println("Adaptation Engine Started");
			
		return null;
			
	}

}
