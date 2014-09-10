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
import org.rra.adaptationModel.adaptationModelDSL.LogicalOperator;
import org.rra.adaptationModel.adaptationModelDSL.MathOperator;
import org.rra.cdmModel.ContextDependentMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getLogicalOp <em>Logical Op</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl#getSecondTerm <em>Second Term</em>}</li>
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
  protected ContextDependentMeasurement measurement;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final MathOperator OPERATOR_EDEFAULT = MathOperator.LESS;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected MathOperator operator = OPERATOR_EDEFAULT;

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
  protected static final LogicalOperator LOGICAL_OP_EDEFAULT = LogicalOperator.AND;

  /**
   * The cached value of the '{@link #getLogicalOp() <em>Logical Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalOp()
   * @generated
   * @ordered
   */
  protected LogicalOperator logicalOp = LOGICAL_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecondTerm() <em>Second Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondTerm()
   * @generated
   * @ordered
   */
  protected Condition secondTerm;

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
  public ContextDependentMeasurement getMeasurement()
  {
    if (measurement != null && measurement.eIsProxy())
    {
      InternalEObject oldMeasurement = (InternalEObject)measurement;
      measurement = (ContextDependentMeasurement)eResolveProxy(oldMeasurement);
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__MEASUREMENT, oldMeasurement, measurement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(MathOperator newOperator)
  {
    MathOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__OPERATOR, oldOperator, operator));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOperator getLogicalOp()
  {
    return logicalOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogicalOp(LogicalOperator newLogicalOp)
  {
    LogicalOperator oldLogicalOp = logicalOp;
    logicalOp = newLogicalOp == null ? LOGICAL_OP_EDEFAULT : newLogicalOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__LOGICAL_OP, oldLogicalOp, logicalOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getSecondTerm()
  {
    return secondTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondTerm(Condition newSecondTerm, NotificationChain msgs)
  {
    Condition oldSecondTerm = secondTerm;
    secondTerm = newSecondTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__SECOND_TERM, oldSecondTerm, newSecondTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondTerm(Condition newSecondTerm)
  {
    if (newSecondTerm != secondTerm)
    {
      NotificationChain msgs = null;
      if (secondTerm != null)
        msgs = ((InternalEObject)secondTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.CONDITION__SECOND_TERM, null, msgs);
      if (newSecondTerm != null)
        msgs = ((InternalEObject)newSecondTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptationModelDSLPackage.CONDITION__SECOND_TERM, null, msgs);
      msgs = basicSetSecondTerm(newSecondTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptationModelDSLPackage.CONDITION__SECOND_TERM, newSecondTerm, newSecondTerm));
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
      case AdaptationModelDSLPackage.CONDITION__SECOND_TERM:
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT:
        if (resolve) return getMeasurement();
        return basicGetMeasurement();
      case AdaptationModelDSLPackage.CONDITION__OPERATOR:
        return getOperator();
      case AdaptationModelDSLPackage.CONDITION__VALUE:
        return getValue();
      case AdaptationModelDSLPackage.CONDITION__LOGICAL_OP:
        return getLogicalOp();
      case AdaptationModelDSLPackage.CONDITION__SECOND_TERM:
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
      case AdaptationModelDSLPackage.CONDITION__MEASUREMENT:
        setMeasurement((ContextDependentMeasurement)newValue);
        return;
      case AdaptationModelDSLPackage.CONDITION__OPERATOR:
        setOperator((MathOperator)newValue);
        return;
      case AdaptationModelDSLPackage.CONDITION__VALUE:
        setValue((String)newValue);
        return;
      case AdaptationModelDSLPackage.CONDITION__LOGICAL_OP:
        setLogicalOp((LogicalOperator)newValue);
        return;
      case AdaptationModelDSLPackage.CONDITION__SECOND_TERM:
        setSecondTerm((Condition)newValue);
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
        setMeasurement((ContextDependentMeasurement)null);
        return;
      case AdaptationModelDSLPackage.CONDITION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.CONDITION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.CONDITION__LOGICAL_OP:
        setLogicalOp(LOGICAL_OP_EDEFAULT);
        return;
      case AdaptationModelDSLPackage.CONDITION__SECOND_TERM:
        setSecondTerm((Condition)null);
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
      case AdaptationModelDSLPackage.CONDITION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case AdaptationModelDSLPackage.CONDITION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case AdaptationModelDSLPackage.CONDITION__LOGICAL_OP:
        return logicalOp != LOGICAL_OP_EDEFAULT;
      case AdaptationModelDSLPackage.CONDITION__SECOND_TERM:
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

} //ConditionImpl
