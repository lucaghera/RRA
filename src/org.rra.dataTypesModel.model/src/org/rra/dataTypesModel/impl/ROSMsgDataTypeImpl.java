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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.ROSMsgDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Msg Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl#getMsgs_package <em>Msgs package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSMsgDataTypeImpl extends DataTypeImpl implements ROSMsgDataType {
	/**
	 * The default value of the '{@link #getMsgs_package() <em>Msgs package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgs_package()
	 * @generated
	 * @ordered
	 */
	protected static final String MSGS_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMsgs_package() <em>Msgs package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgs_package()
	 * @generated
	 * @ordered
	 */
	protected String msgs_package = MSGS_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSMsgDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesModelPackage.Literals.ROS_MSG_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMsgs_package() {
		return msgs_package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgs_package(String newMsgs_package) {
		String oldMsgs_package = msgs_package;
		msgs_package = newMsgs_package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesModelPackage.ROS_MSG_DATA_TYPE__MSGS_PACKAGE, oldMsgs_package, msgs_package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__MSGS_PACKAGE:
				return getMsgs_package();
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
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__MSGS_PACKAGE:
				setMsgs_package((String)newValue);
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
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__MSGS_PACKAGE:
				setMsgs_package(MSGS_PACKAGE_EDEFAULT);
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
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__MSGS_PACKAGE:
				return MSGS_PACKAGE_EDEFAULT == null ? msgs_package != null : !MSGS_PACKAGE_EDEFAULT.equals(msgs_package);
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
		result.append(" (msgs_package: ");
		result.append(msgs_package);
		result.append(')');
		return result.toString();
	}

} //ROSMsgDataTypeImpl
