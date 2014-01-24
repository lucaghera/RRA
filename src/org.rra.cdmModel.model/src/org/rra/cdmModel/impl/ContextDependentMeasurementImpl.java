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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.rra.cdmModel.CDMModelPackage;
import org.rra.cdmModel.ContextDependentMeasurement;
import org.rra.dataTypesModel.Function;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Dependent Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.cdmModel.impl.ContextDependentMeasurementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.cdmModel.impl.ContextDependentMeasurementImpl#getCdmFunction <em>Cdm Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContextDependentMeasurementImpl extends MinimalEObjectImpl.Container implements ContextDependentMeasurement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCdmFunction() <em>Cdm Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdmFunction()
	 * @generated
	 * @ordered
	 */
	protected Function cdmFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDependentMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDMModelPackage.Literals.CONTEXT_DEPENDENT_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getCdmFunction() {
		if (cdmFunction != null && cdmFunction.eIsProxy()) {
			InternalEObject oldCdmFunction = (InternalEObject)cdmFunction;
			cdmFunction = (Function)eResolveProxy(oldCdmFunction);
			if (cdmFunction != oldCdmFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION, oldCdmFunction, cdmFunction));
			}
		}
		return cdmFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetCdmFunction() {
		return cdmFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdmFunction(Function newCdmFunction) {
		Function oldCdmFunction = cdmFunction;
		cdmFunction = newCdmFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION, oldCdmFunction, cdmFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__NAME:
				return getName();
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
				if (resolve) return getCdmFunction();
				return basicGetCdmFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__NAME:
				setName((String)newValue);
				return;
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
				setCdmFunction((Function)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
				setCdmFunction((Function)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
				return cdmFunction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContextDependentMeasurementImpl
