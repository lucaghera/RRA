/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.Rule;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getRuleSets <em>Rule Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptationModelImpl extends MinimalEObjectImpl.Container implements AdaptationModel
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The cached value of the '{@link #getRuleSets() <em>Rule Sets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleSets()
   * @generated
   * @ordered
   */
  protected EList<RuleSet> ruleSets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdaptationModelImpl()
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
    return AdaptationModelDSLPackage.Literals.ADAPTATION_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AdaptationModelDSLPackage.ADAPTATION_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, AdaptationModelDSLPackage.ADAPTATION_MODEL__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RuleSet> getRuleSets()
  {
    if (ruleSets == null)
    {
      ruleSets = new EObjectContainmentEList<RuleSet>(RuleSet.class, this, AdaptationModelDSLPackage.ADAPTATION_MODEL__RULE_SETS);
    }
    return ruleSets;
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULE_SETS:
        return ((InternalEList<?>)getRuleSets()).basicRemove(otherEnd, msgs);
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__IMPORTS:
        return getImports();
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULES:
        return getRules();
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULE_SETS:
        return getRuleSets();
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULE_SETS:
        getRuleSets().clear();
        getRuleSets().addAll((Collection<? extends RuleSet>)newValue);
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__IMPORTS:
        getImports().clear();
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULES:
        getRules().clear();
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULE_SETS:
        getRuleSets().clear();
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULES:
        return rules != null && !rules.isEmpty();
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__RULE_SETS:
        return ruleSets != null && !ruleSets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AdaptationModelImpl
