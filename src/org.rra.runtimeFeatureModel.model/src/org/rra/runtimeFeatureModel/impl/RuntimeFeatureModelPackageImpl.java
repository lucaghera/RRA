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
package org.rra.runtimeFeatureModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.hyperflex.featuremodels.featuremodelsPackage;
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.runtimeFeatureModel.CIMAttribute;
import org.rra.runtimeFeatureModel.CVAttribute;
import org.rra.runtimeFeatureModel.NFRAttribute;
import org.rra.runtimeFeatureModel.NFRAttributeTag;
import org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute;
import org.rra.runtimeFeatureModel.RuntimeAdaptationAttributeTypes;
import org.rra.runtimeFeatureModel.RuntimeFeatureModelFactory;
import org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFeatureModelPackageImpl extends EPackageImpl implements RuntimeFeatureModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeAdaptationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfrAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cimAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nfrAttributeTagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum runtimeAdaptationAttributeTypesEEnum = null;

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
	 * @see org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimeFeatureModelPackageImpl() {
		super(eNS_URI, RuntimeFeatureModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimeFeatureModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimeFeatureModelPackage init() {
		if (isInited) return (RuntimeFeatureModelPackage)EPackage.Registry.INSTANCE.getEPackage(RuntimeFeatureModelPackage.eNS_URI);

		// Obtain or create and register package
		RuntimeFeatureModelPackageImpl theRuntimeFeatureModelPackage = (RuntimeFeatureModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimeFeatureModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimeFeatureModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DataTypesModelPackage.eINSTANCE.eClass();
		featuremodelsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRuntimeFeatureModelPackage.createPackageContents();

		// Initialize created meta-data
		theRuntimeFeatureModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimeFeatureModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimeFeatureModelPackage.eNS_URI, theRuntimeFeatureModelPackage);
		return theRuntimeFeatureModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeAdaptationAttribute() {
		return runtimeAdaptationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeAdaptationAttribute_MeasureUnit() {
		return (EAttribute)runtimeAdaptationAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeAdaptationAttribute_Value() {
		return (EAttribute)runtimeAdaptationAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeAdaptationAttribute_DataType() {
		return (EReference)runtimeAdaptationAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFRAttribute() {
		return nfrAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFRAttribute_Tag() {
		return (EAttribute)nfrAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVAttribute() {
		return cvAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVAttribute_LowerBound() {
		return (EAttribute)cvAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVAttribute_UpperBound() {
		return (EAttribute)cvAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCIMAttribute() {
		return cimAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNFRAttributeTag() {
		return nfrAttributeTagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuntimeAdaptationAttributeTypes() {
		return runtimeAdaptationAttributeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFeatureModelFactory getRuntimeFeatureModelFactory() {
		return (RuntimeFeatureModelFactory)getEFactoryInstance();
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
		runtimeAdaptationAttributeEClass = createEClass(RUNTIME_ADAPTATION_ATTRIBUTE);
		createEAttribute(runtimeAdaptationAttributeEClass, RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT);
		createEAttribute(runtimeAdaptationAttributeEClass, RUNTIME_ADAPTATION_ATTRIBUTE__VALUE);
		createEReference(runtimeAdaptationAttributeEClass, RUNTIME_ADAPTATION_ATTRIBUTE__DATA_TYPE);

		nfrAttributeEClass = createEClass(NFR_ATTRIBUTE);
		createEAttribute(nfrAttributeEClass, NFR_ATTRIBUTE__TAG);

		cvAttributeEClass = createEClass(CV_ATTRIBUTE);
		createEAttribute(cvAttributeEClass, CV_ATTRIBUTE__LOWER_BOUND);
		createEAttribute(cvAttributeEClass, CV_ATTRIBUTE__UPPER_BOUND);

		cimAttributeEClass = createEClass(CIM_ATTRIBUTE);

		// Create enums
		nfrAttributeTagEEnum = createEEnum(NFR_ATTRIBUTE_TAG);
		runtimeAdaptationAttributeTypesEEnum = createEEnum(RUNTIME_ADAPTATION_ATTRIBUTE_TYPES);
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

		// Obtain other dependent packages
		featuremodelsPackage thefeaturemodelsPackage = (featuremodelsPackage)EPackage.Registry.INSTANCE.getEPackage(featuremodelsPackage.eNS_URI);
		DataTypesModelPackage theDataTypesModelPackage = (DataTypesModelPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeAdaptationAttributeEClass.getESuperTypes().add(thefeaturemodelsPackage.getAttribute());
		nfrAttributeEClass.getESuperTypes().add(this.getRuntimeAdaptationAttribute());
		cvAttributeEClass.getESuperTypes().add(this.getRuntimeAdaptationAttribute());
		cimAttributeEClass.getESuperTypes().add(this.getRuntimeAdaptationAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(runtimeAdaptationAttributeEClass, RuntimeAdaptationAttribute.class, "RuntimeAdaptationAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeAdaptationAttribute_MeasureUnit(), ecorePackage.getEString(), "measureUnit", null, 0, 1, RuntimeAdaptationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeAdaptationAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, RuntimeAdaptationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeAdaptationAttribute_DataType(), theDataTypesModelPackage.getDataType(), null, "dataType", null, 1, 1, RuntimeAdaptationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfrAttributeEClass, NFRAttribute.class, "NFRAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFRAttribute_Tag(), this.getNFRAttributeTag(), "tag", null, 1, 1, NFRAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cvAttributeEClass, CVAttribute.class, "CVAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCVAttribute_LowerBound(), ecorePackage.getEString(), "lowerBound", null, 1, 1, CVAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVAttribute_UpperBound(), ecorePackage.getEString(), "upperBound", null, 1, 1, CVAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cimAttributeEClass, CIMAttribute.class, "CIMAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(nfrAttributeTagEEnum, NFRAttributeTag.class, "NFRAttributeTag");
		addEEnumLiteral(nfrAttributeTagEEnum, NFRAttributeTag.MIN);
		addEEnumLiteral(nfrAttributeTagEEnum, NFRAttributeTag.MAX);
		addEEnumLiteral(nfrAttributeTagEEnum, NFRAttributeTag.AVG);
		addEEnumLiteral(nfrAttributeTagEEnum, NFRAttributeTag.COUNT);

		initEEnum(runtimeAdaptationAttributeTypesEEnum, RuntimeAdaptationAttributeTypes.class, "RuntimeAdaptationAttributeTypes");
		addEEnumLiteral(runtimeAdaptationAttributeTypesEEnum, RuntimeAdaptationAttributeTypes.INTEGER);
		addEEnumLiteral(runtimeAdaptationAttributeTypesEEnum, RuntimeAdaptationAttributeTypes.DOUBLE);
		addEEnumLiteral(runtimeAdaptationAttributeTypesEEnum, RuntimeAdaptationAttributeTypes.STRING);

		// Create resource
		createResource(eNS_URI);
	}

} //RuntimeFeatureModelPackageImpl
