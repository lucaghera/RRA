/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__PERIOD = 2;

  /**
   * The feature id for the '<em><b>Output Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__OUTPUT_PACKAGE = 3;

  /**
   * The feature id for the '<em><b>Adaptation Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL__ADAPTATION_RULES = 4;

  /**
   * The number of structural features of the '<em>Adaptation Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL_FEATURE_COUNT = 5;

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
   * The feature id for the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE__RULE_BODY = ADAPTATION_RULE_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Atomic Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__ATOMIC_RULES = ADAPTATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rule Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_FEATURE_COUNT = ADAPTATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleWithPriorityImpl <em>Atomic Rule With Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleWithPriorityImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicRuleWithPriority()
   * @generated
   */
  int ATOMIC_RULE_WITH_PRIORITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE_WITH_PRIORITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Priority Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE = 1;

  /**
   * The feature id for the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE_WITH_PRIORITY__RULE_BODY = 2;

  /**
   * The number of structural features of the '<em>Atomic Rule With Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RULE_WITH_PRIORITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicAction()
   * @generated
   */
  int ATOMIC_ACTION = 6;

  /**
   * The feature id for the '<em><b>Second Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION__SECOND_ACTION = 0;

  /**
   * The number of structural features of the '<em>Atomic Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleBodyImpl <em>Rule Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleBodyImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRuleBody()
   * @generated
   */
  int RULE_BODY = 7;

  /**
   * The feature id for the '<em><b>Atomic Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_BODY__ATOMIC_ACTION = 0;

  /**
   * The number of structural features of the '<em>Rule Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.PureActionImpl <em>Pure Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.PureActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getPureAction()
   * @generated
   */
  int PURE_ACTION = 8;

  /**
   * The feature id for the '<em><b>Atomic Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_ACTION__ATOMIC_ACTION = RULE_BODY__ATOMIC_ACTION;

  /**
   * The number of structural features of the '<em>Pure Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_ACTION_FEATURE_COUNT = RULE_BODY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionActionImpl <em>Condition Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getConditionAction()
   * @generated
   */
  int CONDITION_ACTION = 9;

  /**
   * The feature id for the '<em><b>Atomic Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION__ATOMIC_ACTION = RULE_BODY__ATOMIC_ACTION;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION__CONDITION = RULE_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION__ELSE = RULE_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Condition Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ACTION_FEATURE_COUNT = RULE_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 10;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__MEASUREMENT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 2;

  /**
   * The feature id for the '<em><b>Logical Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__LOGICAL_OP = 3;

  /**
   * The feature id for the '<em><b>Second Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__SECOND_TERM = 4;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionSelectFeatureImpl <em>Atomic Action Select Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionSelectFeatureImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionSelectFeature()
   * @generated
   */
  int ATOMIC_ACTION_SELECT_FEATURE = 11;

  /**
   * The feature id for the '<em><b>Second Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_SELECT_FEATURE__SECOND_ACTION = ATOMIC_ACTION__SECOND_ACTION;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_SELECT_FEATURE__FEATURE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atomic Action Select Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_SELECT_FEATURE_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionDeselectFeatureImpl <em>Atomic Action Deselect Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionDeselectFeatureImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionDeselectFeature()
   * @generated
   */
  int ATOMIC_ACTION_DESELECT_FEATURE = 12;

  /**
   * The feature id for the '<em><b>Second Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_DESELECT_FEATURE__SECOND_ACTION = ATOMIC_ACTION__SECOND_ACTION;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_DESELECT_FEATURE__FEATURE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atomic Action Deselect Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_DESELECT_FEATURE_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionModifyAttributeImpl <em>Atomic Action Modify Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionModifyAttributeImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionModifyAttribute()
   * @generated
   */
  int ATOMIC_ACTION_MODIFY_ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Second Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_MODIFY_ATTRIBUTE__SECOND_ACTION = ATOMIC_ACTION__SECOND_ACTION;

  /**
   * The feature id for the '<em><b>Feature Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atomic Action Modify Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_MODIFY_ATTRIBUTE_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionQueryImpl <em>Atomic Action Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionQueryImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionQuery()
   * @generated
   */
  int ATOMIC_ACTION_QUERY = 14;

  /**
   * The feature id for the '<em><b>Second Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_QUERY__SECOND_ACTION = ATOMIC_ACTION__SECOND_ACTION;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_QUERY__FEATURE = ATOMIC_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_QUERY__QUERY_OPERATOR = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_QUERY__VALUE = ATOMIC_ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Atomic Action Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_QUERY_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AttributeValueImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 15;

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
  int STRING_ATTRIBUTE_VALUE = 16;

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
  int NFR_ATTRIBUTE_VALUE = 17;

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
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.MathOperator <em>Math Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.MathOperator
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMathOperator()
   * @generated
   */
  int MATH_OPERATOR = 18;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.LogicalOperator <em>Logical Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.LogicalOperator
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getLogicalOperator()
   * @generated
   */
  int LOGICAL_OPERATOR = 19;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.QueryOperator <em>Query Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.QueryOperator
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getQueryOperator()
   * @generated
   */
  int QUERY_OPERATOR = 20;


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
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Period</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getPeriod()
   * @see #getAdaptationModel()
   * @generated
   */
  EAttribute getAdaptationModel_Period();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getOutputPackage <em>Output Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Package</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getOutputPackage()
   * @see #getAdaptationModel()
   * @generated
   */
  EAttribute getAdaptationModel_OutputPackage();

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
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRule#getRuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule Body</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRule#getRuleBody()
   * @see #getAtomicRule()
   * @generated
   */
  EReference getAtomicRule_RuleBody();

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
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet#getAtomicRules <em>Atomic Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atomic Rules</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleSet#getAtomicRules()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_AtomicRules();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority <em>Atomic Rule With Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Rule With Priority</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority
   * @generated
   */
  EClass getAtomicRuleWithPriority();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getName()
   * @see #getAtomicRuleWithPriority()
   * @generated
   */
  EAttribute getAtomicRuleWithPriority_Name();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getPriorityValue <em>Priority Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getPriorityValue()
   * @see #getAtomicRuleWithPriority()
   * @generated
   */
  EAttribute getAtomicRuleWithPriority_PriorityValue();

  /**
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getRuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule Body</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority#getRuleBody()
   * @see #getAtomicRuleWithPriority()
   * @generated
   */
  EReference getAtomicRuleWithPriority_RuleBody();

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
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicAction#getSecondAction <em>Second Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicAction#getSecondAction()
   * @see #getAtomicAction()
   * @generated
   */
  EReference getAtomicAction_SecondAction();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.RuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Body</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleBody
   * @generated
   */
  EClass getRuleBody();

  /**
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.RuleBody#getAtomicAction <em>Atomic Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atomic Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleBody#getAtomicAction()
   * @see #getRuleBody()
   * @generated
   */
  EReference getRuleBody_AtomicAction();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.PureAction <em>Pure Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pure Action</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.PureAction
   * @generated
   */
  EClass getPureAction();

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
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ConditionAction#getCondition()
   * @see #getConditionAction()
   * @generated
   */
  EReference getConditionAction_Condition();

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
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Measurement</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition#getMeasurement()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Measurement();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getLogicalOp <em>Logical Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logical Op</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition#getLogicalOp()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_LogicalOp();

  /**
   * Returns the meta object for the containment reference '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getSecondTerm <em>Second Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Term</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition#getSecondTerm()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_SecondTerm();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature <em>Atomic Action Select Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Action Select Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature
   * @generated
   */
  EClass getAtomicActionSelectFeature();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature#getFeature()
   * @see #getAtomicActionSelectFeature()
   * @generated
   */
  EReference getAtomicActionSelectFeature_Feature();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature <em>Atomic Action Deselect Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Action Deselect Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature
   * @generated
   */
  EClass getAtomicActionDeselectFeature();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature#getFeature()
   * @see #getAtomicActionDeselectFeature()
   * @generated
   */
  EReference getAtomicActionDeselectFeature_Feature();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute <em>Atomic Action Modify Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Action Modify Attribute</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute
   * @generated
   */
  EClass getAtomicActionModifyAttribute();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute#getFeatureAttribute <em>Feature Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature Attribute</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute#getFeatureAttribute()
   * @see #getAtomicActionModifyAttribute()
   * @generated
   */
  EReference getAtomicActionModifyAttribute_FeatureAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute#getAttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute#getAttributeValue()
   * @see #getAtomicActionModifyAttribute()
   * @generated
   */
  EReference getAtomicActionModifyAttribute_AttributeValue();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery <em>Atomic Action Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Action Query</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery
   * @generated
   */
  EClass getAtomicActionQuery();

  /**
   * Returns the meta object for the reference '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery#getFeature()
   * @see #getAtomicActionQuery()
   * @generated
   */
  EReference getAtomicActionQuery_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery#getQueryOperator <em>Query Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query Operator</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery#getQueryOperator()
   * @see #getAtomicActionQuery()
   * @generated
   */
  EAttribute getAtomicActionQuery_QueryOperator();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery#getValue()
   * @see #getAtomicActionQuery()
   * @generated
   */
  EAttribute getAtomicActionQuery_Value();

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
   * Returns the meta object for enum '{@link org.rra.adaptationModel.adaptationModelDSL.MathOperator <em>Math Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Math Operator</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MathOperator
   * @generated
   */
  EEnum getMathOperator();

  /**
   * Returns the meta object for enum '{@link org.rra.adaptationModel.adaptationModelDSL.LogicalOperator <em>Logical Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logical Operator</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.LogicalOperator
   * @generated
   */
  EEnum getLogicalOperator();

  /**
   * Returns the meta object for enum '{@link org.rra.adaptationModel.adaptationModelDSL.QueryOperator <em>Query Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Query Operator</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.QueryOperator
   * @generated
   */
  EEnum getQueryOperator();

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
     * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADAPTATION_MODEL__PERIOD = eINSTANCE.getAdaptationModel_Period();

    /**
     * The meta object literal for the '<em><b>Output Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADAPTATION_MODEL__OUTPUT_PACKAGE = eINSTANCE.getAdaptationModel_OutputPackage();

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
     * The meta object literal for the '<em><b>Rule Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_RULE__RULE_BODY = eINSTANCE.getAtomicRule_RuleBody();

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
     * The meta object literal for the '<em><b>Atomic Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__ATOMIC_RULES = eINSTANCE.getRuleSet_AtomicRules();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleWithPriorityImpl <em>Atomic Rule With Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicRuleWithPriorityImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicRuleWithPriority()
     * @generated
     */
    EClass ATOMIC_RULE_WITH_PRIORITY = eINSTANCE.getAtomicRuleWithPriority();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_RULE_WITH_PRIORITY__NAME = eINSTANCE.getAtomicRuleWithPriority_Name();

    /**
     * The meta object literal for the '<em><b>Priority Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE = eINSTANCE.getAtomicRuleWithPriority_PriorityValue();

    /**
     * The meta object literal for the '<em><b>Rule Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_RULE_WITH_PRIORITY__RULE_BODY = eINSTANCE.getAtomicRuleWithPriority_RuleBody();

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
     * The meta object literal for the '<em><b>Second Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_ACTION__SECOND_ACTION = eINSTANCE.getAtomicAction_SecondAction();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.RuleBodyImpl <em>Rule Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.RuleBodyImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getRuleBody()
     * @generated
     */
    EClass RULE_BODY = eINSTANCE.getRuleBody();

    /**
     * The meta object literal for the '<em><b>Atomic Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_BODY__ATOMIC_ACTION = eINSTANCE.getRuleBody_AtomicAction();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.PureActionImpl <em>Pure Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.PureActionImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getPureAction()
     * @generated
     */
    EClass PURE_ACTION = eINSTANCE.getPureAction();

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
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ACTION__CONDITION = eINSTANCE.getConditionAction_Condition();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ACTION__ELSE = eINSTANCE.getConditionAction_Else();

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
     * The meta object literal for the '<em><b>Measurement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__MEASUREMENT = eINSTANCE.getCondition_Measurement();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

    /**
     * The meta object literal for the '<em><b>Logical Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__LOGICAL_OP = eINSTANCE.getCondition_LogicalOp();

    /**
     * The meta object literal for the '<em><b>Second Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__SECOND_TERM = eINSTANCE.getCondition_SecondTerm();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionSelectFeatureImpl <em>Atomic Action Select Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionSelectFeatureImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionSelectFeature()
     * @generated
     */
    EClass ATOMIC_ACTION_SELECT_FEATURE = eINSTANCE.getAtomicActionSelectFeature();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_ACTION_SELECT_FEATURE__FEATURE = eINSTANCE.getAtomicActionSelectFeature_Feature();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionDeselectFeatureImpl <em>Atomic Action Deselect Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionDeselectFeatureImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionDeselectFeature()
     * @generated
     */
    EClass ATOMIC_ACTION_DESELECT_FEATURE = eINSTANCE.getAtomicActionDeselectFeature();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_ACTION_DESELECT_FEATURE__FEATURE = eINSTANCE.getAtomicActionDeselectFeature_Feature();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionModifyAttributeImpl <em>Atomic Action Modify Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionModifyAttributeImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionModifyAttribute()
     * @generated
     */
    EClass ATOMIC_ACTION_MODIFY_ATTRIBUTE = eINSTANCE.getAtomicActionModifyAttribute();

    /**
     * The meta object literal for the '<em><b>Feature Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_ACTION_MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE = eINSTANCE.getAtomicActionModifyAttribute_FeatureAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_ACTION_MODIFY_ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getAtomicActionModifyAttribute_AttributeValue();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionQueryImpl <em>Atomic Action Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionQueryImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicActionQuery()
     * @generated
     */
    EClass ATOMIC_ACTION_QUERY = eINSTANCE.getAtomicActionQuery();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_ACTION_QUERY__FEATURE = eINSTANCE.getAtomicActionQuery_Feature();

    /**
     * The meta object literal for the '<em><b>Query Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_ACTION_QUERY__QUERY_OPERATOR = eINSTANCE.getAtomicActionQuery_QueryOperator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_ACTION_QUERY__VALUE = eINSTANCE.getAtomicActionQuery_Value();

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

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.MathOperator <em>Math Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.MathOperator
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMathOperator()
     * @generated
     */
    EEnum MATH_OPERATOR = eINSTANCE.getMathOperator();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.LogicalOperator <em>Logical Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.LogicalOperator
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getLogicalOperator()
     * @generated
     */
    EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.QueryOperator <em>Query Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.QueryOperator
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getQueryOperator()
     * @generated
     */
    EEnum QUERY_OPERATOR = eINSTANCE.getQueryOperator();

  }

} //AdaptationModelDSLPackage
