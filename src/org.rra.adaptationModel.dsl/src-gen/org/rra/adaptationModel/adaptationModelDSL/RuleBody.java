/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.RuleBody#getAtomicAction <em>Atomic Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleBody()
 * @model
 * @generated
 */
public interface RuleBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Atomic Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Action</em>' containment reference.
   * @see #setAtomicAction(AtomicAction)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleBody_AtomicAction()
   * @model containment="true"
   * @generated
   */
  AtomicAction getAtomicAction();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.RuleBody#getAtomicAction <em>Atomic Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atomic Action</em>' containment reference.
   * @see #getAtomicAction()
   * @generated
   */
  void setAtomicAction(AtomicAction value);

} // RuleBody
