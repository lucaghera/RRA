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
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl#getOutputPackage <em>Output Package</em>}</li>
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
   * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected static final int FREQUENCY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected int frequency = FREQUENCY_EDEFAULT;

  /**
   * The default value of the '{@link #getOutputPackage() <em>Output Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputPackage()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputPackage() <em>Output Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputPackage()
   * @generated
   * @ordered
   */
  protected String outputPackage = OUTPUT_PACKAGE_EDEFAULT;

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
  public int getFrequency()
  {
    return frequency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrequency(int newFrequency)
  {
    int oldFrequency = frequency;
    frequency = newFrequency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ADAPTATION_MODEL__FREQUENCY, oldFrequency, frequency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutputPackage()
  {
    return outputPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputPackage(String newOutputPackage)
  {
    String oldOutputPackage = outputPackage;
    outputPackage = newOutputPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ADAPTATION_MODEL__OUTPUT_PACKAGE, oldOutputPackage, outputPackage));
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__FREQUENCY:
        return getFrequency();
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__OUTPUT_PACKAGE:
        return getOutputPackage();
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__FREQUENCY:
        setFrequency((Integer)newValue);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__OUTPUT_PACKAGE:
        setOutputPackage((String)newValue);
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__FREQUENCY:
        setFrequency(FREQUENCY_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__OUTPUT_PACKAGE:
        setOutputPackage(OUTPUT_PACKAGE_EDEFAULT);
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
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__FREQUENCY:
        return frequency != FREQUENCY_EDEFAULT;
      case AdaptationModelDSLPackage.ADAPTATION_MODEL__OUTPUT_PACKAGE:
        return OUTPUT_PACKAGE_EDEFAULT == null ? outputPackage != null : !OUTPUT_PACKAGE_EDEFAULT.equals(outputPackage);
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
    result.append(", frequency: ");
    result.append(frequency);
    result.append(", outputPackage: ");
    result.append(outputPackage);
    result.append(')');
    return result.toString();
  }

} //AdaptationModelImpl
