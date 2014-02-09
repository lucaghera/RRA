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
 * A representation of the model object '<em><b>Non Member Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.NonMemberFunction#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.NonMemberFunction#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.dataTypesModel.DataTypesModelPackage#getNonMemberFunction()
 * @model
 * @generated
 */
public interface NonMemberFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' reference.
	 * @see #setReturnValue(DataType)
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getNonMemberFunction_ReturnValue()
	 * @model required="true"
	 * @generated
	 */
	DataType getReturnValue();

	/**
	 * Sets the value of the '{@link org.rra.dataTypesModel.NonMemberFunction#getReturnValue <em>Return Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(DataType value);

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
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getNonMemberFunction_InputParameter()
	 * @model required="true"
	 * @generated
	 */
	ROSMsgDataType getInputParameter();

	/**
	 * Sets the value of the '{@link org.rra.dataTypesModel.NonMemberFunction#getInputParameter <em>Input Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Parameter</em>' reference.
	 * @see #getInputParameter()
	 * @generated
	 */
	void setInputParameter(ROSMsgDataType value);

} // NonMemberFunction
