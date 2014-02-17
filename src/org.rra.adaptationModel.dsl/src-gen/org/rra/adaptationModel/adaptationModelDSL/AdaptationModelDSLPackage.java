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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__NAME = 1;

  /**
   * The feature id for the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__FREQUENCY = 2;

  /**
   * The feature id for the '<em><b>Adaptation Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__ADAPTATION_RULES = 3;

  /**
   * The number of structural features of the '<em>Adaptation Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL_FEATURE_COUNT = 4;

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
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationRuleImpl <em>Adaptation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationRuleImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAdaptationRule()
   * @generated
   */
  int ADAPTATION_RULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_RULE__NAME = 0;

  /**
   * The number of structural features of the '<em>Adaptation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleImpl <em>Atomic Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicRule()
   * @generated
   */
  int ATOMIC_RULE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE__NAME = ADAPTATION_RULE__NAME;

  /**
   * The feature id for the '<em><b>Condition Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE__CONDITION_ACTION = ADAPTATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atomic Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE_FEATURE_COUNT = ADAPTATION_RULE_FEATURE_COUNT + 1;

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
  int RULE_SET__NAME = ADAPTATION_RULE__NAME;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__CONDITION = ADAPTATION_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__ACTIONS = ADAPTATION_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_FEATURE_COUNT = ADAPTATION_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicAction()
   * @generated
   */
  int ATOMIC_ACTION = 5;

  /**
   * The number of structural features of the '<em>Atomic Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionActionImpl <em>Condition Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getConditionAction()
   * @generated
   */
  int CONDITION_ACTION = 6;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Atomic Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION__ATOMIC_ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION__ELSE = 2;

  /**
   * The number of structural features of the '<em>Condition Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionWithPriorityImpl <em>Atomic Action With Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionWithPriorityImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionWithPriority()
   * @generated
   */
  int ATOMIC_ACTION_WITH_PRIORITY = 7;

  /**
   * The feature id for the '<em><b>Priority Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_WITH_PRIORITY__PRIORITY_VALUE = 0;

  /**
   * The feature id for the '<em><b>Atomic Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION = 1;

  /**
   * The number of structural features of the '<em>Atomic Action With Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_WITH_PRIORITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Measurement Comparison</b></em>' containment reference.
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
  int MEASUREMENT_COMPARISON = 9;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON__MEASUREMENT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON__VALUE = 2;

  /**
   * The feature id for the '<em><b>Logical Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON__LOGICAL_OP = 3;

  /**
   * The feature id for the '<em><b>Second Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON__SECOND_TERM = 4;

  /**
   * The number of structural features of the '<em>Measurement Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_COMPARISON_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.QueryActionImpl <em>Query Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.QueryActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getQueryAction()
   * @generated
   */
  int QUERY_ACTION = 10;

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
  int SELECT_ACTION = 11;

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
  int DESELECT_ACTION = 12;

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
  int MODIFY_ATTRIBUTE = 13;

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
  int ATTRIBUTE_VALUE = 14;

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
  int STRING_ATTRIBUTE_VALUE = 15;

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
  int NFR_ATTRIBUTE_VALUE = 16;

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
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getName()
   * @see #getAdaptationModel()
   * @generated
   */
  EAttribute getAdaptationModel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getFrequency <em>Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frequency</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getFrequency()
   * @see #getAdaptationModel()
   * @generated
   */
  EAttribute getAdaptationModel_Frequency();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getAdaptationRules <em>Adaptation Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Adaptation Rules</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getAdaptationRules()
   * @see #getAdaptationModel()
   * @generated
   */
  EReference getAdaptationModel_AdaptationRules();

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
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationRule <em>Adaptation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Adaptation Rule</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationRule
   * @generated
   */
  EClass getAdaptationRule();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationRule#getName()
   * @see #getAdaptationRule()
   * @generated
   */
  EAttribute getAdaptationRule_Name();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRule <em>Atomic Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Rule</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRule
   * @generated
   */
  EClass getAtomicRule();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRule#getConditionAction <em>Condition Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRule#getConditionAction()
   * @see #getAtomicRule()
   * @generated
   */
  EReference getAtomicRule_ConditionAction();

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
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleSet#getCondition()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleSet#getActions()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Actions();

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
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction <em>Condition Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ConditionAction
   * @generated
   */
  EClass getConditionAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getCondition()
   * @see #getConditionAction()
   * @generated
   */
  EReference getConditionAction_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getAtomicActions <em>Atomic Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atomic Actions</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getAtomicActions()
   * @see #getConditionAction()
   * @generated
   */
  EReference getConditionAction_AtomicActions();

  /**
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getElse()
   * @see #getConditionAction()
   * @generated
   */
  EReference getConditionAction_Else();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority <em>Atomic Action With Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Action With Priority</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority
   * @generated
   */
  EClass getAtomicActionWithPriority();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority#getPriorityValue <em>Priority Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority#getPriorityValue()
   * @see #getAtomicActionWithPriority()
   * @generated
   */
  EAttribute getAtomicActionWithPriority_PriorityValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority#getAtomicAction <em>Atomic Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atomic Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority#getAtomicAction()
   * @see #getAtomicActionWithPriority()
   * @generated
   */
  EReference getAtomicActionWithPriority_AtomicAction();

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
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurementComparison <em>Measurement Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Measurement Comparison</em>'.
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
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getOperator()
   * @see #getMeasurementComparison()
   * @generated
   */
  EAttribute getMeasurementComparison_Operator();

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
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getLogicalOp <em>Logical Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logical Op</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getLogicalOp()
   * @see #getMeasurementComparison()
   * @generated
   */
  EAttribute getMeasurementComparison_LogicalOp();

  /**
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getSecondTerm <em>Second Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Term</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison#getSecondTerm()
   * @see #getMeasurementComparison()
   * @generated
   */
  EReference getMeasurementComparison_SecondTerm();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADAPTATION_MODEL__NAME = eINSTANCE.getAdaptationModel_Name();

    /**
     * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADAPTATION_MODEL__FREQUENCY = eINSTANCE.getAdaptationModel_Frequency();

    /**
     * The meta object literal for the '<em><b>Adaptation Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADAPTATION_MODEL__ADAPTATION_RULES = eINSTANCE.getAdaptationModel_AdaptationRules();

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
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationRuleImpl <em>Adaptation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationRuleImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAdaptationRule()
     * @generated
     */
    EClass ADAPTATION_RULE = eINSTANCE.getAdaptationRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADAPTATION_RULE__NAME = eINSTANCE.getAdaptationRule_Name();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleImpl <em>Atomic Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicRule()
     * @generated
     */
    EClass ATOMIC_RULE = eINSTANCE.getAtomicRule();

    /**
     * The meta object literal for the '<em><b>Condition Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_RULE__CONDITION_ACTION = eINSTANCE.getAtomicRule_ConditionAction();

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
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__CONDITION = eINSTANCE.getRuleSet_Condition();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__ACTIONS = eINSTANCE.getRuleSet_Actions();

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
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionActionImpl <em>Condition Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionActionImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getConditionAction()
     * @generated
     */
    EClass CONDITION_ACTION = eINSTANCE.getConditionAction();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ACTION__CONDITION = eINSTANCE.getConditionAction_Condition();

    /**
     * The meta object literal for the '<em><b>Atomic Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ACTION__ATOMIC_ACTIONS = eINSTANCE.getConditionAction_AtomicActions();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ACTION__ELSE = eINSTANCE.getConditionAction_Else();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionWithPriorityImpl <em>Atomic Action With Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionWithPriorityImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionWithPriority()
     * @generated
     */
    EClass ATOMIC_ACTION_WITH_PRIORITY = eINSTANCE.getAtomicActionWithPriority();

    /**
     * The meta object literal for the '<em><b>Priority Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_ACTION_WITH_PRIORITY__PRIORITY_VALUE = eINSTANCE.getAtomicActionWithPriority_PriorityValue();

    /**
     * The meta object literal for the '<em><b>Atomic Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_ACTION_WITH_PRIORITY__ATOMIC_ACTION = eINSTANCE.getAtomicActionWithPriority_AtomicAction();

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
     * The meta object literal for the '<em><b>Measurement Comparison</b></em>' containment reference feature.
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
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT_COMPARISON__OPERATOR = eINSTANCE.getMeasurementComparison_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT_COMPARISON__VALUE = eINSTANCE.getMeasurementComparison_Value();

    /**
     * The meta object literal for the '<em><b>Logical Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT_COMPARISON__LOGICAL_OP = eINSTANCE.getMeasurementComparison_LogicalOp();

    /**
     * The meta object literal for the '<em><b>Second Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASUREMENT_COMPARISON__SECOND_TERM = eINSTANCE.getMeasurementComparison_SecondTerm();

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
