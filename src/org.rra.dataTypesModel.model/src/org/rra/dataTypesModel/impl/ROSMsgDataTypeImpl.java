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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.ROSMsgDataType;
import org.rra.dataTypesModel.ROSMsgField;
import org.rra.dataTypesModel.ROSMsgFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Msg Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl#getMsgs_package <em>Msgs package</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.impl.ROSMsgDataTypeImpl#getFunctions <em>Functions</em>}</li>
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSMsgField> fields;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSMsgFunction> functions;

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
	public EList<ROSMsgFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<ROSMsgFunction>(ROSMsgFunction.class, this, DataTypesModelPackage.ROS_MSG_DATA_TYPE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSMsgField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<ROSMsgField>(ROSMsgField.class, this, DataTypesModelPackage.ROS_MSG_DATA_TYPE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FIELDS:
				return getFields();
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FUNCTIONS:
				return getFunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__MSGS_PACKAGE:
				setMsgs_package((String)newValue);
				return;
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends ROSMsgField>)newValue);
				return;
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends ROSMsgFunction>)newValue);
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
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FIELDS:
				getFields().clear();
				return;
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FUNCTIONS:
				getFunctions().clear();
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
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
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
