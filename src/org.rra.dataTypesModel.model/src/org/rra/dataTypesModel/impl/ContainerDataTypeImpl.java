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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.rra.dataTypesModel.ContainerDataType;
import org.rra.dataTypesModel.DataType;
import org.rra.dataTypesModel.DataTypesModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.impl.ContainerDataTypeImpl#getContainedType <em>Contained Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerDataTypeImpl extends DataTypeImpl implements ContainerDataType {
	/**
	 * The cached value of the '{@link #getContainedType() <em>Contained Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedType()
	 * @generated
	 * @ordered
	 */
	protected DataType containedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesModelPackage.Literals.CONTAINER_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getContainedType() {
		if (containedType != null && containedType.eIsProxy()) {
			InternalEObject oldContainedType = (InternalEObject)containedType;
			containedType = (DataType)eResolveProxy(oldContainedType);
			if (containedType != oldContainedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesModelPackage.CONTAINER_DATA_TYPE__CONTAINED_TYPE, oldContainedType, containedType));
			}
		}
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetContainedType() {
		return containedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedType(DataType newContainedType) {
		DataType oldContainedType = containedType;
		containedType = newContainedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesModelPackage.CONTAINER_DATA_TYPE__CONTAINED_TYPE, oldContainedType, containedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesModelPackage.CONTAINER_DATA_TYPE__CONTAINED_TYPE:
				if (resolve) return getContainedType();
				return basicGetContainedType();
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
			case DataTypesModelPackage.CONTAINER_DATA_TYPE__CONTAINED_TYPE:
				setContainedType((DataType)newValue);
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
			case DataTypesModelPackage.CONTAINER_DATA_TYPE__CONTAINED_TYPE:
				setContainedType((DataType)null);
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
			case DataTypesModelPackage.CONTAINER_DATA_TYPE__CONTAINED_TYPE:
				return containedType != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerDataTypeImpl
