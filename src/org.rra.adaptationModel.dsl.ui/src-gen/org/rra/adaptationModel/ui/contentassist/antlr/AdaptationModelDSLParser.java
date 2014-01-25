/*
* generated by Xtext
*/
package org.rra.adaptationModel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.rra.adaptationModel.services.AdaptationModelDSLGrammarAccess;

public class AdaptationModelDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private AdaptationModelDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.rra.adaptationModel.ui.contentassist.antlr.internal.InternalAdaptationModelDSLParser createParser() {
		org.rra.adaptationModel.ui.contentassist.antlr.internal.InternalAdaptationModelDSLParser result = new org.rra.adaptationModel.ui.contentassist.antlr.internal.InternalAdaptationModelDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOPERATORAccess().getAlternatives(), "rule__OPERATOR__Alternatives");
					put(grammarAccess.getLOGICAL_OPERATORAccess().getAlternatives(), "rule__LOGICAL_OPERATOR__Alternatives");
					put(grammarAccess.getMATH_OPERATORAccess().getAlternatives(), "rule__MATH_OPERATOR__Alternatives");
					put(grammarAccess.getAtomicActionAccess().getAlternatives(), "rule__AtomicAction__Alternatives");
					put(grammarAccess.getAdaptationModelAccess().getGroup(), "rule__AdaptationModel__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_7(), "rule__Rule__Group_7__0");
					put(grammarAccess.getRuleAccess().getGroup_7_1(), "rule__Rule__Group_7_1__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_3(), "rule__Condition__Group_3__0");
					put(grammarAccess.getAVGAccess().getGroup(), "rule__AVG__Group__0");
					put(grammarAccess.getAVGAccess().getGroup_1(), "rule__AVG__Group_1__0");
					put(grammarAccess.getMINAccess().getGroup(), "rule__MIN__Group__0");
					put(grammarAccess.getMINAccess().getGroup_1(), "rule__MIN__Group_1__0");
					put(grammarAccess.getMAXAccess().getGroup(), "rule__MAX__Group__0");
					put(grammarAccess.getMAXAccess().getGroup_1(), "rule__MAX__Group_1__0");
					put(grammarAccess.getSelectActionAccess().getGroup(), "rule__SelectAction__Group__0");
					put(grammarAccess.getDeselectActionAccess().getGroup(), "rule__DeselectAction__Group__0");
					put(grammarAccess.getModifyAttributeAccess().getGroup(), "rule__ModifyAttribute__Group__0");
					put(grammarAccess.getAdaptationModelAccess().getImportsAssignment_0(), "rule__AdaptationModel__ImportsAssignment_0");
					put(grammarAccess.getAdaptationModelAccess().getRulesAssignment_1(), "rule__AdaptationModel__RulesAssignment_1");
					put(grammarAccess.getImportAccess().getNameAssignment_3(), "rule__Import__NameAssignment_3");
					put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
					put(grammarAccess.getRuleAccess().getConditionAssignment_4(), "rule__Rule__ConditionAssignment_4");
					put(grammarAccess.getRuleAccess().getAtomicActionAssignment_6(), "rule__Rule__AtomicActionAssignment_6");
					put(grammarAccess.getRuleAccess().getConditionAssignment_7_1_1(), "rule__Rule__ConditionAssignment_7_1_1");
					put(grammarAccess.getRuleAccess().getAtomicActionAssignment_7_2(), "rule__Rule__AtomicActionAssignment_7_2");
					put(grammarAccess.getConditionAccess().getMeasurementAssignment_0(), "rule__Condition__MeasurementAssignment_0");
					put(grammarAccess.getConditionAccess().getMeasAssignment_3_1(), "rule__Condition__MeasAssignment_3_1");
					put(grammarAccess.getAVGAccess().getMeasurementAssignment_1_0(), "rule__AVG__MeasurementAssignment_1_0");
					put(grammarAccess.getMINAccess().getMeasurementAssignment_1_0(), "rule__MIN__MeasurementAssignment_1_0");
					put(grammarAccess.getMAXAccess().getMeasurementAssignment_1_0(), "rule__MAX__MeasurementAssignment_1_0");
					put(grammarAccess.getSelectActionAccess().getFeatureAssignment_1(), "rule__SelectAction__FeatureAssignment_1");
					put(grammarAccess.getDeselectActionAccess().getFeatureAssignment_1(), "rule__DeselectAction__FeatureAssignment_1");
					put(grammarAccess.getModifyAttributeAccess().getFeatureAttributeAssignment_1(), "rule__ModifyAttribute__FeatureAttributeAssignment_1");
					put(grammarAccess.getModifyAttributeAccess().getValueAssignment_3(), "rule__ModifyAttribute__ValueAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.rra.adaptationModel.ui.contentassist.antlr.internal.InternalAdaptationModelDSLParser typedParser = (org.rra.adaptationModel.ui.contentassist.antlr.internal.InternalAdaptationModelDSLParser) parser;
			typedParser.entryRuleAdaptationModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AdaptationModelDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AdaptationModelDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
