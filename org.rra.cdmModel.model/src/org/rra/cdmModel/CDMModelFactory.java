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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rra.cdmModel.CDMModelPackage
 * @generated
 */
public interface CDMModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDMModelFactory eINSTANCE = org.rra.cdmModel.impl.CDMModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context Dependent Measurements Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Dependent Measurements Model</em>'.
	 * @generated
	 */
	ContextDependentMeasurementsModel createContextDependentMeasurementsModel();

	/**
	 * Returns a new object of class '<em>ROS Context Dependent Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Context Dependent Measurement</em>'.
	 * @generated
	 */
	ROSContextDependentMeasurement createROSContextDependentMeasurement();

	/**
	 * Returns a new object of class '<em>Orocos Context Dependent Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orocos Context Dependent Measurement</em>'.
	 * @generated
	 */
	OrocosContextDependentMeasurement createOrocosContextDependentMeasurement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDMModelPackage getCDMModelPackage();

} //CDMModelFactory
