/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.ecore.EClass;
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
      case AdaptationModelDSLPackage.RULE: return createRule();
      case AdaptationModelDSLPackage.RULE_WITH_PRIORITY: return createRuleWithPriority();
      case AdaptationModelDSLPackage.RULE_SET: return createRuleSet();
      case AdaptationModelDSLPackage.CONDITION: return createCondition();
      case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON: return createMeasurementComparison();
      case AdaptationModelDSLPackage.ATOMIC_ACTION: return createAtomicAction();
      case AdaptationModelDSLPackage.QUERY_ACTION: return createQueryAction();
      case AdaptationModelDSLPackage.SELECT_ACTION: return createSelectAction();
      case AdaptationModelDSLPackage.DESELECT_ACTION: return createDeselectAction();
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE: return createModifyAttribute();
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
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleWithPriority createRuleWithPriority()
  {
    RuleWithPriorityImpl ruleWithPriority = new RuleWithPriorityImpl();
    return ruleWithPriority;
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
  public MeasurementComparison createMeasurementComparison()
  {
    MeasurementComparisonImpl measurementComparison = new MeasurementComparisonImpl();
    return measurementComparison;
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
  public QueryAction createQueryAction()
  {
    QueryActionImpl queryAction = new QueryActionImpl();
    return queryAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAction createSelectAction()
  {
    SelectActionImpl selectAction = new SelectActionImpl();
    return selectAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeselectAction createDeselectAction()
  {
    DeselectActionImpl deselectAction = new DeselectActionImpl();
    return deselectAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifyAttribute createModifyAttribute()
  {
    ModifyAttributeImpl modifyAttribute = new ModifyAttributeImpl();
    return modifyAttribute;
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
