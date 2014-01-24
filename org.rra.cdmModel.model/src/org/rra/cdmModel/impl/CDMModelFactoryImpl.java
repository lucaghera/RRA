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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rra.cdmModel.CDMModelFactory;
import org.rra.cdmModel.CDMModelPackage;
import org.rra.cdmModel.ContextDependentMeasurementsModel;
import org.rra.cdmModel.OrocosContextDependentMeasurement;
import org.rra.cdmModel.ROSContextDependentMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDMModelFactoryImpl extends EFactoryImpl implements CDMModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDMModelFactory init() {
		try {
			CDMModelFactory theCDMModelFactory = (CDMModelFactory)EPackage.Registry.INSTANCE.getEFactory(CDMModelPackage.eNS_URI);
			if (theCDMModelFactory != null) {
				return theCDMModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDMModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMModelFactoryImpl() {
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
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENTS_MODEL: return createContextDependentMeasurementsModel();
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT: return createROSContextDependentMeasurement();
			case CDMModelPackage.OROCOS_CONTEXT_DEPENDENT_MEASUREMENT: return createOrocosContextDependentMeasurement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDependentMeasurementsModel createContextDependentMeasurementsModel() {
		ContextDependentMeasurementsModelImpl contextDependentMeasurementsModel = new ContextDependentMeasurementsModelImpl();
		return contextDependentMeasurementsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSContextDependentMeasurement createROSContextDependentMeasurement() {
		ROSContextDependentMeasurementImpl rosContextDependentMeasurement = new ROSContextDependentMeasurementImpl();
		return rosContextDependentMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrocosContextDependentMeasurement createOrocosContextDependentMeasurement() {
		OrocosContextDependentMeasurementImpl orocosContextDependentMeasurement = new OrocosContextDependentMeasurementImpl();
		return orocosContextDependentMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMModelPackage getCDMModelPackage() {
		return (CDMModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDMModelPackage getPackage() {
		return CDMModelPackage.eINSTANCE;
	}

} //CDMModelFactoryImpl
