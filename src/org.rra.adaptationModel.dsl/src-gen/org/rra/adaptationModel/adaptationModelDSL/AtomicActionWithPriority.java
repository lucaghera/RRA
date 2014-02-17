/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action With Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority#getPriorityValue <em>Priority Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority#getAtomicAction <em>Atomic Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionWithPriority()
 * @model
 * @generated
 */
public interface AtomicActionWithPriority extends EObject
{
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
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionWithPriority_PriorityValue()
   * @model
   * @generated
   */
  int getPriorityValue();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority#getPriorityValue <em>Priority Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority Value</em>' attribute.
   * @see #getPriorityValue()
   * @generated
   */
  void setPriorityValue(int value);

  /**
   * Returns the value of the '<em><b>Atomic Action</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.AtomicAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Action</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAtomicActionWithPriority_AtomicAction()
   * @model containment="true"
   * @generated
   */
  EList<AtomicAction> getAtomicAction();

} // AtomicActionWithPriority
