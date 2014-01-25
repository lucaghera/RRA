/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.DeselectAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deselect Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.DeselectActionImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeselectActionImpl extends AtomicActionImpl implements DeselectAction
{
  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected Import feature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeselectActionImpl()
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
    return AdaptationModelDSLPackage.Literals.DESELECT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getFeature()
  {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (Import)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationModelDSLPackage.DESELECT_ACTION__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(Import newFeature)
  {
    Import oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.DESELECT_ACTION__FEATURE, oldFeature, feature));
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
      case AdaptationModelDSLPackage.DESELECT_ACTION__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
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
      case AdaptationModelDSLPackage.DESELECT_ACTION__FEATURE:
        setFeature((Import)newValue);
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
      case AdaptationModelDSLPackage.DESELECT_ACTION__FEATURE:
        setFeature((Import)null);
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
      case AdaptationModelDSLPackage.DESELECT_ACTION__FEATURE:
        return feature != null;
    }
    return super.eIsSet(featureID);
  }

} //DeselectActionImpl
