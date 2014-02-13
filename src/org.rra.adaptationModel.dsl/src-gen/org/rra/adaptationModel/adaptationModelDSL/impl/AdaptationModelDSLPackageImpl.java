/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hyperflex.featuremodels.featuremodelsPackage;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLFactory;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.AttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.DeselectAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison;
import org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.QueryAction;
import org.rra.adaptationModel.adaptationModelDSL.Rule;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.SelectAction;
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
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleWithPriorityEClass = null;

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
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass measurementComparisonEClass = null;

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
  private EClass queryActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deselectActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifyAttributeEClass = null;

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
  public EReference getAdaptationModel_Rules()
  {
    return (EReference)adaptationModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdaptationModel_RuleSets()
  {
    return (EReference)adaptationModelEClass.getEStructuralFeatures().get(2);
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
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Name()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Condition()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_AtomicAction()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleWithPriority()
  {
    return ruleWithPriorityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleWithPriority_PriorityValue()
  {
    return (EAttribute)ruleWithPriorityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleWithPriority_Rule()
  {
    return (EReference)ruleWithPriorityEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getRuleSet_Name()
  {
    return (EAttribute)ruleSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSet_Rules()
  {
    return (EReference)ruleSetEClass.getEStructuralFeatures().get(1);
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
  public EReference getCondition_MeasurementComparison()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeasurementComparison()
  {
    return measurementComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeasurementComparison_Measurement()
  {
    return (EReference)measurementComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurementComparison_Value()
  {
    return (EAttribute)measurementComparisonEClass.getEStructuralFeatures().get(1);
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
  public EClass getQueryAction()
  {
    return queryActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryAction_Feature()
  {
    return (EReference)queryActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryAction_Value()
  {
    return (EAttribute)queryActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectAction()
  {
    return selectActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectAction_Feature()
  {
    return (EReference)selectActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeselectAction()
  {
    return deselectActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeselectAction_Feature()
  {
    return (EReference)deselectActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifyAttribute()
  {
    return modifyAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifyAttribute_FeatureAttribute()
  {
    return (EReference)modifyAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifyAttribute_AttributeValue()
  {
    return (EReference)modifyAttributeEClass.getEStructuralFeatures().get(1);
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
    createEReference(adaptationModelEClass, ADAPTATION_MODEL__RULES);
    createEReference(adaptationModelEClass, ADAPTATION_MODEL__RULE_SETS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__CONDITION);
    createEReference(ruleEClass, RULE__ATOMIC_ACTION);

    ruleWithPriorityEClass = createEClass(RULE_WITH_PRIORITY);
    createEAttribute(ruleWithPriorityEClass, RULE_WITH_PRIORITY__PRIORITY_VALUE);
    createEReference(ruleWithPriorityEClass, RULE_WITH_PRIORITY__RULE);

    ruleSetEClass = createEClass(RULE_SET);
    createEAttribute(ruleSetEClass, RULE_SET__NAME);
    createEReference(ruleSetEClass, RULE_SET__RULES);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__MEASUREMENT_COMPARISON);

    measurementComparisonEClass = createEClass(MEASUREMENT_COMPARISON);
    createEReference(measurementComparisonEClass, MEASUREMENT_COMPARISON__MEASUREMENT);
    createEAttribute(measurementComparisonEClass, MEASUREMENT_COMPARISON__VALUE);

    atomicActionEClass = createEClass(ATOMIC_ACTION);

    queryActionEClass = createEClass(QUERY_ACTION);
    createEReference(queryActionEClass, QUERY_ACTION__FEATURE);
    createEAttribute(queryActionEClass, QUERY_ACTION__VALUE);

    selectActionEClass = createEClass(SELECT_ACTION);
    createEReference(selectActionEClass, SELECT_ACTION__FEATURE);

    deselectActionEClass = createEClass(DESELECT_ACTION);
    createEReference(deselectActionEClass, DESELECT_ACTION__FEATURE);

    modifyAttributeEClass = createEClass(MODIFY_ATTRIBUTE);
    createEReference(modifyAttributeEClass, MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE);
    createEReference(modifyAttributeEClass, MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE);

    attributeValueEClass = createEClass(ATTRIBUTE_VALUE);

    stringAttributeValueEClass = createEClass(STRING_ATTRIBUTE_VALUE);
    createEAttribute(stringAttributeValueEClass, STRING_ATTRIBUTE_VALUE__VALUE);

    nfrAttributeValueEClass = createEClass(NFR_ATTRIBUTE_VALUE);
    createEReference(nfrAttributeValueEClass, NFR_ATTRIBUTE_VALUE__VALUE);
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
    queryActionEClass.getESuperTypes().add(this.getAtomicAction());
    selectActionEClass.getESuperTypes().add(this.getAtomicAction());
    deselectActionEClass.getESuperTypes().add(this.getAtomicAction());
    modifyAttributeEClass.getESuperTypes().add(this.getAtomicAction());
    stringAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());
    nfrAttributeValueEClass.getESuperTypes().add(this.getAttributeValue());

    // Initialize classes and features; add operations and parameters
    initEClass(adaptationModelEClass, AdaptationModel.class, "AdaptationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdaptationModel_Imports(), this.getImport(), null, "imports", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdaptationModel_Rules(), this.getRule(), null, "rules", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdaptationModel_RuleSets(), this.getRuleSet(), null, "ruleSets", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Condition(), this.getCondition(), null, "condition", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_AtomicAction(), this.getAtomicAction(), null, "atomicAction", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleWithPriorityEClass, RuleWithPriority.class, "RuleWithPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuleWithPriority_PriorityValue(), ecorePackage.getEInt(), "priorityValue", null, 0, 1, RuleWithPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleWithPriority_Rule(), this.getRule(), null, "rule", null, 0, -1, RuleWithPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuleSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleSet_Rules(), this.getRuleWithPriority(), null, "rules", null, 0, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_MeasurementComparison(), this.getMeasurementComparison(), null, "measurementComparison", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measurementComparisonEClass, MeasurementComparison.class, "MeasurementComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMeasurementComparison_Measurement(), theCDMModelPackage.getContextDependentMeasurement(), null, "measurement", null, 0, 1, MeasurementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasurementComparison_Value(), ecorePackage.getEString(), "value", null, 0, 1, MeasurementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicActionEClass, AtomicAction.class, "AtomicAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(queryActionEClass, QueryAction.class, "QueryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQueryAction_Feature(), thefeaturemodelsPackage.getFeature(), null, "feature", null, 0, 1, QueryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQueryAction_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectActionEClass, SelectAction.class, "SelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectAction_Feature(), thefeaturemodelsPackage.getFeature(), null, "feature", null, 0, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deselectActionEClass, DeselectAction.class, "DeselectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeselectAction_Feature(), thefeaturemodelsPackage.getFeature(), null, "feature", null, 0, 1, DeselectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifyAttributeEClass, ModifyAttribute.class, "ModifyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModifyAttribute_FeatureAttribute(), theRuntimeFeatureModelPackage.getCVAttribute(), null, "featureAttribute", null, 0, 1, ModifyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModifyAttribute_AttributeValue(), this.getAttributeValue(), null, "attributeValue", null, 0, -1, ModifyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringAttributeValueEClass, StringAttributeValue.class, "StringAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringAttributeValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nfrAttributeValueEClass, NFRAttributeValue.class, "NFRAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNFRAttributeValue_Value(), theRuntimeFeatureModelPackage.getNFRAttribute(), null, "value", null, 0, 1, NFRAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AdaptationModelDSLPackageImpl
