/**
 */
package org.rra.adaptationModel.adaptationModelDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getConditionAction()
 * @model
 * @generated
 */
public interface ConditionAction extends RuleBody
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getConditionAction_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(RuleBody)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getConditionAction_Else()
   * @model containment="true"
   * @generated
   */
  RuleBody getElse();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(RuleBody value);

} // ConditionAction
