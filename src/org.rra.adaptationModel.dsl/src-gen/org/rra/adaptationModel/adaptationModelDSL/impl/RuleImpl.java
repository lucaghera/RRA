/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleImpl#getAtomicAction <em>Atomic Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends AdaptationRuleImpl implements Rule
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> condition;

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
  protected RuleImpl()
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
    return AdaptationModelDSLPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<Condition>(Condition.class, this, AdaptationModelDSLPackage.RULE__CONDITION);
    }
    return condition;
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
      atomicAction = new EObjectContainmentEList<AtomicAction>(AtomicAction.class, this, AdaptationModelDSLPackage.RULE__ATOMIC_ACTION);
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
      case AdaptationModelDSLPackage.RULE__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
      case AdaptationModelDSLPackage.RULE__ATOMIC_ACTION:
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
      case AdaptationModelDSLPackage.RULE__CONDITION:
        return getCondition();
      case AdaptationModelDSLPackage.RULE__ATOMIC_ACTION:
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
      case AdaptationModelDSLPackage.RULE__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends Condition>)newValue);
        return;
      case AdaptationModelDSLPackage.RULE__ATOMIC_ACTION:
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
      case AdaptationModelDSLPackage.RULE__CONDITION:
        getCondition().clear();
        return;
      case AdaptationModelDSLPackage.RULE__ATOMIC_ACTION:
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
      case AdaptationModelDSLPackage.RULE__CONDITION:
        return condition != null && !condition.isEmpty();
      case AdaptationModelDSLPackage.RULE__ATOMIC_ACTION:
        return atomicAction != null && !atomicAction.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RuleImpl
