/**
 */
package org.rra.adaptationModel.adaptationModelDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rra.adaptationModel.adaptationModelDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptationModelDSLFactoryImpl extends EFactoryImpl implements AdaptationModelDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdaptationModelDSLFactory init()
  {
    try
    {
      AdaptationModelDSLFactory theAdaptationModelDSLFactory = (AdaptationModelDSLFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptationModelDSLPackage.eNS_URI);
      if (theAdaptationModelDSLFactory != null)
      {
        return theAdaptationModelDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdaptationModelDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModelDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AdaptationModelDSLPackage.ADAPTATION_MODEL: return createAdaptationModel();
      case AdaptationModelDSLPackage.IMPORT: return createImport();
      case AdaptationModelDSLPackage.RULE: return createRule();
      case AdaptationModelDSLPackage.CONDITION: return createCondition();
      case AdaptationModelDSLPackage.MATH_OPERATOR: return createMATH_OPERATOR();
      case AdaptationModelDSLPackage.AVG: return createAVG();
      case AdaptationModelDSLPackage.MIN: return createMIN();
      case AdaptationModelDSLPackage.MAX: return createMAX();
      case AdaptationModelDSLPackage.ATOMIC_ACTION: return createAtomicAction();
      case AdaptationModelDSLPackage.SELECT_ACTION: return createSelectAction();
      case AdaptationModelDSLPackage.DESELECT_ACTION: return createDeselectAction();
      case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE: return createModifyAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModel createAdaptationModel()
  {
    AdaptationModelImpl adaptationModel = new AdaptationModelImpl();
    return adaptationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MATH_OPERATOR createMATH_OPERATOR()
  {
    MATH_OPERATORImpl matH_OPERATOR = new MATH_OPERATORImpl();
    return matH_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AVG createAVG()
  {
    AVGImpl avg = new AVGImpl();
    return avg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MIN createMIN()
  {
    MINImpl min = new MINImpl();
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MAX createMAX()
  {
    MAXImpl max = new MAXImpl();
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicAction createAtomicAction()
  {
    AtomicActionImpl atomicAction = new AtomicActionImpl();
    return atomicAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAction createSelectAction()
  {
    SelectActionImpl selectAction = new SelectActionImpl();
    return selectAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeselectAction createDeselectAction()
  {
    DeselectActionImpl deselectAction = new DeselectActionImpl();
    return deselectAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifyAttribute createModifyAttribute()
  {
    ModifyAttributeImpl modifyAttribute = new ModifyAttributeImpl();
    return modifyAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModelDSLPackage getAdaptationModelDSLPackage()
  {
    return (AdaptationModelDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdaptationModelDSLPackage getPackage()
  {
    return AdaptationModelDSLPackage.eINSTANCE;
  }

} //AdaptationModelDSLFactoryImpl
