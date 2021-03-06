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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rra.dataTypesModel.DataType;
import org.rra.dataTypesModel.DataTypesModel;
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.NonMemberFunction;
import org.rra.dataTypesModel.ROSMsgFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Types Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.impl.DataTypesModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.impl.DataTypesModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.impl.DataTypesModelImpl#getNonMemberFunctions <em>Non Member Functions</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.impl.DataTypesModelImpl#getRosMsgFunctions <em>Ros Msg Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypesModelImpl extends MinimalEObjectImpl.Container implements DataTypesModel {
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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> types;

	/**
	 * The cached value of the '{@link #getNonMemberFunctions() <em>Non Member Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMemberFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<NonMemberFunction> nonMemberFunctions;

	/**
	 * The cached value of the '{@link #getRosMsgFunctions() <em>Ros Msg Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosMsgFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ROSMsgFunction> rosMsgFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypesModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesModelPackage.Literals.DATA_TYPES_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesModelPackage.DATA_TYPES_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<DataType>(DataType.class, this, DataTypesModelPackage.DATA_TYPES_MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMemberFunction> getNonMemberFunctions() {
		if (nonMemberFunctions == null) {
			nonMemberFunctions = new EObjectResolvingEList<NonMemberFunction>(NonMemberFunction.class, this, DataTypesModelPackage.DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS);
		}
		return nonMemberFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROSMsgFunction> getRosMsgFunctions() {
		if (rosMsgFunctions == null) {
			rosMsgFunctions = new EObjectContainmentEList<ROSMsgFunction>(ROSMsgFunction.class, this, DataTypesModelPackage.DATA_TYPES_MODEL__ROS_MSG_FUNCTIONS);
		}
		return rosMsgFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesModelPackage.DATA_TYPES_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case DataTypesModelPackage.DATA_TYPES_MODEL__ROS_MSG_FUNCTIONS:
				return ((InternalEList<?>)getRosMsgFunctions()).basicRemove(otherEnd, msgs);
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
			case DataTypesModelPackage.DATA_TYPES_MODEL__NAME:
				return getName();
			case DataTypesModelPackage.DATA_TYPES_MODEL__TYPES:
				return getTypes();
			case DataTypesModelPackage.DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS:
				return getNonMemberFunctions();
			case DataTypesModelPackage.DATA_TYPES_MODEL__ROS_MSG_FUNCTIONS:
				return getRosMsgFunctions();
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
			case DataTypesModelPackage.DATA_TYPES_MODEL__NAME:
				setName((String)newValue);
				return;
			case DataTypesModelPackage.DATA_TYPES_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case DataTypesModelPackage.DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS:
				getNonMemberFunctions().clear();
				getNonMemberFunctions().addAll((Collection<? extends NonMemberFunction>)newValue);
				return;
			case DataTypesModelPackage.DATA_TYPES_MODEL__ROS_MSG_FUNCTIONS:
				getRosMsgFunctions().clear();
				getRosMsgFunctions().addAll((Collection<? extends ROSMsgFunction>)newValue);
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
			case DataTypesModelPackage.DATA_TYPES_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataTypesModelPackage.DATA_TYPES_MODEL__TYPES:
				getTypes().clear();
				return;
			case DataTypesModelPackage.DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS:
				getNonMemberFunctions().clear();
				return;
			case DataTypesModelPackage.DATA_TYPES_MODEL__ROS_MSG_FUNCTIONS:
				getRosMsgFunctions().clear();
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
			case DataTypesModelPackage.DATA_TYPES_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataTypesModelPackage.DATA_TYPES_MODEL__TYPES:
				return types != null && !types.isEmpty();
			case DataTypesModelPackage.DATA_TYPES_MODEL__NON_MEMBER_FUNCTIONS:
				return nonMemberFunctions != null && !nonMemberFunctions.isEmpty();
			case DataTypesModelPackage.DATA_TYPES_MODEL__ROS_MSG_FUNCTIONS:
				return rosMsgFunctions != null && !rosMsgFunctions.isEmpty();
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

} //DataTypesModelImpl
