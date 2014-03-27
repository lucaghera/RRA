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

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationRule;
import org.rra.adaptationModel.adaptationModelDSL.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getAdaptationRules <em>Adaptation Rules</em>}</li>
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
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final int PERIOD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected int period = PERIOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getAdaptationRules() <em>Adaptation Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdaptationRules()
   * @generated
   * @ordered
   */
  protected EList<AdaptationRule> adaptationRules;

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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ADAPTATION_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(int newPeriod)
  {
    int oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ADAPTATION_MODEL__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdaptationRule> getAdaptationRules()
  {
    if (adaptationRules == null)
    {
      adaptationRules = new EObjectContainmentEList<AdaptationRule>(AdaptationRule.class, this, AdaptationModelDSLPackage.ADAPTATION_MODEL__ADAPTATION_RULES);
    }
    return adaptationRules;
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        return ((InternalEList<?>)getAdaptationRules()).basicRemove(otherEnd, msgs);
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__NAME:
        return getName();
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__PERIOD:
        return getPeriod();
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        return getAdaptationRules();
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__NAME:
        setName((String)newValue);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__PERIOD:
        setPeriod((Integer)newValue);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        getAdaptationRules().clear();
        getAdaptationRules().addAll((Collection<? extends AdaptationRule>)newValue);
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        getAdaptationRules().clear();
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__PERIOD:
        return period != PERIOD_EDEFAULT;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        return adaptationRules != null && !adaptationRules.isEmpty();
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
    result.append(", period: ");
    result.append(period);
    result.append(')');
    return result.toString();
  }

} //AdaptationModelImpl
