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
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleBodyImpl#getAtomicAction <em>Atomic Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleBodyImpl extends MinimalEObjectImpl.Container implements RuleBody
{
  /**
   * The cached value of the '{@link #getAtomicAction() <em>Atomic Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicAction()
   * @generated
   * @ordered
   */
  protected AtomicAction atomicAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleBodyImpl()
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
    return AdaptationModelDSLPackage.Literals.RULE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicAction getAtomicAction()
  {
    return atomicAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtomicAction(AtomicAction newAtomicAction, NotificationChain msgs)
  {
    AtomicAction oldAtomicAction = atomicAction;
    atomicAction = newAtomicAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION, oldAtomicAction, newAtomicAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomicAction(AtomicAction newAtomicAction)
  {
    if (newAtomicAction != atomicAction)
    {
      NotificationChain msgs = null;
      if (atomicAction != null)
        msgs = ((InternalEObject)atomicAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION, null, msgs);
      if (newAtomicAction != null)
        msgs = ((InternalEObject)newAtomicAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION, null, msgs);
      msgs = basicSetAtomicAction(newAtomicAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION, newAtomicAction, newAtomicAction));
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
      case AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION:
        return basicSetAtomicAction(null, msgs);
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
      case AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION:
        return getAtomicAction();
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
      case AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION:
        setAtomicAction((AtomicAction)newValue);
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
      case AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION:
        setAtomicAction((AtomicAction)null);
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
      case AdaptationModelDSLPackage.RULE_BODY__ATOMIC_ACTION:
        return atomicAction != null;
    }
    return super.eIsSet(featureID);
  }

} //RuleBodyImpl
