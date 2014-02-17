package org.rra.adaptationModel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.ConditionAction;
import org.rra.adaptationModel.adaptationModelDSL.DeselectAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison;
import org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.QueryAction;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.adaptationModel.adaptationModelDSL.SelectAction;
import org.rra.adaptationModel.adaptationModelDSL.StringAttributeValue;
import org.rra.adaptationModel.services.AdaptationModelDSLGrammarAccess;

@SuppressWarnings("all")
public class AdaptationModelDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AdaptationModelDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AdaptationModelDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AdaptationModelDSLPackage.ADAPTATION_MODEL:
				if(context == grammarAccess.getAdaptationModelRule()) {
					sequence_AdaptationModel(context, (AdaptationModel) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.ATOMIC_ACTION_WITH_PRIORITY:
				if(context == grammarAccess.getAtomicActionWithPriorityRule()) {
					sequence_AtomicActionWithPriority(context, (AtomicActionWithPriority) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.ATOMIC_RULE:
				if(context == grammarAccess.getAdaptationRuleRule() ||
				   context == grammarAccess.getAtomicRuleRule()) {
					sequence_AtomicRule(context, (AtomicRule) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.CONDITION_ACTION:
				if(context == grammarAccess.getConditionActionRule()) {
					sequence_ConditionAction(context, (ConditionAction) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.DESELECT_ACTION:
				if(context == grammarAccess.getAtomicActionRule() ||
				   context == grammarAccess.getDeselectActionRule()) {
					sequence_DeselectAction(context, (DeselectAction) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.MEASUREMENT_COMPARISON:
				if(context == grammarAccess.getMeasurementComparisonRule()) {
					sequence_MeasurementComparison(context, (MeasurementComparison) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.MODIFY_ATTRIBUTE:
				if(context == grammarAccess.getAtomicActionRule() ||
				   context == grammarAccess.getModifyAttributeRule()) {
					sequence_ModifyAttribute(context, (ModifyAttribute) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.NFR_ATTRIBUTE_VALUE:
				if(context == grammarAccess.getAttributeValueRule() ||
				   context == grammarAccess.getNFRAttributeValueRule()) {
					sequence_NFRAttributeValue(context, (NFRAttributeValue) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.QUERY_ACTION:
				if(context == grammarAccess.getAtomicActionRule() ||
				   context == grammarAccess.getQueryActionRule()) {
					sequence_QueryAction(context, (QueryAction) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.RULE_SET:
				if(context == grammarAccess.getAdaptationRuleRule() ||
				   context == grammarAccess.getRuleSetRule()) {
					sequence_RuleSet(context, (RuleSet) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.SELECT_ACTION:
				if(context == grammarAccess.getAtomicActionRule() ||
				   context == grammarAccess.getSelectActionRule()) {
					sequence_SelectAction(context, (SelectAction) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.STRING_ATTRIBUTE_VALUE:
				if(context == grammarAccess.getAttributeValueRule() ||
				   context == grammarAccess.getStringAttributeValueRule()) {
					sequence_StringAttributeValue(context, (StringAttributeValue) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (imports+=Import* name=QualifiedName frequency=INT adaptationRules+=AdaptationRule*)
	 */
	protected void sequence_AdaptationModel(EObject context, AdaptationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (priorityValue=INT atomicAction+=AtomicAction*)
	 */
	protected void sequence_AtomicActionWithPriority(EObject context, AtomicActionWithPriority semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID conditionAction+=ConditionAction)
	 */
	protected void sequence_AtomicRule(EObject context, AtomicRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition+=Condition* atomicActions+=AtomicAction+ else=ConditionAction?)
	 */
	protected void sequence_ConditionAction(EObject context, ConditionAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     measurementComparison=MeasurementComparison
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.CONDITION__MEASUREMENT_COMPARISON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.CONDITION__MEASUREMENT_COMPARISON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getMeasurementComparisonMeasurementComparisonParserRuleCall_0(), semanticObject.getMeasurementComparison());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Feature|QualifiedName]
	 */
	protected void sequence_DeselectAction(EObject context, DeselectAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.DESELECT_ACTION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.DESELECT_ACTION__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeselectActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_2_0_1(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         measurement=[ContextDependentMeasurement|QualifiedName] 
	 *         operator=OPERATOR 
	 *         value=STRING 
	 *         (logicalOp=LOGICAL_OPERATOR secondTerm=MeasurementComparison)?
	 *     )
	 */
	protected void sequence_MeasurementComparison(EObject context, MeasurementComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureAttribute=[CVAttribute|QualifiedName] attributeValue+=AttributeValue)
	 */
	protected void sequence_ModifyAttribute(EObject context, ModifyAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[NFRAttribute|QualifiedName]
	 */
	protected void sequence_NFRAttributeValue(EObject context, NFRAttributeValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.NFR_ATTRIBUTE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.NFR_ATTRIBUTE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNFRAttributeValueAccess().getValueNFRAttributeQualifiedNameParserRuleCall_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[Feature|QualifiedName] value=STRING)
	 */
	protected void sequence_QueryAction(EObject context, QueryAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.QUERY_ACTION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.QUERY_ACTION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.QUERY_ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.QUERY_ACTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQueryActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_3_0_1(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getQueryActionAccess().getValueSTRINGTerminalRuleCall_8_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID condition+=Condition* actions+=AtomicActionWithPriority+ (condition+=Condition* actions+=AtomicActionWithPriority+)*)
	 */
	protected void sequence_RuleSet(EObject context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Feature|QualifiedName]
	 */
	protected void sequence_SelectAction(EObject context, SelectAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.SELECT_ACTION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.SELECT_ACTION__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectActionAccess().getFeatureFeatureQualifiedNameParserRuleCall_2_0_1(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringAttributeValue(EObject context, StringAttributeValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.STRING_ATTRIBUTE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.STRING_ATTRIBUTE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringAttributeValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}
