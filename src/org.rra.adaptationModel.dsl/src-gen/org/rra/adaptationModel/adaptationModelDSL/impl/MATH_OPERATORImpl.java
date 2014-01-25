/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MATH OPERATOR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.MATH_OPERATORImpl#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MATH_OPERATORImpl extends MinimalEObjectImpl.Container implements MATH_OPERATOR
{
  /**
   * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurement()
   * @generated
   * @ordered
   */
  protected EList<Import> measurement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MATH_OPERATORImpl()
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
    return AdaptationModelDSLPackage.Literals.MATH_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getMeasurement()
  {
    if (measurement == null)
    {
      measurement = new EObjectResolvingEList<Import>(Import.class, this, AdaptationModelDSLPackage.MATH_OPERATOR__MEASUREMENT);
    }
    return measurement;
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
      case AdaptationModelDSLPackage.MATH_OPERATOR__MEASUREMENT:
        return getMeasurement();
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
      case AdaptationModelDSLPackage.MATH_OPERATOR__MEASUREMENT:
        getMeasurement().clear();
        getMeasurement().addAll((Collection<? extends Import>)newValue);
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
      case AdaptationModelDSLPackage.MATH_OPERATOR__MEASUREMENT:
        getMeasurement().clear();
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
      case AdaptationModelDSLPackage.MATH_OPERATOR__MEASUREMENT:
        return measurement != null && !measurement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MATH_OPERATORImpl
