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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIblParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'define'", "'typeof'", "'USES'", "','", "'PROCESS'", "'('", "')'", "'{'", "'}'", "'SYSTEM'", "'PLASMID'", "'CHROMOSOME'", "'CELL'", "'REGION'", "'<'", "'>'", "':'", "'input'", "'output'", "'optional'", "'DEVICE'", "'='", "'new'", "'parts'", "'MOLECULE'", "'CHASSIS'", "'COMPLEX'", "'RIBOSOME'", "'PROMOTER'", "'PROTEIN'", "'DNA'", "'RNA'", "'GENE'", "'INTEGER'", "'RATE'", "'~'", "'.'", "'observable'", "'LIST'", "'SET'", "'HASH'", "'+'", "'-'", "'|'", "'RULE'", "'->'", "'<->'", "'ATGC'", "'ARRANGE'", "'VERIFY'", "'EVENTUALLY HOLDS'", "'NEVER HOLDS'", "'ALWAYS HOLDS'", "'WILL HOLD UNTIL THEN'", "'IS FOLLOWED BY'", "'HOLDS IN STEADY-STATE'", "'HOLDS INFINITELY OFTEN'", "'GIVEN'", "'EXPECTED'", "'['", "']'", "'IS '", "'NOT'", "'AND'", "'OR'", "'IMPLIES'", "'AT'", "'BEFORE'", "'AFTER'", "'WITHIN'", "'WITH PROBABILITY'", "'?'", "'1.0'", "'0.'", "'E'", "'e'", "'s'", "'min'", "'mins'", "'s^-1'", "'min^-1'", "'M'", "'mM'", "'uM'", "'nM'", "'pM'", "'fM'", "'molecule'", "'molecules'", "'=='", "'!='", "'<='", "'>='", "'.*'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalIblParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIblParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIblParser.tokenNames; }
    public String getGrammarFileName() { return "../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_members_1_0= ruleModelMember ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:79:28: ( ( () ( (lv_members_1_0= ruleModelMember ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:80:1: ( () ( (lv_members_1_0= ruleModelMember ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:80:1: ( () ( (lv_members_1_0= ruleModelMember ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:80:2: () ( (lv_members_1_0= ruleModelMember ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:80:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:86:2: ( (lv_members_1_0= ruleModelMember ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:87:1: (lv_members_1_0= ruleModelMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:87:1: (lv_members_1_0= ruleModelMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:88:3: lv_members_1_0= ruleModelMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMembersModelMemberParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelMember_in_ruleModel140);
            	    lv_members_1_0=ruleModelMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_1_0, 
            	            		"ModelMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:112:1: entryRuleModelMember returns [EObject current=null] : iv_ruleModelMember= ruleModelMember EOF ;
    public final EObject entryRuleModelMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:113:2: (iv_ruleModelMember= ruleModelMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:114:2: iv_ruleModelMember= ruleModelMember EOF
            {
             newCompositeNode(grammarAccess.getModelMemberRule()); 
            pushFollow(FOLLOW_ruleModelMember_in_entryRuleModelMember177);
            iv_ruleModelMember=ruleModelMember();

            state._fsp--;

             current =iv_ruleModelMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMember187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelMember"


    // $ANTLR start "ruleModelMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:121:1: ruleModelMember returns [EObject current=null] : (this_ImportStatement_0= ruleImportStatement | this_FunctionDefinition_1= ruleFunctionDefinition ) ;
    public final EObject ruleModelMember() throws RecognitionException {
        EObject current = null;

        EObject this_ImportStatement_0 = null;

        EObject this_FunctionDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:124:28: ( (this_ImportStatement_0= ruleImportStatement | this_FunctionDefinition_1= ruleFunctionDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:125:1: (this_ImportStatement_0= ruleImportStatement | this_FunctionDefinition_1= ruleFunctionDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:125:1: (this_ImportStatement_0= ruleImportStatement | this_FunctionDefinition_1= ruleFunctionDefinition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:126:5: this_ImportStatement_0= ruleImportStatement
                    {
                     
                            newCompositeNode(grammarAccess.getModelMemberAccess().getImportStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleImportStatement_in_ruleModelMember234);
                    this_ImportStatement_0=ruleImportStatement();

                    state._fsp--;

                     
                            current = this_ImportStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:136:5: this_FunctionDefinition_1= ruleFunctionDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelMemberAccess().getFunctionDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleModelMember261);
                    this_FunctionDefinition_1=ruleFunctionDefinition();

                    state._fsp--;

                     
                            current = this_FunctionDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelMember"


    // $ANTLR start "entryRuleImportStatement"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:152:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:153:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:154:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement296);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:161:1: ruleImportStatement returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:164:28: ( ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:165:1: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:165:1: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:165:2: () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:165:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:166:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportStatementAccess().getImportAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleImportStatement352); 

                	newLeafNode(otherlv_1, grammarAccess.getImportStatementAccess().getImportKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:176:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:176:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:177:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportStatement373);
            lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportStatementRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_2_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:203:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:204:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:205:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition411);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:212:1: ruleFunctionDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_functionBody_4_1 = null;

        EObject lv_functionBody_4_2 = null;

        EObject lv_functionBody_4_3 = null;

        EObject lv_functionBody_4_4 = null;

        EObject lv_functionBody_4_5 = null;

        EObject lv_functionBody_4_6 = null;

        EObject lv_functionBody_4_7 = null;

        EObject lv_uses_6_0 = null;

        EObject lv_uses_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:215:28: ( ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:216:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:216:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:216:2: () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:216:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:217:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFunctionDefinition467); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:226:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:227:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:227:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:228:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionDefinition488);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDefinition500); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionDefinitionAccess().getTypeofKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:248:1: ( ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:249:1: ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:249:1: ( (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:250:1: (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:250:1: (lv_functionBody_4_1= ruleProcessBody | lv_functionBody_4_2= ruleSystemBody | lv_functionBody_4_3= rulePlasmidBody | lv_functionBody_4_4= ruleChromosomeBody | lv_functionBody_4_5= ruleCellBody | lv_functionBody_4_6= ruleRegionBody | lv_functionBody_4_7= ruleCustomFunctionBody )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case RULE_ID:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:251:3: lv_functionBody_4_1= ruleProcessBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyProcessBodyParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProcessBody_in_ruleFunctionDefinition523);
                    lv_functionBody_4_1=ruleProcessBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"functionBody",
                            		lv_functionBody_4_1, 
                            		"ProcessBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:266:8: lv_functionBody_4_2= ruleSystemBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodySystemBodyParserRuleCall_4_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleSystemBody_in_ruleFunctionDefinition542);
                    lv_functionBody_4_2=ruleSystemBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"functionBody",
                            		lv_functionBody_4_2, 
                            		"SystemBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:281:8: lv_functionBody_4_3= rulePlasmidBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyPlasmidBodyParserRuleCall_4_0_2()); 
                    	    
                    pushFollow(FOLLOW_rulePlasmidBody_in_ruleFunctionDefinition561);
                    lv_functionBody_4_3=rulePlasmidBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"functionBody",
                            		lv_functionBody_4_3, 
                            		"PlasmidBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:296:8: lv_functionBody_4_4= ruleChromosomeBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyChromosomeBodyParserRuleCall_4_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleChromosomeBody_in_ruleFunctionDefinition580);
                    lv_functionBody_4_4=ruleChromosomeBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"functionBody",
                            		lv_functionBody_4_4, 
                            		"ChromosomeBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:311:8: lv_functionBody_4_5= ruleCellBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyCellBodyParserRuleCall_4_0_4()); 
                    	    
                    pushFollow(FOLLOW_ruleCellBody_in_ruleFunctionDefinition599);
                    lv_functionBody_4_5=ruleCellBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"functionBody",
                            		lv_functionBody_4_5, 
                            		"CellBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:326:8: lv_functionBody_4_6= ruleRegionBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyRegionBodyParserRuleCall_4_0_5()); 
                    	    
                    pushFollow(FOLLOW_ruleRegionBody_in_ruleFunctionDefinition618);
                    lv_functionBody_4_6=ruleRegionBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"functionBody",
                            		lv_functionBody_4_6, 
                            		"RegionBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:341:8: lv_functionBody_4_7= ruleCustomFunctionBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyCustomFunctionBodyParserRuleCall_4_0_6()); 
                    	    
                    pushFollow(FOLLOW_ruleCustomFunctionBody_in_ruleFunctionDefinition637);
                    lv_functionBody_4_7=ruleCustomFunctionBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"functionBody",
                            		lv_functionBody_4_7, 
                            		"CustomFunctionBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:359:2: (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:359:4: otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )*
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition653); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_5_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:363:1: ( (lv_uses_6_0= ruleFunctionUseMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:364:1: (lv_uses_6_0= ruleFunctionUseMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:364:1: (lv_uses_6_0= ruleFunctionUseMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:365:3: lv_uses_6_0= ruleFunctionUseMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition674);
                    lv_uses_6_0=ruleFunctionUseMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"uses",
                            		lv_uses_6_0, 
                            		"FunctionUseMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:381:2: (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:381:4: otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition687); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:385:1: ( (lv_uses_8_0= ruleFunctionUseMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:386:1: (lv_uses_8_0= ruleFunctionUseMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:386:1: (lv_uses_8_0= ruleFunctionUseMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:387:3: lv_uses_8_0= ruleFunctionUseMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition708);
                    	    lv_uses_8_0=ruleFunctionUseMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"uses",
                    	            		lv_uses_8_0, 
                    	            		"FunctionUseMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleProcessBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:411:1: entryRuleProcessBody returns [EObject current=null] : iv_ruleProcessBody= ruleProcessBody EOF ;
    public final EObject entryRuleProcessBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:412:2: (iv_ruleProcessBody= ruleProcessBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:413:2: iv_ruleProcessBody= ruleProcessBody EOF
            {
             newCompositeNode(grammarAccess.getProcessBodyRule()); 
            pushFollow(FOLLOW_ruleProcessBody_in_entryRuleProcessBody748);
            iv_ruleProcessBody=ruleProcessBody();

            state._fsp--;

             current =iv_ruleProcessBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessBody758); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessBody"


    // $ANTLR start "ruleProcessBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:420:1: ruleProcessBody returns [EObject current=null] : ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleProcessBodyMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleProcessBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:423:28: ( ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleProcessBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:424:1: ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleProcessBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:424:1: ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleProcessBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:424:2: () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleProcessBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:424:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:425:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessBodyAccess().getProcessBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProcessBody804); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessBodyAccess().getPROCESSKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleProcessBody816); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:438:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=36 && LA7_0<=46)||(LA7_0>=50 && LA7_0<=52)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:438:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:438:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:439:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:439:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:440:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody838);
                    lv_parameters_3_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:456:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:456:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleProcessBody851); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcessBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:460:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:461:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:461:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:462:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody872);
                    	    lv_parameters_5_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleProcessBody888); 

                	newLeafNode(otherlv_6, grammarAccess.getProcessBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleProcessBody900); 

                	newLeafNode(otherlv_7, grammarAccess.getProcessBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:486:1: ( (lv_members_8_0= ruleProcessBodyMember ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16||(LA8_0>=36 && LA8_0<=46)||(LA8_0>=50 && LA8_0<=52)||LA8_0==56) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:487:1: (lv_members_8_0= ruleProcessBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:487:1: (lv_members_8_0= ruleProcessBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:488:3: lv_members_8_0= ruleProcessBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessBodyAccess().getMembersProcessBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessBodyMember_in_ruleProcessBody921);
            	    lv_members_8_0=ruleProcessBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"ProcessBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleProcessBody934); 

                	newLeafNode(otherlv_9, grammarAccess.getProcessBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessBody"


    // $ANTLR start "entryRuleSystemBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:516:1: entryRuleSystemBody returns [EObject current=null] : iv_ruleSystemBody= ruleSystemBody EOF ;
    public final EObject entryRuleSystemBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:517:2: (iv_ruleSystemBody= ruleSystemBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:518:2: iv_ruleSystemBody= ruleSystemBody EOF
            {
             newCompositeNode(grammarAccess.getSystemBodyRule()); 
            pushFollow(FOLLOW_ruleSystemBody_in_entryRuleSystemBody970);
            iv_ruleSystemBody=ruleSystemBody();

            state._fsp--;

             current =iv_ruleSystemBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemBody980); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemBody"


    // $ANTLR start "ruleSystemBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:525:1: ruleSystemBody returns [EObject current=null] : ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleSystemBodyMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleSystemBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:528:28: ( ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleSystemBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:529:1: ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleSystemBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:529:1: ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleSystemBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:529:2: () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleSystemBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:529:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:530:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSystemBodyAccess().getSystemBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSystemBody1026); 

                	newLeafNode(otherlv_1, grammarAccess.getSystemBodyAccess().getSYSTEMKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSystemBody1038); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:543:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=36 && LA10_0<=46)||(LA10_0>=50 && LA10_0<=52)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:543:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:543:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:544:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:544:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:545:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1060);
                    lv_parameters_3_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:561:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:561:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSystemBody1073); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSystemBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:565:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:566:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:566:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:567:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSystemBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1094);
                    	    lv_parameters_5_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSystemBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSystemBody1110); 

                	newLeafNode(otherlv_6, grammarAccess.getSystemBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSystemBody1122); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:591:1: ( (lv_members_8_0= ruleSystemBodyMember ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==16||LA11_0==32||(LA11_0>=36 && LA11_0<=46)||(LA11_0>=50 && LA11_0<=52)||LA11_0==56||LA11_0==59||LA11_0==61) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:592:1: (lv_members_8_0= ruleSystemBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:592:1: (lv_members_8_0= ruleSystemBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:593:3: lv_members_8_0= ruleSystemBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemBodyAccess().getMembersSystemBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystemBodyMember_in_ruleSystemBody1143);
            	    lv_members_8_0=ruleSystemBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"SystemBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSystemBody1156); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemBody"


    // $ANTLR start "entryRulePlasmidBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:621:1: entryRulePlasmidBody returns [EObject current=null] : iv_rulePlasmidBody= rulePlasmidBody EOF ;
    public final EObject entryRulePlasmidBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlasmidBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:622:2: (iv_rulePlasmidBody= rulePlasmidBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:623:2: iv_rulePlasmidBody= rulePlasmidBody EOF
            {
             newCompositeNode(grammarAccess.getPlasmidBodyRule()); 
            pushFollow(FOLLOW_rulePlasmidBody_in_entryRulePlasmidBody1192);
            iv_rulePlasmidBody=rulePlasmidBody();

            state._fsp--;

             current =iv_rulePlasmidBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlasmidBody1202); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlasmidBody"


    // $ANTLR start "rulePlasmidBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:630:1: rulePlasmidBody returns [EObject current=null] : ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= rulePlasmidBodyMember ) )* otherlv_9= '}' ) ;
    public final EObject rulePlasmidBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:633:28: ( ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= rulePlasmidBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:634:1: ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= rulePlasmidBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:634:1: ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= rulePlasmidBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:634:2: () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= rulePlasmidBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:634:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:635:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPlasmidBodyAccess().getPlasmidBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePlasmidBody1248); 

                	newLeafNode(otherlv_1, grammarAccess.getPlasmidBodyAccess().getPLASMIDKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePlasmidBody1260); 

                	newLeafNode(otherlv_2, grammarAccess.getPlasmidBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:648:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=36 && LA13_0<=46)||(LA13_0>=50 && LA13_0<=52)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:648:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:648:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:649:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:649:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:650:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlasmidBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1282);
                    lv_parameters_3_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlasmidBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:666:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:666:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePlasmidBody1295); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getPlasmidBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:670:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:671:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:671:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:672:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPlasmidBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1316);
                    	    lv_parameters_5_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPlasmidBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePlasmidBody1332); 

                	newLeafNode(otherlv_6, grammarAccess.getPlasmidBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_rulePlasmidBody1344); 

                	newLeafNode(otherlv_7, grammarAccess.getPlasmidBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:696:1: ( (lv_members_8_0= rulePlasmidBodyMember ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==16||LA14_0==21||LA14_0==32||(LA14_0>=36 && LA14_0<=46)||(LA14_0>=50 && LA14_0<=52)||LA14_0==56||LA14_0==59||LA14_0==61) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:697:1: (lv_members_8_0= rulePlasmidBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:697:1: (lv_members_8_0= rulePlasmidBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:698:3: lv_members_8_0= rulePlasmidBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlasmidBodyAccess().getMembersPlasmidBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlasmidBodyMember_in_rulePlasmidBody1365);
            	    lv_members_8_0=rulePlasmidBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlasmidBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"PlasmidBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_rulePlasmidBody1378); 

                	newLeafNode(otherlv_9, grammarAccess.getPlasmidBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlasmidBody"


    // $ANTLR start "entryRuleChromosomeBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:726:1: entryRuleChromosomeBody returns [EObject current=null] : iv_ruleChromosomeBody= ruleChromosomeBody EOF ;
    public final EObject entryRuleChromosomeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChromosomeBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:727:2: (iv_ruleChromosomeBody= ruleChromosomeBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:728:2: iv_ruleChromosomeBody= ruleChromosomeBody EOF
            {
             newCompositeNode(grammarAccess.getChromosomeBodyRule()); 
            pushFollow(FOLLOW_ruleChromosomeBody_in_entryRuleChromosomeBody1414);
            iv_ruleChromosomeBody=ruleChromosomeBody();

            state._fsp--;

             current =iv_ruleChromosomeBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChromosomeBody1424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChromosomeBody"


    // $ANTLR start "ruleChromosomeBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:735:1: ruleChromosomeBody returns [EObject current=null] : ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleChromosomeBodyMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleChromosomeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:738:28: ( ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleChromosomeBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:739:1: ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleChromosomeBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:739:1: ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleChromosomeBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:739:2: () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleChromosomeBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:739:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:740:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChromosomeBodyAccess().getChromosomeBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleChromosomeBody1470); 

                	newLeafNode(otherlv_1, grammarAccess.getChromosomeBodyAccess().getCHROMOSOMEKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleChromosomeBody1482); 

                	newLeafNode(otherlv_2, grammarAccess.getChromosomeBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:753:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=36 && LA16_0<=46)||(LA16_0>=50 && LA16_0<=52)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:753:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:753:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:754:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:754:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:755:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getChromosomeBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1504);
                    lv_parameters_3_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChromosomeBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:771:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:771:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleChromosomeBody1517); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getChromosomeBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:775:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:776:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:776:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:777:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChromosomeBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1538);
                    	    lv_parameters_5_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChromosomeBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleChromosomeBody1554); 

                	newLeafNode(otherlv_6, grammarAccess.getChromosomeBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleChromosomeBody1566); 

                	newLeafNode(otherlv_7, grammarAccess.getChromosomeBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:801:1: ( (lv_members_8_0= ruleChromosomeBodyMember ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==16||LA17_0==21||LA17_0==32||(LA17_0>=36 && LA17_0<=46)||(LA17_0>=50 && LA17_0<=52)||LA17_0==56||LA17_0==59||LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:802:1: (lv_members_8_0= ruleChromosomeBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:802:1: (lv_members_8_0= ruleChromosomeBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:803:3: lv_members_8_0= ruleChromosomeBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChromosomeBodyAccess().getMembersChromosomeBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChromosomeBodyMember_in_ruleChromosomeBody1587);
            	    lv_members_8_0=ruleChromosomeBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChromosomeBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"ChromosomeBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleChromosomeBody1600); 

                	newLeafNode(otherlv_9, grammarAccess.getChromosomeBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChromosomeBody"


    // $ANTLR start "entryRuleCellBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:831:1: entryRuleCellBody returns [EObject current=null] : iv_ruleCellBody= ruleCellBody EOF ;
    public final EObject entryRuleCellBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:832:2: (iv_ruleCellBody= ruleCellBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:833:2: iv_ruleCellBody= ruleCellBody EOF
            {
             newCompositeNode(grammarAccess.getCellBodyRule()); 
            pushFollow(FOLLOW_ruleCellBody_in_entryRuleCellBody1636);
            iv_ruleCellBody=ruleCellBody();

            state._fsp--;

             current =iv_ruleCellBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellBody1646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellBody"


    // $ANTLR start "ruleCellBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:840:1: ruleCellBody returns [EObject current=null] : ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCellBodyMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleCellBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:843:28: ( ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCellBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:844:1: ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCellBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:844:1: ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCellBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:844:2: () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCellBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:844:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:845:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCellBodyAccess().getCellBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCellBody1692); 

                	newLeafNode(otherlv_1, grammarAccess.getCellBodyAccess().getCELLKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCellBody1704); 

                	newLeafNode(otherlv_2, grammarAccess.getCellBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:858:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=36 && LA19_0<=46)||(LA19_0>=50 && LA19_0<=52)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:858:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:858:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:859:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:859:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:860:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1726);
                    lv_parameters_3_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:876:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:876:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCellBody1739); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCellBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:880:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:881:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:881:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:882:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1760);
                    	    lv_parameters_5_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCellBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleCellBody1776); 

                	newLeafNode(otherlv_6, grammarAccess.getCellBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleCellBody1788); 

                	newLeafNode(otherlv_7, grammarAccess.getCellBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:906:1: ( (lv_members_8_0= ruleCellBodyMember ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==16||(LA20_0>=21 && LA20_0<=23)||LA20_0==32||(LA20_0>=36 && LA20_0<=46)||(LA20_0>=50 && LA20_0<=52)||LA20_0==56||LA20_0==59||LA20_0==61) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:907:1: (lv_members_8_0= ruleCellBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:907:1: (lv_members_8_0= ruleCellBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:908:3: lv_members_8_0= ruleCellBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellBodyAccess().getMembersCellBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCellBodyMember_in_ruleCellBody1809);
            	    lv_members_8_0=ruleCellBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"CellBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleCellBody1822); 

                	newLeafNode(otherlv_9, grammarAccess.getCellBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellBody"


    // $ANTLR start "entryRuleRegionBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:936:1: entryRuleRegionBody returns [EObject current=null] : iv_ruleRegionBody= ruleRegionBody EOF ;
    public final EObject entryRuleRegionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:937:2: (iv_ruleRegionBody= ruleRegionBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:938:2: iv_ruleRegionBody= ruleRegionBody EOF
            {
             newCompositeNode(grammarAccess.getRegionBodyRule()); 
            pushFollow(FOLLOW_ruleRegionBody_in_entryRuleRegionBody1858);
            iv_ruleRegionBody=ruleRegionBody();

            state._fsp--;

             current =iv_ruleRegionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionBody1868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegionBody"


    // $ANTLR start "ruleRegionBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:945:1: ruleRegionBody returns [EObject current=null] : ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleRegionBodyMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleRegionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:948:28: ( ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleRegionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:949:1: ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleRegionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:949:1: ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleRegionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:949:2: () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleRegionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:949:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:950:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRegionBodyAccess().getRegionBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleRegionBody1914); 

                	newLeafNode(otherlv_1, grammarAccess.getRegionBodyAccess().getREGIONKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRegionBody1926); 

                	newLeafNode(otherlv_2, grammarAccess.getRegionBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:963:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=36 && LA22_0<=46)||(LA22_0>=50 && LA22_0<=52)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:963:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:963:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:964:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:964:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:965:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody1948);
                    lv_parameters_3_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegionBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:981:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:981:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRegionBody1961); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRegionBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:985:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:986:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:986:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:987:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRegionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody1982);
                    	    lv_parameters_5_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRegionBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleRegionBody1998); 

                	newLeafNode(otherlv_6, grammarAccess.getRegionBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleRegionBody2010); 

                	newLeafNode(otherlv_7, grammarAccess.getRegionBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1011:1: ( (lv_members_8_0= ruleRegionBodyMember ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==24||(LA23_0>=36 && LA23_0<=46)||(LA23_0>=50 && LA23_0<=52)||LA23_0==56) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1012:1: (lv_members_8_0= ruleRegionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1012:1: (lv_members_8_0= ruleRegionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1013:3: lv_members_8_0= ruleRegionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegionBodyAccess().getMembersRegionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRegionBodyMember_in_ruleRegionBody2031);
            	    lv_members_8_0=ruleRegionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"RegionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleRegionBody2044); 

                	newLeafNode(otherlv_9, grammarAccess.getRegionBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegionBody"


    // $ANTLR start "entryRuleCustomFunctionBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1041:1: entryRuleCustomFunctionBody returns [EObject current=null] : iv_ruleCustomFunctionBody= ruleCustomFunctionBody EOF ;
    public final EObject entryRuleCustomFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFunctionBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1042:2: (iv_ruleCustomFunctionBody= ruleCustomFunctionBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1043:2: iv_ruleCustomFunctionBody= ruleCustomFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getCustomFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleCustomFunctionBody_in_entryRuleCustomFunctionBody2080);
            iv_ruleCustomFunctionBody=ruleCustomFunctionBody();

            state._fsp--;

             current =iv_ruleCustomFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomFunctionBody2090); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFunctionBody"


    // $ANTLR start "ruleCustomFunctionBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1050:1: ruleCustomFunctionBody returns [EObject current=null] : ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCustomFunctionBodyMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleCustomFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_functionType_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1053:28: ( ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCustomFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1054:1: ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCustomFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1054:1: ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCustomFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1054:2: () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleCustomFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1054:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1055:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCustomFunctionBodyAccess().getCustomFunctionBodyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1060:2: ( (lv_functionType_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1061:1: (lv_functionType_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1061:1: (lv_functionType_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1062:3: lv_functionType_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getFunctionTypeVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleCustomFunctionBody2145);
            lv_functionType_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomFunctionBodyRule());
            	        }
                   		set(
                   			current, 
                   			"functionType",
                    		lv_functionType_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCustomFunctionBody2157); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomFunctionBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1082:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=36 && LA25_0<=46)||(LA25_0>=50 && LA25_0<=52)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1082:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1082:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1084:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2179);
                    lv_parameters_3_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomFunctionBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1100:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1100:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCustomFunctionBody2192); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCustomFunctionBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1104:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1105:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1105:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1106:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2213);
                    	    lv_parameters_5_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCustomFunctionBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleCustomFunctionBody2229); 

                	newLeafNode(otherlv_6, grammarAccess.getCustomFunctionBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleCustomFunctionBody2241); 

                	newLeafNode(otherlv_7, grammarAccess.getCustomFunctionBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1130:1: ( (lv_members_8_0= ruleCustomFunctionBodyMember ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==16||(LA26_0>=21 && LA26_0<=23)||LA26_0==32||(LA26_0>=36 && LA26_0<=46)||(LA26_0>=50 && LA26_0<=52)||LA26_0==56||LA26_0==59||LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1131:1: (lv_members_8_0= ruleCustomFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1131:1: (lv_members_8_0= ruleCustomFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1132:3: lv_members_8_0= ruleCustomFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getMembersCustomFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomFunctionBodyMember_in_ruleCustomFunctionBody2262);
            	    lv_members_8_0=ruleCustomFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomFunctionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"CustomFunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleCustomFunctionBody2275); 

                	newLeafNode(otherlv_9, grammarAccess.getCustomFunctionBodyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFunctionBody"


    // $ANTLR start "entryRuleProcessBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1160:1: entryRuleProcessBodyMember returns [EObject current=null] : iv_ruleProcessBodyMember= ruleProcessBodyMember EOF ;
    public final EObject entryRuleProcessBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1161:2: (iv_ruleProcessBodyMember= ruleProcessBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1162:2: iv_ruleProcessBodyMember= ruleProcessBodyMember EOF
            {
             newCompositeNode(grammarAccess.getProcessBodyMemberRule()); 
            pushFollow(FOLLOW_ruleProcessBodyMember_in_entryRuleProcessBodyMember2311);
            iv_ruleProcessBodyMember=ruleProcessBodyMember();

            state._fsp--;

             current =iv_ruleProcessBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessBodyMember2321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessBodyMember"


    // $ANTLR start "ruleProcessBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1169:1: ruleProcessBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ProcessInstantiation_3= ruleProcessInstantiation ) ;
    public final EObject ruleProcessBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ProcessInstantiation_3 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1172:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ProcessInstantiation_3= ruleProcessInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1173:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ProcessInstantiation_3= ruleProcessInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1173:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ProcessInstantiation_3= ruleProcessInstantiation )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt27=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 50:
            case 51:
            case 52:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==33||(LA27_3>=47 && LA27_3<=48)) ) {
                    alt27=3;
                }
                else if ( (LA27_3==RULE_ID) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1174:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getProcessBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleProcessBodyMember2368);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1184:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getProcessBodyMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleProcessBodyMember2395);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1194:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getProcessBodyMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleProcessBodyMember2422);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1204:5: this_ProcessInstantiation_3= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getProcessBodyMemberAccess().getProcessInstantiationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleProcessBodyMember2449);
                    this_ProcessInstantiation_3=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessBodyMember"


    // $ANTLR start "entryRuleSystemBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1220:1: entryRuleSystemBodyMember returns [EObject current=null] : iv_ruleSystemBodyMember= ruleSystemBodyMember EOF ;
    public final EObject entryRuleSystemBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1221:2: (iv_ruleSystemBodyMember= ruleSystemBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1222:2: iv_ruleSystemBodyMember= ruleSystemBodyMember EOF
            {
             newCompositeNode(grammarAccess.getSystemBodyMemberRule()); 
            pushFollow(FOLLOW_ruleSystemBodyMember_in_entryRuleSystemBodyMember2484);
            iv_ruleSystemBodyMember=ruleSystemBodyMember();

            state._fsp--;

             current =iv_ruleSystemBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemBodyMember2494); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemBodyMember"


    // $ANTLR start "ruleSystemBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1229:1: ruleSystemBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation ) ;
    public final EObject ruleSystemBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ATGCDefinition_3 = null;

        EObject this_PropertyDefinition_4 = null;

        EObject this_DeviceDefinition_5 = null;

        EObject this_ProcessInstantiation_6 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1232:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1233:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1233:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt28=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 50:
            case 51:
            case 52:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==33||(LA28_3>=47 && LA28_3<=48)) ) {
                    alt28=3;
                }
                else if ( (LA28_3==RULE_ID) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt28=4;
                }
                break;
            case 61:
                {
                alt28=5;
                }
                break;
            case 32:
                {
                alt28=6;
                }
                break;
            case 16:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1234:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getSystemBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleSystemBodyMember2541);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1244:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getSystemBodyMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleSystemBodyMember2568);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1254:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getSystemBodyMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleSystemBodyMember2595);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1264:5: this_ATGCDefinition_3= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getSystemBodyMemberAccess().getATGCDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleSystemBodyMember2622);
                    this_ATGCDefinition_3=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1274:5: this_PropertyDefinition_4= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getSystemBodyMemberAccess().getPropertyDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleSystemBodyMember2649);
                    this_PropertyDefinition_4=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1284:5: this_DeviceDefinition_5= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getSystemBodyMemberAccess().getDeviceDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleSystemBodyMember2676);
                    this_DeviceDefinition_5=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1294:5: this_ProcessInstantiation_6= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getSystemBodyMemberAccess().getProcessInstantiationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleSystemBodyMember2703);
                    this_ProcessInstantiation_6=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemBodyMember"


    // $ANTLR start "entryRulePlasmidBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1310:1: entryRulePlasmidBodyMember returns [EObject current=null] : iv_rulePlasmidBodyMember= rulePlasmidBodyMember EOF ;
    public final EObject entryRulePlasmidBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlasmidBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1311:2: (iv_rulePlasmidBodyMember= rulePlasmidBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1312:2: iv_rulePlasmidBodyMember= rulePlasmidBodyMember EOF
            {
             newCompositeNode(grammarAccess.getPlasmidBodyMemberRule()); 
            pushFollow(FOLLOW_rulePlasmidBodyMember_in_entryRulePlasmidBodyMember2738);
            iv_rulePlasmidBodyMember=rulePlasmidBodyMember();

            state._fsp--;

             current =iv_rulePlasmidBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlasmidBodyMember2748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlasmidBodyMember"


    // $ANTLR start "rulePlasmidBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1319:1: rulePlasmidBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation ) ;
    public final EObject rulePlasmidBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ATGCDefinition_3 = null;

        EObject this_PropertyDefinition_4 = null;

        EObject this_DeviceDefinition_5 = null;

        EObject this_ProcessInstantiation_6 = null;

        EObject this_SystemInstantiation_7 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1322:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1323:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1323:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1324:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_rulePlasmidBodyMember2795);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1334:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_rulePlasmidBodyMember2822);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1344:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rulePlasmidBodyMember2849);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1354:5: this_ATGCDefinition_3= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getATGCDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_rulePlasmidBodyMember2876);
                    this_ATGCDefinition_3=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1364:5: this_PropertyDefinition_4= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getPropertyDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_rulePlasmidBodyMember2903);
                    this_PropertyDefinition_4=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1374:5: this_DeviceDefinition_5= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getDeviceDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_rulePlasmidBodyMember2930);
                    this_DeviceDefinition_5=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1384:5: this_ProcessInstantiation_6= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getProcessInstantiationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_rulePlasmidBodyMember2957);
                    this_ProcessInstantiation_6=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1394:5: this_SystemInstantiation_7= ruleSystemInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getPlasmidBodyMemberAccess().getSystemInstantiationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSystemInstantiation_in_rulePlasmidBodyMember2984);
                    this_SystemInstantiation_7=ruleSystemInstantiation();

                    state._fsp--;

                     
                            current = this_SystemInstantiation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlasmidBodyMember"


    // $ANTLR start "entryRuleChromosomeBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1410:1: entryRuleChromosomeBodyMember returns [EObject current=null] : iv_ruleChromosomeBodyMember= ruleChromosomeBodyMember EOF ;
    public final EObject entryRuleChromosomeBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChromosomeBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1411:2: (iv_ruleChromosomeBodyMember= ruleChromosomeBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1412:2: iv_ruleChromosomeBodyMember= ruleChromosomeBodyMember EOF
            {
             newCompositeNode(grammarAccess.getChromosomeBodyMemberRule()); 
            pushFollow(FOLLOW_ruleChromosomeBodyMember_in_entryRuleChromosomeBodyMember3019);
            iv_ruleChromosomeBodyMember=ruleChromosomeBodyMember();

            state._fsp--;

             current =iv_ruleChromosomeBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChromosomeBodyMember3029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChromosomeBodyMember"


    // $ANTLR start "ruleChromosomeBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1419:1: ruleChromosomeBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation ) ;
    public final EObject ruleChromosomeBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ATGCDefinition_3 = null;

        EObject this_PropertyDefinition_4 = null;

        EObject this_DeviceDefinition_5 = null;

        EObject this_ProcessInstantiation_6 = null;

        EObject this_SystemInstantiation_7 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1422:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1423:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1423:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation )
            int alt30=8;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1424:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleChromosomeBodyMember3076);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1434:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleChromosomeBodyMember3103);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1444:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleChromosomeBodyMember3130);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1454:5: this_ATGCDefinition_3= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getATGCDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleChromosomeBodyMember3157);
                    this_ATGCDefinition_3=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1464:5: this_PropertyDefinition_4= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getPropertyDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleChromosomeBodyMember3184);
                    this_PropertyDefinition_4=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1474:5: this_DeviceDefinition_5= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getDeviceDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleChromosomeBodyMember3211);
                    this_DeviceDefinition_5=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:5: this_ProcessInstantiation_6= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getProcessInstantiationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleChromosomeBodyMember3238);
                    this_ProcessInstantiation_6=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1494:5: this_SystemInstantiation_7= ruleSystemInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getChromosomeBodyMemberAccess().getSystemInstantiationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSystemInstantiation_in_ruleChromosomeBodyMember3265);
                    this_SystemInstantiation_7=ruleSystemInstantiation();

                    state._fsp--;

                     
                            current = this_SystemInstantiation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChromosomeBodyMember"


    // $ANTLR start "entryRuleCellBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1510:1: entryRuleCellBodyMember returns [EObject current=null] : iv_ruleCellBodyMember= ruleCellBodyMember EOF ;
    public final EObject entryRuleCellBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1511:2: (iv_ruleCellBodyMember= ruleCellBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1512:2: iv_ruleCellBodyMember= ruleCellBodyMember EOF
            {
             newCompositeNode(grammarAccess.getCellBodyMemberRule()); 
            pushFollow(FOLLOW_ruleCellBodyMember_in_entryRuleCellBodyMember3300);
            iv_ruleCellBodyMember=ruleCellBodyMember();

            state._fsp--;

             current =iv_ruleCellBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellBodyMember3310); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellBodyMember"


    // $ANTLR start "ruleCellBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1519:1: ruleCellBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation ) ;
    public final EObject ruleCellBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ATGCDefinition_3 = null;

        EObject this_PropertyDefinition_4 = null;

        EObject this_DeviceDefinition_5 = null;

        EObject this_ProcessInstantiation_6 = null;

        EObject this_SystemInstantiation_7 = null;

        EObject this_PlasmidInstantiation_8 = null;

        EObject this_ChromosomeInstantiation_9 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1522:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1523:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1523:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation )
            int alt31=10;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1524:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleCellBodyMember3357);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1534:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleCellBodyMember3384);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1544:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleCellBodyMember3411);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1554:5: this_ATGCDefinition_3= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getATGCDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleCellBodyMember3438);
                    this_ATGCDefinition_3=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1564:5: this_PropertyDefinition_4= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getPropertyDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleCellBodyMember3465);
                    this_PropertyDefinition_4=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1574:5: this_DeviceDefinition_5= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getDeviceDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleCellBodyMember3492);
                    this_DeviceDefinition_5=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1584:5: this_ProcessInstantiation_6= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getProcessInstantiationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleCellBodyMember3519);
                    this_ProcessInstantiation_6=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1594:5: this_SystemInstantiation_7= ruleSystemInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getSystemInstantiationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSystemInstantiation_in_ruleCellBodyMember3546);
                    this_SystemInstantiation_7=ruleSystemInstantiation();

                    state._fsp--;

                     
                            current = this_SystemInstantiation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1604:5: this_PlasmidInstantiation_8= rulePlasmidInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getPlasmidInstantiationParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePlasmidInstantiation_in_ruleCellBodyMember3573);
                    this_PlasmidInstantiation_8=rulePlasmidInstantiation();

                    state._fsp--;

                     
                            current = this_PlasmidInstantiation_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1614:5: this_ChromosomeInstantiation_9= ruleChromosomeInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCellBodyMemberAccess().getChromosomeInstantiationParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleChromosomeInstantiation_in_ruleCellBodyMember3600);
                    this_ChromosomeInstantiation_9=ruleChromosomeInstantiation();

                    state._fsp--;

                     
                            current = this_ChromosomeInstantiation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellBodyMember"


    // $ANTLR start "entryRuleRegionBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1630:1: entryRuleRegionBodyMember returns [EObject current=null] : iv_ruleRegionBodyMember= ruleRegionBodyMember EOF ;
    public final EObject entryRuleRegionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1631:2: (iv_ruleRegionBodyMember= ruleRegionBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1632:2: iv_ruleRegionBodyMember= ruleRegionBodyMember EOF
            {
             newCompositeNode(grammarAccess.getRegionBodyMemberRule()); 
            pushFollow(FOLLOW_ruleRegionBodyMember_in_entryRuleRegionBodyMember3635);
            iv_ruleRegionBodyMember=ruleRegionBodyMember();

            state._fsp--;

             current =iv_ruleRegionBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionBodyMember3645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegionBodyMember"


    // $ANTLR start "ruleRegionBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1639:1: ruleRegionBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_CellInstantiation_3= ruleCellInstantiation ) ;
    public final EObject ruleRegionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_CellInstantiation_3 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1642:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_CellInstantiation_3= ruleCellInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1643:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_CellInstantiation_3= ruleCellInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1643:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_CellInstantiation_3= ruleCellInstantiation )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt32=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 50:
            case 51:
            case 52:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                int LA32_3 = input.LA(2);

                if ( (LA32_3==33||(LA32_3>=47 && LA32_3<=48)) ) {
                    alt32=3;
                }
                else if ( (LA32_3==RULE_ID) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1644:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getRegionBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleRegionBodyMember3692);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1654:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getRegionBodyMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleRegionBodyMember3719);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1664:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getRegionBodyMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleRegionBodyMember3746);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1674:5: this_CellInstantiation_3= ruleCellInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getRegionBodyMemberAccess().getCellInstantiationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCellInstantiation_in_ruleRegionBodyMember3773);
                    this_CellInstantiation_3=ruleCellInstantiation();

                    state._fsp--;

                     
                            current = this_CellInstantiation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegionBodyMember"


    // $ANTLR start "entryRuleCustomFunctionBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1690:1: entryRuleCustomFunctionBodyMember returns [EObject current=null] : iv_ruleCustomFunctionBodyMember= ruleCustomFunctionBodyMember EOF ;
    public final EObject entryRuleCustomFunctionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFunctionBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1691:2: (iv_ruleCustomFunctionBodyMember= ruleCustomFunctionBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1692:2: iv_ruleCustomFunctionBodyMember= ruleCustomFunctionBodyMember EOF
            {
             newCompositeNode(grammarAccess.getCustomFunctionBodyMemberRule()); 
            pushFollow(FOLLOW_ruleCustomFunctionBodyMember_in_entryRuleCustomFunctionBodyMember3808);
            iv_ruleCustomFunctionBodyMember=ruleCustomFunctionBodyMember();

            state._fsp--;

             current =iv_ruleCustomFunctionBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomFunctionBodyMember3818); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFunctionBodyMember"


    // $ANTLR start "ruleCustomFunctionBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1699:1: ruleCustomFunctionBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation ) ;
    public final EObject ruleCustomFunctionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ATGCDefinition_3 = null;

        EObject this_PropertyDefinition_4 = null;

        EObject this_DeviceDefinition_5 = null;

        EObject this_ProcessInstantiation_6 = null;

        EObject this_SystemInstantiation_7 = null;

        EObject this_PlasmidInstantiation_8 = null;

        EObject this_ChromosomeInstantiation_9 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1702:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1703:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1703:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation )
            int alt33=10;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1704:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleCustomFunctionBodyMember3865);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1714:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleCustomFunctionBodyMember3892);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1724:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleCustomFunctionBodyMember3919);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1734:5: this_ATGCDefinition_3= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getATGCDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleCustomFunctionBodyMember3946);
                    this_ATGCDefinition_3=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1744:5: this_PropertyDefinition_4= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getPropertyDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleCustomFunctionBodyMember3973);
                    this_PropertyDefinition_4=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1754:5: this_DeviceDefinition_5= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getDeviceDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleCustomFunctionBodyMember4000);
                    this_DeviceDefinition_5=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1764:5: this_ProcessInstantiation_6= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getProcessInstantiationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleCustomFunctionBodyMember4027);
                    this_ProcessInstantiation_6=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1774:5: this_SystemInstantiation_7= ruleSystemInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getSystemInstantiationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSystemInstantiation_in_ruleCustomFunctionBodyMember4054);
                    this_SystemInstantiation_7=ruleSystemInstantiation();

                    state._fsp--;

                     
                            current = this_SystemInstantiation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1784:5: this_PlasmidInstantiation_8= rulePlasmidInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getPlasmidInstantiationParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePlasmidInstantiation_in_ruleCustomFunctionBodyMember4081);
                    this_PlasmidInstantiation_8=rulePlasmidInstantiation();

                    state._fsp--;

                     
                            current = this_PlasmidInstantiation_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1794:5: this_ChromosomeInstantiation_9= ruleChromosomeInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getCustomFunctionBodyMemberAccess().getChromosomeInstantiationParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleChromosomeInstantiation_in_ruleCustomFunctionBodyMember4108);
                    this_ChromosomeInstantiation_9=ruleChromosomeInstantiation();

                    state._fsp--;

                     
                            current = this_ChromosomeInstantiation_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFunctionBodyMember"


    // $ANTLR start "entryRuleFunctionParameterMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1810:1: entryRuleFunctionParameterMember returns [EObject current=null] : iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF ;
    public final EObject entryRuleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1811:2: (iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1812:2: iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember4143);
            iv_ruleFunctionParameterMember=ruleFunctionParameterMember();

            state._fsp--;

             current =iv_ruleFunctionParameterMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember4153); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionParameterMember"


    // $ANTLR start "ruleFunctionParameterMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1819:1: ruleFunctionParameterMember returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? ) ;
    public final EObject ruleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_collection_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_1 = null;

        AntlrDatatypeRuleToken lv_type_3_2 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_scope_7_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1822:28: ( ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:1: ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:1: ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:2: ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:2: ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=36 && LA35_0<=46)) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=50 && LA35_0<=52)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:3: ( (lv_type_0_0= ruleVariableType ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:3: ( (lv_type_0_0= ruleVariableType ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1824:1: (lv_type_0_0= ruleVariableType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1824:1: (lv_type_0_0= ruleVariableType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1825:3: lv_type_0_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionParameterMember4200);
                    lv_type_0_0=ruleVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"VariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1842:6: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1842:6: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1842:7: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>'
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1842:7: ( (lv_collection_1_0= ruleCollectionID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1843:1: (lv_collection_1_0= ruleCollectionID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1843:1: (lv_collection_1_0= ruleCollectionID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1844:3: lv_collection_1_0= ruleCollectionID
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getCollectionCollectionIDParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionID_in_ruleFunctionParameterMember4228);
                    lv_collection_1_0=ruleCollectionID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
                    	        }
                           		set(
                           			current, 
                           			"collection",
                            		lv_collection_1_0, 
                            		"CollectionID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFunctionParameterMember4240); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterMemberAccess().getLessThanSignKeyword_0_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1864:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1865:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1865:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1866:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1866:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=36 && LA34_0<=46)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RULE_ID) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1867:3: lv_type_3_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableTypeParserRuleCall_0_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionParameterMember4263);
                            lv_type_3_1=ruleVariableType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_3_1, 
                                    		"VariableType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1882:8: lv_type_3_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableNameParserRuleCall_0_1_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionParameterMember4282);
                            lv_type_3_2=ruleVariableName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_3_2, 
                                    		"VariableName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleFunctionParameterMember4297); 

                        	newLeafNode(otherlv_4, grammarAccess.getFunctionParameterMemberAccess().getGreaterThanSignKeyword_0_1_3());
                        

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1904:3: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1905:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1905:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1906:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionParameterMember4320);
            lv_name_5_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1922:2: (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1922:4: otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleFunctionParameterMember4333); 

                        	newLeafNode(otherlv_6, grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:1: ( (lv_scope_7_0= ruleFunctionParameterScope ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1927:1: (lv_scope_7_0= ruleFunctionParameterScope )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1927:1: (lv_scope_7_0= ruleFunctionParameterScope )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1928:3: lv_scope_7_0= ruleFunctionParameterScope
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getScopeFunctionParameterScopeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember4354);
                    lv_scope_7_0=ruleFunctionParameterScope();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
                    	        }
                           		set(
                           			current, 
                           			"scope",
                            		lv_scope_7_0, 
                            		"FunctionParameterScope");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionParameterMember"


    // $ANTLR start "entryRuleFunctionParameterScope"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1952:1: entryRuleFunctionParameterScope returns [String current=null] : iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF ;
    public final String entryRuleFunctionParameterScope() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionParameterScope = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1953:2: (iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1954:2: iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterScopeRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope4393);
            iv_ruleFunctionParameterScope=ruleFunctionParameterScope();

            state._fsp--;

             current =iv_ruleFunctionParameterScope.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterScope4404); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionParameterScope"


    // $ANTLR start "ruleFunctionParameterScope"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1961:1: ruleFunctionParameterScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'input' | kw= 'output' | kw= 'optional' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionParameterScope() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1964:28: ( (kw= 'input' | kw= 'output' | kw= 'optional' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1965:1: (kw= 'input' | kw= 'output' | kw= 'optional' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1965:1: (kw= 'input' | kw= 'output' | kw= 'optional' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt37=1;
                }
                break;
            case 30:
                {
                alt37=2;
                }
                break;
            case 31:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1966:2: kw= 'input'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleFunctionParameterScope4442); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getInputKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1973:2: kw= 'output'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleFunctionParameterScope4461); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getOutputKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1980:2: kw= 'optional'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleFunctionParameterScope4480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getOptionalKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionParameterScope"


    // $ANTLR start "entryRuleFunctionUseMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1993:1: entryRuleFunctionUseMember returns [EObject current=null] : iv_ruleFunctionUseMember= ruleFunctionUseMember EOF ;
    public final EObject entryRuleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUseMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1994:2: (iv_ruleFunctionUseMember= ruleFunctionUseMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1995:2: iv_ruleFunctionUseMember= ruleFunctionUseMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionUseMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember4520);
            iv_ruleFunctionUseMember=ruleFunctionUseMember();

            state._fsp--;

             current =iv_ruleFunctionUseMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUseMember4530); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionUseMember"


    // $ANTLR start "ruleFunctionUseMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2002:1: ruleFunctionUseMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) ;
    public final EObject ruleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2005:28: ( ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2006:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2006:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2006:2: ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2006:2: ( (lv_type_0_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2007:1: (lv_type_0_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2007:1: (lv_type_0_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2008:3: lv_type_0_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getTypeVariableTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionUseMember4576);
            lv_type_0_0=ruleVariableType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionUseMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"VariableType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2024:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2025:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2025:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2026:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionUseMember4597);
            lv_name_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionUseMemberRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionUseMember"


    // $ANTLR start "entryRuleDeviceDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2050:1: entryRuleDeviceDefinition returns [EObject current=null] : iv_ruleDeviceDefinition= ruleDeviceDefinition EOF ;
    public final EObject entryRuleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2051:2: (iv_ruleDeviceDefinition= ruleDeviceDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2052:2: iv_ruleDeviceDefinition= ruleDeviceDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeviceDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition4633);
            iv_ruleDeviceDefinition=ruleDeviceDefinition();

            state._fsp--;

             current =iv_ruleDeviceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDefinition4643); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceDefinition"


    // $ANTLR start "ruleDeviceDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2059:1: ruleDeviceDefinition returns [EObject current=null] : ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' ) ;
    public final EObject ruleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parts_9_0 = null;

        EObject lv_input_14_0 = null;

        EObject lv_outputput_18_0 = null;

        EObject lv_members_21_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2062:28: ( ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2063:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2063:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2063:2: () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2063:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2064:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition4689); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2073:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2074:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2074:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2075:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeviceDefinition4710);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition4722); 

                	newLeafNode(otherlv_3, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleDeviceDefinition4734); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceDefinitionAccess().getNewKeyword_4());
                
            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition4746); 

                	newLeafNode(otherlv_5, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition4758); 

                	newLeafNode(otherlv_6, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleDeviceDefinition4770); 

                	newLeafNode(otherlv_7, grammarAccess.getDeviceDefinitionAccess().getPartsKeyword_7());
                
            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition4782); 

                	newLeafNode(otherlv_8, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2115:1: ( (lv_parts_9_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2116:1: (lv_parts_9_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2116:1: (lv_parts_9_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2117:3: lv_parts_9_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getPartsListParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition4803);
            lv_parts_9_0=ruleList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"parts",
                    		lv_parts_9_0, 
                    		"List");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition4815); 

                	newLeafNode(otherlv_10, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10());
                
            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition4827); 

                	newLeafNode(otherlv_11, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_11());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2141:1: (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2141:3: otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleDeviceDefinition4840); 

                        	newLeafNode(otherlv_12, grammarAccess.getDeviceDefinitionAccess().getInputKeyword_12_0());
                        
                    otherlv_13=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition4852); 

                        	newLeafNode(otherlv_13, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_12_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2149:1: ( (lv_input_14_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2150:1: (lv_input_14_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2150:1: (lv_input_14_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2151:3: lv_input_14_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getInputListParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition4873);
                    lv_input_14_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"input",
                            		lv_input_14_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2167:4: (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2167:6: otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) )
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleDeviceDefinition4888); 

                        	newLeafNode(otherlv_15, grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_13_0());
                        
                    otherlv_16=(Token)match(input,30,FOLLOW_30_in_ruleDeviceDefinition4900); 

                        	newLeafNode(otherlv_16, grammarAccess.getDeviceDefinitionAccess().getOutputKeyword_13_1());
                        
                    otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition4912); 

                        	newLeafNode(otherlv_17, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_13_2());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2179:1: ( (lv_outputput_18_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2180:1: (lv_outputput_18_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2180:1: (lv_outputput_18_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2181:3: lv_outputput_18_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getOutputputListParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition4933);
                    lv_outputput_18_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"outputput",
                            		lv_outputput_18_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition4947); 

                	newLeafNode(otherlv_19, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_14());
                
            otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleDeviceDefinition4959); 

                	newLeafNode(otherlv_20, grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_15());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2205:1: ( (lv_members_21_0= ruleDeviceMembers ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==16||(LA40_0>=36 && LA40_0<=46)||(LA40_0>=50 && LA40_0<=52)||LA40_0==59||LA40_0==61) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2206:1: (lv_members_21_0= ruleDeviceMembers )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2206:1: (lv_members_21_0= ruleDeviceMembers )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2207:3: lv_members_21_0= ruleDeviceMembers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getMembersDeviceMembersParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition4980);
            	    lv_members_21_0=ruleDeviceMembers();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_21_0, 
            	            		"DeviceMembers");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_20_in_ruleDeviceDefinition4993); 

                	newLeafNode(otherlv_22, grammarAccess.getDeviceDefinitionAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceDefinition"


    // $ANTLR start "entryRuleDeviceMembers"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2235:1: entryRuleDeviceMembers returns [EObject current=null] : iv_ruleDeviceMembers= ruleDeviceMembers EOF ;
    public final EObject entryRuleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceMembers = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2236:2: (iv_ruleDeviceMembers= ruleDeviceMembers EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2237:2: iv_ruleDeviceMembers= ruleDeviceMembers EOF
            {
             newCompositeNode(grammarAccess.getDeviceMembersRule()); 
            pushFollow(FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5029);
            iv_ruleDeviceMembers=ruleDeviceMembers();

            state._fsp--;

             current =iv_ruleDeviceMembers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceMembers5039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceMembers"


    // $ANTLR start "ruleDeviceMembers"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2244:1: ruleDeviceMembers returns [EObject current=null] : (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation ) ;
    public final EObject ruleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;

        EObject this_PropertyDefinition_1 = null;

        EObject this_ATGCDefinition_2 = null;

        EObject this_ProcessInstantiation_3 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2247:28: ( (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2248:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2248:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation )
            int alt41=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 50:
            case 51:
            case 52:
                {
                alt41=1;
                }
                break;
            case 61:
                {
                alt41=2;
                }
                break;
            case 59:
                {
                alt41=3;
                }
                break;
            case 16:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2249:5: this_VariableDefinition_0= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5086);
                    this_VariableDefinition_0=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2259:5: this_PropertyDefinition_1= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getPropertyDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5113);
                    this_PropertyDefinition_1=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2269:5: this_ATGCDefinition_2= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getATGCDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5140);
                    this_ATGCDefinition_2=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2279:5: this_ProcessInstantiation_3= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getProcessInstantiationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleDeviceMembers5167);
                    this_ProcessInstantiation_3=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceMembers"


    // $ANTLR start "entryRuleProcessInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2295:1: entryRuleProcessInstantiation returns [EObject current=null] : iv_ruleProcessInstantiation= ruleProcessInstantiation EOF ;
    public final EObject entryRuleProcessInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2296:2: (iv_ruleProcessInstantiation= ruleProcessInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2297:2: iv_ruleProcessInstantiation= ruleProcessInstantiation EOF
            {
             newCompositeNode(grammarAccess.getProcessInstantiationRule()); 
            pushFollow(FOLLOW_ruleProcessInstantiation_in_entryRuleProcessInstantiation5202);
            iv_ruleProcessInstantiation=ruleProcessInstantiation();

            state._fsp--;

             current =iv_ruleProcessInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessInstantiation5212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessInstantiation"


    // $ANTLR start "ruleProcessInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2304:1: ruleProcessInstantiation returns [EObject current=null] : ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject ruleProcessInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constructor_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2307:28: ( ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:1: ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:1: ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:2: () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2309:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessInstantiationAccess().getProcessInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProcessInstantiation5258); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessInstantiationAccess().getPROCESSKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2318:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2319:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2319:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2320:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleProcessInstantiation5279);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2336:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2336:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleProcessInstantiation5292); 

                        	newLeafNode(otherlv_3, grammarAccess.getProcessInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleProcessInstantiation5304); 

                        	newLeafNode(otherlv_4, grammarAccess.getProcessInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2344:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2345:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2345:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2346:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleProcessInstantiation5325);
                    lv_constructor_5_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessInstantiationRule());
                    	        }
                           		set(
                           			current, 
                           			"constructor",
                            		lv_constructor_5_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleProcessInstantiation5337); 

                        	newLeafNode(otherlv_6, grammarAccess.getProcessInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2367:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2367:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2368:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation5359);
                            lv_parameters_7_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProcessInstantiationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2384:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==15) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2384:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleProcessInstantiation5372); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getProcessInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2388:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2389:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2389:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2390:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation5393);
                            	    lv_parameters_9_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getProcessInstantiationRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_9_0, 
                            	            		"ParameterAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleProcessInstantiation5409); 

                        	newLeafNode(otherlv_10, grammarAccess.getProcessInstantiationAccess().getRightParenthesisKeyword_3_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessInstantiation"


    // $ANTLR start "entryRuleSystemInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2418:1: entryRuleSystemInstantiation returns [EObject current=null] : iv_ruleSystemInstantiation= ruleSystemInstantiation EOF ;
    public final EObject entryRuleSystemInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2419:2: (iv_ruleSystemInstantiation= ruleSystemInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2420:2: iv_ruleSystemInstantiation= ruleSystemInstantiation EOF
            {
             newCompositeNode(grammarAccess.getSystemInstantiationRule()); 
            pushFollow(FOLLOW_ruleSystemInstantiation_in_entryRuleSystemInstantiation5447);
            iv_ruleSystemInstantiation=ruleSystemInstantiation();

            state._fsp--;

             current =iv_ruleSystemInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemInstantiation5457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemInstantiation"


    // $ANTLR start "ruleSystemInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2427:1: ruleSystemInstantiation returns [EObject current=null] : ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject ruleSystemInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constructor_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2430:28: ( ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2431:1: ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2431:1: ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2431:2: () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2431:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2432:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSystemInstantiationAccess().getSystemInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSystemInstantiation5503); 

                	newLeafNode(otherlv_1, grammarAccess.getSystemInstantiationAccess().getSYSTEMKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2441:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2442:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2442:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2443:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleSystemInstantiation5524);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2459:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==33) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2459:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleSystemInstantiation5537); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleSystemInstantiation5549); 

                        	newLeafNode(otherlv_4, grammarAccess.getSystemInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2467:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2468:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2468:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2469:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleSystemInstantiation5570);
                    lv_constructor_5_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemInstantiationRule());
                    	        }
                           		set(
                           			current, 
                           			"constructor",
                            		lv_constructor_5_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSystemInstantiation5582); 

                        	newLeafNode(otherlv_6, grammarAccess.getSystemInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2489:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2489:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2489:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2490:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2490:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2491:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation5604);
                            lv_parameters_7_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSystemInstantiationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2507:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==15) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2507:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSystemInstantiation5617); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getSystemInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2511:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2512:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2512:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2513:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation5638);
                            	    lv_parameters_9_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSystemInstantiationRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_9_0, 
                            	            		"ParameterAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleSystemInstantiation5654); 

                        	newLeafNode(otherlv_10, grammarAccess.getSystemInstantiationAccess().getRightParenthesisKeyword_3_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemInstantiation"


    // $ANTLR start "entryRulePlasmidInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2541:1: entryRulePlasmidInstantiation returns [EObject current=null] : iv_rulePlasmidInstantiation= rulePlasmidInstantiation EOF ;
    public final EObject entryRulePlasmidInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlasmidInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2542:2: (iv_rulePlasmidInstantiation= rulePlasmidInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2543:2: iv_rulePlasmidInstantiation= rulePlasmidInstantiation EOF
            {
             newCompositeNode(grammarAccess.getPlasmidInstantiationRule()); 
            pushFollow(FOLLOW_rulePlasmidInstantiation_in_entryRulePlasmidInstantiation5692);
            iv_rulePlasmidInstantiation=rulePlasmidInstantiation();

            state._fsp--;

             current =iv_rulePlasmidInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlasmidInstantiation5702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlasmidInstantiation"


    // $ANTLR start "rulePlasmidInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2550:1: rulePlasmidInstantiation returns [EObject current=null] : ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject rulePlasmidInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constructor_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2553:28: ( ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2554:1: ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2554:1: ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2554:2: () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2554:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2555:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPlasmidInstantiationAccess().getPlasmidInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePlasmidInstantiation5748); 

                	newLeafNode(otherlv_1, grammarAccess.getPlasmidInstantiationAccess().getPLASMIDKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2564:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2565:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2565:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2566:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_rulePlasmidInstantiation5769);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlasmidInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2582:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2582:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_rulePlasmidInstantiation5782); 

                        	newLeafNode(otherlv_3, grammarAccess.getPlasmidInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePlasmidInstantiation5794); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlasmidInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2590:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2591:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2591:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2592:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_rulePlasmidInstantiation5815);
                    lv_constructor_5_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlasmidInstantiationRule());
                    	        }
                           		set(
                           			current, 
                           			"constructor",
                            		lv_constructor_5_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_rulePlasmidInstantiation5827); 

                        	newLeafNode(otherlv_6, grammarAccess.getPlasmidInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2612:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2612:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2612:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2613:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2613:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2614:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation5849);
                            lv_parameters_7_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPlasmidInstantiationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2630:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==15) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2630:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_rulePlasmidInstantiation5862); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getPlasmidInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2634:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2635:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2635:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2636:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation5883);
                            	    lv_parameters_9_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPlasmidInstantiationRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_9_0, 
                            	            		"ParameterAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_rulePlasmidInstantiation5899); 

                        	newLeafNode(otherlv_10, grammarAccess.getPlasmidInstantiationAccess().getRightParenthesisKeyword_3_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlasmidInstantiation"


    // $ANTLR start "entryRuleChromosomeInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2664:1: entryRuleChromosomeInstantiation returns [EObject current=null] : iv_ruleChromosomeInstantiation= ruleChromosomeInstantiation EOF ;
    public final EObject entryRuleChromosomeInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChromosomeInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2665:2: (iv_ruleChromosomeInstantiation= ruleChromosomeInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2666:2: iv_ruleChromosomeInstantiation= ruleChromosomeInstantiation EOF
            {
             newCompositeNode(grammarAccess.getChromosomeInstantiationRule()); 
            pushFollow(FOLLOW_ruleChromosomeInstantiation_in_entryRuleChromosomeInstantiation5937);
            iv_ruleChromosomeInstantiation=ruleChromosomeInstantiation();

            state._fsp--;

             current =iv_ruleChromosomeInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChromosomeInstantiation5947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChromosomeInstantiation"


    // $ANTLR start "ruleChromosomeInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2673:1: ruleChromosomeInstantiation returns [EObject current=null] : ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject ruleChromosomeInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constructor_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2676:28: ( ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2677:1: ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2677:1: ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2677:2: () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2677:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2678:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChromosomeInstantiationAccess().getChromosomeInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleChromosomeInstantiation5993); 

                	newLeafNode(otherlv_1, grammarAccess.getChromosomeInstantiationAccess().getCHROMOSOMEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2687:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2688:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2688:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2689:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation6014);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChromosomeInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2705:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==33) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2705:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleChromosomeInstantiation6027); 

                        	newLeafNode(otherlv_3, grammarAccess.getChromosomeInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleChromosomeInstantiation6039); 

                        	newLeafNode(otherlv_4, grammarAccess.getChromosomeInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2713:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2714:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2714:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2715:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation6060);
                    lv_constructor_5_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChromosomeInstantiationRule());
                    	        }
                           		set(
                           			current, 
                           			"constructor",
                            		lv_constructor_5_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleChromosomeInstantiation6072); 

                        	newLeafNode(otherlv_6, grammarAccess.getChromosomeInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2735:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_ID) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2735:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2735:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2736:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2736:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2737:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation6094);
                            lv_parameters_7_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getChromosomeInstantiationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2753:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==15) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2753:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleChromosomeInstantiation6107); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getChromosomeInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2757:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2758:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2758:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2759:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation6128);
                            	    lv_parameters_9_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getChromosomeInstantiationRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_9_0, 
                            	            		"ParameterAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleChromosomeInstantiation6144); 

                        	newLeafNode(otherlv_10, grammarAccess.getChromosomeInstantiationAccess().getRightParenthesisKeyword_3_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChromosomeInstantiation"


    // $ANTLR start "entryRuleCellInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2787:1: entryRuleCellInstantiation returns [EObject current=null] : iv_ruleCellInstantiation= ruleCellInstantiation EOF ;
    public final EObject entryRuleCellInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2788:2: (iv_ruleCellInstantiation= ruleCellInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2789:2: iv_ruleCellInstantiation= ruleCellInstantiation EOF
            {
             newCompositeNode(grammarAccess.getCellInstantiationRule()); 
            pushFollow(FOLLOW_ruleCellInstantiation_in_entryRuleCellInstantiation6182);
            iv_ruleCellInstantiation=ruleCellInstantiation();

            state._fsp--;

             current =iv_ruleCellInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellInstantiation6192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellInstantiation"


    // $ANTLR start "ruleCellInstantiation"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2796:1: ruleCellInstantiation returns [EObject current=null] : ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject ruleCellInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constructor_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2799:28: ( ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2800:1: ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2800:1: ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2800:2: () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2800:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2801:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCellInstantiationAccess().getCellInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCellInstantiation6238); 

                	newLeafNode(otherlv_1, grammarAccess.getCellInstantiationAccess().getCELLKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2810:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2811:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2811:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2812:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleCellInstantiation6259);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCellInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2828:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==33) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2828:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleCellInstantiation6272); 

                        	newLeafNode(otherlv_3, grammarAccess.getCellInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleCellInstantiation6284); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2836:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2837:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2837:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2838:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleCellInstantiation6305);
                    lv_constructor_5_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellInstantiationRule());
                    	        }
                           		set(
                           			current, 
                           			"constructor",
                            		lv_constructor_5_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleCellInstantiation6317); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2858:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_ID) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2858:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2858:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2859:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2859:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2860:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation6339);
                            lv_parameters_7_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCellInstantiationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2876:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==15) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2876:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleCellInstantiation6352); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getCellInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2880:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2881:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2881:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2882:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation6373);
                            	    lv_parameters_9_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCellInstantiationRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_9_0, 
                            	            		"ParameterAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleCellInstantiation6389); 

                        	newLeafNode(otherlv_10, grammarAccess.getCellInstantiationAccess().getRightParenthesisKeyword_3_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellInstantiation"


    // $ANTLR start "entryRuleVariableName"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2910:1: entryRuleVariableName returns [String current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final String entryRuleVariableName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2911:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2912:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName6428);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName6439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2919:1: ruleVariableName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVariableName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2922:28: (this_ID_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2923:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableName6478); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getVariableNameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleVariableType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2938:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2939:2: (iv_ruleVariableType= ruleVariableType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2940:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType6523);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType6534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2947:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2950:28: ( (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2951:1: (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2951:1: (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' )
            int alt57=11;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt57=1;
                }
                break;
            case 37:
                {
                alt57=2;
                }
                break;
            case 38:
                {
                alt57=3;
                }
                break;
            case 39:
                {
                alt57=4;
                }
                break;
            case 40:
                {
                alt57=5;
                }
                break;
            case 41:
                {
                alt57=6;
                }
                break;
            case 42:
                {
                alt57=7;
                }
                break;
            case 43:
                {
                alt57=8;
                }
                break;
            case 44:
                {
                alt57=9;
                }
                break;
            case 45:
                {
                alt57=10;
                }
                break;
            case 46:
                {
                alt57=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2952:2: kw= 'MOLECULE'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVariableType6572); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getMOLECULEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2959:2: kw= 'CHASSIS'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVariableType6591); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCHASSISKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2966:2: kw= 'COMPLEX'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVariableType6610); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCOMPLEXKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2973:2: kw= 'RIBOSOME'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVariableType6629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRIBOSOMEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2980:2: kw= 'PROMOTER'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVariableType6648); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROMOTERKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2987:2: kw= 'PROTEIN'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVariableType6667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROTEINKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2994:2: kw= 'DNA'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVariableType6686); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getDNAKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3001:2: kw= 'RNA'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVariableType6705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRNAKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3008:2: kw= 'GENE'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVariableType6724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getGENEKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3015:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVariableType6743); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTEGERKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3022:2: kw= 'RATE'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVariableType6762); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRATEKeyword_10()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleVariableComplex"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3035:1: entryRuleVariableComplex returns [EObject current=null] : iv_ruleVariableComplex= ruleVariableComplex EOF ;
    public final EObject entryRuleVariableComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableComplex = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3036:2: (iv_ruleVariableComplex= ruleVariableComplex EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3037:2: iv_ruleVariableComplex= ruleVariableComplex EOF
            {
             newCompositeNode(grammarAccess.getVariableComplexRule()); 
            pushFollow(FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex6802);
            iv_ruleVariableComplex=ruleVariableComplex();

            state._fsp--;

             current =iv_ruleVariableComplex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableComplex6812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableComplex"


    // $ANTLR start "ruleVariableComplex"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3044:1: ruleVariableComplex returns [EObject current=null] : ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) ;
    public final EObject ruleVariableComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_components_1_0 = null;

        AntlrDatatypeRuleToken lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3047:28: ( ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3048:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3048:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3048:2: () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3048:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3049:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableComplexAccess().getVariableComplexAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3054:2: ( (lv_components_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3055:1: (lv_components_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3055:1: (lv_components_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3056:3: lv_components_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex6867);
            lv_components_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableComplexRule());
            	        }
                   		add(
                   			current, 
                   			"components",
                    		lv_components_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3072:2: (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==47) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3072:4: otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) )
            	    {
            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleVariableComplex6880); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVariableComplexAccess().getTildeKeyword_2_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3076:1: ( (lv_components_3_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3077:1: (lv_components_3_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3077:1: (lv_components_3_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3078:3: lv_components_3_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex6901);
            	    lv_components_3_0=ruleVariableName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariableComplexRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_3_0, 
            	            		"VariableName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableComplex"


    // $ANTLR start "entryRuleVariableAttribute"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3102:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3103:2: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3104:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute6939);
            iv_ruleVariableAttribute=ruleVariableAttribute();

            state._fsp--;

             current =iv_ruleVariableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute6949); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAttribute"


    // $ANTLR start "ruleVariableAttribute"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3111:1: ruleVariableAttribute returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_complex_2_0 = null;

        AntlrDatatypeRuleToken lv_attribute_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3114:28: ( ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3115:1: ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3115:1: ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3115:2: () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3115:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3116:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3121:2: ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==47) ) {
                    alt59=2;
                }
                else if ( (LA59_1==48) ) {
                    alt59=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3121:3: ( (lv_name_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3121:3: ( (lv_name_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3122:1: (lv_name_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3122:1: (lv_name_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3123:3: lv_name_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getNameVariableNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute7005);
                    lv_name_1_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3140:6: ( (lv_complex_2_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3140:6: ( (lv_complex_2_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3141:1: (lv_complex_2_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3141:1: (lv_complex_2_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3142:3: lv_complex_2_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getComplexVariableComplexParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleVariableAttribute7032);
                    lv_complex_2_0=ruleVariableComplex();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"complex",
                            		lv_complex_2_0, 
                            		"VariableComplex");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleVariableAttribute7045); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3162:1: ( (lv_attribute_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3163:1: (lv_attribute_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3163:1: (lv_attribute_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3164:3: lv_attribute_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getAttributeVariableNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute7066);
            lv_attribute_4_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_4_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAttribute"


    // $ANTLR start "entryRuleVariableDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3188:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3189:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3190:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition7102);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition7112); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3197:1: ruleVariableDefinition returns [EObject current=null] : ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_definition_1_1 = null;

        EObject lv_definition_1_2 = null;

        EObject lv_definition_1_3 = null;

        EObject lv_definition_1_4 = null;

        AntlrDatatypeRuleToken lv_qualifier_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3200:28: ( ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3201:1: ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3201:1: ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3201:2: () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3201:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3202:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3207:2: ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3208:1: ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3208:1: ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3209:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3209:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )
            int alt60=4;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3210:3: lv_definition_1_1= ruleVariableDefinitionBuiltIn
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBuiltInParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition7169);
                    lv_definition_1_1=ruleVariableDefinitionBuiltIn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_1_1, 
                            		"VariableDefinitionBuiltIn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3225:8: lv_definition_1_2= ruleVariableDefinitionUserDefined
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionUserDefinedParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition7188);
                    lv_definition_1_2=ruleVariableDefinitionUserDefined();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_1_2, 
                            		"VariableDefinitionUserDefined");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3240:8: lv_definition_1_3= ruleVariableDefinitionCollection
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionCollectionParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition7207);
                    lv_definition_1_3=ruleVariableDefinitionCollection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_1_3, 
                            		"VariableDefinitionCollection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3255:8: lv_definition_1_4= ruleVariableDefinitionBasic
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBasicParserRuleCall_1_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition7226);
                    lv_definition_1_4=ruleVariableDefinitionBasic();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_1_4, 
                            		"VariableDefinitionBasic");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3273:2: (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==28) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3273:4: otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleVariableDefinition7242); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionAccess().getColonKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3277:1: ( (lv_qualifier_3_0= ruleVariableQualifier ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3278:1: (lv_qualifier_3_0= ruleVariableQualifier )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3278:1: (lv_qualifier_3_0= ruleVariableQualifier )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3279:3: lv_qualifier_3_0= ruleVariableQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getQualifierVariableQualifierParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition7263);
                    lv_qualifier_3_0=ruleVariableQualifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"qualifier",
                            		lv_qualifier_3_0, 
                            		"VariableQualifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleVariableQualifier"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3303:1: entryRuleVariableQualifier returns [String current=null] : iv_ruleVariableQualifier= ruleVariableQualifier EOF ;
    public final String entryRuleVariableQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableQualifier = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3304:2: (iv_ruleVariableQualifier= ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3305:2: iv_ruleVariableQualifier= ruleVariableQualifier EOF
            {
             newCompositeNode(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier7302);
            iv_ruleVariableQualifier=ruleVariableQualifier();

            state._fsp--;

             current =iv_ruleVariableQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier7313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableQualifier"


    // $ANTLR start "ruleVariableQualifier"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3312:1: ruleVariableQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'observable' ;
    public final AntlrDatatypeRuleToken ruleVariableQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3315:28: (kw= 'observable' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3317:2: kw= 'observable'
            {
            kw=(Token)match(input,49,FOLLOW_49_in_ruleVariableQualifier7350); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariableQualifierAccess().getObservableKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableQualifier"


    // $ANTLR start "entryRuleVariableDefinitionBuiltIn"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3330:1: entryRuleVariableDefinitionBuiltIn returns [EObject current=null] : iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF ;
    public final EObject entryRuleVariableDefinitionBuiltIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBuiltIn = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3331:2: (iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3332:2: iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBuiltInRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn7389);
            iv_ruleVariableDefinitionBuiltIn=ruleVariableDefinitionBuiltIn();

            state._fsp--;

             current =iv_ruleVariableDefinitionBuiltIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn7399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinitionBuiltIn"


    // $ANTLR start "ruleVariableDefinitionBuiltIn"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3339:1: ruleVariableDefinitionBuiltIn returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) ;
    public final EObject ruleVariableDefinitionBuiltIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_complex_3_0 = null;

        AntlrDatatypeRuleToken lv_constructor_6_1 = null;

        AntlrDatatypeRuleToken lv_constructor_6_2 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3342:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3343:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3343:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3343:2: () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3343:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3344:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBuiltInAccess().getVariableDefinitionBuiltInAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3349:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3350:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3350:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3351:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn7454);
            lv_type_1_0=ruleVariableType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"VariableType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3367:2: ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==EOF||LA62_1==RULE_ID||LA62_1==16||(LA62_1>=20 && LA62_1<=24)||LA62_1==28||(LA62_1>=32 && LA62_1<=33)||(LA62_1>=36 && LA62_1<=46)||(LA62_1>=50 && LA62_1<=52)||LA62_1==56||LA62_1==59||LA62_1==61) ) {
                    alt62=1;
                }
                else if ( (LA62_1==47) ) {
                    alt62=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3367:3: ( (lv_name_2_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3367:3: ( (lv_name_2_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3368:1: (lv_name_2_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3368:1: (lv_name_2_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3369:3: lv_name_2_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getNameVariableNameParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn7476);
                    lv_name_2_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3386:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3386:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3387:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3387:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3388:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getComplexVariableComplexParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn7503);
                    lv_complex_3_0=ruleVariableComplex();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                    	        }
                           		set(
                           			current, 
                           			"complex",
                            		lv_complex_3_0, 
                            		"VariableComplex");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3404:3: (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==33) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3404:5: otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionBuiltIn7517); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionBuiltInAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleVariableDefinitionBuiltIn7529); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionBuiltInAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3412:1: ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3413:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3413:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3414:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3414:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=36 && LA63_0<=46)) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==RULE_ID) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3415:3: lv_constructor_6_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableTypeParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn7552);
                            lv_constructor_6_1=ruleVariableType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"constructor",
                                    		lv_constructor_6_1, 
                                    		"VariableType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3430:8: lv_constructor_6_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableNameParserRuleCall_3_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn7571);
                            lv_constructor_6_2=ruleVariableName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"constructor",
                                    		lv_constructor_6_2, 
                                    		"VariableName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinitionBuiltIn7586); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionBuiltInAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3452:1: ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_ID) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3452:2: ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3452:2: ( (lv_parameters_8_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3453:1: (lv_parameters_8_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3453:1: (lv_parameters_8_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3454:3: lv_parameters_8_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn7608);
                            lv_parameters_8_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_8_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3470:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==15) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3470:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionBuiltIn7621); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getVariableDefinitionBuiltInAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3474:1: ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3475:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3475:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3476:3: lv_parameters_10_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn7642);
                            	    lv_parameters_10_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_10_0, 
                            	            		"ParameterAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinitionBuiltIn7658); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariableDefinitionBuiltInAccess().getRightParenthesisKeyword_3_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinitionBuiltIn"


    // $ANTLR start "entryRuleVariableDefinitionUserDefined"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3504:1: entryRuleVariableDefinitionUserDefined returns [EObject current=null] : iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF ;
    public final EObject entryRuleVariableDefinitionUserDefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionUserDefined = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3505:2: (iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3506:2: iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined7696);
            iv_ruleVariableDefinitionUserDefined=ruleVariableDefinitionUserDefined();

            state._fsp--;

             current =iv_ruleVariableDefinitionUserDefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined7706); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinitionUserDefined"


    // $ANTLR start "ruleVariableDefinitionUserDefined"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3513:1: ruleVariableDefinitionUserDefined returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject ruleVariableDefinitionUserDefined() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constructor_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3516:28: ( ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3517:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3517:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3517:2: () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3517:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionUserDefinedAccess().getVariableDefinitionUserDefinedAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3523:2: ( (lv_type_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3524:1: (lv_type_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3524:1: (lv_type_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3525:3: lv_type_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getTypeVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined7761);
            lv_type_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionUserDefinedRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3541:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3542:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3542:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3543:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined7782);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionUserDefinedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3559:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==33) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3559:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionUserDefined7795); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionUserDefinedAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleVariableDefinitionUserDefined7807); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionUserDefinedAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3567:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3568:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3568:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3569:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined7828);
                    lv_constructor_5_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionUserDefinedRule());
                    	        }
                           		set(
                           			current, 
                           			"constructor",
                            		lv_constructor_5_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinitionUserDefined7840); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionUserDefinedAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_ID) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3590:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3590:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3591:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined7862);
                            lv_parameters_7_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionUserDefinedRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3607:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==15) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3607:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionUserDefined7875); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionUserDefinedAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3611:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3612:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3612:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3613:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined7896);
                            	    lv_parameters_9_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionUserDefinedRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_9_0, 
                            	            		"ParameterAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop67;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinitionUserDefined7912); 

                        	newLeafNode(otherlv_10, grammarAccess.getVariableDefinitionUserDefinedAccess().getRightParenthesisKeyword_3_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinitionUserDefined"


    // $ANTLR start "entryRuleVariableDefinitionCollection"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3641:1: entryRuleVariableDefinitionCollection returns [EObject current=null] : iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF ;
    public final EObject entryRuleVariableDefinitionCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionCollection = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3642:2: (iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3643:2: iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionCollectionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection7950);
            iv_ruleVariableDefinitionCollection=ruleVariableDefinitionCollection();

            state._fsp--;

             current =iv_ruleVariableDefinitionCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionCollection7960); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinitionCollection"


    // $ANTLR start "ruleVariableDefinitionCollection"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3650:1: ruleVariableDefinitionCollection returns [EObject current=null] : ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleVariableDefinitionCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_collection_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_1 = null;

        AntlrDatatypeRuleToken lv_type_3_2 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3653:28: ( ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3654:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3654:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3654:2: () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3654:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3655:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionCollectionAccess().getVariableDefinitionCollectionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3660:2: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3660:3: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3660:3: ( (lv_collection_1_0= ruleCollectionID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3661:1: (lv_collection_1_0= ruleCollectionID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3661:1: (lv_collection_1_0= ruleCollectionID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3662:3: lv_collection_1_0= ruleCollectionID
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection8016);
            lv_collection_1_0=ruleCollectionID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionCollectionRule());
            	        }
                   		set(
                   			current, 
                   			"collection",
                    		lv_collection_1_0, 
                    		"CollectionID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleVariableDefinitionCollection8028); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionCollectionAccess().getLessThanSignKeyword_1_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3682:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3683:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3683:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3684:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3684:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=36 && LA70_0<=46)) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ID) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3685:3: lv_type_3_1= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableTypeParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection8051);
                    lv_type_3_1=ruleVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionCollectionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_1, 
                            		"VariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3700:8: lv_type_3_2= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableNameParserRuleCall_1_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection8070);
                    lv_type_3_2=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionCollectionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_2, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleVariableDefinitionCollection8085); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionCollectionAccess().getGreaterThanSignKeyword_1_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3722:1: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3723:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3723:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3724:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getNameVariableNameParserRuleCall_1_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection8106);
            lv_name_5_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionCollectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3740:3: (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==33) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3740:5: otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionCollection8120); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionCollectionAccess().getEqualsSignKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3744:1: ( (lv_value_7_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3745:1: (lv_value_7_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3745:1: (lv_value_7_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3746:3: lv_value_7_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getValueListParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleVariableDefinitionCollection8141);
                    lv_value_7_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionCollectionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinitionCollection8153); 

                        	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionCollectionAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinitionCollection"


    // $ANTLR start "entryRuleCollectionID"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3774:1: entryRuleCollectionID returns [String current=null] : iv_ruleCollectionID= ruleCollectionID EOF ;
    public final String entryRuleCollectionID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionID = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3775:2: (iv_ruleCollectionID= ruleCollectionID EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3776:2: iv_ruleCollectionID= ruleCollectionID EOF
            {
             newCompositeNode(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID8192);
            iv_ruleCollectionID=ruleCollectionID();

            state._fsp--;

             current =iv_ruleCollectionID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID8203); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionID"


    // $ANTLR start "ruleCollectionID"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3783:1: ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3786:28: ( (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3787:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3787:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt72=1;
                }
                break;
            case 51:
                {
                alt72=2;
                }
                break;
            case 52:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3788:2: kw= 'LIST'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleCollectionID8241); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3795:2: kw= 'SET'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleCollectionID8260); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3802:2: kw= 'HASH'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleCollectionID8279); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getHASHKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionID"


    // $ANTLR start "entryRuleVariableDefinitionBasic"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3815:1: entryRuleVariableDefinitionBasic returns [EObject current=null] : iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF ;
    public final EObject entryRuleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBasic = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3816:2: (iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3817:2: iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBasicRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic8319);
            iv_ruleVariableDefinitionBasic=ruleVariableDefinitionBasic();

            state._fsp--;

             current =iv_ruleVariableDefinitionBasic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBasic8329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinitionBasic"


    // $ANTLR start "ruleVariableDefinitionBasic"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3824:1: ruleVariableDefinitionBasic returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3827:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3828:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3828:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3828:2: () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3828:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3829:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBasicAccess().getVariableDefinitionBasicAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3834:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3835:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3835:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3836:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic8384);
            lv_type_1_0=ruleVariableType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBasicRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"VariableType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3852:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3853:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3853:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3854:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic8405);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBasicRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionBasic8417); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionBasicAccess().getEqualsSignKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3874:1: ( (lv_expression_4_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3875:1: (lv_expression_4_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3875:1: (lv_expression_4_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3876:3: lv_expression_4_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getExpressionVariableExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic8438);
            lv_expression_4_0=ruleVariableExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBasicRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"VariableExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinitionBasic"


    // $ANTLR start "entryRuleParameterAssignment"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3900:1: entryRuleParameterAssignment returns [EObject current=null] : iv_ruleParameterAssignment= ruleParameterAssignment EOF ;
    public final EObject entryRuleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3901:2: (iv_ruleParameterAssignment= ruleParameterAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3902:2: iv_ruleParameterAssignment= ruleParameterAssignment EOF
            {
             newCompositeNode(grammarAccess.getParameterAssignmentRule()); 
            pushFollow(FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment8474);
            iv_ruleParameterAssignment=ruleParameterAssignment();

            state._fsp--;

             current =iv_ruleParameterAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterAssignment8484); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterAssignment"


    // $ANTLR start "ruleParameterAssignment"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3909:1: ruleParameterAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) ;
    public final EObject ruleParameterAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3912:28: ( ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3913:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3913:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3913:2: ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3913:2: ( (lv_name_0_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3914:1: (lv_name_0_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3914:1: (lv_name_0_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3915:3: lv_name_0_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getNameVariableNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleParameterAssignment8530);
            lv_name_0_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleParameterAssignment8542); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3935:1: ( (lv_value_2_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3936:1: (lv_value_2_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3936:1: (lv_value_2_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3937:3: lv_value_2_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment8563);
            lv_value_2_0=ruleVariableExpressionObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"VariableExpressionObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterAssignment"


    // $ANTLR start "entryRuleVariableAssignment"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3961:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3962:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3963:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment8599);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment8609); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3970:1: ruleVariableAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3973:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3974:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3974:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3974:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3974:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3975:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3980:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3981:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3981:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3982:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment8664);
            lv_variable_1_0=ruleVariableAssignmentObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"VariableAssignmentObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleVariableAssignment8676); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4002:1: ( (lv_expression_3_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4003:1: (lv_expression_3_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4003:1: (lv_expression_3_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4004:3: lv_expression_3_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableAssignment8697);
            lv_expression_3_0=ruleVariableExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"VariableExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleVariableAssignmentObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4028:1: entryRuleVariableAssignmentObject returns [EObject current=null] : iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF ;
    public final EObject entryRuleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignmentObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4029:2: (iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4030:2: iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentObjectRule()); 
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject8733);
            iv_ruleVariableAssignmentObject=ruleVariableAssignmentObject();

            state._fsp--;

             current =iv_ruleVariableAssignmentObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentObject8743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignmentObject"


    // $ANTLR start "ruleVariableAssignmentObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4037:1: ruleVariableAssignmentObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) ;
    public final EObject ruleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4040:28: ( ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4041:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4041:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==EOF||LA73_1==33) ) {
                    alt73=1;
                }
                else if ( ((LA73_1>=47 && LA73_1<=48)) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4041:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4041:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4041:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4041:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4042:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariableAssignmentObjectAccess().getVariableAssignmentObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject8794);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4057:5: this_VariableAttribute_2= ruleVariableAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject8822);
                    this_VariableAttribute_2=ruleVariableAttribute();

                    state._fsp--;

                     
                            current = this_VariableAttribute_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAssignmentObject"


    // $ANTLR start "entryRuleVariableExpression"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4073:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4074:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4075:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression8857);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression8867); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4082:1: ruleVariableExpression returns [EObject current=null] : ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4085:28: ( ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4086:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4086:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4086:2: () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4086:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4092:2: ( (lv_members_1_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4093:1: (lv_members_1_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4093:1: (lv_members_1_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4094:3: lv_members_1_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression8922);
            lv_members_1_0=ruleVariableExpressionObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"VariableExpressionObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4110:2: ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=53 && LA74_0<=55)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4111:5: ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression8939);
            	    ruleVariableExpressionOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4118:1: ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4119:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4119:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4120:3: lv_members_3_0= ruleVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression8959);
            	    lv_members_3_0=ruleVariableExpressionObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"VariableExpressionObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "entryRuleVariableExpressionObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4144:1: entryRuleVariableExpressionObject returns [EObject current=null] : iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF ;
    public final EObject entryRuleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4145:2: (iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4146:2: iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject8997);
            iv_ruleVariableExpressionObject=ruleVariableExpressionObject();

            state._fsp--;

             current =iv_ruleVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionObject9007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableExpressionObject"


    // $ANTLR start "ruleVariableExpressionObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4153:1: ruleVariableExpressionObject returns [EObject current=null] : (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) ;
    public final EObject ruleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicVariableExpressionObject_0 = null;

        EObject this_CompoundVariableExpressionObject_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4156:28: ( (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4157:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4157:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_INT)||(LA75_0>=53 && LA75_0<=54)) ) {
                alt75=1;
            }
            else if ( (LA75_0==71) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4158:5: this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getAtomicVariableExpressionObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject9054);
                    this_AtomicVariableExpressionObject_0=ruleAtomicVariableExpressionObject();

                    state._fsp--;

                     
                            current = this_AtomicVariableExpressionObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4168:5: this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getCompoundVariableExpressionObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject9081);
                    this_CompoundVariableExpressionObject_1=ruleCompoundVariableExpressionObject();

                    state._fsp--;

                     
                            current = this_CompoundVariableExpressionObject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableExpressionObject"


    // $ANTLR start "entryRuleAtomicVariableExpressionObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4184:1: entryRuleAtomicVariableExpressionObject returns [EObject current=null] : iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF ;
    public final EObject entryRuleAtomicVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4185:2: (iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4186:2: iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject9116);
            iv_ruleAtomicVariableExpressionObject=ruleAtomicVariableExpressionObject();

            state._fsp--;

             current =iv_ruleAtomicVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject9126); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicVariableExpressionObject"


    // $ANTLR start "ruleAtomicVariableExpressionObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4193:1: ruleAtomicVariableExpressionObject returns [EObject current=null] : ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleAtomicVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        Token lv_string_6_0=null;
        AntlrDatatypeRuleToken lv_variable_1_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_complex_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_quantity_5_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4196:28: ( ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4197:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4197:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            int alt76=6;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4197:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4197:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4197:3: () ( (lv_variable_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4197:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4198:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicVariableExpressionObjectAccess().getAtomicVariableExpressionObjectAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4203:2: ( (lv_variable_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4204:1: (lv_variable_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4204:1: (lv_variable_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4205:3: lv_variable_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getVariableVariableNameParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject9182);
                    lv_variable_1_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicVariableExpressionObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_1_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4222:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4222:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4223:1: (lv_attribute_2_0= ruleVariableAttribute )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4223:1: (lv_attribute_2_0= ruleVariableAttribute )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4224:3: lv_attribute_2_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getAttributeVariableAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject9210);
                    lv_attribute_2_0=ruleVariableAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicVariableExpressionObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_2_0, 
                            		"VariableAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4241:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4241:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4242:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4242:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4243:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getComplexVariableComplexParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject9237);
                    lv_complex_3_0=ruleVariableComplex();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicVariableExpressionObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"complex",
                            		lv_complex_3_0, 
                            		"VariableComplex");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4260:6: ( (lv_value_4_0= ruleREAL ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4260:6: ( (lv_value_4_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4261:1: (lv_value_4_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4261:1: (lv_value_4_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4262:3: lv_value_4_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getValueREALParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject9264);
                    lv_value_4_0=ruleREAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicVariableExpressionObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"REAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4279:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4279:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4280:1: (lv_quantity_5_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4280:1: (lv_quantity_5_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4281:3: lv_quantity_5_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getQuantityQuantityParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject9291);
                    lv_quantity_5_0=ruleQuantity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicVariableExpressionObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"quantity",
                            		lv_quantity_5_0, 
                            		"Quantity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4298:6: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4298:6: ( (lv_string_6_0= RULE_STRING ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4299:1: (lv_string_6_0= RULE_STRING )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4299:1: (lv_string_6_0= RULE_STRING )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4300:3: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject9314); 

                    			newLeafNode(lv_string_6_0, grammarAccess.getAtomicVariableExpressionObjectAccess().getStringSTRINGTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicVariableExpressionObjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicVariableExpressionObject"


    // $ANTLR start "entryRuleCompoundVariableExpressionObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4324:1: entryRuleCompoundVariableExpressionObject returns [EObject current=null] : iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF ;
    public final EObject entryRuleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4325:2: (iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4326:2: iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject9355);
            iv_ruleCompoundVariableExpressionObject=ruleCompoundVariableExpressionObject();

            state._fsp--;

             current =iv_ruleCompoundVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject9365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundVariableExpressionObject"


    // $ANTLR start "ruleCompoundVariableExpressionObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4333:1: ruleCompoundVariableExpressionObject returns [EObject current=null] : ( () ( (lv_list_1_0= ruleList ) ) ) ;
    public final EObject ruleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4336:28: ( ( () ( (lv_list_1_0= ruleList ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4337:1: ( () ( (lv_list_1_0= ruleList ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4337:1: ( () ( (lv_list_1_0= ruleList ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4337:2: () ( (lv_list_1_0= ruleList ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4337:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4338:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompoundVariableExpressionObjectAccess().getCompoundVariableExpressionObjectAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4343:2: ( (lv_list_1_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4344:1: (lv_list_1_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4344:1: (lv_list_1_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4345:3: lv_list_1_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectAccess().getListListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject9420);
            lv_list_1_0=ruleList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompoundVariableExpressionObjectRule());
            	        }
                   		set(
                   			current, 
                   			"list",
                    		lv_list_1_0, 
                    		"List");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundVariableExpressionObject"


    // $ANTLR start "entryRuleVariableExpressionOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4369:1: entryRuleVariableExpressionOperator returns [String current=null] : iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF ;
    public final String entryRuleVariableExpressionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableExpressionOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4370:2: (iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4371:2: iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator9457);
            iv_ruleVariableExpressionOperator=ruleVariableExpressionOperator();

            state._fsp--;

             current =iv_ruleVariableExpressionOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator9468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableExpressionOperator"


    // $ANTLR start "ruleVariableExpressionOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4378:1: ruleVariableExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleVariableExpressionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4381:28: ( (kw= '+' | kw= '-' | kw= '|' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4382:1: (kw= '+' | kw= '-' | kw= '|' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4382:1: (kw= '+' | kw= '-' | kw= '|' )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt77=1;
                }
                break;
            case 54:
                {
                alt77=2;
                }
                break;
            case 55:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4383:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleVariableExpressionOperator9506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4390:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleVariableExpressionOperator9525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4397:2: kw= '|'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleVariableExpressionOperator9544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getVerticalLineKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableExpressionOperator"


    // $ANTLR start "entryRuleRuleDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4410:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4411:2: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4412:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition9584);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition9594); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleDefinition"


    // $ANTLR start "ruleRuleDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4419:1: ruleRuleDefinition returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) ;
    public final EObject ruleRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_reversible_8_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_lhs_4_0 = null;

        EObject lv_lhs_6_0 = null;

        EObject lv_rhs_9_0 = null;

        EObject lv_rhs_11_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4422:28: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4423:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4423:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4423:2: () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4423:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4424:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleRuleDefinition9640); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4433:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4434:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4434:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4435:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRuleDefinition9661);
            lv_name_2_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRuleDefinition9673); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4455:1: ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4455:2: ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4455:2: ( (lv_lhs_4_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4456:1: (lv_lhs_4_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4456:1: (lv_lhs_4_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4457:3: lv_lhs_4_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition9695);
                    lv_lhs_4_0=ruleRuleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"lhs",
                            		lv_lhs_4_0, 
                            		"RuleObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4473:2: (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==53) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4473:4: otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleRuleDefinition9708); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4477:1: ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4478:1: (lv_lhs_6_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4478:1: (lv_lhs_6_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4479:3: lv_lhs_6_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition9729);
                    	    lv_lhs_6_0=ruleRuleObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"lhs",
                    	            		lv_lhs_6_0, 
                    	            		"RuleObject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4495:6: (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==57) ) {
                alt80=1;
            }
            else if ( (LA80_0==58) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4495:8: otherlv_7= '->'
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleRuleDefinition9746); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4500:6: ( (lv_reversible_8_0= '<->' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4500:6: ( (lv_reversible_8_0= '<->' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4501:1: (lv_reversible_8_0= '<->' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4501:1: (lv_reversible_8_0= '<->' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4502:3: lv_reversible_8_0= '<->'
                    {
                    lv_reversible_8_0=(Token)match(input,58,FOLLOW_58_in_ruleRuleDefinition9770); 

                            newLeafNode(lv_reversible_8_0, grammarAccess.getRuleDefinitionAccess().getReversibleLessThanSignHyphenMinusGreaterThanSignKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "reversible", true, "<->");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4515:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4515:4: ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4515:4: ( (lv_rhs_9_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4516:1: (lv_rhs_9_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4516:1: (lv_rhs_9_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4517:3: lv_rhs_9_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition9806);
                    lv_rhs_9_0=ruleRuleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"rhs",
                            		lv_rhs_9_0, 
                            		"RuleObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4533:2: (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==53) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4533:4: otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleRuleDefinition9819); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4537:1: ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4538:1: (lv_rhs_11_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4538:1: (lv_rhs_11_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4539:3: lv_rhs_11_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition9840);
                    	    lv_rhs_11_0=ruleRuleObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rhs",
                    	            		lv_rhs_11_0, 
                    	            		"RuleObject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleDefinition"


    // $ANTLR start "entryRuleRuleObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4563:1: entryRuleRuleObject returns [EObject current=null] : iv_ruleRuleObject= ruleRuleObject EOF ;
    public final EObject entryRuleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4564:2: (iv_ruleRuleObject= ruleRuleObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4565:2: iv_ruleRuleObject= ruleRuleObject EOF
            {
             newCompositeNode(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject9880);
            iv_ruleRuleObject=ruleRuleObject();

            state._fsp--;

             current =iv_ruleRuleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject9890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleObject"


    // $ANTLR start "ruleRuleObject"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4572:1: ruleRuleObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) ;
    public final EObject ruleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableComplex_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4575:28: ( ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4576:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4576:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==EOF||LA83_1==RULE_ID||LA83_1==16||(LA83_1>=20 && LA83_1<=24)||LA83_1==32||(LA83_1>=36 && LA83_1<=46)||(LA83_1>=50 && LA83_1<=53)||(LA83_1>=56 && LA83_1<=59)||LA83_1==61) ) {
                    alt83=1;
                }
                else if ( (LA83_1==47) ) {
                    alt83=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4576:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4576:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4576:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4576:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4577:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getRuleObjectAccess().getRuleObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleRuleObject9941);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4592:5: this_VariableComplex_2= ruleVariableComplex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableComplexParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleRuleObject9969);
                    this_VariableComplex_2=ruleVariableComplex();

                    state._fsp--;

                     
                            current = this_VariableComplex_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleObject"


    // $ANTLR start "entryRuleATGCDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4608:1: entryRuleATGCDefinition returns [EObject current=null] : iv_ruleATGCDefinition= ruleATGCDefinition EOF ;
    public final EObject entryRuleATGCDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATGCDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4609:2: (iv_ruleATGCDefinition= ruleATGCDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4610:2: iv_ruleATGCDefinition= ruleATGCDefinition EOF
            {
             newCompositeNode(grammarAccess.getATGCDefinitionRule()); 
            pushFollow(FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition10004);
            iv_ruleATGCDefinition=ruleATGCDefinition();

            state._fsp--;

             current =iv_ruleATGCDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCDefinition10014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATGCDefinition"


    // $ANTLR start "ruleATGCDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4617:1: ruleATGCDefinition returns [EObject current=null] : ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) ;
    public final EObject ruleATGCDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_command_2_0 = null;

        AntlrDatatypeRuleToken lv_arguments_4_0 = null;

        AntlrDatatypeRuleToken lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4620:28: ( ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4621:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4621:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4621:2: () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4621:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4622:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleATGCDefinition10060); 

                	newLeafNode(otherlv_1, grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4631:1: ( (lv_command_2_0= ruleATGCCommand ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4632:1: (lv_command_2_0= ruleATGCCommand )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4632:1: (lv_command_2_0= ruleATGCCommand )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4633:3: lv_command_2_0= ruleATGCCommand
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getCommandATGCCommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATGCCommand_in_ruleATGCDefinition10081);
            lv_command_2_0=ruleATGCCommand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getATGCDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"command",
                    		lv_command_2_0, 
                    		"ATGCCommand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleATGCDefinition10093); 

                	newLeafNode(otherlv_3, grammarAccess.getATGCDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4653:1: ( (lv_arguments_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4654:1: (lv_arguments_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4654:1: (lv_arguments_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4655:3: lv_arguments_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition10114);
            lv_arguments_4_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getATGCDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"arguments",
                    		lv_arguments_4_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4671:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==15) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4671:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleATGCDefinition10127); 

            	        	newLeafNode(otherlv_5, grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4675:1: ( (lv_arguments_6_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4676:1: (lv_arguments_6_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4676:1: (lv_arguments_6_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4677:3: lv_arguments_6_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition10148);
            	    lv_arguments_6_0=ruleVariableName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getATGCDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_6_0, 
            	            		"VariableName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleATGCDefinition"


    // $ANTLR start "entryRuleATGCCommand"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4701:1: entryRuleATGCCommand returns [String current=null] : iv_ruleATGCCommand= ruleATGCCommand EOF ;
    public final String entryRuleATGCCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATGCCommand = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4702:2: (iv_ruleATGCCommand= ruleATGCCommand EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4703:2: iv_ruleATGCCommand= ruleATGCCommand EOF
            {
             newCompositeNode(grammarAccess.getATGCCommandRule()); 
            pushFollow(FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand10187);
            iv_ruleATGCCommand=ruleATGCCommand();

            state._fsp--;

             current =iv_ruleATGCCommand.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCCommand10198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATGCCommand"


    // $ANTLR start "ruleATGCCommand"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4710:1: ruleATGCCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ARRANGE' ;
    public final AntlrDatatypeRuleToken ruleATGCCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4713:28: (kw= 'ARRANGE' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4715:2: kw= 'ARRANGE'
            {
            kw=(Token)match(input,60,FOLLOW_60_in_ruleATGCCommand10235); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getATGCCommandAccess().getARRANGEKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleATGCCommand"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4728:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4729:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4730:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition10274);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition10284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4737:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_property_2_1 = null;

        EObject lv_property_2_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4740:28: ( ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4741:1: ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4741:1: ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4741:2: () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4741:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4742:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_rulePropertyDefinition10330); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getVERIFYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4751:1: ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4752:1: ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4752:1: ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4753:1: (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4753:1: (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==71) ) {
                alt85=1;
            }
            else if ( (LA85_0==70) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4754:3: lv_property_2_1= ruleProbabilityProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyProbabilityPropertyParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProbabilityProperty_in_rulePropertyDefinition10353);
                    lv_property_2_1=ruleProbabilityProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"property",
                            		lv_property_2_1, 
                            		"ProbabilityProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4769:8: lv_property_2_2= ruleRewardProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyRewardPropertyParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleRewardProperty_in_rulePropertyDefinition10372);
                    lv_property_2_2=ruleRewardProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"property",
                            		lv_property_2_2, 
                            		"RewardProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleProbabilityProperty"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4795:1: entryRuleProbabilityProperty returns [EObject current=null] : iv_ruleProbabilityProperty= ruleProbabilityProperty EOF ;
    public final EObject entryRuleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4796:2: (iv_ruleProbabilityProperty= ruleProbabilityProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4797:2: iv_ruleProbabilityProperty= ruleProbabilityProperty EOF
            {
             newCompositeNode(grammarAccess.getProbabilityPropertyRule()); 
            pushFollow(FOLLOW_ruleProbabilityProperty_in_entryRuleProbabilityProperty10411);
            iv_ruleProbabilityProperty=ruleProbabilityProperty();

            state._fsp--;

             current =iv_ruleProbabilityProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbabilityProperty10421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProbabilityProperty"


    // $ANTLR start "ruleProbabilityProperty"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4804:1: ruleProbabilityProperty returns [EObject current=null] : ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? ) ;
    public final EObject ruleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        Token lv_isEventually_2_0=null;
        Token lv_isNever_3_0=null;
        Token lv_isAlways_4_0=null;
        Token lv_isUntilThen_5_0=null;
        Token lv_isFollowedBy_6_0=null;
        Token lv_isSteadyState_10_0=null;
        Token lv_isInfinitelyOften_11_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_stateFormula1_1_0 = null;

        EObject lv_stateFormula2_7_0 = null;

        EObject lv_timeInstant_8_0 = null;

        EObject lv_timeInterval_9_0 = null;

        EObject lv_probabilityConstraint_12_0 = null;

        EObject lv_initialConditions_14_0 = null;

        EObject lv_initialConditions_16_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4807:28: ( ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4808:1: ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4808:1: ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4808:2: () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4808:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4809:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProbabilityPropertyAccess().getProbabilityPropertyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4814:2: ( (lv_stateFormula1_1_0= ruleStateFormula ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4815:1: (lv_stateFormula1_1_0= ruleStateFormula )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4815:1: (lv_stateFormula1_1_0= ruleStateFormula )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4816:3: lv_stateFormula1_1_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getStateFormula1StateFormulaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleProbabilityProperty10476);
            lv_stateFormula1_1_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"stateFormula1",
                    		lv_stateFormula1_1_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:2: ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=62 && LA91_0<=66)) ) {
                alt91=1;
            }
            else if ( ((LA91_0>=67 && LA91_0<=68)) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:3: ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:3: ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:4: ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )?
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:4: ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( ((LA88_0>=62 && LA88_0<=64)) ) {
                        alt88=1;
                    }
                    else if ( ((LA88_0>=65 && LA88_0<=66)) ) {
                        alt88=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:5: ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:5: ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) )
                            int alt86=3;
                            switch ( input.LA(1) ) {
                            case 62:
                                {
                                alt86=1;
                                }
                                break;
                            case 63:
                                {
                                alt86=2;
                                }
                                break;
                            case 64:
                                {
                                alt86=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 86, 0, input);

                                throw nvae;
                            }

                            switch (alt86) {
                                case 1 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:6: ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4832:6: ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4833:1: (lv_isEventually_2_0= 'EVENTUALLY HOLDS' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4833:1: (lv_isEventually_2_0= 'EVENTUALLY HOLDS' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4834:3: lv_isEventually_2_0= 'EVENTUALLY HOLDS'
                                    {
                                    lv_isEventually_2_0=(Token)match(input,62,FOLLOW_62_in_ruleProbabilityProperty10498); 

                                            newLeafNode(lv_isEventually_2_0, grammarAccess.getProbabilityPropertyAccess().getIsEventuallyEVENTUALLYHOLDSKeyword_2_0_0_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                                    	        }
                                           		setWithLastConsumed(current, "isEventually", true, "EVENTUALLY HOLDS");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4848:6: ( (lv_isNever_3_0= 'NEVER HOLDS' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4848:6: ( (lv_isNever_3_0= 'NEVER HOLDS' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4849:1: (lv_isNever_3_0= 'NEVER HOLDS' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4849:1: (lv_isNever_3_0= 'NEVER HOLDS' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4850:3: lv_isNever_3_0= 'NEVER HOLDS'
                                    {
                                    lv_isNever_3_0=(Token)match(input,63,FOLLOW_63_in_ruleProbabilityProperty10535); 

                                            newLeafNode(lv_isNever_3_0, grammarAccess.getProbabilityPropertyAccess().getIsNeverNEVERHOLDSKeyword_2_0_0_0_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                                    	        }
                                           		setWithLastConsumed(current, "isNever", true, "NEVER HOLDS");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4864:6: ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4864:6: ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4865:1: (lv_isAlways_4_0= 'ALWAYS HOLDS' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4865:1: (lv_isAlways_4_0= 'ALWAYS HOLDS' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4866:3: lv_isAlways_4_0= 'ALWAYS HOLDS'
                                    {
                                    lv_isAlways_4_0=(Token)match(input,64,FOLLOW_64_in_ruleProbabilityProperty10572); 

                                            newLeafNode(lv_isAlways_4_0, grammarAccess.getProbabilityPropertyAccess().getIsAlwaysALWAYSHOLDSKeyword_2_0_0_0_2_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                                    	        }
                                           		setWithLastConsumed(current, "isAlways", true, "ALWAYS HOLDS");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4880:6: ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4880:6: ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4880:7: ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4880:7: ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) )
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==65) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==66) ) {
                                alt87=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 87, 0, input);

                                throw nvae;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4880:8: ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4880:8: ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4881:1: (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4881:1: (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4882:3: lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN'
                                    {
                                    lv_isUntilThen_5_0=(Token)match(input,65,FOLLOW_65_in_ruleProbabilityProperty10612); 

                                            newLeafNode(lv_isUntilThen_5_0, grammarAccess.getProbabilityPropertyAccess().getIsUntilThenWILLHOLDUNTILTHENKeyword_2_0_0_1_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                                    	        }
                                           		setWithLastConsumed(current, "isUntilThen", true, "WILL HOLD UNTIL THEN");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4896:6: ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4896:6: ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4897:1: (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4897:1: (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4898:3: lv_isFollowedBy_6_0= 'IS FOLLOWED BY'
                                    {
                                    lv_isFollowedBy_6_0=(Token)match(input,66,FOLLOW_66_in_ruleProbabilityProperty10649); 

                                            newLeafNode(lv_isFollowedBy_6_0, grammarAccess.getProbabilityPropertyAccess().getIsFollowedByISFOLLOWEDBYKeyword_2_0_0_1_0_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                                    	        }
                                           		setWithLastConsumed(current, "isFollowedBy", true, "IS FOLLOWED BY");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4911:3: ( (lv_stateFormula2_7_0= ruleStateFormula ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4912:1: (lv_stateFormula2_7_0= ruleStateFormula )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4912:1: (lv_stateFormula2_7_0= ruleStateFormula )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4913:3: lv_stateFormula2_7_0= ruleStateFormula
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getStateFormula2StateFormulaParserRuleCall_2_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStateFormula_in_ruleProbabilityProperty10684);
                            lv_stateFormula2_7_0=ruleStateFormula();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"stateFormula2",
                                    		lv_stateFormula2_7_0, 
                                    		"StateFormula");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4929:4: ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )?
                    int alt89=3;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=78 && LA89_0<=80)) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==81) ) {
                        alt89=2;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4929:5: ( (lv_timeInstant_8_0= ruleTimeInstant ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4929:5: ( (lv_timeInstant_8_0= ruleTimeInstant ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4930:1: (lv_timeInstant_8_0= ruleTimeInstant )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4930:1: (lv_timeInstant_8_0= ruleTimeInstant )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4931:3: lv_timeInstant_8_0= ruleTimeInstant
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getTimeInstantTimeInstantParserRuleCall_2_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTimeInstant_in_ruleProbabilityProperty10708);
                            lv_timeInstant_8_0=ruleTimeInstant();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"timeInstant",
                                    		lv_timeInstant_8_0, 
                                    		"TimeInstant");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4948:6: ( (lv_timeInterval_9_0= ruleTimeInterval ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4948:6: ( (lv_timeInterval_9_0= ruleTimeInterval ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4949:1: (lv_timeInterval_9_0= ruleTimeInterval )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4949:1: (lv_timeInterval_9_0= ruleTimeInterval )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4950:3: lv_timeInterval_9_0= ruleTimeInterval
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getTimeIntervalTimeIntervalParserRuleCall_2_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTimeInterval_in_ruleProbabilityProperty10735);
                            lv_timeInterval_9_0=ruleTimeInterval();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"timeInterval",
                                    		lv_timeInterval_9_0, 
                                    		"TimeInterval");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4967:6: ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4967:6: ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==67) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==68) ) {
                        alt90=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4967:7: ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4967:7: ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4968:1: (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4968:1: (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4969:3: lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE'
                            {
                            lv_isSteadyState_10_0=(Token)match(input,67,FOLLOW_67_in_ruleProbabilityProperty10763); 

                                    newLeafNode(lv_isSteadyState_10_0, grammarAccess.getProbabilityPropertyAccess().getIsSteadyStateHOLDSINSTEADYSTATEKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                            	        }
                                   		setWithLastConsumed(current, "isSteadyState", true, "HOLDS IN STEADY-STATE");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4983:6: ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4983:6: ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4984:1: (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4984:1: (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4985:3: lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN'
                            {
                            lv_isInfinitelyOften_11_0=(Token)match(input,68,FOLLOW_68_in_ruleProbabilityProperty10800); 

                                    newLeafNode(lv_isInfinitelyOften_11_0, grammarAccess.getProbabilityPropertyAccess().getIsInfinitelyOftenHOLDSINFINITELYOFTENKeyword_2_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                            	        }
                                   		setWithLastConsumed(current, "isInfinitelyOften", true, "HOLDS INFINITELY OFTEN");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4998:4: ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==82) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4999:1: (lv_probabilityConstraint_12_0= ruleProbabilityConstraint )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4999:1: (lv_probabilityConstraint_12_0= ruleProbabilityConstraint )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5000:3: lv_probabilityConstraint_12_0= ruleProbabilityConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getProbabilityConstraintProbabilityConstraintParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProbabilityConstraint_in_ruleProbabilityProperty10836);
                    lv_probabilityConstraint_12_0=ruleProbabilityConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"probabilityConstraint",
                            		lv_probabilityConstraint_12_0, 
                            		"ProbabilityConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5016:3: (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==69) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5016:5: otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_13=(Token)match(input,69,FOLLOW_69_in_ruleProbabilityProperty10850); 

                        	newLeafNode(otherlv_13, grammarAccess.getProbabilityPropertyAccess().getGIVENKeyword_4_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5020:1: ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5021:1: (lv_initialConditions_14_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5021:1: (lv_initialConditions_14_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5022:3: lv_initialConditions_14_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty10871);
                    lv_initialConditions_14_0=rulePropertyInitialCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"initialConditions",
                            		lv_initialConditions_14_0, 
                            		"PropertyInitialCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5038:2: (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==15) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5038:4: otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleProbabilityProperty10884); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getProbabilityPropertyAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5042:1: ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5043:1: (lv_initialConditions_16_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5043:1: (lv_initialConditions_16_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5044:3: lv_initialConditions_16_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty10905);
                    	    lv_initialConditions_16_0=rulePropertyInitialCondition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initialConditions",
                    	            		lv_initialConditions_16_0, 
                    	            		"PropertyInitialCondition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProbabilityProperty"


    // $ANTLR start "entryRuleRewardProperty"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5068:1: entryRuleRewardProperty returns [EObject current=null] : iv_ruleRewardProperty= ruleRewardProperty EOF ;
    public final EObject entryRuleRewardProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewardProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5069:2: (iv_ruleRewardProperty= ruleRewardProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5070:2: iv_ruleRewardProperty= ruleRewardProperty EOF
            {
             newCompositeNode(grammarAccess.getRewardPropertyRule()); 
            pushFollow(FOLLOW_ruleRewardProperty_in_entryRuleRewardProperty10945);
            iv_ruleRewardProperty=ruleRewardProperty();

            state._fsp--;

             current =iv_ruleRewardProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewardProperty10955); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRewardProperty"


    // $ANTLR start "ruleRewardProperty"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5077:1: ruleRewardProperty returns [EObject current=null] : ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? ) ;
    public final EObject ruleRewardProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_timeInstant_5_0 = null;

        EObject lv_concentrationConstraint_7_0 = null;

        EObject lv_initialConditions_9_0 = null;

        EObject lv_initialConditions_11_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5080:28: ( ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5081:1: ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5081:1: ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5081:2: () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5081:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5082:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRewardPropertyAccess().getRewardPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleRewardProperty11001); 

                	newLeafNode(otherlv_1, grammarAccess.getRewardPropertyAccess().getEXPECTEDKeyword_1());
                
            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleRewardProperty11013); 

                	newLeafNode(otherlv_2, grammarAccess.getRewardPropertyAccess().getLeftSquareBracketKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5095:1: ( (lv_name_3_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5096:1: (lv_name_3_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5096:1: (lv_name_3_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5097:3: lv_name_3_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getNameVariableNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRewardProperty11034);
            lv_name_3_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleRewardProperty11046); 

                	newLeafNode(otherlv_4, grammarAccess.getRewardPropertyAccess().getRightSquareBracketKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5117:1: ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5118:1: (lv_timeInstant_5_0= ruleRewardTimeInstant )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5118:1: (lv_timeInstant_5_0= ruleRewardTimeInstant )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5119:3: lv_timeInstant_5_0= ruleRewardTimeInstant
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getTimeInstantRewardTimeInstantParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRewardTimeInstant_in_ruleRewardProperty11067);
            lv_timeInstant_5_0=ruleRewardTimeInstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"timeInstant",
                    		lv_timeInstant_5_0, 
                    		"RewardTimeInstant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleRewardProperty11079); 

                	newLeafNode(otherlv_6, grammarAccess.getRewardPropertyAccess().getISKeyword_6());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5139:1: ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5140:1: (lv_concentrationConstraint_7_0= ruleConcentrationConstraint )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5140:1: (lv_concentrationConstraint_7_0= ruleConcentrationConstraint )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5141:3: lv_concentrationConstraint_7_0= ruleConcentrationConstraint
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getConcentrationConstraintConcentrationConstraintParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationConstraint_in_ruleRewardProperty11100);
            lv_concentrationConstraint_7_0=ruleConcentrationConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"concentrationConstraint",
                    		lv_concentrationConstraint_7_0, 
                    		"ConcentrationConstraint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5157:2: (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==69) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5157:4: otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleRewardProperty11113); 

                        	newLeafNode(otherlv_8, grammarAccess.getRewardPropertyAccess().getGIVENKeyword_8_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5161:1: ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5162:1: (lv_initialConditions_9_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5162:1: (lv_initialConditions_9_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5163:3: lv_initialConditions_9_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty11134);
                    lv_initialConditions_9_0=rulePropertyInitialCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"initialConditions",
                            		lv_initialConditions_9_0, 
                            		"PropertyInitialCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5179:2: (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==15) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5179:4: otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleRewardProperty11147); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRewardPropertyAccess().getCommaKeyword_8_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5183:1: ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5184:1: (lv_initialConditions_11_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5184:1: (lv_initialConditions_11_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5185:3: lv_initialConditions_11_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_8_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty11168);
                    	    lv_initialConditions_11_0=rulePropertyInitialCondition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initialConditions",
                    	            		lv_initialConditions_11_0, 
                    	            		"PropertyInitialCondition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRewardProperty"


    // $ANTLR start "entryRuleStateExpression"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5209:1: entryRuleStateExpression returns [EObject current=null] : iv_ruleStateExpression= ruleStateExpression EOF ;
    public final EObject entryRuleStateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5210:2: (iv_ruleStateExpression= ruleStateExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5211:2: iv_ruleStateExpression= ruleStateExpression EOF
            {
             newCompositeNode(grammarAccess.getStateExpressionRule()); 
            pushFollow(FOLLOW_ruleStateExpression_in_entryRuleStateExpression11208);
            iv_ruleStateExpression=ruleStateExpression();

            state._fsp--;

             current =iv_ruleStateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateExpression11218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateExpression"


    // $ANTLR start "ruleStateExpression"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5218:1: ruleStateExpression returns [EObject current=null] : ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) ) ;
    public final EObject ruleStateExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_concentrationQuantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5221:28: ( ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5222:1: ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5222:1: ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5222:2: () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5222:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5223:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateExpressionAccess().getStateExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5228:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5229:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5229:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5230:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleStateExpression11273);
            lv_name_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5246:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5247:1: (lv_operator_2_0= ruleRelationalOperator )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5247:1: (lv_operator_2_0= ruleRelationalOperator )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5248:3: lv_operator_2_0= ruleRelationalOperator
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getOperatorRelationalOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleStateExpression11294);
            lv_operator_2_0=ruleRelationalOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"RelationalOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5264:2: ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5265:1: (lv_concentrationQuantity_3_0= ruleConcentrationQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5265:1: (lv_concentrationQuantity_3_0= ruleConcentrationQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5266:3: lv_concentrationQuantity_3_0= ruleConcentrationQuantity
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getConcentrationQuantityConcentrationQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_ruleStateExpression11315);
            lv_concentrationQuantity_3_0=ruleConcentrationQuantity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"concentrationQuantity",
                    		lv_concentrationQuantity_3_0, 
                    		"ConcentrationQuantity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateExpression"


    // $ANTLR start "entryRuleStateFormula"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5290:1: entryRuleStateFormula returns [EObject current=null] : iv_ruleStateFormula= ruleStateFormula EOF ;
    public final EObject entryRuleStateFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFormula = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5291:2: (iv_ruleStateFormula= ruleStateFormula EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5292:2: iv_ruleStateFormula= ruleStateFormula EOF
            {
             newCompositeNode(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula11351);
            iv_ruleStateFormula=ruleStateFormula();

            state._fsp--;

             current =iv_ruleStateFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula11361); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateFormula"


    // $ANTLR start "ruleStateFormula"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5299:1: ruleStateFormula returns [EObject current=null] : ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) ) ;
    public final EObject ruleStateFormula() throws RecognitionException {
        EObject current = null;

        Token lv_formula_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_isNegation_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_isConjunction_10_0=null;
        Token lv_isDisjunction_11_0=null;
        Token lv_isImplication_12_0=null;
        Token otherlv_14=null;
        EObject lv_atomicFormula_2_0 = null;

        EObject lv_negatedFormula_6_0 = null;

        EObject lv_leftFormula_9_0 = null;

        EObject lv_rightFormula_13_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5302:28: ( ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5303:1: ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5303:1: ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) )
            int alt98=3;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==71) ) {
                switch ( input.LA(2) ) {
                case 71:
                    {
                    alt98=3;
                    }
                    break;
                case 74:
                    {
                    alt98=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt98=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5303:2: ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5303:2: ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5303:3: () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']'
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5303:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5304:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStateFormulaAccess().getStateFormulaAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5309:2: ( (lv_formula_1_0= '[' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5310:1: (lv_formula_1_0= '[' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5310:1: (lv_formula_1_0= '[' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5311:3: lv_formula_1_0= '['
                    {
                    lv_formula_1_0=(Token)match(input,71,FOLLOW_71_in_ruleStateFormula11414); 

                            newLeafNode(lv_formula_1_0, grammarAccess.getStateFormulaAccess().getFormulaLeftSquareBracketKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateFormulaRule());
                    	        }
                           		setWithLastConsumed(current, "formula", lv_formula_1_0, "[");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5324:2: ( (lv_atomicFormula_2_0= ruleStateExpression ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5325:1: (lv_atomicFormula_2_0= ruleStateExpression )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5325:1: (lv_atomicFormula_2_0= ruleStateExpression )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5326:3: lv_atomicFormula_2_0= ruleStateExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getAtomicFormulaStateExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateExpression_in_ruleStateFormula11448);
                    lv_atomicFormula_2_0=ruleStateExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"atomicFormula",
                            		lv_atomicFormula_2_0, 
                            		"StateExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,72,FOLLOW_72_in_ruleStateFormula11460); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateFormulaAccess().getRightSquareBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5347:6: (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5347:6: (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5347:8: otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleStateFormula11480); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateFormulaAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5351:1: ( (lv_isNegation_5_0= 'NOT' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5352:1: (lv_isNegation_5_0= 'NOT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5352:1: (lv_isNegation_5_0= 'NOT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5353:3: lv_isNegation_5_0= 'NOT'
                    {
                    lv_isNegation_5_0=(Token)match(input,74,FOLLOW_74_in_ruleStateFormula11498); 

                            newLeafNode(lv_isNegation_5_0, grammarAccess.getStateFormulaAccess().getIsNegationNOTKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateFormulaRule());
                    	        }
                           		setWithLastConsumed(current, "isNegation", true, "NOT");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5366:2: ( (lv_negatedFormula_6_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5367:1: (lv_negatedFormula_6_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5367:1: (lv_negatedFormula_6_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5368:3: lv_negatedFormula_6_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getNegatedFormulaStateFormulaParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula11532);
                    lv_negatedFormula_6_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"negatedFormula",
                            		lv_negatedFormula_6_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,72,FOLLOW_72_in_ruleStateFormula11544); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateFormulaAccess().getRightSquareBracketKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5389:6: (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5389:6: (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5389:8: otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']'
                    {
                    otherlv_8=(Token)match(input,71,FOLLOW_71_in_ruleStateFormula11564); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateFormulaAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5393:1: ( (lv_leftFormula_9_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5394:1: (lv_leftFormula_9_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5394:1: (lv_leftFormula_9_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5395:3: lv_leftFormula_9_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftFormulaStateFormulaParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula11585);
                    lv_leftFormula_9_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"leftFormula",
                            		lv_leftFormula_9_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5411:2: ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) )
                    int alt97=3;
                    switch ( input.LA(1) ) {
                    case 75:
                        {
                        alt97=1;
                        }
                        break;
                    case 76:
                        {
                        alt97=2;
                        }
                        break;
                    case 77:
                        {
                        alt97=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }

                    switch (alt97) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5411:3: ( (lv_isConjunction_10_0= 'AND' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5411:3: ( (lv_isConjunction_10_0= 'AND' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5412:1: (lv_isConjunction_10_0= 'AND' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5412:1: (lv_isConjunction_10_0= 'AND' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5413:3: lv_isConjunction_10_0= 'AND'
                            {
                            lv_isConjunction_10_0=(Token)match(input,75,FOLLOW_75_in_ruleStateFormula11604); 

                                    newLeafNode(lv_isConjunction_10_0, grammarAccess.getStateFormulaAccess().getIsConjunctionANDKeyword_2_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStateFormulaRule());
                            	        }
                                   		setWithLastConsumed(current, "isConjunction", true, "AND");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5427:6: ( (lv_isDisjunction_11_0= 'OR' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5427:6: ( (lv_isDisjunction_11_0= 'OR' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5428:1: (lv_isDisjunction_11_0= 'OR' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5428:1: (lv_isDisjunction_11_0= 'OR' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5429:3: lv_isDisjunction_11_0= 'OR'
                            {
                            lv_isDisjunction_11_0=(Token)match(input,76,FOLLOW_76_in_ruleStateFormula11641); 

                                    newLeafNode(lv_isDisjunction_11_0, grammarAccess.getStateFormulaAccess().getIsDisjunctionORKeyword_2_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStateFormulaRule());
                            	        }
                                   		setWithLastConsumed(current, "isDisjunction", true, "OR");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5443:6: ( (lv_isImplication_12_0= 'IMPLIES' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5443:6: ( (lv_isImplication_12_0= 'IMPLIES' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5444:1: (lv_isImplication_12_0= 'IMPLIES' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5444:1: (lv_isImplication_12_0= 'IMPLIES' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5445:3: lv_isImplication_12_0= 'IMPLIES'
                            {
                            lv_isImplication_12_0=(Token)match(input,77,FOLLOW_77_in_ruleStateFormula11678); 

                                    newLeafNode(lv_isImplication_12_0, grammarAccess.getStateFormulaAccess().getIsImplicationIMPLIESKeyword_2_2_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStateFormulaRule());
                            	        }
                                   		setWithLastConsumed(current, "isImplication", true, "IMPLIES");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5458:3: ( (lv_rightFormula_13_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5459:1: (lv_rightFormula_13_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5459:1: (lv_rightFormula_13_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5460:3: lv_rightFormula_13_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightFormulaStateFormulaParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula11713);
                    lv_rightFormula_13_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"rightFormula",
                            		lv_rightFormula_13_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,72,FOLLOW_72_in_ruleStateFormula11725); 

                        	newLeafNode(otherlv_14, grammarAccess.getStateFormulaAccess().getRightSquareBracketKeyword_2_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateFormula"


    // $ANTLR start "entryRuleTimeInstant"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5488:1: entryRuleTimeInstant returns [EObject current=null] : iv_ruleTimeInstant= ruleTimeInstant EOF ;
    public final EObject entryRuleTimeInstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInstant = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5489:2: (iv_ruleTimeInstant= ruleTimeInstant EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5490:2: iv_ruleTimeInstant= ruleTimeInstant EOF
            {
             newCompositeNode(grammarAccess.getTimeInstantRule()); 
            pushFollow(FOLLOW_ruleTimeInstant_in_entryRuleTimeInstant11762);
            iv_ruleTimeInstant=ruleTimeInstant();

            state._fsp--;

             current =iv_ruleTimeInstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeInstant11772); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeInstant"


    // $ANTLR start "ruleTimeInstant"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5497:1: ruleTimeInstant returns [EObject current=null] : ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeInstant() throws RecognitionException {
        EObject current = null;

        Token lv_isEqualTo_1_0=null;
        Token lv_timeInstant_2_0=null;
        Token lv_isLessThanOrEqual_3_0=null;
        Token lv_timeInstant_4_0=null;
        Token lv_isGreaterThanOrEqual_5_0=null;
        Token lv_timeInstant_6_0=null;
        AntlrDatatypeRuleToken lv_timeUnit_7_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5500:28: ( ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5501:1: ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5501:1: ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5501:2: () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5501:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5502:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeInstantAccess().getTimeInstantAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5507:2: ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt99=1;
                }
                break;
            case 79:
                {
                alt99=2;
                }
                break;
            case 80:
                {
                alt99=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5507:3: ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5507:3: ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5507:4: ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5507:4: ( (lv_isEqualTo_1_0= 'AT' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5508:1: (lv_isEqualTo_1_0= 'AT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5508:1: (lv_isEqualTo_1_0= 'AT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5509:3: lv_isEqualTo_1_0= 'AT'
                    {
                    lv_isEqualTo_1_0=(Token)match(input,78,FOLLOW_78_in_ruleTimeInstant11826); 

                            newLeafNode(lv_isEqualTo_1_0, grammarAccess.getTimeInstantAccess().getIsEqualToATKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isEqualTo", true, "AT");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5522:2: ( (lv_timeInstant_2_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5523:1: (lv_timeInstant_2_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5523:1: (lv_timeInstant_2_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5524:3: lv_timeInstant_2_0= RULE_INT
                    {
                    lv_timeInstant_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInstant11856); 

                    			newLeafNode(lv_timeInstant_2_0, grammarAccess.getTimeInstantAccess().getTimeInstantINTTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"timeInstant",
                            		lv_timeInstant_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5541:6: ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5541:6: ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5541:7: ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5541:7: ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5542:1: (lv_isLessThanOrEqual_3_0= 'BEFORE' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5542:1: (lv_isLessThanOrEqual_3_0= 'BEFORE' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5543:3: lv_isLessThanOrEqual_3_0= 'BEFORE'
                    {
                    lv_isLessThanOrEqual_3_0=(Token)match(input,79,FOLLOW_79_in_ruleTimeInstant11887); 

                            newLeafNode(lv_isLessThanOrEqual_3_0, grammarAccess.getTimeInstantAccess().getIsLessThanOrEqualBEFOREKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isLessThanOrEqual", true, "BEFORE");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5556:2: ( (lv_timeInstant_4_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5557:1: (lv_timeInstant_4_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5557:1: (lv_timeInstant_4_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5558:3: lv_timeInstant_4_0= RULE_INT
                    {
                    lv_timeInstant_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInstant11917); 

                    			newLeafNode(lv_timeInstant_4_0, grammarAccess.getTimeInstantAccess().getTimeInstantINTTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"timeInstant",
                            		lv_timeInstant_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5575:6: ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5575:6: ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5575:7: ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5575:7: ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5576:1: (lv_isGreaterThanOrEqual_5_0= 'AFTER' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5576:1: (lv_isGreaterThanOrEqual_5_0= 'AFTER' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5577:3: lv_isGreaterThanOrEqual_5_0= 'AFTER'
                    {
                    lv_isGreaterThanOrEqual_5_0=(Token)match(input,80,FOLLOW_80_in_ruleTimeInstant11948); 

                            newLeafNode(lv_isGreaterThanOrEqual_5_0, grammarAccess.getTimeInstantAccess().getIsGreaterThanOrEqualAFTERKeyword_1_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isGreaterThanOrEqual", true, "AFTER");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5590:2: ( (lv_timeInstant_6_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5591:1: (lv_timeInstant_6_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5591:1: (lv_timeInstant_6_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5592:3: lv_timeInstant_6_0= RULE_INT
                    {
                    lv_timeInstant_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInstant11978); 

                    			newLeafNode(lv_timeInstant_6_0, grammarAccess.getTimeInstantAccess().getTimeInstantINTTerminalRuleCall_1_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"timeInstant",
                            		lv_timeInstant_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5608:4: ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5609:1: (lv_timeUnit_7_0= ruleTimeUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5609:1: (lv_timeUnit_7_0= ruleTimeUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5610:3: lv_timeUnit_7_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getTimeInstantAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeInstant12006);
            lv_timeUnit_7_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeInstantRule());
            	        }
                   		set(
                   			current, 
                   			"timeUnit",
                    		lv_timeUnit_7_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeInstant"


    // $ANTLR start "entryRuleTimeInterval"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5634:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5635:2: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5636:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_ruleTimeInterval_in_entryRuleTimeInterval12042);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;

             current =iv_ruleTimeInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeInterval12052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5643:1: ruleTimeInterval returns [EObject current=null] : ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_lowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_timeUnit_7_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5646:28: ( ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5647:1: ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5647:1: ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5647:2: () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5647:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5648:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeIntervalAccess().getTimeIntervalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleTimeInterval12098); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getWITHINKeyword_1());
                
            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleTimeInterval12110); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5661:1: ( (lv_lowerBound_3_0= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5662:1: (lv_lowerBound_3_0= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5662:1: (lv_lowerBound_3_0= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5663:3: lv_lowerBound_3_0= RULE_INT
            {
            lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInterval12127); 

            			newLeafNode(lv_lowerBound_3_0, grammarAccess.getTimeIntervalAccess().getLowerBoundINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeIntervalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTimeInterval12144); 

                	newLeafNode(otherlv_4, grammarAccess.getTimeIntervalAccess().getCommaKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5683:1: ( (lv_upperBound_5_0= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5684:1: (lv_upperBound_5_0= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5684:1: (lv_upperBound_5_0= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5685:3: lv_upperBound_5_0= RULE_INT
            {
            lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInterval12161); 

            			newLeafNode(lv_upperBound_5_0, grammarAccess.getTimeIntervalAccess().getUpperBoundINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeIntervalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleTimeInterval12178); 

                	newLeafNode(otherlv_6, grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_6());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5705:1: ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5706:1: (lv_timeUnit_7_0= ruleTimeUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5706:1: (lv_timeUnit_7_0= ruleTimeUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5707:3: lv_timeUnit_7_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getTimeIntervalAccess().getTimeUnitTimeUnitParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeInterval12199);
            lv_timeUnit_7_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeIntervalRule());
            	        }
                   		set(
                   			current, 
                   			"timeUnit",
                    		lv_timeUnit_7_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleRewardTimeInstant"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5731:1: entryRuleRewardTimeInstant returns [EObject current=null] : iv_ruleRewardTimeInstant= ruleRewardTimeInstant EOF ;
    public final EObject entryRuleRewardTimeInstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewardTimeInstant = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5732:2: (iv_ruleRewardTimeInstant= ruleRewardTimeInstant EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5733:2: iv_ruleRewardTimeInstant= ruleRewardTimeInstant EOF
            {
             newCompositeNode(grammarAccess.getRewardTimeInstantRule()); 
            pushFollow(FOLLOW_ruleRewardTimeInstant_in_entryRuleRewardTimeInstant12235);
            iv_ruleRewardTimeInstant=ruleRewardTimeInstant();

            state._fsp--;

             current =iv_ruleRewardTimeInstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewardTimeInstant12245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRewardTimeInstant"


    // $ANTLR start "ruleRewardTimeInstant"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5740:1: ruleRewardTimeInstant returns [EObject current=null] : ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleRewardTimeInstant() throws RecognitionException {
        EObject current = null;

        Token lv_isEqualTo_1_0=null;
        Token lv_isLessThanOrEqual_2_0=null;
        Token lv_timeValue_3_0=null;
        AntlrDatatypeRuleToken lv_timeUnit_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5743:28: ( ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5744:1: ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5744:1: ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5744:2: () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5744:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5745:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRewardTimeInstantAccess().getRewardTimeInstantAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5750:2: ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==78) ) {
                alt100=1;
            }
            else if ( (LA100_0==81) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5750:3: ( (lv_isEqualTo_1_0= 'AT' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5750:3: ( (lv_isEqualTo_1_0= 'AT' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5751:1: (lv_isEqualTo_1_0= 'AT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5751:1: (lv_isEqualTo_1_0= 'AT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5752:3: lv_isEqualTo_1_0= 'AT'
                    {
                    lv_isEqualTo_1_0=(Token)match(input,78,FOLLOW_78_in_ruleRewardTimeInstant12298); 

                            newLeafNode(lv_isEqualTo_1_0, grammarAccess.getRewardTimeInstantAccess().getIsEqualToATKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRewardTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isEqualTo", true, "AT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5766:6: ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5766:6: ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5767:1: (lv_isLessThanOrEqual_2_0= 'WITHIN' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5767:1: (lv_isLessThanOrEqual_2_0= 'WITHIN' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5768:3: lv_isLessThanOrEqual_2_0= 'WITHIN'
                    {
                    lv_isLessThanOrEqual_2_0=(Token)match(input,81,FOLLOW_81_in_ruleRewardTimeInstant12335); 

                            newLeafNode(lv_isLessThanOrEqual_2_0, grammarAccess.getRewardTimeInstantAccess().getIsLessThanOrEqualWITHINKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRewardTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isLessThanOrEqual", true, "WITHIN");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5781:3: ( (lv_timeValue_3_0= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5782:1: (lv_timeValue_3_0= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5782:1: (lv_timeValue_3_0= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5783:3: lv_timeValue_3_0= RULE_INT
            {
            lv_timeValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRewardTimeInstant12366); 

            			newLeafNode(lv_timeValue_3_0, grammarAccess.getRewardTimeInstantAccess().getTimeValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRewardTimeInstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timeValue",
                    		lv_timeValue_3_0, 
                    		"INT");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5799:2: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5800:1: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5800:1: (lv_timeUnit_4_0= ruleTimeUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5801:3: lv_timeUnit_4_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getRewardTimeInstantAccess().getTimeUnitTimeUnitParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleRewardTimeInstant12392);
            lv_timeUnit_4_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewardTimeInstantRule());
            	        }
                   		set(
                   			current, 
                   			"timeUnit",
                    		lv_timeUnit_4_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRewardTimeInstant"


    // $ANTLR start "entryRuleProbabilityConstraint"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5825:1: entryRuleProbabilityConstraint returns [EObject current=null] : iv_ruleProbabilityConstraint= ruleProbabilityConstraint EOF ;
    public final EObject entryRuleProbabilityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityConstraint = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5826:2: (iv_ruleProbabilityConstraint= ruleProbabilityConstraint EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5827:2: iv_ruleProbabilityConstraint= ruleProbabilityConstraint EOF
            {
             newCompositeNode(grammarAccess.getProbabilityConstraintRule()); 
            pushFollow(FOLLOW_ruleProbabilityConstraint_in_entryRuleProbabilityConstraint12428);
            iv_ruleProbabilityConstraint=ruleProbabilityConstraint();

            state._fsp--;

             current =iv_ruleProbabilityConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbabilityConstraint12438); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProbabilityConstraint"


    // $ANTLR start "ruleProbabilityConstraint"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5834:1: ruleProbabilityConstraint returns [EObject current=null] : ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) ) ;
    public final EObject ruleProbabilityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasUnknownProbability_4_0=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_probability_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5837:28: ( ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5838:1: ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5838:1: ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5838:2: () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5838:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5839:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProbabilityConstraintAccess().getProbabilityConstraintAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleProbabilityConstraint12484); 

                	newLeafNode(otherlv_1, grammarAccess.getProbabilityConstraintAccess().getWITHPROBABILITYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5848:1: ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=26 && LA101_0<=27)||(LA101_0>=101 && LA101_0<=104)) ) {
                alt101=1;
            }
            else if ( (LA101_0==83) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5848:2: ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5848:2: ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5848:3: ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5848:3: ( (lv_operator_2_0= ruleRelationalOperator ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5849:1: (lv_operator_2_0= ruleRelationalOperator )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5849:1: (lv_operator_2_0= ruleRelationalOperator )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5850:3: lv_operator_2_0= ruleRelationalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityConstraintAccess().getOperatorRelationalOperatorParserRuleCall_2_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleProbabilityConstraint12507);
                    lv_operator_2_0=ruleRelationalOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"RelationalOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5866:2: ( (lv_probability_3_0= ruleUnitInterval ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5867:1: (lv_probability_3_0= ruleUnitInterval )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5867:1: (lv_probability_3_0= ruleUnitInterval )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5868:3: lv_probability_3_0= ruleUnitInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityConstraintAccess().getProbabilityUnitIntervalParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnitInterval_in_ruleProbabilityConstraint12528);
                    lv_probability_3_0=ruleUnitInterval();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"probability",
                            		lv_probability_3_0, 
                            		"UnitInterval");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5885:6: ( (lv_hasUnknownProbability_4_0= '?' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5885:6: ( (lv_hasUnknownProbability_4_0= '?' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5886:1: (lv_hasUnknownProbability_4_0= '?' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5886:1: (lv_hasUnknownProbability_4_0= '?' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5887:3: lv_hasUnknownProbability_4_0= '?'
                    {
                    lv_hasUnknownProbability_4_0=(Token)match(input,83,FOLLOW_83_in_ruleProbabilityConstraint12553); 

                            newLeafNode(lv_hasUnknownProbability_4_0, grammarAccess.getProbabilityConstraintAccess().getHasUnknownProbabilityQuestionMarkKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProbabilityConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasUnknownProbability", true, "?");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProbabilityConstraint"


    // $ANTLR start "entryRuleConcentrationConstraint"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5908:1: entryRuleConcentrationConstraint returns [EObject current=null] : iv_ruleConcentrationConstraint= ruleConcentrationConstraint EOF ;
    public final EObject entryRuleConcentrationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcentrationConstraint = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5909:2: (iv_ruleConcentrationConstraint= ruleConcentrationConstraint EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5910:2: iv_ruleConcentrationConstraint= ruleConcentrationConstraint EOF
            {
             newCompositeNode(grammarAccess.getConcentrationConstraintRule()); 
            pushFollow(FOLLOW_ruleConcentrationConstraint_in_entryRuleConcentrationConstraint12603);
            iv_ruleConcentrationConstraint=ruleConcentrationConstraint();

            state._fsp--;

             current =iv_ruleConcentrationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationConstraint12613); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcentrationConstraint"


    // $ANTLR start "ruleConcentrationConstraint"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5917:1: ruleConcentrationConstraint returns [EObject current=null] : ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) ) ;
    public final EObject ruleConcentrationConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_isUnknown_4_0=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5920:28: ( ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5921:1: ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5921:1: ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=26 && LA102_0<=27)||(LA102_0>=101 && LA102_0<=104)) ) {
                alt102=1;
            }
            else if ( (LA102_0==83) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5921:2: ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5921:2: ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5921:3: () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5921:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5922:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConcentrationConstraintAccess().getConcentrationConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5927:2: ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5927:3: ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5927:3: ( (lv_operator_1_0= ruleRelationalOperator ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5928:1: (lv_operator_1_0= ruleRelationalOperator )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5928:1: (lv_operator_1_0= ruleRelationalOperator )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5929:3: lv_operator_1_0= ruleRelationalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcentrationConstraintAccess().getOperatorRelationalOperatorParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleConcentrationConstraint12670);
                    lv_operator_1_0=ruleRelationalOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConcentrationConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_1_0, 
                            		"RelationalOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5945:2: ( (lv_value_2_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5946:1: (lv_value_2_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5946:1: (lv_value_2_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5947:3: lv_value_2_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcentrationConstraintAccess().getValueREALParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleConcentrationConstraint12691);
                    lv_value_2_0=ruleREAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConcentrationConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"REAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5963:2: ( (lv_unit_3_0= ruleConcentrationUnit ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5964:1: (lv_unit_3_0= ruleConcentrationUnit )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5964:1: (lv_unit_3_0= ruleConcentrationUnit )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5965:3: lv_unit_3_0= ruleConcentrationUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcentrationConstraintAccess().getUnitConcentrationUnitParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleConcentrationConstraint12712);
                    lv_unit_3_0=ruleConcentrationUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConcentrationConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_3_0, 
                            		"ConcentrationUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5982:6: ( (lv_isUnknown_4_0= '?' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5982:6: ( (lv_isUnknown_4_0= '?' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5983:1: (lv_isUnknown_4_0= '?' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5983:1: (lv_isUnknown_4_0= '?' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5984:3: lv_isUnknown_4_0= '?'
                    {
                    lv_isUnknown_4_0=(Token)match(input,83,FOLLOW_83_in_ruleConcentrationConstraint12738); 

                            newLeafNode(lv_isUnknown_4_0, grammarAccess.getConcentrationConstraintAccess().getIsUnknownQuestionMarkKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConcentrationConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isUnknown", true, "?");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcentrationConstraint"


    // $ANTLR start "entryRulePropertyInitialCondition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6005:1: entryRulePropertyInitialCondition returns [EObject current=null] : iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF ;
    public final EObject entryRulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInitialCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6006:2: (iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6007:2: iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyInitialConditionRule()); 
            pushFollow(FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition12787);
            iv_rulePropertyInitialCondition=rulePropertyInitialCondition();

            state._fsp--;

             current =iv_rulePropertyInitialCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInitialCondition12797); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyInitialCondition"


    // $ANTLR start "rulePropertyInitialCondition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6014:1: rulePropertyInitialCondition returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) ) ;
    public final EObject rulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6017:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6018:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6018:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6018:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6018:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6019:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyInitialConditionAccess().getPropertyInitialConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6024:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6025:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6025:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6026:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition12852);
            lv_variable_1_0=ruleVariableAssignmentObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyInitialConditionRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"VariableAssignmentObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulePropertyInitialCondition12864); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyInitialConditionAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6046:1: ( (lv_value_3_0= ruleConcentrationQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6047:1: (lv_value_3_0= ruleConcentrationQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6047:1: (lv_value_3_0= ruleConcentrationQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6048:3: lv_value_3_0= ruleConcentrationQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getValueConcentrationQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_rulePropertyInitialCondition12885);
            lv_value_3_0=ruleConcentrationQuantity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyInitialConditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"ConcentrationQuantity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyInitialCondition"


    // $ANTLR start "entryRuleREAL"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6072:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6073:2: (iv_ruleREAL= ruleREAL EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6074:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL12922);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL12933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6081:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decimal_0 = null;

        AntlrDatatypeRuleToken this_DecimalExp_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6084:28: ( (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6085:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6085:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            int alt103=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA103_1 = input.LA(2);

                if ( (LA103_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 48:
                        {
                        int LA103_4 = input.LA(4);

                        if ( (LA103_4==RULE_INT) ) {
                            int LA103_7 = input.LA(5);

                            if ( ((LA103_7>=86 && LA103_7<=87)) ) {
                                alt103=2;
                            }
                            else if ( (LA103_7==EOF||LA103_7==RULE_ID||(LA103_7>=15 && LA103_7<=16)||LA103_7==18||(LA103_7>=20 && LA103_7<=24)||LA103_7==28||LA103_7==32||(LA103_7>=36 && LA103_7<=46)||(LA103_7>=50 && LA103_7<=56)||LA103_7==59||LA103_7==61||LA103_7==72||(LA103_7>=88 && LA103_7<=100)) ) {
                                alt103=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 103, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 103, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 86:
                    case 87:
                        {
                        alt103=2;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case 15:
                    case 16:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 28:
                    case 32:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 59:
                    case 61:
                    case 72:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                        {
                        alt103=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA103_2 = input.LA(2);

                if ( (LA103_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 48:
                        {
                        int LA103_4 = input.LA(4);

                        if ( (LA103_4==RULE_INT) ) {
                            int LA103_7 = input.LA(5);

                            if ( ((LA103_7>=86 && LA103_7<=87)) ) {
                                alt103=2;
                            }
                            else if ( (LA103_7==EOF||LA103_7==RULE_ID||(LA103_7>=15 && LA103_7<=16)||LA103_7==18||(LA103_7>=20 && LA103_7<=24)||LA103_7==28||LA103_7==32||(LA103_7>=36 && LA103_7<=46)||(LA103_7>=50 && LA103_7<=56)||LA103_7==59||LA103_7==61||LA103_7==72||(LA103_7>=88 && LA103_7<=100)) ) {
                                alt103=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 103, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 103, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 86:
                    case 87:
                        {
                        alt103=2;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case 15:
                    case 16:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 28:
                    case 32:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 59:
                    case 61:
                    case 72:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                        {
                        alt103=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    int LA103_4 = input.LA(3);

                    if ( (LA103_4==RULE_INT) ) {
                        int LA103_7 = input.LA(4);

                        if ( ((LA103_7>=86 && LA103_7<=87)) ) {
                            alt103=2;
                        }
                        else if ( (LA103_7==EOF||LA103_7==RULE_ID||(LA103_7>=15 && LA103_7<=16)||LA103_7==18||(LA103_7>=20 && LA103_7<=24)||LA103_7==28||LA103_7==32||(LA103_7>=36 && LA103_7<=46)||(LA103_7>=50 && LA103_7<=56)||LA103_7==59||LA103_7==61||LA103_7==72||(LA103_7>=88 && LA103_7<=100)) ) {
                            alt103=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 103, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 86:
                case 87:
                    {
                    alt103=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 15:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 28:
                case 32:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 59:
                case 61:
                case 72:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                    {
                    alt103=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6086:5: this_Decimal_0= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecimal_in_ruleREAL12980);
                    this_Decimal_0=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6098:5: this_DecimalExp_1= ruleDecimalExp
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDecimalExp_in_ruleREAL13013);
                    this_DecimalExp_1=ruleDecimalExp();

                    state._fsp--;


                    		current.merge(this_DecimalExp_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleUnitInterval"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6116:1: entryRuleUnitInterval returns [String current=null] : iv_ruleUnitInterval= ruleUnitInterval EOF ;
    public final String entryRuleUnitInterval() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnitInterval = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6117:2: (iv_ruleUnitInterval= ruleUnitInterval EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6118:2: iv_ruleUnitInterval= ruleUnitInterval EOF
            {
             newCompositeNode(grammarAccess.getUnitIntervalRule()); 
            pushFollow(FOLLOW_ruleUnitInterval_in_entryRuleUnitInterval13059);
            iv_ruleUnitInterval=ruleUnitInterval();

            state._fsp--;

             current =iv_ruleUnitInterval.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitInterval13070); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitInterval"


    // $ANTLR start "ruleUnitInterval"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6125:1: ruleUnitInterval returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) ) ;
    public final AntlrDatatypeRuleToken ruleUnitInterval() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6128:28: ( (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6129:1: (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6129:1: (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt106=1;
                }
                break;
            case 48:
                {
                alt106=2;
                }
                break;
            case 85:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6130:2: kw= '1.0'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleUnitInterval13108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getDigitOneFullStopDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6136:6: (kw= '.' (this_INT_2= RULE_INT )* )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6136:6: (kw= '.' (this_INT_2= RULE_INT )* )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6137:2: kw= '.' (this_INT_2= RULE_INT )*
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleUnitInterval13128); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getFullStopKeyword_1_0()); 
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6142:1: (this_INT_2= RULE_INT )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==RULE_INT) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6142:6: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnitInterval13144); 

                    	    		current.merge(this_INT_2);
                    	        
                    	     
                    	        newLeafNode(this_INT_2, grammarAccess.getUnitIntervalAccess().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6150:6: (kw= '0.' (this_INT_4= RULE_INT )* )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6150:6: (kw= '0.' (this_INT_4= RULE_INT )* )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6151:2: kw= '0.' (this_INT_4= RULE_INT )*
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleUnitInterval13172); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getDigitZeroFullStopKeyword_2_0()); 
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6156:1: (this_INT_4= RULE_INT )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==RULE_INT) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6156:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnitInterval13188); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getUnitIntervalAccess().getINTTerminalRuleCall_2_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitInterval"


    // $ANTLR start "entryRuleDecimal"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6171:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6175:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6176:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal13243);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal13254); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6186:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6190:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6191:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6191:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6191:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6191:2: (kw= '+' | kw= '-' )?
            int alt107=3;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==53) ) {
                alt107=1;
            }
            else if ( (LA107_0==54) ) {
                alt107=2;
            }
            switch (alt107) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6192:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleDecimal13297); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6199:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleDecimal13316); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal13333); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6211:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==48) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6212:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleDecimal13352); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal13367); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleDecimalExp"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6235:1: entryRuleDecimalExp returns [String current=null] : iv_ruleDecimalExp= ruleDecimalExp EOF ;
    public final String entryRuleDecimalExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimalExp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6239:2: (iv_ruleDecimalExp= ruleDecimalExp EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6240:2: iv_ruleDecimalExp= ruleDecimalExp EOF
            {
             newCompositeNode(grammarAccess.getDecimalExpRule()); 
            pushFollow(FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp13425);
            iv_ruleDecimalExp=ruleDecimalExp();

            state._fsp--;

             current =iv_ruleDecimalExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalExp13436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalExp"


    // $ANTLR start "ruleDecimalExp"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6250:1: ruleDecimalExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimalExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_9=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6254:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6255:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6255:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6255:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6255:2: (kw= '+' | kw= '-' )?
            int alt109=3;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==53) ) {
                alt109=1;
            }
            else if ( (LA109_0==54) ) {
                alt109=2;
            }
            switch (alt109) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6256:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleDecimalExp13479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6263:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleDecimalExp13498); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp13515); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6275:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==48) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6276:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleDecimalExp13534); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp13549); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6288:3: (kw= 'E' | kw= 'e' )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==86) ) {
                alt111=1;
            }
            else if ( (LA111_0==87) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6289:2: kw= 'E'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleDecimalExp13570); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6296:2: kw= 'e'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleDecimalExp13589); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6301:2: (kw= '+' | kw= '-' )?
            int alt112=3;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==53) ) {
                alt112=1;
            }
            else if ( (LA112_0==54) ) {
                alt112=2;
            }
            switch (alt112) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6302:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleDecimalExp13604); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6309:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleDecimalExp13623); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 
                        

                    }
                    break;

            }

            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp13640); 

            		current.merge(this_INT_9);
                
             
                newLeafNode(this_INT_9, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDecimalExp"


    // $ANTLR start "entryRuleTimeUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6332:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6333:2: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6334:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_ruleTimeUnit_in_entryRuleTimeUnit13690);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeUnit13701); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6341:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's' | kw= 'min' | kw= 'mins' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6344:28: ( (kw= 's' | kw= 'min' | kw= 'mins' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6345:1: (kw= 's' | kw= 'min' | kw= 'mins' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6345:1: (kw= 's' | kw= 'min' | kw= 'mins' )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt113=1;
                }
                break;
            case 89:
                {
                alt113=2;
                }
                break;
            case 90:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6346:2: kw= 's'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTimeUnit13739); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6353:2: kw= 'min'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleTimeUnit13758); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMinKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6360:2: kw= 'mins'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleTimeUnit13777); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMinsKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleFluxUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6373:1: entryRuleFluxUnit returns [String current=null] : iv_ruleFluxUnit= ruleFluxUnit EOF ;
    public final String entryRuleFluxUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFluxUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6374:2: (iv_ruleFluxUnit= ruleFluxUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6375:2: iv_ruleFluxUnit= ruleFluxUnit EOF
            {
             newCompositeNode(grammarAccess.getFluxUnitRule()); 
            pushFollow(FOLLOW_ruleFluxUnit_in_entryRuleFluxUnit13818);
            iv_ruleFluxUnit=ruleFluxUnit();

            state._fsp--;

             current =iv_ruleFluxUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluxUnit13829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFluxUnit"


    // $ANTLR start "ruleFluxUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6382:1: ruleFluxUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's^-1' | kw= 'min^-1' ) ;
    public final AntlrDatatypeRuleToken ruleFluxUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6385:28: ( (kw= 's^-1' | kw= 'min^-1' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6386:1: (kw= 's^-1' | kw= 'min^-1' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6386:1: (kw= 's^-1' | kw= 'min^-1' )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==91) ) {
                alt114=1;
            }
            else if ( (LA114_0==92) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6387:2: kw= 's^-1'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleFluxUnit13867); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFluxUnitAccess().getS1Keyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6394:2: kw= 'min^-1'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleFluxUnit13886); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFluxUnitAccess().getMin1Keyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFluxUnit"


    // $ANTLR start "entryRuleConcentrationUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6407:1: entryRuleConcentrationUnit returns [String current=null] : iv_ruleConcentrationUnit= ruleConcentrationUnit EOF ;
    public final String entryRuleConcentrationUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConcentrationUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6408:2: (iv_ruleConcentrationUnit= ruleConcentrationUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6409:2: iv_ruleConcentrationUnit= ruleConcentrationUnit EOF
            {
             newCompositeNode(grammarAccess.getConcentrationUnitRule()); 
            pushFollow(FOLLOW_ruleConcentrationUnit_in_entryRuleConcentrationUnit13927);
            iv_ruleConcentrationUnit=ruleConcentrationUnit();

            state._fsp--;

             current =iv_ruleConcentrationUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationUnit13938); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcentrationUnit"


    // $ANTLR start "ruleConcentrationUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6416:1: ruleConcentrationUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) ;
    public final AntlrDatatypeRuleToken ruleConcentrationUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6419:28: ( (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6420:1: (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6420:1: (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            int alt115=8;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt115=1;
                }
                break;
            case 94:
                {
                alt115=2;
                }
                break;
            case 95:
                {
                alt115=3;
                }
                break;
            case 96:
                {
                alt115=4;
                }
                break;
            case 97:
                {
                alt115=5;
                }
                break;
            case 98:
                {
                alt115=6;
                }
                break;
            case 99:
                {
                alt115=7;
                }
                break;
            case 100:
                {
                alt115=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6421:2: kw= 'M'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleConcentrationUnit13976); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6428:2: kw= 'mM'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleConcentrationUnit13995); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMMKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6435:2: kw= 'uM'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleConcentrationUnit14014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getUMKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6442:2: kw= 'nM'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleConcentrationUnit14033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getNMKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6449:2: kw= 'pM'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleConcentrationUnit14052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getPMKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6456:2: kw= 'fM'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleConcentrationUnit14071); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getFMKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6463:2: kw= 'molecule'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleConcentrationUnit14090); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMoleculeKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6470:2: kw= 'molecules'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleConcentrationUnit14109); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMoleculesKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcentrationUnit"


    // $ANTLR start "entryRuleUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6483:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6484:2: (iv_ruleUnit= ruleUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6485:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit14150);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit14161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6492:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TimeUnit_0 = null;

        AntlrDatatypeRuleToken this_FluxUnit_1 = null;

        AntlrDatatypeRuleToken this_ConcentrationUnit_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6495:28: ( (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6496:1: (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6496:1: (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit )
            int alt116=3;
            switch ( input.LA(1) ) {
            case 88:
            case 89:
            case 90:
                {
                alt116=1;
                }
                break;
            case 91:
            case 92:
                {
                alt116=2;
                }
                break;
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt116=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6497:5: this_TimeUnit_0= ruleTimeUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getTimeUnitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleUnit14208);
                    this_TimeUnit_0=ruleTimeUnit();

                    state._fsp--;


                    		current.merge(this_TimeUnit_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6509:5: this_FluxUnit_1= ruleFluxUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getFluxUnitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFluxUnit_in_ruleUnit14241);
                    this_FluxUnit_1=ruleFluxUnit();

                    state._fsp--;


                    		current.merge(this_FluxUnit_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6521:5: this_ConcentrationUnit_2= ruleConcentrationUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getConcentrationUnitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleUnit14274);
                    this_ConcentrationUnit_2=ruleConcentrationUnit();

                    state._fsp--;


                    		current.merge(this_ConcentrationUnit_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleQuantity"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6539:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6540:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6541:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_ruleQuantity_in_entryRuleQuantity14319);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantity14329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6548:1: ruleQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_units_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6551:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6552:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6552:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6552:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6552:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6553:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityAccess().getQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6558:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6559:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6559:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6560:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleQuantity14384);
            lv_value_1_0=ruleREAL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantityRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"REAL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6576:2: ( (lv_units_2_0= ruleUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6577:1: (lv_units_2_0= ruleUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6577:1: (lv_units_2_0= ruleUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6578:3: lv_units_2_0= ruleUnit
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getUnitsUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnit_in_ruleQuantity14405);
            lv_units_2_0=ruleUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantityRule());
            	        }
                   		set(
                   			current, 
                   			"units",
                    		lv_units_2_0, 
                    		"Unit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleConcentrationQuantity"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6602:1: entryRuleConcentrationQuantity returns [EObject current=null] : iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF ;
    public final EObject entryRuleConcentrationQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcentrationQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6603:2: (iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6604:2: iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF
            {
             newCompositeNode(grammarAccess.getConcentrationQuantityRule()); 
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_entryRuleConcentrationQuantity14441);
            iv_ruleConcentrationQuantity=ruleConcentrationQuantity();

            state._fsp--;

             current =iv_ruleConcentrationQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationQuantity14451); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcentrationQuantity"


    // $ANTLR start "ruleConcentrationQuantity"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6611:1: ruleConcentrationQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) ) ;
    public final EObject ruleConcentrationQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6614:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6615:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6615:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6615:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6615:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6616:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConcentrationQuantityAccess().getConcentrationQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6621:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6622:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6622:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6623:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getConcentrationQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleConcentrationQuantity14506);
            lv_value_1_0=ruleREAL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcentrationQuantityRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"REAL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6639:2: ( (lv_unit_2_0= ruleConcentrationUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6640:1: (lv_unit_2_0= ruleConcentrationUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6640:1: (lv_unit_2_0= ruleConcentrationUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6641:3: lv_unit_2_0= ruleConcentrationUnit
            {
             
            	        newCompositeNode(grammarAccess.getConcentrationQuantityAccess().getUnitConcentrationUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleConcentrationQuantity14527);
            lv_unit_2_0=ruleConcentrationUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcentrationQuantityRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_2_0, 
                    		"ConcentrationUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcentrationQuantity"


    // $ANTLR start "entryRuleRelationalOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6665:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6666:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6667:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator14564);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator14575); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6674:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6677:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6678:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6678:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt117=6;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt117=1;
                }
                break;
            case 102:
                {
                alt117=2;
                }
                break;
            case 26:
                {
                alt117=3;
                }
                break;
            case 27:
                {
                alt117=4;
                }
                break;
            case 103:
                {
                alt117=5;
                }
                break;
            case 104:
                {
                alt117=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6679:2: kw= '=='
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleRelationalOperator14613); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6686:2: kw= '!='
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleRelationalOperator14632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6693:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleRelationalOperator14651); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6700:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleRelationalOperator14670); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6707:2: kw= '<='
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleRelationalOperator14689); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6714:2: kw= '>='
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleRelationalOperator14708); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6729:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6730:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6731:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard14751);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard14762); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6738:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6741:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6742:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6742:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6743:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard14809);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6753:1: (kw= '.*' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==105) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6754:2: kw= '.*'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleQualifiedNameWithWildcard14828); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6767:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6768:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6769:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14871);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName14882); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6776:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6779:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6780:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6780:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6780:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14922); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6787:1: (kw= '.' this_ID_2= RULE_ID )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==48) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6788:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleQualifiedName14941); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14956); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleList"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6808:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6809:2: (iv_ruleList= ruleList EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6810:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList15003);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList15013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6817:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6820:28: ( ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6821:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6821:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6821:2: () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6821:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6822:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListAccess().getListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleList15059); 

                	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6831:1: ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6832:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6832:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6833:3: lv_entries_2_0= ruleAtomicVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList15080);
            lv_entries_2_0=ruleAtomicVariableExpressionObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListRule());
            	        }
                   		add(
                   			current, 
                   			"entries",
                    		lv_entries_2_0, 
                    		"AtomicVariableExpressionObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6849:2: (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==15) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6849:4: otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleList15093); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_3_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6853:1: ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6854:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6854:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6855:3: lv_entries_4_0= ruleAtomicVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList15114);
            	    lv_entries_4_0=ruleAtomicVariableExpressionObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entries",
            	            		lv_entries_4_0, 
            	            		"AtomicVariableExpressionObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);

            otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleList15128); 

                	newLeafNode(otherlv_5, grammarAccess.getListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\1\4\2\uffff\1\4\6\uffff";
    static final String DFA29_maxS =
        "\1\75\2\uffff\1\60\6\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\3";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\3\13\uffff\1\7\4\uffff\1\10\12\uffff\1\6\3\uffff\13\2\3\uffff"+
            "\3\2\3\uffff\1\1\2\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "\1\2\34\uffff\1\11\15\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1323:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation )";
        }
    }
    static final String DFA30_eotS =
        "\12\uffff";
    static final String DFA30_eofS =
        "\12\uffff";
    static final String DFA30_minS =
        "\1\4\2\uffff\1\4\6\uffff";
    static final String DFA30_maxS =
        "\1\75\2\uffff\1\60\6\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\3";
    static final String DFA30_specialS =
        "\12\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\3\13\uffff\1\7\4\uffff\1\10\12\uffff\1\6\3\uffff\13\2\3\uffff"+
            "\3\2\3\uffff\1\1\2\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "\1\2\34\uffff\1\11\15\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1423:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation )";
        }
    }
    static final String DFA31_eotS =
        "\14\uffff";
    static final String DFA31_eofS =
        "\14\uffff";
    static final String DFA31_minS =
        "\1\4\2\uffff\1\4\10\uffff";
    static final String DFA31_maxS =
        "\1\75\2\uffff\1\60\10\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\3";
    static final String DFA31_specialS =
        "\14\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\3\13\uffff\1\7\4\uffff\1\10\1\11\1\12\10\uffff\1\6\3\uffff"+
            "\13\2\3\uffff\3\2\3\uffff\1\1\2\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "\1\2\34\uffff\1\13\15\uffff\2\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1523:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation )";
        }
    }
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\14\uffff";
    static final String DFA33_minS =
        "\1\4\2\uffff\1\4\10\uffff";
    static final String DFA33_maxS =
        "\1\75\2\uffff\1\60\10\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\3";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\13\uffff\1\7\4\uffff\1\10\1\11\1\12\10\uffff\1\6\3\uffff"+
            "\13\2\3\uffff\3\2\3\uffff\1\1\2\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "\1\2\34\uffff\1\13\15\uffff\2\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1703:1: (this_RuleDefinition_0= ruleRuleDefinition | this_VariableDefinition_1= ruleVariableDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_ATGCDefinition_3= ruleATGCDefinition | this_PropertyDefinition_4= rulePropertyDefinition | this_DeviceDefinition_5= ruleDeviceDefinition | this_ProcessInstantiation_6= ruleProcessInstantiation | this_SystemInstantiation_7= ruleSystemInstantiation | this_PlasmidInstantiation_8= rulePlasmidInstantiation | this_ChromosomeInstantiation_9= ruleChromosomeInstantiation )";
        }
    }
    static final String DFA60_eotS =
        "\22\uffff";
    static final String DFA60_eofS =
        "\16\uffff\1\20\3\uffff";
    static final String DFA60_minS =
        "\14\4\2\uffff\2\4\2\uffff";
    static final String DFA60_maxS =
        "\1\64\13\4\2\uffff\1\75\1\107\2\uffff";
    static final String DFA60_acceptS =
        "\14\uffff\1\2\1\3\2\uffff\1\1\1\4";
    static final String DFA60_specialS =
        "\22\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\14\37\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\3\uffff\3\15",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "",
            "",
            "\1\20\13\uffff\1\20\3\uffff\5\20\3\uffff\1\20\3\uffff\1\20"+
            "\1\17\2\uffff\14\20\2\uffff\3\20\3\uffff\1\20\2\uffff\1\20\1"+
            "\uffff\1\20",
            "\3\21\33\uffff\1\20\22\uffff\2\21\20\uffff\1\21",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3209:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )";
        }
    }
    static final String DFA76_eotS =
        "\24\uffff";
    static final String DFA76_eofS =
        "\1\uffff\1\6\2\uffff\1\14\11\uffff\1\23\1\14\2\uffff\1\14\1\uffff";
    static final String DFA76_minS =
        "\2\4\2\6\1\4\3\uffff\1\4\3\6\2\uffff\2\4\2\6\1\4\1\uffff";
    static final String DFA76_maxS =
        "\1\66\1\110\2\6\1\144\3\uffff\1\4\1\6\2\66\2\uffff\1\110\1\144\2"+
        "\6\1\144\1\uffff";
    static final String DFA76_acceptS =
        "\5\uffff\1\6\1\1\1\2\4\uffff\1\4\1\5\5\uffff\1\3";
    static final String DFA76_specialS =
        "\24\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\1\5\1\4\56\uffff\1\2\1\3",
            "\1\6\12\uffff\2\6\1\uffff\1\6\1\uffff\5\6\3\uffff\1\6\3\uffff"+
            "\1\6\3\uffff\13\6\1\10\1\7\1\uffff\7\6\2\uffff\1\6\1\uffff\1"+
            "\6\12\uffff\1\6",
            "\1\4",
            "\1\4",
            "\1\14\12\uffff\2\14\1\uffff\1\14\1\uffff\5\14\3\uffff\1\14"+
            "\3\uffff\1\14\3\uffff\13\14\1\uffff\1\11\1\uffff\7\14\2\uffff"+
            "\1\14\1\uffff\1\14\12\uffff\1\14\15\uffff\1\12\1\13\15\15",
            "",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\22\56\uffff\1\20\1\21",
            "\1\22\56\uffff\1\20\1\21",
            "",
            "",
            "\1\23\12\uffff\2\23\1\uffff\1\23\1\uffff\5\23\3\uffff\1\23"+
            "\3\uffff\1\23\3\uffff\13\23\1\10\1\7\1\uffff\7\23\2\uffff\1"+
            "\23\1\uffff\1\23\12\uffff\1\23",
            "\1\14\12\uffff\2\14\1\uffff\1\14\1\uffff\5\14\3\uffff\1\14"+
            "\3\uffff\1\14\3\uffff\13\14\3\uffff\7\14\2\uffff\1\14\1\uffff"+
            "\1\14\12\uffff\1\14\15\uffff\1\12\1\13\15\15",
            "\1\22",
            "\1\22",
            "\1\14\12\uffff\2\14\1\uffff\1\14\1\uffff\5\14\3\uffff\1\14"+
            "\3\uffff\1\14\3\uffff\13\14\3\uffff\7\14\2\uffff\1\14\1\uffff"+
            "\1\14\12\uffff\1\14\17\uffff\15\15",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4197:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )";
        }
    }
    static final String DFA82_eotS =
        "\12\uffff";
    static final String DFA82_eofS =
        "\1\2\1\5\6\uffff\1\5\1\uffff";
    static final String DFA82_minS =
        "\2\4\1\uffff\2\4\1\uffff\4\4";
    static final String DFA82_maxS =
        "\2\75\1\uffff\1\75\1\4\1\uffff\1\107\2\75\1\107";
    static final String DFA82_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA82_specialS =
        "\12\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\1\13\uffff\1\2\3\uffff\5\2\7\uffff\1\2\3\uffff\13\2\3\uffff"+
            "\3\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2",
            "\1\3\13\uffff\1\5\3\uffff\5\5\7\uffff\1\5\1\2\2\uffff\13\5"+
            "\1\4\1\2\1\uffff\4\5\2\uffff\1\5\2\uffff\1\5\1\uffff\1\5",
            "",
            "\1\7\13\uffff\1\2\3\uffff\5\2\3\uffff\1\2\3\uffff\1\2\1\6\2"+
            "\uffff\13\2\2\5\1\uffff\3\2\3\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2",
            "\1\10",
            "",
            "\3\5\33\uffff\1\2\22\uffff\2\5\20\uffff\1\5",
            "\1\3\13\uffff\1\5\3\uffff\5\5\3\uffff\1\5\3\uffff\1\5\1\11"+
            "\2\uffff\13\5\2\2\1\uffff\3\5\3\uffff\1\5\2\uffff\1\5\1\uffff"+
            "\1\5",
            "\1\5\13\uffff\1\5\3\uffff\5\5\7\uffff\1\5\3\uffff\13\5\1\4"+
            "\1\2\1\uffff\4\5\2\uffff\1\5\2\uffff\1\5\1\uffff\1\5",
            "\3\2\33\uffff\1\5\22\uffff\2\2\20\uffff\1\2"
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "4515:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_ruleModel140 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleModelMember_in_entryRuleModelMember177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMember187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleModelMember234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleModelMember261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportStatement352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportStatement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFunctionDefinition467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionDefinition488 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDefinition500 = new BitSet(new long[]{0x0000000003E10010L});
    public static final BitSet FOLLOW_ruleProcessBody_in_ruleFunctionDefinition523 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleSystemBody_in_ruleFunctionDefinition542 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rulePlasmidBody_in_ruleFunctionDefinition561 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleChromosomeBody_in_ruleFunctionDefinition580 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleCellBody_in_ruleFunctionDefinition599 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleRegionBody_in_ruleFunctionDefinition618 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleCustomFunctionBody_in_ruleFunctionDefinition637 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition653 = new BitSet(new long[]{0x00007FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition674 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition687 = new BitSet(new long[]{0x00007FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition708 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleProcessBody_in_entryRuleProcessBody748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessBody758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProcessBody804 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcessBody816 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody838 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleProcessBody851 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody872 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleProcessBody888 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleProcessBody900 = new BitSet(new long[]{0x011C7FF000110010L});
    public static final BitSet FOLLOW_ruleProcessBodyMember_in_ruleProcessBody921 = new BitSet(new long[]{0x011C7FF000110010L});
    public static final BitSet FOLLOW_20_in_ruleProcessBody934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemBody_in_entryRuleSystemBody970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemBody980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSystemBody1026 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystemBody1038 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1060 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleSystemBody1073 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1094 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleSystemBody1110 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSystemBody1122 = new BitSet(new long[]{0x291C7FF100110010L});
    public static final BitSet FOLLOW_ruleSystemBodyMember_in_ruleSystemBody1143 = new BitSet(new long[]{0x291C7FF100110010L});
    public static final BitSet FOLLOW_20_in_ruleSystemBody1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidBody_in_entryRulePlasmidBody1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlasmidBody1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePlasmidBody1248 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlasmidBody1260 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1282 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulePlasmidBody1295 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1316 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulePlasmidBody1332 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlasmidBody1344 = new BitSet(new long[]{0x291C7FF100310010L});
    public static final BitSet FOLLOW_rulePlasmidBodyMember_in_rulePlasmidBody1365 = new BitSet(new long[]{0x291C7FF100310010L});
    public static final BitSet FOLLOW_20_in_rulePlasmidBody1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeBody_in_entryRuleChromosomeBody1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChromosomeBody1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleChromosomeBody1470 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChromosomeBody1482 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1504 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleChromosomeBody1517 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1538 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleChromosomeBody1554 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleChromosomeBody1566 = new BitSet(new long[]{0x291C7FF100310010L});
    public static final BitSet FOLLOW_ruleChromosomeBodyMember_in_ruleChromosomeBody1587 = new BitSet(new long[]{0x291C7FF100310010L});
    public static final BitSet FOLLOW_20_in_ruleChromosomeBody1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellBody_in_entryRuleCellBody1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellBody1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCellBody1692 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCellBody1704 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1726 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleCellBody1739 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1760 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleCellBody1776 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCellBody1788 = new BitSet(new long[]{0x291C7FF100F10010L});
    public static final BitSet FOLLOW_ruleCellBodyMember_in_ruleCellBody1809 = new BitSet(new long[]{0x291C7FF100F10010L});
    public static final BitSet FOLLOW_20_in_ruleCellBody1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionBody_in_entryRuleRegionBody1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionBody1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRegionBody1914 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRegionBody1926 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody1948 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleRegionBody1961 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody1982 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleRegionBody1998 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRegionBody2010 = new BitSet(new long[]{0x011C7FF001100010L});
    public static final BitSet FOLLOW_ruleRegionBodyMember_in_ruleRegionBody2031 = new BitSet(new long[]{0x011C7FF001100010L});
    public static final BitSet FOLLOW_20_in_ruleRegionBody2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFunctionBody_in_entryRuleCustomFunctionBody2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomFunctionBody2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleCustomFunctionBody2145 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustomFunctionBody2157 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2179 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleCustomFunctionBody2192 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2213 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleCustomFunctionBody2229 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomFunctionBody2241 = new BitSet(new long[]{0x291C7FF100F10010L});
    public static final BitSet FOLLOW_ruleCustomFunctionBodyMember_in_ruleCustomFunctionBody2262 = new BitSet(new long[]{0x291C7FF100F10010L});
    public static final BitSet FOLLOW_20_in_ruleCustomFunctionBody2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessBodyMember_in_entryRuleProcessBodyMember2311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessBodyMember2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleProcessBodyMember2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleProcessBodyMember2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleProcessBodyMember2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleProcessBodyMember2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemBodyMember_in_entryRuleSystemBodyMember2484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemBodyMember2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleSystemBodyMember2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleSystemBodyMember2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleSystemBodyMember2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleSystemBodyMember2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleSystemBodyMember2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleSystemBodyMember2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleSystemBodyMember2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidBodyMember_in_entryRulePlasmidBodyMember2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlasmidBodyMember2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_rulePlasmidBodyMember2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_rulePlasmidBodyMember2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rulePlasmidBodyMember2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_rulePlasmidBodyMember2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rulePlasmidBodyMember2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_rulePlasmidBodyMember2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_rulePlasmidBodyMember2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemInstantiation_in_rulePlasmidBodyMember2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeBodyMember_in_entryRuleChromosomeBodyMember3019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChromosomeBodyMember3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleChromosomeBodyMember3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleChromosomeBodyMember3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleChromosomeBodyMember3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleChromosomeBodyMember3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleChromosomeBodyMember3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleChromosomeBodyMember3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleChromosomeBodyMember3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemInstantiation_in_ruleChromosomeBodyMember3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellBodyMember_in_entryRuleCellBodyMember3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellBodyMember3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleCellBodyMember3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleCellBodyMember3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleCellBodyMember3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleCellBodyMember3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleCellBodyMember3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleCellBodyMember3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleCellBodyMember3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemInstantiation_in_ruleCellBodyMember3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidInstantiation_in_ruleCellBodyMember3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeInstantiation_in_ruleCellBodyMember3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionBodyMember_in_entryRuleRegionBodyMember3635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionBodyMember3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleRegionBodyMember3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleRegionBodyMember3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleRegionBodyMember3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellInstantiation_in_ruleRegionBodyMember3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFunctionBodyMember_in_entryRuleCustomFunctionBodyMember3808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomFunctionBodyMember3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleCustomFunctionBodyMember3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleCustomFunctionBodyMember3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleCustomFunctionBodyMember3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleCustomFunctionBodyMember3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleCustomFunctionBodyMember3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleCustomFunctionBodyMember4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleCustomFunctionBodyMember4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemInstantiation_in_ruleCustomFunctionBodyMember4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidInstantiation_in_ruleCustomFunctionBodyMember4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeInstantiation_in_ruleCustomFunctionBodyMember4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionParameterMember4200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleFunctionParameterMember4228 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionParameterMember4240 = new BitSet(new long[]{0x00007FF000000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionParameterMember4263 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionParameterMember4282 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionParameterMember4297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionParameterMember4320 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionParameterMember4333 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope4393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterScope4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionParameterScope4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunctionParameterScope4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunctionParameterScope4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember4520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUseMember4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionUseMember4576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionUseMember4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition4633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDefinition4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition4689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeviceDefinition4710 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition4722 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDeviceDefinition4734 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition4746 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition4758 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDeviceDefinition4770 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition4782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition4803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition4815 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition4827 = new BitSet(new long[]{0x0000000020048000L});
    public static final BitSet FOLLOW_29_in_ruleDeviceDefinition4840 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition4852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition4873 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleDeviceDefinition4888 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDeviceDefinition4900 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition4912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition4933 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition4947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDeviceDefinition4959 = new BitSet(new long[]{0x291C7FF000110010L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition4980 = new BitSet(new long[]{0x291C7FF000110010L});
    public static final BitSet FOLLOW_20_in_ruleDeviceDefinition4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceMembers5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleDeviceMembers5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_entryRuleProcessInstantiation5202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessInstantiation5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProcessInstantiation5258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleProcessInstantiation5279 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleProcessInstantiation5292 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleProcessInstantiation5304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleProcessInstantiation5325 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcessInstantiation5337 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation5359 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleProcessInstantiation5372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation5393 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleProcessInstantiation5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemInstantiation_in_entryRuleSystemInstantiation5447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemInstantiation5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSystemInstantiation5503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleSystemInstantiation5524 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleSystemInstantiation5537 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSystemInstantiation5549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleSystemInstantiation5570 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystemInstantiation5582 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation5604 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleSystemInstantiation5617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation5638 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleSystemInstantiation5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidInstantiation_in_entryRulePlasmidInstantiation5692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlasmidInstantiation5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePlasmidInstantiation5748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_rulePlasmidInstantiation5769 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulePlasmidInstantiation5782 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePlasmidInstantiation5794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_rulePlasmidInstantiation5815 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlasmidInstantiation5827 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation5849 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulePlasmidInstantiation5862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation5883 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulePlasmidInstantiation5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeInstantiation_in_entryRuleChromosomeInstantiation5937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChromosomeInstantiation5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleChromosomeInstantiation5993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation6014 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleChromosomeInstantiation6027 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleChromosomeInstantiation6039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation6060 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChromosomeInstantiation6072 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation6094 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleChromosomeInstantiation6107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation6128 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleChromosomeInstantiation6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellInstantiation_in_entryRuleCellInstantiation6182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellInstantiation6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCellInstantiation6238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleCellInstantiation6259 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleCellInstantiation6272 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCellInstantiation6284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleCellInstantiation6305 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCellInstantiation6317 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation6339 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleCellInstantiation6352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation6373 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleCellInstantiation6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName6428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType6523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVariableType6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVariableType6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariableType6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVariableType6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVariableType6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVariableType6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVariableType6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVariableType6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariableType6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariableType6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVariableType6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex6802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableComplex6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex6867 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleVariableComplex6880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex6901 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute6939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute7005 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleVariableAttribute7032 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleVariableAttribute7045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition7102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition7169 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition7188 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition7207 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition7226 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleVariableDefinition7242 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier7302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVariableQualifier7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn7389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn7454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn7476 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn7503 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionBuiltIn7517 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleVariableDefinitionBuiltIn7529 = new BitSet(new long[]{0x00007FF000000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn7552 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn7571 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinitionBuiltIn7586 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn7608 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionBuiltIn7621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn7642 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinitionBuiltIn7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined7696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined7761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined7782 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionUserDefined7795 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleVariableDefinitionUserDefined7807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined7828 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinitionUserDefined7840 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined7862 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionUserDefined7875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined7896 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinitionUserDefined7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection7950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionCollection7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection8016 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVariableDefinitionCollection8028 = new BitSet(new long[]{0x00007FF000000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection8051 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection8070 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVariableDefinitionCollection8085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection8106 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionCollection8120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleVariableDefinitionCollection8141 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinitionCollection8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID8192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCollectionID8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCollectionID8260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCollectionID8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic8319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBasic8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic8384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic8405 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionBasic8417 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment8474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterAssignment8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleParameterAssignment8530 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleParameterAssignment8542 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment8563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment8599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment8664 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableAssignment8676 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableAssignment8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject8733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentObject8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression8857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression8922 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression8939 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression8959 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject8997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionObject9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject9116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject9237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject9291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject9355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator9457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator9468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVariableExpressionOperator9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVariableExpressionOperator9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVariableExpressionOperator9544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition9584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRuleDefinition9640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleDefinition9661 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRuleDefinition9673 = new BitSet(new long[]{0x0600000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition9695 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_53_in_ruleRuleDefinition9708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition9729 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_57_in_ruleRuleDefinition9746 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_58_in_ruleRuleDefinition9770 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition9806 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleRuleDefinition9819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition9840 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject9880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleObject9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleRuleObject9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition10004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCDefinition10014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleATGCDefinition10060 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_ruleATGCDefinition10081 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleATGCDefinition10093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition10114 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleATGCDefinition10127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition10148 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand10187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCCommand10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleATGCCommand10235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition10274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition10284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePropertyDefinition10330 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleProbabilityProperty_in_rulePropertyDefinition10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewardProperty_in_rulePropertyDefinition10372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbabilityProperty_in_entryRuleProbabilityProperty10411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityProperty10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleProbabilityProperty10476 = new BitSet(new long[]{0xC000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_62_in_ruleProbabilityProperty10498 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_63_in_ruleProbabilityProperty10535 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_64_in_ruleProbabilityProperty10572 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_65_in_ruleProbabilityProperty10612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66_in_ruleProbabilityProperty10649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleProbabilityProperty10684 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_ruleTimeInstant_in_ruleProbabilityProperty10708 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_ruleTimeInterval_in_ruleProbabilityProperty10735 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_67_in_ruleProbabilityProperty10763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_68_in_ruleProbabilityProperty10800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProbabilityConstraint_in_ruleProbabilityProperty10836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleProbabilityProperty10850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty10871 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleProbabilityProperty10884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty10905 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleRewardProperty_in_entryRuleRewardProperty10945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewardProperty10955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleRewardProperty11001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleRewardProperty11013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRewardProperty11034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleRewardProperty11046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleRewardTimeInstant_in_ruleRewardProperty11067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleRewardProperty11079 = new BitSet(new long[]{0x000000000C000000L,0x000001E000080000L});
    public static final BitSet FOLLOW_ruleConcentrationConstraint_in_ruleRewardProperty11100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleRewardProperty11113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty11134 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRewardProperty11147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty11168 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleStateExpression_in_entryRuleStateExpression11208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExpression11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleStateExpression11273 = new BitSet(new long[]{0x000000000C000000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleStateExpression11294 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_ruleStateExpression11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula11351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleStateFormula11414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStateExpression_in_ruleStateFormula11448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStateFormula11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleStateFormula11480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleStateFormula11498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula11532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStateFormula11544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleStateFormula11564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula11585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_ruleStateFormula11604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_76_in_ruleStateFormula11641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_77_in_ruleStateFormula11678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula11713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStateFormula11725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeInstant_in_entryRuleTimeInstant11762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeInstant11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTimeInstant11826 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInstant11856 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_79_in_ruleTimeInstant11887 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInstant11917 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_80_in_ruleTimeInstant11948 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInstant11978 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeInstant12006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeInterval_in_entryRuleTimeInterval12042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeInterval12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTimeInterval12098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleTimeInterval12110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInterval12127 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTimeInterval12144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInterval12161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleTimeInterval12178 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeInterval12199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewardTimeInstant_in_entryRuleRewardTimeInstant12235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewardTimeInstant12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleRewardTimeInstant12298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_81_in_ruleRewardTimeInstant12335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRewardTimeInstant12366 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleRewardTimeInstant12392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbabilityConstraint_in_entryRuleProbabilityConstraint12428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityConstraint12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleProbabilityConstraint12484 = new BitSet(new long[]{0x000000000C000000L,0x000001E000080000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleProbabilityConstraint12507 = new BitSet(new long[]{0x0001000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleUnitInterval_in_ruleProbabilityConstraint12528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleProbabilityConstraint12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationConstraint_in_entryRuleConcentrationConstraint12603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationConstraint12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleConcentrationConstraint12670 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleConcentrationConstraint12691 = new BitSet(new long[]{0x0000000000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleConcentrationConstraint12712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleConcentrationConstraint12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition12787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInitialCondition12797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition12852 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePropertyInitialCondition12864 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_rulePropertyInitialCondition12885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL12922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleREAL12980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_ruleREAL13013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitInterval_in_entryRuleUnitInterval13059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitInterval13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnitInterval13108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUnitInterval13128 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnitInterval13144 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_85_in_ruleUnitInterval13172 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnitInterval13188 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal13243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal13254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDecimal13297 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54_in_ruleDecimal13316 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal13333 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDecimal13352 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal13367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp13425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalExp13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDecimalExp13479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54_in_ruleDecimalExp13498 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp13515 = new BitSet(new long[]{0x0001000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_48_in_ruleDecimalExp13534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp13549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_ruleDecimalExp13570 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_87_in_ruleDecimalExp13589 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_53_in_ruleDecimalExp13604 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54_in_ruleDecimalExp13623 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_entryRuleTimeUnit13690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeUnit13701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTimeUnit13739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTimeUnit13758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTimeUnit13777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluxUnit_in_entryRuleFluxUnit13818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluxUnit13829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleFluxUnit13867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleFluxUnit13886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_entryRuleConcentrationUnit13927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationUnit13938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleConcentrationUnit13976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleConcentrationUnit13995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleConcentrationUnit14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleConcentrationUnit14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleConcentrationUnit14052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleConcentrationUnit14071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleConcentrationUnit14090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleConcentrationUnit14109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit14150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit14161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleUnit14208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluxUnit_in_ruleUnit14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleUnit14274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity14319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantity14329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleQuantity14384 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFF000000L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleQuantity14405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_entryRuleConcentrationQuantity14441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationQuantity14451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleConcentrationQuantity14506 = new BitSet(new long[]{0x0000000000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleConcentrationQuantity14527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator14564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator14575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleRelationalOperator14613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleRelationalOperator14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelationalOperator14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRelationalOperator14670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleRelationalOperator14689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleRelationalOperator14708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard14751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard14809 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleQualifiedNameWithWildcard14828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName14882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14922 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleQualifiedName14941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14956 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList15003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList15013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleList15059 = new BitSet(new long[]{0x0060000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList15080 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_15_in_ruleList15093 = new BitSet(new long[]{0x0060000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList15114 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleList15128 = new BitSet(new long[]{0x0000000000000002L});

}