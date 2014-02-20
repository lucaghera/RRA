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

import java.util.List;

/**
 * @author nicoh
 *
 */

public abstract class System {
	public abstract List<Component>  getAllComponents()  throws AdaptationException;
	public abstract List<Connection> getAllConnections() throws AdaptationException;
	public abstract List<Component> getComponents() throws AdaptationException; 
	public abstract void setComponents(List<Component> components) throws AdaptationException;
	public abstract void addComponent(Component c) throws AdaptationException;
}
