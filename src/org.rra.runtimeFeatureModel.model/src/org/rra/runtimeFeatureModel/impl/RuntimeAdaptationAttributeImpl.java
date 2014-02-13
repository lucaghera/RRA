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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.hyperflex.featuremodels.impl.AttributeImpl;
import org.rra.dataTypesModel.DataType;
import org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute;
import org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Adaptation Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.runtimeFeatureModel.impl.RuntimeAdaptationAttributeImpl#getMeasureUnit <em>Measure Unit</em>}</li>
 *   <li>{@link org.rra.runtimeFeatureModel.impl.RuntimeAdaptationAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.rra.runtimeFeatureModel.impl.RuntimeAdaptationAttributeImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuntimeAdaptationAttributeImpl extends AttributeImpl implements RuntimeAdaptationAttribute {
	/**
	 * The default value of the '{@link #getMeasureUnit() <em>Measure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureUnit() <em>Measure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureUnit()
	 * @generated
	 * @ordered
	 */
	protected String measureUnit = MEASURE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeAdaptationAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimeFeatureModelPackage.Literals.RUNTIME_ADAPTATION_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureUnit() {
		return measureUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureUnit(String newMeasureUnit) {
		String oldMeasureUnit = measureUnit;
		measureUnit = newMeasureUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT, oldMeasureUnit, measureUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT:
				return getMeasureUnit();
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__VALUE:
				return getValue();
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
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
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT:
				setMeasureUnit((String)newValue);
				return;
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__DATA_TYPE:
				setDataType((DataType)newValue);
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
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT:
				setMeasureUnit(MEASURE_UNIT_EDEFAULT);
				return;
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__DATA_TYPE:
				setDataType((DataType)null);
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
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__MEASURE_UNIT:
				return MEASURE_UNIT_EDEFAULT == null ? measureUnit != null : !MEASURE_UNIT_EDEFAULT.equals(measureUnit);
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case RuntimeFeatureModelPackage.RUNTIME_ADAPTATION_ATTRIBUTE__DATA_TYPE:
				return dataType != null;
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
		result.append(" (measureUnit: ");
		result.append(measureUnit);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //RuntimeAdaptationAttributeImpl
