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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'define'", "'typeof'", "'('", "','", "')'", "'{'", "'}'", "'USES'", "'PROCESS'", "'CELL'", "'SYSTEM'", "'REGION'", "'<'", "'>'", "':'", "'input'", "'output'", "'optional'", "'~'", "'.'", "'='", "'new'", "'observable'", "'MOLECULE'", "'RIBOSOME'", "'PROMOTER'", "'PROTEIN'", "'DNA'", "'RNA'", "'GENE'", "'INTEGER'", "'RATE'", "'CHASSIS'", "'COMPLEX'", "'LIST'", "'SET'", "'HASH'", "'+'", "'-'", "'|'", "'RULE'", "'->'", "'<->'", "'DEVICE'", "'parts'", "'ATGC'", "'ARRANGE'", "'VERIFY'", "'WITHIN'", "'['", "']'", "'AFTER'", "'WITH PROBABILITY'", "'?'", "'GIVEN'", "'EXPECTED'", "'AT'", "'IS '", "'EVENTUALLY HOLDS'", "'NEVER HOLDS'", "'ALWAYS HOLDS'", "'HOLDS IN STEASY-STATE'", "'HOLDS INFINITELY OFTEN'", "'WILL HOLD UNTIL THEN'", "'IS FOLLOWED BY'", "'NOT'", "'AND'", "'OR'", "'IMPLIES'", "'1.0'", "'0.'", "'E'", "'e'", "'s'", "'min'", "'mins'", "'s^-1'", "'min^-1'", "'M'", "'mM'", "'uM'", "'nM'", "'pM'", "'fM'", "'molecule'", "'molecules'", "'=='", "'!='", "'<='", "'>='", "'.*'"
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

                if ( (LA6_0==RULE_ID||(LA6_0>=20 && LA6_0<=22)||(LA6_0>=35 && LA6_0<=48)||LA6_0==52||LA6_0==55||LA6_0==57||LA6_0==59) ) {
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

                if ( (LA16_1==31) ) {
                    alt16=1;
                }
                else if ( (LA16_1==30) ) {
                    alt16=2;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:968:1: ruleVariableDefinition returns [EObject current=null] : ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:971:28: ( ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:1: ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:1: ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:2: () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:972:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:973:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:978:2: ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:979:1: ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:979:1: ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:980:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:980:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:981:3: lv_definition_1_1= ruleVariableDefinitionBuiltIn
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBuiltInParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition2109);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:996:8: lv_definition_1_2= ruleVariableDefinitionUserDefined
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionUserDefinedParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition2128);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1011:8: lv_definition_1_3= ruleVariableDefinitionCollection
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionCollectionParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition2147);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1026:8: lv_definition_1_4= ruleVariableDefinitionBasic
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBasicParserRuleCall_1_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition2166);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1044:2: (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1044:4: otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleVariableDefinition2182); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionAccess().getColonKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1048:1: ( (lv_qualifier_3_0= ruleVariableQualifier ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1049:1: (lv_qualifier_3_0= ruleVariableQualifier )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1049:1: (lv_qualifier_3_0= ruleVariableQualifier )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1050:3: lv_qualifier_3_0= ruleVariableQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getQualifierVariableQualifierParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition2203);
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


    // $ANTLR start "entryRuleVariableDefinitionBuiltIn"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1074:1: entryRuleVariableDefinitionBuiltIn returns [EObject current=null] : iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF ;
    public final EObject entryRuleVariableDefinitionBuiltIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBuiltIn = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1075:2: (iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1076:2: iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBuiltInRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn2241);
            iv_ruleVariableDefinitionBuiltIn=ruleVariableDefinitionBuiltIn();

            state._fsp--;

             current =iv_ruleVariableDefinitionBuiltIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn2251); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:1: ruleVariableDefinitionBuiltIn returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1086:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1087:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1087:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1087:2: () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1087:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1088:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBuiltInAccess().getVariableDefinitionBuiltInAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1093:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1094:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1094:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1095:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2306);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1111:2: ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==30) ) {
                    alt19=2;
                }
                else if ( (LA19_1==EOF||LA19_1==RULE_ID||LA19_1==18||(LA19_1>=20 && LA19_1<=22)||LA19_1==26||LA19_1==32||(LA19_1>=35 && LA19_1<=48)||LA19_1==52||LA19_1==55||LA19_1==57||LA19_1==59) ) {
                    alt19=1;
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1111:3: ( (lv_name_2_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1111:3: ( (lv_name_2_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1112:1: (lv_name_2_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1112:1: (lv_name_2_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1113:3: lv_name_2_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getNameVariableNameParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2328);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1130:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1130:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1131:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1131:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1132:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getComplexVariableComplexParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn2355);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1148:3: (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1148:5: otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionBuiltIn2369); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionBuiltInAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionBuiltIn2381); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionBuiltInAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1156:1: ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1157:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1157:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1158:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1158:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1159:3: lv_constructor_6_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableTypeParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2404);
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1174:8: lv_constructor_6_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableNameParserRuleCall_3_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2423);
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

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinitionBuiltIn2438); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionBuiltInAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1196:1: ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1196:2: ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1196:2: ( (lv_parameters_8_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1197:1: (lv_parameters_8_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1197:1: (lv_parameters_8_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1198:3: lv_parameters_8_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2460);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1214:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==15) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1214:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionBuiltIn2473); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getVariableDefinitionBuiltInAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1218:1: ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1219:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1219:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1220:3: lv_parameters_10_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2494);
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

                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionBuiltIn2510); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1248:1: entryRuleVariableDefinitionUserDefined returns [EObject current=null] : iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF ;
    public final EObject entryRuleVariableDefinitionUserDefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionUserDefined = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1249:2: (iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1250:2: iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined2548);
            iv_ruleVariableDefinitionUserDefined=ruleVariableDefinitionUserDefined();

            state._fsp--;

             current =iv_ruleVariableDefinitionUserDefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined2558); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1257:1: ruleVariableDefinitionUserDefined returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1260:28: ( ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1261:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1261:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1261:2: () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1261:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1262:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionUserDefinedAccess().getVariableDefinitionUserDefinedAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1267:2: ( (lv_type_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1268:1: (lv_type_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1268:1: (lv_type_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1269:3: lv_type_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getTypeVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2613);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1285:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1286:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1286:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1287:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2634);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1303:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1303:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionUserDefined2647); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionUserDefinedAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionUserDefined2659); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionUserDefinedAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1311:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1312:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1312:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1313:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2680);
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

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinitionUserDefined2692); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionUserDefinedAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1333:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1333:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1333:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1334:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1334:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1335:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2714);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1351:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==15) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1351:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionUserDefined2727); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionUserDefinedAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1355:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1356:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1356:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1357:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2748);
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

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionUserDefined2764); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1385:1: entryRuleVariableDefinitionCollection returns [EObject current=null] : iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF ;
    public final EObject entryRuleVariableDefinitionCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionCollection = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1386:2: (iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1387:2: iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionCollectionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection2802);
            iv_ruleVariableDefinitionCollection=ruleVariableDefinitionCollection();

            state._fsp--;

             current =iv_ruleVariableDefinitionCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionCollection2812); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1394:1: ruleVariableDefinitionCollection returns [EObject current=null] : ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1397:28: ( ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1398:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1398:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1398:2: () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1398:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1399:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionCollectionAccess().getVariableDefinitionCollectionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1404:2: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1404:3: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1404:3: ( (lv_collection_1_0= ruleCollectionID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1405:1: (lv_collection_1_0= ruleCollectionID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1405:1: (lv_collection_1_0= ruleCollectionID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1406:3: lv_collection_1_0= ruleCollectionID
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection2868);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleVariableDefinitionCollection2880); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionCollectionAccess().getLessThanSignKeyword_1_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1426:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1427:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1427:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1428:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1428:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1429:3: lv_type_3_1= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableTypeParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection2903);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1444:8: lv_type_3_2= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableNameParserRuleCall_1_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2922);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleVariableDefinitionCollection2937); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionCollectionAccess().getGreaterThanSignKeyword_1_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1466:1: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1467:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1467:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1468:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getNameVariableNameParserRuleCall_1_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2958);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:3: (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:5: otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionCollection2972); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionCollectionAccess().getEqualsSignKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1488:1: ( (lv_value_7_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1489:1: (lv_value_7_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1489:1: (lv_value_7_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1490:3: lv_value_7_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getValueListParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleVariableDefinitionCollection2993);
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

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinitionCollection3005); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1518:1: entryRuleVariableDefinitionBasic returns [EObject current=null] : iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF ;
    public final EObject entryRuleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBasic = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1519:2: (iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1520:2: iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBasicRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic3043);
            iv_ruleVariableDefinitionBasic=ruleVariableDefinitionBasic();

            state._fsp--;

             current =iv_ruleVariableDefinitionBasic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBasic3053); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1527:1: ruleVariableDefinitionBasic returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1530:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1531:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1531:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1531:2: () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1531:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1532:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBasicAccess().getVariableDefinitionBasicAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1537:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1538:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1538:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1539:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic3108);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1555:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1556:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1556:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1557:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic3129);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinitionBasic3141); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionBasicAccess().getEqualsSignKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1577:1: ( (lv_expression_4_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1578:1: (lv_expression_4_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1578:1: (lv_expression_4_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1579:3: lv_expression_4_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getExpressionVariableExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic3162);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1603:1: entryRuleParameterAssignment returns [EObject current=null] : iv_ruleParameterAssignment= ruleParameterAssignment EOF ;
    public final EObject entryRuleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1604:2: (iv_ruleParameterAssignment= ruleParameterAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1605:2: iv_ruleParameterAssignment= ruleParameterAssignment EOF
            {
             newCompositeNode(grammarAccess.getParameterAssignmentRule()); 
            pushFollow(FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment3198);
            iv_ruleParameterAssignment=ruleParameterAssignment();

            state._fsp--;

             current =iv_ruleParameterAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterAssignment3208); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1612:1: ruleParameterAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) ;
    public final EObject ruleParameterAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1615:28: ( ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1616:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1616:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1616:2: ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1616:2: ( (lv_name_0_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1617:1: (lv_name_0_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1617:1: (lv_name_0_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1618:3: lv_name_0_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getNameVariableNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleParameterAssignment3254);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleParameterAssignment3266); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1638:1: ( (lv_value_2_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1639:1: (lv_value_2_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1639:1: (lv_value_2_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1640:3: lv_value_2_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment3287);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1664:1: entryRuleVariableQualifier returns [String current=null] : iv_ruleVariableQualifier= ruleVariableQualifier EOF ;
    public final String entryRuleVariableQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableQualifier = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1665:2: (iv_ruleVariableQualifier= ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1666:2: iv_ruleVariableQualifier= ruleVariableQualifier EOF
            {
             newCompositeNode(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier3324);
            iv_ruleVariableQualifier=ruleVariableQualifier();

            state._fsp--;

             current =iv_ruleVariableQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier3335); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1673:1: ruleVariableQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'observable' ;
    public final AntlrDatatypeRuleToken ruleVariableQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1676:28: (kw= 'observable' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1678:2: kw= 'observable'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleVariableQualifier3372); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1691:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1692:2: (iv_ruleVariableType= ruleVariableType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1693:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType3412);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType3423); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1700:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1703:28: ( (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1704:1: (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1704:1: (kw= 'MOLECULE' | kw= 'CELL' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' | kw= 'PROCESS' | kw= 'SYSTEM' | kw= 'CHASSIS' | kw= 'COMPLEX' )
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1705:2: kw= 'MOLECULE'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVariableType3461); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getMOLECULEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1712:2: kw= 'CELL'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleVariableType3480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCELLKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1719:2: kw= 'RIBOSOME'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVariableType3499); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRIBOSOMEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1726:2: kw= 'PROMOTER'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVariableType3518); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROMOTERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1733:2: kw= 'PROTEIN'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVariableType3537); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROTEINKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1740:2: kw= 'DNA'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVariableType3556); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getDNAKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1747:2: kw= 'RNA'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVariableType3575); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRNAKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1754:2: kw= 'GENE'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVariableType3594); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getGENEKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1761:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVariableType3613); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTEGERKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1768:2: kw= 'RATE'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVariableType3632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRATEKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1775:2: kw= 'PROCESS'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleVariableType3651); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROCESSKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1782:2: kw= 'SYSTEM'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleVariableType3670); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getSYSTEMKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1789:2: kw= 'CHASSIS'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVariableType3689); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCHASSISKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1796:2: kw= 'COMPLEX'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVariableType3708); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1809:1: entryRuleCollectionID returns [String current=null] : iv_ruleCollectionID= ruleCollectionID EOF ;
    public final String entryRuleCollectionID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionID = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1810:2: (iv_ruleCollectionID= ruleCollectionID EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1811:2: iv_ruleCollectionID= ruleCollectionID EOF
            {
             newCompositeNode(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID3749);
            iv_ruleCollectionID=ruleCollectionID();

            state._fsp--;

             current =iv_ruleCollectionID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID3760); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1818:1: ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1821:28: ( (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1822:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1822:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:2: kw= 'LIST'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleCollectionID3798); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1830:2: kw= 'SET'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleCollectionID3817); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1837:2: kw= 'HASH'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleCollectionID3836); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1850:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1851:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1852:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment3876);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment3886); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1859:1: ruleVariableAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1862:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1863:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1863:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1863:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1863:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1864:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1869:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1870:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1870:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1871:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment3941);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleVariableAssignment3953); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1891:1: ( (lv_expression_3_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1892:1: (lv_expression_3_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1892:1: (lv_expression_3_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1893:3: lv_expression_3_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableAssignment3974);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1917:1: entryRuleVariableAssignmentObject returns [EObject current=null] : iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF ;
    public final EObject entryRuleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignmentObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1918:2: (iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1919:2: iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentObjectRule()); 
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject4010);
            iv_ruleVariableAssignmentObject=ruleVariableAssignmentObject();

            state._fsp--;

             current =iv_ruleVariableAssignmentObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentObject4020); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1926:1: ruleVariableAssignmentObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) ;
    public final EObject ruleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1929:28: ( ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1931:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariableAssignmentObjectAccess().getVariableAssignmentObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject4071);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1946:5: this_VariableAttribute_2= ruleVariableAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject4099);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1962:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1963:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1964:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression4134);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression4144); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1971:1: ruleVariableExpression returns [EObject current=null] : ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1974:28: ( ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1975:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1975:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1975:2: () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1975:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1976:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1981:2: ( (lv_members_1_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1982:1: (lv_members_1_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1982:1: (lv_members_1_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1983:3: lv_members_1_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4199);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1999:2: ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=49 && LA32_0<=51)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2000:5: ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression4216);
            	    ruleVariableExpressionOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2007:1: ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2008:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2008:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2009:3: lv_members_3_0= ruleVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4236);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2033:1: entryRuleVariableExpressionObject returns [EObject current=null] : iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF ;
    public final EObject entryRuleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2034:2: (iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2035:2: iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject4274);
            iv_ruleVariableExpressionObject=ruleVariableExpressionObject();

            state._fsp--;

             current =iv_ruleVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionObject4284); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2042:1: ruleVariableExpressionObject returns [EObject current=null] : (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) ;
    public final EObject ruleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicVariableExpressionObject_0 = null;

        EObject this_CompoundVariableExpressionObject_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2045:28: ( (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2046:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2046:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_INT)||(LA33_0>=49 && LA33_0<=50)) ) {
                alt33=1;
            }
            else if ( (LA33_0==61) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2047:5: this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getAtomicVariableExpressionObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject4331);
                    this_AtomicVariableExpressionObject_0=ruleAtomicVariableExpressionObject();

                    state._fsp--;

                     
                            current = this_AtomicVariableExpressionObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2057:5: this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getCompoundVariableExpressionObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject4358);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2073:1: entryRuleAtomicVariableExpressionObject returns [EObject current=null] : iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF ;
    public final EObject entryRuleAtomicVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2074:2: (iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2075:2: iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject4393);
            iv_ruleAtomicVariableExpressionObject=ruleAtomicVariableExpressionObject();

            state._fsp--;

             current =iv_ruleAtomicVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject4403); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2082:1: ruleAtomicVariableExpressionObject returns [EObject current=null] : ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2085:28: ( ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2086:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2086:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            int alt34=6;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2086:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2086:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2086:3: () ( (lv_variable_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2086:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2087:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicVariableExpressionObjectAccess().getAtomicVariableExpressionObjectAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2092:2: ( (lv_variable_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2093:1: (lv_variable_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2093:1: (lv_variable_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2094:3: lv_variable_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getVariableVariableNameParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject4459);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2111:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2111:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2112:1: (lv_attribute_2_0= ruleVariableAttribute )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2112:1: (lv_attribute_2_0= ruleVariableAttribute )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2113:3: lv_attribute_2_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getAttributeVariableAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject4487);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2130:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2130:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2131:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2131:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2132:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getComplexVariableComplexParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject4514);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2149:6: ( (lv_value_4_0= ruleREAL ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2149:6: ( (lv_value_4_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2150:1: (lv_value_4_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2150:1: (lv_value_4_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2151:3: lv_value_4_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getValueREALParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject4541);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2168:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2168:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2169:1: (lv_quantity_5_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2169:1: (lv_quantity_5_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2170:3: lv_quantity_5_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getQuantityQuantityParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject4568);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2187:6: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2187:6: ( (lv_string_6_0= RULE_STRING ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2188:1: (lv_string_6_0= RULE_STRING )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2188:1: (lv_string_6_0= RULE_STRING )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2189:3: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject4591); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2213:1: entryRuleCompoundVariableExpressionObject returns [EObject current=null] : iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF ;
    public final EObject entryRuleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2214:2: (iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2215:2: iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject4632);
            iv_ruleCompoundVariableExpressionObject=ruleCompoundVariableExpressionObject();

            state._fsp--;

             current =iv_ruleCompoundVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject4642); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2222:1: ruleCompoundVariableExpressionObject returns [EObject current=null] : ( () ( (lv_list_1_0= ruleList ) ) ) ;
    public final EObject ruleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2225:28: ( ( () ( (lv_list_1_0= ruleList ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2226:1: ( () ( (lv_list_1_0= ruleList ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2226:1: ( () ( (lv_list_1_0= ruleList ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2226:2: () ( (lv_list_1_0= ruleList ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2226:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2227:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompoundVariableExpressionObjectAccess().getCompoundVariableExpressionObjectAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2232:2: ( (lv_list_1_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2233:1: (lv_list_1_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2233:1: (lv_list_1_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2234:3: lv_list_1_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectAccess().getListListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject4697);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2258:1: entryRuleVariableExpressionOperator returns [String current=null] : iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF ;
    public final String entryRuleVariableExpressionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableExpressionOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2259:2: (iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2260:2: iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator4734);
            iv_ruleVariableExpressionOperator=ruleVariableExpressionOperator();

            state._fsp--;

             current =iv_ruleVariableExpressionOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator4745); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2267:1: ruleVariableExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleVariableExpressionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2270:28: ( (kw= '+' | kw= '-' | kw= '|' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2271:1: (kw= '+' | kw= '-' | kw= '|' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2271:1: (kw= '+' | kw= '-' | kw= '|' )
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2272:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVariableExpressionOperator4783); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2279:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVariableExpressionOperator4802); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2286:2: kw= '|'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVariableExpressionOperator4821); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2299:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2300:2: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2301:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition4861);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition4871); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2308:1: ruleRuleDefinition returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2311:28: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2312:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2312:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2312:2: () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2312:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2313:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleRuleDefinition4917); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2322:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2323:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2323:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2324:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRuleDefinition4938);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleRuleDefinition4950); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2344:1: ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2344:2: ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2344:2: ( (lv_lhs_4_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2345:1: (lv_lhs_4_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2345:1: (lv_lhs_4_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2346:3: lv_lhs_4_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition4972);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2362:2: (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==49) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2362:4: otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleRuleDefinition4985); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2366:1: ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2367:1: (lv_lhs_6_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2367:1: (lv_lhs_6_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2368:3: lv_lhs_6_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition5006);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2384:6: (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) )
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2384:8: otherlv_7= '->'
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleRuleDefinition5023); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2389:6: ( (lv_reversible_8_0= '<->' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2389:6: ( (lv_reversible_8_0= '<->' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2390:1: (lv_reversible_8_0= '<->' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2390:1: (lv_reversible_8_0= '<->' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2391:3: lv_reversible_8_0= '<->'
                    {
                    lv_reversible_8_0=(Token)match(input,54,FOLLOW_54_in_ruleRuleDefinition5047); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2404:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2404:4: ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2404:4: ( (lv_rhs_9_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2405:1: (lv_rhs_9_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2405:1: (lv_rhs_9_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2406:3: lv_rhs_9_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition5083);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2422:2: (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==49) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2422:4: otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleRuleDefinition5096); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2426:1: ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2427:1: (lv_rhs_11_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2427:1: (lv_rhs_11_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2428:3: lv_rhs_11_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition5117);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2452:1: entryRuleRuleObject returns [EObject current=null] : iv_ruleRuleObject= ruleRuleObject EOF ;
    public final EObject entryRuleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2453:2: (iv_ruleRuleObject= ruleRuleObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2454:2: iv_ruleRuleObject= ruleRuleObject EOF
            {
             newCompositeNode(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject5157);
            iv_ruleRuleObject=ruleRuleObject();

            state._fsp--;

             current =iv_ruleRuleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject5167); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2461:1: ruleRuleObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) ;
    public final EObject ruleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableComplex_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2464:28: ( ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2465:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2465:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==30) ) {
                    alt41=2;
                }
                else if ( (LA41_1==EOF||LA41_1==RULE_ID||LA41_1==18||(LA41_1>=20 && LA41_1<=22)||(LA41_1>=35 && LA41_1<=49)||(LA41_1>=52 && LA41_1<=55)||LA41_1==57||LA41_1==59) ) {
                    alt41=1;
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2465:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2465:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2465:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2465:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2466:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getRuleObjectAccess().getRuleObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleRuleObject5218);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2481:5: this_VariableComplex_2= ruleVariableComplex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableComplexParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleRuleObject5246);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2497:1: entryRuleDeviceDefinition returns [EObject current=null] : iv_ruleDeviceDefinition= ruleDeviceDefinition EOF ;
    public final EObject entryRuleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2498:2: (iv_ruleDeviceDefinition= ruleDeviceDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2499:2: iv_ruleDeviceDefinition= ruleDeviceDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeviceDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition5281);
            iv_ruleDeviceDefinition=ruleDeviceDefinition();

            state._fsp--;

             current =iv_ruleDeviceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDefinition5291); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2506:1: ruleDeviceDefinition returns [EObject current=null] : ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2509:28: ( ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2510:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2510:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2510:2: () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2510:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2511:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleDeviceDefinition5337); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2520:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2521:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2521:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2522:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeviceDefinition5358);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition5370); 

                	newLeafNode(otherlv_3, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition5382); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceDefinitionAccess().getNewKeyword_4());
                
            otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleDeviceDefinition5394); 

                	newLeafNode(otherlv_5, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_5());
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDeviceDefinition5406); 

                	newLeafNode(otherlv_6, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleDeviceDefinition5418); 

                	newLeafNode(otherlv_7, grammarAccess.getDeviceDefinitionAccess().getPartsKeyword_7());
                
            otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition5430); 

                	newLeafNode(otherlv_8, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2562:1: ( (lv_parts_9_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2563:1: (lv_parts_9_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2563:1: (lv_parts_9_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2564:3: lv_parts_9_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getPartsListParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition5451);
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

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDeviceDefinition5463); 

                	newLeafNode(otherlv_10, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10());
                
            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleDeviceDefinition5475); 

                	newLeafNode(otherlv_11, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_11());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2588:1: (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2588:3: otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleDeviceDefinition5488); 

                        	newLeafNode(otherlv_12, grammarAccess.getDeviceDefinitionAccess().getInputKeyword_12_0());
                        
                    otherlv_13=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition5500); 

                        	newLeafNode(otherlv_13, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_12_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2596:1: ( (lv_input_14_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2597:1: (lv_input_14_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2597:1: (lv_input_14_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2598:3: lv_input_14_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getInputListParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition5521);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2614:4: (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2614:6: otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) )
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleDeviceDefinition5536); 

                        	newLeafNode(otherlv_15, grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_13_0());
                        
                    otherlv_16=(Token)match(input,28,FOLLOW_28_in_ruleDeviceDefinition5548); 

                        	newLeafNode(otherlv_16, grammarAccess.getDeviceDefinitionAccess().getOutputKeyword_13_1());
                        
                    otherlv_17=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition5560); 

                        	newLeafNode(otherlv_17, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_13_2());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2626:1: ( (lv_outputput_18_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2627:1: (lv_outputput_18_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2627:1: (lv_outputput_18_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2628:3: lv_outputput_18_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getOutputputListParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition5581);
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

            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleDeviceDefinition5595); 

                	newLeafNode(otherlv_19, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_14());
                
            otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition5607); 

                	newLeafNode(otherlv_20, grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_15());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2652:1: ( (lv_members_21_0= ruleDeviceMembers ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||(LA44_0>=20 && LA44_0<=22)||(LA44_0>=35 && LA44_0<=48)||LA44_0==57||LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2653:1: (lv_members_21_0= ruleDeviceMembers )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2653:1: (lv_members_21_0= ruleDeviceMembers )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2654:3: lv_members_21_0= ruleDeviceMembers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getMembersDeviceMembersParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition5628);
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
            	    break loop44;
                }
            } while (true);

            otherlv_22=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition5641); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2682:1: entryRuleDeviceMembers returns [EObject current=null] : iv_ruleDeviceMembers= ruleDeviceMembers EOF ;
    public final EObject entryRuleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceMembers = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2683:2: (iv_ruleDeviceMembers= ruleDeviceMembers EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2684:2: iv_ruleDeviceMembers= ruleDeviceMembers EOF
            {
             newCompositeNode(grammarAccess.getDeviceMembersRule()); 
            pushFollow(FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5677);
            iv_ruleDeviceMembers=ruleDeviceMembers();

            state._fsp--;

             current =iv_ruleDeviceMembers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceMembers5687); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2691:1: ruleDeviceMembers returns [EObject current=null] : (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition ) ;
    public final EObject ruleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;

        EObject this_PropertyDefinition_1 = null;

        EObject this_ATGCDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2694:28: ( (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2695:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2695:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 20:
            case 21:
            case 22:
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2696:5: this_VariableDefinition_0= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5734);
                    this_VariableDefinition_0=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2706:5: this_PropertyDefinition_1= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getPropertyDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5761);
                    this_PropertyDefinition_1=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2716:5: this_ATGCDefinition_2= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getATGCDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5788);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2732:1: entryRuleATGCDefinition returns [EObject current=null] : iv_ruleATGCDefinition= ruleATGCDefinition EOF ;
    public final EObject entryRuleATGCDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATGCDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2733:2: (iv_ruleATGCDefinition= ruleATGCDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2734:2: iv_ruleATGCDefinition= ruleATGCDefinition EOF
            {
             newCompositeNode(grammarAccess.getATGCDefinitionRule()); 
            pushFollow(FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition5823);
            iv_ruleATGCDefinition=ruleATGCDefinition();

            state._fsp--;

             current =iv_ruleATGCDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCDefinition5833); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2741:1: ruleATGCDefinition returns [EObject current=null] : ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2744:28: ( ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2745:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2745:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2745:2: () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2745:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2746:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleATGCDefinition5879); 

                	newLeafNode(otherlv_1, grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2755:1: ( (lv_command_2_0= ruleATGCCommand ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2756:1: (lv_command_2_0= ruleATGCCommand )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2756:1: (lv_command_2_0= ruleATGCCommand )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2757:3: lv_command_2_0= ruleATGCCommand
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getCommandATGCCommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATGCCommand_in_ruleATGCDefinition5900);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleATGCDefinition5912); 

                	newLeafNode(otherlv_3, grammarAccess.getATGCDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2777:1: ( (lv_arguments_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2778:1: (lv_arguments_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2778:1: (lv_arguments_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2779:3: lv_arguments_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition5933);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2795:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==15) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2795:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleATGCDefinition5946); 

            	        	newLeafNode(otherlv_5, grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2799:1: ( (lv_arguments_6_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2800:1: (lv_arguments_6_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2800:1: (lv_arguments_6_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2801:3: lv_arguments_6_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition5967);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2825:1: entryRuleATGCCommand returns [String current=null] : iv_ruleATGCCommand= ruleATGCCommand EOF ;
    public final String entryRuleATGCCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATGCCommand = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2826:2: (iv_ruleATGCCommand= ruleATGCCommand EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2827:2: iv_ruleATGCCommand= ruleATGCCommand EOF
            {
             newCompositeNode(grammarAccess.getATGCCommandRule()); 
            pushFollow(FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand6006);
            iv_ruleATGCCommand=ruleATGCCommand();

            state._fsp--;

             current =iv_ruleATGCCommand.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCCommand6017); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2834:1: ruleATGCCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ARRANGE' ;
    public final AntlrDatatypeRuleToken ruleATGCCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2837:28: (kw= 'ARRANGE' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2839:2: kw= 'ARRANGE'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleATGCCommand6054); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2852:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2853:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2854:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition6093);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition6103); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2861:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_property_2_1 = null;

        EObject lv_property_2_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2864:28: ( ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2865:1: ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2865:1: ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2865:2: () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2865:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2866:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_rulePropertyDefinition6149); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getVERIFYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2875:1: ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2876:1: ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2876:1: ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2877:1: (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2877:1: (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            else if ( (LA47_0==67) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2878:3: lv_property_2_1= ruleProbabilityProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyProbabilityPropertyParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProbabilityProperty_in_rulePropertyDefinition6172);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2893:8: lv_property_2_2= ruleRewardProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyRewardPropertyParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleRewardProperty_in_rulePropertyDefinition6191);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2919:1: entryRuleProbabilityProperty returns [EObject current=null] : iv_ruleProbabilityProperty= ruleProbabilityProperty EOF ;
    public final EObject entryRuleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2920:2: (iv_ruleProbabilityProperty= ruleProbabilityProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2921:2: iv_ruleProbabilityProperty= ruleProbabilityProperty EOF
            {
             newCompositeNode(grammarAccess.getProbabilityPropertyRule()); 
            pushFollow(FOLLOW_ruleProbabilityProperty_in_entryRuleProbabilityProperty6230);
            iv_ruleProbabilityProperty=ruleProbabilityProperty();

            state._fsp--;

             current =iv_ruleProbabilityProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbabilityProperty6240); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2928:1: ruleProbabilityProperty returns [EObject current=null] : ( () ( (lv_stateFormula_1_0= ruleStateFormula ) ) ( ( (lv_pattern_2_0= rulePatternType ) ) | ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) ) ) ( (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) ) | (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) ) )? (otherlv_14= 'WITH PROBABILITY' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' ) )? (otherlv_18= 'GIVEN' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )* )? ) ;
    public final EObject ruleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_lowerBound_7_0=null;
        Token otherlv_8=null;
        Token lv_upperBound_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_stateFormula_1_0 = null;

        AntlrDatatypeRuleToken lv_pattern_2_0 = null;

        AntlrDatatypeRuleToken lv_pattern_3_0 = null;

        EObject lv_stateFormula2_4_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_11_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_13_0 = null;

        AntlrDatatypeRuleToken lv_operator_15_0 = null;

        AntlrDatatypeRuleToken lv_probability_16_0 = null;

        EObject lv_initialConditions_19_0 = null;

        EObject lv_initialConditions_21_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2931:28: ( ( () ( (lv_stateFormula_1_0= ruleStateFormula ) ) ( ( (lv_pattern_2_0= rulePatternType ) ) | ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) ) ) ( (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) ) | (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) ) )? (otherlv_14= 'WITH PROBABILITY' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' ) )? (otherlv_18= 'GIVEN' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2932:1: ( () ( (lv_stateFormula_1_0= ruleStateFormula ) ) ( ( (lv_pattern_2_0= rulePatternType ) ) | ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) ) ) ( (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) ) | (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) ) )? (otherlv_14= 'WITH PROBABILITY' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' ) )? (otherlv_18= 'GIVEN' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2932:1: ( () ( (lv_stateFormula_1_0= ruleStateFormula ) ) ( ( (lv_pattern_2_0= rulePatternType ) ) | ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) ) ) ( (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) ) | (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) ) )? (otherlv_14= 'WITH PROBABILITY' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' ) )? (otherlv_18= 'GIVEN' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2932:2: () ( (lv_stateFormula_1_0= ruleStateFormula ) ) ( ( (lv_pattern_2_0= rulePatternType ) ) | ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) ) ) ( (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) ) | (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) ) )? (otherlv_14= 'WITH PROBABILITY' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' ) )? (otherlv_18= 'GIVEN' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2932:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2933:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProbabilityPropertyAccess().getProbabilityPropertyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2938:2: ( (lv_stateFormula_1_0= ruleStateFormula ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2939:1: (lv_stateFormula_1_0= ruleStateFormula )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2939:1: (lv_stateFormula_1_0= ruleStateFormula )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2940:3: lv_stateFormula_1_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getStateFormulaStateFormulaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleProbabilityProperty6295);
            lv_stateFormula_1_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"stateFormula",
                    		lv_stateFormula_1_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2956:2: ( ( (lv_pattern_2_0= rulePatternType ) ) | ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=70 && LA48_0<=74)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=75 && LA48_0<=76)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2956:3: ( (lv_pattern_2_0= rulePatternType ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2956:3: ( (lv_pattern_2_0= rulePatternType ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2957:1: (lv_pattern_2_0= rulePatternType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2957:1: (lv_pattern_2_0= rulePatternType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2958:3: lv_pattern_2_0= rulePatternType
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getPatternPatternTypeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePatternType_in_ruleProbabilityProperty6317);
                    lv_pattern_2_0=rulePatternType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"pattern",
                            		lv_pattern_2_0, 
                            		"PatternType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2975:6: ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2975:6: ( ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2975:7: ( (lv_pattern_3_0= ruleSequencePatternType ) ) ( (lv_stateFormula2_4_0= ruleStateFormula ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2975:7: ( (lv_pattern_3_0= ruleSequencePatternType ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2976:1: (lv_pattern_3_0= ruleSequencePatternType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2976:1: (lv_pattern_3_0= ruleSequencePatternType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2977:3: lv_pattern_3_0= ruleSequencePatternType
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getPatternSequencePatternTypeParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequencePatternType_in_ruleProbabilityProperty6345);
                    lv_pattern_3_0=ruleSequencePatternType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"pattern",
                            		lv_pattern_3_0, 
                            		"SequencePatternType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2993:2: ( (lv_stateFormula2_4_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2994:1: (lv_stateFormula2_4_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2994:1: (lv_stateFormula2_4_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2995:3: lv_stateFormula2_4_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getStateFormula2StateFormulaParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleProbabilityProperty6366);
                    lv_stateFormula2_4_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"stateFormula2",
                            		lv_stateFormula2_4_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3011:4: ( (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) ) | (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==63) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3011:5: (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3011:5: (otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3011:7: otherlv_5= 'WITHIN' otherlv_6= '[' ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_upperBound_9_0= RULE_INT ) ) otherlv_10= ']' ( (lv_timeUnit_11_0= ruleTimeUnit ) )
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_60_in_ruleProbabilityProperty6382); 

                        	newLeafNode(otherlv_5, grammarAccess.getProbabilityPropertyAccess().getWITHINKeyword_3_0_0());
                        
                    otherlv_6=(Token)match(input,61,FOLLOW_61_in_ruleProbabilityProperty6394); 

                        	newLeafNode(otherlv_6, grammarAccess.getProbabilityPropertyAccess().getLeftSquareBracketKeyword_3_0_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3019:1: ( (lv_lowerBound_7_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3020:1: (lv_lowerBound_7_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3020:1: (lv_lowerBound_7_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3021:3: lv_lowerBound_7_0= RULE_INT
                    {
                    lv_lowerBound_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProbabilityProperty6411); 

                    			newLeafNode(lv_lowerBound_7_0, grammarAccess.getProbabilityPropertyAccess().getLowerBoundINTTerminalRuleCall_3_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleProbabilityProperty6428); 

                        	newLeafNode(otherlv_8, grammarAccess.getProbabilityPropertyAccess().getCommaKeyword_3_0_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3041:1: ( (lv_upperBound_9_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3042:1: (lv_upperBound_9_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3042:1: (lv_upperBound_9_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3043:3: lv_upperBound_9_0= RULE_INT
                    {
                    lv_upperBound_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProbabilityProperty6445); 

                    			newLeafNode(lv_upperBound_9_0, grammarAccess.getProbabilityPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,62,FOLLOW_62_in_ruleProbabilityProperty6462); 

                        	newLeafNode(otherlv_10, grammarAccess.getProbabilityPropertyAccess().getRightSquareBracketKeyword_3_0_5());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3063:1: ( (lv_timeUnit_11_0= ruleTimeUnit ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3064:1: (lv_timeUnit_11_0= ruleTimeUnit )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3064:1: (lv_timeUnit_11_0= ruleTimeUnit )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3065:3: lv_timeUnit_11_0= ruleTimeUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getTimeUnitTimeUnitParserRuleCall_3_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleProbabilityProperty6483);
                    lv_timeUnit_11_0=ruleTimeUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"timeUnit",
                            		lv_timeUnit_11_0, 
                            		"TimeUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3082:6: (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3082:6: (otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3082:8: otherlv_12= 'AFTER' ( (lv_timeUnit_13_0= ruleTimeUnit ) )
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_63_in_ruleProbabilityProperty6503); 

                        	newLeafNode(otherlv_12, grammarAccess.getProbabilityPropertyAccess().getAFTERKeyword_3_1_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3086:1: ( (lv_timeUnit_13_0= ruleTimeUnit ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3087:1: (lv_timeUnit_13_0= ruleTimeUnit )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3087:1: (lv_timeUnit_13_0= ruleTimeUnit )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3088:3: lv_timeUnit_13_0= ruleTimeUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getTimeUnitTimeUnitParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleProbabilityProperty6524);
                    lv_timeUnit_13_0=ruleTimeUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"timeUnit",
                            		lv_timeUnit_13_0, 
                            		"TimeUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3104:5: (otherlv_14= 'WITH PROBABILITY' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==64) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3104:7: otherlv_14= 'WITH PROBABILITY' ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' )
                    {
                    otherlv_14=(Token)match(input,64,FOLLOW_64_in_ruleProbabilityProperty6540); 

                        	newLeafNode(otherlv_14, grammarAccess.getProbabilityPropertyAccess().getWITHPROBABILITYKeyword_4_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3108:1: ( ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) ) | otherlv_17= '?' )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=24 && LA50_0<=25)||(LA50_0>=98 && LA50_0<=101)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==65) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3108:2: ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3108:2: ( ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3108:3: ( (lv_operator_15_0= ruleRelationalOperator ) ) ( (lv_probability_16_0= ruleUnitInterval ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3108:3: ( (lv_operator_15_0= ruleRelationalOperator ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3109:1: (lv_operator_15_0= ruleRelationalOperator )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3109:1: (lv_operator_15_0= ruleRelationalOperator )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3110:3: lv_operator_15_0= ruleRelationalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getOperatorRelationalOperatorParserRuleCall_4_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleProbabilityProperty6563);
                            lv_operator_15_0=ruleRelationalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"operator",
                                    		lv_operator_15_0, 
                                    		"RelationalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3126:2: ( (lv_probability_16_0= ruleUnitInterval ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3127:1: (lv_probability_16_0= ruleUnitInterval )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3127:1: (lv_probability_16_0= ruleUnitInterval )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3128:3: lv_probability_16_0= ruleUnitInterval
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getProbabilityUnitIntervalParserRuleCall_4_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleUnitInterval_in_ruleProbabilityProperty6584);
                            lv_probability_16_0=ruleUnitInterval();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"probability",
                                    		lv_probability_16_0, 
                                    		"UnitInterval");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3145:7: otherlv_17= '?'
                            {
                            otherlv_17=(Token)match(input,65,FOLLOW_65_in_ruleProbabilityProperty6603); 

                                	newLeafNode(otherlv_17, grammarAccess.getProbabilityPropertyAccess().getQuestionMarkKeyword_4_1_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3149:4: (otherlv_18= 'GIVEN' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==66) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3149:6: otherlv_18= 'GIVEN' ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) ) (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_18=(Token)match(input,66,FOLLOW_66_in_ruleProbabilityProperty6619); 

                        	newLeafNode(otherlv_18, grammarAccess.getProbabilityPropertyAccess().getGIVENKeyword_5_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3153:1: ( (lv_initialConditions_19_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3154:1: (lv_initialConditions_19_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3154:1: (lv_initialConditions_19_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3155:3: lv_initialConditions_19_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty6640);
                    lv_initialConditions_19_0=rulePropertyInitialCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"initialConditions",
                            		lv_initialConditions_19_0, 
                            		"PropertyInitialCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3171:2: (otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==15) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3171:4: otherlv_20= ',' ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_15_in_ruleProbabilityProperty6653); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getProbabilityPropertyAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3175:1: ( (lv_initialConditions_21_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3176:1: (lv_initialConditions_21_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3176:1: (lv_initialConditions_21_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3177:3: lv_initialConditions_21_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty6674);
                    	    lv_initialConditions_21_0=rulePropertyInitialCondition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initialConditions",
                    	            		lv_initialConditions_21_0, 
                    	            		"PropertyInitialCondition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3201:1: entryRuleRewardProperty returns [EObject current=null] : iv_ruleRewardProperty= ruleRewardProperty EOF ;
    public final EObject entryRuleRewardProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewardProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3202:2: (iv_ruleRewardProperty= ruleRewardProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3203:2: iv_ruleRewardProperty= ruleRewardProperty EOF
            {
             newCompositeNode(grammarAccess.getRewardPropertyRule()); 
            pushFollow(FOLLOW_ruleRewardProperty_in_entryRuleRewardProperty6714);
            iv_ruleRewardProperty=ruleRewardProperty();

            state._fsp--;

             current =iv_ruleRewardProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewardProperty6724); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3210:1: ruleRewardProperty returns [EObject current=null] : ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' (otherlv_5= 'AT' | otherlv_6= 'WITHIN' ) ( (lv_timeValue_7_0= RULE_INT ) ) ( (lv_timUnit_8_0= ruleTimeUnit ) ) otherlv_9= 'IS ' ( ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) ) | otherlv_13= '?' ) (otherlv_14= 'GIVEN' ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) ) (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )* )? ) ;
    public final EObject ruleRewardProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_timeValue_7_0=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_timUnit_8_0 = null;

        AntlrDatatypeRuleToken lv_operator_10_0 = null;

        AntlrDatatypeRuleToken lv_concenValue_11_0 = null;

        AntlrDatatypeRuleToken lv_units_12_0 = null;

        EObject lv_initialConditions_15_0 = null;

        EObject lv_initialConditions_17_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3213:28: ( ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' (otherlv_5= 'AT' | otherlv_6= 'WITHIN' ) ( (lv_timeValue_7_0= RULE_INT ) ) ( (lv_timUnit_8_0= ruleTimeUnit ) ) otherlv_9= 'IS ' ( ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) ) | otherlv_13= '?' ) (otherlv_14= 'GIVEN' ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) ) (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3214:1: ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' (otherlv_5= 'AT' | otherlv_6= 'WITHIN' ) ( (lv_timeValue_7_0= RULE_INT ) ) ( (lv_timUnit_8_0= ruleTimeUnit ) ) otherlv_9= 'IS ' ( ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) ) | otherlv_13= '?' ) (otherlv_14= 'GIVEN' ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) ) (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3214:1: ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' (otherlv_5= 'AT' | otherlv_6= 'WITHIN' ) ( (lv_timeValue_7_0= RULE_INT ) ) ( (lv_timUnit_8_0= ruleTimeUnit ) ) otherlv_9= 'IS ' ( ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) ) | otherlv_13= '?' ) (otherlv_14= 'GIVEN' ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) ) (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3214:2: () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' (otherlv_5= 'AT' | otherlv_6= 'WITHIN' ) ( (lv_timeValue_7_0= RULE_INT ) ) ( (lv_timUnit_8_0= ruleTimeUnit ) ) otherlv_9= 'IS ' ( ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) ) | otherlv_13= '?' ) (otherlv_14= 'GIVEN' ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) ) (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3214:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3215:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRewardPropertyAccess().getRewardPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleRewardProperty6770); 

                	newLeafNode(otherlv_1, grammarAccess.getRewardPropertyAccess().getEXPECTEDKeyword_1());
                
            otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleRewardProperty6782); 

                	newLeafNode(otherlv_2, grammarAccess.getRewardPropertyAccess().getLeftSquareBracketKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3228:1: ( (lv_name_3_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3229:1: (lv_name_3_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3229:1: (lv_name_3_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3230:3: lv_name_3_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getNameVariableNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRewardProperty6803);
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

            otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleRewardProperty6815); 

                	newLeafNode(otherlv_4, grammarAccess.getRewardPropertyAccess().getRightSquareBracketKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3250:1: (otherlv_5= 'AT' | otherlv_6= 'WITHIN' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==68) ) {
                alt54=1;
            }
            else if ( (LA54_0==60) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3250:3: otherlv_5= 'AT'
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleRewardProperty6828); 

                        	newLeafNode(otherlv_5, grammarAccess.getRewardPropertyAccess().getATKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3255:7: otherlv_6= 'WITHIN'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleRewardProperty6846); 

                        	newLeafNode(otherlv_6, grammarAccess.getRewardPropertyAccess().getWITHINKeyword_5_1());
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3259:2: ( (lv_timeValue_7_0= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3260:1: (lv_timeValue_7_0= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3260:1: (lv_timeValue_7_0= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3261:3: lv_timeValue_7_0= RULE_INT
            {
            lv_timeValue_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRewardProperty6864); 

            			newLeafNode(lv_timeValue_7_0, grammarAccess.getRewardPropertyAccess().getTimeValueINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRewardPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timeValue",
                    		lv_timeValue_7_0, 
                    		"INT");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3277:2: ( (lv_timUnit_8_0= ruleTimeUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3278:1: (lv_timUnit_8_0= ruleTimeUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3278:1: (lv_timUnit_8_0= ruleTimeUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3279:3: lv_timUnit_8_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getTimUnitTimeUnitParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleRewardProperty6890);
            lv_timUnit_8_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"timUnit",
                    		lv_timUnit_8_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,69,FOLLOW_69_in_ruleRewardProperty6902); 

                	newLeafNode(otherlv_9, grammarAccess.getRewardPropertyAccess().getISKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3299:1: ( ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) ) | otherlv_13= '?' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=24 && LA55_0<=25)||(LA55_0>=98 && LA55_0<=101)) ) {
                alt55=1;
            }
            else if ( (LA55_0==65) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3299:2: ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3299:2: ( ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3299:3: ( (lv_operator_10_0= ruleRelationalOperator ) ) ( (lv_concenValue_11_0= ruleREAL ) ) ( (lv_units_12_0= ruleConcentrationUnit ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3299:3: ( (lv_operator_10_0= ruleRelationalOperator ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3300:1: (lv_operator_10_0= ruleRelationalOperator )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3300:1: (lv_operator_10_0= ruleRelationalOperator )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3301:3: lv_operator_10_0= ruleRelationalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getOperatorRelationalOperatorParserRuleCall_9_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleRewardProperty6925);
                    lv_operator_10_0=ruleRelationalOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_10_0, 
                            		"RelationalOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3317:2: ( (lv_concenValue_11_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3318:1: (lv_concenValue_11_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3318:1: (lv_concenValue_11_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3319:3: lv_concenValue_11_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getConcenValueREALParserRuleCall_9_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleRewardProperty6946);
                    lv_concenValue_11_0=ruleREAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"concenValue",
                            		lv_concenValue_11_0, 
                            		"REAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3335:2: ( (lv_units_12_0= ruleConcentrationUnit ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3336:1: (lv_units_12_0= ruleConcentrationUnit )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3336:1: (lv_units_12_0= ruleConcentrationUnit )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3337:3: lv_units_12_0= ruleConcentrationUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getUnitsConcentrationUnitParserRuleCall_9_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleRewardProperty6967);
                    lv_units_12_0=ruleConcentrationUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"units",
                            		lv_units_12_0, 
                            		"ConcentrationUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3354:7: otherlv_13= '?'
                    {
                    otherlv_13=(Token)match(input,65,FOLLOW_65_in_ruleRewardProperty6986); 

                        	newLeafNode(otherlv_13, grammarAccess.getRewardPropertyAccess().getQuestionMarkKeyword_9_1());
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3358:2: (otherlv_14= 'GIVEN' ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) ) (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==66) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3358:4: otherlv_14= 'GIVEN' ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) ) (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_14=(Token)match(input,66,FOLLOW_66_in_ruleRewardProperty7000); 

                        	newLeafNode(otherlv_14, grammarAccess.getRewardPropertyAccess().getGIVENKeyword_10_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3362:1: ( (lv_initialConditions_15_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3363:1: (lv_initialConditions_15_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3363:1: (lv_initialConditions_15_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3364:3: lv_initialConditions_15_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty7021);
                    lv_initialConditions_15_0=rulePropertyInitialCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"initialConditions",
                            		lv_initialConditions_15_0, 
                            		"PropertyInitialCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3380:2: (otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3380:4: otherlv_16= ',' ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleRewardProperty7034); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getRewardPropertyAccess().getCommaKeyword_10_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3384:1: ( (lv_initialConditions_17_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3385:1: (lv_initialConditions_17_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3385:1: (lv_initialConditions_17_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3386:3: lv_initialConditions_17_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_10_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty7055);
                    	    lv_initialConditions_17_0=rulePropertyInitialCondition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRewardPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"initialConditions",
                    	            		lv_initialConditions_17_0, 
                    	            		"PropertyInitialCondition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
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


    // $ANTLR start "entryRulePatternType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3410:1: entryRulePatternType returns [String current=null] : iv_rulePatternType= rulePatternType EOF ;
    public final String entryRulePatternType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePatternType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3411:2: (iv_rulePatternType= rulePatternType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3412:2: iv_rulePatternType= rulePatternType EOF
            {
             newCompositeNode(grammarAccess.getPatternTypeRule()); 
            pushFollow(FOLLOW_rulePatternType_in_entryRulePatternType7096);
            iv_rulePatternType=rulePatternType();

            state._fsp--;

             current =iv_rulePatternType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternType7107); 

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
    // $ANTLR end "entryRulePatternType"


    // $ANTLR start "rulePatternType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3419:1: rulePatternType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'EVENTUALLY HOLDS' | kw= 'NEVER HOLDS' | kw= 'ALWAYS HOLDS' | kw= 'HOLDS IN STEASY-STATE' | kw= 'HOLDS INFINITELY OFTEN' ) ;
    public final AntlrDatatypeRuleToken rulePatternType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3422:28: ( (kw= 'EVENTUALLY HOLDS' | kw= 'NEVER HOLDS' | kw= 'ALWAYS HOLDS' | kw= 'HOLDS IN STEASY-STATE' | kw= 'HOLDS INFINITELY OFTEN' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3423:1: (kw= 'EVENTUALLY HOLDS' | kw= 'NEVER HOLDS' | kw= 'ALWAYS HOLDS' | kw= 'HOLDS IN STEASY-STATE' | kw= 'HOLDS INFINITELY OFTEN' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3423:1: (kw= 'EVENTUALLY HOLDS' | kw= 'NEVER HOLDS' | kw= 'ALWAYS HOLDS' | kw= 'HOLDS IN STEASY-STATE' | kw= 'HOLDS INFINITELY OFTEN' )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt58=1;
                }
                break;
            case 71:
                {
                alt58=2;
                }
                break;
            case 72:
                {
                alt58=3;
                }
                break;
            case 73:
                {
                alt58=4;
                }
                break;
            case 74:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3424:2: kw= 'EVENTUALLY HOLDS'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_rulePatternType7145); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPatternTypeAccess().getEVENTUALLYHOLDSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3431:2: kw= 'NEVER HOLDS'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_rulePatternType7164); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPatternTypeAccess().getNEVERHOLDSKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3438:2: kw= 'ALWAYS HOLDS'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_rulePatternType7183); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPatternTypeAccess().getALWAYSHOLDSKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3445:2: kw= 'HOLDS IN STEASY-STATE'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_rulePatternType7202); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPatternTypeAccess().getHOLDSINSTEASYSTATEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3452:2: kw= 'HOLDS INFINITELY OFTEN'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_rulePatternType7221); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPatternTypeAccess().getHOLDSINFINITELYOFTENKeyword_4()); 
                        

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
    // $ANTLR end "rulePatternType"


    // $ANTLR start "entryRuleSequencePatternType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3465:1: entryRuleSequencePatternType returns [String current=null] : iv_ruleSequencePatternType= ruleSequencePatternType EOF ;
    public final String entryRuleSequencePatternType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSequencePatternType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3466:2: (iv_ruleSequencePatternType= ruleSequencePatternType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3467:2: iv_ruleSequencePatternType= ruleSequencePatternType EOF
            {
             newCompositeNode(grammarAccess.getSequencePatternTypeRule()); 
            pushFollow(FOLLOW_ruleSequencePatternType_in_entryRuleSequencePatternType7262);
            iv_ruleSequencePatternType=ruleSequencePatternType();

            state._fsp--;

             current =iv_ruleSequencePatternType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencePatternType7273); 

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
    // $ANTLR end "entryRuleSequencePatternType"


    // $ANTLR start "ruleSequencePatternType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3474:1: ruleSequencePatternType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WILL HOLD UNTIL THEN' | kw= 'IS FOLLOWED BY' ) ;
    public final AntlrDatatypeRuleToken ruleSequencePatternType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3477:28: ( (kw= 'WILL HOLD UNTIL THEN' | kw= 'IS FOLLOWED BY' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3478:1: (kw= 'WILL HOLD UNTIL THEN' | kw= 'IS FOLLOWED BY' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3478:1: (kw= 'WILL HOLD UNTIL THEN' | kw= 'IS FOLLOWED BY' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==75) ) {
                alt59=1;
            }
            else if ( (LA59_0==76) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3479:2: kw= 'WILL HOLD UNTIL THEN'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleSequencePatternType7311); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSequencePatternTypeAccess().getWILLHOLDUNTILTHENKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3486:2: kw= 'IS FOLLOWED BY'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleSequencePatternType7330); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSequencePatternTypeAccess().getISFOLLOWEDBYKeyword_1()); 
                        

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
    // $ANTLR end "ruleSequencePatternType"


    // $ANTLR start "entryRuleStateExpression"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3499:1: entryRuleStateExpression returns [EObject current=null] : iv_ruleStateExpression= ruleStateExpression EOF ;
    public final EObject entryRuleStateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3500:2: (iv_ruleStateExpression= ruleStateExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3501:2: iv_ruleStateExpression= ruleStateExpression EOF
            {
             newCompositeNode(grammarAccess.getStateExpressionRule()); 
            pushFollow(FOLLOW_ruleStateExpression_in_entryRuleStateExpression7370);
            iv_ruleStateExpression=ruleStateExpression();

            state._fsp--;

             current =iv_ruleStateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateExpression7380); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3508:1: ruleStateExpression returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleConcentrationQuantity ) ) ) ;
    public final EObject ruleStateExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_lhs_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3511:28: ( ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleConcentrationQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3512:1: ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleConcentrationQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3512:1: ( () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleConcentrationQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3512:2: () ( (lv_lhs_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rhs_3_0= ruleConcentrationQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3512:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3513:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateExpressionAccess().getStateExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:2: ( (lv_lhs_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3519:1: (lv_lhs_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3519:1: (lv_lhs_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3520:3: lv_lhs_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getLhsVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleStateExpression7435);
            lv_lhs_1_0=ruleVariableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"VariableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3536:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3537:1: (lv_operator_2_0= ruleRelationalOperator )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3537:1: (lv_operator_2_0= ruleRelationalOperator )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3538:3: lv_operator_2_0= ruleRelationalOperator
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getOperatorRelationalOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleStateExpression7456);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3554:2: ( (lv_rhs_3_0= ruleConcentrationQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3555:1: (lv_rhs_3_0= ruleConcentrationQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3555:1: (lv_rhs_3_0= ruleConcentrationQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3556:3: lv_rhs_3_0= ruleConcentrationQuantity
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getRhsConcentrationQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_ruleStateExpression7477);
            lv_rhs_3_0=ruleConcentrationQuantity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3580:1: entryRuleStateFormula returns [EObject current=null] : iv_ruleStateFormula= ruleStateFormula EOF ;
    public final EObject entryRuleStateFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFormula = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3581:2: (iv_ruleStateFormula= ruleStateFormula EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3582:2: iv_ruleStateFormula= ruleStateFormula EOF
            {
             newCompositeNode(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula7513);
            iv_ruleStateFormula=ruleStateFormula();

            state._fsp--;

             current =iv_ruleStateFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula7523); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3589:1: ruleStateFormula returns [EObject current=null] : ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' otherlv_5= 'NOT' ( (lv_notFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_booleanFormula1_9_0= ruleStateFormula ) ) (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' ) ( (lv_booleanFormula2_13_0= ruleStateFormula ) ) otherlv_14= ']' ) ) ;
    public final EObject ruleStateFormula() throws RecognitionException {
        EObject current = null;

        Token lv_formula_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_atomicFormula_2_0 = null;

        EObject lv_notFormula_6_0 = null;

        EObject lv_booleanFormula1_9_0 = null;

        EObject lv_booleanFormula2_13_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3592:28: ( ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' otherlv_5= 'NOT' ( (lv_notFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_booleanFormula1_9_0= ruleStateFormula ) ) (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' ) ( (lv_booleanFormula2_13_0= ruleStateFormula ) ) otherlv_14= ']' ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3593:1: ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' otherlv_5= 'NOT' ( (lv_notFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_booleanFormula1_9_0= ruleStateFormula ) ) (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' ) ( (lv_booleanFormula2_13_0= ruleStateFormula ) ) otherlv_14= ']' ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3593:1: ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' otherlv_5= 'NOT' ( (lv_notFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_booleanFormula1_9_0= ruleStateFormula ) ) (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' ) ( (lv_booleanFormula2_13_0= ruleStateFormula ) ) otherlv_14= ']' ) )
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==61) ) {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt61=3;
                    }
                    break;
                case 77:
                    {
                    alt61=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt61=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3593:2: ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3593:2: ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3593:3: () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']'
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3593:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3594:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStateFormulaAccess().getStateFormulaAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3599:2: ( (lv_formula_1_0= '[' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3600:1: (lv_formula_1_0= '[' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3600:1: (lv_formula_1_0= '[' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3601:3: lv_formula_1_0= '['
                    {
                    lv_formula_1_0=(Token)match(input,61,FOLLOW_61_in_ruleStateFormula7576); 

                            newLeafNode(lv_formula_1_0, grammarAccess.getStateFormulaAccess().getFormulaLeftSquareBracketKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateFormulaRule());
                    	        }
                           		setWithLastConsumed(current, "formula", lv_formula_1_0, "[");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3614:2: ( (lv_atomicFormula_2_0= ruleStateExpression ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3615:1: (lv_atomicFormula_2_0= ruleStateExpression )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3615:1: (lv_atomicFormula_2_0= ruleStateExpression )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3616:3: lv_atomicFormula_2_0= ruleStateExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getAtomicFormulaStateExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateExpression_in_ruleStateFormula7610);
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

                    otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleStateFormula7622); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateFormulaAccess().getRightSquareBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3637:6: (otherlv_4= '[' otherlv_5= 'NOT' ( (lv_notFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3637:6: (otherlv_4= '[' otherlv_5= 'NOT' ( (lv_notFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3637:8: otherlv_4= '[' otherlv_5= 'NOT' ( (lv_notFormula_6_0= ruleStateFormula ) ) otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleStateFormula7642); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateFormulaAccess().getLeftSquareBracketKeyword_1_0());
                        
                    otherlv_5=(Token)match(input,77,FOLLOW_77_in_ruleStateFormula7654); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateFormulaAccess().getNOTKeyword_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3645:1: ( (lv_notFormula_6_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3646:1: (lv_notFormula_6_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3646:1: (lv_notFormula_6_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3647:3: lv_notFormula_6_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getNotFormulaStateFormulaParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula7675);
                    lv_notFormula_6_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"notFormula",
                            		lv_notFormula_6_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleStateFormula7687); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateFormulaAccess().getRightSquareBracketKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3668:6: (otherlv_8= '[' ( (lv_booleanFormula1_9_0= ruleStateFormula ) ) (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' ) ( (lv_booleanFormula2_13_0= ruleStateFormula ) ) otherlv_14= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3668:6: (otherlv_8= '[' ( (lv_booleanFormula1_9_0= ruleStateFormula ) ) (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' ) ( (lv_booleanFormula2_13_0= ruleStateFormula ) ) otherlv_14= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3668:8: otherlv_8= '[' ( (lv_booleanFormula1_9_0= ruleStateFormula ) ) (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' ) ( (lv_booleanFormula2_13_0= ruleStateFormula ) ) otherlv_14= ']'
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_61_in_ruleStateFormula7707); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateFormulaAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3672:1: ( (lv_booleanFormula1_9_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3673:1: (lv_booleanFormula1_9_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3673:1: (lv_booleanFormula1_9_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:3: lv_booleanFormula1_9_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getBooleanFormula1StateFormulaParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula7728);
                    lv_booleanFormula1_9_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		add(
                           			current, 
                           			"booleanFormula1",
                            		lv_booleanFormula1_9_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3690:2: (otherlv_10= 'AND' | otherlv_11= 'OR' | otherlv_12= 'IMPLIES' )
                    int alt60=3;
                    switch ( input.LA(1) ) {
                    case 78:
                        {
                        alt60=1;
                        }
                        break;
                    case 79:
                        {
                        alt60=2;
                        }
                        break;
                    case 80:
                        {
                        alt60=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3690:4: otherlv_10= 'AND'
                            {
                            otherlv_10=(Token)match(input,78,FOLLOW_78_in_ruleStateFormula7741); 

                                	newLeafNode(otherlv_10, grammarAccess.getStateFormulaAccess().getANDKeyword_2_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3695:7: otherlv_11= 'OR'
                            {
                            otherlv_11=(Token)match(input,79,FOLLOW_79_in_ruleStateFormula7759); 

                                	newLeafNode(otherlv_11, grammarAccess.getStateFormulaAccess().getORKeyword_2_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3700:7: otherlv_12= 'IMPLIES'
                            {
                            otherlv_12=(Token)match(input,80,FOLLOW_80_in_ruleStateFormula7777); 

                                	newLeafNode(otherlv_12, grammarAccess.getStateFormulaAccess().getIMPLIESKeyword_2_2_2());
                                

                            }
                            break;

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3704:2: ( (lv_booleanFormula2_13_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3705:1: (lv_booleanFormula2_13_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3705:1: (lv_booleanFormula2_13_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3706:3: lv_booleanFormula2_13_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getBooleanFormula2StateFormulaParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula7799);
                    lv_booleanFormula2_13_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		add(
                           			current, 
                           			"booleanFormula2",
                            		lv_booleanFormula2_13_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,62,FOLLOW_62_in_ruleStateFormula7811); 

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


    // $ANTLR start "entryRulePropertyInitialCondition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3734:1: entryRulePropertyInitialCondition returns [EObject current=null] : iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF ;
    public final EObject entryRulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInitialCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3735:2: (iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3736:2: iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyInitialConditionRule()); 
            pushFollow(FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition7848);
            iv_rulePropertyInitialCondition=rulePropertyInitialCondition();

            state._fsp--;

             current =iv_rulePropertyInitialCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInitialCondition7858); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3743:1: rulePropertyInitialCondition returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) ) ;
    public final EObject rulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3746:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3747:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3747:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3747:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3747:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3748:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyInitialConditionAccess().getPropertyInitialConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3753:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3754:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3754:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3755:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition7913);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulePropertyInitialCondition7925); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyInitialConditionAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3775:1: ( (lv_value_3_0= ruleConcentrationQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3776:1: (lv_value_3_0= ruleConcentrationQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3776:1: (lv_value_3_0= ruleConcentrationQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3777:3: lv_value_3_0= ruleConcentrationQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getValueConcentrationQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_rulePropertyInitialCondition7946);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3801:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3802:2: (iv_ruleREAL= ruleREAL EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3803:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL7983);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL7994); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3810:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decimal_0 = null;

        AntlrDatatypeRuleToken this_DecimalExp_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3813:28: ( (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3814:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3814:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            int alt62=2;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        int LA62_4 = input.LA(4);

                        if ( (LA62_4==RULE_INT) ) {
                            int LA62_7 = input.LA(5);

                            if ( ((LA62_7>=83 && LA62_7<=84)) ) {
                                alt62=2;
                            }
                            else if ( (LA62_7==EOF||LA62_7==RULE_ID||(LA62_7>=15 && LA62_7<=16)||LA62_7==18||(LA62_7>=20 && LA62_7<=22)||LA62_7==26||(LA62_7>=35 && LA62_7<=52)||LA62_7==55||LA62_7==57||LA62_7==59||LA62_7==62||(LA62_7>=85 && LA62_7<=97)) ) {
                                alt62=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 62, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 83:
                    case 84:
                        {
                        alt62=2;
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
                    case 26:
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
                    case 62:
                    case 85:
                    case 86:
                    case 87:
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
                        {
                        alt62=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                int LA62_2 = input.LA(2);

                if ( (LA62_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        int LA62_4 = input.LA(4);

                        if ( (LA62_4==RULE_INT) ) {
                            int LA62_7 = input.LA(5);

                            if ( ((LA62_7>=83 && LA62_7<=84)) ) {
                                alt62=2;
                            }
                            else if ( (LA62_7==EOF||LA62_7==RULE_ID||(LA62_7>=15 && LA62_7<=16)||LA62_7==18||(LA62_7>=20 && LA62_7<=22)||LA62_7==26||(LA62_7>=35 && LA62_7<=52)||LA62_7==55||LA62_7==57||LA62_7==59||LA62_7==62||(LA62_7>=85 && LA62_7<=97)) ) {
                                alt62=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 62, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 83:
                    case 84:
                        {
                        alt62=2;
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
                    case 26:
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
                    case 62:
                    case 85:
                    case 86:
                    case 87:
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
                        {
                        alt62=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    int LA62_4 = input.LA(3);

                    if ( (LA62_4==RULE_INT) ) {
                        int LA62_7 = input.LA(4);

                        if ( ((LA62_7>=83 && LA62_7<=84)) ) {
                            alt62=2;
                        }
                        else if ( (LA62_7==EOF||LA62_7==RULE_ID||(LA62_7>=15 && LA62_7<=16)||LA62_7==18||(LA62_7>=20 && LA62_7<=22)||LA62_7==26||(LA62_7>=35 && LA62_7<=52)||LA62_7==55||LA62_7==57||LA62_7==59||LA62_7==62||(LA62_7>=85 && LA62_7<=97)) ) {
                            alt62=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 83:
                case 84:
                    {
                    alt62=2;
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
                case 26:
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
                case 62:
                case 85:
                case 86:
                case 87:
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
                    {
                    alt62=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3815:5: this_Decimal_0= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecimal_in_ruleREAL8041);
                    this_Decimal_0=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3827:5: this_DecimalExp_1= ruleDecimalExp
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDecimalExp_in_ruleREAL8074);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3845:1: entryRuleUnitInterval returns [String current=null] : iv_ruleUnitInterval= ruleUnitInterval EOF ;
    public final String entryRuleUnitInterval() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnitInterval = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3846:2: (iv_ruleUnitInterval= ruleUnitInterval EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3847:2: iv_ruleUnitInterval= ruleUnitInterval EOF
            {
             newCompositeNode(grammarAccess.getUnitIntervalRule()); 
            pushFollow(FOLLOW_ruleUnitInterval_in_entryRuleUnitInterval8120);
            iv_ruleUnitInterval=ruleUnitInterval();

            state._fsp--;

             current =iv_ruleUnitInterval.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitInterval8131); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3854:1: ruleUnitInterval returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) ) ;
    public final AntlrDatatypeRuleToken ruleUnitInterval() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3857:28: ( (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3858:1: (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3858:1: (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt65=1;
                }
                break;
            case 31:
                {
                alt65=2;
                }
                break;
            case 82:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3859:2: kw= '1.0'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleUnitInterval8169); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getDigitOneFullStopDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3865:6: (kw= '.' (this_INT_2= RULE_INT )* )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3865:6: (kw= '.' (this_INT_2= RULE_INT )* )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3866:2: kw= '.' (this_INT_2= RULE_INT )*
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleUnitInterval8189); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getFullStopKeyword_1_0()); 
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3871:1: (this_INT_2= RULE_INT )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_INT) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3871:6: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnitInterval8205); 

                    	    		current.merge(this_INT_2);
                    	        
                    	     
                    	        newLeafNode(this_INT_2, grammarAccess.getUnitIntervalAccess().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3879:6: (kw= '0.' (this_INT_4= RULE_INT )* )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3879:6: (kw= '0.' (this_INT_4= RULE_INT )* )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3880:2: kw= '0.' (this_INT_4= RULE_INT )*
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleUnitInterval8233); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getDigitZeroFullStopKeyword_2_0()); 
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3885:1: (this_INT_4= RULE_INT )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==RULE_INT) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3885:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnitInterval8249); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getUnitIntervalAccess().getINTTerminalRuleCall_2_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3900:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3904:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3905:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal8304);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal8315); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3915:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3919:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3920:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3920:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3920:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3920:2: (kw= '+' | kw= '-' )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==49) ) {
                alt66=1;
            }
            else if ( (LA66_0==50) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3921:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDecimal8358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3928:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDecimal8377); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal8394); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3940:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==31) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3941:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleDecimal8413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal8428); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3964:1: entryRuleDecimalExp returns [String current=null] : iv_ruleDecimalExp= ruleDecimalExp EOF ;
    public final String entryRuleDecimalExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimalExp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3968:2: (iv_ruleDecimalExp= ruleDecimalExp EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3969:2: iv_ruleDecimalExp= ruleDecimalExp EOF
            {
             newCompositeNode(grammarAccess.getDecimalExpRule()); 
            pushFollow(FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp8486);
            iv_ruleDecimalExp=ruleDecimalExp();

            state._fsp--;

             current =iv_ruleDecimalExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalExp8497); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3979:1: ruleDecimalExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimalExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_9=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3983:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3984:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3984:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3984:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3984:2: (kw= '+' | kw= '-' )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==49) ) {
                alt68=1;
            }
            else if ( (LA68_0==50) ) {
                alt68=2;
            }
            switch (alt68) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3985:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDecimalExp8540); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3992:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDecimalExp8559); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp8576); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4004:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==31) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4005:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleDecimalExp8595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp8610); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4017:3: (kw= 'E' | kw= 'e' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==83) ) {
                alt70=1;
            }
            else if ( (LA70_0==84) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4018:2: kw= 'E'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleDecimalExp8631); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4025:2: kw= 'e'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleDecimalExp8650); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4030:2: (kw= '+' | kw= '-' )?
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==49) ) {
                alt71=1;
            }
            else if ( (LA71_0==50) ) {
                alt71=2;
            }
            switch (alt71) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4031:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDecimalExp8665); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4038:2: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDecimalExp8684); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 
                        

                    }
                    break;

            }

            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp8701); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4061:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4062:2: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4063:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_ruleTimeUnit_in_entryRuleTimeUnit8751);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeUnit8762); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4070:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's' | kw= 'min' | kw= 'mins' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4073:28: ( (kw= 's' | kw= 'min' | kw= 'mins' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4074:1: (kw= 's' | kw= 'min' | kw= 'mins' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4074:1: (kw= 's' | kw= 'min' | kw= 'mins' )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt72=1;
                }
                break;
            case 86:
                {
                alt72=2;
                }
                break;
            case 87:
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4075:2: kw= 's'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleTimeUnit8800); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4082:2: kw= 'min'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTimeUnit8819); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMinKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4089:2: kw= 'mins'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleTimeUnit8838); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4102:1: entryRuleFluxUnit returns [String current=null] : iv_ruleFluxUnit= ruleFluxUnit EOF ;
    public final String entryRuleFluxUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFluxUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4103:2: (iv_ruleFluxUnit= ruleFluxUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4104:2: iv_ruleFluxUnit= ruleFluxUnit EOF
            {
             newCompositeNode(grammarAccess.getFluxUnitRule()); 
            pushFollow(FOLLOW_ruleFluxUnit_in_entryRuleFluxUnit8879);
            iv_ruleFluxUnit=ruleFluxUnit();

            state._fsp--;

             current =iv_ruleFluxUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluxUnit8890); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4111:1: ruleFluxUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's^-1' | kw= 'min^-1' ) ;
    public final AntlrDatatypeRuleToken ruleFluxUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4114:28: ( (kw= 's^-1' | kw= 'min^-1' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4115:1: (kw= 's^-1' | kw= 'min^-1' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4115:1: (kw= 's^-1' | kw= 'min^-1' )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==88) ) {
                alt73=1;
            }
            else if ( (LA73_0==89) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4116:2: kw= 's^-1'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleFluxUnit8928); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFluxUnitAccess().getS1Keyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4123:2: kw= 'min^-1'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleFluxUnit8947); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4136:1: entryRuleConcentrationUnit returns [String current=null] : iv_ruleConcentrationUnit= ruleConcentrationUnit EOF ;
    public final String entryRuleConcentrationUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConcentrationUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4137:2: (iv_ruleConcentrationUnit= ruleConcentrationUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4138:2: iv_ruleConcentrationUnit= ruleConcentrationUnit EOF
            {
             newCompositeNode(grammarAccess.getConcentrationUnitRule()); 
            pushFollow(FOLLOW_ruleConcentrationUnit_in_entryRuleConcentrationUnit8988);
            iv_ruleConcentrationUnit=ruleConcentrationUnit();

            state._fsp--;

             current =iv_ruleConcentrationUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationUnit8999); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4145:1: ruleConcentrationUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) ;
    public final AntlrDatatypeRuleToken ruleConcentrationUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4148:28: ( (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4149:1: (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4149:1: (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            int alt74=8;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt74=1;
                }
                break;
            case 91:
                {
                alt74=2;
                }
                break;
            case 92:
                {
                alt74=3;
                }
                break;
            case 93:
                {
                alt74=4;
                }
                break;
            case 94:
                {
                alt74=5;
                }
                break;
            case 95:
                {
                alt74=6;
                }
                break;
            case 96:
                {
                alt74=7;
                }
                break;
            case 97:
                {
                alt74=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4150:2: kw= 'M'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleConcentrationUnit9037); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4157:2: kw= 'mM'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleConcentrationUnit9056); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMMKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4164:2: kw= 'uM'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleConcentrationUnit9075); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getUMKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4171:2: kw= 'nM'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleConcentrationUnit9094); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getNMKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4178:2: kw= 'pM'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleConcentrationUnit9113); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getPMKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4185:2: kw= 'fM'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleConcentrationUnit9132); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getFMKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4192:2: kw= 'molecule'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleConcentrationUnit9151); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMoleculeKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4199:2: kw= 'molecules'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleConcentrationUnit9170); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4212:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4213:2: (iv_ruleUnit= ruleUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4214:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit9211);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit9222); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4221:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TimeUnit_0 = null;

        AntlrDatatypeRuleToken this_FluxUnit_1 = null;

        AntlrDatatypeRuleToken this_ConcentrationUnit_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4224:28: ( (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4225:1: (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4225:1: (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 85:
            case 86:
            case 87:
                {
                alt75=1;
                }
                break;
            case 88:
            case 89:
                {
                alt75=2;
                }
                break;
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4226:5: this_TimeUnit_0= ruleTimeUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getTimeUnitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleUnit9269);
                    this_TimeUnit_0=ruleTimeUnit();

                    state._fsp--;


                    		current.merge(this_TimeUnit_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4238:5: this_FluxUnit_1= ruleFluxUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getFluxUnitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFluxUnit_in_ruleUnit9302);
                    this_FluxUnit_1=ruleFluxUnit();

                    state._fsp--;


                    		current.merge(this_FluxUnit_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4250:5: this_ConcentrationUnit_2= ruleConcentrationUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getConcentrationUnitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleUnit9335);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4268:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4269:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4270:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_ruleQuantity_in_entryRuleQuantity9380);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantity9390); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4277:1: ruleQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_units_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4280:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4281:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4281:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4281:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4281:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4282:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityAccess().getQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4287:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4288:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4288:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4289:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleQuantity9445);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4305:2: ( (lv_units_2_0= ruleUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4306:1: (lv_units_2_0= ruleUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4306:1: (lv_units_2_0= ruleUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4307:3: lv_units_2_0= ruleUnit
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getUnitsUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnit_in_ruleQuantity9466);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4331:1: entryRuleConcentrationQuantity returns [EObject current=null] : iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF ;
    public final EObject entryRuleConcentrationQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcentrationQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4332:2: (iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4333:2: iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF
            {
             newCompositeNode(grammarAccess.getConcentrationQuantityRule()); 
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_entryRuleConcentrationQuantity9502);
            iv_ruleConcentrationQuantity=ruleConcentrationQuantity();

            state._fsp--;

             current =iv_ruleConcentrationQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationQuantity9512); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4340:1: ruleConcentrationQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleConcentrationUnit ) ) ) ;
    public final EObject ruleConcentrationQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_units_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4343:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleConcentrationUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4344:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleConcentrationUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4344:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleConcentrationUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4344:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleConcentrationUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4344:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4345:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConcentrationQuantityAccess().getConcentrationQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4350:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4351:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4351:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4352:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getConcentrationQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleConcentrationQuantity9567);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4368:2: ( (lv_units_2_0= ruleConcentrationUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4369:1: (lv_units_2_0= ruleConcentrationUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4369:1: (lv_units_2_0= ruleConcentrationUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4370:3: lv_units_2_0= ruleConcentrationUnit
            {
             
            	        newCompositeNode(grammarAccess.getConcentrationQuantityAccess().getUnitsConcentrationUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleConcentrationQuantity9588);
            lv_units_2_0=ruleConcentrationUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcentrationQuantityRule());
            	        }
                   		set(
                   			current, 
                   			"units",
                    		lv_units_2_0, 
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4394:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4395:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4396:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator9625);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator9636); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4403:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4406:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4407:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4407:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt76=1;
                }
                break;
            case 99:
                {
                alt76=2;
                }
                break;
            case 24:
                {
                alt76=3;
                }
                break;
            case 25:
                {
                alt76=4;
                }
                break;
            case 100:
                {
                alt76=5;
                }
                break;
            case 101:
                {
                alt76=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4408:2: kw= '=='
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleRelationalOperator9674); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4415:2: kw= '!='
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleRelationalOperator9693); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4422:2: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleRelationalOperator9712); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4429:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleRelationalOperator9731); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4436:2: kw= '<='
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleRelationalOperator9750); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4443:2: kw= '>='
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleRelationalOperator9769); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4458:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4459:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4460:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9812);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9823); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4467:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4470:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4471:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4471:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4472:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9870);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4482:1: (kw= '.*' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==102) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4483:2: kw= '.*'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleQualifiedNameWithWildcard9889); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4496:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4497:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4498:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9932);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9943); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4505:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4508:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4509:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4509:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4509:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9983); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4516:1: (kw= '.' this_ID_2= RULE_ID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==31) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4517:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleQualifiedName10002); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName10017); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop78;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4537:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4538:2: (iv_ruleList= ruleList EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4539:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList10064);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList10074); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4546:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4549:28: ( ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4550:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4550:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4550:2: () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4550:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4551:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListAccess().getListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleList10120); 

                	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4560:1: ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4561:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4561:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4562:3: lv_entries_2_0= ruleAtomicVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList10141);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4578:2: (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==15) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4578:4: otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleList10154); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_3_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4582:1: ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4583:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4583:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4584:3: lv_entries_4_0= ruleAtomicVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList10175);
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
            	    break loop79;
                }
            } while (true);

            otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleList10189); 

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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA17_eotS =
        "\25\uffff";
    static final String DFA17_eofS =
        "\21\uffff\1\23\3\uffff";
    static final String DFA17_minS =
        "\17\4\2\uffff\2\4\2\uffff";
    static final String DFA17_maxS =
        "\1\60\16\4\2\uffff\1\73\1\75\2\uffff";
    static final String DFA17_acceptS =
        "\17\uffff\1\2\1\3\2\uffff\1\1\1\4";
    static final String DFA17_specialS =
        "\25\uffff}>";
    static final String[] DFA17_transitionS = {
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
            "\1\23\15\uffff\1\23\1\uffff\3\23\3\uffff\1\23\3\uffff\1\23"+
            "\1\uffff\1\22\2\uffff\16\23\3\uffff\1\23\2\uffff\1\23\1\uffff"+
            "\1\23\1\uffff\1\23",
            "\3\24\32\uffff\1\23\17\uffff\2\24\12\uffff\1\24",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "980:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )";
        }
    }
    static final String DFA34_eotS =
        "\24\uffff";
    static final String DFA34_eofS =
        "\1\uffff\1\10\2\uffff\1\15\11\uffff\1\23\1\15\2\uffff\1\15\1\uffff";
    static final String DFA34_minS =
        "\2\4\2\6\1\4\2\uffff\1\4\1\uffff\3\6\2\uffff\2\4\2\6\1\4\1\uffff";
    static final String DFA34_maxS =
        "\1\62\1\76\2\6\1\141\2\uffff\1\4\1\uffff\1\6\2\62\2\uffff\1\76\1"+
        "\141\2\6\1\141\1\uffff";
    static final String DFA34_acceptS =
        "\5\uffff\1\6\1\2\1\uffff\1\1\3\uffff\1\5\1\4\5\uffff\1\3";
    static final String DFA34_specialS =
        "\24\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\1\5\1\4\52\uffff\1\2\1\3",
            "\1\10\12\uffff\2\10\1\uffff\1\10\1\uffff\3\10\3\uffff\1\10"+
            "\3\uffff\1\7\1\6\3\uffff\22\10\2\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\1\10\2\uffff\1\10",
            "\1\4",
            "\1\4",
            "\1\15\12\uffff\2\15\1\uffff\1\15\1\uffff\3\15\3\uffff\1\15"+
            "\4\uffff\1\11\3\uffff\22\15\2\uffff\1\15\1\uffff\1\15\1\uffff"+
            "\1\15\2\uffff\1\15\24\uffff\1\12\1\13\15\14",
            "",
            "",
            "\1\16",
            "",
            "\1\17",
            "\1\22\52\uffff\1\20\1\21",
            "\1\22\52\uffff\1\20\1\21",
            "",
            "",
            "\1\23\12\uffff\2\23\1\uffff\1\23\1\uffff\3\23\3\uffff\1\23"+
            "\3\uffff\1\7\1\6\3\uffff\22\23\2\uffff\1\23\1\uffff\1\23\1\uffff"+
            "\1\23\2\uffff\1\23",
            "\1\15\12\uffff\2\15\1\uffff\1\15\1\uffff\3\15\3\uffff\1\15"+
            "\10\uffff\22\15\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\2\uffff"+
            "\1\15\24\uffff\1\12\1\13\15\14",
            "\1\22",
            "\1\22",
            "\1\15\12\uffff\2\15\1\uffff\1\15\1\uffff\3\15\3\uffff\1\15"+
            "\10\uffff\22\15\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\2\uffff"+
            "\1\15\26\uffff\15\14",
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
            return "2086:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )";
        }
    }
    static final String DFA40_eotS =
        "\12\uffff";
    static final String DFA40_eofS =
        "\1\2\1\5\4\uffff\1\5\3\uffff";
    static final String DFA40_minS =
        "\2\4\1\uffff\2\4\1\uffff\4\4";
    static final String DFA40_maxS =
        "\2\73\1\uffff\1\4\1\73\1\uffff\1\73\1\75\1\73\1\75";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA40_specialS =
        "\12\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\15\uffff\1\2\1\uffff\3\2\14\uffff\16\2\3\uffff\1\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2",
            "\1\4\15\uffff\1\5\1\uffff\3\5\7\uffff\1\3\2\2\2\uffff\17\5"+
            "\2\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5",
            "",
            "\1\6",
            "\1\10\15\uffff\1\2\1\uffff\3\2\3\uffff\1\2\3\uffff\2\5\1\7"+
            "\2\uffff\16\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1"+
            "\2",
            "",
            "\1\5\15\uffff\1\5\1\uffff\3\5\7\uffff\1\3\1\2\3\uffff\17\5"+
            "\2\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5",
            "\3\5\32\uffff\1\2\17\uffff\2\5\12\uffff\1\5",
            "\1\4\15\uffff\1\5\1\uffff\3\5\3\uffff\1\5\3\uffff\2\2\1\11"+
            "\2\uffff\16\5\3\uffff\1\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1"+
            "\5",
            "\3\2\32\uffff\1\5\17\uffff\2\2\12\uffff\1\2"
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
            return "2404:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?";
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
    public static final BitSet FOLLOW_17_in_ruleFunctionDefinition639 = new BitSet(new long[]{0x0A91FFF800740010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleFunctionDefinition660 = new BitSet(new long[]{0x0A91FFF800740010L});
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
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition2109 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition2128 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition2147 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition2166 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleVariableDefinition2182 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn2241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2328 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn2355 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionBuiltIn2369 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionBuiltIn2381 = new BitSet(new long[]{0x00003FF800700010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn2404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn2423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinitionBuiltIn2438 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2460 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionBuiltIn2473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn2494 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionBuiltIn2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2634 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionUserDefined2647 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionUserDefined2659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined2680 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinitionUserDefined2692 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2714 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionUserDefined2727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined2748 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionUserDefined2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection2802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionCollection2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection2868 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVariableDefinitionCollection2880 = new BitSet(new long[]{0x00003FF800700010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection2903 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2922 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariableDefinitionCollection2937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection2958 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionCollection2972 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleVariableDefinitionCollection2993 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinitionCollection3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic3043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBasic3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic3108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic3129 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinitionBasic3141 = new BitSet(new long[]{0x2006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment3198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterAssignment3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleParameterAssignment3254 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleParameterAssignment3266 = new BitSet(new long[]{0x2006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier3324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVariableQualifier3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVariableType3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableType3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVariableType3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVariableType3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariableType3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVariableType3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVariableType3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVariableType3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVariableType3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVariableType3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVariableType3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleVariableType3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariableType3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariableType3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID3749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCollectionID3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCollectionID3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCollectionID3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment3876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment3941 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleVariableAssignment3953 = new BitSet(new long[]{0x2006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableAssignment3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject4010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentObject4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression4134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4199 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression4216 = new BitSet(new long[]{0x2006000000000070L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression4236 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject4274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionObject4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject4393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject4632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator4734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVariableExpressionOperator4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVariableExpressionOperator4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVariableExpressionOperator4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition4861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleRuleDefinition4917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleDefinition4938 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRuleDefinition4950 = new BitSet(new long[]{0x0060000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition4972 = new BitSet(new long[]{0x0062000000000000L});
    public static final BitSet FOLLOW_49_in_ruleRuleDefinition4985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition5006 = new BitSet(new long[]{0x0062000000000000L});
    public static final BitSet FOLLOW_53_in_ruleRuleDefinition5023 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_54_in_ruleRuleDefinition5047 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition5083 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRuleDefinition5096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition5117 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject5157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleObject5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleRuleObject5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition5281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDefinition5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDeviceDefinition5337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeviceDefinition5358 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition5370 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition5382 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleDeviceDefinition5394 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeviceDefinition5406 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleDeviceDefinition5418 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition5430 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition5451 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeviceDefinition5463 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeviceDefinition5475 = new BitSet(new long[]{0x0000000008018000L});
    public static final BitSet FOLLOW_27_in_ruleDeviceDefinition5488 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition5500 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition5521 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDeviceDefinition5536 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDeviceDefinition5548 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition5560 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition5581 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeviceDefinition5595 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition5607 = new BitSet(new long[]{0x0A91FFF800740010L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition5628 = new BitSet(new long[]{0x0A91FFF800740010L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers5677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceMembers5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition5823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCDefinition5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleATGCDefinition5879 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_ruleATGCDefinition5900 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleATGCDefinition5912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition5933 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleATGCDefinition5946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition5967 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand6006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCCommand6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleATGCCommand6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition6093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePropertyDefinition6149 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleProbabilityProperty_in_rulePropertyDefinition6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewardProperty_in_rulePropertyDefinition6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbabilityProperty_in_entryRuleProbabilityProperty6230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityProperty6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleProbabilityProperty6295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_rulePatternType_in_ruleProbabilityProperty6317 = new BitSet(new long[]{0x9000000000000002L,0x0000000000000005L});
    public static final BitSet FOLLOW_ruleSequencePatternType_in_ruleProbabilityProperty6345 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleProbabilityProperty6366 = new BitSet(new long[]{0x9000000000000002L,0x0000000000000005L});
    public static final BitSet FOLLOW_60_in_ruleProbabilityProperty6382 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleProbabilityProperty6394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProbabilityProperty6411 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProbabilityProperty6428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProbabilityProperty6445 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleProbabilityProperty6462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleProbabilityProperty6483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000005L});
    public static final BitSet FOLLOW_63_in_ruleProbabilityProperty6503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleProbabilityProperty6524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000005L});
    public static final BitSet FOLLOW_64_in_ruleProbabilityProperty6540 = new BitSet(new long[]{0x0000000003000000L,0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleProbabilityProperty6563 = new BitSet(new long[]{0x0000000080000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleUnitInterval_in_ruleProbabilityProperty6584 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_65_in_ruleProbabilityProperty6603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleProbabilityProperty6619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty6640 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleProbabilityProperty6653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty6674 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleRewardProperty_in_entryRuleRewardProperty6714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewardProperty6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleRewardProperty6770 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleRewardProperty6782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRewardProperty6803 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleRewardProperty6815 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleRewardProperty6828 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_60_in_ruleRewardProperty6846 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRewardProperty6864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleRewardProperty6890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleRewardProperty6902 = new BitSet(new long[]{0x0000000003000000L,0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleRewardProperty6925 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleRewardProperty6946 = new BitSet(new long[]{0x0000000000000000L,0x00000003FC000000L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleRewardProperty6967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_65_in_ruleRewardProperty6986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleRewardProperty7000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty7021 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRewardProperty7034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty7055 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePatternType_in_entryRulePatternType7096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternType7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePatternType7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePatternType7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePatternType7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePatternType7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePatternType7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePatternType_in_entryRuleSequencePatternType7262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencePatternType7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleSequencePatternType7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSequencePatternType7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateExpression_in_entryRuleStateExpression7370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExpression7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleStateExpression7435 = new BitSet(new long[]{0x0000000003000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleStateExpression7456 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_ruleStateExpression7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula7513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStateFormula7576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStateExpression_in_ruleStateFormula7610 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStateFormula7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStateFormula7642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleStateFormula7654 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula7675 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStateFormula7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStateFormula7707 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula7728 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_78_in_ruleStateFormula7741 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_79_in_ruleStateFormula7759 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_80_in_ruleStateFormula7777 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula7799 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStateFormula7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition7848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInitialCondition7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition7913 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePropertyInitialCondition7925 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_rulePropertyInitialCondition7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL7983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleREAL8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_ruleREAL8074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitInterval_in_entryRuleUnitInterval8120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitInterval8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleUnitInterval8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleUnitInterval8189 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnitInterval8205 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_82_in_ruleUnitInterval8233 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnitInterval8249 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal8304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDecimal8358 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50_in_ruleDecimal8377 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal8394 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleDecimal8413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp8486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalExp8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDecimalExp8540 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50_in_ruleDecimalExp8559 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp8576 = new BitSet(new long[]{0x0000000080000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_31_in_ruleDecimalExp8595 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp8610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_ruleDecimalExp8631 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_84_in_ruleDecimalExp8650 = new BitSet(new long[]{0x0006000000000040L});
    public static final BitSet FOLLOW_49_in_ruleDecimalExp8665 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50_in_ruleDecimalExp8684 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_entryRuleTimeUnit8751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeUnit8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTimeUnit8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTimeUnit8819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTimeUnit8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluxUnit_in_entryRuleFluxUnit8879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluxUnit8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleFluxUnit8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleFluxUnit8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_entryRuleConcentrationUnit8988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationUnit8999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleConcentrationUnit9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleConcentrationUnit9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleConcentrationUnit9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleConcentrationUnit9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleConcentrationUnit9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleConcentrationUnit9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleConcentrationUnit9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleConcentrationUnit9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit9211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleUnit9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluxUnit_in_ruleUnit9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleUnit9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity9380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantity9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleQuantity9445 = new BitSet(new long[]{0x0000000000000000L,0x00000003FFE00000L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleQuantity9466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_entryRuleConcentrationQuantity9502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationQuantity9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleConcentrationQuantity9567 = new BitSet(new long[]{0x0000000000000000L,0x00000003FC000000L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleConcentrationQuantity9588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator9625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleRelationalOperator9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleRelationalOperator9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRelationalOperator9712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRelationalOperator9731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleRelationalOperator9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleRelationalOperator9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard9812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard9823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard9870 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleQualifiedNameWithWildcard9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9983 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleQualifiedName10002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName10017 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList10064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleList10120 = new BitSet(new long[]{0x0006000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList10141 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleList10154 = new BitSet(new long[]{0x0006000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList10175 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_62_in_ruleList10189 = new BitSet(new long[]{0x0000000000000002L});

}