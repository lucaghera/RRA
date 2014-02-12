/**
 * Robotics Runtime Adaptation Toolchain
 *
 * Copyright (c) 2014
 * All rights reserved.
 *
 * Nico Hochgeschwender
 * Department of Computer Science
 * Bonn-Rhein-Sieg University 
 *
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 *
 * ***********************************************************************************************
 *
 * Author: <A HREF="mailto:nico.hochgeschwender@h-brs.de">Nico Hochgeschwender</A>
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
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
package org.rra.adaptationAPI;

/**
 * @author nicoh
 *
 */
public interface SystemAdaptation {

	public void startComponent(Component c) throws AdaptationException;

	public void stopComponent(Component c) throws AdaptationException;
	
	public void removeComponent(Component c) throws AdaptationException;

	public void addComponent(Component c) throws AdaptationException;
	
	public void connectComponent(Component src, Component sink, Connection conn) throws AdaptationException;
}
