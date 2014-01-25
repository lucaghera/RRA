/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MATH OPERATOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getMATH_OPERATOR()
 * @model
 * @generated
 */
public interface MATH_OPERATOR extends EObject
{
  /**
   * Returns the value of the '<em><b>Measurement</b></em>' reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.Import}.
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
  EList<Import> getMeasurement();

} // MATH_OPERATOR
