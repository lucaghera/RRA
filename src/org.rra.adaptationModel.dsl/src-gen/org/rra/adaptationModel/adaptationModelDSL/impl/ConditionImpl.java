/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getMeas <em>Meas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurement()
   * @generated
   * @ordered
   */
  protected Import measurement;

  /**
   * The cached value of the '{@link #getMeas() <em>Meas</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeas()
   * @generated
   * @ordered
   */
  protected EList<Import> meas;

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
  public Import getMeasurement()
  {
    if (measurement != null && measurement.eIsProxy())
    {
      InternalEObject oldMeasurement = (InternalEObject)measurement;
      measurement = (Import)eResolveProxy(oldMeasurement);
      if (measurement != oldMeasurement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationModelDSLPackage.CONDITION__MEASUREMENT, oldMeasurement, measurement));
      }
    }
    return measurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetMeasurement()
  {
    return measurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasurement(Import newMeasurement)
  {
    Import oldMeasurement = measurement;
    measurement = newMeasurement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__MEASUREMENT, oldMeasurement, measurement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getMeas()
  {
    if (meas == null)
    {
      meas = new EObjectResolvingEList<Import>(Import.class, this, AdaptationModelDSLPackage.CONDITION__MEAS);
    }
    return meas;
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT:
        if (resolve) return getMeasurement();
        return basicGetMeasurement();
      case AdaptationModelDSLPackage.CONDITION__MEAS:
        return getMeas();
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT:
        setMeasurement((Import)newValue);
        return;
      case AdaptationModelDSLPackage.CONDITION__MEAS:
        getMeas().clear();
        getMeas().addAll((Collection<? extends Import>)newValue);
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT:
        setMeasurement((Import)null);
        return;
      case AdaptationModelDSLPackage.CONDITION__MEAS:
        getMeas().clear();
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT:
        return measurement != null;
      case AdaptationModelDSLPackage.CONDITION__MEAS:
        return meas != null && !meas.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
