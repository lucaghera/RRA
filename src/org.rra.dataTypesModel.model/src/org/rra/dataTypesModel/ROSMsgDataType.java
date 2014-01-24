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
package org.rra.dataTypesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Msg Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.ROSMsgDataType#getMsgs_package <em>Msgs package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.dataTypesModel.DataTypesModelPackage#getROSMsgDataType()
 * @model
 * @generated
 */
public interface ROSMsgDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Msgs package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msgs package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msgs package</em>' attribute.
	 * @see #setMsgs_package(String)
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getROSMsgDataType_Msgs_package()
	 * @model required="true"
	 * @generated
	 */
	String getMsgs_package();

	/**
	 * Sets the value of the '{@link org.rra.dataTypesModel.ROSMsgDataType#getMsgs_package <em>Msgs package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msgs package</em>' attribute.
	 * @see #getMsgs_package()
	 * @generated
	 */
	void setMsgs_package(String value);

} // ROSMsgDataType
