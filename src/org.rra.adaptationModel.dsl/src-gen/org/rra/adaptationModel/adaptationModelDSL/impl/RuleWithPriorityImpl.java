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
import org.rra.adaptationModel.adaptationModelDSL.Rule;
import org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule With Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleWithPriorityImpl#getPriorityValue <em>Priority Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleWithPriorityImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleWithPriorityImpl extends MinimalEObjectImpl.Container implements RuleWithPriority
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
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected EList<Rule> rule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleWithPriorityImpl()
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
    return AdaptationModelDSLPackage.Literals.RULE_WITH_PRIORITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.RULE_WITH_PRIORITY__PRIORITY_VALUE, oldPriorityValue, priorityValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRule()
  {
    if (rule == null)
    {
      rule = new EObjectContainmentEList<Rule>(Rule.class, this, AdaptationModelDSLPackage.RULE_WITH_PRIORITY__RULE);
    }
    return rule;
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
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__RULE:
        return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__PRIORITY_VALUE:
        return getPriorityValue();
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__RULE:
        return getRule();
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
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__PRIORITY_VALUE:
        setPriorityValue((Integer)newValue);
        return;
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__RULE:
        getRule().clear();
        getRule().addAll((Collection<? extends Rule>)newValue);
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
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__PRIORITY_VALUE:
        setPriorityValue(PRIORITY_VALUE_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__RULE:
        getRule().clear();
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
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__PRIORITY_VALUE:
        return priorityValue != PRIORITY_VALUE_EDEFAULT;
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY__RULE:
        return rule != null && !rule.isEmpty();
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

} //RuleWithPriorityImpl
