/**
 */
package org.rra.adaptationModel.adaptationModelDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getFeatureAttribute <em>Feature Attribute</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getModifyAttribute()
 * @model
 * @generated
 */
public interface ModifyAttribute extends AtomicAction
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
   * @see #setFeatureAttribute(Import)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getModifyAttribute_FeatureAttribute()
   * @model
   * @generated
   */
  Import getFeatureAttribute();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getFeatureAttribute <em>Feature Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Attribute</em>' reference.
   * @see #getFeatureAttribute()
   * @generated
   */
  void setFeatureAttribute(Import value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getModifyAttribute_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ModifyAttribute
