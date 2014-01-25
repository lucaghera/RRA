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
   * The number of structural features of the '<em>Adaptation Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTATION_MODEL_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 0;

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
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.ConditionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 3;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__MEASUREMENT = 0;

  /**
   * The feature id for the '<em><b>Meas</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__MEAS = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MATH_OPERATORImpl <em>MATH OPERATOR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.MATH_OPERATORImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMATH_OPERATOR()
   * @generated
   */
  int MATH_OPERATOR = 4;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_OPERATOR__MEASUREMENT = 0;

  /**
   * The number of structural features of the '<em>MATH OPERATOR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AVGImpl <em>AVG</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AVGImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAVG()
   * @generated
   */
  int AVG = 5;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG__MEASUREMENT = MATH_OPERATOR__MEASUREMENT;

  /**
   * The number of structural features of the '<em>AVG</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_FEATURE_COUNT = MATH_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MINImpl <em>MIN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.MINImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMIN()
   * @generated
   */
  int MIN = 6;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN__MEASUREMENT = MATH_OPERATOR__MEASUREMENT;

  /**
   * The number of structural features of the '<em>MIN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_FEATURE_COUNT = MATH_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MAXImpl <em>MAX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.MAXImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMAX()
   * @generated
   */
  int MAX = 7;

  /**
   * The feature id for the '<em><b>Measurement</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX__MEASUREMENT = MATH_OPERATOR__MEASUREMENT;

  /**
   * The number of structural features of the '<em>MAX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_FEATURE_COUNT = MATH_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AtomicActionImpl
   * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAtomicAction()
   * @generated
   */
  int ATOMIC_ACTION = 8;

  /**
   * The number of structural features of the '<em>Atomic Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_ACTION_FEATURE_COUNT = 0;

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
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_ATTRIBUTE__VALUE = ATOMIC_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Modify Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_ATTRIBUTE_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 2;


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
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

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
   * Returns the meta object for the reference list '{@link org.rra.adaptationModel.adaptationModelDSL.Condition#getMeas <em>Meas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Meas</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition#getMeas()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Meas();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR <em>MATH OPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MATH OPERATOR</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR
   * @generated
   */
  EClass getMATH_OPERATOR();

  /**
   * Returns the meta object for the reference list '{@link org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR#getMeasurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Measurement</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR#getMeasurement()
   * @see #getMATH_OPERATOR()
   * @generated
   */
  EReference getMATH_OPERATOR_Measurement();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.AVG <em>AVG</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AVG</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.AVG
   * @generated
   */
  EClass getAVG();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.MIN <em>MIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MIN</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MIN
   * @generated
   */
  EClass getMIN();

  /**
   * Returns the meta object for class '{@link org.rra.adaptationModel.adaptationModelDSL.MAX <em>MAX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MAX</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.MAX
   * @generated
   */
  EClass getMAX();

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
   * Returns the meta object for the attribute '{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute#getValue()
   * @see #getModifyAttribute()
   * @generated
   */
  EAttribute getModifyAttribute_Value();

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
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.ImportImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

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
     * The meta object literal for the '<em><b>Meas</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__MEAS = eINSTANCE.getCondition_Meas();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MATH_OPERATORImpl <em>MATH OPERATOR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.MATH_OPERATORImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMATH_OPERATOR()
     * @generated
     */
    EClass MATH_OPERATOR = eINSTANCE.getMATH_OPERATOR();

    /**
     * The meta object literal for the '<em><b>Measurement</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_OPERATOR__MEASUREMENT = eINSTANCE.getMATH_OPERATOR_Measurement();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.AVGImpl <em>AVG</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AVGImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getAVG()
     * @generated
     */
    EClass AVG = eINSTANCE.getAVG();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MINImpl <em>MIN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.MINImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMIN()
     * @generated
     */
    EClass MIN = eINSTANCE.getMIN();

    /**
     * The meta object literal for the '{@link org.rra.adaptationModel.adaptationModelDSL.impl.MAXImpl <em>MAX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.MAXImpl
     * @see org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLPackageImpl#getMAX()
     * @generated
     */
    EClass MAX = eINSTANCE.getMAX();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFY_ATTRIBUTE__VALUE = eINSTANCE.getModifyAttribute_Value();

  }

} //AdaptationModelDSLPackage
