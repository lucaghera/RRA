package org.rra.adaptationAPI.java;
import java.util.List;

import org.rra.adaptationAPI.*;

public class JComponent extends Thread implements Component  {
	
	private String componentName;
	
	public JComponent(String componentName) {
		super();
		this.componentName = componentName;
	}

	@Override
	public List<ComponentProperty> getComponentProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getComponentName() {
		return this.componentName;
	}

	@Override
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

}
