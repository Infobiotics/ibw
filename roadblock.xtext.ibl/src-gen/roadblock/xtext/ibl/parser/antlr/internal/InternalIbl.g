/*
* generated by Xtext
*/
grammar InternalIbl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package roadblock.xtext.ibl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package roadblock.xtext.ibl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import roadblock.xtext.ibl.services.IblGrammarAccess;

}

@parser::members {

 	private IblGrammarAccess grammarAccess;
 	
    public InternalIblParser(TokenStream input, IblGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected IblGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getMembersModelMemberParserRuleCall_1_0()); 
	    }
		lv_members_1_0=ruleModelMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_1_0, 
        		"ModelMember");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleModelMember
entryRuleModelMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelMemberRule()); }
	 iv_ruleModelMember=ruleModelMember 
	 { $current=$iv_ruleModelMember.current; } 
	 EOF 
;

// Rule ModelMember
ruleModelMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 
    }
    this_Import_0=ruleImport
    { 
        $current = $this_Import_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 
    }
    this_VariableDefinition_1=ruleVariableDefinition
    { 
        $current = $this_VariableDefinition_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getModelMemberAccess().getFunctionDefinitionParserRuleCall_2()); 
    }
    this_FunctionDefinition_2=ruleFunctionDefinition
    { 
        $current = $this_FunctionDefinition_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleVariableDefinition
entryRuleVariableDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableDefinitionRule()); }
	 iv_ruleVariableDefinition=ruleVariableDefinition 
	 { $current=$iv_ruleVariableDefinition.current; } 
	 EOF 
;

// Rule VariableDefinition
ruleVariableDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
            $current);
    }
)	otherlv_1='define' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleVariableType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"VariableType");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getMembersVariableDefinitionMemberParserRuleCall_5_0()); 
	    }
		lv_members_5_0=ruleVariableDefinitionMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_5_0, 
        		"VariableDefinitionMember");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleFunctionDefinition
entryRuleFunctionDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionDefinitionRule()); }
	 iv_ruleFunctionDefinition=ruleFunctionDefinition 
	 { $current=$iv_ruleFunctionDefinition.current; } 
	 EOF 
;

// Rule FunctionDefinition
ruleFunctionDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0(),
            $current);
    }
)	otherlv_1='define' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleVariableType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"VariableType");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4='(' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0()); 
	    }
		lv_parameters_5_0=ruleFunctionParameterMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_5_0, 
        		"FunctionParameterMember");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_1_0()); 
	    }
		lv_parameters_7_0=ruleFunctionParameterMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_7_0, 
        		"FunctionParameterMember");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_7());
    }
	otherlv_9='{' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_9_0()); 
	    }
		lv_members_10_0=ruleFunctionDefinitionMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_10_0, 
        		"FunctionDefinitionMember");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_10());
    }
(	otherlv_12='USES' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_11_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_1_0()); 
	    }
		lv_uses_13_0=ruleFunctionUseMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		add(
       			$current, 
       			"uses",
        		lv_uses_13_0, 
        		"FunctionUseMember");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_14=',' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_11_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_2_1_0()); 
	    }
		lv_uses_15_0=ruleFunctionUseMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
	        }
       		add(
       			$current, 
       			"uses",
        		lv_uses_15_0, 
        		"FunctionUseMember");
	        afterParserOrEnumRuleCall();
	    }

)
)))?)
;





// Entry rule entryRuleFunctionUseMember
entryRuleFunctionUseMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionUseMemberRule()); }
	 iv_ruleFunctionUseMember=ruleFunctionUseMember 
	 { $current=$iv_ruleFunctionUseMember.current; } 
	 EOF 
;

// Rule FunctionUseMember
ruleFunctionUseMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=RULE_ID
		{
			newLeafNode(lv_type_0_0, grammarAccess.getFunctionUseMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionUseMemberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"ID");
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFunctionUseMemberAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionUseMemberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleFunctionParameterMember
entryRuleFunctionParameterMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionParameterMemberRule()); }
	 iv_ruleFunctionParameterMember=ruleFunctionParameterMember 
	 { $current=$iv_ruleFunctionParameterMember.current; } 
	 EOF 
;

// Rule FunctionParameterMember
ruleFunctionParameterMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_type_0_0=RULE_ID
		{
			newLeafNode(lv_type_0_0, grammarAccess.getFunctionParameterMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionParameterMemberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"ID");
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFunctionParameterMemberAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionParameterMemberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0()); 
	    }
		lv_scope_3_0=ruleParameterScope		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
	        }
       		set(
       			$current, 
       			"scope",
        		lv_scope_3_0, 
        		"ParameterScope");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleParameterScope
entryRuleParameterScope returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterScopeRule()); } 
	 iv_ruleParameterScope=ruleParameterScope 
	 { $current=$iv_ruleParameterScope.current.getText(); }  
	 EOF 
;

// Rule ParameterScope
ruleParameterScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='required' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 
    }

    |
	kw='returned' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleFunctionDefinitionMember
entryRuleFunctionDefinitionMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionDefinitionMemberRule()); }
	 iv_ruleFunctionDefinitionMember=ruleFunctionDefinitionMember 
	 { $current=$iv_ruleFunctionDefinitionMember.current; } 
	 EOF 
;

// Rule FunctionDefinitionMember
ruleFunctionDefinitionMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 
    }
    this_RuleDefinition_0=ruleRuleDefinition
    { 
        $current = $this_RuleDefinition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_1()); 
    }
    this_VariableAssignment_1=ruleVariableAssignment
    { 
        $current = $this_VariableAssignment_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleVariableDefinitionMember
entryRuleVariableDefinitionMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableDefinitionMemberRule()); }
	 iv_ruleVariableDefinitionMember=ruleVariableDefinitionMember 
	 { $current=$iv_ruleVariableDefinitionMember.current; } 
	 EOF 
;

// Rule VariableDefinitionMember
ruleVariableDefinitionMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getVariableDefinitionMemberAccess().getVariableDeclarationParserRuleCall()); 
    }
    this_VariableDeclaration_0=ruleVariableDeclaration
    { 
        $current = $this_VariableDeclaration_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableDeclarationRule()); }
	 iv_ruleVariableDeclaration=ruleVariableDeclaration 
	 { $current=$iv_ruleVariableDeclaration.current; } 
	 EOF 
;

// Rule VariableDeclaration
ruleVariableDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_0_1_0_0()); 
	    }
		lv_type_1_0=ruleVariableType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"VariableType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)))
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
	    }
		lv_collection_3_0=ruleCollectionID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
	        }
       		set(
       			$current, 
       			"collection",
        		lv_collection_3_0, 
        		"CollectionID");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='<' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_1_2_0()); 
	    }
		lv_type_5_0=ruleVariableType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_5_0, 
        		"VariableType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='>' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_1_3());
    }
(
(
		lv_name_7_0=RULE_ID
		{
			newLeafNode(lv_name_7_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_7_0, 
        		"ID");
	    }

)
)))
;





// Entry rule entryRuleVariableType
entryRuleVariableType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableTypeRule()); }
	 iv_ruleVariableType=ruleVariableType 
	 { $current=$iv_ruleVariableType.current; } 
	 EOF 
;

// Rule VariableType
ruleVariableType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getVariableTypeAccess().getVariableTypeAction_0(),
            $current);
    }
)(
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableTypeAccess().getPrimitivePrimitiveVariableTypeParserRuleCall_1_0_0()); 
	    }
		lv_primitive_1_1=rulePrimitiveVariableType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableTypeRule());
	        }
       		set(
       			$current, 
       			"primitive",
        		lv_primitive_1_1, 
        		"PrimitiveVariableType");
	        afterParserOrEnumRuleCall();
	    }

    |		lv_primitive_1_2=RULE_ID
		{
			newLeafNode(lv_primitive_1_2, grammarAccess.getVariableTypeAccess().getPrimitiveIDTerminalRuleCall_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"primitive",
        		lv_primitive_1_2, 
        		"ID");
	    }

)

)
))
;





// Entry rule entryRuleVariableAttribute
entryRuleVariableAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableAttributeRule()); }
	 iv_ruleVariableAttribute=ruleVariableAttribute 
	 { $current=$iv_ruleVariableAttribute.current; } 
	 EOF 
;

// Rule VariableAttribute
ruleVariableAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0());
    }
(
(
		lv_attribute_3_0=RULE_ID
		{
			newLeafNode(lv_attribute_3_0, grammarAccess.getVariableAttributeAccess().getAttributeIDTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"attribute",
        		lv_attribute_3_0, 
        		"ID");
	    }

)
))?)
;





// Entry rule entryRuleVariableAssignment
entryRuleVariableAssignment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableAssignmentRule()); }
	 iv_ruleVariableAssignment=ruleVariableAssignment 
	 { $current=$iv_ruleVariableAssignment.current; } 
	 EOF 
;

// Rule VariableAssignment
ruleVariableAssignment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableAttributeParserRuleCall_1_0()); 
	    }
		lv_variable_1_0=ruleVariableAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
	        }
       		set(
       			$current, 
       			"variable",
        		lv_variable_1_0, 
        		"VariableAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
	    }
		lv_expression_3_0=ruleVariableExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_3_0, 
        		"VariableExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleVariableExpression
entryRuleVariableExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableExpressionRule()); }
	 iv_ruleVariableExpression=ruleVariableExpression 
	 { $current=$iv_ruleVariableExpression.current; } 
	 EOF 
;

// Rule VariableExpression
ruleVariableExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_1_0()); 
	    }
		lv_members_1_0=ruleVariableAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_1_0, 
        		"VariableAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
)(
    { 
        newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
    }
ruleVariableExpressionOperator
    { 
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_2_1_0()); 
	    }
		lv_members_3_0=ruleVariableAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_3_0, 
        		"VariableAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleVariableExpressionOperator
entryRuleVariableExpressionOperator returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableExpressionOperatorRule()); } 
	 iv_ruleVariableExpressionOperator=ruleVariableExpressionOperator 
	 { $current=$iv_ruleVariableExpressionOperator.current.getText(); }  
	 EOF 
;

// Rule VariableExpressionOperator
ruleVariableExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='+' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
    }

    |
	kw='|' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getVerticalLineKeyword_2()); 
    }
)
    ;





// Entry rule entryRulePrimitiveVariableType
entryRulePrimitiveVariableType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimitiveVariableTypeRule()); } 
	 iv_rulePrimitiveVariableType=rulePrimitiveVariableType 
	 { $current=$iv_rulePrimitiveVariableType.current.getText(); }  
	 EOF 
;

// Rule PrimitiveVariableType
rulePrimitiveVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='ID' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getIDKeyword_0()); 
    }

    |
	kw='URI' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getURIKeyword_1()); 
    }

    |
	kw='DNA' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getDNAKeyword_2()); 
    }

    |
	kw='CHASSIS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getCHASSISKeyword_3()); 
    }

    |
	kw='PROCESS' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getPROCESSKeyword_4()); 
    }
)
    ;





// Entry rule entryRuleCollectionID
entryRuleCollectionID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getCollectionIDRule()); } 
	 iv_ruleCollectionID=ruleCollectionID 
	 { $current=$iv_ruleCollectionID.current.getText(); }  
	 EOF 
;

// Rule CollectionID
ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='LIST' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
    }

    |
	kw='SET' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleRuleDefinition
entryRuleRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleDefinitionRule()); }
	 iv_ruleRuleDefinition=ruleRuleDefinition 
	 { $current=$iv_ruleRuleDefinition.current; } 
	 EOF 
;

// Rule RuleDefinition
ruleRuleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
            $current);
    }
)	otherlv_1='RULE' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getRuleDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
	    }
		lv_lhs_4_0=ruleRuleObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
	        }
       		add(
       			$current, 
       			"lhs",
        		lv_lhs_4_0, 
        		"RuleObject");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='+' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
	    }
		lv_lhs_6_0=ruleRuleObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
	        }
       		add(
       			$current, 
       			"lhs",
        		lv_lhs_6_0, 
        		"RuleObject");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_7='->' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
    }

    |	otherlv_8='<->' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1());
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
	    }
		lv_rhs_9_0=ruleRuleObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
	        }
       		add(
       			$current, 
       			"rhs",
        		lv_rhs_9_0, 
        		"RuleObject");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10='+' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
	    }
		lv_rhs_11_0=ruleRuleObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
	        }
       		add(
       			$current, 
       			"rhs",
        		lv_rhs_11_0, 
        		"RuleObject");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleRuleObject
entryRuleRuleObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleObjectRule()); }
	 iv_ruleRuleObject=ruleRuleObject 
	 { $current=$iv_ruleRuleObject.current; } 
	 EOF 
;

// Rule RuleObject
ruleRuleObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRuleObjectAccess().getRuleObjectAction_0(),
            $current);
    }
)(
(
		lv_subobjects_1_0=RULE_ID
		{
			newLeafNode(lv_subobjects_1_0, grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleObjectRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"subobjects",
        		lv_subobjects_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='~' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRuleObjectAccess().getTildeKeyword_2_0());
    }
(
(
		lv_subobjects_3_0=RULE_ID
		{
			newLeafNode(lv_subobjects_3_0, grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleObjectRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"subobjects",
        		lv_subobjects_3_0, 
        		"ID");
	    }

)
))*)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getImportAccess().getImportAction_0(),
            $current);
    }
)	otherlv_1='import' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
	    }
		lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_2_0, 
        		"QualifiedNameWithWildcard");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard 
	 { $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }  
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
    }
    this_QualifiedName_0=ruleQualifiedName    {
		$current.merge(this_QualifiedName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='.*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
    }
)?)
    ;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


