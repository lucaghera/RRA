/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeas <em>Meas</em>}</li>
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
   * Returns the value of the '<em><b>Measurement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measurement</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measurement</em>' reference.
   * @see #setMeasurement(Import)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getCondition_Measurement()
   * @model
   * @generated
   */
  Import getMeasurement();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurement <em>Measurement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measurement</em>' reference.
   * @see #getMeasurement()
   * @generated
   */
  void setMeasurement(Import value);

  /**
   * Returns the value of the '<em><b>Meas</b></em>' reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meas</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meas</em>' reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getCondition_Meas()
   * @model
   * @generated
   */
  EList<Import> getMeas();

} // Condition
