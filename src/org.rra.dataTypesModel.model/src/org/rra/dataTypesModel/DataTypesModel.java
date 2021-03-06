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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Types Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.DataTypesModel#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.DataTypesModel#getTypes <em>Types</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.DataTypesModel#getNonMemberFunctions <em>Non Member Functions</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.DataTypesModel#getRosMsgFunctions <em>Ros Msg Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.dataTypesModel.DataTypesModelPackage#getDataTypesModel()
 * @model
 * @generated
 */
public interface DataTypesModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getDataTypesModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rra.dataTypesModel.DataTypesModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.rra.dataTypesModel.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getDataTypesModel_Types()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataType> getTypes();

	/**
	 * Returns the value of the '<em><b>Non Member Functions</b></em>' reference list.
	 * The list contents are of type {@link org.rra.dataTypesModel.NonMemberFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Member Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Member Functions</em>' reference list.
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getDataTypesModel_NonMemberFunctions()
	 * @model
	 * @generated
	 */
	EList<NonMemberFunction> getNonMemberFunctions();

	/**
	 * Returns the value of the '<em><b>Ros Msg Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.rra.dataTypesModel.ROSMsgFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Msg Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Msg Functions</em>' containment reference list.
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#getDataTypesModel_RosMsgFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSMsgFunction> getRosMsgFunctions();

} // DataTypesModel
