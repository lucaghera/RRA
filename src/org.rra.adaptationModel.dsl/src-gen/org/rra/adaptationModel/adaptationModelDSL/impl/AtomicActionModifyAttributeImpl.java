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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.AttributeValue;
import org.rra.runtimeFeatureModel.CVAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Action Modify Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionModifyAttributeImpl#getFeatureAttribute <em>Feature Attribute</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionModifyAttributeImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicActionModifyAttributeImpl extends AtomicActionImpl implements AtomicActionModifyAttribute
{
  /**
   * The cached value of the '{@link #getFeatureAttribute() <em>Feature Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureAttribute()
   * @generated
   * @ordered
   */
  protected CVAttribute featureAttribute;

  /**
   * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeValue()
   * @generated
   * @ordered
   */
  protected EList<AttributeValue> attributeValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicActionModifyAttributeImpl()
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
    return AdaptationModelDSLPackage.Literals.ATOMIC_ACTION_MODIFY_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CVAttribute getFeatureAttribute()
  {
    if (featureAttribute != null && featureAttribute.eIsProxy())
    {
      InternalEObject oldFeatureAttribute = (InternalEObject)featureAttribute;
      featureAttribute = (CVAttribute)eResolveProxy(oldFeatureAttribute);
      if (featureAttribute != oldFeatureAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE, oldFeatureAttribute, featureAttribute));
      }
    }
    return featureAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CVAttribute basicGetFeatureAttribute()
  {
    return featureAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureAttribute(CVAttribute newFeatureAttribute)
  {
    CVAttribute oldFeatureAttribute = featureAttribute;
    featureAttribute = newFeatureAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE, oldFeatureAttribute, featureAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeValue> getAttributeValue()
  {
    if (attributeValue == null)
    {
      attributeValue = new EObjectContainmentEList<AttributeValue>(AttributeValue.class, this, AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE);
    }
    return attributeValue;
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE:
        return ((InternalEList<?>)getAttributeValue()).basicRemove(otherEnd, msgs);
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        if (resolve) return getFeatureAttribute();
        return basicGetFeatureAttribute();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE:
        return getAttributeValue();
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        setFeatureAttribute((CVAttribute)newValue);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE:
        getAttributeValue().clear();
        getAttributeValue().addAll((Collection<? extends AttributeValue>)newValue);
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        setFeatureAttribute((CVAttribute)null);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE:
        getAttributeValue().clear();
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE:
        return featureAttribute != null;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE:
        return attributeValue != null && !attributeValue.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AtomicActionModifyAttributeImpl
