/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurementComparison <em>Measurement Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Measurement Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measurement Comparison</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurement Comparison</em>' containment reference.
   * @see #setMeasurementComparison(MeasurementComparison)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getCondition_MeasurementComparison()
   * @model containment="true"
   * @generated
   */
  MeasurementComparison getMeasurementComparison();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurementComparison <em>Measurement Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measurement Comparison</em>' containment reference.
   * @see #getMeasurementComparison()
   * @generated
   */
  void setMeasurementComparison(MeasurementComparison value);

} // Condition
