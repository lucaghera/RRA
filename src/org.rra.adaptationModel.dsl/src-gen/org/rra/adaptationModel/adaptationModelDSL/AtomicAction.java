/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicAction#getSecondAction <em>Second Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicAction()
 * @model
 * @generated
 */
public interface AtomicAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Second Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Action</em>' containment reference.
   * @see #setSecondAction(AtomicAction)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicAction_SecondAction()
   * @model containment="true"
   * @generated
   */
  AtomicAction getSecondAction();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicAction#getSecondAction <em>Second Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Action</em>' containment reference.
   * @see #getSecondAction()
   * @generated
   */
  void setSecondAction(AtomicAction value);

} // AtomicAction
