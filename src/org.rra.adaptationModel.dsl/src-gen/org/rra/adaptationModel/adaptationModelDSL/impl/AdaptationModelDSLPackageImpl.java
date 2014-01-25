/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLFactory;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.DeselectAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.Rule;
import org.rra.adaptationModel.adaptationModelDSL.SelectAction;

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
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matH_OPERATOREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxEClass = null;

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
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_Name()
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
  public EReference getCondition_Meas()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMATH_OPERATOR()
  {
    return matH_OPERATOREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMATH_OPERATOR_Measurement()
  {
    return (EReference)matH_OPERATOREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAVG()
  {
    return avgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMIN()
  {
    return minEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMAX()
  {
    return maxEClass;
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
  public EAttribute getModifyAttribute_Value()
  {
    return (EAttribute)modifyAttributeEClass.getEStructuralFeatures().get(1);
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

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__NAME);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__CONDITION);
    createEReference(ruleEClass, RULE__ATOMIC_ACTION);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__MEASUREMENT);
    createEReference(conditionEClass, CONDITION__MEAS);

    matH_OPERATOREClass = createEClass(MATH_OPERATOR);
    createEReference(matH_OPERATOREClass, MATH_OPERATOR__MEASUREMENT);

    avgEClass = createEClass(AVG);

    minEClass = createEClass(MIN);

    maxEClass = createEClass(MAX);

    atomicActionEClass = createEClass(ATOMIC_ACTION);

    selectActionEClass = createEClass(SELECT_ACTION);
    createEReference(selectActionEClass, SELECT_ACTION__FEATURE);

    deselectActionEClass = createEClass(DESELECT_ACTION);
    createEReference(deselectActionEClass, DESELECT_ACTION__FEATURE);

    modifyAttributeEClass = createEClass(MODIFY_ATTRIBUTE);
    createEReference(modifyAttributeEClass, MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE);
    createEAttribute(modifyAttributeEClass, MODIFY_ATTRIBUTE__VALUE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    avgEClass.getESuperTypes().add(this.getMATH_OPERATOR());
    minEClass.getESuperTypes().add(this.getMATH_OPERATOR());
    maxEClass.getESuperTypes().add(this.getMATH_OPERATOR());
    selectActionEClass.getESuperTypes().add(this.getAtomicAction());
    deselectActionEClass.getESuperTypes().add(this.getAtomicAction());
    modifyAttributeEClass.getESuperTypes().add(this.getAtomicAction());

    // Initialize classes and features; add operations and parameters
    initEClass(adaptationModelEClass, AdaptationModel.class, "AdaptationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdaptationModel_Imports(), this.getImport(), null, "imports", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdaptationModel_Rules(), this.getRule(), null, "rules", null, 0, -1, AdaptationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Condition(), this.getCondition(), null, "condition", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_AtomicAction(), this.getAtomicAction(), null, "atomicAction", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_Measurement(), this.getImport(), null, "measurement", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Meas(), this.getImport(), null, "meas", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matH_OPERATOREClass, org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR.class, "MATH_OPERATOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMATH_OPERATOR_Measurement(), this.getImport(), null, "measurement", null, 0, -1, org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(avgEClass, org.rra.adaptationModel.adaptationModelDSL.AVG.class, "AVG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minEClass, org.rra.adaptationModel.adaptationModelDSL.MIN.class, "MIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maxEClass, org.rra.adaptationModel.adaptationModelDSL.MAX.class, "MAX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomicActionEClass, AtomicAction.class, "AtomicAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectActionEClass, SelectAction.class, "SelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectAction_Feature(), this.getImport(), null, "feature", null, 0, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deselectActionEClass, DeselectAction.class, "DeselectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeselectAction_Feature(), this.getImport(), null, "feature", null, 0, 1, DeselectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifyAttributeEClass, ModifyAttribute.class, "ModifyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModifyAttribute_FeatureAttribute(), this.getImport(), null, "featureAttribute", null, 0, 1, ModifyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModifyAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, ModifyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AdaptationModelDSLPackageImpl
