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

package org.rra.runtimeresolutionengine.api;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.hyperflex.featuremodels.Instance;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.DefaultNodeMainExecutor;
import org.ros.node.NodeMainExecutor;

public class RuntimeResolutionEngine extends AbstractNodeMain {

	private static RuntimeResolutionEngine runtimeResolutionEngine = null;
	private static boolean isRunning = false;
	private NodeMainExecutor nodeMainExecutor;
	
	private Instance runtimeResolutionModel;
	private Instance initialConfiguredSystemModel;
	
	private ResourceSet resourceSet;

	public static RuntimeResolutionEngine getInstance() {
	
		if(runtimeResolutionEngine == null) {
			runtimeResolutionEngine = new RuntimeResolutionEngine();
		}
		
		return runtimeResolutionEngine;
	}
	
	private RuntimeResolutionEngine() {
		nodeMainExecutor = DefaultNodeMainExecutor.newDefault();
	}

	@Override
	public GraphName getDefaultNodeName() {
		// TODO Auto-generated method stub
		return null;
	}
}
