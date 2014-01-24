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
package org.rra.runtimeFeatureModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.hyperflex.featuremodels.featuremodelsPackage;

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
 * @see org.rra.runtimeFeatureModel.RuntimeFeatureModelFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimeFeatureModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtimeFeatureModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rra.org/runtimeFeatureModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "runtimeFeatureModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFeatureModelPackage eINSTANCE = org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rra.runtimeFeatureModel.impl.RuntimeAdaptationAttributeImpl <em>Runtime Adaptation Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.runtimeFeatureModel.impl.RuntimeAdaptationAttributeImpl
	 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getRuntimeAdaptationAttribute()
	 * @generated
	 */
	int RUNTIME_ADAPTATION_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ADAPTATION_ATTRIBUTE__NAME = featuremodelsPackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Measure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT = featuremodelsPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime Adaptation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ADAPTATION_ATTRIBUTE_FEATURE_COUNT = featuremodelsPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runtime Adaptation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ADAPTATION_ATTRIBUTE_OPERATION_COUNT = featuremodelsPackage.ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rra.runtimeFeatureModel.impl.NFRAttributeImpl <em>NFR Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.runtimeFeatureModel.impl.NFRAttributeImpl
	 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getNFRAttribute()
	 * @generated
	 */
	int NFR_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_ATTRIBUTE__NAME = RUNTIME_ADAPTATION_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Measure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_ATTRIBUTE__MEASURE_UNIT = RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_ATTRIBUTE__TAG = RUNTIME_ADAPTATION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFR Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_ATTRIBUTE_FEATURE_COUNT = RUNTIME_ADAPTATION_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NFR Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_ATTRIBUTE_OPERATION_COUNT = RUNTIME_ADAPTATION_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rra.runtimeFeatureModel.impl.CVAttributeImpl <em>CV Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.runtimeFeatureModel.impl.CVAttributeImpl
	 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getCVAttribute()
	 * @generated
	 */
	int CV_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_ATTRIBUTE__NAME = RUNTIME_ADAPTATION_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Measure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_ATTRIBUTE__MEASURE_UNIT = RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_ATTRIBUTE__LOWER_BOUND = RUNTIME_ADAPTATION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_ATTRIBUTE__UPPER_BOUND = RUNTIME_ADAPTATION_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CV Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_ATTRIBUTE_FEATURE_COUNT = RUNTIME_ADAPTATION_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CV Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_ATTRIBUTE_OPERATION_COUNT = RUNTIME_ADAPTATION_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rra.runtimeFeatureModel.impl.CIMAttributeImpl <em>CIM Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.runtimeFeatureModel.impl.CIMAttributeImpl
	 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getCIMAttribute()
	 * @generated
	 */
	int CIM_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_ATTRIBUTE__NAME = RUNTIME_ADAPTATION_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Measure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_ATTRIBUTE__MEASURE_UNIT = RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT;

	/**
	 * The number of structural features of the '<em>CIM Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_ATTRIBUTE_FEATURE_COUNT = RUNTIME_ADAPTATION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CIM Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_ATTRIBUTE_OPERATION_COUNT = RUNTIME_ADAPTATION_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rra.runtimeFeatureModel.NFRAttributeTag <em>NFR Attribute Tag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rra.runtimeFeatureModel.NFRAttributeTag
	 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getNFRAttributeTag()
	 * @generated
	 */
	int NFR_ATTRIBUTE_TAG = 4;


	/**
	 * Returns the meta object for class '{@link org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute <em>Runtime Adaptation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Adaptation Attribute</em>'.
	 * @see org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute
	 * @generated
	 */
	EClass getRuntimeAdaptationAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute#getMeasureUnit <em>Measure Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Unit</em>'.
	 * @see org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute#getMeasureUnit()
	 * @see #getRuntimeAdaptationAttribute()
	 * @generated
	 */
	EAttribute getRuntimeAdaptationAttribute_MeasureUnit();

	/**
	 * Returns the meta object for class '{@link org.rra.runtimeFeatureModel.NFRAttribute <em>NFR Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFR Attribute</em>'.
	 * @see org.rra.runtimeFeatureModel.NFRAttribute
	 * @generated
	 */
	EClass getNFRAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.runtimeFeatureModel.NFRAttribute#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.rra.runtimeFeatureModel.NFRAttribute#getTag()
	 * @see #getNFRAttribute()
	 * @generated
	 */
	EAttribute getNFRAttribute_Tag();

	/**
	 * Returns the meta object for class '{@link org.rra.runtimeFeatureModel.CVAttribute <em>CV Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV Attribute</em>'.
	 * @see org.rra.runtimeFeatureModel.CVAttribute
	 * @generated
	 */
	EClass getCVAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.runtimeFeatureModel.CVAttribute#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.rra.runtimeFeatureModel.CVAttribute#getLowerBound()
	 * @see #getCVAttribute()
	 * @generated
	 */
	EAttribute getCVAttribute_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.rra.runtimeFeatureModel.CVAttribute#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.rra.runtimeFeatureModel.CVAttribute#getUpperBound()
	 * @see #getCVAttribute()
	 * @generated
	 */
	EAttribute getCVAttribute_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.rra.runtimeFeatureModel.CIMAttribute <em>CIM Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIM Attribute</em>'.
	 * @see org.rra.runtimeFeatureModel.CIMAttribute
	 * @generated
	 */
	EClass getCIMAttribute();

	/**
	 * Returns the meta object for enum '{@link org.rra.runtimeFeatureModel.NFRAttributeTag <em>NFR Attribute Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NFR Attribute Tag</em>'.
	 * @see org.rra.runtimeFeatureModel.NFRAttributeTag
	 * @generated
	 */
	EEnum getNFRAttributeTag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFeatureModelFactory getRuntimeFeatureModelFactory();

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
		 * The meta object literal for the '{@link org.rra.runtimeFeatureModel.impl.RuntimeAdaptationAttributeImpl <em>Runtime Adaptation Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.runtimeFeatureModel.impl.RuntimeAdaptationAttributeImpl
		 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getRuntimeAdaptationAttribute()
		 * @generated
		 */
		EClass RUNTIME_ADAPTATION_ATTRIBUTE = eINSTANCE.getRuntimeAdaptationAttribute();

		/**
		 * The meta object literal for the '<em><b>Measure Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT = eINSTANCE.getRuntimeAdaptationAttribute_MeasureUnit();

		/**
		 * The meta object literal for the '{@link org.rra.runtimeFeatureModel.impl.NFRAttributeImpl <em>NFR Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.runtimeFeatureModel.impl.NFRAttributeImpl
		 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getNFRAttribute()
		 * @generated
		 */
		EClass NFR_ATTRIBUTE = eINSTANCE.getNFRAttribute();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFR_ATTRIBUTE__TAG = eINSTANCE.getNFRAttribute_Tag();

		/**
		 * The meta object literal for the '{@link org.rra.runtimeFeatureModel.impl.CVAttributeImpl <em>CV Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.runtimeFeatureModel.impl.CVAttributeImpl
		 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getCVAttribute()
		 * @generated
		 */
		EClass CV_ATTRIBUTE = eINSTANCE.getCVAttribute();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV_ATTRIBUTE__LOWER_BOUND = eINSTANCE.getCVAttribute_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV_ATTRIBUTE__UPPER_BOUND = eINSTANCE.getCVAttribute_UpperBound();

		/**
		 * The meta object literal for the '{@link org.rra.runtimeFeatureModel.impl.CIMAttributeImpl <em>CIM Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.runtimeFeatureModel.impl.CIMAttributeImpl
		 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getCIMAttribute()
		 * @generated
		 */
		EClass CIM_ATTRIBUTE = eINSTANCE.getCIMAttribute();

		/**
		 * The meta object literal for the '{@link org.rra.runtimeFeatureModel.NFRAttributeTag <em>NFR Attribute Tag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rra.runtimeFeatureModel.NFRAttributeTag
		 * @see org.rra.runtimeFeatureModel.impl.RuntimeFeatureModelPackageImpl#getNFRAttributeTag()
		 * @generated
		 */
		EEnum NFR_ATTRIBUTE_TAG = eINSTANCE.getNFRAttributeTag();

	}

} //RuntimeFeatureModelPackage
