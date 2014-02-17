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
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getMeasurementComparison <em>Measurement Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getMeasurementComparison() <em>Measurement Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementComparison()
   * @generated
   * @ordered
   */
  protected MeasurementComparison measurementComparison;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return AdaptationModelDSLPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasurementComparison getMeasurementComparison()
  {
    return measurementComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeasurementComparison(MeasurementComparison newMeasurementComparison, NotificationChain msgs)
  {
    MeasurementComparison oldMeasurementComparison = measurementComparison;
    measurementComparison = newMeasurementComparison;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON, oldMeasurementComparison, newMeasurementComparison);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasurementComparison(MeasurementComparison newMeasurementComparison)
  {
    if (newMeasurementComparison != measurementComparison)
    {
      NotificationChain msgs = null;
      if (measurementComparison != null)
        msgs = ((InternalEObject)measurementComparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON, null, msgs);
      if (newMeasurementComparison != null)
        msgs = ((InternalEObject)newMeasurementComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON, null, msgs);
      msgs = basicSetMeasurementComparison(newMeasurementComparison, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON, newMeasurementComparison, newMeasurementComparison));
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON:
        return basicSetMeasurementComparison(null, msgs);
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON:
        return getMeasurementComparison();
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON:
        setMeasurementComparison((MeasurementComparison)newValue);
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON:
        setMeasurementComparison((MeasurementComparison)null);
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT_COMPARISON:
        return measurementComparison != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
