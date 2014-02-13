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
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.DeselectAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.MeasurementComparison;
import org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.QueryAction;
import org.rra.adaptationModel.adaptationModelDSL.Rule;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
import org.rra.adaptationModel.adaptationModelDSL.RuleWithPriority;
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
			case AdaptationModelDSLPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
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
			case AdaptationModelDSLPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.RULE_SET:
				if(context == grammarAccess.getRuleSetRule()) {
					sequence_RuleSet(context, (RuleSet) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.RULE_WITH_PRIORITY:
				if(context == grammarAccess.getRuleWithPriorityRule()) {
					sequence_RuleWithPriority(context, (RuleWithPriority) semanticObject); 
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
	 *     (imports+=Import* rules+=Rule* ruleSets+=RuleSet*)
	 */
	protected void sequence_AdaptationModel(EObject context, AdaptationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     measurementComparison+=MeasurementComparison
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (measurement=[ContextDependentMeasurement|QualifiedName] value=STRING)
	 */
	protected void sequence_MeasurementComparison(EObject context, MeasurementComparison semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.MEASUREMENT_COMPARISON__MEASUREMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.MEASUREMENT_COMPARISON__MEASUREMENT));
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.MEASUREMENT_COMPARISON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.MEASUREMENT_COMPARISON__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMeasurementComparisonAccess().getMeasurementContextDependentMeasurementQualifiedNameParserRuleCall_0_0_1(), semanticObject.getMeasurement());
		feeder.accept(grammarAccess.getMeasurementComparisonAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (name=ID rules+=RuleWithPriority*)
	 */
	protected void sequence_RuleSet(EObject context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (priorityValue=INT rule+=Rule)
	 */
	protected void sequence_RuleWithPriority(EObject context, RuleWithPriority semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID condition+=Condition* atomicAction+=AtomicAction+ (condition+=Condition* atomicAction+=AtomicAction+)*)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
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
