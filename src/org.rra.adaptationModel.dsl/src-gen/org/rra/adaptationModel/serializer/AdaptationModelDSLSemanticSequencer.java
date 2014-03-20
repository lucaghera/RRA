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
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionDeselectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionQuery;
import org.rra.adaptationModel.adaptationModelDSL.AtomicActionSelectFeature;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRule;
import org.rra.adaptationModel.adaptationModelDSL.AtomicRuleWithPriority;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.ConditionAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.NFRAttributeValue;
import org.rra.adaptationModel.adaptationModelDSL.PureAction;
import org.rra.adaptationModel.adaptationModelDSL.RuleSet;
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
			case AdaptationModelDSLPackage.ATOMIC_ACTION_DESELECT_FEATURE:
				if(context == grammarAccess.getAtomicActionDeselectFeatureRule()) {
					sequence_AtomicActionDeselectFeature(context, (AtomicActionDeselectFeature) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAtomicActionRule()) {
					sequence_AtomicAction_AtomicActionDeselectFeature(context, (AtomicActionDeselectFeature) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.ATOMIC_ACTION_MODIFY_ATTRIBUTE:
				if(context == grammarAccess.getAtomicActionModifyAttributeRule()) {
					sequence_AtomicActionModifyAttribute(context, (AtomicActionModifyAttribute) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAtomicActionRule()) {
					sequence_AtomicAction_AtomicActionModifyAttribute(context, (AtomicActionModifyAttribute) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.ATOMIC_ACTION_QUERY:
				if(context == grammarAccess.getAtomicActionQueryRule()) {
					sequence_AtomicActionQuery(context, (AtomicActionQuery) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAtomicActionRule()) {
					sequence_AtomicAction_AtomicActionQuery(context, (AtomicActionQuery) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.ATOMIC_ACTION_SELECT_FEATURE:
				if(context == grammarAccess.getAtomicActionSelectFeatureRule()) {
					sequence_AtomicActionSelectFeature(context, (AtomicActionSelectFeature) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAtomicActionRule()) {
					sequence_AtomicAction_AtomicActionSelectFeature(context, (AtomicActionSelectFeature) semanticObject); 
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
			case AdaptationModelDSLPackage.ATOMIC_RULE_WITH_PRIORITY:
				if(context == grammarAccess.getAtomicRuleWithPriorityRule()) {
					sequence_AtomicRuleWithPriority(context, (AtomicRuleWithPriority) semanticObject); 
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
				if(context == grammarAccess.getConditionActionRule() ||
				   context == grammarAccess.getRuleBodyRule()) {
					sequence_ConditionAction(context, (ConditionAction) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
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
			case AdaptationModelDSLPackage.PURE_ACTION:
				if(context == grammarAccess.getPureActionRule() ||
				   context == grammarAccess.getRuleBodyRule()) {
					sequence_PureAction(context, (PureAction) semanticObject); 
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
	 *     (imports+=Import* name=ID period=INT outputPackage=QualifiedName adaptationRules+=AdaptationRule*)
	 */
	protected void sequence_AdaptationModel(EObject context, AdaptationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Feature|QualifiedName]
	 */
	protected void sequence_AtomicActionDeselectFeature(EObject context, AtomicActionDeselectFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureAttribute=[CVAttribute|QualifiedName] attributeValue+=AttributeValue)
	 */
	protected void sequence_AtomicActionModifyAttribute(EObject context, AtomicActionModifyAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[Feature|QualifiedName] queryOperator=QueryOperator value=STRING)
	 */
	protected void sequence_AtomicActionQuery(EObject context, AtomicActionQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Feature|QualifiedName]
	 */
	protected void sequence_AtomicActionSelectFeature(EObject context, AtomicActionSelectFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[Feature|QualifiedName] secondAction=AtomicAction?)
	 */
	protected void sequence_AtomicAction_AtomicActionDeselectFeature(EObject context, AtomicActionDeselectFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureAttribute=[CVAttribute|QualifiedName] attributeValue+=AttributeValue secondAction=AtomicAction?)
	 */
	protected void sequence_AtomicAction_AtomicActionModifyAttribute(EObject context, AtomicActionModifyAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[Feature|QualifiedName] queryOperator=QueryOperator value=STRING secondAction=AtomicAction?)
	 */
	protected void sequence_AtomicAction_AtomicActionQuery(EObject context, AtomicActionQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=[Feature|QualifiedName] secondAction=AtomicAction?)
	 */
	protected void sequence_AtomicAction_AtomicActionSelectFeature(EObject context, AtomicActionSelectFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID priorityValue=INT ruleBody=RuleBody)
	 */
	protected void sequence_AtomicRuleWithPriority(EObject context, AtomicRuleWithPriority semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE_WITH_PRIORITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE_WITH_PRIORITY__NAME));
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE_WITH_PRIORITY__PRIORITY_VALUE));
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE_WITH_PRIORITY__RULE_BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicRuleWithPriorityAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAtomicRuleWithPriorityAccess().getPriorityValueINTTerminalRuleCall_3_0(), semanticObject.getPriorityValue());
		feeder.accept(grammarAccess.getAtomicRuleWithPriorityAccess().getRuleBodyRuleBodyParserRuleCall_5_0(), semanticObject.getRuleBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ruleBody=RuleBody)
	 */
	protected void sequence_AtomicRule(EObject context, AtomicRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.ADAPTATION_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.ADAPTATION_RULE__NAME));
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE__RULE_BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.ATOMIC_RULE__RULE_BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAtomicRuleAccess().getRuleBodyRuleBodyParserRuleCall_3_0(), semanticObject.getRuleBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Condition atomicAction=AtomicAction else=RuleBody?)
	 */
	protected void sequence_ConditionAction(EObject context, ConditionAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (measurement=[ContextDependentMeasurement|QualifiedName] operator=MathOperator value=STRING (logicalOp=LogicalOperator secondTerm=Condition)?)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     atomicAction=AtomicAction
	 */
	protected void sequence_PureAction(EObject context, PureAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.RULE_BODY__ATOMIC_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.RULE_BODY__ATOMIC_ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPureActionAccess().getAtomicActionAtomicActionParserRuleCall_0(), semanticObject.getAtomicAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID atomicRules+=AtomicRuleWithPriority+)
	 */
	protected void sequence_RuleSet(EObject context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
