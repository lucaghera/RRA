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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rra.runtimeFeatureModel.*;
import org.rra.runtimeFeatureModel.CIMAttribute;
import org.rra.runtimeFeatureModel.CVAttribute;
import org.rra.runtimeFeatureModel.NFRAttribute;
import org.rra.runtimeFeatureModel.NFRAttributeTag;
import org.rra.runtimeFeatureModel.RuntimeFeatureModelFactory;
import org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFeatureModelFactoryImpl extends EFactoryImpl implements RuntimeFeatureModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFeatureModelFactory init() {
		try {
			RuntimeFeatureModelFactory theRuntimeFeatureModelFactory = (RuntimeFeatureModelFactory)EPackage.Registry.INSTANCE.getEFactory(RuntimeFeatureModelPackage.eNS_URI);
			if (theRuntimeFeatureModelFactory != null) {
				return theRuntimeFeatureModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFeatureModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFeatureModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RuntimeFeatureModelPackage.NFR_ATTRIBUTE: return createNFRAttribute();
			case RuntimeFeatureModelPackage.CV_ATTRIBUTE: return createCVAttribute();
			case RuntimeFeatureModelPackage.CIM_ATTRIBUTE: return createCIMAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RuntimeFeatureModelPackage.NFR_ATTRIBUTE_TAG:
				return createNFRAttributeTagFromString(eDataType, initialValue);
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE_TYPES:
				return createRuntimeAdaptationAttributeTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RuntimeFeatureModelPackage.NFR_ATTRIBUTE_TAG:
				return convertNFRAttributeTagToString(eDataType, instanceValue);
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE_TYPES:
				return convertRuntimeAdaptationAttributeTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRAttribute createNFRAttribute() {
		NFRAttributeImpl nfrAttribute = new NFRAttributeImpl();
		return nfrAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVAttribute createCVAttribute() {
		CVAttributeImpl cvAttribute = new CVAttributeImpl();
		return cvAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIMAttribute createCIMAttribute() {
		CIMAttributeImpl cimAttribute = new CIMAttributeImpl();
		return cimAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRAttributeTag createNFRAttributeTagFromString(EDataType eDataType, String initialValue) {
		NFRAttributeTag result = NFRAttributeTag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNFRAttributeTagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdaptationAttributeTypes createRuntimeAdaptationAttributeTypesFromString(EDataType eDataType, String initialValue) {
		RuntimeAdaptationAttributeTypes result = RuntimeAdaptationAttributeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuntimeAdaptationAttributeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFeatureModelPackage getRuntimeFeatureModelPackage() {
		return (RuntimeFeatureModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimeFeatureModelPackage getPackage() {
		return RuntimeFeatureModelPackage.eINSTANCE;
	}

} //RuntimeFeatureModelFactoryImpl
