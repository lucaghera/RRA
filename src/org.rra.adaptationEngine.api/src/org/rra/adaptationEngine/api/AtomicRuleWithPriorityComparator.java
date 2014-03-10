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

import java.util.Comparator;

import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;

public class AtomicRuleWithPriorityComparator implements Comparator<AtomicRuleWithPriority> {

	
	
	/*
	 * This is designed in such a way that a rule with priority 0 is stored
	 * after a rule with priority 1.
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(AtomicRuleWithPriority arg0, AtomicRuleWithPriority arg1) {

		if(arg0.getPriorityValue() < arg1.getPriorityValue()){
			return 1;
		}else if(arg0.getPriorityValue() == arg1.getPriorityValue()){
			return 0;
		}else{ // (arg0.getPriorityValue() > arg1.getPriorityValue()){
			return -1;
		}

	}



}
