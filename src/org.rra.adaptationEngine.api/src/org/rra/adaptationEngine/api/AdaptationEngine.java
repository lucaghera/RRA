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

import java.util.TreeSet;

import org.hyperflex.featuremodels.FeatureModel;
import org.hyperflex.featuremodels.Instance;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
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


public class AdaptationEngine{

	private FeatureModel featureModel;
	private Instance initialFeatureModelInstance;
	private Instance currentFeatureModelInstance;

	AdaptationModel adptationModel;

	public AdaptationEngine(AdaptationModel adptationModel, FeatureModel featureModel, Instance initialFeatureModelInstance){

		this.adptationModel = adptationModel;

		this.featureModel = featureModel;
		this.initialFeatureModelInstance = initialFeatureModelInstance;
		this.currentFeatureModelInstance = initialFeatureModelInstance;


	}

	/*
	 * This method should be executed periodically. 
	 * It receives as input the measurements and based on the rules defined in the Adaptation Model,
	 * it computes the selection of features and attribute values that best suit the current context
	 */
	private void update(){

		for( AdaptationRule rule : adptationModel.getAdaptationRules() ){

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
