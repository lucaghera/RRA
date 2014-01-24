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
package org.rra.cdmModel;

import org.hyperflex.roscomponentmodel.NodeMsgProducer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Context Dependent Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.cdmModel.ROSContextDependentMeasurement#getPublisher <em>Publisher</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.cdmModel.CDMModelPackage#getROSContextDependentMeasurement()
 * @model
 * @generated
 */
public interface ROSContextDependentMeasurement extends ContextDependentMeasurement {
	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(NodeMsgProducer)
	 * @see org.rra.cdmModel.CDMModelPackage#getROSContextDependentMeasurement_Publisher()
	 * @model required="true"
	 * @generated
	 */
	NodeMsgProducer getPublisher();

	/**
	 * Sets the value of the '{@link org.rra.cdmModel.ROSContextDependentMeasurement#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(NodeMsgProducer value);

} // ROSContextDependentMeasurement
