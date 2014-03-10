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
import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Rule With Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleWithPriorityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleWithPriorityImpl#getPriorityValue <em>Priority Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleWithPriorityImpl#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicRuleWithPriorityImpl extends MinimalEObjectImpl.Container implements AtomicRuleWithPriority
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected AtomicRuleWithPriorityImpl()
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
    return AdaptationModelDSLPackage.Literals.ATOMIC_RULE_WITH_PRIORITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE, oldPriorityValue, priorityValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY, oldRuleBody, newRuleBody);
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
        msgs = ((InternalEObject)ruleBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY, null, msgs);
      if (newRuleBody != null)
        msgs = ((InternalEObject)newRuleBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY, null, msgs);
      msgs = basicSetRuleBody(newRuleBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY, newRuleBody, newRuleBody));
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
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY:
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
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__NAME:
        return getName();
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE:
        return getPriorityValue();
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY:
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
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__NAME:
        setName((String)newValue);
        return;
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE:
        setPriorityValue((Integer)newValue);
        return;
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY:
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
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE:
        setPriorityValue(PRIORITY_VALUE_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY:
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
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE:
        return priorityValue != PRIORITY_VALUE_EDEFAULT;
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY:
        return ruleBody != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", priorityValue: ");
    result.append(priorityValue);
    result.append(')');
    return result.toString();
  }

} //AtomicRuleWithPriorityImpl
