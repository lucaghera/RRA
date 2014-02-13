/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison;

import org.rra.cdmModel.ContextDependentMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementComparisonImpl extends MinimalEObjectImpl.Container implements MeasurementComparison
{
  /**
   * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurement()
   * @generated
   * @ordered
   */
  protected ContextDependentMeasurement measurement;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeasurementComparisonImpl()
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
    return AdaptationModelDSLPackage.Literals.MEASUREMENT_COMPARISON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDependentMeasurement getMeasurement()
  {
    if (measurement != null && measurement.eIsProxy())
    {
      InternalEObject oldMeasurement = (InternalEObject)measurement;
      measurement = (ContextDependentMeasurement)eResolveProxy(oldMeasurement);
      if (measurement != oldMeasurement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT, oldMeasurement, measurement));
      }
    }
    return measurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDependentMeasurement basicGetMeasurement()
  {
    return measurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasurement(ContextDependentMeasurement newMeasurement)
  {
    ContextDependentMeasurement oldMeasurement = measurement;
    measurement = newMeasurement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT, oldMeasurement, measurement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE, oldValue, value));
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT:
        if (resolve) return getMeasurement();
        return basicGetMeasurement();
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        return getValue();
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT:
        setMeasurement((ContextDependentMeasurement)newValue);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        setValue((String)newValue);
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT:
        setMeasurement((ContextDependentMeasurement)null);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT:
        return measurement != null;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //MeasurementComparisonImpl
