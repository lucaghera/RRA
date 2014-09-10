/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;
import org.rra.runtimeFeatureModel.CVAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action Modify Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute#getFeatureAttribute <em>Feature Attribute</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionModifyAttribute()
 * @model
 * @generated
 */
public interface AtomicActionModifyAttribute extends AtomicAction
{
  /**
   * Returns the value of the '<em><b>Feature Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Attribute</em>' reference.
   * @see #setFeatureAttribute(CVAttribute)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionModifyAttribute_FeatureAttribute()
   * @model
   * @generated
   */
  CVAttribute getFeatureAttribute();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute#getFeatureAttribute <em>Feature Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Attribute</em>' reference.
   * @see #getFeatureAttribute()
   * @generated
   */
  void setFeatureAttribute(CVAttribute value);

  /**
   * Returns the value of the '<em><b>Attribute Value</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.AttributeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Value</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionModifyAttribute_AttributeValue()
   * @model containment="true"
   * @generated
   */
  EList<AttributeValue> getAttributeValue();

} // AtomicActionModifyAttribute
