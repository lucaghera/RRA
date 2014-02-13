/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptationModelDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "adaptationModelDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rra.org/adaptationModel/AdaptationModelDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "adaptationModelDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdaptationModelDSLPackage eINSTANCE = org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl <em>Adaptation Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAdaptationModel()
   * @generated
   */
  int ADAPTATION_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__RULES = 1;

  /**
   * The feature id for the '<em><b>Rule Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__RULE_SETS = 2;

  /**
   * The number of structural features of the '<em>Adaptation Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ImportImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRule()
   * @generated
   */
  int RULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Atomic Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ATOMIC_ACTION = 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleWithPriorityImpl <em>Rule With Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleWithPriorityImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRuleWithPriority()
   * @generated
   */
  int RULE_WITH_PRIORITY = 3;

  /**
   * The feature id for the '<em><b>Priority Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PRIORITY__PRIORITY_VALUE = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PRIORITY__RULE = 1;

  /**
   * The number of structural features of the '<em>Rule With Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_WITH_PRIORITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleSetImpl <em>Rule Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleSetImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRuleSet()
   * @generated
   */
  int RULE_SET = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__NAME = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__RULES = 1;

  /**
   * The number of structural features of the '<em>Rule Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 5;

  /**
   * The feature id for the '<em><b>Measurement Comparison</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__MEASUREMENT_COMPARISON = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl <em>Measurement Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMeasurementComparison()
   * @generated
   */
  int MEASUREMENT_COMPARISON = 6;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON__MEASUREMENT = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON__VALUE = 1;

  /**
   * The number of structural features of the '<em>Measurement Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicAction()
   * @generated
   */
  int ATOMIC_ACTION = 7;

  /**
   * The number of structural features of the '<em>Atomic Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.QueryActionImpl <em>Query Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.QueryActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getQueryAction()
   * @generated
   */
  int QUERY_ACTION = 8;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ACTION__FEATURE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ACTION__VALUE = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Query Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.SelectActionImpl <em>Select Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.SelectActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getSelectAction()
   * @generated
   */
  int SELECT_ACTION = 9;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ACTION__FEATURE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.DeselectActionImpl <em>Deselect Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.DeselectActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getDeselectAction()
   * @generated
   */
  int DESELECT_ACTION = 10;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESELECT_ACTION__FEATURE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Deselect Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESELECT_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ModifyAttributeImpl <em>Modify Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ModifyAttributeImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getModifyAttribute()
   * @generated
   */
  int MODIFY_ATTRIBUTE = 11;

  /**
   * The feature id for the '<em><b>Feature Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Modify Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_ATTRIBUTE_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AttributeValueImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 12;

  /**
   * The number of structural features of the '<em>Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.StringAttributeValueImpl <em>String Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.StringAttributeValueImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getStringAttributeValue()
   * @generated
   */
  int STRING_ATTRIBUTE_VALUE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTRIBUTE_VALUE__VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ATTRIBUTE_VALUE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.NFRAttributeValueImpl <em>NFR Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.NFRAttributeValueImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getNFRAttributeValue()
   * @generated
   */
  int NFR_ATTRIBUTE_VALUE = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_ATTRIBUTE_VALUE__VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NFR Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NFR_ATTRIBUTE_VALUE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel <em>Adaptation Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adaptation Model</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel
   * @generated
   */
  EClass getAdaptationModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getImports()
   * @see #getAdaptationModel()
   * @generated
   */
  EReference getAdaptationModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getRules()
   * @see #getAdaptationModel()
   * @generated
   */
  EReference getAdaptationModel_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getRuleSets <em>Rule Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule Sets</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getRuleSets()
   * @see #getAdaptationModel()
   * @generated
   */
  EReference getAdaptationModel_RuleSets();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.Rule#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Rule#getCondition()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.Rule#getAtomicAction <em>Atomic Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atomic Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Rule#getAtomicAction()
   * @see #getRule()
   * @generated
   */
  EReference getRule_AtomicAction();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority <em>Rule With Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule With Priority</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority
   * @generated
   */
  EClass getRuleWithPriority();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority#getPriorityValue <em>Priority Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority#getPriorityValue()
   * @see #getRuleWithPriority()
   * @generated
   */
  EAttribute getRuleWithPriority_PriorityValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority#getRule()
   * @see #getRuleWithPriority()
   * @generated
   */
  EReference getRuleWithPriority_Rule();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Set</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleSet
   * @generated
   */
  EClass getRuleSet();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleSet#getName()
   * @see #getRuleSet()
   * @generated
   */
  EAttribute getRuleSet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleSet#getRules()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Rules();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurementComparison <em>Measurement Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Measurement Comparison</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurementComparison()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_MeasurementComparison();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison <em>Measurement Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement Comparison</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison
   * @generated
   */
  EClass getMeasurementComparison();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getMeasurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Measurement</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getMeasurement()
   * @see #getMeasurementComparison()
   * @generated
   */
  EReference getMeasurementComparison_Measurement();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getValue()
   * @see #getMeasurementComparison()
   * @generated
   */
  EAttribute getMeasurementComparison_Value();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicAction <em>Atomic Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicAction
   * @generated
   */
  EClass getAtomicAction();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.QueryAction <em>Query Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.QueryAction
   * @generated
   */
  EClass getQueryAction();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.QueryAction#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.QueryAction#getFeature()
   * @see #getQueryAction()
   * @generated
   */
  EReference getQueryAction_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.QueryAction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.QueryAction#getValue()
   * @see #getQueryAction()
   * @generated
   */
  EAttribute getQueryAction_Value();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.SelectAction <em>Select Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.SelectAction
   * @generated
   */
  EClass getSelectAction();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.SelectAction#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.SelectAction#getFeature()
   * @see #getSelectAction()
   * @generated
   */
  EReference getSelectAction_Feature();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.DeselectAction <em>Deselect Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deselect Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.DeselectAction
   * @generated
   */
  EClass getDeselectAction();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.DeselectAction#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.DeselectAction#getFeature()
   * @see #getDeselectAction()
   * @generated
   */
  EReference getDeselectAction_Feature();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute <em>Modify Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modify Attribute</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute
   * @generated
   */
  EClass getModifyAttribute();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getFeatureAttribute <em>Feature Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature Attribute</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getFeatureAttribute()
   * @see #getModifyAttribute()
   * @generated
   */
  EReference getModifyAttribute_FeatureAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getAttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getAttributeValue()
   * @see #getModifyAttribute()
   * @generated
   */
  EReference getModifyAttribute_AttributeValue();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AttributeValue
   * @generated
   */
  EClass getAttributeValue();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue <em>String Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Attribute Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue
   * @generated
   */
  EClass getStringAttributeValue();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue#getValue()
   * @see #getStringAttributeValue()
   * @generated
   */
  EAttribute getStringAttributeValue_Value();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue <em>NFR Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NFR Attribute Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue
   * @generated
   */
  EClass getNFRAttributeValue();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue#getValue()
   * @see #getNFRAttributeValue()
   * @generated
   */
  EReference getNFRAttributeValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AdaptationModelDSLFactory getAdaptationModelDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl <em>Adaptation Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAdaptationModel()
     * @generated
     */
    EClass ADAPTATION_MODEL = eINSTANCE.getAdaptationModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADAPTATION_MODEL__IMPORTS = eINSTANCE.getAdaptationModel_Imports();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADAPTATION_MODEL__RULES = eINSTANCE.getAdaptationModel_Rules();

    /**
     * The meta object literal for the '<em><b>Rule Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADAPTATION_MODEL__RULE_SETS = eINSTANCE.getAdaptationModel_RuleSets();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.ImportImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

    /**
     * The meta object literal for the '<em><b>Atomic Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ATOMIC_ACTION = eINSTANCE.getRule_AtomicAction();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleWithPriorityImpl <em>Rule With Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleWithPriorityImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRuleWithPriority()
     * @generated
     */
    EClass RULE_WITH_PRIORITY = eINSTANCE.getRuleWithPriority();

    /**
     * The meta object literal for the '<em><b>Priority Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_WITH_PRIORITY__PRIORITY_VALUE = eINSTANCE.getRuleWithPriority_PriorityValue();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_WITH_PRIORITY__RULE = eINSTANCE.getRuleWithPriority_Rule();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleSetImpl <em>Rule Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleSetImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRuleSet()
     * @generated
     */
    EClass RULE_SET = eINSTANCE.getRuleSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_SET__NAME = eINSTANCE.getRuleSet_Name();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__RULES = eINSTANCE.getRuleSet_Rules();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Measurement Comparison</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__MEASUREMENT_COMPARISON = eINSTANCE.getCondition_MeasurementComparison();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl <em>Measurement Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.MeasurementComparisonImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMeasurementComparison()
     * @generated
     */
    EClass MEASUREMENT_COMPARISON = eINSTANCE.getMeasurementComparison();

    /**
     * The meta object literal for the '<em><b>Measurement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASUREMENT_COMPARISON__MEASUREMENT = eINSTANCE.getMeasurementComparison_Measurement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT_COMPARISON__VALUE = eINSTANCE.getMeasurementComparison_Value();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicAction()
     * @generated
     */
    EClass ATOMIC_ACTION = eINSTANCE.getAtomicAction();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.QueryActionImpl <em>Query Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.QueryActionImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getQueryAction()
     * @generated
     */
    EClass QUERY_ACTION = eINSTANCE.getQueryAction();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_ACTION__FEATURE = eINSTANCE.getQueryAction_Feature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_ACTION__VALUE = eINSTANCE.getQueryAction_Value();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.SelectActionImpl <em>Select Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.SelectActionImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getSelectAction()
     * @generated
     */
    EClass SELECT_ACTION = eINSTANCE.getSelectAction();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_ACTION__FEATURE = eINSTANCE.getSelectAction_Feature();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.DeselectActionImpl <em>Deselect Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.DeselectActionImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getDeselectAction()
     * @generated
     */
    EClass DESELECT_ACTION = eINSTANCE.getDeselectAction();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESELECT_ACTION__FEATURE = eINSTANCE.getDeselectAction_Feature();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ModifyAttributeImpl <em>Modify Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.ModifyAttributeImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getModifyAttribute()
     * @generated
     */
    EClass MODIFY_ATTRIBUTE = eINSTANCE.getModifyAttribute();

    /**
     * The meta object literal for the '<em><b>Feature Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE = eINSTANCE.getModifyAttribute_FeatureAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getModifyAttribute_AttributeValue();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AttributeValueImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAttributeValue()
     * @generated
     */
    EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.StringAttributeValueImpl <em>String Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.StringAttributeValueImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getStringAttributeValue()
     * @generated
     */
    EClass STRING_ATTRIBUTE_VALUE = eINSTANCE.getStringAttributeValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ATTRIBUTE_VALUE__VALUE = eINSTANCE.getStringAttributeValue_Value();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.NFRAttributeValueImpl <em>NFR Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.NFRAttributeValueImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getNFRAttributeValue()
     * @generated
     */
    EClass NFR_ATTRIBUTE_VALUE = eINSTANCE.getNFRAttributeValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NFR_ATTRIBUTE_VALUE__VALUE = eINSTANCE.getNFRAttributeValue_Value();

  }

} //AdaptationModelDSLPackage
