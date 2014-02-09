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
import org.hyperflex.roscomponentmodel.NodeMsgProducer;
import org.rra.cdmModel.CDMModelPackage;
import org.rra.cdmModel.ROSContextDependentMeasurement;
import org.rra.dataTypesModel.ROSMsgDataType;
import org.rra.dataTypesModel.ROSMsgFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Context Dependent Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.cdmModel.impl.ROSContextDependentMeasurementImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.rra.cdmModel.impl.ROSContextDependentMeasurementImpl#getInputDataType <em>Input Data Type</em>}</li>
 *   <li>{@link org.rra.cdmModel.impl.ROSContextDependentMeasurementImpl#getCdmFunction <em>Cdm Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSContextDependentMeasurementImpl extends ContextDependentMeasurementImpl implements ROSContextDependentMeasurement {
	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected NodeMsgProducer publisher;

	/**
	 * The cached value of the '{@link #getInputDataType() <em>Input Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataType()
	 * @generated
	 * @ordered
	 */
	protected ROSMsgDataType inputDataType;
	/**
	 * The cached value of the '{@link #getCdmFunction() <em>Cdm Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdmFunction()
	 * @generated
	 * @ordered
	 */
	protected ROSMsgFunction cdmFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSContextDependentMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDMModelPackage.Literals.ROS_CONTEXT_DEPENDENT_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMsgProducer getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (NodeMsgProducer)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMsgProducer basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(NodeMsgProducer newPublisher) {
		NodeMsgProducer oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgDataType getInputDataType() {
		if (inputDataType != null && inputDataType.eIsProxy()) {
			InternalEObject oldInputDataType = (InternalEObject)inputDataType;
			inputDataType = (ROSMsgDataType)eResolveProxy(oldInputDataType);
			if (inputDataType != oldInputDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE, oldInputDataType, inputDataType));
			}
		}
		return inputDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgDataType basicGetInputDataType() {
		return inputDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataType(ROSMsgDataType newInputDataType) {
		ROSMsgDataType oldInputDataType = inputDataType;
		inputDataType = newInputDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE, oldInputDataType, inputDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgFunction getCdmFunction() {
		if (cdmFunction != null && cdmFunction.eIsProxy()) {
			InternalEObject oldCdmFunction = (InternalEObject)cdmFunction;
			cdmFunction = (ROSMsgFunction)eResolveProxy(oldCdmFunction);
			if (cdmFunction != oldCdmFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION, oldCdmFunction, cdmFunction));
			}
		}
		return cdmFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgFunction basicGetCdmFunction() {
		return cdmFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdmFunction(ROSMsgFunction newCdmFunction) {
		ROSMsgFunction oldCdmFunction = cdmFunction;
		cdmFunction = newCdmFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION, oldCdmFunction, cdmFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE:
				if (resolve) return getInputDataType();
				return basicGetInputDataType();
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
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
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__PUBLISHER:
				setPublisher((NodeMsgProducer)newValue);
				return;
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE:
				setInputDataType((ROSMsgDataType)newValue);
				return;
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
				setCdmFunction((ROSMsgFunction)newValue);
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
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__PUBLISHER:
				setPublisher((NodeMsgProducer)null);
				return;
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE:
				setInputDataType((ROSMsgDataType)null);
				return;
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
				setCdmFunction((ROSMsgFunction)null);
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
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__PUBLISHER:
				return publisher != null;
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__INPUT_DATA_TYPE:
				return inputDataType != null;
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT__CDM_FUNCTION:
				return cdmFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSContextDependentMeasurementImpl
