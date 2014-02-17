/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRule#getConditionAction <em>Condition Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicRule()
 * @model
 * @generated
 */
public interface AtomicRule extends AdaptationRule
{
  /**
   * Returns the value of the '<em><b>Condition Action</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Action</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicRule_ConditionAction()
   * @model containment="true"
   * @generated
   */
  EList<ConditionAction> getConditionAction();

} // AtomicRule
