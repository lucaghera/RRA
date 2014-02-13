/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.hyperflex.featuremodels.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.QueryAction#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.QueryAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getQueryAction()
 * @model
 * @generated
 */
public interface QueryAction extends AtomicAction
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
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getQueryAction_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.QueryAction#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

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
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getQueryAction_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.QueryAction#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // QueryAction
