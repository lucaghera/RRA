/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Action With Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionWithPriorityImpl#getPriorityValue <em>Priority Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionWithPriorityImpl#getAtomicAction <em>Atomic Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicActionWithPriorityImpl extends MinimalEObjectImpl.Container implements AtomicActionWithPriority
{
  /**
   * The default value of the '{@link #getPriorityValue() <em>Priority Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriorityValue()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPriorityValue() <em>Priority Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriorityValue()
   * @generated
   * @ordered
   */
  protected int priorityValue = PRIORITY_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtomicAction() <em>Atomic Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicAction()
   * @generated
   * @ordered
   */
  protected EList<AtomicAction> atomicAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicActionWithPriorityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdaptationModelDSLPackage.Literals.ATOMIC_ACTION_WITH_PRIORITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPriorityValue()
  {
    return priorityValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriorityValue(int newPriorityValue)
  {
    int oldPriorityValue = priorityValue;
    priorityValue = newPriorityValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__PRIORITY_VALUE, oldPriorityValue, priorityValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AtomicAction> getAtomicAction()
  {
    if (atomicAction == null)
    {
      atomicAction = new EObjectContainmentEList<AtomicAction>(AtomicAction.class, this, AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION);
    }
    return atomicAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION:
        return ((InternalEList<?>)getAtomicAction()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__PRIORITY_VALUE:
        return getPriorityValue();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION:
        return getAtomicAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__PRIORITY_VALUE:
        setPriorityValue((Integer)newValue);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION:
        getAtomicAction().clear();
        getAtomicAction().addAll((Collection<? extends AtomicAction>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__PRIORITY_VALUE:
        setPriorityValue(PRIORITY_VALUE_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION:
        getAtomicAction().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__PRIORITY_VALUE:
        return priorityValue != PRIORITY_VALUE_EDEFAULT;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION:
        return atomicAction != null && !atomicAction.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (priorityValue: ");
    result.append(priorityValue);
    result.append(')');
    return result.toString();
  }

} //AtomicActionWithPriorityImpl
