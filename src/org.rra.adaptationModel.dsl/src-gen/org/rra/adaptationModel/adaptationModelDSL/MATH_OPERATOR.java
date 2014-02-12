/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.hyperflex.featuremodels.Feature;

import org.rra.cdmModel.ContextDependentMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MATH OPERATOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMATH_OPERATOR()
 * @model
 * @generated
 */
public interface MATH_OPERATOR extends QueryAction
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMATH_OPERATOR_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

  /**
   * Returns the value of the '<em><b>Measurement</b></em>' reference list.
   * The list contents are of type {@link org.rra.cdmModel.ContextDependentMeasurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurement</em>' reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMATH_OPERATOR_Measurement()
   * @model
   * @generated
   */
  EList<ContextDependentMeasurement> getMeasurement();

} // MATH_OPERATOR
