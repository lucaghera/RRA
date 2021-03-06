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
package org.rra.dataTypesModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.rra.dataTypesModel.CompositeDataType;
import org.rra.dataTypesModel.CompositeTypeField;
import org.rra.dataTypesModel.ContainerDataType;
import org.rra.dataTypesModel.DataType;
import org.rra.dataTypesModel.DataTypesModel;
import org.rra.dataTypesModel.DataTypesModelFactory;
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.EnumElement;
import org.rra.dataTypesModel.Enumerator;
import org.rra.dataTypesModel.Field;
import org.rra.dataTypesModel.Function;
import org.rra.dataTypesModel.MemberFunction;
import org.rra.dataTypesModel.NonMemberFunction;
import org.rra.dataTypesModel.PrimitiveDataType;
import org.rra.dataTypesModel.ROSMsgDataType;
import org.rra.dataTypesModel.ROSMsgField;
import org.rra.dataTypesModel.ROSMsgFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesModelPackageImpl extends EPackageImpl implements DataTypesModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypesModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonMemberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosMsgFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosMsgFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosMsgDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.rra.dataTypesModel.DataTypesModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataTypesModelPackageImpl() {
		super(eNS_URI, DataTypesModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DataTypesModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataTypesModelPackage init() {
		if (isInited) return (DataTypesModelPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesModelPackage.eNS_URI);

		// Obtain or create and register package
		DataTypesModelPackageImpl theDataTypesModelPackage = (DataTypesModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataTypesModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataTypesModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDataTypesModelPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataTypesModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataTypesModelPackage.eNS_URI, theDataTypesModelPackage);
		return theDataTypesModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypesModel() {
		return dataTypesModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypesModel_Name() {
		return (EAttribute)dataTypesModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesModel_Types() {
		return (EReference)dataTypesModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesModel_NonMemberFunctions() {
		return (EReference)dataTypesModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesModel_RosMsgFunctions() {
		return (EReference)dataTypesModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Name() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeDataType() {
		return compositeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDataType_Functions() {
		return (EReference)compositeDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDataType_Fields() {
		return (EReference)compositeDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerDataType() {
		return containerDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerDataType_Template() {
		return (EReference)containerDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberFunction() {
		return memberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberFunction_ReturnValue() {
		return (EReference)memberFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonMemberFunction() {
		return nonMemberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonMemberFunction_ReturnValue() {
		return (EReference)nonMemberFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonMemberFunction_InputParameter() {
		return (EReference)nonMemberFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSMsgFunction() {
		return rosMsgFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSMsgFunction_InputParameter() {
		return (EReference)rosMsgFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSMsgFunction_OutputParameter() {
		return (EReference)rosMsgFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSMsgField() {
		return rosMsgFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSMsgField_Type() {
		return (EReference)rosMsgFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeTypeField() {
		return compositeTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTypeField_Type() {
		return (EReference)compositeTypeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSMsgDataType() {
		return rosMsgDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROSMsgDataType_Msgs_package() {
		return (EAttribute)rosMsgDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerator() {
		return enumeratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerator_Elements() {
		return (EReference)enumeratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumElement() {
		return enumElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumElement_Name() {
		return (EAttribute)enumElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSMsgDataType_Fields() {
		return (EReference)rosMsgDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesModelFactory getDataTypesModelFactory() {
		return (DataTypesModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataTypesModelEClass = createEClass(DATA_TYPES_MODEL);
		createEAttribute(dataTypesModelEClass, DATA_TYPES_MODEL__NAME);
		createEReference(dataTypesModelEClass, DATA_TYPES_MODEL__TYPES);
		createEReference(dataTypesModelEClass, DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS);
		createEReference(dataTypesModelEClass, DATA_TYPES_MODEL__ROS_MSG_FUNCTIONS);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__NAME);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);

		compositeDataTypeEClass = createEClass(COMPOSITE_DATA_TYPE);
		createEReference(compositeDataTypeEClass, COMPOSITE_DATA_TYPE__FUNCTIONS);
		createEReference(compositeDataTypeEClass, COMPOSITE_DATA_TYPE__FIELDS);

		rosMsgDataTypeEClass = createEClass(ROS_MSG_DATA_TYPE);
		createEAttribute(rosMsgDataTypeEClass, ROS_MSG_DATA_TYPE__MSGS_PACKAGE);
		createEReference(rosMsgDataTypeEClass, ROS_MSG_DATA_TYPE__FIELDS);

		enumeratorEClass = createEClass(ENUMERATOR);
		createEReference(enumeratorEClass, ENUMERATOR__ELEMENTS);

		enumElementEClass = createEClass(ENUM_ELEMENT);
		createEAttribute(enumElementEClass, ENUM_ELEMENT__NAME);

		containerDataTypeEClass = createEClass(CONTAINER_DATA_TYPE);
		createEReference(containerDataTypeEClass, CONTAINER_DATA_TYPE__TEMPLATE);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);

		memberFunctionEClass = createEClass(MEMBER_FUNCTION);
		createEReference(memberFunctionEClass, MEMBER_FUNCTION__RETURN_VALUE);

		nonMemberFunctionEClass = createEClass(NON_MEMBER_FUNCTION);
		createEReference(nonMemberFunctionEClass, NON_MEMBER_FUNCTION__RETURN_VALUE);
		createEReference(nonMemberFunctionEClass, NON_MEMBER_FUNCTION__INPUT_PARAMETER);

		rosMsgFunctionEClass = createEClass(ROS_MSG_FUNCTION);
		createEReference(rosMsgFunctionEClass, ROS_MSG_FUNCTION__INPUT_PARAMETER);
		createEReference(rosMsgFunctionEClass, ROS_MSG_FUNCTION__OUTPUT_PARAMETER);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);

		rosMsgFieldEClass = createEClass(ROS_MSG_FIELD);
		createEReference(rosMsgFieldEClass, ROS_MSG_FIELD__TYPE);

		compositeTypeFieldEClass = createEClass(COMPOSITE_TYPE_FIELD);
		createEReference(compositeTypeFieldEClass, COMPOSITE_TYPE_FIELD__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
		compositeDataTypeEClass.getESuperTypes().add(this.getDataType());
		rosMsgDataTypeEClass.getESuperTypes().add(this.getDataType());
		enumeratorEClass.getESuperTypes().add(this.getDataType());
		containerDataTypeEClass.getESuperTypes().add(this.getDataType());
		memberFunctionEClass.getESuperTypes().add(this.getFunction());
		nonMemberFunctionEClass.getESuperTypes().add(this.getFunction());
		rosMsgFunctionEClass.getESuperTypes().add(this.getFunction());
		rosMsgFieldEClass.getESuperTypes().add(this.getField());
		compositeTypeFieldEClass.getESuperTypes().add(this.getField());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataTypesModelEClass, DataTypesModel.class, "DataTypesModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTypesModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataTypesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypesModel_Types(), this.getDataType(), null, "types", null, 1, -1, DataTypesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypesModel_NonMemberFunctions(), this.getNonMemberFunction(), null, "nonMemberFunctions", null, 0, -1, DataTypesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypesModel_RosMsgFunctions(), this.getROSMsgFunction(), null, "rosMsgFunctions", null, 0, -1, DataTypesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeDataTypeEClass, CompositeDataType.class, "CompositeDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDataType_Functions(), this.getFunction(), null, "functions", null, 0, -1, CompositeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeDataType_Fields(), this.getCompositeTypeField(), null, "fields", null, 1, -1, CompositeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosMsgDataTypeEClass, ROSMsgDataType.class, "ROSMsgDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROSMsgDataType_Msgs_package(), ecorePackage.getEString(), "msgs_package", null, 1, 1, ROSMsgDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSMsgDataType_Fields(), this.getROSMsgField(), null, "fields", null, 0, -1, ROSMsgDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratorEClass, Enumerator.class, "Enumerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerator_Elements(), this.getEnumElement(), null, "elements", null, 1, -1, Enumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumElementEClass, EnumElement.class, "EnumElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnumElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerDataTypeEClass, ContainerDataType.class, "ContainerDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerDataType_Template(), this.getDataType(), null, "template", null, 1, 1, ContainerDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberFunctionEClass, MemberFunction.class, "MemberFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberFunction_ReturnValue(), this.getDataType(), null, "returnValue", null, 1, 1, MemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonMemberFunctionEClass, NonMemberFunction.class, "NonMemberFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonMemberFunction_ReturnValue(), this.getDataType(), null, "returnValue", null, 1, 1, NonMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonMemberFunction_InputParameter(), this.getROSMsgDataType(), null, "inputParameter", null, 1, 1, NonMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosMsgFunctionEClass, ROSMsgFunction.class, "ROSMsgFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSMsgFunction_InputParameter(), this.getROSMsgDataType(), null, "inputParameter", null, 1, 1, ROSMsgFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROSMsgFunction_OutputParameter(), this.getROSMsgDataType(), null, "outputParameter", null, 1, 1, ROSMsgFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosMsgFieldEClass, ROSMsgField.class, "ROSMsgField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSMsgField_Type(), this.getROSMsgDataType(), null, "type", null, 1, 1, ROSMsgField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeTypeFieldEClass, CompositeTypeField.class, "CompositeTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeTypeField_Type(), this.getDataType(), null, "type", null, 1, 1, CompositeTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DataTypesModelPackageImpl
