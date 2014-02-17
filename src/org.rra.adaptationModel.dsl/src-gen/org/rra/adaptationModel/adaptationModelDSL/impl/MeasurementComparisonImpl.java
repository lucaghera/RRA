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
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl#getLogicalOp <em>Logical Op</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl#getSecondTerm <em>Second Term</em>}</li>
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
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

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
   * The default value of the '{@link #getLogicalOp() <em>Logical Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalOp()
   * @generated
   * @ordered
   */
  protected static final String LOGICAL_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLogicalOp() <em>Logical Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalOp()
   * @generated
   * @ordered
   */
  protected String logicalOp = LOGICAL_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecondTerm() <em>Second Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondTerm()
   * @generated
   * @ordered
   */
  protected MeasurementComparison secondTerm;

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
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__OPERATOR, oldOperator, operator));
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
  public String getLogicalOp()
  {
    return logicalOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogicalOp(String newLogicalOp)
  {
    String oldLogicalOp = logicalOp;
    logicalOp = newLogicalOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__LOGICAL_OP, oldLogicalOp, logicalOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasurementComparison getSecondTerm()
  {
    return secondTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondTerm(MeasurementComparison newSecondTerm, NotificationChain msgs)
  {
    MeasurementComparison oldSecondTerm = secondTerm;
    secondTerm = newSecondTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM, oldSecondTerm, newSecondTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondTerm(MeasurementComparison newSecondTerm)
  {
    if (newSecondTerm != secondTerm)
    {
      NotificationChain msgs = null;
      if (secondTerm != null)
        msgs = ((InternalEObject)secondTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM, null, msgs);
      if (newSecondTerm != null)
        msgs = ((InternalEObject)newSecondTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM, null, msgs);
      msgs = basicSetSecondTerm(newSecondTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM, newSecondTerm, newSecondTerm));
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM:
        return basicSetSecondTerm(null, msgs);
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__MEASUREMENT:
        if (resolve) return getMeasurement();
        return basicGetMeasurement();
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__OPERATOR:
        return getOperator();
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        return getValue();
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__LOGICAL_OP:
        return getLogicalOp();
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM:
        return getSecondTerm();
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__OPERATOR:
        setOperator((String)newValue);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        setValue((String)newValue);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__LOGICAL_OP:
        setLogicalOp((String)newValue);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM:
        setSecondTerm((MeasurementComparison)newValue);
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__LOGICAL_OP:
        setLogicalOp(LOGICAL_OP_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM:
        setSecondTerm((MeasurementComparison)null);
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
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__LOGICAL_OP:
        return LOGICAL_OP_EDEFAULT == null ? logicalOp != null : !LOGICAL_OP_EDEFAULT.equals(logicalOp);
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON__SECOND_TERM:
        return secondTerm != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(", value: ");
    result.append(value);
    result.append(", logicalOp: ");
    result.append(logicalOp);
    result.append(')');
    return result.toString();
  }

} //MeasurementComparisonImpl
