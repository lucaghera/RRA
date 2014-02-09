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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rra.dataTypesModel.DataTypesModelPackage
 * @generated
 */
public interface DataTypesModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesModelFactory eINSTANCE = org.rra.dataTypesModel.impl.DataTypesModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Types Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Types Model</em>'.
	 * @generated
	 */
	DataTypesModel createDataTypesModel();

	/**
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Composite Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Data Type</em>'.
	 * @generated
	 */
	CompositeDataType createCompositeDataType();

	/**
	 * Returns a new object of class '<em>Container Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Data Type</em>'.
	 * @generated
	 */
	ContainerDataType createContainerDataType();

	/**
	 * Returns a new object of class '<em>Member Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Function</em>'.
	 * @generated
	 */
	MemberFunction createMemberFunction();

	/**
	 * Returns a new object of class '<em>Non Member Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Member Function</em>'.
	 * @generated
	 */
	NonMemberFunction createNonMemberFunction();

	/**
	 * Returns a new object of class '<em>ROS Msg Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Msg Function</em>'.
	 * @generated
	 */
	ROSMsgFunction createROSMsgFunction();

	/**
	 * Returns a new object of class '<em>ROS Msg Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Msg Field</em>'.
	 * @generated
	 */
	ROSMsgField createROSMsgField();

	/**
	 * Returns a new object of class '<em>Composite Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Type Field</em>'.
	 * @generated
	 */
	CompositeTypeField createCompositeTypeField();

	/**
	 * Returns a new object of class '<em>ROS Msg Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Msg Data Type</em>'.
	 * @generated
	 */
	ROSMsgDataType createROSMsgDataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataTypesModelPackage getDataTypesModelPackage();

} //DataTypesModelFactory
