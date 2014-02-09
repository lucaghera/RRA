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
 * @see org.rra.dataTypesModel.DataTypesModelFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataTypesModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rra.org/datatypesmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataTypesModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesModelPackage eINSTANCE = org.rra.dataTypesModel.impl.DataTypesModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.DataTypesModelImpl <em>Data Types Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.DataTypesModelImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getDataTypesModel()
	 * @generated
	 */
	int DATA_TYPES_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_MODEL__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Non Member Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS = 2;

	/**
	 * The number of structural features of the '<em>Data Types Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Types Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.DataTypeImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.PrimitiveDataTypeImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.CompositeDataTypeImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getCompositeDataType()
	 * @generated
	 */
	int COMPOSITE_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__FUNCTIONS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__FIELDS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.ContainerDataTypeImpl <em>Container Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.ContainerDataTypeImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getContainerDataType()
	 * @generated
	 */
	int CONTAINER_DATA_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.FunctionImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 6;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.MemberFunctionImpl <em>Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.MemberFunctionImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getMemberFunction()
	 * @generated
	 */
	int MEMBER_FUNCTION = 7;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.NonMemberFunctionImpl <em>Non Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.NonMemberFunctionImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getNonMemberFunction()
	 * @generated
	 */
	int NON_MEMBER_FUNCTION = 8;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.ROSMsgFunctionImpl <em>ROS Msg Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.ROSMsgFunctionImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getROSMsgFunction()
	 * @generated
	 */
	int ROS_MSG_FUNCTION = 9;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.FieldImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 10;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.ROSMsgFieldImpl <em>ROS Msg Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.ROSMsgFieldImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getROSMsgField()
	 * @generated
	 */
	int ROS_MSG_FIELD = 11;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.CompositeTypeFieldImpl <em>Composite Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.CompositeTypeFieldImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getCompositeTypeField()
	 * @generated
	 */
	int COMPOSITE_TYPE_FIELD = 12;

	/**
	 * The meta object id for the '{@link org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl <em>ROS Msg Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl
	 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getROSMsgDataType()
	 * @generated
	 */
	int ROS_MSG_DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Msgs package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_DATA_TYPE__MSGS_PACKAGE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_DATA_TYPE__FIELDS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_DATA_TYPE__FUNCTIONS = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ROS Msg Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ROS Msg Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DATA_TYPE__TEMPLATE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FUNCTION__RETURN_VALUE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEMBER_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEMBER_FUNCTION__RETURN_VALUE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEMBER_FUNCTION__INPUT_PARAMETER = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEMBER_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_MEMBER_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FUNCTION__INPUT_PARAMETER = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FUNCTION__OUTPUT_PARAMETER = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Msg Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ROS Msg Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FIELD__TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ROS Msg Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ROS Msg Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_MSG_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FIELD__TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.DataTypesModel <em>Data Types Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Types Model</em>'.
	 * @see org.rra.dataTypesModel.DataTypesModel
	 * @generated
	 */
	EClass getDataTypesModel();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.dataTypesModel.DataTypesModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rra.dataTypesModel.DataTypesModel#getName()
	 * @see #getDataTypesModel()
	 * @generated
	 */
	EAttribute getDataTypesModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rra.dataTypesModel.DataTypesModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.rra.dataTypesModel.DataTypesModel#getTypes()
	 * @see #getDataTypesModel()
	 * @generated
	 */
	EReference getDataTypesModel_Types();

	/**
	 * Returns the meta object for the reference list '{@link org.rra.dataTypesModel.DataTypesModel#getNonMemberFunctions <em>Non Member Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Member Functions</em>'.
	 * @see org.rra.dataTypesModel.DataTypesModel#getNonMemberFunctions()
	 * @see #getDataTypesModel()
	 * @generated
	 */
	EReference getDataTypesModel_NonMemberFunctions();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.rra.dataTypesModel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.dataTypesModel.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rra.dataTypesModel.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see org.rra.dataTypesModel.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.CompositeDataType <em>Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Data Type</em>'.
	 * @see org.rra.dataTypesModel.CompositeDataType
	 * @generated
	 */
	EClass getCompositeDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rra.dataTypesModel.CompositeDataType#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.rra.dataTypesModel.CompositeDataType#getFunctions()
	 * @see #getCompositeDataType()
	 * @generated
	 */
	EReference getCompositeDataType_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rra.dataTypesModel.CompositeDataType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.rra.dataTypesModel.CompositeDataType#getFields()
	 * @see #getCompositeDataType()
	 * @generated
	 */
	EReference getCompositeDataType_Fields();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.ContainerDataType <em>Container Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Data Type</em>'.
	 * @see org.rra.dataTypesModel.ContainerDataType
	 * @generated
	 */
	EClass getContainerDataType();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.ContainerDataType#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see org.rra.dataTypesModel.ContainerDataType#getTemplate()
	 * @see #getContainerDataType()
	 * @generated
	 */
	EReference getContainerDataType_Template();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.rra.dataTypesModel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.dataTypesModel.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rra.dataTypesModel.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.MemberFunction <em>Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Function</em>'.
	 * @see org.rra.dataTypesModel.MemberFunction
	 * @generated
	 */
	EClass getMemberFunction();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.MemberFunction#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see org.rra.dataTypesModel.MemberFunction#getReturnValue()
	 * @see #getMemberFunction()
	 * @generated
	 */
	EReference getMemberFunction_ReturnValue();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.NonMemberFunction <em>Non Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Member Function</em>'.
	 * @see org.rra.dataTypesModel.NonMemberFunction
	 * @generated
	 */
	EClass getNonMemberFunction();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.NonMemberFunction#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see org.rra.dataTypesModel.NonMemberFunction#getReturnValue()
	 * @see #getNonMemberFunction()
	 * @generated
	 */
	EReference getNonMemberFunction_ReturnValue();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.NonMemberFunction#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Parameter</em>'.
	 * @see org.rra.dataTypesModel.NonMemberFunction#getInputParameter()
	 * @see #getNonMemberFunction()
	 * @generated
	 */
	EReference getNonMemberFunction_InputParameter();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.ROSMsgFunction <em>ROS Msg Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Msg Function</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgFunction
	 * @generated
	 */
	EClass getROSMsgFunction();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.ROSMsgFunction#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Parameter</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgFunction#getInputParameter()
	 * @see #getROSMsgFunction()
	 * @generated
	 */
	EReference getROSMsgFunction_InputParameter();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.ROSMsgFunction#getOutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Parameter</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgFunction#getOutputParameter()
	 * @see #getROSMsgFunction()
	 * @generated
	 */
	EReference getROSMsgFunction_OutputParameter();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.rra.dataTypesModel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.dataTypesModel.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rra.dataTypesModel.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.ROSMsgField <em>ROS Msg Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Msg Field</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgField
	 * @generated
	 */
	EClass getROSMsgField();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.ROSMsgField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgField#getType()
	 * @see #getROSMsgField()
	 * @generated
	 */
	EReference getROSMsgField_Type();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.CompositeTypeField <em>Composite Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type Field</em>'.
	 * @see org.rra.dataTypesModel.CompositeTypeField
	 * @generated
	 */
	EClass getCompositeTypeField();

	/**
	 * Returns the meta object for the reference '{@link org.rra.dataTypesModel.CompositeTypeField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.rra.dataTypesModel.CompositeTypeField#getType()
	 * @see #getCompositeTypeField()
	 * @generated
	 */
	EReference getCompositeTypeField_Type();

	/**
	 * Returns the meta object for class '{@link org.rra.dataTypesModel.ROSMsgDataType <em>ROS Msg Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Msg Data Type</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgDataType
	 * @generated
	 */
	EClass getROSMsgDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.dataTypesModel.ROSMsgDataType#getMsgs_package <em>Msgs package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msgs package</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgDataType#getMsgs_package()
	 * @see #getROSMsgDataType()
	 * @generated
	 */
	EAttribute getROSMsgDataType_Msgs_package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rra.dataTypesModel.ROSMsgDataType#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgDataType#getFunctions()
	 * @see #getROSMsgDataType()
	 * @generated
	 */
	EReference getROSMsgDataType_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rra.dataTypesModel.ROSMsgDataType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.rra.dataTypesModel.ROSMsgDataType#getFields()
	 * @see #getROSMsgDataType()
	 * @generated
	 */
	EReference getROSMsgDataType_Fields();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesModelFactory getDataTypesModelFactory();

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
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.DataTypesModelImpl <em>Data Types Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.DataTypesModelImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getDataTypesModel()
		 * @generated
		 */
		EClass DATA_TYPES_MODEL = eINSTANCE.getDataTypesModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPES_MODEL__NAME = eINSTANCE.getDataTypesModel_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_MODEL__TYPES = eINSTANCE.getDataTypesModel_Types();

		/**
		 * The meta object literal for the '<em><b>Non Member Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS = eINSTANCE.getDataTypesModel_NonMemberFunctions();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.DataTypeImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.PrimitiveDataTypeImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.CompositeDataTypeImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getCompositeDataType()
		 * @generated
		 */
		EClass COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE__FUNCTIONS = eINSTANCE.getCompositeDataType_Functions();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE__FIELDS = eINSTANCE.getCompositeDataType_Fields();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.ContainerDataTypeImpl <em>Container Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.ContainerDataTypeImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getContainerDataType()
		 * @generated
		 */
		EClass CONTAINER_DATA_TYPE = eINSTANCE.getContainerDataType();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DATA_TYPE__TEMPLATE = eINSTANCE.getContainerDataType_Template();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.FunctionImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.MemberFunctionImpl <em>Member Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.MemberFunctionImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getMemberFunction()
		 * @generated
		 */
		EClass MEMBER_FUNCTION = eINSTANCE.getMemberFunction();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_FUNCTION__RETURN_VALUE = eINSTANCE.getMemberFunction_ReturnValue();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.NonMemberFunctionImpl <em>Non Member Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.NonMemberFunctionImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getNonMemberFunction()
		 * @generated
		 */
		EClass NON_MEMBER_FUNCTION = eINSTANCE.getNonMemberFunction();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_MEMBER_FUNCTION__RETURN_VALUE = eINSTANCE.getNonMemberFunction_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_MEMBER_FUNCTION__INPUT_PARAMETER = eINSTANCE.getNonMemberFunction_InputParameter();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.ROSMsgFunctionImpl <em>ROS Msg Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.ROSMsgFunctionImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getROSMsgFunction()
		 * @generated
		 */
		EClass ROS_MSG_FUNCTION = eINSTANCE.getROSMsgFunction();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG_FUNCTION__INPUT_PARAMETER = eINSTANCE.getROSMsgFunction_InputParameter();

		/**
		 * The meta object literal for the '<em><b>Output Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG_FUNCTION__OUTPUT_PARAMETER = eINSTANCE.getROSMsgFunction_OutputParameter();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.FieldImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.ROSMsgFieldImpl <em>ROS Msg Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.ROSMsgFieldImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getROSMsgField()
		 * @generated
		 */
		EClass ROS_MSG_FIELD = eINSTANCE.getROSMsgField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG_FIELD__TYPE = eINSTANCE.getROSMsgField_Type();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.CompositeTypeFieldImpl <em>Composite Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.CompositeTypeFieldImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getCompositeTypeField()
		 * @generated
		 */
		EClass COMPOSITE_TYPE_FIELD = eINSTANCE.getCompositeTypeField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE_FIELD__TYPE = eINSTANCE.getCompositeTypeField_Type();

		/**
		 * The meta object literal for the '{@link org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl <em>ROS Msg Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl
		 * @see org.rra.dataTypesModel.impl.DataTypesModelPackageImpl#getROSMsgDataType()
		 * @generated
		 */
		EClass ROS_MSG_DATA_TYPE = eINSTANCE.getROSMsgDataType();

		/**
		 * The meta object literal for the '<em><b>Msgs package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_MSG_DATA_TYPE__MSGS_PACKAGE = eINSTANCE.getROSMsgDataType_Msgs_package();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG_DATA_TYPE__FUNCTIONS = eINSTANCE.getROSMsgDataType_Functions();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_MSG_DATA_TYPE__FIELDS = eINSTANCE.getROSMsgDataType_Fields();

	}

} //DataTypesModelPackage
