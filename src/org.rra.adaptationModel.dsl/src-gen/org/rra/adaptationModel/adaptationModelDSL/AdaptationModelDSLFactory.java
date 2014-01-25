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
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>MATH OPERATOR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MATH OPERATOR</em>'.
   * @generated
   */
  MATH_OPERATOR createMATH_OPERATOR();

  /**
   * Returns a new object of class '<em>AVG</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AVG</em>'.
   * @generated
   */
  AVG createAVG();

  /**
   * Returns a new object of class '<em>MIN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MIN</em>'.
   * @generated
   */
  MIN createMIN();

  /**
   * Returns a new object of class '<em>MAX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MAX</em>'.
   * @generated
   */
  MAX createMAX();

  /**
   * Returns a new object of class '<em>Atomic Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Action</em>'.
   * @generated
   */
  AtomicAction createAtomicAction();

  /**
   * Returns a new object of class '<em>Select Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Action</em>'.
   * @generated
   */
  SelectAction createSelectAction();

  /**
   * Returns a new object of class '<em>Deselect Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deselect Action</em>'.
   * @generated
   */
  DeselectAction createDeselectAction();

  /**
   * Returns a new object of class '<em>Modify Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modify Attribute</em>'.
   * @generated
   */
  ModifyAttribute createModifyAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AdaptationModelDSLPackage getAdaptationModelDSLPackage();

} //AdaptationModelDSLFactory
