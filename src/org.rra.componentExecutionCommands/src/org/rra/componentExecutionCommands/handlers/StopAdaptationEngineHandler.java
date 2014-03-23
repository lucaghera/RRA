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
import org.rra.adaptationEngine.api.AdaptationEngine;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StopAdaptationEngineHandler extends AbstractHandler {

	
	/**
	 * The constructor.
	 */
	public StopAdaptationEngineHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		if(AdaptationEngine.isRunning() == false){
			MessageDialog.openError(null, "Error", 
					"The Adaptation Engine is not running!!!");
			return null;
		}
		
		// this condition should never be true
		if(AdaptationEngine.hasBeenLoaded() == false){
			
			MessageDialog.openError(null, "Error", 
					"The Adaptation Engine never started!!!");
			return null;
			
		}

		AdaptationEngine adaptationEngine = AdaptationEngine.getInstance();
		adaptationEngine.stop();
		
		System.out.println("Adaptation Engine Stopped");
		
		return null;
			
	}

}
