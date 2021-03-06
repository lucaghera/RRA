/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.hyperflex.featuremodels.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action Select Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionSelectFeature()
 * @model
 * @generated
 */
public interface AtomicActionSelectFeature extends AtomicAction
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
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionSelectFeature_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // AtomicActionSelectFeature
