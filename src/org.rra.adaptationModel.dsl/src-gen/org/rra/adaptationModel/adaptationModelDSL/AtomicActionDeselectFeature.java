/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.hyperflex.featuremodels.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action Deselect Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionDeselectFeature()
 * @model
 * @generated
 */
public interface AtomicActionDeselectFeature extends AtomicAction
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionDeselectFeature_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // AtomicActionDeselectFeature
