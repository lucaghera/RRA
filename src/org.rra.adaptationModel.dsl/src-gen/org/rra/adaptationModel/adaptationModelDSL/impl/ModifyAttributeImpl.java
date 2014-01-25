/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ModifyAttributeImpl#getFeatureAttribute <em>Feature Attribute</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ModifyAttributeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifyAttributeImpl extends AtomicActionImpl implements ModifyAttribute
{
  /**
   * The cached value of the '{@link #getFeatureAttribute() <em>Feature Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureAttribute()
   * @generated
   * @ordered
   */
  protected Import featureAttribute;

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
  protected ModifyAttributeImpl()
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
    return AdaptationModelDSLPackage.Literals.MODIFY_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getFeatureAttribute()
  {
    if (featureAttribute != null && featureAttribute.eIsProxy())
    {
      InternalEObject oldFeatureAttribute = (InternalEObject)featureAttribute;
      featureAttribute = (Import)eResolveProxy(oldFeatureAttribute);
      if (featureAttribute != oldFeatureAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE, oldFeatureAttribute, featureAttribute));
      }
    }
    return featureAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetFeatureAttribute()
  {
    return featureAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureAttribute(Import newFeatureAttribute)
  {
    Import oldFeatureAttribute = featureAttribute;
    featureAttribute = newFeatureAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE, oldFeatureAttribute, featureAttribute));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__VALUE, oldValue, value));
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
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        if (resolve) return getFeatureAttribute();
        return basicGetFeatureAttribute();
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__VALUE:
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
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        setFeatureAttribute((Import)newValue);
        return;
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__VALUE:
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
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        setFeatureAttribute((Import)null);
        return;
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__VALUE:
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
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        return featureAttribute != null;
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE__VALUE:
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

} //ModifyAttributeImpl
