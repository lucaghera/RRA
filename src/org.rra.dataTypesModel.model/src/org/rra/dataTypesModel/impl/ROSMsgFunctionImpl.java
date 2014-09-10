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
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.ROSMsgDataType;
import org.rra.dataTypesModel.ROSMsgFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Msg Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.dataTypesModel.impl.ROSMsgFunctionImpl#getInputParameter <em>Input Parameter</em>}</li>
 *   <li>{@link org.rra.dataTypesModel.impl.ROSMsgFunctionImpl#getOutputParameter <em>Output Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSMsgFunctionImpl extends FunctionImpl implements ROSMsgFunction {
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
	 * The cached value of the '{@link #getOutputParameter() <em>Output Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameter()
	 * @generated
	 * @ordered
	 */
	protected ROSMsgDataType outputParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSMsgFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesModelPackage.Literals.ROS_MSG_FUNCTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesModelPackage.ROS_MSG_FUNCTION__INPUT_PARAMETER, oldInputParameter, inputParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesModelPackage.ROS_MSG_FUNCTION__INPUT_PARAMETER, oldInputParameter, inputParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgDataType getOutputParameter() {
		if (outputParameter != null && outputParameter.eIsProxy()) {
			InternalEObject oldOutputParameter = (InternalEObject)outputParameter;
			outputParameter = (ROSMsgDataType)eResolveProxy(oldOutputParameter);
			if (outputParameter != oldOutputParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesModelPackage.ROS_MSG_FUNCTION__OUTPUT_PARAMETER, oldOutputParameter, outputParameter));
			}
		}
		return outputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgDataType basicGetOutputParameter() {
		return outputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameter(ROSMsgDataType newOutputParameter) {
		ROSMsgDataType oldOutputParameter = outputParameter;
		outputParameter = newOutputParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesModelPackage.ROS_MSG_FUNCTION__OUTPUT_PARAMETER, oldOutputParameter, outputParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesModelPackage.ROS_MSG_FUNCTION__INPUT_PARAMETER:
				if (resolve) return getInputParameter();
				return basicGetInputParameter();
			case DataTypesModelPackage.ROS_MSG_FUNCTION__OUTPUT_PARAMETER:
				if (resolve) return getOutputParameter();
				return basicGetOutputParameter();
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
			case DataTypesModelPackage.ROS_MSG_FUNCTION__INPUT_PARAMETER:
				setInputParameter((ROSMsgDataType)newValue);
				return;
			case DataTypesModelPackage.ROS_MSG_FUNCTION__OUTPUT_PARAMETER:
				setOutputParameter((ROSMsgDataType)newValue);
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
			case DataTypesModelPackage.ROS_MSG_FUNCTION__INPUT_PARAMETER:
				setInputParameter((ROSMsgDataType)null);
				return;
			case DataTypesModelPackage.ROS_MSG_FUNCTION__OUTPUT_PARAMETER:
				setOutputParameter((ROSMsgDataType)null);
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
			case DataTypesModelPackage.ROS_MSG_FUNCTION__INPUT_PARAMETER:
				return inputParameter != null;
			case DataTypesModelPackage.ROS_MSG_FUNCTION__OUTPUT_PARAMETER:
				return outputParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSMsgFunctionImpl
