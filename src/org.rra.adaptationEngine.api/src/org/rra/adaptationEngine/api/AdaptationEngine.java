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
package org.rra.adaptationEngine.api;

import java.awt.TrayIcon.MessageType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.Instance;
import org.hyperflex.featuremodels.featuremodelsPackage;
import org.ros.message.MessageListener;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Subscriber;
import org.rra.adaptationModel.AdaptationModelDSLStandaloneSetup;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.ConditionAction;
import org.rra.adaptationModel.adaptationModelDSL.PureAction;
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.adaptationModel.m2t.tools.AdaptationEngineTools;
import org.rra.cdmModel.CDMModelPackage;
import org.rra.cdmModel.ContextDependentMeasurementsModel;
import org.rra.cdmModel.ROSContextDependentMeasurement;
import org.rra.cdmModel.xtext.utils.CDMModelSupport;
import org.rra.dataTypesModel.DataTypesModel;
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.xtext.utils.DataTypesModelSupport;
import org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage;
import org.rra.runtimeFeatureModel.xtext.utils.RuntimeFeatureModelSupport;


public class AdaptationEngine extends AbstractNodeMain{

	private FeatureModel featureModel;
	private Instance initialFeatureModelInstance;
	private Instance currentFeatureModelInstance;

	private ContextDependentMeasurementsModel cdmModel;
	private DataTypesModel dataTypesModel;

	private ResourceSet resourceSet;

	private HashSet<ROSContextDependentMeasurement> cdms;

	private HashMap<ROSContextDependentMeasurement, Object> cdmsVariables;

	private AdaptationModel adaptationModel;

	public static void main(String [ ] args){

		AdaptationEngine ae = new AdaptationEngine(
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.adaptationModel", 
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.featuremodel",
				null,
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.cdmmodel",
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.datatypesmodel");


	}

	public AdaptationEngine(String adaptationModelPath, String featureModelPath, 
			Instance initialFeatureModelInstance, String cdmModelPath,
			String dataTypesModelPath){

		resourceSet = new ResourceSetImpl();

		loadFeatureModel(featureModelPath);
		loadCDMModel(cdmModelPath);
		loadAdaptationModel(adaptationModelPath);
		loadDataTypeModel(dataTypesModelPath);

		System.out.println(featureModel.getName());

		System.out.println(((ConditionAction)((AtomicRule)adaptationModel.getAdaptationRules().get(0)).getRuleBody())
				.getCondition().getMeasurement().getName());

		System.out.println(adaptationModel.getImports().get(0).getImportURI());

		initCMDsVariables();


		//this.featureModel = featureModel;
		this.initialFeatureModelInstance = initialFeatureModelInstance;
		this.currentFeatureModelInstance = initialFeatureModelInstance;


	}

	private void loadAdaptationModel(String adaptationModelPath){

		AdaptationModelDSLPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("adaptationModel", new XMIResourceFactoryImpl());

		new AdaptationModelDSLStandaloneSetup().createInjectorAndDoEMFRegistration();

		Resource adaptationModelResource = resourceSet.getResource(URI.createURI(adaptationModelPath), true);
		adaptationModel = (AdaptationModel) adaptationModelResource.getContents().get(0);


	}

	private void loadFeatureModel(String featureModelPath){

		featuremodelsPackage.eINSTANCE.eClass();
		RuntimeFeatureModelPackage.eINSTANCE.eClass();

		RuntimeFeatureModelSupport featureModelSupport = new RuntimeFeatureModelSupport();
		featureModelSupport.registerServices(true);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("featuremodel", new XMIResourceFactoryImpl());

		Resource featureModelResource = resourceSet.getResource(URI
				.createURI(featureModelPath), true);
		featureModel = (FeatureModel) featureModelResource.getContents().get(0);

	}

	private void loadCDMModel(String cdmModelPath){

		CDMModelPackage.eINSTANCE.eClass();

		CDMModelSupport cdmModelSupport = new CDMModelSupport();
		cdmModelSupport.registerServices(true);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("cdmmodel", new XMIResourceFactoryImpl());

		Resource cdmModelResource = resourceSet.getResource(URI.createURI(cdmModelPath), true);
		cdmModel = (ContextDependentMeasurementsModel) cdmModelResource.getContents().get(0);

	}

	private void loadDataTypeModel(String dataTypesModelPath){

		DataTypesModelPackage.eINSTANCE.eClass();

		DataTypesModelSupport dataTypesModelSupport = new DataTypesModelSupport();
		dataTypesModelSupport.registerServices(true);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("datatypesmodel", new XMIResourceFactoryImpl());

		Resource dataTypesModelResource = resourceSet.getResource(URI.createURI(dataTypesModelPath), true);
		dataTypesModel = (DataTypesModel) dataTypesModelResource.getContents().get(0);

	}

	@Override
	public GraphName getDefaultNodeName() {

		return GraphName.of("rosjava/" + adaptationModel.getName());

	}

	@Override
	public void onStart(ConnectedNode connectedNode) {

		for(ROSContextDependentMeasurement cdm : cdms){

			try {

				String className = cdm.getInputDataType().getMsgs_package() + "." + cdm.getInputDataType().getName();
				Class<?> MessageType = Class.forName(className);

				String a = std_msgs.String._TYPE;

				Subscriber<MessageType> subscriber = connectedNode.newSubscriber(cdm.getName(), 
						(String)MessageType.getField("_TYPE").get(null));


				subscriber.addMessageListener(new MessageListener<MessageType>() {
					@Override
					public void onNewMessage(MessageType message) {
						//[%=subName%]Variable.setData(message.getData());
					}
				});

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		}

	}

	private void initCMDsVariables(){

		cdmsVariables = new HashMap<ROSContextDependentMeasurement, Object>();
		cdms = AdaptationEngineTools.getROSRequiredCDMs(adaptationModel);

		for(ROSContextDependentMeasurement cdm : cdms){

			try {

				String className = cdm.getInputDataType().getMsgs_package() + "." + cdm.getInputDataType().getName();
				System.out.println(" - CDM: " + cdm.getName() + ", type:" + className);

				Class<?> MessageType = Class.forName(className);

				cdmsVariables.put(cdm, MessageType.newInstance());

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		for (Iterator iterator = cdms.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next().getClass());

		}


	}


	/*
	 * This method should be executed periodically. 
	 * It receives as input the measurements and based on the rules defined in the Adaptation Model,
	 * it computes the selection of features and attribute values that best suit the current context
	 */
	private void update(){

		for( AdaptationRule rule : adaptationModel.getAdaptationRules() ){

			evaluateAndExecuteAdaptationRule(rule);

		}


	}


	private void evaluateAndExecuteAdaptationRule(AdaptationRule rule){

		if(rule instanceof AtomicRule){
			evaluateAndExecuteAtomicRule( ((AtomicRule) rule).getRuleBody());
		}else if(rule instanceof RuleSet){
			evaluateAndExecuteRuleSet( (RuleSet) rule);
		}

	}

	private void evaluateAndExecuteAtomicRule(RuleBody ruleBody){

		if(ruleBody instanceof PureAction){

			executeAtomicAction(ruleBody.getAtomicAction());

		}else if(ruleBody instanceof ConditionAction){
			evaluateAndExecuteConditionAction((ConditionAction)ruleBody);
		}

	}

	private void evaluateAndExecuteConditionAction(ConditionAction conditionAction){

		if(evaluateCondition(conditionAction.getCondition()) == false){

			if(conditionAction.getElse() != null){
				evaluateAndExecuteAtomicRule(conditionAction.getElse());
			}else{
				return;
			}

		}else{
			executeAtomicAction(conditionAction.getAtomicAction());
		}
	}

	private boolean evaluateCondition(Condition condition){

		// To be implemented

		return true;
	}

	private void evaluateAndExecuteRuleSet(RuleSet ruleSet){


		// 1) Create a rule set with rules ordered based on priority
		// As soon as the DLS grammar will be stable the comparator should be moved
		// in the class AtomicRuleWithPriority
		TreeSet<AtomicRuleWithPriority> rules = new TreeSet<AtomicRuleWithPriority>(new AtomicRuleWithPriorityComparator());

		rules.addAll(ruleSet.getAtomicRules());

		// 2) Execute the actions starting form max priority to min priority 

		for(AtomicRuleWithPriority action : rules){

			evaluateAndExecuteAtomicRule(action.getRuleBody());

		}

	}

	private void executeAtomicAction(AtomicAction atomicAction){

		if(atomicAction instanceof AtomicActionSelectFeature){

			AtomicActionSelectFeature currentAction = (AtomicActionSelectFeature)atomicAction;

			currentFeatureModelInstance.getSelectedFeatures().add(currentAction.getFeature());

		}else if(atomicAction instanceof AtomicActionDeselectFeature){

			AtomicActionDeselectFeature currentAction = (AtomicActionDeselectFeature)atomicAction;

			currentFeatureModelInstance.getSelectedFeatures().remove(currentAction.getFeature());

		}else if(atomicAction instanceof AtomicActionModifyAttribute){

			AtomicActionModifyAttribute currentAction = (AtomicActionModifyAttribute)atomicAction;



		}else if(atomicAction instanceof AtomicActionQuery){

			AtomicActionQuery currentAction = (AtomicActionQuery)atomicAction;



		}

		if(atomicAction.getSecondAction() != null){
			executeAtomicAction(atomicAction.getSecondAction());
		}

	}



}
