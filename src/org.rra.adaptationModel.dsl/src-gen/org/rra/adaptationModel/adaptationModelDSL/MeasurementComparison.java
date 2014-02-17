/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EObject;

import org.rra.cdmModel.ContextDependentMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getValue <em>Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getLogicalOp <em>Logical Op</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getSecondTerm <em>Second Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMeasurementComparison()
 * @model
 * @generated
 */
public interface MeasurementComparison extends EObject
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
   * @see #setMeasurement(ContextDependentMeasurement)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMeasurementComparison_Measurement()
   * @model
   * @generated
   */
  ContextDependentMeasurement getMeasurement();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getMeasurement <em>Measurement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measurement</em>' reference.
   * @see #getMeasurement()
   * @generated
   */
  void setMeasurement(ContextDependentMeasurement value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMeasurementComparison_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMeasurementComparison_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Logical Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Op</em>' attribute.
   * @see #setLogicalOp(String)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMeasurementComparison_LogicalOp()
   * @model
   * @generated
   */
  String getLogicalOp();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getLogicalOp <em>Logical Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical Op</em>' attribute.
   * @see #getLogicalOp()
   * @generated
   */
  void setLogicalOp(String value);

  /**
   * Returns the value of the '<em><b>Second Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Term</em>' containment reference.
   * @see #setSecondTerm(MeasurementComparison)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMeasurementComparison_SecondTerm()
   * @model containment="true"
   * @generated
   */
  MeasurementComparison getSecondTerm();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getSecondTerm <em>Second Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Term</em>' containment reference.
   * @see #getSecondTerm()
   * @generated
   */
  void setSecondTerm(MeasurementComparison value);

} // MeasurementComparison
