/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.Rule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.Rule#getAtomicAction <em>Atomic Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends AdaptationRule
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRule_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCondition();

  /**
   * Returns the value of the '<em><b>Atomic Action</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.AtomicAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Action</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRule_AtomicAction()
   * @model containment="true"
   * @generated
   */
  EList<AtomicAction> getAtomicAction();

} // Rule
