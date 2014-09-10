/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleImpl#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicRuleImpl extends AdaptationRuleImpl implements AtomicRule
{
  /**
   * The cached value of the '{@link #getRuleBody() <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleBody()
   * @generated
   * @ordered
   */
  protected RuleBody ruleBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicRuleImpl()
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
    return AdaptationModelDSLPackage.Literals.ATOMIC_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleBody getRuleBody()
  {
    return ruleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRuleBody(RuleBody newRuleBody, NotificationChain msgs)
  {
    RuleBody oldRuleBody = ruleBody;
    ruleBody = newRuleBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY, oldRuleBody, newRuleBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleBody(RuleBody newRuleBody)
  {
    if (newRuleBody != ruleBody)
    {
      NotificationChain msgs = null;
      if (ruleBody != null)
        msgs = ((InternalEObject)ruleBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY, null, msgs);
      if (newRuleBody != null)
        msgs = ((InternalEObject)newRuleBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY, null, msgs);
      msgs = basicSetRuleBody(newRuleBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY, newRuleBody, newRuleBody));
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
      case AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY:
        return basicSetRuleBody(null, msgs);
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
      case AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY:
        return getRuleBody();
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
      case AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY:
        setRuleBody((RuleBody)newValue);
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
      case AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY:
        setRuleBody((RuleBody)null);
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
      case AdaptationModelDSLPackage.ATOMIC_RULE__RULE_BODY:
        return ruleBody != null;
    }
    return super.eIsSet(featureID);
  }

} //AtomicRuleImpl
