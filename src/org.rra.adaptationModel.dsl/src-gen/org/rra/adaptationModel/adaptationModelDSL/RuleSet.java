/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleSet()
 * @model
 * @generated
 */
public interface RuleSet extends EObject
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
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleSet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getRuleSet_Rules()
   * @model containment="true"
   * @generated
   */
  EList<RuleWithPriority> getRules();

} // RuleSet
