/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage
 * @generated
 */
public interface AdaptationModelDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdaptationModelDSLFactory eINSTANCE = org.rra.adaptationModel.adaptationModelDSL.impl.AdaptationModelDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Adaptation Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adaptation Model</em>'.
   * @generated
   */
  AdaptationModel createAdaptationModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Adaptation Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Adaptation Rule</em>'.
   * @generated
   */
  AdaptationRule createAdaptationRule();

  /**
   * Returns a new object of class '<em>Atomic Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Rule</em>'.
   * @generated
   */
  AtomicRule createAtomicRule();

  /**
   * Returns a new object of class '<em>Rule Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Set</em>'.
   * @generated
   */
  RuleSet createRuleSet();

  /**
   * Returns a new object of class '<em>Atomic Rule With Priority</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Rule With Priority</em>'.
   * @generated
   */
  AtomicRuleWithPriority createAtomicRuleWithPriority();

  /**
   * Returns a new object of class '<em>Atomic Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Action</em>'.
   * @generated
   */
  AtomicAction createAtomicAction();

  /**
   * Returns a new object of class '<em>Rule Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Body</em>'.
   * @generated
   */
  RuleBody createRuleBody();

  /**
   * Returns a new object of class '<em>Pure Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pure Action</em>'.
   * @generated
   */
  PureAction createPureAction();

  /**
   * Returns a new object of class '<em>Condition Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Action</em>'.
   * @generated
   */
  ConditionAction createConditionAction();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Atomic Action Select Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Action Select Feature</em>'.
   * @generated
   */
  AtomicActionSelectFeature createAtomicActionSelectFeature();

  /**
   * Returns a new object of class '<em>Atomic Action Deselect Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Action Deselect Feature</em>'.
   * @generated
   */
  AtomicActionDeselectFeature createAtomicActionDeselectFeature();

  /**
   * Returns a new object of class '<em>Atomic Action Modify Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Action Modify Attribute</em>'.
   * @generated
   */
  AtomicActionModifyAttribute createAtomicActionModifyAttribute();

  /**
   * Returns a new object of class '<em>Atomic Action Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Action Query</em>'.
   * @generated
   */
  AtomicActionQuery createAtomicActionQuery();

  /**
   * Returns a new object of class '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Value</em>'.
   * @generated
   */
  AttributeValue createAttributeValue();

  /**
   * Returns a new object of class '<em>String Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Attribute Value</em>'.
   * @generated
   */
  StringAttributeValue createStringAttributeValue();

  /**
   * Returns a new object of class '<em>NFR Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NFR Attribute Value</em>'.
   * @generated
   */
  NFRAttributeValue createNFRAttributeValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AdaptationModelDSLPackage getAdaptationModelDSLPackage();

} //AdaptationModelDSLFactory
