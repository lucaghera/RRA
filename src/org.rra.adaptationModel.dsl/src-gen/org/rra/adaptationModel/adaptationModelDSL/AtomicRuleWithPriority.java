/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Rule With Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getPriorityValue <em>Priority Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicRuleWithPriority()
 * @model
 * @generated
 */
public interface AtomicRuleWithPriority extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicRuleWithPriority_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicRuleWithPriority_PriorityValue()
   * @model
   * @generated
   */
  int getPriorityValue();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getPriorityValue <em>Priority Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority Value</em>' attribute.
   * @see #getPriorityValue()
   * @generated
   */
  void setPriorityValue(int value);

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
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicRuleWithPriority_RuleBody()
   * @model containment="true"
   * @generated
   */
  RuleBody getRuleBody();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getRuleBody <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Body</em>' containment reference.
   * @see #getRuleBody()
   * @generated
   */
  void setRuleBody(RuleBody value);

} // AtomicRuleWithPriority
