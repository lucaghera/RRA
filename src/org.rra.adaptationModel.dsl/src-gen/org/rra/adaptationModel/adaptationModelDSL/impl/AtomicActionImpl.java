/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl#getSecondAction <em>Second Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicActionImpl extends MinimalEObjectImpl.Container implements AtomicAction
{
  /**
   * The cached value of the '{@link #getSecondAction() <em>Second Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondAction()
   * @generated
   * @ordered
   */
  protected AtomicAction secondAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicActionImpl()
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
    return AdaptationModelDSLPackage.Literals.ATOMIC_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicAction getSecondAction()
  {
    return secondAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondAction(AtomicAction newSecondAction, NotificationChain msgs)
  {
    AtomicAction oldSecondAction = secondAction;
    secondAction = newSecondAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION, oldSecondAction, newSecondAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondAction(AtomicAction newSecondAction)
  {
    if (newSecondAction != secondAction)
    {
      NotificationChain msgs = null;
      if (secondAction != null)
        msgs = ((InternalEObject)secondAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION, null, msgs);
      if (newSecondAction != null)
        msgs = ((InternalEObject)newSecondAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION, null, msgs);
      msgs = basicSetSecondAction(newSecondAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION, newSecondAction, newSecondAction));
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION:
        return basicSetSecondAction(null, msgs);
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION:
        return getSecondAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION:
        setSecondAction((AtomicAction)newValue);
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION:
        setSecondAction((AtomicAction)null);
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION__SECOND_ACTION:
        return secondAction != null;
    }
    return super.eIsSet(featureID);
  }

} //AtomicActionImpl
