/**
 */
package org.rra.adaptationModel.adaptationModelDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.rra.adaptationModel.adaptationModelDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage
 * @generated
 */
public class AdaptationModelDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdaptationModelDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdaptationModelDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AdaptationModelDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdaptationModelDSLSwitch<Adapter> modelSwitch =
    new AdaptationModelDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseAdaptationModel(AdaptationModel object)
      {
        return createAdaptationModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseMATH_OPERATOR(MATH_OPERATOR object)
      {
        return createMATH_OPERATORAdapter();
      }
      @Override
      public Adapter caseAVG(AVG object)
      {
        return createAVGAdapter();
      }
      @Override
      public Adapter caseMIN(MIN object)
      {
        return createMINAdapter();
      }
      @Override
      public Adapter caseMAX(MAX object)
      {
        return createMAXAdapter();
      }
      @Override
      public Adapter caseAtomicAction(AtomicAction object)
      {
        return createAtomicActionAdapter();
      }
      @Override
      public Adapter caseSelectAction(SelectAction object)
      {
        return createSelectActionAdapter();
      }
      @Override
      public Adapter caseDeselectAction(DeselectAction object)
      {
        return createDeselectActionAdapter();
      }
      @Override
      public Adapter caseModifyAttribute(ModifyAttribute object)
      {
        return createModifyAttributeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationModel <em>Adaptation Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationModel
   * @generated
   */
  public Adapter createAdaptationModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR <em>MATH OPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.MATH_OPERATOR
   * @generated
   */
  public Adapter createMATH_OPERATORAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AVG <em>AVG</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AVG
   * @generated
   */
  public Adapter createAVGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.MIN <em>MIN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.MIN
   * @generated
   */
  public Adapter createMINAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.MAX <em>MAX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.MAX
   * @generated
   */
  public Adapter createMAXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicAction <em>Atomic Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicAction
   * @generated
   */
  public Adapter createAtomicActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.SelectAction <em>Select Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.SelectAction
   * @generated
   */
  public Adapter createSelectActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.DeselectAction <em>Deselect Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.DeselectAction
   * @generated
   */
  public Adapter createDeselectActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute <em>Modify Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute
   * @generated
   */
  public Adapter createModifyAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AdaptationModelDSLAdapterFactory
