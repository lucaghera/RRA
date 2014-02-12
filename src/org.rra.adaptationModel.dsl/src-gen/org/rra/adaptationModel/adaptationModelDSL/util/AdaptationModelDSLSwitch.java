/**
 */
package org.rra.adaptationModel.adaptationModelDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.rra.adaptationModel.adaptationModelDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage
 * @generated
 */
public class AdaptationModelDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdaptationModelDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModelDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AdaptationModelDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AdaptationModelDSLPackage.ADAPTATION_MODEL:
      {
        AdaptationModel adaptationModel = (AdaptationModel)theEObject;
        T result = caseAdaptationModel(adaptationModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON:
      {
        MeasurementComparison measurementComparison = (MeasurementComparison)theEObject;
        T result = caseMeasurementComparison(measurementComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.MATH_OPERATOR:
      {
        MATH_OPERATOR matH_OPERATOR = (MATH_OPERATOR)theEObject;
        T result = caseMATH_OPERATOR(matH_OPERATOR);
        if (result == null) result = caseQueryAction(matH_OPERATOR);
        if (result == null) result = caseAtomicAction(matH_OPERATOR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.AVG:
      {
        AVG avg = (AVG)theEObject;
        T result = caseAVG(avg);
        if (result == null) result = caseMATH_OPERATOR(avg);
        if (result == null) result = caseQueryAction(avg);
        if (result == null) result = caseAtomicAction(avg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.MIN:
      {
        MIN min = (MIN)theEObject;
        T result = caseMIN(min);
        if (result == null) result = caseMATH_OPERATOR(min);
        if (result == null) result = caseQueryAction(min);
        if (result == null) result = caseAtomicAction(min);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.MAX:
      {
        MAX max = (MAX)theEObject;
        T result = caseMAX(max);
        if (result == null) result = caseMATH_OPERATOR(max);
        if (result == null) result = caseQueryAction(max);
        if (result == null) result = caseAtomicAction(max);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.ATOMIC_ACTION:
      {
        AtomicAction atomicAction = (AtomicAction)theEObject;
        T result = caseAtomicAction(atomicAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.QUERY_ACTION:
      {
        QueryAction queryAction = (QueryAction)theEObject;
        T result = caseQueryAction(queryAction);
        if (result == null) result = caseAtomicAction(queryAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.SELECT_ACTION:
      {
        SelectAction selectAction = (SelectAction)theEObject;
        T result = caseSelectAction(selectAction);
        if (result == null) result = caseAtomicAction(selectAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.DESELECT_ACTION:
      {
        DeselectAction deselectAction = (DeselectAction)theEObject;
        T result = caseDeselectAction(deselectAction);
        if (result == null) result = caseAtomicAction(deselectAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE:
      {
        ModifyAttribute modifyAttribute = (ModifyAttribute)theEObject;
        T result = caseModifyAttribute(modifyAttribute);
        if (result == null) result = caseAtomicAction(modifyAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.ATTRIBUTE_VALUE:
      {
        AttributeValue attributeValue = (AttributeValue)theEObject;
        T result = caseAttributeValue(attributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.STRING_ATTRIBUTE_VALUE:
      {
        StringAttributeValue stringAttributeValue = (StringAttributeValue)theEObject;
        T result = caseStringAttributeValue(stringAttributeValue);
        if (result == null) result = caseAttributeValue(stringAttributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdaptationModelDSLPackage.NFR_ATTRIBUTE_VALUE:
      {
        NFRAttributeValue nfrAttributeValue = (NFRAttributeValue)theEObject;
        T result = caseNFRAttributeValue(nfrAttributeValue);
        if (result == null) result = caseAttributeValue(nfrAttributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adaptation Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adaptation Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdaptationModel(AdaptationModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Measurement Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measurement Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeasurementComparison(MeasurementComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MATH OPERATOR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MATH OPERATOR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMATH_OPERATOR(MATH_OPERATOR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AVG</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AVG</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAVG(AVG object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MIN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MIN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMIN(MIN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MAX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MAX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMAX(MAX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicAction(AtomicAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryAction(QueryAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectAction(SelectAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deselect Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deselect Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeselectAction(DeselectAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modify Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modify Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifyAttribute(ModifyAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeValue(AttributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Attribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringAttributeValue(StringAttributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NFR Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NFR Attribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNFRAttributeValue(NFRAttributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AdaptationModelDSLSwitch
