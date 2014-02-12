/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.rra.runtimeFeatureModel.NFRAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFR Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getNFRAttributeValue()
 * @model
 * @generated
 */
public interface NFRAttributeValue extends AttributeValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(NFRAttribute)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getNFRAttributeValue_Value()
   * @model
   * @generated
   */
  NFRAttribute getValue();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NFRAttribute value);

} // NFRAttributeValue
