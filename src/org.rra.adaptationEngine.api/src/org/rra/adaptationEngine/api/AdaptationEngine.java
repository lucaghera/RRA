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

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.hyperflex.featuremodels.Feature;
import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.Instance;
import org.hyperflex.featuremodels.featuremodelsPackage;
import org.ros.concurrent.CancellableLoop;
import org.ros.internal.message.Message;
import org.ros.message.MessageListener;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.DefaultNodeMainExecutor;
import org.ros.node.NodeConfiguration;
import org.ros.node.NodeMainExecutor;
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
import org.rra.adaptationModel.adaptationModelDSL.MathOperator;
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

	private HashMap<ROSContextDependentMeasurement, Object> lastReceivedMessages;

	private AdaptationModel adaptationModel;

	private int iteration = 0;

	public static void main(String [ ] args){

		AdaptationEngine ae = new AdaptationEngine(
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.adaptationModel", 
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.featuremodel",
				"Test",
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.cdmmodel",
				"/home/luca/Projects/RRA-Examples/IROS-2014/models/iros2014.datatypesmodel");

		//		RosCore rosCore;
		//		rosCore = RosCore.newPublic(13111);
		//		rosCore.start();
		//	    try {
		//        rosCore.awaitStart();
		//    } catch (Exception e) {
		//        throw new RuntimeException(e);
		//    }

		NodeMainExecutor nodeMainExecutor = DefaultNodeMainExecutor.newDefault();

		NodeConfiguration nodeConfig = NodeConfiguration.newPrivate();
		nodeMainExecutor.execute(ae, nodeConfig);

	}

	public AdaptationEngine(String adaptationModelPath, String featureModelPath, 
			String instanceName, String cdmModelPath,
			String dataTypesModelPath){

		resourceSet = new ResourceSetImpl();

		loadFeatureModel(featureModelPath);
		loadCDMModel(cdmModelPath);
		loadDataTypeModel(dataTypesModelPath);
		loadAdaptationModel(adaptationModelPath);

		//		System.out.println("FeatureModel Name: " + featureModel.getName());
		//
		//		ROSContextDependentMeasurement cdm = (ROSContextDependentMeasurement)((ConditionAction)((AtomicRule)adaptationModel.getAdaptationRules().get(0)).getRuleBody())
		//				.getCondition().getMeasurement();
		//		
		//		System.out.println(cdm.getName());
		//		System.out.println(cdm.eIsProxy());
		//		System.out.println(cdm.getInputDataType());
		//		System.out.println(cdm.getInputDataType().getName());
		//		
		//		System.out.println("** " + dataTypesModel.getTypes().get(0).getName());
		//		System.out.println("** " + ((ROSContextDependentMeasurement)cdmModel.getCdms().get(0)).getInputDataType());


		cdms = AdaptationEngineTools.getROSRequiredCDMs(adaptationModel);

		//this.featureModel = featureModel;
		for(Instance instance : featureModel.getInstances()){

			if(instance.getId().equals(instanceName)){
				this.initialFeatureModelInstance = instance;
				this.currentFeatureModelInstance = instance;

				System.out.println("Initial instace - Selected features: ");

				for(Feature feature : currentFeatureModelInstance.getSelectedFeatures()){
					System.out.println(" - " + feature.getName());
				}

				System.out.println("------------------------------------------");

			}
		}

	}

	private void loadAdaptationModel(String adaptationModelPath){

		AdaptationModelDSLPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("adaptationModel", new XMIResourceFactoryImpl());

		new AdaptationModelDSLStandaloneSetup().createInjectorAndDoEMFRegistration();

		File file = new File(adaptationModelPath);
		Resource adaptationModelResource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
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

		File file = new File(featureModelPath);
		Resource featureModelResource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		featureModel = (FeatureModel) featureModelResource.getContents().get(0);

	}

	private void loadCDMModel(String cdmModelPath){

		CDMModelPackage.eINSTANCE.eClass();

		CDMModelSupport cdmModelSupport = new CDMModelSupport();
		cdmModelSupport.registerServices(true);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("cdmmodel", new XMIResourceFactoryImpl());

		File file = new File(cdmModelPath);
		Resource cdmModelResource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		cdmModel = (ContextDependentMeasurementsModel) cdmModelResource.getContents().get(0);

	}

	private void loadDataTypeModel(String dataTypesModelPath){

		DataTypesModelPackage.eINSTANCE.eClass();

		DataTypesModelSupport dataTypesModelSupport = new DataTypesModelSupport();
		dataTypesModelSupport.registerServices(true);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("datatypesmodel", new XMIResourceFactoryImpl());

		File file = new File(dataTypesModelPath);
		Resource dataTypesModelResource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		dataTypesModel = (DataTypesModel) dataTypesModelResource.getContents().get(0);

	}

	@Override
	public GraphName getDefaultNodeName() {

		return GraphName.of("rosjava/" + adaptationModel.getName());

	}

	private <T> void addMessageListener(final Subscriber<T> subscriber, final ROSContextDependentMeasurement cdm){

		subscriber.addMessageListener(new MessageListener<T>() {
			@Override
			public void onNewMessage(T message) {

				String className = message.getClass().getCanonicalName();

				try {
					Class<?> msgClass = Class.forName(className);
					Method getData = msgClass.getMethod("getData");
					lastReceivedMessages.put(cdm, getData.invoke(message));			

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}

			}
		});


	}

	@Override
	public void onStart(ConnectedNode connectedNode) {

		lastReceivedMessages = new HashMap<ROSContextDependentMeasurement, Object>();

		// Register all the subscribers

		for(ROSContextDependentMeasurement cdm : cdms){

			try {

				String className = cdm.getInputDataType().getMsgs_package() + "." + cdm.getInputDataType().getName();
				final Class<?> messageType = Class.forName(className);

				Subscriber<?> subscriber = connectedNode.newSubscriber(cdm.getName(), 
						(String)messageType.getField("_TYPE").get(null));

				lastReceivedMessages.put(cdm, null);

				addMessageListener(subscriber, cdm);

				//				subscriber.addMessageListener(new MessageListener<?>() {
				//					@Override
				//					public void onNewMessage(messageType message) {
				//						//[%=subName%]Variable.setData(message.getData());
				//						Method getData = messageType.getMethod("getData()");
				//						lastReceivedMessages.put(this, getData.invoke(message));
				//					}
				//				});

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

		// Register the loop callback

		connectedNode.executeCancellableLoop(new CancellableLoop(){

			@Override
			protected void setup() {

			}

			@Override
			protected void loop() throws InterruptedException {
				update();
				Thread.sleep(adaptationModel.getPeriod());
			}
		});

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

		System.out.println("Iteration " + iteration + "- Selected features: ");

		for(Feature feature : currentFeatureModelInstance.getSelectedFeatures()){
			System.out.println(" - " + feature.getName());
		}

		System.out.println("------------------------------------------");

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
		ROSContextDependentMeasurement cdm = null;

		if(condition.getMeasurement() instanceof ROSContextDependentMeasurement){
			cdm = (ROSContextDependentMeasurement) condition.getMeasurement();
		}else{
			return false;
		}
		
		Object value = lastReceivedMessages.get(cdm);
		
		if(value == null){
			return false;
		}
		
		String val = "";
		if(value instanceof String){
			val = (String)value;
		}else{
			val = String.valueOf(value);
		}
		
		val.compareTo(condition.getValue());
		
		if(condition.getOperator() == MathOperator.LESS){
			return val.compareTo(condition.getValue()) == -1;
		}else if(condition.getOperator() == MathOperator.GREATER){
			return val.compareTo(condition.getValue()) == 1;
		}else if(condition.getOperator() == MathOperator.EQUAL){
			return val.compareTo(condition.getValue()) == 0;
		}else if(condition.getOperator() == MathOperator.DIFFERENT){
			return val.compareTo(condition.getValue()) != 0;
		}

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
