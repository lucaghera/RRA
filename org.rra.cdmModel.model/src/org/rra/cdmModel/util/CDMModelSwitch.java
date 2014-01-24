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
package org.rra.cdmModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.rra.cdmModel.CDMModelPackage;
import org.rra.cdmModel.ContextDependentMeasurement;
import org.rra.cdmModel.ContextDependentMeasurementsModel;
import org.rra.cdmModel.OrocosContextDependentMeasurement;
import org.rra.cdmModel.ROSContextDependentMeasurement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.rra.cdmModel.CDMModelPackage
 * @generated
 */
public class CDMModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDMModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMModelSwitch() {
		if (modelPackage == null) {
			modelPackage = CDMModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENTS_MODEL: {
				ContextDependentMeasurementsModel contextDependentMeasurementsModel = (ContextDependentMeasurementsModel)theEObject;
				T result = caseContextDependentMeasurementsModel(contextDependentMeasurementsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDMModelPackage.CONTEXT_DEPENDENT_MEASUREMENT: {
				ContextDependentMeasurement contextDependentMeasurement = (ContextDependentMeasurement)theEObject;
				T result = caseContextDependentMeasurement(contextDependentMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDMModelPackage.ROS_CONTEXT_DEPENDENT_MEASUREMENT: {
				ROSContextDependentMeasurement rosContextDependentMeasurement = (ROSContextDependentMeasurement)theEObject;
				T result = caseROSContextDependentMeasurement(rosContextDependentMeasurement);
				if (result == null) result = caseContextDependentMeasurement(rosContextDependentMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDMModelPackage.OROCOS_CONTEXT_DEPENDENT_MEASUREMENT: {
				OrocosContextDependentMeasurement orocosContextDependentMeasurement = (OrocosContextDependentMeasurement)theEObject;
				T result = caseOrocosContextDependentMeasurement(orocosContextDependentMeasurement);
				if (result == null) result = caseContextDependentMeasurement(orocosContextDependentMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Dependent Measurements Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Dependent Measurements Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextDependentMeasurementsModel(ContextDependentMeasurementsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Dependent Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Dependent Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextDependentMeasurement(ContextDependentMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROS Context Dependent Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROS Context Dependent Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROSContextDependentMeasurement(ROSContextDependentMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orocos Context Dependent Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orocos Context Dependent Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrocosContextDependentMeasurement(OrocosContextDependentMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CDMModelSwitch
