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
package org.rra.adaptationModel.m2t.tools;



import java.util.HashSet;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.ConditionAction;
import org.rra.adaptationModel.adaptationModelDSL.PureAction;
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.cdmModel.ContextDependentMeasurement;



public class AdaptationEngineTools {

	public AdaptationEngineTools() {	

	}

	/**
	 * Returns the list of all the CMDs required for evaluating the adaptationModel
	 * (directly and inderectly contained)
	 * @generated NOT
	 */
	public HashSet<ContextDependentMeasurement> getRequiredCDMs(AdaptationModel adaptationModel){

		HashSet<ContextDependentMeasurement> cdms = new HashSet<ContextDependentMeasurement>();

		for(AdaptationRule rule : adaptationModel.getAdaptationRules()){

			if(rule instanceof AtomicRule){

				AtomicRule atomicRule = (AtomicRule)rule;

				cdms.addAll(getRequiredCDMsFromAtomicRule(atomicRule));

			}else if(rule instanceof RuleSet){

				RuleSet ruleSet = (RuleSet)rule;
				
				for(AtomicRuleWithPriority atomicRule : ruleSet.getAtomicRules()){
					
					if(atomicRule.getRuleBody() instanceof PureAction){
						
						continue;
						
					}else if(atomicRule.getRuleBody() instanceof ConditionAction){

						ConditionAction conditionAction = (ConditionAction) atomicRule.getRuleBody();

						cdms.addAll(getRequiredCDMsFromCondition(conditionAction.getCondition()));

					}
					
				}


			}

		}

		return cdms;

	}

	public HashSet<ContextDependentMeasurement> getRequiredCDMsFromAtomicRule(AtomicRule atomicRule){

		HashSet<ContextDependentMeasurement> cdms = new HashSet<ContextDependentMeasurement>();

		RuleBody ruleBody = atomicRule.getRuleBody();

		if(ruleBody instanceof PureAction){

			return cdms;

		}else if(ruleBody instanceof ConditionAction){

			ConditionAction conditionAction = (ConditionAction) ruleBody;

			cdms.addAll(getRequiredCDMsFromCondition(conditionAction.getCondition()));

		}

		return cdms;

	}

	public HashSet<ContextDependentMeasurement> getRequiredCDMsFromCondition(Condition condition){

		HashSet<ContextDependentMeasurement> cdms = new HashSet<ContextDependentMeasurement>();

		if(condition.getMeasurement() != null){
			if(cdms.add(condition.getMeasurement())){
				System.out.println(condition.getMeasurement().getName());
			}
		}

		if(condition.getSecondTerm() != null){

			cdms.addAll(getRequiredCDMsFromCondition(condition.getSecondTerm()));

		}

		return cdms;

	}

}
