/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getRules <em>Rules</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getRuleSets <em>Rule Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel()
 * @model
 * @generated
 */
public interface AdaptationModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

  /**
   * Returns the value of the '<em><b>Rule Sets</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.RuleSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Sets</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_RuleSets()
   * @model containment="true"
   * @generated
   */
  EList<RuleSet> getRuleSets();

} // AdaptationModel
