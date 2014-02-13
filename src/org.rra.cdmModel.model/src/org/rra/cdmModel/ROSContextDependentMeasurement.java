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

import org.hyperflex.roscomponentmodel.Topic;
import org.rra.dataTypesModel.ROSMsgDataType;
import org.rra.dataTypesModel.ROSMsgFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Context Dependent Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.cdmModel.ROSContextDependentMeasurement#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.rra.cdmModel.ROSContextDependentMeasurement#getInputDataType <em>Input Data Type</em>}</li>
 *   <li>{@link org.rra.cdmModel.ROSContextDependentMeasurement#getCdmFunction <em>Cdm Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.cdmModel.CDMModelPackage#getROSContextDependentMeasurement()
 * @model
 * @generated
 */
public interface ROSContextDependentMeasurement extends ContextDependentMeasurement {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see org.rra.cdmModel.CDMModelPackage#getROSContextDependentMeasurement_Topic()
	 * @model required="true"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link org.rra.cdmModel.ROSContextDependentMeasurement#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

	/**
	 * Returns the value of the '<em><b>Input Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Type</em>' reference.
	 * @see #setInputDataType(ROSMsgDataType)
	 * @see org.rra.cdmModel.CDMModelPackage#getROSContextDependentMeasurement_InputDataType()
	 * @model
	 * @generated
	 */
	ROSMsgDataType getInputDataType();

	/**
	 * Sets the value of the '{@link org.rra.cdmModel.ROSContextDependentMeasurement#getInputDataType <em>Input Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data Type</em>' reference.
	 * @see #getInputDataType()
	 * @generated
	 */
	void setInputDataType(ROSMsgDataType value);

	/**
	 * Returns the value of the '<em><b>Cdm Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdm Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdm Function</em>' reference.
	 * @see #setCdmFunction(ROSMsgFunction)
	 * @see org.rra.cdmModel.CDMModelPackage#getROSContextDependentMeasurement_CdmFunction()
	 * @model
	 * @generated
	 */
	ROSMsgFunction getCdmFunction();

	/**
	 * Sets the value of the '{@link org.rra.cdmModel.ROSContextDependentMeasurement#getCdmFunction <em>Cdm Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdm Function</em>' reference.
	 * @see #getCdmFunction()
	 * @generated
	 */
	void setCdmFunction(ROSMsgFunction value);

} // ROSContextDependentMeasurement
