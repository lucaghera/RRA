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

import org.rra.dataTypesModel.DataType;
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.NonMemberFunction;
import org.rra.dataTypesModel.ROSMsgDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Member Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.impl.NonMemberFunctionImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.impl.NonMemberFunctionImpl#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonMemberFunctionImpl extends FunctionImpl implements NonMemberFunction {
	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected DataType returnValue;

	/**
	 * The cached value of the '{@link #getInputParameter() <em>Input Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameter()
	 * @generated
	 * @ordered
	 */
	protected ROSMsgDataType inputParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonMemberFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesModelPackage.Literals.NON_MEMBER_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnValue() {
		if (returnValue != null && returnValue.eIsProxy()) {
			InternalEObject oldReturnValue = (InternalEObject)returnValue;
			returnValue = (DataType)eResolveProxy(oldReturnValue);
			if (returnValue != oldReturnValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesModelPackage.NON_MEMBER_FUNCTION__RETURN_VALUE, oldReturnValue, returnValue));
			}
		}
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(DataType newReturnValue) {
		DataType oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesModelPackage.NON_MEMBER_FUNCTION__RETURN_VALUE, oldReturnValue, returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgDataType getInputParameter() {
		if (inputParameter != null && inputParameter.eIsProxy()) {
			InternalEObject oldInputParameter = (InternalEObject)inputParameter;
			inputParameter = (ROSMsgDataType)eResolveProxy(oldInputParameter);
			if (inputParameter != oldInputParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesModelPackage.NON_MEMBER_FUNCTION__INPUT_PARAMETER, oldInputParameter, inputParameter));
			}
		}
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgDataType basicGetInputParameter() {
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputParameter(ROSMsgDataType newInputParameter) {
		ROSMsgDataType oldInputParameter = inputParameter;
		inputParameter = newInputParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesModelPackage.NON_MEMBER_FUNCTION__INPUT_PARAMETER, oldInputParameter, inputParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__RETURN_VALUE:
				if (resolve) return getReturnValue();
				return basicGetReturnValue();
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__INPUT_PARAMETER:
				if (resolve) return getInputParameter();
				return basicGetInputParameter();
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
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__RETURN_VALUE:
				setReturnValue((DataType)newValue);
				return;
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__INPUT_PARAMETER:
				setInputParameter((ROSMsgDataType)newValue);
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
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__RETURN_VALUE:
				setReturnValue((DataType)null);
				return;
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__INPUT_PARAMETER:
				setInputParameter((ROSMsgDataType)null);
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
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__RETURN_VALUE:
				return returnValue != null;
			case DataTypesModelPackage.NON_MEMBER_FUNCTION__INPUT_PARAMETER:
				return inputParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //NonMemberFunctionImpl
