/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hyperflex.featuremodels.Feature;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery;
import org.rra.adaptationModel.adaptationModelDSL.QueryOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Action Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionQueryImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionQueryImpl#getQueryOperator <em>Query Operator</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionQueryImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicActionQueryImpl extends AtomicActionImpl implements AtomicActionQuery
{
  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected Feature feature;

  /**
   * The default value of the '{@link #getQueryOperator() <em>Query Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryOperator()
   * @generated
   * @ordered
   */
  protected static final QueryOperator QUERY_OPERATOR_EDEFAULT = QueryOperator.MAX;

  /**
   * The cached value of the '{@link #getQueryOperator() <em>Query Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryOperator()
   * @generated
   * @ordered
   */
  protected QueryOperator queryOperator = QUERY_OPERATOR_EDEFAULT;

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
  protected AtomicActionQueryImpl()
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
    return AdaptationModelDSLPackage.Literals.ATOMIC_ACTION_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getFeature()
  {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (Feature)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(Feature newFeature)
  {
    Feature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryOperator getQueryOperator()
  {
    return queryOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryOperator(QueryOperator newQueryOperator)
  {
    QueryOperator oldQueryOperator = queryOperator;
    queryOperator = newQueryOperator == null ? QUERY_OPERATOR_EDEFAULT : newQueryOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__QUERY_OPERATOR, oldQueryOperator, queryOperator));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__VALUE, oldValue, value));
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__QUERY_OPERATOR:
        return getQueryOperator();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__VALUE:
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__FEATURE:
        setFeature((Feature)newValue);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__QUERY_OPERATOR:
        setQueryOperator((QueryOperator)newValue);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__VALUE:
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__FEATURE:
        setFeature((Feature)null);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__QUERY_OPERATOR:
        setQueryOperator(QUERY_OPERATOR_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__VALUE:
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
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__FEATURE:
        return feature != null;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__QUERY_OPERATOR:
        return queryOperator != QUERY_OPERATOR_EDEFAULT;
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY__VALUE:
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
    result.append(" (queryOperator: ");
    result.append(queryOperator);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //AtomicActionQueryImpl
