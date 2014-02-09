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
 * A representation of the model object '<em><b>ROS Msg Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.ROSMsgFunction#getInputParameter <em>Input Parameter</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.ROSMsgFunction#getOutputParameter <em>Output Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.dataTypesModel.DataTypesModelPackage#getROSMsgFunction()
 * @model
 * @generated
 */
public interface ROSMsgFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Input Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter</em>' reference.
	 * @see #setInputParameter(ROSMsgDataType)
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getROSMsgFunction_InputParameter()
	 * @model required="true"
	 * @generated
	 */
	ROSMsgDataType getInputParameter();

	/**
	 * Sets the value of the '{@link org.rra.dataTypesModel.ROSMsgFunction#getInputParameter <em>Input Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Parameter</em>' reference.
	 * @see #getInputParameter()
	 * @generated
	 */
	void setInputParameter(ROSMsgDataType value);

	/**
	 * Returns the value of the '<em><b>Output Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter</em>' reference.
	 * @see #setOutputParameter(ROSMsgDataType)
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getROSMsgFunction_OutputParameter()
	 * @model required="true"
	 * @generated
	 */
	ROSMsgDataType getOutputParameter();

	/**
	 * Sets the value of the '{@link org.rra.dataTypesModel.ROSMsgFunction#getOutputParameter <em>Output Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameter</em>' reference.
	 * @see #getOutputParameter()
	 * @generated
	 */
	void setOutputParameter(ROSMsgDataType value);

} // ROSMsgFunction
