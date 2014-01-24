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
 * A representation of the model object '<em><b>Container Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.ContainerDataType#getContainedType <em>Contained Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.dataTypesModel.DataTypesModelPackage#getContainerDataType()
 * @model
 * @generated
 */
public interface ContainerDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Contained Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Type</em>' reference.
	 * @see #setContainedType(DataType)
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getContainerDataType_ContainedType()
	 * @model required="true"
	 * @generated
	 */
	DataType getContainedType();

	/**
	 * Sets the value of the '{@link org.rra.dataTypesModel.ContainerDataType#getContainedType <em>Contained Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Type</em>' reference.
	 * @see #getContainedType()
	 * @generated
	 */
	void setContainedType(DataType value);

} // ContainerDataType
