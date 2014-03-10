/**
 */
package org.rra.adaptationModel.adaptationModelDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRule#getRuleBody <em>Rule Body</em>}</li>
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
   * Returns the value of the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Body</em>' containment reference.
   * @see #setRuleBody(RuleBody)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicRule_RuleBody()
   * @model containment="true"
   * @generated
   */
  RuleBody getRuleBody();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRule#getRuleBody <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Body</em>' containment reference.
   * @see #getRuleBody()
   * @generated
   */
  void setRuleBody(RuleBody value);

} // AtomicRule
