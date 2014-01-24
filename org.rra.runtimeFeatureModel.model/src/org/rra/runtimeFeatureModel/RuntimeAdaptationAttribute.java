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
package org.rra.runtimeFeatureModel;

import org.hyperflex.featuremodels.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Adaptation Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute#getMeasureUnit <em>Measure Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage#getRuntimeAdaptationAttribute()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeAdaptationAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Measure Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Unit</em>' attribute.
	 * @see #setMeasureUnit(String)
	 * @see org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage#getRuntimeAdaptationAttribute_MeasureUnit()
	 * @model
	 * @generated
	 */
	String getMeasureUnit();

	/**
	 * Sets the value of the '{@link org.rra.runtimeFeatureModel.RuntimeAdaptationAttribute#getMeasureUnit <em>Measure Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Unit</em>' attribute.
	 * @see #getMeasureUnit()
	 * @generated
	 */
	void setMeasureUnit(String value);

} // RuntimeAdaptationAttribute
