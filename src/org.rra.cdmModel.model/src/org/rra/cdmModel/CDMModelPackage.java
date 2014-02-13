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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.rra.cdmModel.CDMModelFactory
 * @model kind="package"
 * @generated
 */
public interface CDMModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdmModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rra.org/cdmmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdmModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDMModelPackage eINSTANCE = org.rra.cdmModel.impl.CDMModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rra.cdmModel.impl.ContextDependentMeasurementsModelImpl <em>Context Dependent Measurements Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.cdmModel.impl.ContextDependentMeasurementsModelImpl
	 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getContextDependentMeasurementsModel()
	 * @generated
	 */
	int CONTEXT_DEPENDENT_MEASUREMENTS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_MEASUREMENTS_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cdms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_MEASUREMENTS_MODEL__CDMS = 1;

	/**
	 * The number of structural features of the '<em>Context Dependent Measurements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_MEASUREMENTS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context Dependent Measurements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_MEASUREMENTS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rra.cdmModel.impl.ContextDependentMeasurementImpl <em>Context Dependent Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.cdmModel.impl.ContextDependentMeasurementImpl
	 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getContextDependentMeasurement()
	 * @generated
	 */
	int CONTEXT_DEPENDENT_MEASUREMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_MEASUREMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Context Dependent Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context Dependent Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DEPENDENT_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rra.cdmModel.impl.ROSContextDependentMeasurementImpl <em>ROS Context Dependent Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.cdmModel.impl.ROSContextDependentMeasurementImpl
	 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getROSContextDependentMeasurement()
	 * @generated
	 */
	int ROS_CONTEXT_DEPENDENT_MEASUREMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONTEXT_DEPENDENT_MEASUREMENT__NAME = CONTEXT_DEPENDENT_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONTEXT_DEPENDENT_MEASUREMENT__TOPIC = CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE = CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cdm Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION = CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ROS Context Dependent Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT = CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ROS Context Dependent Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONTEXT_DEPENDENT_MEASUREMENT_OPERATION_COUNT = CONTEXT_DEPENDENT_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rra.cdmModel.impl.OrocosContextDependentMeasurementImpl <em>Orocos Context Dependent Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.cdmModel.impl.OrocosContextDependentMeasurementImpl
	 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getOrocosContextDependentMeasurement()
	 * @generated
	 */
	int OROCOS_CONTEXT_DEPENDENT_MEASUREMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONTEXT_DEPENDENT_MEASUREMENT__NAME = CONTEXT_DEPENDENT_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONTEXT_DEPENDENT_MEASUREMENT__OUTPUT_PORT = CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orocos Context Dependent Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT = CONTEXT_DEPENDENT_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Orocos Context Dependent Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OROCOS_CONTEXT_DEPENDENT_MEASUREMENT_OPERATION_COUNT = CONTEXT_DEPENDENT_MEASUREMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.rra.cdmModel.ContextDependentMeasurementsModel <em>Context Dependent Measurements Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Dependent Measurements Model</em>'.
	 * @see org.rra.cdmModel.ContextDependentMeasurementsModel
	 * @generated
	 */
	EClass getContextDependentMeasurementsModel();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.cdmModel.ContextDependentMeasurementsModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rra.cdmModel.ContextDependentMeasurementsModel#getName()
	 * @see #getContextDependentMeasurementsModel()
	 * @generated
	 */
	EAttribute getContextDependentMeasurementsModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rra.cdmModel.ContextDependentMeasurementsModel#getCdms <em>Cdms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cdms</em>'.
	 * @see org.rra.cdmModel.ContextDependentMeasurementsModel#getCdms()
	 * @see #getContextDependentMeasurementsModel()
	 * @generated
	 */
	EReference getContextDependentMeasurementsModel_Cdms();

	/**
	 * Returns the meta object for class '{@link org.rra.cdmModel.ContextDependentMeasurement <em>Context Dependent Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Dependent Measurement</em>'.
	 * @see org.rra.cdmModel.ContextDependentMeasurement
	 * @generated
	 */
	EClass getContextDependentMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.cdmModel.ContextDependentMeasurement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rra.cdmModel.ContextDependentMeasurement#getName()
	 * @see #getContextDependentMeasurement()
	 * @generated
	 */
	EAttribute getContextDependentMeasurement_Name();

	/**
	 * Returns the meta object for class '{@link org.rra.cdmModel.ROSContextDependentMeasurement <em>ROS Context Dependent Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Context Dependent Measurement</em>'.
	 * @see org.rra.cdmModel.ROSContextDependentMeasurement
	 * @generated
	 */
	EClass getROSContextDependentMeasurement();

	/**
	 * Returns the meta object for the reference '{@link org.rra.cdmModel.ROSContextDependentMeasurement#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see org.rra.cdmModel.ROSContextDependentMeasurement#getTopic()
	 * @see #getROSContextDependentMeasurement()
	 * @generated
	 */
	EReference getROSContextDependentMeasurement_Topic();

	/**
	 * Returns the meta object for the reference '{@link org.rra.cdmModel.ROSContextDependentMeasurement#getInputDataType <em>Input Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Data Type</em>'.
	 * @see org.rra.cdmModel.ROSContextDependentMeasurement#getInputDataType()
	 * @see #getROSContextDependentMeasurement()
	 * @generated
	 */
	EReference getROSContextDependentMeasurement_InputDataType();

	/**
	 * Returns the meta object for the reference '{@link org.rra.cdmModel.ROSContextDependentMeasurement#getCdmFunction <em>Cdm Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cdm Function</em>'.
	 * @see org.rra.cdmModel.ROSContextDependentMeasurement#getCdmFunction()
	 * @see #getROSContextDependentMeasurement()
	 * @generated
	 */
	EReference getROSContextDependentMeasurement_CdmFunction();

	/**
	 * Returns the meta object for class '{@link org.rra.cdmModel.OrocosContextDependentMeasurement <em>Orocos Context Dependent Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orocos Context Dependent Measurement</em>'.
	 * @see org.rra.cdmModel.OrocosContextDependentMeasurement
	 * @generated
	 */
	EClass getOrocosContextDependentMeasurement();

	/**
	 * Returns the meta object for the reference '{@link org.rra.cdmModel.OrocosContextDependentMeasurement#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see org.rra.cdmModel.OrocosContextDependentMeasurement#getOutputPort()
	 * @see #getOrocosContextDependentMeasurement()
	 * @generated
	 */
	EReference getOrocosContextDependentMeasurement_OutputPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDMModelFactory getCDMModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.rra.cdmModel.impl.ContextDependentMeasurementsModelImpl <em>Context Dependent Measurements Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.cdmModel.impl.ContextDependentMeasurementsModelImpl
		 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getContextDependentMeasurementsModel()
		 * @generated
		 */
		EClass CONTEXT_DEPENDENT_MEASUREMENTS_MODEL = eINSTANCE.getContextDependentMeasurementsModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DEPENDENT_MEASUREMENTS_MODEL__NAME = eINSTANCE.getContextDependentMeasurementsModel_Name();

		/**
		 * The meta object literal for the '<em><b>Cdms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DEPENDENT_MEASUREMENTS_MODEL__CDMS = eINSTANCE.getContextDependentMeasurementsModel_Cdms();

		/**
		 * The meta object literal for the '{@link org.rra.cdmModel.impl.ContextDependentMeasurementImpl <em>Context Dependent Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.cdmModel.impl.ContextDependentMeasurementImpl
		 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getContextDependentMeasurement()
		 * @generated
		 */
		EClass CONTEXT_DEPENDENT_MEASUREMENT = eINSTANCE.getContextDependentMeasurement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_DEPENDENT_MEASUREMENT__NAME = eINSTANCE.getContextDependentMeasurement_Name();

		/**
		 * The meta object literal for the '{@link org.rra.cdmModel.impl.ROSContextDependentMeasurementImpl <em>ROS Context Dependent Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.cdmModel.impl.ROSContextDependentMeasurementImpl
		 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getROSContextDependentMeasurement()
		 * @generated
		 */
		EClass ROS_CONTEXT_DEPENDENT_MEASUREMENT = eINSTANCE.getROSContextDependentMeasurement();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_CONTEXT_DEPENDENT_MEASUREMENT__TOPIC = eINSTANCE.getROSContextDependentMeasurement_Topic();

		/**
		 * The meta object literal for the '<em><b>Input Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE = eINSTANCE.getROSContextDependentMeasurement_InputDataType();

		/**
		 * The meta object literal for the '<em><b>Cdm Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION = eINSTANCE.getROSContextDependentMeasurement_CdmFunction();

		/**
		 * The meta object literal for the '{@link org.rra.cdmModel.impl.OrocosContextDependentMeasurementImpl <em>Orocos Context Dependent Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.cdmModel.impl.OrocosContextDependentMeasurementImpl
		 * @see org.rra.cdmModel.impl.CDMModelPackageImpl#getOrocosContextDependentMeasurement()
		 * @generated
		 */
		EClass OROCOS_CONTEXT_DEPENDENT_MEASUREMENT = eINSTANCE.getOrocosContextDependentMeasurement();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OROCOS_CONTEXT_DEPENDENT_MEASUREMENT__OUTPUT_PORT = eINSTANCE.getOrocosContextDependentMeasurement_OutputPort();

	}

} //CDMModelPackage
