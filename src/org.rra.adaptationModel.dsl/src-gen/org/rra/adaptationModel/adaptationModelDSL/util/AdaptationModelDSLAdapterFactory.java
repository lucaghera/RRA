/**
 */
package org.rra.adaptationModel.adaptationModelDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicAction;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.AttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.ConditionAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.PureAction;
import org.rra.adaptationModel.adaptationModelDSL.RuleBody;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue;

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
      public Adapter caseAdaptationRule(AdaptationRule object)
      {
        return createAdaptationRuleAdapter();
      }
      @Override
      public Adapter caseAtomicRule(AtomicRule object)
      {
        return createAtomicRuleAdapter();
      }
      @Override
      public Adapter caseRuleSet(RuleSet object)
      {
        return createRuleSetAdapter();
      }
      @Override
      public Adapter caseAtomicRuleWithPriority(AtomicRuleWithPriority object)
      {
        return createAtomicRuleWithPriorityAdapter();
      }
      @Override
      public Adapter caseAtomicAction(AtomicAction object)
      {
        return createAtomicActionAdapter();
      }
      @Override
      public Adapter caseRuleBody(RuleBody object)
      {
        return createRuleBodyAdapter();
      }
      @Override
      public Adapter casePureAction(PureAction object)
      {
        return createPureActionAdapter();
      }
      @Override
      public Adapter caseConditionAction(ConditionAction object)
      {
        return createConditionActionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseAtomicActionSelectFeature(AtomicActionSelectFeature object)
      {
        return createAtomicActionSelectFeatureAdapter();
      }
      @Override
      public Adapter caseAtomicActionDeselectFeature(AtomicActionDeselectFeature object)
      {
        return createAtomicActionDeselectFeatureAdapter();
      }
      @Override
      public Adapter caseAtomicActionModifyAttribute(AtomicActionModifyAttribute object)
      {
        return createAtomicActionModifyAttributeAdapter();
      }
      @Override
      public Adapter caseAtomicActionQuery(AtomicActionQuery object)
      {
        return createAtomicActionQueryAdapter();
      }
      @Override
      public Adapter caseAttributeValue(AttributeValue object)
      {
        return createAttributeValueAdapter();
      }
      @Override
      public Adapter caseStringAttributeValue(StringAttributeValue object)
      {
        return createStringAttributeValueAdapter();
      }
      @Override
      public Adapter caseNFRAttributeValue(NFRAttributeValue object)
      {
        return createNFRAttributeValueAdapter();
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
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AdaptationRule <em>Adaptation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AdaptationRule
   * @generated
   */
  public Adapter createAdaptationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRule <em>Atomic Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRule
   * @generated
   */
  public Adapter createAtomicRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.RuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleSet
   * @generated
   */
  public Adapter createRuleSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority <em>Atomic Rule With Priority</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority
   * @generated
   */
  public Adapter createAtomicRuleWithPriorityAdapter()
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
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.RuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.RuleBody
   * @generated
   */
  public Adapter createRuleBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.PureAction <em>Pure Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.PureAction
   * @generated
   */
  public Adapter createPureActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.ConditionAction <em>Condition Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.ConditionAction
   * @generated
   */
  public Adapter createConditionActionAdapter()
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
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature <em>Atomic Action Select Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature
   * @generated
   */
  public Adapter createAtomicActionSelectFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature <em>Atomic Action Deselect Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature
   * @generated
   */
  public Adapter createAtomicActionDeselectFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute <em>Atomic Action Modify Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute
   * @generated
   */
  public Adapter createAtomicActionModifyAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery <em>Atomic Action Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery
   * @generated
   */
  public Adapter createAtomicActionQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.AttributeValue
   * @generated
   */
  public Adapter createAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue <em>String Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue
   * @generated
   */
  public Adapter createStringAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue <em>NFR Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue
   * @generated
   */
  public Adapter createNFRAttributeValueAdapter()
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
