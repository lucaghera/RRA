/**
 */
package org.rra.adaptationModel.adaptationModelDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.SelectAction#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getSelectAction()
 * @model
 * @generated
 */
public interface SelectAction extends AtomicAction
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
   * @see #setFeature(Import)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getSelectAction_Feature()
   * @model
   * @generated
   */
  Import getFeature();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.SelectAction#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Import value);

} // SelectAction
