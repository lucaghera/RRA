/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule With Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority#getPriorityValue <em>Priority Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleWithPriority()
 * @model
 * @generated
 */
public interface RuleWithPriority extends EObject
{
  /**
   * Returns the value of the '<em><b>Priority Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority Value</em>' attribute.
   * @see #setPriorityValue(int)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleWithPriority_PriorityValue()
   * @model
   * @generated
   */
  int getPriorityValue();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority#getPriorityValue <em>Priority Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority Value</em>' attribute.
   * @see #getPriorityValue()
   * @generated
   */
  void setPriorityValue(int value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleWithPriority_Rule()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRule();

} // RuleWithPriority
