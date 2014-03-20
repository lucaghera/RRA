/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rra.adaptationModel.adaptationModelDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptationModelDSLFactoryImpl extends EFactoryImpl implements AdaptationModelDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdaptationModelDSLFactory init()
  {
    try
    {
      AdaptationModelDSLFactory theAdaptationModelDSLFactory = (AdaptationModelDSLFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptationModelDSLPackage.eNS_URI);
      if (theAdaptationModelDSLFactory != null)
      {
        return theAdaptationModelDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdaptationModelDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModelDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AdaptationModelDSLPackage.ADAPTATION_MODEL: return createAdaptationModel();
      case AdaptationModelDSLPackage.IMPORT: return createImport();
      case AdaptationModelDSLPackage.ADAPTATION_RULE: return createAdaptationRule();
      case AdaptationModelDSLPackage.ATOMIC_RULE: return createAtomicRule();
      case AdaptationModelDSLPackage.RULE_SET: return createRuleSet();
      case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY: return createAtomicRuleWithPriority();
      case AdaptationModelDSLPackage.ATOMIC_ACTION: return createAtomicAction();
      case AdaptationModelDSLPackage.RULE_BODY: return createRuleBody();
      case AdaptationModelDSLPackage.PURE_ACTION: return createPureAction();
      case AdaptationModelDSLPackage.CONDITION_ACTION: return createConditionAction();
      case AdaptationModelDSLPackage.CONDITION: return createCondition();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_SELECT_FEATURE: return createAtomicActionSelectFeature();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_DESELECT_FEATURE: return createAtomicActionDeselectFeature();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE: return createAtomicActionModifyAttribute();
      case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY: return createAtomicActionQuery();
      case AdaptationModelDSLPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case AdaptationModelDSLPackage.STRING_ATTRIBUTE_VALUE: return createStringAttributeValue();
      case AdaptationModelDSLPackage.NFR_ATTRIBUTE_VALUE: return createNFRAttributeValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AdaptationModelDSLPackage.MATH_OPERATOR:
        return createMathOperatorFromString(eDataType, initialValue);
      case AdaptationModelDSLPackage.LOGICAL_OPERATOR:
        return createLogicalOperatorFromString(eDataType, initialValue);
      case AdaptationModelDSLPackage.QUERY_OPERATOR:
        return createQueryOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AdaptationModelDSLPackage.MATH_OPERATOR:
        return convertMathOperatorToString(eDataType, instanceValue);
      case AdaptationModelDSLPackage.LOGICAL_OPERATOR:
        return convertLogicalOperatorToString(eDataType, instanceValue);
      case AdaptationModelDSLPackage.QUERY_OPERATOR:
        return convertQueryOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModel createAdaptationModel()
  {
    AdaptationModelImpl adaptationModel = new AdaptationModelImpl();
    return adaptationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationRule createAdaptationRule()
  {
    AdaptationRuleImpl adaptationRule = new AdaptationRuleImpl();
    return adaptationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicRule createAtomicRule()
  {
    AtomicRuleImpl atomicRule = new AtomicRuleImpl();
    return atomicRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSet createRuleSet()
  {
    RuleSetImpl ruleSet = new RuleSetImpl();
    return ruleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicRuleWithPriority createAtomicRuleWithPriority()
  {
    AtomicRuleWithPriorityImpl atomicRuleWithPriority = new AtomicRuleWithPriorityImpl();
    return atomicRuleWithPriority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicAction createAtomicAction()
  {
    AtomicActionImpl atomicAction = new AtomicActionImpl();
    return atomicAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleBody createRuleBody()
  {
    RuleBodyImpl ruleBody = new RuleBodyImpl();
    return ruleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PureAction createPureAction()
  {
    PureActionImpl pureAction = new PureActionImpl();
    return pureAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionAction createConditionAction()
  {
    ConditionActionImpl conditionAction = new ConditionActionImpl();
    return conditionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicActionSelectFeature createAtomicActionSelectFeature()
  {
    AtomicActionSelectFeatureImpl atomicActionSelectFeature = new AtomicActionSelectFeatureImpl();
    return atomicActionSelectFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicActionDeselectFeature createAtomicActionDeselectFeature()
  {
    AtomicActionDeselectFeatureImpl atomicActionDeselectFeature = new AtomicActionDeselectFeatureImpl();
    return atomicActionDeselectFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicActionModifyAttribute createAtomicActionModifyAttribute()
  {
    AtomicActionModifyAttributeImpl atomicActionModifyAttribute = new AtomicActionModifyAttributeImpl();
    return atomicActionModifyAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicActionQuery createAtomicActionQuery()
  {
    AtomicActionQueryImpl atomicActionQuery = new AtomicActionQueryImpl();
    return atomicActionQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValue createAttributeValue()
  {
    AttributeValueImpl attributeValue = new AttributeValueImpl();
    return attributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringAttributeValue createStringAttributeValue()
  {
    StringAttributeValueImpl stringAttributeValue = new StringAttributeValueImpl();
    return stringAttributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NFRAttributeValue createNFRAttributeValue()
  {
    NFRAttributeValueImpl nfrAttributeValue = new NFRAttributeValueImpl();
    return nfrAttributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathOperator createMathOperatorFromString(EDataType eDataType, String initialValue)
  {
    MathOperator result = MathOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMathOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue)
  {
    LogicalOperator result = LogicalOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryOperator createQueryOperatorFromString(EDataType eDataType, String initialValue)
  {
    QueryOperator result = QueryOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQueryOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModelDSLPackage getAdaptationModelDSLPackage()
  {
    return (AdaptationModelDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdaptationModelDSLPackage getPackage()
  {
    return AdaptationModelDSLPackage.eINSTANCE;
  }

} //AdaptationModelDSLFactoryImpl
