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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'define'", "'typeof'", "'('", "','", "')'", "'{'", "'}'", "'USES'", "'PROCESS'", "'CELL'", "'SYSTEM'", "'REGION'", "'<'", "'>'", "':'", "'input'", "'output'", "'optional'", "'~'", "'.'", "'='", "'new'", "'observable'", "'MOLECULE'", "'RIBOSOME'", "'PROMOTER'", "'PROTEIN'", "'DNA'", "'RNA'", "'GENE'", "'INTEGER'", "'RATE'", "'CHASSIS'", "'COMPLEX'", "'LIST'", "'SET'", "'HASH'", "'+'", "'-'", "'|'", "'RULE'", "'->'", "'<->'", "'DEVICE'", "'parts'", "'ATGC'", "'ARRANGE'", "'VERIFY'", "'['", "']'", "'EXPECTED'", "'AT TIME INSTANT'", "'IS'", "'?'", "'WILL HOLD'", "'NEVER HOLDS'", "'ALWAYS HOLDS'", "'EVENTUALLY HOLDS'", "'SOMETIMES HOLDS'", "'WITHIN TIME BOUND'", "'WITH PROBABILITY BOUND'", "'GIVEN'", "'E'", "'e'", "'s'", "'min'", "'mins'", "'s^-1'", "'min^-1'", "'M'", "'mM'", "'uM'", "'nM'", "'pM'", "'fM'", "'molecule'", "'molecules'", "'=='", "'!='", "'<='", "'>='", "'&'", "'AND'", "'OR'", "'NOT'", "'.*'"
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
    public static final int T__59=59;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:201:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:202:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:203:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition409);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition419); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:210:1: ruleFunctionDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_4_1 = null;

        AntlrDatatypeRuleToken lv_type_4_2 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_members_11_0 = null;

        EObject lv_uses_14_0 = null;

        EObject lv_uses_16_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:213:28: ( ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:214:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:214:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:214:2: () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:214:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:215:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFunctionDefinition465); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:224:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:225:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:225:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:226:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionDefinition486);
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDefinition498); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionDefinitionAccess().getTypeofKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:246:1: ( ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:247:1: ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:247:1: ( (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:248:1: (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:248:1: (lv_type_4_1= ruleFunctionType | lv_type_4_2= ruleVariableName )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=20 && LA3_0<=23)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:249:3: lv_type_4_1= ruleFunctionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTypeFunctionTypeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionType_in_ruleFunctionDefinition521);
                    lv_type_4_1=ruleFunctionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_1, 
                            		"FunctionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:264:8: lv_type_4_2= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTypeVariableNameParserRuleCall_4_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionDefinition540);
                    lv_type_4_2=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_2, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition555); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:286:1: ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=20 && LA5_0<=22)||(LA5_0>=35 && LA5_0<=48)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:286:2: ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:286:2: ( (lv_parameters_6_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:287:1: (lv_parameters_6_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:287:1: (lv_parameters_6_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:288:3: lv_parameters_6_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition577);
                    lv_parameters_6_0=ruleFunctionParameterMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_6_0, 
                            		"FunctionParameterMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:304:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:304:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition590); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:308:1: ( (lv_parameters_8_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:309:1: (lv_parameters_8_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:309:1: (lv_parameters_8_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:310:3: lv_parameters_8_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition611);
                    	    lv_parameters_8_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_8_0, 
                    	            		"FunctionParameterMember");
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

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition627); 

                	newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_7());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleFunctionDefinition639); 

                	newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:334:1: ( (lv_members_11_0= ruleFunctionBodyMember ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=20 && LA6_0<=22)||(LA6_0>=34 && LA6_0<=48)||LA6_0==52||LA6_0==55||LA6_0==57||LA6_0==59) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:335:1: (lv_members_11_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:335:1: (lv_members_11_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:336:3: lv_members_11_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionBodyMemberParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleFunctionDefinition660);
            	    lv_members_11_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_11_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDefinition673); 

                	newLeafNode(otherlv_12, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_10());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:356:1: (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:356:3: otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )*
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleFunctionDefinition686); 

                        	newLeafNode(otherlv_13, grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_11_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:360:1: ( (lv_uses_14_0= ruleFunctionUseMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:361:1: (lv_uses_14_0= ruleFunctionUseMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:361:1: (lv_uses_14_0= ruleFunctionUseMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:362:3: lv_uses_14_0= ruleFunctionUseMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition707);
                    lv_uses_14_0=ruleFunctionUseMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"uses",
                            		lv_uses_14_0, 
                            		"FunctionUseMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:378:2: (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:378:4: otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition720); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_11_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:382:1: ( (lv_uses_16_0= ruleFunctionUseMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:383:1: (lv_uses_16_0= ruleFunctionUseMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:383:1: (lv_uses_16_0= ruleFunctionUseMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:384:3: lv_uses_16_0= ruleFunctionUseMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition741);
                    	    lv_uses_16_0=ruleFunctionUseMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"uses",
                    	            		lv_uses_16_0, 
                    	            		"FunctionUseMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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


    // $ANTLR start "entryRuleFunctionType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:408:1: entryRuleFunctionType returns [String current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final String entryRuleFunctionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:409:2: (iv_ruleFunctionType= ruleFunctionType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:410:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_ruleFunctionType_in_entryRuleFunctionType782);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;

             current =iv_ruleFunctionType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionType793); 

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
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:417:1: ruleFunctionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:420:28: ( (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:421:1: (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:421:1: (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:422:2: kw= 'PROCESS'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleFunctionType831); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getPROCESSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:429:2: kw= 'CELL'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleFunctionType850); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getCELLKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:436:2: kw= 'SYSTEM'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleFunctionType869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getSYSTEMKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:443:2: kw= 'REGION'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleFunctionType888); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getREGIONKeyword_3()); 
                        

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
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleFunctionParameterMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:456:1: entryRuleFunctionParameterMember returns [EObject current=null] : iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF ;
    public final EObject entryRuleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:457:2: (iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:458:2: iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember928);
            iv_ruleFunctionParameterMember=ruleFunctionParameterMember();

            state._fsp--;

             current =iv_ruleFunctionParameterMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember938); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:465:1: ruleFunctionParameterMember returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:468:28: ( ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:1: ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:1: ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:2: ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:2: ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=20 && LA11_0<=22)||(LA11_0>=35 && LA11_0<=45)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=46 && LA11_0<=48)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:3: ( (lv_type_0_0= ruleVariableType ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:3: ( (lv_type_0_0= ruleVariableType ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:470:1: (lv_type_0_0= ruleVariableType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:470:1: (lv_type_0_0= ruleVariableType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:471:3: lv_type_0_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionParameterMember985);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:488:6: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:488:6: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:488:7: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>'
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:488:7: ( (lv_collection_1_0= ruleCollectionID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:489:1: (lv_collection_1_0= ruleCollectionID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:489:1: (lv_collection_1_0= ruleCollectionID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:490:3: lv_collection_1_0= ruleCollectionID
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getCollectionCollectionIDParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionID_in_ruleFunctionParameterMember1013);
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

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleFunctionParameterMember1025); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterMemberAccess().getLessThanSignKeyword_0_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:510:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:511:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:511:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:512:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:512:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=20 && LA10_0<=22)||(LA10_0>=35 && LA10_0<=45)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_ID) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:513:3: lv_type_3_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableTypeParserRuleCall_0_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionParameterMember1048);
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:528:8: lv_type_3_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableNameParserRuleCall_0_1_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionParameterMember1067);
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

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleFunctionParameterMember1082); 

                        	newLeafNode(otherlv_4, grammarAccess.getFunctionParameterMemberAccess().getGreaterThanSignKeyword_0_1_3());
                        

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:550:3: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:551:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:551:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:552:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionParameterMember1105);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:568:2: (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:568:4: otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleFunctionParameterMember1118); 

                        	newLeafNode(otherlv_6, grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:572:1: ( (lv_scope_7_0= ruleFunctionParameterScope ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:573:1: (lv_scope_7_0= ruleFunctionParameterScope )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:573:1: (lv_scope_7_0= ruleFunctionParameterScope )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:574:3: lv_scope_7_0= ruleFunctionParameterScope
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getScopeFunctionParameterScopeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember1139);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:598:1: entryRuleFunctionParameterScope returns [String current=null] : iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF ;
    public final String entryRuleFunctionParameterScope() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionParameterScope = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:599:2: (iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:2: iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterScopeRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope1178);
            iv_ruleFunctionParameterScope=ruleFunctionParameterScope();

            state._fsp--;

             current =iv_ruleFunctionParameterScope.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterScope1189); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:607:1: ruleFunctionParameterScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'input' | kw= 'output' | kw= 'optional' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionParameterScope() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:610:28: ( (kw= 'input' | kw= 'output' | kw= 'optional' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:611:1: (kw= 'input' | kw= 'output' | kw= 'optional' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:611:1: (kw= 'input' | kw= 'output' | kw= 'optional' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:612:2: kw= 'input'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleFunctionParameterScope1227); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getInputKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:619:2: kw= 'output'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleFunctionParameterScope1246); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getOutputKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:626:2: kw= 'optional'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleFunctionParameterScope1265); 

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


    // $ANTLR start "entryRuleFunctionBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:639:1: entryRuleFunctionBodyMember returns [EObject current=null] : iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF ;
    public final EObject entryRuleFunctionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:640:2: (iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:641:2: iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionBodyMember_in_entryRuleFunctionBodyMember1305);
            iv_ruleFunctionBodyMember=ruleFunctionBodyMember();

            state._fsp--;

             current =iv_ruleFunctionBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBodyMember1315); 

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
    // $ANTLR end "entryRuleFunctionBodyMember"


    // $ANTLR start "ruleFunctionBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:648:1: ruleFunctionBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition ) ;
    public final EObject ruleFunctionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_DeviceDefinition_1 = null;

        EObject this_VariableDefinition_2 = null;

        EObject this_VariableAssignment_3 = null;

        EObject this_ATGCDefinition_4 = null;

        EObject this_PropertyDefinition_5 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:651:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:652:1: (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:652:1: (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt14=1;
                }
                break;
            case 55:
                {
                alt14=2;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 34:
            case 35:
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
            case 47:
            case 48:
                {
                alt14=3;
                }
                break;
            case RULE_ID:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==RULE_ID) ) {
                    alt14=3;
                }
                else if ( ((LA14_4>=30 && LA14_4<=32)) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                alt14=5;
                }
                break;
            case 59:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:653:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleFunctionBodyMember1362);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:663:5: this_DeviceDefinition_1= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getDeviceDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleFunctionBodyMember1389);
                    this_DeviceDefinition_1=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:673:5: this_VariableDefinition_2= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getVariableDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleFunctionBodyMember1416);
                    this_VariableDefinition_2=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:683:5: this_VariableAssignment_3= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getVariableAssignmentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleFunctionBodyMember1443);
                    this_VariableAssignment_3=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:693:5: this_ATGCDefinition_4= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getATGCDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleFunctionBodyMember1470);
                    this_ATGCDefinition_4=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:703:5: this_PropertyDefinition_5= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getPropertyDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleFunctionBodyMember1497);
                    this_PropertyDefinition_5=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_5; 
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
    // $ANTLR end "ruleFunctionBodyMember"


    // $ANTLR start "entryRuleFunctionUseMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:719:1: entryRuleFunctionUseMember returns [EObject current=null] : iv_ruleFunctionUseMember= ruleFunctionUseMember EOF ;
    public final EObject entryRuleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUseMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:720:2: (iv_ruleFunctionUseMember= ruleFunctionUseMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:721:2: iv_ruleFunctionUseMember= ruleFunctionUseMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionUseMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember1532);
            iv_ruleFunctionUseMember=ruleFunctionUseMember();

            state._fsp--;

             current =iv_ruleFunctionUseMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUseMember1542); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:728:1: ruleFunctionUseMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) ;
    public final EObject ruleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:731:28: ( ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:2: ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:2: ( (lv_type_0_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:733:1: (lv_type_0_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:733:1: (lv_type_0_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:734:3: lv_type_0_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getTypeVariableTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionUseMember1588);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:750:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:751:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:751:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:752:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionUseMember1609);
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


    // $ANTLR start "entryRuleVariableName"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:776:1: entryRuleVariableName returns [String current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final String entryRuleVariableName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:777:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:778:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName1646);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName1657); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:785:1: ruleVariableName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVariableName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:788:28: (this_ID_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:789:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableName1696); 

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


    // $ANTLR start "entryRuleVariableComplex"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:804:1: entryRuleVariableComplex returns [EObject current=null] : iv_ruleVariableComplex= ruleVariableComplex EOF ;
    public final EObject entryRuleVariableComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableComplex = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:805:2: (iv_ruleVariableComplex= ruleVariableComplex EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:806:2: iv_ruleVariableComplex= ruleVariableComplex EOF
            {
             newCompositeNode(grammarAccess.getVariableComplexRule()); 
            pushFollow(FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex1740);
            iv_ruleVariableComplex=ruleVariableComplex();

            state._fsp--;

             current =iv_ruleVariableComplex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableComplex1750); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:813:1: ruleVariableComplex returns [EObject current=null] : ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) ;
    public final EObject ruleVariableComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_components_1_0 = null;

        AntlrDatatypeRuleToken lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:816:28: ( ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:817:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:817:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:817:2: () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:817:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:818:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableComplexAccess().getVariableComplexAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:823:2: ( (lv_components_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:824:1: (lv_components_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:824:1: (lv_components_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:825:3: lv_components_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex1805);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:841:2: (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:841:4: otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleVariableComplex1818); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVariableComplexAccess().getTildeKeyword_2_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:845:1: ( (lv_components_3_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:846:1: (lv_components_3_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:846:1: (lv_components_3_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:847:3: lv_components_3_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex1839);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:871:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:872:2: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:873:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute1877);
            iv_ruleVariableAttribute=ruleVariableAttribute();

            state._fsp--;

             current =iv_ruleVariableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute1887); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:880:1: ruleVariableAttribute returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_complex_2_0 = null;

        AntlrDatatypeRuleToken lv_attribute_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:883:28: ( ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:884:1: ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:884:1: ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:884:2: () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:884:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:885:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:890:2: ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==30) ) {
                    alt16=2;
                }
                else if ( (LA16_1==31) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:890:3: ( (lv_name_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:890:3: ( (lv_name_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:891:1: (lv_name_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:891:1: (lv_name_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:3: lv_name_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getNameVariableNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute1943);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:909:6: ( (lv_complex_2_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:909:6: ( (lv_complex_2_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:910:1: (lv_complex_2_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:910:1: (lv_complex_2_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:911:3: lv_complex_2_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getComplexVariableComplexParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleVariableAttribute1970);
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleVariableAttribute1983); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:931:1: ( (lv_attribute_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:932:1: (lv_attribute_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:932:1: (lv_attribute_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:933:3: lv_attribute_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getAttributeVariableNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute2004);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:959:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:960:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:961:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2042);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition2052); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:968:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_qualifier_1_0 = null;

        EObject lv_definition_2_1 = null;

        EObject lv_definition_2_2 = null;

        EObject lv_definition_2_3 = null;

        EObject lv_definition_2_4 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:971:28: ( ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:1: ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:1: ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:2: () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:973:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:978:2: ( (lv_qualifier_1_0= ruleVariableQualifier ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:979:1: (lv_qualifier_1_0= ruleVariableQualifier )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:979:1: (lv_qualifier_1_0= ruleVariableQualifier )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:980:3: lv_qualifier_1_0= ruleVariableQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getQualifierVariableQualifierParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition2107);
                    lv_qualifier_1_0=ruleVariableQualifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"qualifier",
                            		lv_qualifier_1_0, 
                            		"VariableQualifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:996:3: ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:997:1: ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:997:1: ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:998:1: (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:998:1: (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:999:3: lv_definition_2_1= ruleVariableDefinitionBuiltIn
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBuiltInParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition2131);
                    lv_definition_2_1=ruleVariableDefinitionBuiltIn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_2_1, 
                            		"VariableDefinitionBuiltIn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1014:8: lv_definition_2_2= ruleVariableDefinitionUserDefined
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionUserDefinedParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition2150);
                    lv_definition_2_2=ruleVariableDefinitionUserDefined();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_2_2, 
                            		"VariableDefinitionUserDefined");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1029:8: lv_definition_2_3= ruleVariableDefinitionCollection
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionCollectionParserRuleCall_2_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition2169);
                    lv_definition_2_3=ruleVariableDefinitionCollection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_2_3, 
                            		"VariableDefinitionCollection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1044:8: lv_definition_2_4= ruleVariableDefinitionBasic
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBasicParserRuleCall_2_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition2188);
                    lv_definition_2_4=ruleVariableDefinitionBasic();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"definition",
                            		lv_definition_2_4, 
                            		"VariableDefinitionBasic");
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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleVariableDefinitionBuiltIn"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1070:1: entryRuleVariableDefinitionBuiltIn returns [EObject current=null] : iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF ;
    public final EObject entryRuleVariableDefinitionBuiltIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBuiltIn = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1071:2: (iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1072:2: iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBuiltInRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn2227);
            iv_ruleVariableDefinitionBuiltIn=ruleVariableDefinitionBuiltIn();

            state._fsp--;

             current =iv_ruleVariableDefinitionBuiltIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn2237); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1079:1: ruleVariableDefinitionBuiltIn returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1082:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:2: () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1084:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBuiltInAccess().getVariableDefinitionBuiltInAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1089:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1090:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1090:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1091:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2292);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1107:2: ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||LA19_1==RULE_ID||LA19_1==18||(LA19_1>=20 && LA19_1<=22)||LA19_1==32||(LA19_1>=34 && LA19_1<=48)||LA19_1==52||LA19_1==55||LA19_1==57||LA19_1==59) ) {
                    alt19=1;
                }
                else if ( (LA19_1==30) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1107:3: ( (lv_name_2_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1107:3: ( (lv_name_2_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1108:1: (lv_name_2_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1108:1: (lv_name_2_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1109:3: lv_name_2_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getNameVariableNameParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2314);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1126:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1126:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1127:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1127:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1128:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getComplexVariableComplexParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn2341);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1144:3: (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1144:5: otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionBuiltIn2355); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionBuiltInAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionBuiltIn2367); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionBuiltInAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1152:1: ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1153:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1153:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1154:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1154:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=20 && LA20_0<=22)||(LA20_0>=35 && LA20_0<=45)) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_ID) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1155:3: lv_constructor_6_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableTypeParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2390);
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1170:8: lv_constructor_6_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableNameParserRuleCall_3_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2409);
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

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinitionBuiltIn2424); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionBuiltInAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1192:1: ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1192:2: ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1192:2: ( (lv_parameters_8_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1193:1: (lv_parameters_8_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1193:1: (lv_parameters_8_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1194:3: lv_parameters_8_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2446);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==15) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionBuiltIn2459); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getVariableDefinitionBuiltInAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1214:1: ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1215:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1215:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1216:3: lv_parameters_10_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2480);
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
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionBuiltIn2496); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1244:1: entryRuleVariableDefinitionUserDefined returns [EObject current=null] : iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF ;
    public final EObject entryRuleVariableDefinitionUserDefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionUserDefined = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1245:2: (iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1246:2: iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined2534);
            iv_ruleVariableDefinitionUserDefined=ruleVariableDefinitionUserDefined();

            state._fsp--;

             current =iv_ruleVariableDefinitionUserDefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined2544); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1253:1: ruleVariableDefinitionUserDefined returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1256:28: ( ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1257:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1257:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1257:2: () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1257:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1258:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionUserDefinedAccess().getVariableDefinitionUserDefinedAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1263:2: ( (lv_type_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1264:1: (lv_type_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1264:1: (lv_type_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1265:3: lv_type_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getTypeVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2599);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1281:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1282:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1282:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1283:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2620);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1299:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1299:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionUserDefined2633); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionUserDefinedAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionUserDefined2645); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionUserDefinedAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1307:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1308:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1308:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1309:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2666);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinitionUserDefined2678); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionUserDefinedAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1329:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1329:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1329:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1330:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1330:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1331:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2700);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1347:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==15) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1347:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionUserDefined2713); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionUserDefinedAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1351:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1352:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1352:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1353:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2734);
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
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionUserDefined2750); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1381:1: entryRuleVariableDefinitionCollection returns [EObject current=null] : iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF ;
    public final EObject entryRuleVariableDefinitionCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionCollection = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1382:2: (iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1383:2: iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionCollectionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection2788);
            iv_ruleVariableDefinitionCollection=ruleVariableDefinitionCollection();

            state._fsp--;

             current =iv_ruleVariableDefinitionCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionCollection2798); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1390:1: ruleVariableDefinitionCollection returns [EObject current=null] : ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1393:28: ( ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1394:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1394:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1394:2: () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1394:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionCollectionAccess().getVariableDefinitionCollectionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1400:2: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1400:3: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1400:3: ( (lv_collection_1_0= ruleCollectionID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1401:1: (lv_collection_1_0= ruleCollectionID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1401:1: (lv_collection_1_0= ruleCollectionID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1402:3: lv_collection_1_0= ruleCollectionID
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection2854);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleVariableDefinitionCollection2866); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionCollectionAccess().getLessThanSignKeyword_1_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1422:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1423:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1423:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1424:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1424:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=20 && LA27_0<=22)||(LA27_0>=35 && LA27_0<=45)) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1425:3: lv_type_3_1= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableTypeParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection2889);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1440:8: lv_type_3_2= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableNameParserRuleCall_1_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2908);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleVariableDefinitionCollection2923); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionCollectionAccess().getGreaterThanSignKeyword_1_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1462:1: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1463:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1463:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1464:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getNameVariableNameParserRuleCall_1_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2944);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1480:3: (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1480:5: otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionCollection2958); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionCollectionAccess().getEqualsSignKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:1: ( (lv_value_7_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1485:1: (lv_value_7_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1485:1: (lv_value_7_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1486:3: lv_value_7_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getValueListParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleVariableDefinitionCollection2979);
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

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionCollection2991); 

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


    // $ANTLR start "entryRuleVariableDefinitionBasic"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1514:1: entryRuleVariableDefinitionBasic returns [EObject current=null] : iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF ;
    public final EObject entryRuleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBasic = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1515:2: (iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1516:2: iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBasicRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic3029);
            iv_ruleVariableDefinitionBasic=ruleVariableDefinitionBasic();

            state._fsp--;

             current =iv_ruleVariableDefinitionBasic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBasic3039); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1523:1: ruleVariableDefinitionBasic returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1526:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1527:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1527:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1527:2: () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1527:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1528:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBasicAccess().getVariableDefinitionBasicAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1533:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1534:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1534:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1535:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic3094);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1551:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1552:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1552:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1553:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic3115);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionBasic3127); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionBasicAccess().getEqualsSignKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1573:1: ( (lv_expression_4_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1574:1: (lv_expression_4_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1574:1: (lv_expression_4_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1575:3: lv_expression_4_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getExpressionVariableExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic3148);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1599:1: entryRuleParameterAssignment returns [EObject current=null] : iv_ruleParameterAssignment= ruleParameterAssignment EOF ;
    public final EObject entryRuleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1600:2: (iv_ruleParameterAssignment= ruleParameterAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1601:2: iv_ruleParameterAssignment= ruleParameterAssignment EOF
            {
             newCompositeNode(grammarAccess.getParameterAssignmentRule()); 
            pushFollow(FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment3184);
            iv_ruleParameterAssignment=ruleParameterAssignment();

            state._fsp--;

             current =iv_ruleParameterAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterAssignment3194); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1608:1: ruleParameterAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) ;
    public final EObject ruleParameterAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1611:28: ( ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1612:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1612:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1612:2: ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1612:2: ( (lv_name_0_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1613:1: (lv_name_0_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1613:1: (lv_name_0_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1614:3: lv_name_0_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getNameVariableNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleParameterAssignment3240);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleParameterAssignment3252); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1634:1: ( (lv_value_2_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1635:1: (lv_value_2_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1635:1: (lv_value_2_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1636:3: lv_value_2_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment3273);
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


    // $ANTLR start "entryRuleVariableQualifier"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1660:1: entryRuleVariableQualifier returns [String current=null] : iv_ruleVariableQualifier= ruleVariableQualifier EOF ;
    public final String entryRuleVariableQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableQualifier = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1661:2: (iv_ruleVariableQualifier= ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1662:2: iv_ruleVariableQualifier= ruleVariableQualifier EOF
            {
             newCompositeNode(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier3310);
            iv_ruleVariableQualifier=ruleVariableQualifier();

            state._fsp--;

             current =iv_ruleVariableQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier3321); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1669:1: ruleVariableQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'observable' ;
    public final AntlrDatatypeRuleToken ruleVariableQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1672:28: (kw= 'observable' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1674:2: kw= 'observable'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleVariableQualifier3358); 

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


    // $ANTLR start "entryRuleVariableType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1687:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1688:2: (iv_ruleVariableType= ruleVariableType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1689:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType3398);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType3409); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1696:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1699:28: ( (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1700:1: (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1700:1: (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' )
            int alt29=14;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt29=1;
                }
                break;
            case 21:
                {
                alt29=2;
                }
                break;
            case 36:
                {
                alt29=3;
                }
                break;
            case 37:
                {
                alt29=4;
                }
                break;
            case 38:
                {
                alt29=5;
                }
                break;
            case 39:
                {
                alt29=6;
                }
                break;
            case 40:
                {
                alt29=7;
                }
                break;
            case 41:
                {
                alt29=8;
                }
                break;
            case 42:
                {
                alt29=9;
                }
                break;
            case 43:
                {
                alt29=10;
                }
                break;
            case 20:
                {
                alt29=11;
                }
                break;
            case 22:
                {
                alt29=12;
                }
                break;
            case 44:
                {
                alt29=13;
                }
                break;
            case 45:
                {
                alt29=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1701:2: kw= 'MOLECULE'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVariableType3447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getMOLECULEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1708:2: kw= 'CELL'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleVariableType3466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCELLKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1715:2: kw= 'RIBOSOME'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVariableType3485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRIBOSOMEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1722:2: kw= 'PROMOTER'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVariableType3504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROMOTERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1729:2: kw= 'PROTEIN'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVariableType3523); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROTEINKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1736:2: kw= 'DNA'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVariableType3542); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getDNAKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1743:2: kw= 'RNA'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVariableType3561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRNAKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1750:2: kw= 'GENE'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVariableType3580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getGENEKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1757:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVariableType3599); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTEGERKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1764:2: kw= 'RATE'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVariableType3618); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRATEKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1771:2: kw= 'PROCESS'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleVariableType3637); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROCESSKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1778:2: kw= 'SYSTEM'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleVariableType3656); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getSYSTEMKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1785:2: kw= 'CHASSIS'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVariableType3675); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCHASSISKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1792:2: kw= 'COMPLEX'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVariableType3694); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCOMPLEXKeyword_13()); 
                        

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


    // $ANTLR start "entryRuleCollectionID"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1805:1: entryRuleCollectionID returns [String current=null] : iv_ruleCollectionID= ruleCollectionID EOF ;
    public final String entryRuleCollectionID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionID = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1806:2: (iv_ruleCollectionID= ruleCollectionID EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1807:2: iv_ruleCollectionID= ruleCollectionID EOF
            {
             newCompositeNode(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID3735);
            iv_ruleCollectionID=ruleCollectionID();

            state._fsp--;

             current =iv_ruleCollectionID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID3746); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1814:1: ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1817:28: ( (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1818:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1818:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt30=1;
                }
                break;
            case 47:
                {
                alt30=2;
                }
                break;
            case 48:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1819:2: kw= 'LIST'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleCollectionID3784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1826:2: kw= 'SET'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleCollectionID3803); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1833:2: kw= 'HASH'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleCollectionID3822); 

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


    // $ANTLR start "entryRuleVariableAssignment"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1846:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1847:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1848:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment3862);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment3872); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1855:1: ruleVariableAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1858:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1859:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1859:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1859:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1859:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1860:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1865:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1866:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1866:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1867:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment3927);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleVariableAssignment3939); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1887:1: ( (lv_expression_3_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1888:1: (lv_expression_3_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1888:1: (lv_expression_3_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1889:3: lv_expression_3_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableAssignment3960);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1913:1: entryRuleVariableAssignmentObject returns [EObject current=null] : iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF ;
    public final EObject entryRuleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignmentObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1914:2: (iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1915:2: iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentObjectRule()); 
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject3996);
            iv_ruleVariableAssignmentObject=ruleVariableAssignmentObject();

            state._fsp--;

             current =iv_ruleVariableAssignmentObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentObject4006); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1922:1: ruleVariableAssignmentObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) ;
    public final EObject ruleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1925:28: ( ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( ((LA31_1>=30 && LA31_1<=31)) ) {
                    alt31=2;
                }
                else if ( (LA31_1==EOF||LA31_1==32) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1927:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariableAssignmentObjectAccess().getVariableAssignmentObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject4057);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1942:5: this_VariableAttribute_2= ruleVariableAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject4085);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1958:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1959:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1960:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression4120);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression4130); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1967:1: ruleVariableExpression returns [EObject current=null] : ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1970:28: ( ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1971:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1971:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1971:2: () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1971:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1972:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1977:2: ( (lv_members_1_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1978:1: (lv_members_1_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1978:1: (lv_members_1_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1979:3: lv_members_1_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4185);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1995:2: ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=49 && LA32_0<=51)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1996:5: ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression4202);
            	    ruleVariableExpressionOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2003:1: ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2004:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2004:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2005:3: lv_members_3_0= ruleVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4222);
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
            	    break loop32;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2029:1: entryRuleVariableExpressionObject returns [EObject current=null] : iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF ;
    public final EObject entryRuleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2030:2: (iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2031:2: iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject4260);
            iv_ruleVariableExpressionObject=ruleVariableExpressionObject();

            state._fsp--;

             current =iv_ruleVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionObject4270); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2038:1: ruleVariableExpressionObject returns [EObject current=null] : (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) ;
    public final EObject ruleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicVariableExpressionObject_0 = null;

        EObject this_CompoundVariableExpressionObject_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2041:28: ( (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2042:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2042:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_INT)||(LA33_0>=49 && LA33_0<=50)) ) {
                alt33=1;
            }
            else if ( (LA33_0==60) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2043:5: this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getAtomicVariableExpressionObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject4317);
                    this_AtomicVariableExpressionObject_0=ruleAtomicVariableExpressionObject();

                    state._fsp--;

                     
                            current = this_AtomicVariableExpressionObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2053:5: this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getCompoundVariableExpressionObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject4344);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2069:1: entryRuleAtomicVariableExpressionObject returns [EObject current=null] : iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF ;
    public final EObject entryRuleAtomicVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2070:2: (iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2071:2: iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject4379);
            iv_ruleAtomicVariableExpressionObject=ruleAtomicVariableExpressionObject();

            state._fsp--;

             current =iv_ruleAtomicVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject4389); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2078:1: ruleAtomicVariableExpressionObject returns [EObject current=null] : ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2081:28: ( ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            int alt34=6;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:3: () ( (lv_variable_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2083:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicVariableExpressionObjectAccess().getAtomicVariableExpressionObjectAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2088:2: ( (lv_variable_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2089:1: (lv_variable_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2089:1: (lv_variable_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2090:3: lv_variable_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getVariableVariableNameParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject4445);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2107:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2107:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2108:1: (lv_attribute_2_0= ruleVariableAttribute )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2108:1: (lv_attribute_2_0= ruleVariableAttribute )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2109:3: lv_attribute_2_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getAttributeVariableAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject4473);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2126:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2126:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2127:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2127:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2128:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getComplexVariableComplexParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject4500);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2145:6: ( (lv_value_4_0= ruleREAL ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2145:6: ( (lv_value_4_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2146:1: (lv_value_4_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2146:1: (lv_value_4_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2147:3: lv_value_4_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getValueREALParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject4527);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2164:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2164:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2165:1: (lv_quantity_5_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2165:1: (lv_quantity_5_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2166:3: lv_quantity_5_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getQuantityQuantityParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject4554);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2183:6: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2183:6: ( (lv_string_6_0= RULE_STRING ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2184:1: (lv_string_6_0= RULE_STRING )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2184:1: (lv_string_6_0= RULE_STRING )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2185:3: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject4577); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2209:1: entryRuleCompoundVariableExpressionObject returns [EObject current=null] : iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF ;
    public final EObject entryRuleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2210:2: (iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2211:2: iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject4618);
            iv_ruleCompoundVariableExpressionObject=ruleCompoundVariableExpressionObject();

            state._fsp--;

             current =iv_ruleCompoundVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject4628); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2218:1: ruleCompoundVariableExpressionObject returns [EObject current=null] : ( () ( (lv_list_1_0= ruleList ) ) ) ;
    public final EObject ruleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2221:28: ( ( () ( (lv_list_1_0= ruleList ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2222:1: ( () ( (lv_list_1_0= ruleList ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2222:1: ( () ( (lv_list_1_0= ruleList ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2222:2: () ( (lv_list_1_0= ruleList ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2222:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2223:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompoundVariableExpressionObjectAccess().getCompoundVariableExpressionObjectAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2228:2: ( (lv_list_1_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2229:1: (lv_list_1_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2229:1: (lv_list_1_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2230:3: lv_list_1_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectAccess().getListListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject4683);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2254:1: entryRuleVariableExpressionOperator returns [String current=null] : iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF ;
    public final String entryRuleVariableExpressionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableExpressionOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2255:2: (iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2256:2: iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator4720);
            iv_ruleVariableExpressionOperator=ruleVariableExpressionOperator();

            state._fsp--;

             current =iv_ruleVariableExpressionOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator4731); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2263:1: ruleVariableExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleVariableExpressionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2266:28: ( (kw= '+' | kw= '-' | kw= '|' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2267:1: (kw= '+' | kw= '-' | kw= '|' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2267:1: (kw= '+' | kw= '-' | kw= '|' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt35=1;
                }
                break;
            case 50:
                {
                alt35=2;
                }
                break;
            case 51:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2268:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVariableExpressionOperator4769); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2275:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVariableExpressionOperator4788); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2282:2: kw= '|'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVariableExpressionOperator4807); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2295:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2296:2: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2297:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition4847);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition4857); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2304:1: ruleRuleDefinition returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2307:28: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:2: () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2309:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleRuleDefinition4903); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2318:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2319:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2319:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2320:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRuleDefinition4924);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleRuleDefinition4936); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2340:1: ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2340:2: ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2340:2: ( (lv_lhs_4_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2341:1: (lv_lhs_4_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2341:1: (lv_lhs_4_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2342:3: lv_lhs_4_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition4958);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2358:2: (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==49) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2358:4: otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleRuleDefinition4971); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2362:1: ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2363:1: (lv_lhs_6_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2363:1: (lv_lhs_6_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2364:3: lv_lhs_6_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition4992);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2380:6: (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            else if ( (LA38_0==54) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2380:8: otherlv_7= '->'
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleRuleDefinition5009); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2385:6: ( (lv_reversible_8_0= '<->' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2385:6: ( (lv_reversible_8_0= '<->' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2386:1: (lv_reversible_8_0= '<->' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2386:1: (lv_reversible_8_0= '<->' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2387:3: lv_reversible_8_0= '<->'
                    {
                    lv_reversible_8_0=(Token)match(input,54,FOLLOW_54_in_ruleRuleDefinition5033); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2400:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2400:4: ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2400:4: ( (lv_rhs_9_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2401:1: (lv_rhs_9_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2401:1: (lv_rhs_9_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2402:3: lv_rhs_9_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition5069);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2418:2: (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==49) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2418:4: otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleRuleDefinition5082); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2422:1: ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2423:1: (lv_rhs_11_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2423:1: (lv_rhs_11_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2424:3: lv_rhs_11_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition5103);
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
                    	    break loop39;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2448:1: entryRuleRuleObject returns [EObject current=null] : iv_ruleRuleObject= ruleRuleObject EOF ;
    public final EObject entryRuleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2449:2: (iv_ruleRuleObject= ruleRuleObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2450:2: iv_ruleRuleObject= ruleRuleObject EOF
            {
             newCompositeNode(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject5143);
            iv_ruleRuleObject=ruleRuleObject();

            state._fsp--;

             current =iv_ruleRuleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject5153); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2457:1: ruleRuleObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) ;
    public final EObject ruleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableComplex_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2460:28: ( ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2461:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2461:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||LA41_1==RULE_ID||LA41_1==18||(LA41_1>=20 && LA41_1<=22)||(LA41_1>=34 && LA41_1<=49)||(LA41_1>=52 && LA41_1<=55)||LA41_1==57||LA41_1==59) ) {
                    alt41=1;
                }
                else if ( (LA41_1==30) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2461:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2461:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2461:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2461:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2462:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getRuleObjectAccess().getRuleObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleRuleObject5204);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2477:5: this_VariableComplex_2= ruleVariableComplex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableComplexParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleRuleObject5232);
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


    // $ANTLR start "entryRuleDeviceDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2493:1: entryRuleDeviceDefinition returns [EObject current=null] : iv_ruleDeviceDefinition= ruleDeviceDefinition EOF ;
    public final EObject entryRuleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2494:2: (iv_ruleDeviceDefinition= ruleDeviceDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2495:2: iv_ruleDeviceDefinition= ruleDeviceDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeviceDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition5267);
            iv_ruleDeviceDefinition=ruleDeviceDefinition();

            state._fsp--;

             current =iv_ruleDeviceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDefinition5277); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2502:1: ruleDeviceDefinition returns [EObject current=null] : ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' ) ;
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
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parts_9_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_members_17_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2505:28: ( ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2506:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2506:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2506:2: () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2506:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2507:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleDeviceDefinition5323); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2516:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2517:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2517:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2518:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeviceDefinition5344);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition5356); 

                	newLeafNode(otherlv_3, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition5368); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceDefinitionAccess().getNewKeyword_4());
                
            otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleDeviceDefinition5380); 

                	newLeafNode(otherlv_5, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_5());
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDeviceDefinition5392); 

                	newLeafNode(otherlv_6, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleDeviceDefinition5404); 

                	newLeafNode(otherlv_7, grammarAccess.getDeviceDefinitionAccess().getPartsKeyword_7());
                
            otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition5416); 

                	newLeafNode(otherlv_8, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2558:1: ( (lv_parts_9_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2559:1: (lv_parts_9_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2559:1: (lv_parts_9_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2560:3: lv_parts_9_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getPartsListParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition5437);
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

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDeviceDefinition5449); 

                	newLeafNode(otherlv_10, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleDeviceDefinition5461); 

                	newLeafNode(otherlv_11, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_11());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2584:1: ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2584:2: ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2584:2: ( (lv_parameters_12_0= ruleParameterAssignment ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2585:1: (lv_parameters_12_0= ruleParameterAssignment )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2585:1: (lv_parameters_12_0= ruleParameterAssignment )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2586:3: lv_parameters_12_0= ruleParameterAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getParametersParameterAssignmentParserRuleCall_12_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5483);
                    lv_parameters_12_0=ruleParameterAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_12_0, 
                            		"ParameterAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2602:2: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2602:4: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleDeviceDefinition5496); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_12_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2606:1: ( (lv_parameters_14_0= ruleParameterAssignment ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2607:1: (lv_parameters_14_0= ruleParameterAssignment )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2607:1: (lv_parameters_14_0= ruleParameterAssignment )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2608:3: lv_parameters_14_0= ruleParameterAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getParametersParameterAssignmentParserRuleCall_12_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5517);
                    	    lv_parameters_14_0=ruleParameterAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_14_0, 
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

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleDeviceDefinition5533); 

                	newLeafNode(otherlv_15, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_13());
                
            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition5545); 

                	newLeafNode(otherlv_16, grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_14());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2632:1: ( (lv_members_17_0= ruleDeviceMembers ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||(LA44_0>=20 && LA44_0<=22)||(LA44_0>=34 && LA44_0<=48)||LA44_0==57||LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2633:1: (lv_members_17_0= ruleDeviceMembers )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2633:1: (lv_members_17_0= ruleDeviceMembers )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2634:3: lv_members_17_0= ruleDeviceMembers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getMembersDeviceMembersParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition5566);
            	    lv_members_17_0=ruleDeviceMembers();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_17_0, 
            	            		"DeviceMembers");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition5579); 

                	newLeafNode(otherlv_18, grammarAccess.getDeviceDefinitionAccess().getRightCurlyBracketKeyword_16());
                

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2662:1: entryRuleDeviceMembers returns [EObject current=null] : iv_ruleDeviceMembers= ruleDeviceMembers EOF ;
    public final EObject entryRuleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceMembers = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2663:2: (iv_ruleDeviceMembers= ruleDeviceMembers EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2664:2: iv_ruleDeviceMembers= ruleDeviceMembers EOF
            {
             newCompositeNode(grammarAccess.getDeviceMembersRule()); 
            pushFollow(FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5615);
            iv_ruleDeviceMembers=ruleDeviceMembers();

            state._fsp--;

             current =iv_ruleDeviceMembers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceMembers5625); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2671:1: ruleDeviceMembers returns [EObject current=null] : (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition ) ;
    public final EObject ruleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;

        EObject this_PropertyDefinition_1 = null;

        EObject this_ATGCDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2674:28: ( (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2675:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2675:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 20:
            case 21:
            case 22:
            case 34:
            case 35:
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
            case 47:
            case 48:
                {
                alt45=1;
                }
                break;
            case 59:
                {
                alt45=2;
                }
                break;
            case 57:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2676:5: this_VariableDefinition_0= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5672);
                    this_VariableDefinition_0=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2686:5: this_PropertyDefinition_1= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getPropertyDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5699);
                    this_PropertyDefinition_1=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2696:5: this_ATGCDefinition_2= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getATGCDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5726);
                    this_ATGCDefinition_2=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_2; 
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


    // $ANTLR start "entryRuleATGCDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2712:1: entryRuleATGCDefinition returns [EObject current=null] : iv_ruleATGCDefinition= ruleATGCDefinition EOF ;
    public final EObject entryRuleATGCDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATGCDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2713:2: (iv_ruleATGCDefinition= ruleATGCDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2714:2: iv_ruleATGCDefinition= ruleATGCDefinition EOF
            {
             newCompositeNode(grammarAccess.getATGCDefinitionRule()); 
            pushFollow(FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition5761);
            iv_ruleATGCDefinition=ruleATGCDefinition();

            state._fsp--;

             current =iv_ruleATGCDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCDefinition5771); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2721:1: ruleATGCDefinition returns [EObject current=null] : ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2724:28: ( ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2725:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2725:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2725:2: () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2725:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2726:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleATGCDefinition5817); 

                	newLeafNode(otherlv_1, grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2735:1: ( (lv_command_2_0= ruleATGCCommand ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2736:1: (lv_command_2_0= ruleATGCCommand )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2736:1: (lv_command_2_0= ruleATGCCommand )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2737:3: lv_command_2_0= ruleATGCCommand
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getCommandATGCCommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATGCCommand_in_ruleATGCDefinition5838);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleATGCDefinition5850); 

                	newLeafNode(otherlv_3, grammarAccess.getATGCDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2757:1: ( (lv_arguments_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2758:1: (lv_arguments_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2758:1: (lv_arguments_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2759:3: lv_arguments_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition5871);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2775:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==15) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2775:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleATGCDefinition5884); 

            	        	newLeafNode(otherlv_5, grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2779:1: ( (lv_arguments_6_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2780:1: (lv_arguments_6_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2780:1: (lv_arguments_6_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2781:3: lv_arguments_6_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition5905);
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
            	    break loop46;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2805:1: entryRuleATGCCommand returns [String current=null] : iv_ruleATGCCommand= ruleATGCCommand EOF ;
    public final String entryRuleATGCCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATGCCommand = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2806:2: (iv_ruleATGCCommand= ruleATGCCommand EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2807:2: iv_ruleATGCCommand= ruleATGCCommand EOF
            {
             newCompositeNode(grammarAccess.getATGCCommandRule()); 
            pushFollow(FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand5944);
            iv_ruleATGCCommand=ruleATGCCommand();

            state._fsp--;

             current =iv_ruleATGCCommand.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCCommand5955); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2814:1: ruleATGCCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ARRANGE' ;
    public final AntlrDatatypeRuleToken ruleATGCCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2817:28: (kw= 'ARRANGE' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2819:2: kw= 'ARRANGE'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleATGCCommand5992); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2832:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2833:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2834:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition6031);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition6041); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2841:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        EObject lv_property_3_0 = null;

        EObject lv_property_5_0 = null;

        EObject lv_condition_7_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;

        EObject lv_time_13_0 = null;

        AntlrDatatypeRuleToken lv_operator_15_0 = null;

        EObject lv_concentration_16_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2844:28: ( ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2845:1: ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2845:1: ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2845:2: () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2845:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2846:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_rulePropertyDefinition6087); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getVERIFYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2855:1: ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==62) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2855:2: (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2855:2: (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2855:4: otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) )
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_rulePropertyDefinition6101); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyDefinitionAccess().getLeftSquareBracketKeyword_2_0_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2859:1: ( (lv_property_3_0= ruleProperty ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2860:1: (lv_property_3_0= ruleProperty )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2860:1: (lv_property_3_0= ruleProperty )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2861:3: lv_property_3_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyPropertyParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_rulePropertyDefinition6122);
                    lv_property_3_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"property",
                            		lv_property_3_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2877:2: ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==51||(LA47_0>=93 && LA47_0<=95)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2878:5: ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getBooleanOperatorParserRuleCall_2_0_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleBooleanOperator_in_rulePropertyDefinition6139);
                    	    ruleBooleanOperator();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2885:1: ( (lv_property_5_0= ruleProperty ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2886:1: (lv_property_5_0= ruleProperty )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2886:1: (lv_property_5_0= ruleProperty )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2887:3: lv_property_5_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyPropertyParserRuleCall_2_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_rulePropertyDefinition6159);
                    	    lv_property_5_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"property",
                    	            		lv_property_5_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,61,FOLLOW_61_in_rulePropertyDefinition6173); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getRightSquareBracketKeyword_2_0_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2907:1: ( (lv_condition_7_0= rulePropertyCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2908:1: (lv_condition_7_0= rulePropertyCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2908:1: (lv_condition_7_0= rulePropertyCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2909:3: lv_condition_7_0= rulePropertyCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getConditionPropertyConditionParserRuleCall_2_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyCondition_in_rulePropertyDefinition6194);
                    lv_condition_7_0=rulePropertyCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_7_0, 
                            		"PropertyCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2926:6: (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2926:6: (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2926:8: otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_62_in_rulePropertyDefinition6214); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyDefinitionAccess().getEXPECTEDKeyword_2_1_0());
                        
                    otherlv_9=(Token)match(input,60,FOLLOW_60_in_rulePropertyDefinition6226); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getLeftSquareBracketKeyword_2_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2934:1: ( (lv_name_10_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2935:1: (lv_name_10_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2935:1: (lv_name_10_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2936:3: lv_name_10_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameVariableNameParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_rulePropertyDefinition6247);
                    lv_name_10_0=ruleVariableName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_10_0, 
                            		"VariableName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,61,FOLLOW_61_in_rulePropertyDefinition6259); 

                        	newLeafNode(otherlv_11, grammarAccess.getPropertyDefinitionAccess().getRightSquareBracketKeyword_2_1_3());
                        
                    otherlv_12=(Token)match(input,63,FOLLOW_63_in_rulePropertyDefinition6271); 

                        	newLeafNode(otherlv_12, grammarAccess.getPropertyDefinitionAccess().getATTIMEINSTANTKeyword_2_1_4());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2960:1: ( (lv_time_13_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2961:1: (lv_time_13_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2961:1: (lv_time_13_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2962:3: lv_time_13_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTimeQuantityParserRuleCall_2_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_rulePropertyDefinition6292);
                    lv_time_13_0=ruleQuantity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"time",
                            		lv_time_13_0, 
                            		"Quantity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,64,FOLLOW_64_in_rulePropertyDefinition6304); 

                        	newLeafNode(otherlv_14, grammarAccess.getPropertyDefinitionAccess().getISKeyword_2_1_6());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2982:1: ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=24 && LA48_0<=25)||(LA48_0>=89 && LA48_0<=92)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==65) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2982:2: ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2982:2: ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2982:3: ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2982:3: ( (lv_operator_15_0= ruleRelationalOperator ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2983:1: (lv_operator_15_0= ruleRelationalOperator )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2983:1: (lv_operator_15_0= ruleRelationalOperator )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2984:3: lv_operator_15_0= ruleRelationalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getOperatorRelationalOperatorParserRuleCall_2_1_7_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelationalOperator_in_rulePropertyDefinition6327);
                            lv_operator_15_0=ruleRelationalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"operator",
                                    		lv_operator_15_0, 
                                    		"RelationalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3000:2: ( (lv_concentration_16_0= ruleQuantity ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3001:1: (lv_concentration_16_0= ruleQuantity )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3001:1: (lv_concentration_16_0= ruleQuantity )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3002:3: lv_concentration_16_0= ruleQuantity
                            {
                             
                            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getConcentrationQuantityParserRuleCall_2_1_7_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQuantity_in_rulePropertyDefinition6348);
                            lv_concentration_16_0=ruleQuantity();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"concentration",
                                    		lv_concentration_16_0, 
                                    		"Quantity");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3019:7: otherlv_17= '?'
                            {
                            otherlv_17=(Token)match(input,65,FOLLOW_65_in_rulePropertyDefinition6367); 

                                	newLeafNode(otherlv_17, grammarAccess.getPropertyDefinitionAccess().getQuestionMarkKeyword_2_1_7_1());
                                

                            }
                            break;

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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleProperty"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3031:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3032:2: (iv_ruleProperty= ruleProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3033:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty6406);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty6416); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3040:1: ruleProperty returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_lhs_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3043:28: ( ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3044:1: ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3044:1: ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3044:2: () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3044:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3045:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3050:2: ( (lv_lhs_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3051:1: (lv_lhs_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3051:1: (lv_lhs_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3052:3: lv_lhs_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getLhsVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleProperty6471);
            lv_lhs_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3068:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3069:1: (lv_operator_2_0= ruleRelationalOperator )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3069:1: (lv_operator_2_0= ruleRelationalOperator )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3070:3: lv_operator_2_0= ruleRelationalOperator
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getOperatorRelationalOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleProperty6492);
            lv_operator_2_0=ruleRelationalOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"RelationalOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3086:2: ( (lv_rhs_3_0= ruleQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3087:1: (lv_rhs_3_0= ruleQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3087:1: (lv_rhs_3_0= ruleQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3088:3: lv_rhs_3_0= ruleQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getRhsQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantity_in_ruleProperty6513);
            lv_rhs_3_0=ruleQuantity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"Quantity");
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyCondition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3112:1: entryRulePropertyCondition returns [EObject current=null] : iv_rulePropertyCondition= rulePropertyCondition EOF ;
    public final EObject entryRulePropertyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3113:2: (iv_rulePropertyCondition= rulePropertyCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3114:2: iv_rulePropertyCondition= rulePropertyCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyConditionRule()); 
            pushFollow(FOLLOW_rulePropertyCondition_in_entryRulePropertyCondition6549);
            iv_rulePropertyCondition=rulePropertyCondition();

            state._fsp--;

             current =iv_rulePropertyCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCondition6559); 

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
    // $ANTLR end "entryRulePropertyCondition"


    // $ANTLR start "rulePropertyCondition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3121:1: rulePropertyCondition returns [EObject current=null] : ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? ) ;
    public final EObject rulePropertyCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_lowerBound_8_0 = null;

        EObject lv_upperBounds_10_0 = null;

        AntlrDatatypeRuleToken lv_operator_13_0 = null;

        AntlrDatatypeRuleToken lv_probability_14_0 = null;

        EObject lv_initialConditions_17_0 = null;

        EObject lv_initialConditions_19_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3124:28: ( ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3125:1: ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3125:1: ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3125:2: () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3125:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3126:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyConditionAccess().getPropertyConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3131:2: (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt50=1;
                }
                break;
            case 67:
                {
                alt50=2;
                }
                break;
            case 68:
                {
                alt50=3;
                }
                break;
            case 69:
                {
                alt50=4;
                }
                break;
            case 70:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3131:4: otherlv_1= 'WILL HOLD'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_rulePropertyCondition6606); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyConditionAccess().getWILLHOLDKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3136:7: otherlv_2= 'NEVER HOLDS'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_rulePropertyCondition6624); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyConditionAccess().getNEVERHOLDSKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3141:7: otherlv_3= 'ALWAYS HOLDS'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_68_in_rulePropertyCondition6642); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyConditionAccess().getALWAYSHOLDSKeyword_1_2());
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3146:7: otherlv_4= 'EVENTUALLY HOLDS'
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_69_in_rulePropertyCondition6660); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyConditionAccess().getEVENTUALLYHOLDSKeyword_1_3());
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3151:7: otherlv_5= 'SOMETIMES HOLDS'
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_70_in_rulePropertyCondition6678); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertyConditionAccess().getSOMETIMESHOLDSKeyword_1_4());
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3155:2: (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==71) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3155:4: otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )?
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_rulePropertyCondition6692); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyConditionAccess().getWITHINTIMEBOUNDKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,60,FOLLOW_60_in_rulePropertyCondition6704); 

                        	newLeafNode(otherlv_7, grammarAccess.getPropertyConditionAccess().getLeftSquareBracketKeyword_2_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3163:1: ( (lv_lowerBound_8_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3164:1: (lv_lowerBound_8_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3164:1: (lv_lowerBound_8_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3165:3: lv_lowerBound_8_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getLowerBoundQuantityParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_rulePropertyCondition6725);
                    lv_lowerBound_8_0=ruleQuantity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_8_0, 
                            		"Quantity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_rulePropertyCondition6737); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyConditionAccess().getCommaKeyword_2_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3185:1: ( (lv_upperBounds_10_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3186:1: (lv_upperBounds_10_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3186:1: (lv_upperBounds_10_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3187:3: lv_upperBounds_10_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getUpperBoundsQuantityParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_rulePropertyCondition6758);
                    lv_upperBounds_10_0=ruleQuantity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBounds",
                            		lv_upperBounds_10_0, 
                            		"Quantity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,61,FOLLOW_61_in_rulePropertyCondition6770); 

                        	newLeafNode(otherlv_11, grammarAccess.getPropertyConditionAccess().getRightSquareBracketKeyword_2_5());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3207:1: (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==72) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3207:3: otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' )
                            {
                            otherlv_12=(Token)match(input,72,FOLLOW_72_in_rulePropertyCondition6783); 

                                	newLeafNode(otherlv_12, grammarAccess.getPropertyConditionAccess().getWITHPROBABILITYBOUNDKeyword_2_6_0());
                                
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3211:1: ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' )
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( ((LA51_0>=24 && LA51_0<=25)||(LA51_0>=89 && LA51_0<=92)) ) {
                                alt51=1;
                            }
                            else if ( (LA51_0==65) ) {
                                alt51=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 0, input);

                                throw nvae;
                            }
                            switch (alt51) {
                                case 1 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3211:2: ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3211:2: ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3211:3: ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3211:3: ( (lv_operator_13_0= ruleRelationalOperator ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3212:1: (lv_operator_13_0= ruleRelationalOperator )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3212:1: (lv_operator_13_0= ruleRelationalOperator )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3213:3: lv_operator_13_0= ruleRelationalOperator
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getOperatorRelationalOperatorParserRuleCall_2_6_1_0_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleRelationalOperator_in_rulePropertyCondition6806);
                                    lv_operator_13_0=ruleRelationalOperator();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"operator",
                                            		lv_operator_13_0, 
                                            		"RelationalOperator");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3229:2: ( (lv_probability_14_0= ruleREAL ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3230:1: (lv_probability_14_0= ruleREAL )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3230:1: (lv_probability_14_0= ruleREAL )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3231:3: lv_probability_14_0= ruleREAL
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getProbabilityREALParserRuleCall_2_6_1_0_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleREAL_in_rulePropertyCondition6827);
                                    lv_probability_14_0=ruleREAL();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"probability",
                                            		lv_probability_14_0, 
                                            		"REAL");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3248:7: otherlv_15= '?'
                                    {
                                    otherlv_15=(Token)match(input,65,FOLLOW_65_in_rulePropertyCondition6846); 

                                        	newLeafNode(otherlv_15, grammarAccess.getPropertyConditionAccess().getQuestionMarkKeyword_2_6_1_1());
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3252:6: (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==73) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3252:8: otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_16=(Token)match(input,73,FOLLOW_73_in_rulePropertyCondition6864); 

                        	newLeafNode(otherlv_16, grammarAccess.getPropertyConditionAccess().getGIVENKeyword_3_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3256:1: ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3257:1: (lv_initialConditions_17_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3257:1: (lv_initialConditions_17_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3258:3: lv_initialConditions_17_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6885);
                    lv_initialConditions_17_0=rulePropertyInitialCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                    	        }
                           		add(
                           			current, 
                           			"initialConditions",
                            		lv_initialConditions_17_0, 
                            		"PropertyInitialCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3274:2: (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3274:4: otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_15_in_rulePropertyCondition6898); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getPropertyConditionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3278:1: ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3279:1: (lv_initialConditions_19_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3279:1: (lv_initialConditions_19_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3280:3: lv_initialConditions_19_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6919);
                    	    lv_initialConditions_19_0=rulePropertyInitialCondition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initialConditions",
                    	            		lv_initialConditions_19_0, 
                    	            		"PropertyInitialCondition");
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
    // $ANTLR end "rulePropertyCondition"


    // $ANTLR start "entryRulePropertyInitialCondition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3304:1: entryRulePropertyInitialCondition returns [EObject current=null] : iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF ;
    public final EObject entryRulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInitialCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3305:2: (iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3306:2: iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyInitialConditionRule()); 
            pushFollow(FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition6959);
            iv_rulePropertyInitialCondition=rulePropertyInitialCondition();

            state._fsp--;

             current =iv_rulePropertyInitialCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInitialCondition6969); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3313:1: rulePropertyInitialCondition returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) ) ;
    public final EObject rulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3316:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3317:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3317:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3317:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3317:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3318:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyInitialConditionAccess().getPropertyInitialConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3323:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3324:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3324:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3325:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition7024);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulePropertyInitialCondition7036); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyInitialConditionAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3345:1: ( (lv_value_3_0= ruleQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3346:1: (lv_value_3_0= ruleQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3346:1: (lv_value_3_0= ruleQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3347:3: lv_value_3_0= ruleQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getValueQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantity_in_rulePropertyInitialCondition7057);
            lv_value_3_0=ruleQuantity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyInitialConditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Quantity");
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3371:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3372:2: (iv_ruleREAL= ruleREAL EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3373:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL7094);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL7105); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3380:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decimal_0 = null;

        AntlrDatatypeRuleToken this_DecimalExp_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3383:28: ( (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3384:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3384:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            int alt56=2;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        int LA56_4 = input.LA(4);

                        if ( (LA56_4==RULE_INT) ) {
                            int LA56_7 = input.LA(5);

                            if ( (LA56_7==EOF||LA56_7==RULE_ID||(LA56_7>=15 && LA56_7<=16)||LA56_7==18||(LA56_7>=20 && LA56_7<=22)||(LA56_7>=34 && LA56_7<=52)||LA56_7==55||LA56_7==57||LA56_7==59||LA56_7==61||LA56_7==73||(LA56_7>=76 && LA56_7<=88)) ) {
                                alt56=1;
                            }
                            else if ( ((LA56_7>=74 && LA56_7<=75)) ) {
                                alt56=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 4, input);

                            throw nvae;
                        }
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
                    case 34:
                    case 35:
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
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 55:
                    case 57:
                    case 59:
                    case 61:
                    case 73:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                        {
                        alt56=1;
                        }
                        break;
                    case 74:
                    case 75:
                        {
                        alt56=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        int LA56_4 = input.LA(4);

                        if ( (LA56_4==RULE_INT) ) {
                            int LA56_7 = input.LA(5);

                            if ( (LA56_7==EOF||LA56_7==RULE_ID||(LA56_7>=15 && LA56_7<=16)||LA56_7==18||(LA56_7>=20 && LA56_7<=22)||(LA56_7>=34 && LA56_7<=52)||LA56_7==55||LA56_7==57||LA56_7==59||LA56_7==61||LA56_7==73||(LA56_7>=76 && LA56_7<=88)) ) {
                                alt56=1;
                            }
                            else if ( ((LA56_7>=74 && LA56_7<=75)) ) {
                                alt56=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 4, input);

                            throw nvae;
                        }
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
                    case 34:
                    case 35:
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
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 55:
                    case 57:
                    case 59:
                    case 61:
                    case 73:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                        {
                        alt56=1;
                        }
                        break;
                    case 74:
                    case 75:
                        {
                        alt56=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    int LA56_4 = input.LA(3);

                    if ( (LA56_4==RULE_INT) ) {
                        int LA56_7 = input.LA(4);

                        if ( (LA56_7==EOF||LA56_7==RULE_ID||(LA56_7>=15 && LA56_7<=16)||LA56_7==18||(LA56_7>=20 && LA56_7<=22)||(LA56_7>=34 && LA56_7<=52)||LA56_7==55||LA56_7==57||LA56_7==59||LA56_7==61||LA56_7==73||(LA56_7>=76 && LA56_7<=88)) ) {
                            alt56=1;
                        }
                        else if ( ((LA56_7>=74 && LA56_7<=75)) ) {
                            alt56=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 4, input);

                        throw nvae;
                    }
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
                case 34:
                case 35:
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
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 55:
                case 57:
                case 59:
                case 61:
                case 73:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                    {
                    alt56=1;
                    }
                    break;
                case 74:
                case 75:
                    {
                    alt56=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3385:5: this_Decimal_0= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecimal_in_ruleREAL7152);
                    this_Decimal_0=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3397:5: this_DecimalExp_1= ruleDecimalExp
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDecimalExp_in_ruleREAL7185);
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


    // $ANTLR start "entryRuleDecimal"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3415:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3419:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3420:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal7237);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal7248); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3430:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3434:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3435:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3435:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3435:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3435:2: (kw= '+' | kw= '-' )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==49) ) {
                alt57=1;
            }
            else if ( (LA57_0==50) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3436:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDecimal7291); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3443:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDecimal7310); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal7327); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3455:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==31) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3456:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleDecimal7346); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal7361); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3479:1: entryRuleDecimalExp returns [String current=null] : iv_ruleDecimalExp= ruleDecimalExp EOF ;
    public final String entryRuleDecimalExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimalExp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3483:2: (iv_ruleDecimalExp= ruleDecimalExp EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3484:2: iv_ruleDecimalExp= ruleDecimalExp EOF
            {
             newCompositeNode(grammarAccess.getDecimalExpRule()); 
            pushFollow(FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp7419);
            iv_ruleDecimalExp=ruleDecimalExp();

            state._fsp--;

             current =iv_ruleDecimalExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalExp7430); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3494:1: ruleDecimalExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimalExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_9=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3498:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3499:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3499:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3499:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3499:2: (kw= '+' | kw= '-' )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==49) ) {
                alt59=1;
            }
            else if ( (LA59_0==50) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3500:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDecimalExp7473); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3507:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDecimalExp7492); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp7509); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3519:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==31) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3520:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleDecimalExp7528); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp7543); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3532:3: (kw= 'E' | kw= 'e' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==74) ) {
                alt61=1;
            }
            else if ( (LA61_0==75) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3533:2: kw= 'E'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleDecimalExp7564); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3540:2: kw= 'e'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleDecimalExp7583); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3545:2: (kw= '+' | kw= '-' )?
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            else if ( (LA62_0==50) ) {
                alt62=2;
            }
            switch (alt62) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3546:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDecimalExp7598); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3553:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDecimalExp7617); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 
                        

                    }
                    break;

            }

            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp7634); 

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


    // $ANTLR start "entryRuleQuantity"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3576:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3577:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3578:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_ruleQuantity_in_entryRuleQuantity7683);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantity7693); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3585:1: ruleQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_units_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3588:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3590:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityAccess().getQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3595:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3596:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3596:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3597:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleQuantity7748);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3613:2: ( (lv_units_2_0= ruleUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3614:1: (lv_units_2_0= ruleUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3614:1: (lv_units_2_0= ruleUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3615:3: lv_units_2_0= ruleUnit
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getUnitsUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnit_in_ruleQuantity7769);
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


    // $ANTLR start "entryRuleUnit"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3639:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3640:2: (iv_ruleUnit= ruleUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3641:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit7806);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit7817); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3648:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3651:28: ( (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3652:1: (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3652:1: (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            int alt63=13;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt63=1;
                }
                break;
            case 77:
                {
                alt63=2;
                }
                break;
            case 78:
                {
                alt63=3;
                }
                break;
            case 79:
                {
                alt63=4;
                }
                break;
            case 80:
                {
                alt63=5;
                }
                break;
            case 81:
                {
                alt63=6;
                }
                break;
            case 82:
                {
                alt63=7;
                }
                break;
            case 83:
                {
                alt63=8;
                }
                break;
            case 84:
                {
                alt63=9;
                }
                break;
            case 85:
                {
                alt63=10;
                }
                break;
            case 86:
                {
                alt63=11;
                }
                break;
            case 87:
                {
                alt63=12;
                }
                break;
            case 88:
                {
                alt63=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3653:2: kw= 's'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleUnit7855); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3660:2: kw= 'min'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleUnit7874); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMinKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3667:2: kw= 'mins'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleUnit7893); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMinsKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:2: kw= 's^-1'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleUnit7912); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getS1Keyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3681:2: kw= 'min^-1'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleUnit7931); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMin1Keyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3688:2: kw= 'M'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleUnit7950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3695:2: kw= 'mM'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleUnit7969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMMKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3702:2: kw= 'uM'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleUnit7988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getUMKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3709:2: kw= 'nM'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleUnit8007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getNMKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3716:2: kw= 'pM'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleUnit8026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getPMKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3723:2: kw= 'fM'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleUnit8045); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getFMKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3730:2: kw= 'molecule'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleUnit8064); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMoleculeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3737:2: kw= 'molecules'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleUnit8083); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMoleculesKeyword_12()); 
                        

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


    // $ANTLR start "entryRuleRelationalOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3750:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3751:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3752:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator8124);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator8135); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3759:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3762:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3763:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3763:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt64=6;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt64=1;
                }
                break;
            case 90:
                {
                alt64=2;
                }
                break;
            case 24:
                {
                alt64=3;
                }
                break;
            case 25:
                {
                alt64=4;
                }
                break;
            case 91:
                {
                alt64=5;
                }
                break;
            case 92:
                {
                alt64=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3764:2: kw= '=='
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator8173); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3771:2: kw= '!='
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator8192); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3778:2: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleRelationalOperator8211); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3785:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleRelationalOperator8230); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3792:2: kw= '<='
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator8249); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3799:2: kw= '>='
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator8268); 

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


    // $ANTLR start "entryRuleBooleanOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3812:1: entryRuleBooleanOperator returns [String current=null] : iv_ruleBooleanOperator= ruleBooleanOperator EOF ;
    public final String entryRuleBooleanOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3813:2: (iv_ruleBooleanOperator= ruleBooleanOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3814:2: iv_ruleBooleanOperator= ruleBooleanOperator EOF
            {
             newCompositeNode(grammarAccess.getBooleanOperatorRule()); 
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator8309);
            iv_ruleBooleanOperator=ruleBooleanOperator();

            state._fsp--;

             current =iv_ruleBooleanOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator8320); 

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
    // $ANTLR end "entryRuleBooleanOperator"


    // $ANTLR start "ruleBooleanOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3821:1: ruleBooleanOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) ) ;
    public final AntlrDatatypeRuleToken ruleBooleanOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3824:28: ( (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3825:1: (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3825:1: (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) )
            int alt65=6;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt65=1;
                }
                break;
            case 51:
                {
                alt65=2;
                }
                break;
            case 94:
                {
                int LA65_3 = input.LA(2);

                if ( (LA65_3==96) ) {
                    alt65=5;
                }
                else if ( (LA65_3==EOF||LA65_3==RULE_ID) ) {
                    alt65=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 3, input);

                    throw nvae;
                }
                }
                break;
            case 95:
                {
                int LA65_4 = input.LA(2);

                if ( (LA65_4==EOF||LA65_4==RULE_ID) ) {
                    alt65=4;
                }
                else if ( (LA65_4==96) ) {
                    alt65=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3826:2: kw= '&'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleBooleanOperator8358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getAmpersandKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3833:2: kw= '|'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleBooleanOperator8377); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getVerticalLineKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3840:2: kw= 'AND'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleBooleanOperator8396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getANDKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3847:2: kw= 'OR'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleBooleanOperator8415); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getORKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3853:6: (kw= 'AND' kw= 'NOT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3853:6: (kw= 'AND' kw= 'NOT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3854:2: kw= 'AND' kw= 'NOT'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleBooleanOperator8435); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getANDKeyword_4_0()); 
                        
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleBooleanOperator8448); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getNOTKeyword_4_1()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3866:6: (kw= 'OR' kw= 'NOT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3866:6: (kw= 'OR' kw= 'NOT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3867:2: kw= 'OR' kw= 'NOT'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleBooleanOperator8469); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getORKeyword_5_0()); 
                        
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleBooleanOperator8482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getNOTKeyword_5_1()); 
                        

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
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3886:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3887:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3888:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8524);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8535); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3895:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3898:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3899:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3899:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3900:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8582);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3910:1: (kw= '.*' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==97) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3911:2: kw= '.*'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleQualifiedNameWithWildcard8601); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3924:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3925:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3926:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8644);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8655); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3933:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3936:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3937:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3937:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3937:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8695); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3944:1: (kw= '.' this_ID_2= RULE_ID )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==31) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3945:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleQualifiedName8714); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8729); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3965:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3966:2: (iv_ruleList= ruleList EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3967:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList8776);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList8786); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3974:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3977:28: ( ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3978:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3978:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3978:2: () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3978:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3979:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListAccess().getListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleList8832); 

                	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3988:1: ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3989:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3989:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3990:3: lv_entries_2_0= ruleAtomicVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8853);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4006:2: (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==15) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4006:4: otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleList8866); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_3_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4010:1: ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4011:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4011:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4012:3: lv_entries_4_0= ruleAtomicVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8887);
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
            	    break loop68;
                }
            } while (true);

            otherlv_5=(Token)match(input,61,FOLLOW_61_in_ruleList8901); 

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


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA18_eotS =
        "\25\uffff";
    static final String DFA18_eofS =
        "\21\uffff\1\23\3\uffff";
    static final String DFA18_minS =
        "\17\4\2\uffff\2\4\2\uffff";
    static final String DFA18_maxS =
        "\1\60\16\4\2\uffff\1\73\1\74\2\uffff";
    static final String DFA18_acceptS =
        "\17\uffff\1\2\1\3\2\uffff\1\1\1\4";
    static final String DFA18_specialS =
        "\25\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\17\17\uffff\1\13\1\2\1\14\14\uffff\1\1\1\3\1\4\1\5\1\6\1"+
            "\7\1\10\1\11\1\12\1\15\1\16\3\20",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "",
            "",
            "\1\23\15\uffff\1\23\1\uffff\3\23\7\uffff\1\23\1\uffff\1\22"+
            "\1\uffff\17\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\uffff"+
            "\1\23",
            "\3\24\32\uffff\1\23\17\uffff\2\24\11\uffff\1\24",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "998:1: (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic )";
        }
    }
    static final String DFA34_eotS =
        "\24\uffff";
    static final String DFA34_eofS =
        "\1\uffff\1\10\2\uffff\1\15\11\uffff\1\23\1\15\2\uffff\1\15\1\uffff";
    static final String DFA34_minS =
        "\2\4\2\6\1\4\1\uffff\1\4\2\uffff\1\6\1\uffff\2\6\1\uffff\2\4\2\6"+
        "\1\4\1\uffff";
    static final String DFA34_maxS =
        "\1\62\1\75\2\6\1\130\1\uffff\1\4\2\uffff\1\6\1\uffff\2\62\1\uffff"+
        "\1\75\1\130\2\6\1\130\1\uffff";
    static final String DFA34_acceptS =
        "\5\uffff\1\6\1\uffff\1\2\1\1\1\uffff\1\5\2\uffff\1\4\5\uffff\1\3";
    static final String DFA34_specialS =
        "\24\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\1\5\1\4\52\uffff\1\2\1\3",
            "\1\10\12\uffff\2\10\1\uffff\1\10\1\uffff\3\10\7\uffff\1\6\1"+
            "\7\2\uffff\23\10\2\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\1\10",
            "\1\4",
            "\1\4",
            "\1\15\12\uffff\2\15\1\uffff\1\15\1\uffff\3\15\10\uffff\1\11"+
            "\2\uffff\23\15\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff"+
            "\1\15\14\uffff\1\13\1\14\15\12",
            "",
            "\1\16",
            "",
            "",
            "\1\17",
            "",
            "\1\22\52\uffff\1\20\1\21",
            "\1\22\52\uffff\1\20\1\21",
            "",
            "\1\23\12\uffff\2\23\1\uffff\1\23\1\uffff\3\23\7\uffff\1\6\1"+
            "\7\2\uffff\23\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\23\1\uffff"+
            "\1\23",
            "\1\15\12\uffff\2\15\1\uffff\1\15\1\uffff\3\15\13\uffff\23\15"+
            "\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\14\uffff"+
            "\1\13\1\14\15\12",
            "\1\22",
            "\1\22",
            "\1\15\12\uffff\2\15\1\uffff\1\15\1\uffff\3\15\13\uffff\23\15"+
            "\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\16\uffff"+
            "\15\12",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2082:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )";
        }
    }
    static final String DFA40_eotS =
        "\12\uffff";
    static final String DFA40_eofS =
        "\1\2\1\5\4\uffff\1\5\3\uffff";
    static final String DFA40_minS =
        "\2\4\1\uffff\2\4\1\uffff\4\4";
    static final String DFA40_maxS =
        "\2\73\1\uffff\1\4\1\73\1\uffff\1\73\1\74\1\73\1\74";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA40_specialS =
        "\12\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\15\uffff\1\2\1\uffff\3\2\13\uffff\17\2\3\uffff\1\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\4\15\uffff\1\5\1\uffff\3\5\7\uffff\1\3\2\2\1\uffff\20\5"+
            "\2\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5",
            "",
            "\1\6",
            "\1\10\15\uffff\1\2\1\uffff\3\2\7\uffff\2\5\1\7\1\uffff\17\2"+
            "\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "",
            "\1\5\15\uffff\1\5\1\uffff\3\5\7\uffff\1\3\1\2\2\uffff\20\5"+
            "\2\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5",
            "\3\5\32\uffff\1\2\17\uffff\2\5\11\uffff\1\5",
            "\1\4\15\uffff\1\5\1\uffff\3\5\7\uffff\2\2\1\11\1\uffff\17\5"+
            "\3\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5",
            "\3\2\32\uffff\1\5\17\uffff\2\2\11\uffff\1\2"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2400:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?";
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
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFunctionDefinition465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionDefinition486 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDefinition498 = new BitSet(new long[]{0x0000000000F00010L});
    public static final BitSet FOLLOW_ruleFunctionType_in_ruleFunctionDefinition521 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionDefinition540 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition555 = new BitSet(new long[]{0x0001FFF800710000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition577 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition590 = new BitSet(new long[]{0x0001FFF800700000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition611 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition627 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDefinition639 = new BitSet(new long[]{0x0A91FFFC00740010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleFunctionDefinition660 = new BitSet(new long[]{0x0A91FFFC00740010L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDefinition673 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionDefinition686 = new BitSet(new long[]{0x00003FF800700000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition707 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition720 = new BitSet(new long[]{0x00003FF800700000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition741 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleFunctionType_in_entryRuleFunctionType782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionType793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFunctionType831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionType850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFunctionType869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionType888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionParameterMember985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleFunctionParameterMember1013 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionParameterMember1025 = new BitSet(new long[]{0x00003FF800700010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionParameterMember1048 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionParameterMember1067 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionParameterMember1082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionParameterMember1105 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionParameterMember1118 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope1178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterScope1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionParameterScope1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionParameterScope1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionParameterScope1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_entryRuleFunctionBodyMember1305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBodyMember1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleFunctionBodyMember1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleFunctionBodyMember1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleFunctionBodyMember1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleFunctionBodyMember1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleFunctionBodyMember1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleFunctionBodyMember1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUseMember1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionUseMember1588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionUseMember1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableComplex1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex1805 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleVariableComplex1818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex1839 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute1943 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleVariableAttribute1970 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVariableAttribute1983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition2107 = new BitSet(new long[]{0x0001FFFC00700010L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn2227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2314 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn2341 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionBuiltIn2355 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionBuiltIn2367 = new BitSet(new long[]{0x00003FF800700010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2390 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinitionBuiltIn2424 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2446 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionBuiltIn2459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2480 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionBuiltIn2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined2534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2620 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionUserDefined2633 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionUserDefined2645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2666 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinitionUserDefined2678 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2700 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionUserDefined2713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2734 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionUserDefined2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection2788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionCollection2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection2854 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVariableDefinitionCollection2866 = new BitSet(new long[]{0x00003FF800700010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection2889 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2908 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariableDefinitionCollection2923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2944 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionCollection2958 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleVariableDefinitionCollection2979 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionCollection2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic3029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBasic3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic3094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic3115 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionBasic3127 = new BitSet(new long[]{0x1006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment3184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterAssignment3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleParameterAssignment3240 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleParameterAssignment3252 = new BitSet(new long[]{0x1006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVariableQualifier3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType3398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVariableType3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableType3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVariableType3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVariableType3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariableType3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVariableType3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVariableType3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVariableType3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVariableType3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVariableType3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVariableType3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVariableType3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariableType3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariableType3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID3735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCollectionID3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCollectionID3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCollectionID3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment3862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment3927 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleVariableAssignment3939 = new BitSet(new long[]{0x1006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableAssignment3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject3996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentObject4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression4120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4185 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression4202 = new BitSet(new long[]{0x1006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4222 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject4260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionObject4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject4379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject4618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVariableExpressionOperator4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVariableExpressionOperator4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVariableExpressionOperator4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition4847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleRuleDefinition4903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleDefinition4924 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRuleDefinition4936 = new BitSet(new long[]{0x0060000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition4958 = new BitSet(new long[]{0x0062000000000000L});
    public static final BitSet FOLLOW_49_in_ruleRuleDefinition4971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition4992 = new BitSet(new long[]{0x0062000000000000L});
    public static final BitSet FOLLOW_53_in_ruleRuleDefinition5009 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_54_in_ruleRuleDefinition5033 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition5069 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRuleDefinition5082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition5103 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject5143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleObject5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleRuleObject5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition5267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDefinition5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDeviceDefinition5323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeviceDefinition5344 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition5356 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition5368 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleDeviceDefinition5380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeviceDefinition5392 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleDeviceDefinition5404 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition5416 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition5437 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeviceDefinition5449 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeviceDefinition5461 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5483 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDeviceDefinition5496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5517 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleDeviceDefinition5533 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition5545 = new BitSet(new long[]{0x0A91FFFC00740010L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition5566 = new BitSet(new long[]{0x0A91FFFC00740010L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceMembers5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition5761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCDefinition5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleATGCDefinition5817 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_ruleATGCDefinition5838 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleATGCDefinition5850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition5871 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleATGCDefinition5884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition5905 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand5944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCCommand5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleATGCCommand5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition6031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePropertyDefinition6087 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePropertyDefinition6101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyDefinition6122 = new BitSet(new long[]{0x2008000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rulePropertyDefinition6139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyDefinition6159 = new BitSet(new long[]{0x2008000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_61_in_rulePropertyDefinition6173 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_rulePropertyCondition_in_rulePropertyDefinition6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePropertyDefinition6214 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePropertyDefinition6226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_rulePropertyDefinition6247 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePropertyDefinition6259 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_rulePropertyDefinition6271 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyDefinition6292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_rulePropertyDefinition6304 = new BitSet(new long[]{0x0000000003000000L,0x000000001E000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rulePropertyDefinition6327 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyDefinition6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePropertyDefinition6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty6406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleProperty6471 = new BitSet(new long[]{0x0000000003000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleProperty6492 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleProperty6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCondition_in_entryRulePropertyCondition6549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCondition6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePropertyCondition6606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_67_in_rulePropertyCondition6624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_68_in_rulePropertyCondition6642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_69_in_rulePropertyCondition6660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_70_in_rulePropertyCondition6678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_71_in_rulePropertyCondition6692 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePropertyCondition6704 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyCondition6725 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePropertyCondition6737 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyCondition6758 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePropertyCondition6770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_rulePropertyCondition6783 = new BitSet(new long[]{0x0000000003000000L,0x000000001E000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rulePropertyCondition6806 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleREAL_in_rulePropertyCondition6827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_65_in_rulePropertyCondition6846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_rulePropertyCondition6864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6885 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rulePropertyCondition6898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6919 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition6959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInitialCondition6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition7024 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePropertyInitialCondition7036 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyInitialCondition7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL7094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleREAL7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_ruleREAL7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal7237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDecimal7291 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50_in_ruleDecimal7310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal7327 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleDecimal7346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp7419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalExp7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDecimalExp7473 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50_in_ruleDecimalExp7492 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp7509 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_31_in_ruleDecimalExp7528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp7543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleDecimalExp7564 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_75_in_ruleDecimalExp7583 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_49_in_ruleDecimalExp7598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50_in_ruleDecimalExp7617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity7683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantity7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleQuantity7748 = new BitSet(new long[]{0x0000000000000000L,0x0000000001FFF000L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleQuantity7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit7806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit7817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleUnit7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUnit7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleUnit7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleUnit7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUnit7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleUnit7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleUnit7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnit7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnit8007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleUnit8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnit8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnit8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUnit8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator8124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRelationalOperator8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRelationalOperator8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator8268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator8309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleBooleanOperator8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBooleanOperator8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleBooleanOperator8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleBooleanOperator8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleBooleanOperator8435 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleBooleanOperator8448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleBooleanOperator8469 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleBooleanOperator8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8582 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleQualifiedNameWithWildcard8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8695 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleQualifiedName8714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8729 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList8776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleList8832 = new BitSet(new long[]{0x0006000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8853 = new BitSet(new long[]{0x2000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleList8866 = new BitSet(new long[]{0x0006000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8887 = new BitSet(new long[]{0x2000000000008000L});
    public static final BitSet FOLLOW_61_in_ruleList8901 = new BitSet(new long[]{0x0000000000000002L});

}