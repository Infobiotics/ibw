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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'define'", "'typeof'", "'('", "','", "')'", "'{'", "'}'", "'USES'", "'PROCESS'", "'CELL'", "'SYSTEM'", "'REGION'", "':'", "'required'", "'returned'", "'optional'", "'~'", "'.'", "'='", "'new'", "'<'", "'>'", "'observable'", "'MOLECULE'", "'RIBOSOME'", "'PROMOTER'", "'PROTEIN'", "'DNA'", "'RNA'", "'GENE'", "'INTEGER'", "'RATE'", "'LIST'", "'SET'", "'+'", "'-'", "'|'", "'RULE'", "'->'", "'<->'", "'DEVICE'", "'parts'", "'ATGC'", "'ARRANGE'", "'VERIFY'", "'['", "']'", "'EXPECTED'", "'AT TIME INSTANT'", "'IS'", "'?'", "'WILL HOLD'", "'NEVER HOLDS'", "'ALWAYS HOLDS'", "'EVENTUALLY HOLDS'", "'SOMETIMES HOLDS'", "'WITHIN TIME BOUND'", "'WITH PROBABILITY BOUND'", "'GIVEN'", "'E'", "'e'", "'s'", "'min'", "'mins'", "'s^-1'", "'min^-1'", "'M'", "'mM'", "'uM'", "'nM'", "'pM'", "'fM'", "'molecule'", "'molecules'", "'=='", "'!='", "'<='", "'>='", "'&'", "'AND'", "'OR'", "'NOT'", "'.*'"
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:210:1: ruleFunctionDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_type_4_0= ruleFunctionType ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? ) ;
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

        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_members_11_0 = null;

        EObject lv_uses_14_0 = null;

        EObject lv_uses_16_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:213:28: ( ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_type_4_0= ruleFunctionType ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:214:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_type_4_0= ruleFunctionType ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:214:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_type_4_0= ruleFunctionType ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:214:2: () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_type_4_0= ruleFunctionType ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionBodyMember ) )* otherlv_12= '}' (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )?
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
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:246:1: ( (lv_type_4_0= ruleFunctionType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:247:1: (lv_type_4_0= ruleFunctionType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:247:1: (lv_type_4_0= ruleFunctionType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:248:3: lv_type_4_0= ruleFunctionType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTypeFunctionTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionType_in_ruleFunctionDefinition519);
            lv_type_4_0=ruleFunctionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"FunctionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition531); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:268:1: ( ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=20 && LA4_0<=22)||(LA4_0>=35 && LA4_0<=43)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:268:2: ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:268:2: ( (lv_parameters_6_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:269:1: (lv_parameters_6_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:269:1: (lv_parameters_6_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:270:3: lv_parameters_6_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition553);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:286:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:286:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition566); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:290:1: ( (lv_parameters_8_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:291:1: (lv_parameters_8_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:291:1: (lv_parameters_8_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:292:3: lv_parameters_8_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition587);
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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition603); 

                	newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_7());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleFunctionDefinition615); 

                	newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:316:1: ( (lv_members_11_0= ruleFunctionBodyMember ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=20 && LA5_0<=22)||(LA5_0>=34 && LA5_0<=45)||LA5_0==49||LA5_0==52||LA5_0==54||LA5_0==56) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:317:1: (lv_members_11_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:317:1: (lv_members_11_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:318:3: lv_members_11_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionBodyMemberParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleFunctionDefinition636);
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
            	    break loop5;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDefinition649); 

                	newLeafNode(otherlv_12, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_10());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:338:1: (otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:338:3: otherlv_13= 'USES' ( (lv_uses_14_0= ruleFunctionUseMember ) ) (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )*
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleFunctionDefinition662); 

                        	newLeafNode(otherlv_13, grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_11_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:342:1: ( (lv_uses_14_0= ruleFunctionUseMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:343:1: (lv_uses_14_0= ruleFunctionUseMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:343:1: (lv_uses_14_0= ruleFunctionUseMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:344:3: lv_uses_14_0= ruleFunctionUseMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition683);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:360:2: (otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:360:4: otherlv_15= ',' ( (lv_uses_16_0= ruleFunctionUseMember ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition696); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_11_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:364:1: ( (lv_uses_16_0= ruleFunctionUseMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:365:1: (lv_uses_16_0= ruleFunctionUseMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:365:1: (lv_uses_16_0= ruleFunctionUseMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:366:3: lv_uses_16_0= ruleFunctionUseMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition717);
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
                    	    break loop6;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:390:1: entryRuleFunctionType returns [String current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final String entryRuleFunctionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:391:2: (iv_ruleFunctionType= ruleFunctionType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:392:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_ruleFunctionType_in_entryRuleFunctionType758);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;

             current =iv_ruleFunctionType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionType769); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:399:1: ruleFunctionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:402:28: ( (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:403:1: (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:403:1: (kw= 'PROCESS' | kw= 'CELL' | kw= 'SYSTEM' | kw= 'REGION' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:404:2: kw= 'PROCESS'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleFunctionType807); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getPROCESSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:411:2: kw= 'CELL'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleFunctionType826); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getCELLKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:418:2: kw= 'SYSTEM'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleFunctionType845); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getSYSTEMKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:425:2: kw= 'REGION'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleFunctionType864); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:438:1: entryRuleFunctionParameterMember returns [EObject current=null] : iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF ;
    public final EObject entryRuleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:439:2: (iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:440:2: iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember904);
            iv_ruleFunctionParameterMember=ruleFunctionParameterMember();

            state._fsp--;

             current =iv_ruleFunctionParameterMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember914); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:447:1: ruleFunctionParameterMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) (otherlv_2= ':' ( (lv_scope_3_0= ruleFunctionParameterScope ) ) )? ) ;
    public final EObject ruleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:450:28: ( ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) (otherlv_2= ':' ( (lv_scope_3_0= ruleFunctionParameterScope ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:451:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) (otherlv_2= ':' ( (lv_scope_3_0= ruleFunctionParameterScope ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:451:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) (otherlv_2= ':' ( (lv_scope_3_0= ruleFunctionParameterScope ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:451:2: ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) (otherlv_2= ':' ( (lv_scope_3_0= ruleFunctionParameterScope ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:451:2: ( (lv_type_0_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:452:1: (lv_type_0_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:452:1: (lv_type_0_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:453:3: lv_type_0_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionParameterMember960);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:470:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:470:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:471:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionParameterMember981);
            lv_name_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:487:2: (otherlv_2= ':' ( (lv_scope_3_0= ruleFunctionParameterScope ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:487:4: otherlv_2= ':' ( (lv_scope_3_0= ruleFunctionParameterScope ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleFunctionParameterMember994); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:491:1: ( (lv_scope_3_0= ruleFunctionParameterScope ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:492:1: (lv_scope_3_0= ruleFunctionParameterScope )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:492:1: (lv_scope_3_0= ruleFunctionParameterScope )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:493:3: lv_scope_3_0= ruleFunctionParameterScope
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getScopeFunctionParameterScopeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember1015);
                    lv_scope_3_0=ruleFunctionParameterScope();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
                    	        }
                           		set(
                           			current, 
                           			"scope",
                            		lv_scope_3_0, 
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:517:1: entryRuleFunctionParameterScope returns [String current=null] : iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF ;
    public final String entryRuleFunctionParameterScope() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionParameterScope = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:518:2: (iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:519:2: iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterScopeRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope1054);
            iv_ruleFunctionParameterScope=ruleFunctionParameterScope();

            state._fsp--;

             current =iv_ruleFunctionParameterScope.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterScope1065); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:526:1: ruleFunctionParameterScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'required' | kw= 'returned' | kw= 'optional' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionParameterScope() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:529:28: ( (kw= 'required' | kw= 'returned' | kw= 'optional' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:530:1: (kw= 'required' | kw= 'returned' | kw= 'optional' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:530:1: (kw= 'required' | kw= 'returned' | kw= 'optional' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:531:2: kw= 'required'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleFunctionParameterScope1103); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getRequiredKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:538:2: kw= 'returned'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleFunctionParameterScope1122); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getReturnedKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:545:2: kw= 'optional'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleFunctionParameterScope1141); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:558:1: entryRuleFunctionBodyMember returns [EObject current=null] : iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF ;
    public final EObject entryRuleFunctionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:559:2: (iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:560:2: iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionBodyMember_in_entryRuleFunctionBodyMember1181);
            iv_ruleFunctionBodyMember=ruleFunctionBodyMember();

            state._fsp--;

             current =iv_ruleFunctionBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBodyMember1191); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:567:1: ruleFunctionBodyMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:570:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:571:1: (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:571:1: (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableDefinition_2= ruleVariableDefinition | this_VariableAssignment_3= ruleVariableAssignment | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                alt11=2;
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
                {
                alt11=3;
                }
                break;
            case RULE_ID:
                {
                int LA11_4 = input.LA(2);

                if ( ((LA11_4>=29 && LA11_4<=30)) ) {
                    alt11=4;
                }
                else if ( (LA11_4==RULE_ID) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                alt11=5;
                }
                break;
            case 56:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:572:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleFunctionBodyMember1238);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:582:5: this_DeviceDefinition_1= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getDeviceDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleFunctionBodyMember1265);
                    this_DeviceDefinition_1=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:592:5: this_VariableDefinition_2= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getVariableDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleFunctionBodyMember1292);
                    this_VariableDefinition_2=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:602:5: this_VariableAssignment_3= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getVariableAssignmentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleFunctionBodyMember1319);
                    this_VariableAssignment_3=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:612:5: this_ATGCDefinition_4= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getATGCDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleFunctionBodyMember1346);
                    this_ATGCDefinition_4=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:622:5: this_PropertyDefinition_5= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getPropertyDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleFunctionBodyMember1373);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:638:1: entryRuleFunctionUseMember returns [EObject current=null] : iv_ruleFunctionUseMember= ruleFunctionUseMember EOF ;
    public final EObject entryRuleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUseMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:639:2: (iv_ruleFunctionUseMember= ruleFunctionUseMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:640:2: iv_ruleFunctionUseMember= ruleFunctionUseMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionUseMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember1408);
            iv_ruleFunctionUseMember=ruleFunctionUseMember();

            state._fsp--;

             current =iv_ruleFunctionUseMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUseMember1418); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:647:1: ruleFunctionUseMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) ;
    public final EObject ruleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:650:28: ( ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:651:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:651:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:651:2: ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:651:2: ( (lv_type_0_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:652:1: (lv_type_0_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:652:1: (lv_type_0_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:653:3: lv_type_0_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getTypeVariableTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionUseMember1464);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:669:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:670:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:670:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:671:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionUseMember1485);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:695:1: entryRuleVariableName returns [String current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final String entryRuleVariableName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:696:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:697:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName1522);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName1533); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:704:1: ruleVariableName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVariableName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:707:28: (this_ID_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:708:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableName1572); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:723:1: entryRuleVariableComplex returns [EObject current=null] : iv_ruleVariableComplex= ruleVariableComplex EOF ;
    public final EObject entryRuleVariableComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableComplex = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:724:2: (iv_ruleVariableComplex= ruleVariableComplex EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:725:2: iv_ruleVariableComplex= ruleVariableComplex EOF
            {
             newCompositeNode(grammarAccess.getVariableComplexRule()); 
            pushFollow(FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex1616);
            iv_ruleVariableComplex=ruleVariableComplex();

            state._fsp--;

             current =iv_ruleVariableComplex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableComplex1626); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:1: ruleVariableComplex returns [EObject current=null] : ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) ;
    public final EObject ruleVariableComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_components_1_0 = null;

        AntlrDatatypeRuleToken lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:735:28: ( ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:2: () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableComplexAccess().getVariableComplexAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:742:2: ( (lv_components_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:743:1: (lv_components_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:743:1: (lv_components_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:744:3: lv_components_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex1681);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:760:2: (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:760:4: otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleVariableComplex1694); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVariableComplexAccess().getTildeKeyword_2_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:764:1: ( (lv_components_3_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:765:1: (lv_components_3_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:765:1: (lv_components_3_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:766:3: lv_components_3_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex1715);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:790:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:791:2: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:792:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute1753);
            iv_ruleVariableAttribute=ruleVariableAttribute();

            state._fsp--;

             current =iv_ruleVariableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute1763); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:799:1: ruleVariableAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '.' ( (lv_attribute_3_0= ruleVariableName ) ) ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_attribute_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:802:28: ( ( () ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '.' ( (lv_attribute_3_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:803:1: ( () ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '.' ( (lv_attribute_3_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:803:1: ( () ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '.' ( (lv_attribute_3_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:803:2: () ( (lv_name_1_0= ruleVariableName ) ) otherlv_2= '.' ( (lv_attribute_3_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:803:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:804:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:809:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:810:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:810:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:811:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute1818);
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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleVariableAttribute1830); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:831:1: ( (lv_attribute_3_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:832:1: (lv_attribute_3_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:832:1: (lv_attribute_3_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:833:3: lv_attribute_3_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getAttributeVariableNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute1851);
            lv_attribute_3_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_3_0, 
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:859:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:860:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:861:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition1889);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition1899); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:868:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_qualifier_1_0 = null;

        EObject lv_definition_2_1 = null;

        EObject lv_definition_2_2 = null;

        EObject lv_definition_2_3 = null;

        EObject lv_definition_2_4 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:871:28: ( ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:872:1: ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:872:1: ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:872:2: () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:872:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:873:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:878:2: ( (lv_qualifier_1_0= ruleVariableQualifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:879:1: (lv_qualifier_1_0= ruleVariableQualifier )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:879:1: (lv_qualifier_1_0= ruleVariableQualifier )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:880:3: lv_qualifier_1_0= ruleVariableQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getQualifierVariableQualifierParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition1954);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:896:3: ( ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:897:1: ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:897:1: ( (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:898:1: (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:898:1: (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:899:3: lv_definition_2_1= ruleVariableDefinitionBuiltIn
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBuiltInParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition1978);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:914:8: lv_definition_2_2= ruleVariableDefinitionUserDefined
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionUserDefinedParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition1997);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:929:8: lv_definition_2_3= ruleVariableDefinitionCollection
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionCollectionParserRuleCall_2_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition2016);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:944:8: lv_definition_2_4= ruleVariableDefinitionBasic
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBasicParserRuleCall_2_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition2035);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:970:1: entryRuleVariableDefinitionBuiltIn returns [EObject current=null] : iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF ;
    public final EObject entryRuleVariableDefinitionBuiltIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBuiltIn = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:971:2: (iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:2: iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBuiltInRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn2074);
            iv_ruleVariableDefinitionBuiltIn=ruleVariableDefinitionBuiltIn();

            state._fsp--;

             current =iv_ruleVariableDefinitionBuiltIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn2084); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:979:1: ruleVariableDefinitionBuiltIn returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
    public final EObject ruleVariableDefinitionBuiltIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_constructor_5_1 = null;

        AntlrDatatypeRuleToken lv_constructor_5_2 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:982:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:983:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:983:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:983:2: () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:983:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:984:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBuiltInAccess().getVariableDefinitionBuiltInAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:989:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:990:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:990:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:991:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2139);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1007:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1008:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1008:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1009:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2160);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1025:2: (otherlv_3= '=' otherlv_4= 'new' ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1025:4: otherlv_3= '=' otherlv_4= 'new' ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleVariableDefinitionBuiltIn2173); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionBuiltInAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleVariableDefinitionBuiltIn2185); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionBuiltInAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1033:1: ( ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1034:1: ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1034:1: ( (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1035:1: (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1035:1: (lv_constructor_5_1= ruleVariableType | lv_constructor_5_2= ruleVariableName )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=20 && LA15_0<=22)||(LA15_0>=35 && LA15_0<=43)) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1036:3: lv_constructor_5_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableTypeParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2208);
                            lv_constructor_5_1=ruleVariableType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"constructor",
                                    		lv_constructor_5_1, 
                                    		"VariableType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1051:8: lv_constructor_5_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableNameParserRuleCall_3_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2227);
                            lv_constructor_5_2=ruleVariableName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"constructor",
                                    		lv_constructor_5_2, 
                                    		"VariableName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinitionBuiltIn2242); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionBuiltInAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1073:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1073:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1073:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1074:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1074:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1075:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2264);
                            lv_parameters_7_0=ruleParameterAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_7_0, 
                                    		"ParameterAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1091:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==15) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1091:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionBuiltIn2277); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionBuiltInAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1095:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1096:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1096:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1097:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2298);
                            	    lv_parameters_9_0=ruleParameterAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionBuiltInRule());
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionBuiltIn2314); 

                        	newLeafNode(otherlv_10, grammarAccess.getVariableDefinitionBuiltInAccess().getRightParenthesisKeyword_3_5());
                        

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1125:1: entryRuleVariableDefinitionUserDefined returns [EObject current=null] : iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF ;
    public final EObject entryRuleVariableDefinitionUserDefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionUserDefined = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1126:2: (iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1127:2: iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined2352);
            iv_ruleVariableDefinitionUserDefined=ruleVariableDefinitionUserDefined();

            state._fsp--;

             current =iv_ruleVariableDefinitionUserDefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined2362); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1134:1: ruleVariableDefinitionUserDefined returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1137:28: ( ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1138:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1138:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1138:2: () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1138:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1139:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionUserDefinedAccess().getVariableDefinitionUserDefinedAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1144:2: ( (lv_type_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1145:1: (lv_type_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1145:1: (lv_type_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1146:3: lv_type_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getTypeVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2417);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1162:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1163:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1163:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1164:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2438);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1180:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1180:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleVariableDefinitionUserDefined2451); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionUserDefinedAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleVariableDefinitionUserDefined2463); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionUserDefinedAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1188:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1189:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1189:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1190:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2484);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinitionUserDefined2496); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionUserDefinedAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1211:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1211:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1212:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2518);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1228:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==15) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1228:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionUserDefined2531); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionUserDefinedAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1232:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1233:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1233:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1234:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2552);
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
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionUserDefined2568); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1262:1: entryRuleVariableDefinitionCollection returns [EObject current=null] : iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF ;
    public final EObject entryRuleVariableDefinitionCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionCollection = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1263:2: (iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1264:2: iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionCollectionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection2606);
            iv_ruleVariableDefinitionCollection=ruleVariableDefinitionCollection();

            state._fsp--;

             current =iv_ruleVariableDefinitionCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionCollection2616); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1271:1: ruleVariableDefinitionCollection returns [EObject current=null] : ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1274:28: ( ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1275:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1275:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1275:2: () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1275:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1276:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionCollectionAccess().getVariableDefinitionCollectionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1281:2: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1281:3: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1281:3: ( (lv_collection_1_0= ruleCollectionID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1282:1: (lv_collection_1_0= ruleCollectionID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1282:1: (lv_collection_1_0= ruleCollectionID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1283:3: lv_collection_1_0= ruleCollectionID
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection2672);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionCollection2684); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionCollectionAccess().getLessThanSignKeyword_1_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1303:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1304:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1304:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1305:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1305:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=20 && LA22_0<=22)||(LA22_0>=35 && LA22_0<=43)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1306:3: lv_type_3_1= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableTypeParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection2707);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1321:8: lv_type_3_2= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableNameParserRuleCall_1_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2726);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionCollection2741); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionCollectionAccess().getGreaterThanSignKeyword_1_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1343:1: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1344:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1344:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1345:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getNameVariableNameParserRuleCall_1_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2762);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1361:3: (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1361:5: otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleVariableDefinitionCollection2776); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionCollectionAccess().getEqualsSignKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1365:1: ( (lv_value_7_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1366:1: (lv_value_7_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1366:1: (lv_value_7_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1367:3: lv_value_7_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getValueListParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleVariableDefinitionCollection2797);
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

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionCollection2809); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1395:1: entryRuleVariableDefinitionBasic returns [EObject current=null] : iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF ;
    public final EObject entryRuleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBasic = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1396:2: (iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1397:2: iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBasicRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic2847);
            iv_ruleVariableDefinitionBasic=ruleVariableDefinitionBasic();

            state._fsp--;

             current =iv_ruleVariableDefinitionBasic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBasic2857); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1404:1: ruleVariableDefinitionBasic returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1407:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1408:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1408:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1408:2: () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1408:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1409:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBasicAccess().getVariableDefinitionBasicAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1414:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1415:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1415:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1416:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic2912);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1432:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1433:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1433:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1434:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic2933);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleVariableDefinitionBasic2945); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionBasicAccess().getEqualsSignKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1454:1: ( (lv_expression_4_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1455:1: (lv_expression_4_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1455:1: (lv_expression_4_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1456:3: lv_expression_4_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getExpressionVariableExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic2966);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1480:1: entryRuleParameterAssignment returns [EObject current=null] : iv_ruleParameterAssignment= ruleParameterAssignment EOF ;
    public final EObject entryRuleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1481:2: (iv_ruleParameterAssignment= ruleParameterAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1482:2: iv_ruleParameterAssignment= ruleParameterAssignment EOF
            {
             newCompositeNode(grammarAccess.getParameterAssignmentRule()); 
            pushFollow(FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment3002);
            iv_ruleParameterAssignment=ruleParameterAssignment();

            state._fsp--;

             current =iv_ruleParameterAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterAssignment3012); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1489:1: ruleParameterAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) ;
    public final EObject ruleParameterAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1492:28: ( ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1493:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1493:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1493:2: ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1493:2: ( (lv_name_0_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1494:1: (lv_name_0_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1494:1: (lv_name_0_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1495:3: lv_name_0_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getNameVariableNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleParameterAssignment3058);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleParameterAssignment3070); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1515:1: ( (lv_value_2_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1516:1: (lv_value_2_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1516:1: (lv_value_2_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1517:3: lv_value_2_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment3091);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1541:1: entryRuleVariableQualifier returns [String current=null] : iv_ruleVariableQualifier= ruleVariableQualifier EOF ;
    public final String entryRuleVariableQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableQualifier = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1542:2: (iv_ruleVariableQualifier= ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1543:2: iv_ruleVariableQualifier= ruleVariableQualifier EOF
            {
             newCompositeNode(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier3128);
            iv_ruleVariableQualifier=ruleVariableQualifier();

            state._fsp--;

             current =iv_ruleVariableQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier3139); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1550:1: ruleVariableQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'observable' ;
    public final AntlrDatatypeRuleToken ruleVariableQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1553:28: (kw= 'observable' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1555:2: kw= 'observable'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleVariableQualifier3176); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1568:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1569:2: (iv_ruleVariableType= ruleVariableType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1570:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType3216);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType3227); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1577:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1580:28: ( (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1581:1: (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1581:1: (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' )
            int alt24=12;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt24=1;
                }
                break;
            case 21:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            case 37:
                {
                alt24=4;
                }
                break;
            case 38:
                {
                alt24=5;
                }
                break;
            case 39:
                {
                alt24=6;
                }
                break;
            case 40:
                {
                alt24=7;
                }
                break;
            case 41:
                {
                alt24=8;
                }
                break;
            case 42:
                {
                alt24=9;
                }
                break;
            case 43:
                {
                alt24=10;
                }
                break;
            case 20:
                {
                alt24=11;
                }
                break;
            case 22:
                {
                alt24=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1582:2: kw= 'MOLECULE'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVariableType3265); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getMOLECULEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1589:2: kw= 'CELL'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleVariableType3284); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCELLKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1596:2: kw= 'RIBOSOME'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVariableType3303); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRIBOSOMEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1603:2: kw= 'PROMOTER'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVariableType3322); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROMOTERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1610:2: kw= 'PROTEIN'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVariableType3341); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROTEINKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1617:2: kw= 'DNA'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVariableType3360); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getDNAKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1624:2: kw= 'RNA'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVariableType3379); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRNAKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1631:2: kw= 'GENE'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVariableType3398); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getGENEKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1638:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVariableType3417); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTEGERKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1645:2: kw= 'RATE'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVariableType3436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRATEKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1652:2: kw= 'PROCESS'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleVariableType3455); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROCESSKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1659:2: kw= 'SYSTEM'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleVariableType3474); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getSYSTEMKeyword_11()); 
                        

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1672:1: entryRuleCollectionID returns [String current=null] : iv_ruleCollectionID= ruleCollectionID EOF ;
    public final String entryRuleCollectionID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionID = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1673:2: (iv_ruleCollectionID= ruleCollectionID EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1674:2: iv_ruleCollectionID= ruleCollectionID EOF
            {
             newCompositeNode(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID3515);
            iv_ruleCollectionID=ruleCollectionID();

            state._fsp--;

             current =iv_ruleCollectionID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID3526); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1681:1: ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LIST' | kw= 'SET' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1684:28: ( (kw= 'LIST' | kw= 'SET' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1685:1: (kw= 'LIST' | kw= 'SET' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1685:1: (kw= 'LIST' | kw= 'SET' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            else if ( (LA25_0==45) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1686:2: kw= 'LIST'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleCollectionID3564); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1693:2: kw= 'SET'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleCollectionID3583); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                        

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1706:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1707:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1708:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment3623);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment3633); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1715:1: ruleVariableAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1718:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1719:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1719:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1719:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1719:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1720:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1725:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1726:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1726:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1727:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment3688);
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleVariableAssignment3700); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1747:1: ( (lv_expression_3_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1748:1: (lv_expression_3_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1748:1: (lv_expression_3_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1749:3: lv_expression_3_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableAssignment3721);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1773:1: entryRuleVariableAssignmentObject returns [EObject current=null] : iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF ;
    public final EObject entryRuleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignmentObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1774:2: (iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1775:2: iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentObjectRule()); 
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject3757);
            iv_ruleVariableAssignmentObject=ruleVariableAssignmentObject();

            state._fsp--;

             current =iv_ruleVariableAssignmentObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentObject3767); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1782:1: ruleVariableAssignmentObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) ;
    public final EObject ruleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1785:28: ( ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1786:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1786:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==29) ) {
                    alt26=2;
                }
                else if ( (LA26_1==EOF||LA26_1==30) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1786:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1786:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1786:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1786:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1787:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariableAssignmentObjectAccess().getVariableAssignmentObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject3818);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1802:5: this_VariableAttribute_2= ruleVariableAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject3846);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1818:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1819:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1820:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression3881);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression3891); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1827:1: ruleVariableExpression returns [EObject current=null] : ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1830:28: ( ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1831:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1831:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1831:2: () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1831:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1832:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1837:2: ( (lv_members_1_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1838:1: (lv_members_1_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1838:1: (lv_members_1_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1839:3: lv_members_1_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression3946);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1855:2: ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=46 && LA27_0<=48)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1856:5: ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression3963);
            	    ruleVariableExpressionOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1863:1: ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1864:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1864:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1865:3: lv_members_3_0= ruleVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression3983);
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
            	    break loop27;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1889:1: entryRuleVariableExpressionObject returns [EObject current=null] : iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF ;
    public final EObject entryRuleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1890:2: (iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1891:2: iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject4021);
            iv_ruleVariableExpressionObject=ruleVariableExpressionObject();

            state._fsp--;

             current =iv_ruleVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionObject4031); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1898:1: ruleVariableExpressionObject returns [EObject current=null] : (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) ;
    public final EObject ruleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicVariableExpressionObject_0 = null;

        EObject this_CompoundVariableExpressionObject_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1901:28: ( (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1902:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1902:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||(LA28_0>=46 && LA28_0<=47)) ) {
                alt28=1;
            }
            else if ( (LA28_0==57) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1903:5: this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getAtomicVariableExpressionObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject4078);
                    this_AtomicVariableExpressionObject_0=ruleAtomicVariableExpressionObject();

                    state._fsp--;

                     
                            current = this_AtomicVariableExpressionObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1913:5: this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getCompoundVariableExpressionObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject4105);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1929:1: entryRuleAtomicVariableExpressionObject returns [EObject current=null] : iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF ;
    public final EObject entryRuleAtomicVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:2: (iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1931:2: iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject4140);
            iv_ruleAtomicVariableExpressionObject=ruleAtomicVariableExpressionObject();

            state._fsp--;

             current =iv_ruleAtomicVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject4150); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1938:1: ruleAtomicVariableExpressionObject returns [EObject current=null] : ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1941:28: ( ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1942:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1942:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            int alt29=6;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1942:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1942:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1942:3: () ( (lv_variable_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1942:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1943:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicVariableExpressionObjectAccess().getAtomicVariableExpressionObjectAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1948:2: ( (lv_variable_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1949:1: (lv_variable_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1949:1: (lv_variable_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1950:3: lv_variable_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getVariableVariableNameParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject4206);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1967:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1967:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1968:1: (lv_attribute_2_0= ruleVariableAttribute )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1968:1: (lv_attribute_2_0= ruleVariableAttribute )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1969:3: lv_attribute_2_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getAttributeVariableAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject4234);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1986:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1986:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1987:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1987:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1988:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getComplexVariableComplexParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject4261);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2005:6: ( (lv_value_4_0= ruleREAL ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2005:6: ( (lv_value_4_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2006:1: (lv_value_4_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2006:1: (lv_value_4_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2007:3: lv_value_4_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getValueREALParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject4288);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2024:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2024:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2025:1: (lv_quantity_5_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2025:1: (lv_quantity_5_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2026:3: lv_quantity_5_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getQuantityQuantityParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject4315);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2043:6: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2043:6: ( (lv_string_6_0= RULE_STRING ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2044:1: (lv_string_6_0= RULE_STRING )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2044:1: (lv_string_6_0= RULE_STRING )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2045:3: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject4338); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2069:1: entryRuleCompoundVariableExpressionObject returns [EObject current=null] : iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF ;
    public final EObject entryRuleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2070:2: (iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2071:2: iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject4379);
            iv_ruleCompoundVariableExpressionObject=ruleCompoundVariableExpressionObject();

            state._fsp--;

             current =iv_ruleCompoundVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject4389); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2078:1: ruleCompoundVariableExpressionObject returns [EObject current=null] : ( () ( (lv_list_1_0= ruleList ) ) ) ;
    public final EObject ruleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2081:28: ( ( () ( (lv_list_1_0= ruleList ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:1: ( () ( (lv_list_1_0= ruleList ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:1: ( () ( (lv_list_1_0= ruleList ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:2: () ( (lv_list_1_0= ruleList ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2083:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompoundVariableExpressionObjectAccess().getCompoundVariableExpressionObjectAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2088:2: ( (lv_list_1_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2089:1: (lv_list_1_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2089:1: (lv_list_1_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2090:3: lv_list_1_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectAccess().getListListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject4444);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2114:1: entryRuleVariableExpressionOperator returns [String current=null] : iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF ;
    public final String entryRuleVariableExpressionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableExpressionOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2115:2: (iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2116:2: iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator4481);
            iv_ruleVariableExpressionOperator=ruleVariableExpressionOperator();

            state._fsp--;

             current =iv_ruleVariableExpressionOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator4492); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2123:1: ruleVariableExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleVariableExpressionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2126:28: ( (kw= '+' | kw= '-' | kw= '|' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2127:1: (kw= '+' | kw= '-' | kw= '|' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2127:1: (kw= '+' | kw= '-' | kw= '|' )
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2128:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVariableExpressionOperator4530); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2135:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleVariableExpressionOperator4549); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2142:2: kw= '|'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleVariableExpressionOperator4568); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2155:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2156:2: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2157:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition4608);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition4618); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2164:1: ruleRuleDefinition returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2167:28: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2168:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2168:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2168:2: () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2168:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2169:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleRuleDefinition4664); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2178:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2179:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2179:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2180:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRuleDefinition4685);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleRuleDefinition4697); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2200:1: ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2200:2: ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2200:2: ( (lv_lhs_4_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2201:1: (lv_lhs_4_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2201:1: (lv_lhs_4_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2202:3: lv_lhs_4_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition4719);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2218:2: (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==46) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2218:4: otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleRuleDefinition4732); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2222:1: ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2223:1: (lv_lhs_6_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2223:1: (lv_lhs_6_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2224:3: lv_lhs_6_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition4753);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2240:6: (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            else if ( (LA33_0==51) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2240:8: otherlv_7= '->'
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleRuleDefinition4770); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2245:6: ( (lv_reversible_8_0= '<->' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2245:6: ( (lv_reversible_8_0= '<->' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2246:1: (lv_reversible_8_0= '<->' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2246:1: (lv_reversible_8_0= '<->' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2247:3: lv_reversible_8_0= '<->'
                    {
                    lv_reversible_8_0=(Token)match(input,51,FOLLOW_51_in_ruleRuleDefinition4794); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2260:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2260:4: ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2260:4: ( (lv_rhs_9_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2261:1: (lv_rhs_9_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2261:1: (lv_rhs_9_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2262:3: lv_rhs_9_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition4830);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2278:2: (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==46) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2278:4: otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleRuleDefinition4843); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2282:1: ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2283:1: (lv_rhs_11_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2283:1: (lv_rhs_11_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2284:3: lv_rhs_11_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition4864);
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
                    	    break loop34;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:1: entryRuleRuleObject returns [EObject current=null] : iv_ruleRuleObject= ruleRuleObject EOF ;
    public final EObject entryRuleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2309:2: (iv_ruleRuleObject= ruleRuleObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2310:2: iv_ruleRuleObject= ruleRuleObject EOF
            {
             newCompositeNode(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject4904);
            iv_ruleRuleObject=ruleRuleObject();

            state._fsp--;

             current =iv_ruleRuleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject4914); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2317:1: ruleRuleObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) ;
    public final EObject ruleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableComplex_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2320:28: ( ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2321:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2321:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==28) ) {
                    alt36=2;
                }
                else if ( (LA36_1==EOF||LA36_1==RULE_ID||LA36_1==18||(LA36_1>=20 && LA36_1<=22)||(LA36_1>=34 && LA36_1<=46)||(LA36_1>=49 && LA36_1<=52)||LA36_1==54||LA36_1==56) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2321:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2321:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2321:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2321:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2322:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getRuleObjectAccess().getRuleObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleRuleObject4965);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2337:5: this_VariableComplex_2= ruleVariableComplex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableComplexParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleRuleObject4993);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2353:1: entryRuleDeviceDefinition returns [EObject current=null] : iv_ruleDeviceDefinition= ruleDeviceDefinition EOF ;
    public final EObject entryRuleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2354:2: (iv_ruleDeviceDefinition= ruleDeviceDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2355:2: iv_ruleDeviceDefinition= ruleDeviceDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeviceDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition5028);
            iv_ruleDeviceDefinition=ruleDeviceDefinition();

            state._fsp--;

             current =iv_ruleDeviceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDefinition5038); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2362:1: ruleDeviceDefinition returns [EObject current=null] : ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2365:28: ( ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:2: () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )? otherlv_15= ')' otherlv_16= '{' ( (lv_members_17_0= ruleDeviceMembers ) )* otherlv_18= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2367:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleDeviceDefinition5084); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2376:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2377:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2377:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2378:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeviceDefinition5105);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDeviceDefinition5117); 

                	newLeafNode(otherlv_3, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleDeviceDefinition5129); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceDefinitionAccess().getNewKeyword_4());
                
            otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleDeviceDefinition5141); 

                	newLeafNode(otherlv_5, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_5());
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDeviceDefinition5153); 

                	newLeafNode(otherlv_6, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleDeviceDefinition5165); 

                	newLeafNode(otherlv_7, grammarAccess.getDeviceDefinitionAccess().getPartsKeyword_7());
                
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleDeviceDefinition5177); 

                	newLeafNode(otherlv_8, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2418:1: ( (lv_parts_9_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2419:1: (lv_parts_9_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2419:1: (lv_parts_9_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2420:3: lv_parts_9_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getPartsListParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition5198);
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

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDeviceDefinition5210); 

                	newLeafNode(otherlv_10, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleDeviceDefinition5222); 

                	newLeafNode(otherlv_11, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_11());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2444:1: ( ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2444:2: ( (lv_parameters_12_0= ruleParameterAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2444:2: ( (lv_parameters_12_0= ruleParameterAssignment ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2445:1: (lv_parameters_12_0= ruleParameterAssignment )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2445:1: (lv_parameters_12_0= ruleParameterAssignment )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2446:3: lv_parameters_12_0= ruleParameterAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getParametersParameterAssignmentParserRuleCall_12_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5244);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2462:2: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2462:4: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameterAssignment ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleDeviceDefinition5257); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_12_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2466:1: ( (lv_parameters_14_0= ruleParameterAssignment ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2467:1: (lv_parameters_14_0= ruleParameterAssignment )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2467:1: (lv_parameters_14_0= ruleParameterAssignment )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2468:3: lv_parameters_14_0= ruleParameterAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getParametersParameterAssignmentParserRuleCall_12_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5278);
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
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleDeviceDefinition5294); 

                	newLeafNode(otherlv_15, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_13());
                
            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition5306); 

                	newLeafNode(otherlv_16, grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_14());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2492:1: ( (lv_members_17_0= ruleDeviceMembers ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||(LA39_0>=20 && LA39_0<=22)||(LA39_0>=34 && LA39_0<=45)||LA39_0==54||LA39_0==56) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2493:1: (lv_members_17_0= ruleDeviceMembers )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2493:1: (lv_members_17_0= ruleDeviceMembers )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2494:3: lv_members_17_0= ruleDeviceMembers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getMembersDeviceMembersParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition5327);
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
            	    break loop39;
                }
            } while (true);

            otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition5340); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2522:1: entryRuleDeviceMembers returns [EObject current=null] : iv_ruleDeviceMembers= ruleDeviceMembers EOF ;
    public final EObject entryRuleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceMembers = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2523:2: (iv_ruleDeviceMembers= ruleDeviceMembers EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2524:2: iv_ruleDeviceMembers= ruleDeviceMembers EOF
            {
             newCompositeNode(grammarAccess.getDeviceMembersRule()); 
            pushFollow(FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5376);
            iv_ruleDeviceMembers=ruleDeviceMembers();

            state._fsp--;

             current =iv_ruleDeviceMembers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceMembers5386); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2531:1: ruleDeviceMembers returns [EObject current=null] : (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition ) ;
    public final EObject ruleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;

        EObject this_PropertyDefinition_1 = null;

        EObject this_ATGCDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2534:28: ( (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2535:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2535:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition )
            int alt40=3;
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
                {
                alt40=1;
                }
                break;
            case 56:
                {
                alt40=2;
                }
                break;
            case 54:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2536:5: this_VariableDefinition_0= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5433);
                    this_VariableDefinition_0=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2546:5: this_PropertyDefinition_1= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getPropertyDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5460);
                    this_PropertyDefinition_1=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2556:5: this_ATGCDefinition_2= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getATGCDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5487);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2572:1: entryRuleATGCDefinition returns [EObject current=null] : iv_ruleATGCDefinition= ruleATGCDefinition EOF ;
    public final EObject entryRuleATGCDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATGCDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2573:2: (iv_ruleATGCDefinition= ruleATGCDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2574:2: iv_ruleATGCDefinition= ruleATGCDefinition EOF
            {
             newCompositeNode(grammarAccess.getATGCDefinitionRule()); 
            pushFollow(FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition5522);
            iv_ruleATGCDefinition=ruleATGCDefinition();

            state._fsp--;

             current =iv_ruleATGCDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCDefinition5532); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2581:1: ruleATGCDefinition returns [EObject current=null] : ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2584:28: ( ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2585:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2585:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2585:2: () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2585:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2586:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleATGCDefinition5578); 

                	newLeafNode(otherlv_1, grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2595:1: ( (lv_command_2_0= ruleATGCCommand ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2596:1: (lv_command_2_0= ruleATGCCommand )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2596:1: (lv_command_2_0= ruleATGCCommand )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2597:3: lv_command_2_0= ruleATGCCommand
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getCommandATGCCommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATGCCommand_in_ruleATGCDefinition5599);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleATGCDefinition5611); 

                	newLeafNode(otherlv_3, grammarAccess.getATGCDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2617:1: ( (lv_arguments_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2618:1: (lv_arguments_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2618:1: (lv_arguments_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2619:3: lv_arguments_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition5632);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2635:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==15) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2635:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleATGCDefinition5645); 

            	        	newLeafNode(otherlv_5, grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2639:1: ( (lv_arguments_6_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2640:1: (lv_arguments_6_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2640:1: (lv_arguments_6_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2641:3: lv_arguments_6_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition5666);
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
            	    break loop41;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2665:1: entryRuleATGCCommand returns [String current=null] : iv_ruleATGCCommand= ruleATGCCommand EOF ;
    public final String entryRuleATGCCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATGCCommand = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2666:2: (iv_ruleATGCCommand= ruleATGCCommand EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2667:2: iv_ruleATGCCommand= ruleATGCCommand EOF
            {
             newCompositeNode(grammarAccess.getATGCCommandRule()); 
            pushFollow(FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand5705);
            iv_ruleATGCCommand=ruleATGCCommand();

            state._fsp--;

             current =iv_ruleATGCCommand.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCCommand5716); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2674:1: ruleATGCCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ARRANGE' ;
    public final AntlrDatatypeRuleToken ruleATGCCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2677:28: (kw= 'ARRANGE' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2679:2: kw= 'ARRANGE'
            {
            kw=(Token)match(input,55,FOLLOW_55_in_ruleATGCCommand5753); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2692:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2693:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2694:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition5792);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition5802); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2701:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2704:28: ( ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2705:1: ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2705:1: ( () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2705:2: () otherlv_1= 'VERIFY' ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2705:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2706:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_rulePropertyDefinition5848); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getVERIFYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2715:1: ( (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) | (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==57) ) {
                alt44=1;
            }
            else if ( (LA44_0==59) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2715:2: (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2715:2: (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2715:4: otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) )
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_rulePropertyDefinition5862); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyDefinitionAccess().getLeftSquareBracketKeyword_2_0_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2719:1: ( (lv_property_3_0= ruleProperty ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2720:1: (lv_property_3_0= ruleProperty )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2720:1: (lv_property_3_0= ruleProperty )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2721:3: lv_property_3_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyPropertyParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_rulePropertyDefinition5883);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2737:2: ( ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==48||(LA42_0>=90 && LA42_0<=92)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2738:5: ruleBooleanOperator ( (lv_property_5_0= ruleProperty ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getBooleanOperatorParserRuleCall_2_0_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleBooleanOperator_in_rulePropertyDefinition5900);
                    	    ruleBooleanOperator();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2745:1: ( (lv_property_5_0= ruleProperty ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2746:1: (lv_property_5_0= ruleProperty )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2746:1: (lv_property_5_0= ruleProperty )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2747:3: lv_property_5_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyPropertyParserRuleCall_2_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_rulePropertyDefinition5920);
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
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,58,FOLLOW_58_in_rulePropertyDefinition5934); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getRightSquareBracketKeyword_2_0_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2767:1: ( (lv_condition_7_0= rulePropertyCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2768:1: (lv_condition_7_0= rulePropertyCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2768:1: (lv_condition_7_0= rulePropertyCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2769:3: lv_condition_7_0= rulePropertyCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getConditionPropertyConditionParserRuleCall_2_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyCondition_in_rulePropertyDefinition5955);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2786:6: (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2786:6: (otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2786:8: otherlv_8= 'EXPECTED' otherlv_9= '[' ( (lv_name_10_0= ruleVariableName ) ) otherlv_11= ']' otherlv_12= 'AT TIME INSTANT' ( (lv_time_13_0= ruleQuantity ) ) otherlv_14= 'IS' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_59_in_rulePropertyDefinition5975); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyDefinitionAccess().getEXPECTEDKeyword_2_1_0());
                        
                    otherlv_9=(Token)match(input,57,FOLLOW_57_in_rulePropertyDefinition5987); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getLeftSquareBracketKeyword_2_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2794:1: ( (lv_name_10_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2795:1: (lv_name_10_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2795:1: (lv_name_10_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2796:3: lv_name_10_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameVariableNameParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_rulePropertyDefinition6008);
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

                    otherlv_11=(Token)match(input,58,FOLLOW_58_in_rulePropertyDefinition6020); 

                        	newLeafNode(otherlv_11, grammarAccess.getPropertyDefinitionAccess().getRightSquareBracketKeyword_2_1_3());
                        
                    otherlv_12=(Token)match(input,60,FOLLOW_60_in_rulePropertyDefinition6032); 

                        	newLeafNode(otherlv_12, grammarAccess.getPropertyDefinitionAccess().getATTIMEINSTANTKeyword_2_1_4());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2820:1: ( (lv_time_13_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2821:1: (lv_time_13_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2821:1: (lv_time_13_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2822:3: lv_time_13_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTimeQuantityParserRuleCall_2_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_rulePropertyDefinition6053);
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

                    otherlv_14=(Token)match(input,61,FOLLOW_61_in_rulePropertyDefinition6065); 

                        	newLeafNode(otherlv_14, grammarAccess.getPropertyDefinitionAccess().getISKeyword_2_1_6());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2842:1: ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) ) | otherlv_17= '?' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=32 && LA43_0<=33)||(LA43_0>=86 && LA43_0<=89)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==62) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2842:2: ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2842:2: ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2842:3: ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_concentration_16_0= ruleQuantity ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2842:3: ( (lv_operator_15_0= ruleRelationalOperator ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2843:1: (lv_operator_15_0= ruleRelationalOperator )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2843:1: (lv_operator_15_0= ruleRelationalOperator )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2844:3: lv_operator_15_0= ruleRelationalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getOperatorRelationalOperatorParserRuleCall_2_1_7_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelationalOperator_in_rulePropertyDefinition6088);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2860:2: ( (lv_concentration_16_0= ruleQuantity ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2861:1: (lv_concentration_16_0= ruleQuantity )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2861:1: (lv_concentration_16_0= ruleQuantity )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2862:3: lv_concentration_16_0= ruleQuantity
                            {
                             
                            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getConcentrationQuantityParserRuleCall_2_1_7_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQuantity_in_rulePropertyDefinition6109);
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2879:7: otherlv_17= '?'
                            {
                            otherlv_17=(Token)match(input,62,FOLLOW_62_in_rulePropertyDefinition6128); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2891:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2892:2: (iv_ruleProperty= ruleProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2893:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty6167);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty6177); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2900:1: ruleProperty returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_lhs_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2903:28: ( ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2904:1: ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2904:1: ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2904:2: () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2904:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2905:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2910:2: ( (lv_lhs_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2911:1: (lv_lhs_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2911:1: (lv_lhs_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2912:3: lv_lhs_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getLhsVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleProperty6232);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2928:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2929:1: (lv_operator_2_0= ruleRelationalOperator )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2929:1: (lv_operator_2_0= ruleRelationalOperator )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2930:3: lv_operator_2_0= ruleRelationalOperator
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getOperatorRelationalOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleProperty6253);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2946:2: ( (lv_rhs_3_0= ruleQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2947:1: (lv_rhs_3_0= ruleQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2947:1: (lv_rhs_3_0= ruleQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2948:3: lv_rhs_3_0= ruleQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getRhsQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantity_in_ruleProperty6274);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2972:1: entryRulePropertyCondition returns [EObject current=null] : iv_rulePropertyCondition= rulePropertyCondition EOF ;
    public final EObject entryRulePropertyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2973:2: (iv_rulePropertyCondition= rulePropertyCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2974:2: iv_rulePropertyCondition= rulePropertyCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyConditionRule()); 
            pushFollow(FOLLOW_rulePropertyCondition_in_entryRulePropertyCondition6310);
            iv_rulePropertyCondition=rulePropertyCondition();

            state._fsp--;

             current =iv_rulePropertyCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCondition6320); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2981:1: rulePropertyCondition returns [EObject current=null] : ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2984:28: ( ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2985:1: ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2985:1: ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2985:2: () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' ) (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )? (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2985:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2986:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyConditionAccess().getPropertyConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2991:2: (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' | otherlv_4= 'EVENTUALLY HOLDS' | otherlv_5= 'SOMETIMES HOLDS' )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt45=1;
                }
                break;
            case 64:
                {
                alt45=2;
                }
                break;
            case 65:
                {
                alt45=3;
                }
                break;
            case 66:
                {
                alt45=4;
                }
                break;
            case 67:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2991:4: otherlv_1= 'WILL HOLD'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_63_in_rulePropertyCondition6367); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyConditionAccess().getWILLHOLDKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2996:7: otherlv_2= 'NEVER HOLDS'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_rulePropertyCondition6385); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyConditionAccess().getNEVERHOLDSKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3001:7: otherlv_3= 'ALWAYS HOLDS'
                    {
                    otherlv_3=(Token)match(input,65,FOLLOW_65_in_rulePropertyCondition6403); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyConditionAccess().getALWAYSHOLDSKeyword_1_2());
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3006:7: otherlv_4= 'EVENTUALLY HOLDS'
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_rulePropertyCondition6421); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyConditionAccess().getEVENTUALLYHOLDSKeyword_1_3());
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3011:7: otherlv_5= 'SOMETIMES HOLDS'
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_67_in_rulePropertyCondition6439); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertyConditionAccess().getSOMETIMESHOLDSKeyword_1_4());
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3015:2: (otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==68) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3015:4: otherlv_6= 'WITHIN TIME BOUND' otherlv_7= '[' ( (lv_lowerBound_8_0= ruleQuantity ) ) otherlv_9= ',' ( (lv_upperBounds_10_0= ruleQuantity ) ) otherlv_11= ']' (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )?
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_68_in_rulePropertyCondition6453); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyConditionAccess().getWITHINTIMEBOUNDKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_rulePropertyCondition6465); 

                        	newLeafNode(otherlv_7, grammarAccess.getPropertyConditionAccess().getLeftSquareBracketKeyword_2_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3023:1: ( (lv_lowerBound_8_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3024:1: (lv_lowerBound_8_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3024:1: (lv_lowerBound_8_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3025:3: lv_lowerBound_8_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getLowerBoundQuantityParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_rulePropertyCondition6486);
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

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_rulePropertyCondition6498); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyConditionAccess().getCommaKeyword_2_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3045:1: ( (lv_upperBounds_10_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3046:1: (lv_upperBounds_10_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3046:1: (lv_upperBounds_10_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3047:3: lv_upperBounds_10_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getUpperBoundsQuantityParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_rulePropertyCondition6519);
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

                    otherlv_11=(Token)match(input,58,FOLLOW_58_in_rulePropertyCondition6531); 

                        	newLeafNode(otherlv_11, grammarAccess.getPropertyConditionAccess().getRightSquareBracketKeyword_2_5());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3067:1: (otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==69) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3067:3: otherlv_12= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' )
                            {
                            otherlv_12=(Token)match(input,69,FOLLOW_69_in_rulePropertyCondition6544); 

                                	newLeafNode(otherlv_12, grammarAccess.getPropertyConditionAccess().getWITHPROBABILITYBOUNDKeyword_2_6_0());
                                
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3071:1: ( ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) ) | otherlv_15= '?' )
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( ((LA46_0>=32 && LA46_0<=33)||(LA46_0>=86 && LA46_0<=89)) ) {
                                alt46=1;
                            }
                            else if ( (LA46_0==62) ) {
                                alt46=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 46, 0, input);

                                throw nvae;
                            }
                            switch (alt46) {
                                case 1 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3071:2: ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3071:2: ( ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3071:3: ( (lv_operator_13_0= ruleRelationalOperator ) ) ( (lv_probability_14_0= ruleREAL ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3071:3: ( (lv_operator_13_0= ruleRelationalOperator ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3072:1: (lv_operator_13_0= ruleRelationalOperator )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3072:1: (lv_operator_13_0= ruleRelationalOperator )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3073:3: lv_operator_13_0= ruleRelationalOperator
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getOperatorRelationalOperatorParserRuleCall_2_6_1_0_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleRelationalOperator_in_rulePropertyCondition6567);
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

                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3089:2: ( (lv_probability_14_0= ruleREAL ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3090:1: (lv_probability_14_0= ruleREAL )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3090:1: (lv_probability_14_0= ruleREAL )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3091:3: lv_probability_14_0= ruleREAL
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getProbabilityREALParserRuleCall_2_6_1_0_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleREAL_in_rulePropertyCondition6588);
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
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3108:7: otherlv_15= '?'
                                    {
                                    otherlv_15=(Token)match(input,62,FOLLOW_62_in_rulePropertyCondition6607); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3112:6: (otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==70) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3112:8: otherlv_16= 'GIVEN' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_16=(Token)match(input,70,FOLLOW_70_in_rulePropertyCondition6625); 

                        	newLeafNode(otherlv_16, grammarAccess.getPropertyConditionAccess().getGIVENKeyword_3_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3116:1: ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3117:1: (lv_initialConditions_17_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3117:1: (lv_initialConditions_17_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3118:3: lv_initialConditions_17_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6646);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3134:2: (otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==15) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3134:4: otherlv_18= ',' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_15_in_rulePropertyCondition6659); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getPropertyConditionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3138:1: ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3139:1: (lv_initialConditions_19_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3139:1: (lv_initialConditions_19_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3140:3: lv_initialConditions_19_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6680);
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
                    	    break loop49;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3164:1: entryRulePropertyInitialCondition returns [EObject current=null] : iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF ;
    public final EObject entryRulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInitialCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3165:2: (iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3166:2: iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyInitialConditionRule()); 
            pushFollow(FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition6720);
            iv_rulePropertyInitialCondition=rulePropertyInitialCondition();

            state._fsp--;

             current =iv_rulePropertyInitialCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInitialCondition6730); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3173:1: rulePropertyInitialCondition returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) ) ;
    public final EObject rulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3176:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3177:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3177:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3177:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3177:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3178:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyInitialConditionAccess().getPropertyInitialConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3183:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3184:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3184:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3185:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition6785);
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePropertyInitialCondition6797); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyInitialConditionAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3205:1: ( (lv_value_3_0= ruleQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3206:1: (lv_value_3_0= ruleQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3206:1: (lv_value_3_0= ruleQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3207:3: lv_value_3_0= ruleQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getValueQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantity_in_rulePropertyInitialCondition6818);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3231:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3232:2: (iv_ruleREAL= ruleREAL EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3233:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL6855);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL6866); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3240:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decimal_0 = null;

        AntlrDatatypeRuleToken this_DecimalExp_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3243:28: ( (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3244:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3244:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            int alt51=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 29:
                        {
                        int LA51_4 = input.LA(4);

                        if ( (LA51_4==RULE_INT) ) {
                            int LA51_7 = input.LA(5);

                            if ( ((LA51_7>=71 && LA51_7<=72)) ) {
                                alt51=2;
                            }
                            else if ( (LA51_7==EOF||LA51_7==RULE_ID||(LA51_7>=15 && LA51_7<=16)||LA51_7==18||(LA51_7>=20 && LA51_7<=22)||(LA51_7>=34 && LA51_7<=49)||LA51_7==52||LA51_7==54||LA51_7==56||LA51_7==58||LA51_7==70||(LA51_7>=73 && LA51_7<=85)) ) {
                                alt51=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 4, input);

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
                    case 52:
                    case 54:
                    case 56:
                    case 58:
                    case 70:
                    case 73:
                    case 74:
                    case 75:
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
                        {
                        alt51=1;
                        }
                        break;
                    case 71:
                    case 72:
                        {
                        alt51=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 29:
                        {
                        int LA51_4 = input.LA(4);

                        if ( (LA51_4==RULE_INT) ) {
                            int LA51_7 = input.LA(5);

                            if ( ((LA51_7>=71 && LA51_7<=72)) ) {
                                alt51=2;
                            }
                            else if ( (LA51_7==EOF||LA51_7==RULE_ID||(LA51_7>=15 && LA51_7<=16)||LA51_7==18||(LA51_7>=20 && LA51_7<=22)||(LA51_7>=34 && LA51_7<=49)||LA51_7==52||LA51_7==54||LA51_7==56||LA51_7==58||LA51_7==70||(LA51_7>=73 && LA51_7<=85)) ) {
                                alt51=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 4, input);

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
                    case 52:
                    case 54:
                    case 56:
                    case 58:
                    case 70:
                    case 73:
                    case 74:
                    case 75:
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
                        {
                        alt51=1;
                        }
                        break;
                    case 71:
                    case 72:
                        {
                        alt51=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA51_4 = input.LA(3);

                    if ( (LA51_4==RULE_INT) ) {
                        int LA51_7 = input.LA(4);

                        if ( ((LA51_7>=71 && LA51_7<=72)) ) {
                            alt51=2;
                        }
                        else if ( (LA51_7==EOF||LA51_7==RULE_ID||(LA51_7>=15 && LA51_7<=16)||LA51_7==18||(LA51_7>=20 && LA51_7<=22)||(LA51_7>=34 && LA51_7<=49)||LA51_7==52||LA51_7==54||LA51_7==56||LA51_7==58||LA51_7==70||(LA51_7>=73 && LA51_7<=85)) ) {
                            alt51=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 4, input);

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
                case 52:
                case 54:
                case 56:
                case 58:
                case 70:
                case 73:
                case 74:
                case 75:
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
                    {
                    alt51=1;
                    }
                    break;
                case 71:
                case 72:
                    {
                    alt51=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3245:5: this_Decimal_0= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecimal_in_ruleREAL6913);
                    this_Decimal_0=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3257:5: this_DecimalExp_1= ruleDecimalExp
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDecimalExp_in_ruleREAL6946);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3275:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3279:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3280:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal6998);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal7009); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3290:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3294:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3295:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3295:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3295:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3295:2: (kw= '+' | kw= '-' )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            else if ( (LA52_0==47) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3296:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleDecimal7052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3303:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleDecimal7071); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal7088); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3315:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3316:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleDecimal7107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal7122); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3339:1: entryRuleDecimalExp returns [String current=null] : iv_ruleDecimalExp= ruleDecimalExp EOF ;
    public final String entryRuleDecimalExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimalExp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3343:2: (iv_ruleDecimalExp= ruleDecimalExp EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3344:2: iv_ruleDecimalExp= ruleDecimalExp EOF
            {
             newCompositeNode(grammarAccess.getDecimalExpRule()); 
            pushFollow(FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp7180);
            iv_ruleDecimalExp=ruleDecimalExp();

            state._fsp--;

             current =iv_ruleDecimalExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalExp7191); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3354:1: ruleDecimalExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimalExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_9=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3358:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3359:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3359:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3359:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3359:2: (kw= '+' | kw= '-' )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) ) {
                alt54=1;
            }
            else if ( (LA54_0==47) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3360:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleDecimalExp7234); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3367:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleDecimalExp7253); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp7270); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3379:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3380:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleDecimalExp7289); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp7304); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3392:3: (kw= 'E' | kw= 'e' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==71) ) {
                alt56=1;
            }
            else if ( (LA56_0==72) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3393:2: kw= 'E'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleDecimalExp7325); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3400:2: kw= 'e'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleDecimalExp7344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3405:2: (kw= '+' | kw= '-' )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            else if ( (LA57_0==47) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3406:2: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleDecimalExp7359); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3413:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleDecimalExp7378); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 
                        

                    }
                    break;

            }

            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp7395); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3436:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3437:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3438:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_ruleQuantity_in_entryRuleQuantity7444);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantity7454); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3445:1: ruleQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_units_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3448:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3449:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3449:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3449:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3449:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3450:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityAccess().getQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3455:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3456:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3456:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3457:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleQuantity7509);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3473:2: ( (lv_units_2_0= ruleUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3474:1: (lv_units_2_0= ruleUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3474:1: (lv_units_2_0= ruleUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3475:3: lv_units_2_0= ruleUnit
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getUnitsUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnit_in_ruleQuantity7530);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3499:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3500:2: (iv_ruleUnit= ruleUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3501:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit7567);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit7578); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3508:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3511:28: ( (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3512:1: (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3512:1: (kw= 's' | kw= 'min' | kw= 'mins' | kw= 's^-1' | kw= 'min^-1' | kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            int alt58=13;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt58=1;
                }
                break;
            case 74:
                {
                alt58=2;
                }
                break;
            case 75:
                {
                alt58=3;
                }
                break;
            case 76:
                {
                alt58=4;
                }
                break;
            case 77:
                {
                alt58=5;
                }
                break;
            case 78:
                {
                alt58=6;
                }
                break;
            case 79:
                {
                alt58=7;
                }
                break;
            case 80:
                {
                alt58=8;
                }
                break;
            case 81:
                {
                alt58=9;
                }
                break;
            case 82:
                {
                alt58=10;
                }
                break;
            case 83:
                {
                alt58=11;
                }
                break;
            case 84:
                {
                alt58=12;
                }
                break;
            case 85:
                {
                alt58=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3513:2: kw= 's'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleUnit7616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3520:2: kw= 'min'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleUnit7635); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMinKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3527:2: kw= 'mins'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleUnit7654); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMinsKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3534:2: kw= 's^-1'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleUnit7673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getS1Keyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3541:2: kw= 'min^-1'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleUnit7692); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMin1Keyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3548:2: kw= 'M'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleUnit7711); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3555:2: kw= 'mM'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleUnit7730); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMMKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3562:2: kw= 'uM'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleUnit7749); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getUMKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3569:2: kw= 'nM'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleUnit7768); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getNMKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3576:2: kw= 'pM'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleUnit7787); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getPMKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3583:2: kw= 'fM'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleUnit7806); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getFMKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3590:2: kw= 'molecule'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleUnit7825); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitAccess().getMoleculeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3597:2: kw= 'molecules'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleUnit7844); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3610:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3611:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3612:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator7885);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator7896); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3619:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3622:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3623:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3623:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt59=6;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt59=1;
                }
                break;
            case 87:
                {
                alt59=2;
                }
                break;
            case 32:
                {
                alt59=3;
                }
                break;
            case 33:
                {
                alt59=4;
                }
                break;
            case 88:
                {
                alt59=5;
                }
                break;
            case 89:
                {
                alt59=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3624:2: kw= '=='
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleRelationalOperator7934); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3631:2: kw= '!='
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleRelationalOperator7953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3638:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleRelationalOperator7972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3645:2: kw= '>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleRelationalOperator7991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3652:2: kw= '<='
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleRelationalOperator8010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3659:2: kw= '>='
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator8029); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3672:1: entryRuleBooleanOperator returns [String current=null] : iv_ruleBooleanOperator= ruleBooleanOperator EOF ;
    public final String entryRuleBooleanOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3673:2: (iv_ruleBooleanOperator= ruleBooleanOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:2: iv_ruleBooleanOperator= ruleBooleanOperator EOF
            {
             newCompositeNode(grammarAccess.getBooleanOperatorRule()); 
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator8070);
            iv_ruleBooleanOperator=ruleBooleanOperator();

            state._fsp--;

             current =iv_ruleBooleanOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator8081); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3681:1: ruleBooleanOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) ) ;
    public final AntlrDatatypeRuleToken ruleBooleanOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3684:28: ( (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3685:1: (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3685:1: (kw= '&' | kw= '|' | kw= 'AND' | kw= 'OR' | (kw= 'AND' kw= 'NOT' ) | (kw= 'OR' kw= 'NOT' ) )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt60=1;
                }
                break;
            case 48:
                {
                alt60=2;
                }
                break;
            case 91:
                {
                int LA60_3 = input.LA(2);

                if ( (LA60_3==93) ) {
                    alt60=5;
                }
                else if ( (LA60_3==EOF||LA60_3==RULE_ID) ) {
                    alt60=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 3, input);

                    throw nvae;
                }
                }
                break;
            case 92:
                {
                int LA60_4 = input.LA(2);

                if ( (LA60_4==93) ) {
                    alt60=6;
                }
                else if ( (LA60_4==EOF||LA60_4==RULE_ID) ) {
                    alt60=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3686:2: kw= '&'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleBooleanOperator8119); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getAmpersandKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3693:2: kw= '|'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleBooleanOperator8138); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getVerticalLineKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3700:2: kw= 'AND'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleBooleanOperator8157); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getANDKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3707:2: kw= 'OR'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleBooleanOperator8176); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getORKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3713:6: (kw= 'AND' kw= 'NOT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3713:6: (kw= 'AND' kw= 'NOT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3714:2: kw= 'AND' kw= 'NOT'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleBooleanOperator8196); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getANDKeyword_4_0()); 
                        
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleBooleanOperator8209); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getNOTKeyword_4_1()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3726:6: (kw= 'OR' kw= 'NOT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3726:6: (kw= 'OR' kw= 'NOT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3727:2: kw= 'OR' kw= 'NOT'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleBooleanOperator8230); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getORKeyword_5_0()); 
                        
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleBooleanOperator8243); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3746:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3747:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3748:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8285);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8296); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3755:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3758:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3759:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3759:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3760:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8343);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3770:1: (kw= '.*' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==94) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3771:2: kw= '.*'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleQualifiedNameWithWildcard8362); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3784:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3785:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3786:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8405);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8416); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3793:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3796:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3797:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3797:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3797:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8456); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3804:1: (kw= '.' this_ID_2= RULE_ID )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==29) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3805:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedName8475); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8490); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3825:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3826:2: (iv_ruleList= ruleList EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3827:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList8537);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList8547); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3834:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3837:28: ( ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3838:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3838:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3838:2: () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3838:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3839:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListAccess().getListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleList8593); 

                	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3848:1: ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3849:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3849:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3850:3: lv_entries_2_0= ruleAtomicVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8614);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3866:2: (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==15) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3866:4: otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleList8627); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_3_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3870:1: ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3871:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3871:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3872:3: lv_entries_4_0= ruleAtomicVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8648);
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
            	    break loop63;
                }
            } while (true);

            otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleList8662); 

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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA14_eotS =
        "\23\uffff";
    static final String DFA14_eofS =
        "\17\uffff\1\21\3\uffff";
    static final String DFA14_minS =
        "\15\4\2\uffff\2\4\2\uffff";
    static final String DFA14_maxS =
        "\1\55\14\4\2\uffff\1\70\1\71\2\uffff";
    static final String DFA14_acceptS =
        "\15\uffff\1\2\1\3\2\uffff\1\1\1\4";
    static final String DFA14_specialS =
        "\23\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\15\17\uffff\1\13\1\2\1\14\14\uffff\1\1\1\3\1\4\1\5\1\6\1"+
            "\7\1\10\1\11\1\12\2\16",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "",
            "",
            "\1\21\15\uffff\1\21\1\uffff\3\21\7\uffff\1\20\3\uffff\14\21"+
            "\3\uffff\1\21\2\uffff\1\21\1\uffff\1\21\1\uffff\1\21",
            "\3\22\30\uffff\1\21\16\uffff\2\22\11\uffff\1\22",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "898:1: (lv_definition_2_1= ruleVariableDefinitionBuiltIn | lv_definition_2_2= ruleVariableDefinitionUserDefined | lv_definition_2_3= ruleVariableDefinitionCollection | lv_definition_2_4= ruleVariableDefinitionBasic )";
        }
    }
    static final String DFA29_eotS =
        "\22\uffff";
    static final String DFA29_eofS =
        "\1\uffff\1\10\2\uffff\1\14\11\uffff\1\14\2\uffff\1\14";
    static final String DFA29_minS =
        "\2\4\2\6\1\4\4\uffff\3\6\2\uffff\1\4\2\6\1\4";
    static final String DFA29_maxS =
        "\1\57\1\72\2\6\1\125\4\uffff\1\6\2\57\2\uffff\1\125\2\6\1\125";
    static final String DFA29_acceptS =
        "\5\uffff\1\6\1\3\1\2\1\1\3\uffff\1\4\1\5\4\uffff";
    static final String DFA29_specialS =
        "\22\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\5\1\4\47\uffff\1\2\1\3",
            "\1\10\12\uffff\2\10\1\uffff\1\10\1\uffff\3\10\5\uffff\1\6\1"+
            "\7\4\uffff\20\10\2\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\1\10",
            "\1\4",
            "\1\4",
            "\1\14\12\uffff\2\14\1\uffff\1\14\1\uffff\3\14\6\uffff\1\11"+
            "\4\uffff\20\14\2\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\uffff"+
            "\1\14\14\uffff\1\12\1\13\15\15",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\21\47\uffff\1\17\1\20",
            "\1\21\47\uffff\1\17\1\20",
            "",
            "",
            "\1\14\12\uffff\2\14\1\uffff\1\14\1\uffff\3\14\13\uffff\20\14"+
            "\2\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\14\uffff"+
            "\1\12\1\13\15\15",
            "\1\21",
            "\1\21",
            "\1\14\12\uffff\2\14\1\uffff\1\14\1\uffff\3\14\13\uffff\20\14"+
            "\2\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\16\uffff"+
            "\15\15"
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
            return "1942:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )";
        }
    }
    static final String DFA35_eotS =
        "\10\uffff";
    static final String DFA35_eofS =
        "\1\2\1\3\6\uffff";
    static final String DFA35_minS =
        "\2\4\2\uffff\4\4";
    static final String DFA35_maxS =
        "\2\70\2\uffff\1\70\1\71\1\70\1\71";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\1\1\4\uffff";
    static final String DFA35_specialS =
        "\10\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\15\uffff\1\2\1\uffff\3\2\13\uffff\14\2\3\uffff\1\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\4\15\uffff\1\3\1\uffff\3\3\5\uffff\1\3\2\2\3\uffff\15\3"+
            "\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3",
            "",
            "",
            "\1\6\15\uffff\1\2\1\uffff\3\2\6\uffff\1\3\1\5\3\uffff\14\2"+
            "\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2",
            "\3\3\30\uffff\1\2\16\uffff\2\3\11\uffff\1\3",
            "\1\4\15\uffff\1\3\1\uffff\3\3\6\uffff\1\2\1\7\3\uffff\14\3"+
            "\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3",
            "\3\2\30\uffff\1\3\16\uffff\2\2\11\uffff\1\2"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2260:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?";
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
    public static final BitSet FOLLOW_13_in_ruleFunctionDefinition498 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleFunctionType_in_ruleFunctionDefinition519 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition531 = new BitSet(new long[]{0x00000FF800710000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition553 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition566 = new BitSet(new long[]{0x00000FF800700000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition587 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition603 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDefinition615 = new BitSet(new long[]{0x01523FFC00740010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleFunctionDefinition636 = new BitSet(new long[]{0x01523FFC00740010L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDefinition649 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionDefinition662 = new BitSet(new long[]{0x00000FF800700000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition683 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition696 = new BitSet(new long[]{0x00000FF800700000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition717 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleFunctionType_in_entryRuleFunctionType758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionType769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFunctionType807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionType826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFunctionType845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionType864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionParameterMember960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionParameterMember981 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleFunctionParameterMember994 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterScope1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionParameterScope1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionParameterScope1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionParameterScope1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_entryRuleFunctionBodyMember1181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBodyMember1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleFunctionBodyMember1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleFunctionBodyMember1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleFunctionBodyMember1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleFunctionBodyMember1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleFunctionBodyMember1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleFunctionBodyMember1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember1408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUseMember1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionUseMember1464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionUseMember1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableComplex1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex1681 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleVariableComplex1694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex1715 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute1753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute1818 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleVariableAttribute1830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition1954 = new BitSet(new long[]{0x00003FFC00700010L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn2074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2160 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleVariableDefinitionBuiltIn2173 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVariableDefinitionBuiltIn2185 = new BitSet(new long[]{0x00000FF800700010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2208 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2227 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinitionBuiltIn2242 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2264 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionBuiltIn2277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2298 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionBuiltIn2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined2352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2438 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleVariableDefinitionUserDefined2451 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVariableDefinitionUserDefined2463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2484 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinitionUserDefined2496 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2518 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionUserDefined2531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2552 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionUserDefined2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection2606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionCollection2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection2672 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionCollection2684 = new BitSet(new long[]{0x00000FF800700010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection2707 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2726 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionCollection2741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2762 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleVariableDefinitionCollection2776 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleVariableDefinitionCollection2797 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionCollection2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic2847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBasic2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic2912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic2933 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleVariableDefinitionBasic2945 = new BitSet(new long[]{0x0200C00000000070L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterAssignment3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleParameterAssignment3058 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleParameterAssignment3070 = new BitSet(new long[]{0x0200C00000000070L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVariableQualifier3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType3216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVariableType3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableType3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVariableType3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVariableType3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariableType3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVariableType3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVariableType3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVariableType3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVariableType3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVariableType3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVariableType3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVariableType3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID3515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCollectionID3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCollectionID3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment3623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment3688 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleVariableAssignment3700 = new BitSet(new long[]{0x0200C00000000070L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableAssignment3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject3757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentObject3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression3881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression3946 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression3963 = new BitSet(new long[]{0x0200C00000000070L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression3983 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject4021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionObject4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject4140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject4379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator4481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVariableExpressionOperator4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVariableExpressionOperator4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVariableExpressionOperator4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition4608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRuleDefinition4664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleDefinition4685 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRuleDefinition4697 = new BitSet(new long[]{0x000C000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition4719 = new BitSet(new long[]{0x000C400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRuleDefinition4732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition4753 = new BitSet(new long[]{0x000C400000000000L});
    public static final BitSet FOLLOW_50_in_ruleRuleDefinition4770 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_51_in_ruleRuleDefinition4794 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition4830 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleRuleDefinition4843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition4864 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject4904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleObject4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleRuleObject4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition5028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDefinition5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDeviceDefinition5084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeviceDefinition5105 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDeviceDefinition5117 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDeviceDefinition5129 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleDeviceDefinition5141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeviceDefinition5153 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleDeviceDefinition5165 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDeviceDefinition5177 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition5198 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeviceDefinition5210 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeviceDefinition5222 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5244 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDeviceDefinition5257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleDeviceDefinition5278 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleDeviceDefinition5294 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition5306 = new BitSet(new long[]{0x01523FFC00740010L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition5327 = new BitSet(new long[]{0x01523FFC00740010L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceMembers5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition5522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCDefinition5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleATGCDefinition5578 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_ruleATGCDefinition5599 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleATGCDefinition5611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition5632 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleATGCDefinition5645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition5666 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand5705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCCommand5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleATGCCommand5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition5792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePropertyDefinition5848 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_57_in_rulePropertyDefinition5862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyDefinition5883 = new BitSet(new long[]{0x0401000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rulePropertyDefinition5900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyDefinition5920 = new BitSet(new long[]{0x0401000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_58_in_rulePropertyDefinition5934 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rulePropertyCondition_in_rulePropertyDefinition5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePropertyDefinition5975 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePropertyDefinition5987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_rulePropertyDefinition6008 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulePropertyDefinition6020 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePropertyDefinition6032 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyDefinition6053 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePropertyDefinition6065 = new BitSet(new long[]{0x4000000300000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rulePropertyDefinition6088 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyDefinition6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePropertyDefinition6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty6167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleProperty6232 = new BitSet(new long[]{0x0000000300000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleProperty6253 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleProperty6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCondition_in_entryRulePropertyCondition6310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCondition6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePropertyCondition6367 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_64_in_rulePropertyCondition6385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_65_in_rulePropertyCondition6403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_66_in_rulePropertyCondition6421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_67_in_rulePropertyCondition6439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_68_in_rulePropertyCondition6453 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePropertyCondition6465 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyCondition6486 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePropertyCondition6498 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyCondition6519 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulePropertyCondition6531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_rulePropertyCondition6544 = new BitSet(new long[]{0x4000000300000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rulePropertyCondition6567 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_ruleREAL_in_rulePropertyCondition6588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_62_in_rulePropertyCondition6607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_rulePropertyCondition6625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6646 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rulePropertyCondition6659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_rulePropertyCondition6680 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition6720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInitialCondition6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition6785 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePropertyInitialCondition6797 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_ruleQuantity_in_rulePropertyInitialCondition6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL6855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleREAL6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_ruleREAL6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal6998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal7009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDecimal7052 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47_in_ruleDecimal7071 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal7088 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleDecimal7107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp7180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalExp7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDecimalExp7234 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47_in_ruleDecimalExp7253 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp7270 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_29_in_ruleDecimalExp7289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp7304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleDecimalExp7325 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_72_in_ruleDecimalExp7344 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_46_in_ruleDecimalExp7359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47_in_ruleDecimalExp7378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity7444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantity7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleQuantity7509 = new BitSet(new long[]{0x0000000000000000L,0x00000000003FFE00L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleQuantity7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit7567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUnit7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleUnit7635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleUnit7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleUnit7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUnit7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleUnit7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleUnit7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUnit7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleUnit7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleUnit7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnit7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnit7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleUnit7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator7885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleRelationalOperator7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleRelationalOperator7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRelationalOperator7972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRelationalOperator7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRelationalOperator8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator8070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleBooleanOperator8119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBooleanOperator8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleBooleanOperator8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleBooleanOperator8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleBooleanOperator8196 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleBooleanOperator8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleBooleanOperator8230 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleBooleanOperator8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8343 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleQualifiedNameWithWildcard8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8456 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedName8475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8490 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList8537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleList8593 = new BitSet(new long[]{0x0000C00000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8614 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_15_in_ruleList8627 = new BitSet(new long[]{0x0000C00000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList8648 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_58_in_ruleList8662 = new BitSet(new long[]{0x0000000000000002L});

}