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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT:
        if (resolve) return getMeasurement();
        return basicGetMeasurement();
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
    }
    return super.eIsSet(featureID);
  }

} //MeasurementComparisonImpl
