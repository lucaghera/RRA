/**
 * 
 */
package org.rra.adaptationAPI.java;

import java.util.ArrayList;
import java.util.List;

import org.rra.adaptationAPI.AdaptationException;
import org.rra.adaptationAPI.Component;
import org.rra.adaptationAPI.Connection;
import org.rra.adaptationAPI.System;

/**
 * @author nicoh
 *
 */
public class JSystem extends System {
	
	private String systemName;
	private List<Component> container; 
	
	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public JSystem(String systemName) {
		super();
		this.systemName = systemName;
		this.container = new ArrayList<Component>();
	}

	/* (non-Javadoc)
	 * @see org.rra.adaptationAPI.System#getAllComponents()
	 */
	@Override
	public List<Component> getAllComponents() throws AdaptationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.rra.adaptationAPI.System#getAllConnections()
	 */
	@Override
	public List<Connection> getAllConnections() throws AdaptationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.rra.adaptationAPI.System#getComponents()
	 */
	@Override
	public List<Component> getComponents() throws AdaptationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.rra.adaptationAPI.System#setComponents(java.util.List)
	 */
	@Override
	public void setComponents(List<Component> components)
			throws AdaptationException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.rra.adaptationAPI.System#addComponent(org.rra.adaptationAPI.Component)
	 */
	@Override
	public void addComponent(Component c) throws AdaptationException {
		this.container.add(c);
	}

}
