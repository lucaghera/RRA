/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hyperflex.featuremodels.featuremodelsPackage;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLFactory;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.AttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.ConditionAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.LogicalOperator;
import org.rra.adaptationModel.adaptationModelDSL.MathOperator;
import org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.PureAction;
import org.rra.adaptationModel.adaptationModelDSL.QueryOperator;
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue;

import org.rra.cdmModel.CDMModelPackage;

import org.rra.runtimeFeatureModel.RuntimeFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptationModelDSLPackageImpl extends EPackageImpl implements AdaptationModelDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adaptationModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adaptationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicRuleWithPriorityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pureActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicActionSelectFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicActionDeselectFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicActionModifyAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicActionQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringAttributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nfrAttributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mathOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logicalOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum queryOperatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AdaptationModelDSLPackageImpl()
  {
    super(eNS_URI, AdaptationModelDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AdaptationModelDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AdaptationModelDSLPackage init()
  {
    if (isInited) return (AdaptationModelDSLPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptationModelDSLPackage.eNS_URI);

    // Obtain or create and register package
    AdaptationModelDSLPackageImpl theAdaptationModelDSLPackage = (AdaptationModelDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdaptationModelDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdaptationModelDSLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CDMModelPackage.eINSTANCE.eClass();
    RuntimeFeatureModelPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAdaptationModelDSLPackage.createPackageContents();

    // Initialize created meta-data
    theAdaptationModelDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAdaptationModelDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AdaptationModelDSLPackage.eNS_URI, theAdaptationModelDSLPackage);
    return theAdaptationModelDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdaptationModel()
  {
    return adaptationModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdaptationModel_Imports()
  {
    return (EReference)adaptationModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdaptationModel_Name()
  {
    return (EAttribute)adaptationModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdaptationModel_Period()
  {
    return (EAttribute)adaptationModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdaptationModel_AdaptationRules()
  {
    return (EReference)adaptationModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdaptationRule()
  {
    return adaptationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdaptationRule_Name()
  {
    return (EAttribute)adaptationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicRule()
  {
    return atomicRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicRule_RuleBody()
  {
    return (EReference)atomicRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleSet()
  {
    return ruleSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSet_AtomicRules()
  {
    return (EReference)ruleSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicRuleWithPriority()
  {
    return atomicRuleWithPriorityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicRuleWithPriority_Name()
  {
    return (EAttribute)atomicRuleWithPriorityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicRuleWithPriority_PriorityValue()
  {
    return (EAttribute)atomicRuleWithPriorityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicRuleWithPriority_RuleBody()
  {
    return (EReference)atomicRuleWithPriorityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicAction()
  {
    return atomicActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicAction_SecondAction()
  {
    return (EReference)atomicActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleBody()
  {
    return ruleBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleBody_AtomicAction()
  {
    return (EReference)ruleBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPureAction()
  {
    return pureActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionAction()
  {
    return conditionActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionAction_Condition()
  {
    return (EReference)conditionActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionAction_Else()
  {
    return (EReference)conditionActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Measurement()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Operator()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Value()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_LogicalOp()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_SecondTerm()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicActionSelectFeature()
  {
    return atomicActionSelectFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicActionSelectFeature_Feature()
  {
    return (EReference)atomicActionSelectFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicActionDeselectFeature()
  {
    return atomicActionDeselectFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicActionDeselectFeature_Feature()
  {
    return (EReference)atomicActionDeselectFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicActionModifyAttribute()
  {
    return atomicActionModifyAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicActionModifyAttribute_FeatureAttribute()
  {
    return (EReference)atomicActionModifyAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicActionModifyAttribute_AttributeValue()
  {
    return (EReference)atomicActionModifyAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicActionQuery()
  {
    return atomicActionQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicActionQuery_Feature()
  {
    return (EReference)atomicActionQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicActionQuery_QueryOperator()
  {
    return (EAttribute)atomicActionQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicActionQuery_Value()
  {
    return (EAttribute)atomicActionQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeValue()
  {
    return attributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringAttributeValue()
  {
    return stringAttributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringAttributeValue_Value()
  {
    return (EAttribute)stringAttributeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNFRAttributeValue()
  {
    return nfrAttributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNFRAttributeValue_Value()
  {
    return (EReference)nfrAttributeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMathOperator()
  {
    return mathOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogicalOperator()
  {
    return logicalOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQueryOperator()
  {
    return queryOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModelDSLFactory getAdaptationModelDSLFactory()
  {
    return (AdaptationModelDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    adaptationModelEClass = createEClass(ADAPTATION_MODEL);
    createEReference(adaptationModelEClass, ADAPTATION_MODEL__IMPORTS);
    createEAttribute(adaptationModelEClass, ADAPTATION_MODEL__NAME);
    createEAttribute(adaptationModelEClass, ADAPTATION_MODEL__PERIOD);
    createEReference(adaptationModelEClass, ADAPTATION_MODEL__ADAPTATION_RULES);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    adaptationRuleEClass = createEClass(ADAPTATION_RULE);
    createEAttribute(adaptationRuleEClass, ADAPTATION_RULE__NAME);

    atomicRuleEClass = createEClass(ATOMIC_RULE);
    createEReference(atomicRuleEClass, ATOMIC_RULE__RULE_BODY);

    ruleSetEClass = createEClass(RULE_SET);
    createEReference(ruleSetEClass, RULE_SET__ATOMIC_RULES);

    atomicRuleWithPriorityEClass = createEClass(ATOMIC_RULE_WITH_PRIORITY);
    createEAttribute(atomicRuleWithPriorityEClass, ATOMIC_RULE_WITH_PRIORITY__NAME);
    createEAttribute(atomicRuleWithPriorityEClass, ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE);
    createEReference(atomicRuleWithPriorityEClass, ATOMIC_RULE_WITH_PRIORITY__RULE_BODY);

    atomicActionEClass = createEClass(ATOMIC_ACTION);
    createEReference(atomicActionEClass, ATOMIC_ACTION__SECOND_ACTION);

    ruleBodyEClass = createEClass(RULE_BODY);
    createEReference(ruleBodyEClass, RULE_BODY__ATOMIC_ACTION);

    pureActionEClass = createEClass(PURE_ACTION);

    conditionActionEClass = createEClass(CONDITION_ACTION);
    createEReference(conditionActionEClass, CONDITION_ACTION__CONDITION);
    createEReference(conditionActionEClass, CONDITION_ACTION__ELSE);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__MEASUREMENT);
    createEAttribute(conditionEClass, CONDITION__OPERATOR);
    createEAttribute(conditionEClass, CONDITION__VALUE);
    createEAttribute(conditionEClass, CONDITION__LOGICAL_OP);
    createEReference(conditionEClass, CONDITION__SECOND_TERM);

    atomicActionSelectFeatureEClass = createEClass(ATOMIC_ACTION_SELECT_FEATURE);
    createEReference(atomicActionSelectFeatureEClass, ATOMIC_ACTION_SELECT_FEATURE__FEATURE);

    atomicActionDeselectFeatureEClass = createEClass(ATOMIC_ACTION_DESELECT_FEATURE);
    createEReference(atomicActionDeselectFeatureEClass, ATOMIC_ACTION_DESELECT_FEATURE__FEATURE);

    atomicActionModifyAttributeEClass = createEClass(ATOMIC_ACTION_MODIFY_ATTRIBUTE);
    createEReference(atomicActionModifyAttributeEClass, ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE);
    createEReference(atomicActionModifyAttributeEClass, ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE);

    atomicActionQueryEClass = createEClass(ATOMIC_ACTION_QUERY);
    createEReference(atomicActionQueryEClass, ATOMIC_ACTION_QUERY__FEATURE);
    createEAttribute(atomicActionQueryEClass, ATOMIC_ACTION_QUERY__QUERY_OPERATOR);
    createEAttribute(atomicActionQueryEClass, ATOMIC_ACTION_QUERY__VALUE);

    attributeValueEClass = createEClass(ATTRIBUTE_VALUE);

    stringAttributeValueEClass = createEClass(STRING_ATTRIBUTE_VALUE);
    createEAttribute(stringAttributeValueEClass, STRING_ATTRIBUTE_VALUE__VALUE);

    nfrAttributeValueEClass = createEClass(NFR_ATTRIBUTE_VALUE);
    createEReference(nfrAttributeValueEClass, NFR_ATTRIBUTE_VALUE__VALUE);

    // Create enums
    mathOperatorEEnum = createEEnum(MATH_OPERATOR);
    logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
    queryOperatorEEnum = createEEnum(QUERY_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CDMModelPackage theCDMModelPackage = (CDMModelPackage)EPackage.Registry.INSTANCE.getEPackage(CDMModelPackage.eNS_URI);
    featuremodelsPackage thefeaturemodelsPackage = (featuremodelsPackage)EPackage.Registry.INSTANCE.getEPackage(featuremodelsPackage.eNS_URI);
    RuntimeFeatureModelPackage theRuntimeFeatureModelPackage = (RuntimeFeatureModelPackage)EPackage.Registry.INSTANCE.getEPackage(RuntimeFeatureModelPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    atomicRuleEClass.getESuperTypes().add(this.getAdaptationRule());
    ruleSetEClass.getESuperTypes().add(this.getAdaptationRule());
    pureActionEClass.getESuperTypes().add(this.getRuleBody());
    conditionActionEClass.getESuperTypes().add(this.getRuleBody());
    atomicActionSelectFeatureEClass.getESuperTypes().add(this.getAtomicAction());
    atomicActionDeselectFeatureEClass.getESuperTypes().add(this.getAtomicAction());
    atomicActionModifyAttributeEClass.getESuperTypes().add(this.getAtomicAction());
    atomicActionQueryEClass.getESuperTypes().add(this.getAtomicAction());
    stringAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());
    nfrAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());

    // Initialize classes and features; add operations and parameters
    initEClass(adaptationModelEClass, AdaptationModel.class, "AdaptationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdaptationModel_Imports(), this.getImport(), null, "imports", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdaptationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdaptationModel_Period(), ecorePackage.getEInt(), "period", null, 0, 1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdaptationModel_AdaptationRules(), this.getAdaptationRule(), null, "adaptationRules", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adaptationRuleEClass, AdaptationRule.class, "AdaptationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdaptationRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdaptationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicRuleEClass, AtomicRule.class, "AtomicRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicRule_RuleBody(), this.getRuleBody(), null, "ruleBody", null, 0, 1, AtomicRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleSet_AtomicRules(), this.getAtomicRuleWithPriority(), null, "atomicRules", null, 0, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicRuleWithPriorityEClass, AtomicRuleWithPriority.class, "AtomicRuleWithPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtomicRuleWithPriority_Name(), ecorePackage.getEString(), "name", null, 0, 1, AtomicRuleWithPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtomicRuleWithPriority_PriorityValue(), ecorePackage.getEInt(), "priorityValue", null, 0, 1, AtomicRuleWithPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicRuleWithPriority_RuleBody(), this.getRuleBody(), null, "ruleBody", null, 0, 1, AtomicRuleWithPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicActionEClass, AtomicAction.class, "AtomicAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicAction_SecondAction(), this.getAtomicAction(), null, "secondAction", null, 0, 1, AtomicAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleBodyEClass, RuleBody.class, "RuleBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleBody_AtomicAction(), this.getAtomicAction(), null, "atomicAction", null, 0, 1, RuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pureActionEClass, PureAction.class, "PureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionActionEClass, ConditionAction.class, "ConditionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionAction_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionAction_Else(), this.getRuleBody(), null, "else", null, 0, 1, ConditionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_Measurement(), theCDMModelPackage.getContextDependentMeasurement(), null, "measurement", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Operator(), this.getMathOperator(), "operator", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_LogicalOp(), this.getLogicalOperator(), "logicalOp", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_SecondTerm(), this.getCondition(), null, "secondTerm", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicActionSelectFeatureEClass, AtomicActionSelectFeature.class, "AtomicActionSelectFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicActionSelectFeature_Feature(), thefeaturemodelsPackage.getFeature(), null, "feature", null, 0, 1, AtomicActionSelectFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicActionDeselectFeatureEClass, AtomicActionDeselectFeature.class, "AtomicActionDeselectFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicActionDeselectFeature_Feature(), thefeaturemodelsPackage.getFeature(), null, "feature", null, 0, 1, AtomicActionDeselectFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicActionModifyAttributeEClass, AtomicActionModifyAttribute.class, "AtomicActionModifyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicActionModifyAttribute_FeatureAttribute(), theRuntimeFeatureModelPackage.getCVAttribute(), null, "featureAttribute", null, 0, 1, AtomicActionModifyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicActionModifyAttribute_AttributeValue(), this.getAttributeValue(), null, "attributeValue", null, 0, -1, AtomicActionModifyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicActionQueryEClass, AtomicActionQuery.class, "AtomicActionQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicActionQuery_Feature(), thefeaturemodelsPackage.getFeature(), null, "feature", null, 0, 1, AtomicActionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtomicActionQuery_QueryOperator(), this.getQueryOperator(), "queryOperator", null, 0, 1, AtomicActionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtomicActionQuery_Value(), ecorePackage.getEString(), "value", null, 0, 1, AtomicActionQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringAttributeValueEClass, StringAttributeValue.class, "StringAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringAttributeValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nfrAttributeValueEClass, NFRAttributeValue.class, "NFRAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNFRAttributeValue_Value(), theRuntimeFeatureModelPackage.getNFRAttribute(), null, "value", null, 0, 1, NFRAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(mathOperatorEEnum, MathOperator.class, "MathOperator");
    addEEnumLiteral(mathOperatorEEnum, MathOperator.LESS);
    addEEnumLiteral(mathOperatorEEnum, MathOperator.GREATER);
    addEEnumLiteral(mathOperatorEEnum, MathOperator.EQUAL);
    addEEnumLiteral(mathOperatorEEnum, MathOperator.DIFFERENT);

    initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
    addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
    addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);

    initEEnum(queryOperatorEEnum, QueryOperator.class, "QueryOperator");
    addEEnumLiteral(queryOperatorEEnum, QueryOperator.MAX);
    addEEnumLiteral(queryOperatorEEnum, QueryOperator.MIN);
    addEEnumLiteral(queryOperatorEEnum, QueryOperator.IS);

    // Create resource
    createResource(eNS_URI);
  }

} //AdaptationModelDSLPackageImpl
