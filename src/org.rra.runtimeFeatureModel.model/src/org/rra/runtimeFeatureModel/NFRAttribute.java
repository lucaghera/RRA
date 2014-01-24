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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFR Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.runtimeFeatureModel.NFRAttribute#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage#getNFRAttribute()
 * @model
 * @generated
 */
public interface NFRAttribute extends RuntimeAdaptationAttribute {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.rra.runtimeFeatureModel.NFRAttributeTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see org.rra.runtimeFeatureModel.NFRAttributeTag
	 * @see #setTag(NFRAttributeTag)
	 * @see org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage#getNFRAttribute_Tag()
	 * @model required="true"
	 * @generated
	 */
	NFRAttributeTag getTag();

	/**
	 * Sets the value of the '{@link org.rra.runtimeFeatureModel.NFRAttribute#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see org.rra.runtimeFeatureModel.NFRAttributeTag
	 * @see #getTag()
	 * @generated
	 */
	void setTag(NFRAttributeTag value);

} // NFRAttribute
