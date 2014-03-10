/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getAtomicRules <em>Atomic Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleSet()
 * @model
 * @generated
 */
public interface RuleSet extends AdaptationRule
{
  /**
   * Returns the value of the '<em><b>Atomic Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Rules</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleSet_AtomicRules()
   * @model containment="true"
   * @generated
   */
  EList<AtomicRuleWithPriority> getAtomicRules();

} // RuleSet
