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
package org.rra.cdmModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;
import org.hyperflex.roscomponentmodel.roscomponentmodelPackage;
import org.rra.cdmModel.CDMModelFactory;
import org.rra.cdmModel.CDMModelPackage;
import org.rra.cdmModel.ContextDependentMeasurement;
import org.rra.cdmModel.ContextDependentMeasurementsModel;
import org.rra.cdmModel.OrocosContextDependentMeasurement;
import org.rra.cdmModel.ROSContextDependentMeasurement;
import org.rra.dataTypesModel.DataTypesModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDMModelPackageImpl extends EPackageImpl implements CDMModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDependentMeasurementsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDependentMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosContextDependentMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orocosContextDependentMeasurementEClass = null;

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
	 * @see org.rra.cdmModel.CDMModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDMModelPackageImpl() {
		super(eNS_URI, CDMModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CDMModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDMModelPackage init() {
		if (isInited) return (CDMModelPackage)EPackage.Registry.INSTANCE.getEPackage(CDMModelPackage.eNS_URI);

		// Obtain or create and register package
		CDMModelPackageImpl theCDMModelPackage = (CDMModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CDMModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CDMModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DataTypesModelPackage.eINSTANCE.eClass();
		orocoscomponentmodelPackage.eINSTANCE.eClass();
		roscomponentmodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDMModelPackage.createPackageContents();

		// Initialize created meta-data
		theCDMModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDMModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDMModelPackage.eNS_URI, theCDMModelPackage);
		return theCDMModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextDependentMeasurementsModel() {
		return contextDependentMeasurementsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextDependentMeasurementsModel_Name() {
		return (EAttribute)contextDependentMeasurementsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextDependentMeasurementsModel_Cdms() {
		return (EReference)contextDependentMeasurementsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextDependentMeasurement() {
		return contextDependentMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextDependentMeasurement_Name() {
		return (EAttribute)contextDependentMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextDependentMeasurement_CdmFunction() {
		return (EReference)contextDependentMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSContextDependentMeasurement() {
		return rosContextDependentMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSContextDependentMeasurement_Publisher() {
		return (EReference)rosContextDependentMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrocosContextDependentMeasurement() {
		return orocosContextDependentMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrocosContextDependentMeasurement_OutputPort() {
		return (EReference)orocosContextDependentMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMModelFactory getCDMModelFactory() {
		return (CDMModelFactory)getEFactoryInstance();
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
		contextDependentMeasurementsModelEClass = createEClass(CONTEXT_DEPENDENT_MEASUREMENTS_MODEL);
		createEAttribute(contextDependentMeasurementsModelEClass, CONTEXT_DEPENDENT_MEASUREMENTS_MODEL__NAME);
		createEReference(contextDependentMeasurementsModelEClass, CONTEXT_DEPENDENT_MEASUREMENTS_MODEL__CDMS);

		contextDependentMeasurementEClass = createEClass(CONTEXT_DEPENDENT_MEASUREMENT);
		createEAttribute(contextDependentMeasurementEClass, CONTEXT_DEPENDENT_MEASUREMENT__NAME);
		createEReference(contextDependentMeasurementEClass, CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION);

		rosContextDependentMeasurementEClass = createEClass(ROS_CONTEXT_DEPENDENT_MEASUREMENT);
		createEReference(rosContextDependentMeasurementEClass, ROS_CONTEXT_DEPENDENT_MEASUREMENT__PUBLISHER);

		orocosContextDependentMeasurementEClass = createEClass(OROCOS_CONTEXT_DEPENDENT_MEASUREMENT);
		createEReference(orocosContextDependentMeasurementEClass, OROCOS_CONTEXT_DEPENDENT_MEASUREMENT__OUTPUT_PORT);
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
		DataTypesModelPackage theDataTypesModelPackage = (DataTypesModelPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesModelPackage.eNS_URI);
		roscomponentmodelPackage theroscomponentmodelPackage = (roscomponentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(roscomponentmodelPackage.eNS_URI);
		orocoscomponentmodelPackage theorocoscomponentmodelPackage = (orocoscomponentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(orocoscomponentmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rosContextDependentMeasurementEClass.getESuperTypes().add(this.getContextDependentMeasurement());
		orocosContextDependentMeasurementEClass.getESuperTypes().add(this.getContextDependentMeasurement());

		// Initialize classes, features, and operations; add parameters
		initEClass(contextDependentMeasurementsModelEClass, ContextDependentMeasurementsModel.class, "ContextDependentMeasurementsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextDependentMeasurementsModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextDependentMeasurementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextDependentMeasurementsModel_Cdms(), this.getContextDependentMeasurement(), null, "cdms", null, 1, -1, ContextDependentMeasurementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextDependentMeasurementEClass, ContextDependentMeasurement.class, "ContextDependentMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextDependentMeasurement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextDependentMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextDependentMeasurement_CdmFunction(), theDataTypesModelPackage.getFunction(), null, "cdmFunction", null, 0, 1, ContextDependentMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosContextDependentMeasurementEClass, ROSContextDependentMeasurement.class, "ROSContextDependentMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSContextDependentMeasurement_Publisher(), theroscomponentmodelPackage.getNodeMsgProducer(), null, "publisher", null, 1, 1, ROSContextDependentMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orocosContextDependentMeasurementEClass, OrocosContextDependentMeasurement.class, "OrocosContextDependentMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrocosContextDependentMeasurement_OutputPort(), theorocoscomponentmodelPackage.getTCOutputDataPort(), null, "outputPort", null, 1, 1, OrocosContextDependentMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CDMModelPackageImpl
