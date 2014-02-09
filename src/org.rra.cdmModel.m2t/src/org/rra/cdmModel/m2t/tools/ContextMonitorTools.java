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
package org.rra.cdmModel.m2t.tools;



import java.util.ArrayList;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.hyperflex.roscomponentmodel.AbstractComponent;
import org.hyperflex.roscomponentmodel.Composite;
import org.hyperflex.roscomponentmodel.CompositeMsgInterface;
import org.hyperflex.roscomponentmodel.MsgInterface;
import org.hyperflex.roscomponentmodel.Node;
import org.hyperflex.roscomponentmodel.NodeMsgInterface;
import org.hyperflex.roscomponentmodel.Topic;
import org.rra.cdmModel.ContextDependentMeasurement;
import org.rra.cdmModel.ContextDependentMeasurementsModel;
import org.rra.cdmModel.ROSContextDependentMeasurement;
import org.rra.dataTypesModel.ROSMsgDataType;



public class ContextMonitorTools {

	public ContextMonitorTools() {	

	}

		/**
	 * Returns the list of all the nodes of a certain composite
	 * (directly and inderectly contained)
	 * @generated NOT
	 */
	public ArrayList<String> getIncludes(ContextDependentMeasurementsModel cdmModel){

		ArrayList<String> includes = new ArrayList<String>();

		for(ContextDependentMeasurement cdm : cdmModel.getCdms()){
			
			String include;
			if(cdm instanceof ROSContextDependentMeasurement){
				ROSContextDependentMeasurement ROSCdm = (ROSContextDependentMeasurement)cdm;
				
				include = ROSCdm.getInputDataType().getMsgs_package() + "/" 
						+ ROSCdm.getInputDataType().getName() + ".h";
				if(includes.contains(include) == false){
					includes.add(include);
				}
				
				if(ROSCdm.getCdmFunction() != null){
					
					include = ROSCdm.getCdmFunction().getOutputParameter().getMsgs_package()
							+ "/"  + ROSCdm.getCdmFunction().getOutputParameter().getName()
							+ ".h";
					if(includes.contains(include) == false){
						includes.add(include);
					}
					
				}
				
			}
			
			
		}

		return includes;

	}

	

}
