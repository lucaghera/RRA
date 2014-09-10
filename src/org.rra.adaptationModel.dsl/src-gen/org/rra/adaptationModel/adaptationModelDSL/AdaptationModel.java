/**
 */
package org.rra.adaptationModel.adaptationModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hyperflex.featuremodels.FeatureModel;

import org.hyperflex.resolutionmodels.ResolutionModel;

import org.rra.cdmModel.ContextDependentMeasurementsModel;

import org.rra.dataTypesModel.DataTypesModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getTempalteSystemModel <em>Tempalte System Model</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getResolutionModel <em>Resolution Model</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getCdmModel <em>Cdm Model</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getDataTypesModel <em>Data Types Model</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getName <em>Name</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getAdaptationRules <em>Adaptation Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel()
 * @model
 * @generated
 */
public interface AdaptationModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Feature Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Model</em>' reference.
   * @see #setFeatureModel(FeatureModel)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_FeatureModel()
   * @model
   * @generated
   */
  FeatureModel getFeatureModel();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getFeatureModel <em>Feature Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Model</em>' reference.
   * @see #getFeatureModel()
   * @generated
   */
  void setFeatureModel(FeatureModel value);

  /**
   * Returns the value of the '<em><b>Tempalte System Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tempalte System Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tempalte System Model</em>' reference.
   * @see #setTempalteSystemModel(org.hyperflex.roscomponentmodel.System)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_TempalteSystemModel()
   * @model
   * @generated
   */
  org.hyperflex.roscomponentmodel.System getTempalteSystemModel();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getTempalteSystemModel <em>Tempalte System Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tempalte System Model</em>' reference.
   * @see #getTempalteSystemModel()
   * @generated
   */
  void setTempalteSystemModel(org.hyperflex.roscomponentmodel.System value);

  /**
   * Returns the value of the '<em><b>Resolution Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolution Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolution Model</em>' reference.
   * @see #setResolutionModel(ResolutionModel)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_ResolutionModel()
   * @model
   * @generated
   */
  ResolutionModel getResolutionModel();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getResolutionModel <em>Resolution Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolution Model</em>' reference.
   * @see #getResolutionModel()
   * @generated
   */
  void setResolutionModel(ResolutionModel value);

  /**
   * Returns the value of the '<em><b>Cdm Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cdm Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cdm Model</em>' reference.
   * @see #setCdmModel(ContextDependentMeasurementsModel)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_CdmModel()
   * @model
   * @generated
   */
  ContextDependentMeasurementsModel getCdmModel();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getCdmModel <em>Cdm Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cdm Model</em>' reference.
   * @see #getCdmModel()
   * @generated
   */
  void setCdmModel(ContextDependentMeasurementsModel value);

  /**
   * Returns the value of the '<em><b>Data Types Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Types Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types Model</em>' reference.
   * @see #setDataTypesModel(DataTypesModel)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_DataTypesModel()
   * @model
   * @generated
   */
  DataTypesModel getDataTypesModel();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getDataTypesModel <em>Data Types Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Types Model</em>' reference.
   * @see #getDataTypesModel()
   * @generated
   */
  void setDataTypesModel(DataTypesModel value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(int)
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_Period()
   * @model
   * @generated
   */
  int getPeriod();

  /**
   * Sets the value of the '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(int value);

  /**
   * Returns the value of the '<em><b>Adaptation Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.rra.adaptationModel.adaptationModelDSL.AdaptationRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adaptation Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adaptation Rules</em>' containment reference list.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage#getAdaptationModel_AdaptationRules()
   * @model containment="true"
   * @generated
   */
  EList<AdaptationRule> getAdaptationRules();

} // AdaptationModel
