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
import org.rra.adaptationModel.adaptationModelDSL.AVG;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModel;
import org.rra.adaptationModel.adaptationModelDSL.AdaptationModelDSLPackage;
import org.rra.adaptationModel.adaptationModelDSL.Condition;
import org.rra.adaptationModel.adaptationModelDSL.DeselectAction;
import org.rra.adaptationModel.adaptationModelDSL.Import;
import org.rra.adaptationModel.adaptationModelDSL.MAX;
import org.rra.adaptationModel.adaptationModelDSL.MIN;
import org.rra.adaptationModel.adaptationModelDSL.ModifyAttribute;
import org.rra.adaptationModel.adaptationModelDSL.Rule;
import org.rra.adaptationModel.adaptationModelDSL.SelectAction;
import org.rra.adaptationModel.services.AdaptationModelDSLGrammarAccess;

@SuppressWarnings("all")
public class AdaptationModelDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AdaptationModelDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AdaptationModelDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AdaptationModelDSLPackage.AVG:
				if(context == grammarAccess.getAVGRule() ||
				   context == grammarAccess.getMATH_OPERATORRule()) {
					sequence_AVG(context, (AVG) semanticObject); 
					return; 
				}
				else break;
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
			case AdaptationModelDSLPackage.MAX:
				if(context == grammarAccess.getMATH_OPERATORRule() ||
				   context == grammarAccess.getMAXRule()) {
					sequence_MAX(context, (MAX) semanticObject); 
					return; 
				}
				else break;
			case AdaptationModelDSLPackage.MIN:
				if(context == grammarAccess.getMATH_OPERATORRule() ||
				   context == grammarAccess.getMINRule()) {
					sequence_MIN(context, (MIN) semanticObject); 
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
			case AdaptationModelDSLPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     measurement+=[Import|ID]+
	 */
	protected void sequence_AVG(EObject context, AVG semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* rules+=Rule*)
	 */
	protected void sequence_AdaptationModel(EObject context, AdaptationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (measurement=[Import|ID] meas+=[Import|ID]*)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Import|ID]
	 */
	protected void sequence_DeselectAction(EObject context, DeselectAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.DESELECT_ACTION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.DESELECT_ACTION__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeselectActionAccess().getFeatureImportIDTerminalRuleCall_1_0_1(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.IMPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.IMPORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     measurement+=[Import|ID]+
	 */
	protected void sequence_MAX(EObject context, MAX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     measurement+=[Import|ID]+
	 */
	protected void sequence_MIN(EObject context, MIN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureAttribute=[Import|ID] value=VALUE)
	 */
	protected void sequence_ModifyAttribute(EObject context, ModifyAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.MODIFY_ATTRIBUTE__FEATURE_ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.MODIFY_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.MODIFY_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModifyAttributeAccess().getFeatureAttributeImportIDTerminalRuleCall_1_0_1(), semanticObject.getFeatureAttribute());
		feeder.accept(grammarAccess.getModifyAttributeAccess().getValueVALUETerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID condition+=Condition atomicAction+=AtomicAction+ (condition+=Condition* atomicAction+=AtomicAction+)*)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Import|ID]
	 */
	protected void sequence_SelectAction(EObject context, SelectAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdaptationModelDSLPackage.Literals.SELECT_ACTION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdaptationModelDSLPackage.Literals.SELECT_ACTION__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectActionAccess().getFeatureImportIDTerminalRuleCall_1_0_1(), semanticObject.getFeature());
		feeder.finish();
	}
}
