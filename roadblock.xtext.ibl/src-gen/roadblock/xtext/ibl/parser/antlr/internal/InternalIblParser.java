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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:212:1: ruleFunctionDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_functionBody_4_0= ruleFunctionBodyType ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_functionBody_4_0 = null;

        EObject lv_uses_6_0 = null;

        EObject lv_uses_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:215:28: ( ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_functionBody_4_0= ruleFunctionBodyType ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:216:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_functionBody_4_0= ruleFunctionBodyType ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:216:1: ( () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_functionBody_4_0= ruleFunctionBodyType ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:216:2: () otherlv_1= 'define' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= 'typeof' ( (lv_functionBody_4_0= ruleFunctionBodyType ) ) (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )?
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
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:248:1: ( (lv_functionBody_4_0= ruleFunctionBodyType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:249:1: (lv_functionBody_4_0= ruleFunctionBodyType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:249:1: (lv_functionBody_4_0= ruleFunctionBodyType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:250:3: lv_functionBody_4_0= ruleFunctionBodyType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyFunctionBodyTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionBodyType_in_ruleFunctionDefinition521);
            lv_functionBody_4_0=ruleFunctionBodyType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"functionBody",
                    		lv_functionBody_4_0, 
                    		"FunctionBodyType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:266:2: (otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:266:4: otherlv_5= 'USES' ( (lv_uses_6_0= ruleFunctionUseMember ) ) (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )*
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition534); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_5_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:270:1: ( (lv_uses_6_0= ruleFunctionUseMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:271:1: (lv_uses_6_0= ruleFunctionUseMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:271:1: (lv_uses_6_0= ruleFunctionUseMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:272:3: lv_uses_6_0= ruleFunctionUseMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition555);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:288:2: (otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:288:4: otherlv_7= ',' ( (lv_uses_8_0= ruleFunctionUseMember ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition568); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:292:1: ( (lv_uses_8_0= ruleFunctionUseMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:293:1: (lv_uses_8_0= ruleFunctionUseMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:293:1: (lv_uses_8_0= ruleFunctionUseMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:294:3: lv_uses_8_0= ruleFunctionUseMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition589);
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
                    	    break loop3;
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


    // $ANTLR start "entryRuleFunctionBodyType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:318:1: entryRuleFunctionBodyType returns [EObject current=null] : iv_ruleFunctionBodyType= ruleFunctionBodyType EOF ;
    public final EObject entryRuleFunctionBodyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:319:2: (iv_ruleFunctionBodyType= ruleFunctionBodyType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:320:2: iv_ruleFunctionBodyType= ruleFunctionBodyType EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyTypeRule()); 
            pushFollow(FOLLOW_ruleFunctionBodyType_in_entryRuleFunctionBodyType629);
            iv_ruleFunctionBodyType=ruleFunctionBodyType();

            state._fsp--;

             current =iv_ruleFunctionBodyType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBodyType639); 

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
    // $ANTLR end "entryRuleFunctionBodyType"


    // $ANTLR start "ruleFunctionBodyType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:327:1: ruleFunctionBodyType returns [EObject current=null] : (this_ProcessBody_0= ruleProcessBody | this_SystemBody_1= ruleSystemBody | this_PlasmidBody_2= rulePlasmidBody | this_ChromosomeBody_3= ruleChromosomeBody | this_CellBody_4= ruleCellBody | this_RegionBody_5= ruleRegionBody | this_CustomFunctionBody_6= ruleCustomFunctionBody ) ;
    public final EObject ruleFunctionBodyType() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessBody_0 = null;

        EObject this_SystemBody_1 = null;

        EObject this_PlasmidBody_2 = null;

        EObject this_ChromosomeBody_3 = null;

        EObject this_CellBody_4 = null;

        EObject this_RegionBody_5 = null;

        EObject this_CustomFunctionBody_6 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:330:28: ( (this_ProcessBody_0= ruleProcessBody | this_SystemBody_1= ruleSystemBody | this_PlasmidBody_2= rulePlasmidBody | this_ChromosomeBody_3= ruleChromosomeBody | this_CellBody_4= ruleCellBody | this_RegionBody_5= ruleRegionBody | this_CustomFunctionBody_6= ruleCustomFunctionBody ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:331:1: (this_ProcessBody_0= ruleProcessBody | this_SystemBody_1= ruleSystemBody | this_PlasmidBody_2= rulePlasmidBody | this_ChromosomeBody_3= ruleChromosomeBody | this_CellBody_4= ruleCellBody | this_RegionBody_5= ruleRegionBody | this_CustomFunctionBody_6= ruleCustomFunctionBody )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:331:1: (this_ProcessBody_0= ruleProcessBody | this_SystemBody_1= ruleSystemBody | this_PlasmidBody_2= rulePlasmidBody | this_ChromosomeBody_3= ruleChromosomeBody | this_CellBody_4= ruleCellBody | this_RegionBody_5= ruleRegionBody | this_CustomFunctionBody_6= ruleCustomFunctionBody )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case RULE_ID:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:332:5: this_ProcessBody_0= ruleProcessBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyTypeAccess().getProcessBodyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProcessBody_in_ruleFunctionBodyType686);
                    this_ProcessBody_0=ruleProcessBody();

                    state._fsp--;

                     
                            current = this_ProcessBody_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:342:5: this_SystemBody_1= ruleSystemBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyTypeAccess().getSystemBodyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSystemBody_in_ruleFunctionBodyType713);
                    this_SystemBody_1=ruleSystemBody();

                    state._fsp--;

                     
                            current = this_SystemBody_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:352:5: this_PlasmidBody_2= rulePlasmidBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyTypeAccess().getPlasmidBodyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePlasmidBody_in_ruleFunctionBodyType740);
                    this_PlasmidBody_2=rulePlasmidBody();

                    state._fsp--;

                     
                            current = this_PlasmidBody_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:362:5: this_ChromosomeBody_3= ruleChromosomeBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyTypeAccess().getChromosomeBodyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleChromosomeBody_in_ruleFunctionBodyType767);
                    this_ChromosomeBody_3=ruleChromosomeBody();

                    state._fsp--;

                     
                            current = this_ChromosomeBody_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:372:5: this_CellBody_4= ruleCellBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyTypeAccess().getCellBodyParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCellBody_in_ruleFunctionBodyType794);
                    this_CellBody_4=ruleCellBody();

                    state._fsp--;

                     
                            current = this_CellBody_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:382:5: this_RegionBody_5= ruleRegionBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyTypeAccess().getRegionBodyParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRegionBody_in_ruleFunctionBodyType821);
                    this_RegionBody_5=ruleRegionBody();

                    state._fsp--;

                     
                            current = this_RegionBody_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:392:5: this_CustomFunctionBody_6= ruleCustomFunctionBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyTypeAccess().getCustomFunctionBodyParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCustomFunctionBody_in_ruleFunctionBodyType848);
                    this_CustomFunctionBody_6=ruleCustomFunctionBody();

                    state._fsp--;

                     
                            current = this_CustomFunctionBody_6; 
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
    // $ANTLR end "ruleFunctionBodyType"


    // $ANTLR start "entryRuleProcessBody"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:408:1: entryRuleProcessBody returns [EObject current=null] : iv_ruleProcessBody= ruleProcessBody EOF ;
    public final EObject entryRuleProcessBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:409:2: (iv_ruleProcessBody= ruleProcessBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:410:2: iv_ruleProcessBody= ruleProcessBody EOF
            {
             newCompositeNode(grammarAccess.getProcessBodyRule()); 
            pushFollow(FOLLOW_ruleProcessBody_in_entryRuleProcessBody883);
            iv_ruleProcessBody=ruleProcessBody();

            state._fsp--;

             current =iv_ruleProcessBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessBody893); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:417:1: ruleProcessBody returns [EObject current=null] : ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:420:28: ( ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:421:1: ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:421:1: ( () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:421:2: () otherlv_1= 'PROCESS' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:421:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:422:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessBodyAccess().getProcessBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProcessBody939); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessBodyAccess().getPROCESSKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleProcessBody951); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:435:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=36 && LA7_0<=46)||(LA7_0>=50 && LA7_0<=52)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:435:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:435:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:436:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:436:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:437:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody973);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:453:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:453:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleProcessBody986); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcessBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:457:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:458:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:458:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:459:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody1007);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleProcessBody1023); 

                	newLeafNode(otherlv_6, grammarAccess.getProcessBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleProcessBody1035); 

                	newLeafNode(otherlv_7, grammarAccess.getProcessBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:483:1: ( (lv_members_8_0= ruleFunctionBodyMember ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16||(LA8_0>=21 && LA8_0<=24)||LA8_0==32||(LA8_0>=36 && LA8_0<=46)||(LA8_0>=50 && LA8_0<=52)||LA8_0==56||LA8_0==59||LA8_0==61) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:484:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:484:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:485:3: lv_members_8_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessBodyAccess().getMembersFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleProcessBody1056);
            	    lv_members_8_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleProcessBody1069); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:513:1: entryRuleSystemBody returns [EObject current=null] : iv_ruleSystemBody= ruleSystemBody EOF ;
    public final EObject entryRuleSystemBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:514:2: (iv_ruleSystemBody= ruleSystemBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:515:2: iv_ruleSystemBody= ruleSystemBody EOF
            {
             newCompositeNode(grammarAccess.getSystemBodyRule()); 
            pushFollow(FOLLOW_ruleSystemBody_in_entryRuleSystemBody1105);
            iv_ruleSystemBody=ruleSystemBody();

            state._fsp--;

             current =iv_ruleSystemBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemBody1115); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:522:1: ruleSystemBody returns [EObject current=null] : ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:525:28: ( ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:526:1: ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:526:1: ( () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:526:2: () otherlv_1= 'SYSTEM' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:526:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:527:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSystemBodyAccess().getSystemBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSystemBody1161); 

                	newLeafNode(otherlv_1, grammarAccess.getSystemBodyAccess().getSYSTEMKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSystemBody1173); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:540:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=36 && LA10_0<=46)||(LA10_0>=50 && LA10_0<=52)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:540:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:540:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:541:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:541:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:542:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1195);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:558:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:558:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSystemBody1208); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSystemBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:562:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:563:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:563:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:564:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSystemBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1229);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSystemBody1245); 

                	newLeafNode(otherlv_6, grammarAccess.getSystemBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSystemBody1257); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:588:1: ( (lv_members_8_0= ruleFunctionBodyMember ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==16||(LA11_0>=21 && LA11_0<=24)||LA11_0==32||(LA11_0>=36 && LA11_0<=46)||(LA11_0>=50 && LA11_0<=52)||LA11_0==56||LA11_0==59||LA11_0==61) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:589:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:589:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:590:3: lv_members_8_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemBodyAccess().getMembersFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleSystemBody1278);
            	    lv_members_8_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSystemBody1291); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:618:1: entryRulePlasmidBody returns [EObject current=null] : iv_rulePlasmidBody= rulePlasmidBody EOF ;
    public final EObject entryRulePlasmidBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlasmidBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:619:2: (iv_rulePlasmidBody= rulePlasmidBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:620:2: iv_rulePlasmidBody= rulePlasmidBody EOF
            {
             newCompositeNode(grammarAccess.getPlasmidBodyRule()); 
            pushFollow(FOLLOW_rulePlasmidBody_in_entryRulePlasmidBody1327);
            iv_rulePlasmidBody=rulePlasmidBody();

            state._fsp--;

             current =iv_rulePlasmidBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlasmidBody1337); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:627:1: rulePlasmidBody returns [EObject current=null] : ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:630:28: ( ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:631:1: ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:631:1: ( () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:631:2: () otherlv_1= 'PLASMID' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:631:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:632:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPlasmidBodyAccess().getPlasmidBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePlasmidBody1383); 

                	newLeafNode(otherlv_1, grammarAccess.getPlasmidBodyAccess().getPLASMIDKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePlasmidBody1395); 

                	newLeafNode(otherlv_2, grammarAccess.getPlasmidBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:645:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=36 && LA13_0<=46)||(LA13_0>=50 && LA13_0<=52)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:645:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:645:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:646:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:646:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:647:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlasmidBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1417);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:663:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:663:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePlasmidBody1430); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getPlasmidBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:667:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:668:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:668:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:669:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPlasmidBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1451);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePlasmidBody1467); 

                	newLeafNode(otherlv_6, grammarAccess.getPlasmidBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_rulePlasmidBody1479); 

                	newLeafNode(otherlv_7, grammarAccess.getPlasmidBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:693:1: ( (lv_members_8_0= ruleFunctionBodyMember ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==16||(LA14_0>=21 && LA14_0<=24)||LA14_0==32||(LA14_0>=36 && LA14_0<=46)||(LA14_0>=50 && LA14_0<=52)||LA14_0==56||LA14_0==59||LA14_0==61) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:694:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:694:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:695:3: lv_members_8_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlasmidBodyAccess().getMembersFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_rulePlasmidBody1500);
            	    lv_members_8_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlasmidBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_rulePlasmidBody1513); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:723:1: entryRuleChromosomeBody returns [EObject current=null] : iv_ruleChromosomeBody= ruleChromosomeBody EOF ;
    public final EObject entryRuleChromosomeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChromosomeBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:724:2: (iv_ruleChromosomeBody= ruleChromosomeBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:725:2: iv_ruleChromosomeBody= ruleChromosomeBody EOF
            {
             newCompositeNode(grammarAccess.getChromosomeBodyRule()); 
            pushFollow(FOLLOW_ruleChromosomeBody_in_entryRuleChromosomeBody1549);
            iv_ruleChromosomeBody=ruleChromosomeBody();

            state._fsp--;

             current =iv_ruleChromosomeBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChromosomeBody1559); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:1: ruleChromosomeBody returns [EObject current=null] : ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:735:28: ( ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:1: ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:1: ( () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:2: () otherlv_1= 'CHROMOSOME' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:736:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChromosomeBodyAccess().getChromosomeBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleChromosomeBody1605); 

                	newLeafNode(otherlv_1, grammarAccess.getChromosomeBodyAccess().getCHROMOSOMEKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleChromosomeBody1617); 

                	newLeafNode(otherlv_2, grammarAccess.getChromosomeBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:750:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=36 && LA16_0<=46)||(LA16_0>=50 && LA16_0<=52)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:750:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:750:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:751:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:751:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:752:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getChromosomeBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1639);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:768:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:768:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleChromosomeBody1652); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getChromosomeBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:772:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:773:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:773:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:774:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChromosomeBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1673);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleChromosomeBody1689); 

                	newLeafNode(otherlv_6, grammarAccess.getChromosomeBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleChromosomeBody1701); 

                	newLeafNode(otherlv_7, grammarAccess.getChromosomeBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:798:1: ( (lv_members_8_0= ruleFunctionBodyMember ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==16||(LA17_0>=21 && LA17_0<=24)||LA17_0==32||(LA17_0>=36 && LA17_0<=46)||(LA17_0>=50 && LA17_0<=52)||LA17_0==56||LA17_0==59||LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:799:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:799:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:800:3: lv_members_8_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChromosomeBodyAccess().getMembersFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleChromosomeBody1722);
            	    lv_members_8_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChromosomeBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleChromosomeBody1735); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:828:1: entryRuleCellBody returns [EObject current=null] : iv_ruleCellBody= ruleCellBody EOF ;
    public final EObject entryRuleCellBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:829:2: (iv_ruleCellBody= ruleCellBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:830:2: iv_ruleCellBody= ruleCellBody EOF
            {
             newCompositeNode(grammarAccess.getCellBodyRule()); 
            pushFollow(FOLLOW_ruleCellBody_in_entryRuleCellBody1771);
            iv_ruleCellBody=ruleCellBody();

            state._fsp--;

             current =iv_ruleCellBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellBody1781); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:837:1: ruleCellBody returns [EObject current=null] : ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:840:28: ( ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:841:1: ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:841:1: ( () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:841:2: () otherlv_1= 'CELL' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:841:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:842:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCellBodyAccess().getCellBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCellBody1827); 

                	newLeafNode(otherlv_1, grammarAccess.getCellBodyAccess().getCELLKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCellBody1839); 

                	newLeafNode(otherlv_2, grammarAccess.getCellBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:855:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=36 && LA19_0<=46)||(LA19_0>=50 && LA19_0<=52)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:855:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:855:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:856:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:856:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:857:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1861);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:873:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:873:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCellBody1874); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCellBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:877:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:878:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:878:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:879:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCellBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1895);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleCellBody1911); 

                	newLeafNode(otherlv_6, grammarAccess.getCellBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleCellBody1923); 

                	newLeafNode(otherlv_7, grammarAccess.getCellBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:903:1: ( (lv_members_8_0= ruleFunctionBodyMember ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==16||(LA20_0>=21 && LA20_0<=24)||LA20_0==32||(LA20_0>=36 && LA20_0<=46)||(LA20_0>=50 && LA20_0<=52)||LA20_0==56||LA20_0==59||LA20_0==61) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:904:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:904:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:905:3: lv_members_8_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellBodyAccess().getMembersFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleCellBody1944);
            	    lv_members_8_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleCellBody1957); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:933:1: entryRuleRegionBody returns [EObject current=null] : iv_ruleRegionBody= ruleRegionBody EOF ;
    public final EObject entryRuleRegionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:934:2: (iv_ruleRegionBody= ruleRegionBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:935:2: iv_ruleRegionBody= ruleRegionBody EOF
            {
             newCompositeNode(grammarAccess.getRegionBodyRule()); 
            pushFollow(FOLLOW_ruleRegionBody_in_entryRuleRegionBody1993);
            iv_ruleRegionBody=ruleRegionBody();

            state._fsp--;

             current =iv_ruleRegionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionBody2003); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:942:1: ruleRegionBody returns [EObject current=null] : ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:945:28: ( ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:946:1: ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:946:1: ( () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:946:2: () otherlv_1= 'REGION' otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:946:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:947:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRegionBodyAccess().getRegionBodyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleRegionBody2049); 

                	newLeafNode(otherlv_1, grammarAccess.getRegionBodyAccess().getREGIONKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRegionBody2061); 

                	newLeafNode(otherlv_2, grammarAccess.getRegionBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:960:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=36 && LA22_0<=46)||(LA22_0>=50 && LA22_0<=52)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:960:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:960:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:961:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:961:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:962:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody2083);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:978:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:978:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRegionBody2096); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRegionBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:982:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:983:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:983:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:984:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRegionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody2117);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleRegionBody2133); 

                	newLeafNode(otherlv_6, grammarAccess.getRegionBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleRegionBody2145); 

                	newLeafNode(otherlv_7, grammarAccess.getRegionBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1008:1: ( (lv_members_8_0= ruleFunctionBodyMember ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==16||(LA23_0>=21 && LA23_0<=24)||LA23_0==32||(LA23_0>=36 && LA23_0<=46)||(LA23_0>=50 && LA23_0<=52)||LA23_0==56||LA23_0==59||LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1009:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1009:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1010:3: lv_members_8_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegionBodyAccess().getMembersFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleRegionBody2166);
            	    lv_members_8_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleRegionBody2179); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1038:1: entryRuleCustomFunctionBody returns [EObject current=null] : iv_ruleCustomFunctionBody= ruleCustomFunctionBody EOF ;
    public final EObject entryRuleCustomFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFunctionBody = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1039:2: (iv_ruleCustomFunctionBody= ruleCustomFunctionBody EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1040:2: iv_ruleCustomFunctionBody= ruleCustomFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getCustomFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleCustomFunctionBody_in_entryRuleCustomFunctionBody2215);
            iv_ruleCustomFunctionBody=ruleCustomFunctionBody();

            state._fsp--;

             current =iv_ruleCustomFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomFunctionBody2225); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1047:1: ruleCustomFunctionBody returns [EObject current=null] : ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1050:28: ( ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1051:1: ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1051:1: ( () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1051:2: () ( (lv_functionType_1_0= ruleVariableName ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_members_8_0= ruleFunctionBodyMember ) )* otherlv_9= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1051:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1052:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCustomFunctionBodyAccess().getCustomFunctionBodyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1057:2: ( (lv_functionType_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1058:1: (lv_functionType_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1058:1: (lv_functionType_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1059:3: lv_functionType_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getFunctionTypeVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleCustomFunctionBody2280);
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCustomFunctionBody2292); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomFunctionBodyAccess().getLeftParenthesisKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1079:1: ( ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=36 && LA25_0<=46)||(LA25_0>=50 && LA25_0<=52)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1079:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1079:2: ( (lv_parameters_3_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1080:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1080:1: (lv_parameters_3_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1081:3: lv_parameters_3_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2314);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1097:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1097:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCustomFunctionBody2327); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCustomFunctionBodyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1101:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1102:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1102:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1103:3: lv_parameters_5_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getParametersFunctionParameterMemberParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2348);
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleCustomFunctionBody2364); 

                	newLeafNode(otherlv_6, grammarAccess.getCustomFunctionBodyAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleCustomFunctionBody2376); 

                	newLeafNode(otherlv_7, grammarAccess.getCustomFunctionBodyAccess().getLeftCurlyBracketKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1127:1: ( (lv_members_8_0= ruleFunctionBodyMember ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==16||(LA26_0>=21 && LA26_0<=24)||LA26_0==32||(LA26_0>=36 && LA26_0<=46)||(LA26_0>=50 && LA26_0<=52)||LA26_0==56||LA26_0==59||LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1128:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1128:1: (lv_members_8_0= ruleFunctionBodyMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1129:3: lv_members_8_0= ruleFunctionBodyMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomFunctionBodyAccess().getMembersFunctionBodyMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionBodyMember_in_ruleCustomFunctionBody2397);
            	    lv_members_8_0=ruleFunctionBodyMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomFunctionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_8_0, 
            	            		"FunctionBodyMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleCustomFunctionBody2410); 

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


    // $ANTLR start "entryRuleFunctionBodyMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1157:1: entryRuleFunctionBodyMember returns [EObject current=null] : iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF ;
    public final EObject entryRuleFunctionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1158:2: (iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1159:2: iv_ruleFunctionBodyMember= ruleFunctionBodyMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionBodyMember_in_entryRuleFunctionBodyMember2446);
            iv_ruleFunctionBodyMember=ruleFunctionBodyMember();

            state._fsp--;

             current =iv_ruleFunctionBodyMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBodyMember2456); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1166:1: ruleFunctionBodyMember returns [EObject current=null] : (this_ATGCDefinition_0= ruleATGCDefinition | this_CellInstantiation_1= ruleCellInstantiation | this_ChromosomeInstantiation_2= ruleChromosomeInstantiation | this_DeviceDefinition_3= ruleDeviceDefinition | this_PlasmidInstantiation_4= rulePlasmidInstantiation | this_ProcessInstantiation_5= ruleProcessInstantiation | this_PropertyDefinition_6= rulePropertyDefinition | this_RuleDefinition_7= ruleRuleDefinition | this_SystemInstantiation_8= ruleSystemInstantiation | this_VariableAssignment_9= ruleVariableAssignment | this_VariableDefinition_10= ruleVariableDefinition ) ;
    public final EObject ruleFunctionBodyMember() throws RecognitionException {
        EObject current = null;

        EObject this_ATGCDefinition_0 = null;

        EObject this_CellInstantiation_1 = null;

        EObject this_ChromosomeInstantiation_2 = null;

        EObject this_DeviceDefinition_3 = null;

        EObject this_PlasmidInstantiation_4 = null;

        EObject this_ProcessInstantiation_5 = null;

        EObject this_PropertyDefinition_6 = null;

        EObject this_RuleDefinition_7 = null;

        EObject this_SystemInstantiation_8 = null;

        EObject this_VariableAssignment_9 = null;

        EObject this_VariableDefinition_10 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1169:28: ( (this_ATGCDefinition_0= ruleATGCDefinition | this_CellInstantiation_1= ruleCellInstantiation | this_ChromosomeInstantiation_2= ruleChromosomeInstantiation | this_DeviceDefinition_3= ruleDeviceDefinition | this_PlasmidInstantiation_4= rulePlasmidInstantiation | this_ProcessInstantiation_5= ruleProcessInstantiation | this_PropertyDefinition_6= rulePropertyDefinition | this_RuleDefinition_7= ruleRuleDefinition | this_SystemInstantiation_8= ruleSystemInstantiation | this_VariableAssignment_9= ruleVariableAssignment | this_VariableDefinition_10= ruleVariableDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1170:1: (this_ATGCDefinition_0= ruleATGCDefinition | this_CellInstantiation_1= ruleCellInstantiation | this_ChromosomeInstantiation_2= ruleChromosomeInstantiation | this_DeviceDefinition_3= ruleDeviceDefinition | this_PlasmidInstantiation_4= rulePlasmidInstantiation | this_ProcessInstantiation_5= ruleProcessInstantiation | this_PropertyDefinition_6= rulePropertyDefinition | this_RuleDefinition_7= ruleRuleDefinition | this_SystemInstantiation_8= ruleSystemInstantiation | this_VariableAssignment_9= ruleVariableAssignment | this_VariableDefinition_10= ruleVariableDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1170:1: (this_ATGCDefinition_0= ruleATGCDefinition | this_CellInstantiation_1= ruleCellInstantiation | this_ChromosomeInstantiation_2= ruleChromosomeInstantiation | this_DeviceDefinition_3= ruleDeviceDefinition | this_PlasmidInstantiation_4= rulePlasmidInstantiation | this_ProcessInstantiation_5= ruleProcessInstantiation | this_PropertyDefinition_6= rulePropertyDefinition | this_RuleDefinition_7= ruleRuleDefinition | this_SystemInstantiation_8= ruleSystemInstantiation | this_VariableAssignment_9= ruleVariableAssignment | this_VariableDefinition_10= ruleVariableDefinition )
            int alt27=11;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1171:5: this_ATGCDefinition_0= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getATGCDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleFunctionBodyMember2503);
                    this_ATGCDefinition_0=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1181:5: this_CellInstantiation_1= ruleCellInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getCellInstantiationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCellInstantiation_in_ruleFunctionBodyMember2530);
                    this_CellInstantiation_1=ruleCellInstantiation();

                    state._fsp--;

                     
                            current = this_CellInstantiation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1191:5: this_ChromosomeInstantiation_2= ruleChromosomeInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getChromosomeInstantiationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChromosomeInstantiation_in_ruleFunctionBodyMember2557);
                    this_ChromosomeInstantiation_2=ruleChromosomeInstantiation();

                    state._fsp--;

                     
                            current = this_ChromosomeInstantiation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1201:5: this_DeviceDefinition_3= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getDeviceDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleFunctionBodyMember2584);
                    this_DeviceDefinition_3=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1211:5: this_PlasmidInstantiation_4= rulePlasmidInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getPlasmidInstantiationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePlasmidInstantiation_in_ruleFunctionBodyMember2611);
                    this_PlasmidInstantiation_4=rulePlasmidInstantiation();

                    state._fsp--;

                     
                            current = this_PlasmidInstantiation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1221:5: this_ProcessInstantiation_5= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getProcessInstantiationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleFunctionBodyMember2638);
                    this_ProcessInstantiation_5=ruleProcessInstantiation();

                    state._fsp--;

                     
                            current = this_ProcessInstantiation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1231:5: this_PropertyDefinition_6= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getPropertyDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleFunctionBodyMember2665);
                    this_PropertyDefinition_6=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1241:5: this_RuleDefinition_7= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getRuleDefinitionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleFunctionBodyMember2692);
                    this_RuleDefinition_7=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1251:5: this_SystemInstantiation_8= ruleSystemInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getSystemInstantiationParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleSystemInstantiation_in_ruleFunctionBodyMember2719);
                    this_SystemInstantiation_8=ruleSystemInstantiation();

                    state._fsp--;

                     
                            current = this_SystemInstantiation_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1261:5: this_VariableAssignment_9= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getVariableAssignmentParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleFunctionBodyMember2746);
                    this_VariableAssignment_9=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1271:5: this_VariableDefinition_10= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyMemberAccess().getVariableDefinitionParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleFunctionBodyMember2773);
                    this_VariableDefinition_10=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_10; 
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


    // $ANTLR start "entryRuleFunctionParameterMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1287:1: entryRuleFunctionParameterMember returns [EObject current=null] : iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF ;
    public final EObject entryRuleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1288:2: (iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1289:2: iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember2808);
            iv_ruleFunctionParameterMember=ruleFunctionParameterMember();

            state._fsp--;

             current =iv_ruleFunctionParameterMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember2818); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1296:1: ruleFunctionParameterMember returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1299:28: ( ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:1: ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:1: ( ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:2: ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) ) ( (lv_name_5_0= ruleVariableName ) ) (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:2: ( ( (lv_type_0_0= ruleVariableType ) ) | ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=36 && LA29_0<=46)) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=50 && LA29_0<=52)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:3: ( (lv_type_0_0= ruleVariableType ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:3: ( (lv_type_0_0= ruleVariableType ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1301:1: (lv_type_0_0= ruleVariableType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1301:1: (lv_type_0_0= ruleVariableType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1302:3: lv_type_0_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionParameterMember2865);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1319:6: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1319:6: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1319:7: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>'
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1319:7: ( (lv_collection_1_0= ruleCollectionID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1320:1: (lv_collection_1_0= ruleCollectionID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1320:1: (lv_collection_1_0= ruleCollectionID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1321:3: lv_collection_1_0= ruleCollectionID
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getCollectionCollectionIDParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionID_in_ruleFunctionParameterMember2893);
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

                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFunctionParameterMember2905); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterMemberAccess().getLessThanSignKeyword_0_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1341:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1342:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1342:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1343:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1343:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=36 && LA28_0<=46)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_ID) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1344:3: lv_type_3_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableTypeParserRuleCall_0_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionParameterMember2928);
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1359:8: lv_type_3_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getTypeVariableNameParserRuleCall_0_1_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionParameterMember2947);
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

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleFunctionParameterMember2962); 

                        	newLeafNode(otherlv_4, grammarAccess.getFunctionParameterMemberAccess().getGreaterThanSignKeyword_0_1_3());
                        

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1381:3: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1382:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1382:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1383:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionParameterMember2985);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1399:2: (otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1399:4: otherlv_6= ':' ( (lv_scope_7_0= ruleFunctionParameterScope ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleFunctionParameterMember2998); 

                        	newLeafNode(otherlv_6, grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1403:1: ( (lv_scope_7_0= ruleFunctionParameterScope ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1404:1: (lv_scope_7_0= ruleFunctionParameterScope )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1404:1: (lv_scope_7_0= ruleFunctionParameterScope )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1405:3: lv_scope_7_0= ruleFunctionParameterScope
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getScopeFunctionParameterScopeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember3019);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1429:1: entryRuleFunctionParameterScope returns [String current=null] : iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF ;
    public final String entryRuleFunctionParameterScope() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionParameterScope = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1430:2: (iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1431:2: iv_ruleFunctionParameterScope= ruleFunctionParameterScope EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterScopeRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope3058);
            iv_ruleFunctionParameterScope=ruleFunctionParameterScope();

            state._fsp--;

             current =iv_ruleFunctionParameterScope.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterScope3069); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1438:1: ruleFunctionParameterScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'input' | kw= 'output' | kw= 'optional' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionParameterScope() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1441:28: ( (kw= 'input' | kw= 'output' | kw= 'optional' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1442:1: (kw= 'input' | kw= 'output' | kw= 'optional' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1442:1: (kw= 'input' | kw= 'output' | kw= 'optional' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt31=1;
                }
                break;
            case 30:
                {
                alt31=2;
                }
                break;
            case 31:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1443:2: kw= 'input'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleFunctionParameterScope3107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getInputKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1450:2: kw= 'output'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleFunctionParameterScope3126); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionParameterScopeAccess().getOutputKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1457:2: kw= 'optional'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleFunctionParameterScope3145); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1470:1: entryRuleFunctionUseMember returns [EObject current=null] : iv_ruleFunctionUseMember= ruleFunctionUseMember EOF ;
    public final EObject entryRuleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUseMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1471:2: (iv_ruleFunctionUseMember= ruleFunctionUseMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1472:2: iv_ruleFunctionUseMember= ruleFunctionUseMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionUseMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember3185);
            iv_ruleFunctionUseMember=ruleFunctionUseMember();

            state._fsp--;

             current =iv_ruleFunctionUseMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUseMember3195); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1479:1: ruleFunctionUseMember returns [EObject current=null] : ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) ;
    public final EObject ruleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1482:28: ( ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1483:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1483:1: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1483:2: ( (lv_type_0_0= ruleVariableType ) ) ( (lv_name_1_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1483:2: ( (lv_type_0_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:1: (lv_type_0_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:1: (lv_type_0_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1485:3: lv_type_0_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getTypeVariableTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionUseMember3241);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1501:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1502:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1502:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1503:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionUseMemberAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleFunctionUseMember3262);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1527:1: entryRuleDeviceDefinition returns [EObject current=null] : iv_ruleDeviceDefinition= ruleDeviceDefinition EOF ;
    public final EObject entryRuleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1528:2: (iv_ruleDeviceDefinition= ruleDeviceDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1529:2: iv_ruleDeviceDefinition= ruleDeviceDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeviceDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition3298);
            iv_ruleDeviceDefinition=ruleDeviceDefinition();

            state._fsp--;

             current =iv_ruleDeviceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDefinition3308); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1536:1: ruleDeviceDefinition returns [EObject current=null] : ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1539:28: ( ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1540:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1540:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1540:2: () otherlv_1= 'DEVICE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= 'DEVICE' otherlv_6= '(' otherlv_7= 'parts' otherlv_8= '=' ( (lv_parts_9_0= ruleList ) ) otherlv_10= ')' otherlv_11= '(' (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )? (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )? otherlv_19= ')' otherlv_20= '{' ( (lv_members_21_0= ruleDeviceMembers ) )* otherlv_22= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1540:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1541:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition3354); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1550:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1551:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1551:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1552:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleDeviceDefinition3375);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition3387); 

                	newLeafNode(otherlv_3, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleDeviceDefinition3399); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceDefinitionAccess().getNewKeyword_4());
                
            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleDeviceDefinition3411); 

                	newLeafNode(otherlv_5, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition3423); 

                	newLeafNode(otherlv_6, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleDeviceDefinition3435); 

                	newLeafNode(otherlv_7, grammarAccess.getDeviceDefinitionAccess().getPartsKeyword_7());
                
            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition3447); 

                	newLeafNode(otherlv_8, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1592:1: ( (lv_parts_9_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1593:1: (lv_parts_9_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1593:1: (lv_parts_9_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1594:3: lv_parts_9_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getPartsListParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition3468);
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

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition3480); 

                	newLeafNode(otherlv_10, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10());
                
            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition3492); 

                	newLeafNode(otherlv_11, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_11());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1618:1: (otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1618:3: otherlv_12= 'input' otherlv_13= '=' ( (lv_input_14_0= ruleList ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleDeviceDefinition3505); 

                        	newLeafNode(otherlv_12, grammarAccess.getDeviceDefinitionAccess().getInputKeyword_12_0());
                        
                    otherlv_13=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition3517); 

                        	newLeafNode(otherlv_13, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_12_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1626:1: ( (lv_input_14_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1627:1: (lv_input_14_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1627:1: (lv_input_14_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1628:3: lv_input_14_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getInputListParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition3538);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1644:4: (otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1644:6: otherlv_15= ',' otherlv_16= 'output' otherlv_17= '=' ( (lv_outputput_18_0= ruleList ) )
                    {
                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleDeviceDefinition3553); 

                        	newLeafNode(otherlv_15, grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_13_0());
                        
                    otherlv_16=(Token)match(input,30,FOLLOW_30_in_ruleDeviceDefinition3565); 

                        	newLeafNode(otherlv_16, grammarAccess.getDeviceDefinitionAccess().getOutputKeyword_13_1());
                        
                    otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleDeviceDefinition3577); 

                        	newLeafNode(otherlv_17, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_13_2());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1656:1: ( (lv_outputput_18_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1657:1: (lv_outputput_18_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1657:1: (lv_outputput_18_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1658:3: lv_outputput_18_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getOutputputListParserRuleCall_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleDeviceDefinition3598);
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

            otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition3612); 

                	newLeafNode(otherlv_19, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_14());
                
            otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleDeviceDefinition3624); 

                	newLeafNode(otherlv_20, grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_15());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1682:1: ( (lv_members_21_0= ruleDeviceMembers ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==16||(LA34_0>=36 && LA34_0<=46)||(LA34_0>=50 && LA34_0<=52)||LA34_0==59||LA34_0==61) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1683:1: (lv_members_21_0= ruleDeviceMembers )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1683:1: (lv_members_21_0= ruleDeviceMembers )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1684:3: lv_members_21_0= ruleDeviceMembers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getMembersDeviceMembersParserRuleCall_16_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition3645);
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
            	    break loop34;
                }
            } while (true);

            otherlv_22=(Token)match(input,20,FOLLOW_20_in_ruleDeviceDefinition3658); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1712:1: entryRuleDeviceMembers returns [EObject current=null] : iv_ruleDeviceMembers= ruleDeviceMembers EOF ;
    public final EObject entryRuleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceMembers = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1713:2: (iv_ruleDeviceMembers= ruleDeviceMembers EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1714:2: iv_ruleDeviceMembers= ruleDeviceMembers EOF
            {
             newCompositeNode(grammarAccess.getDeviceMembersRule()); 
            pushFollow(FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers3694);
            iv_ruleDeviceMembers=ruleDeviceMembers();

            state._fsp--;

             current =iv_ruleDeviceMembers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceMembers3704); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1721:1: ruleDeviceMembers returns [EObject current=null] : (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation ) ;
    public final EObject ruleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;

        EObject this_PropertyDefinition_1 = null;

        EObject this_ATGCDefinition_2 = null;

        EObject this_ProcessInstantiation_3 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1724:28: ( (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1725:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1725:1: (this_VariableDefinition_0= ruleVariableDefinition | this_PropertyDefinition_1= rulePropertyDefinition | this_ATGCDefinition_2= ruleATGCDefinition | this_ProcessInstantiation_3= ruleProcessInstantiation )
            int alt35=4;
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
                alt35=1;
                }
                break;
            case 61:
                {
                alt35=2;
                }
                break;
            case 59:
                {
                alt35=3;
                }
                break;
            case 16:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1726:5: this_VariableDefinition_0= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers3751);
                    this_VariableDefinition_0=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1736:5: this_PropertyDefinition_1= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getPropertyDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers3778);
                    this_PropertyDefinition_1=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1746:5: this_ATGCDefinition_2= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getATGCDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers3805);
                    this_ATGCDefinition_2=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1756:5: this_ProcessInstantiation_3= ruleProcessInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getProcessInstantiationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleProcessInstantiation_in_ruleDeviceMembers3832);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1772:1: entryRuleProcessInstantiation returns [EObject current=null] : iv_ruleProcessInstantiation= ruleProcessInstantiation EOF ;
    public final EObject entryRuleProcessInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1773:2: (iv_ruleProcessInstantiation= ruleProcessInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1774:2: iv_ruleProcessInstantiation= ruleProcessInstantiation EOF
            {
             newCompositeNode(grammarAccess.getProcessInstantiationRule()); 
            pushFollow(FOLLOW_ruleProcessInstantiation_in_entryRuleProcessInstantiation3867);
            iv_ruleProcessInstantiation=ruleProcessInstantiation();

            state._fsp--;

             current =iv_ruleProcessInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessInstantiation3877); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1781:1: ruleProcessInstantiation returns [EObject current=null] : ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1784:28: ( ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1785:1: ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1785:1: ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1785:2: () otherlv_1= 'PROCESS' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1785:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1786:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessInstantiationAccess().getProcessInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProcessInstantiation3923); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessInstantiationAccess().getPROCESSKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1795:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1796:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1796:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1797:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleProcessInstantiation3944);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1813:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1813:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleProcessInstantiation3957); 

                        	newLeafNode(otherlv_3, grammarAccess.getProcessInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleProcessInstantiation3969); 

                        	newLeafNode(otherlv_4, grammarAccess.getProcessInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1821:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1822:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1822:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1823:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleProcessInstantiation3990);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleProcessInstantiation4002); 

                        	newLeafNode(otherlv_6, grammarAccess.getProcessInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1843:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1843:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1843:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1844:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1844:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1845:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation4024);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1861:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==15) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1861:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleProcessInstantiation4037); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getProcessInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1865:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1866:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1866:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1867:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getProcessInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation4058);
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
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleProcessInstantiation4074); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1895:1: entryRuleSystemInstantiation returns [EObject current=null] : iv_ruleSystemInstantiation= ruleSystemInstantiation EOF ;
    public final EObject entryRuleSystemInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1896:2: (iv_ruleSystemInstantiation= ruleSystemInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1897:2: iv_ruleSystemInstantiation= ruleSystemInstantiation EOF
            {
             newCompositeNode(grammarAccess.getSystemInstantiationRule()); 
            pushFollow(FOLLOW_ruleSystemInstantiation_in_entryRuleSystemInstantiation4112);
            iv_ruleSystemInstantiation=ruleSystemInstantiation();

            state._fsp--;

             current =iv_ruleSystemInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemInstantiation4122); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1904:1: ruleSystemInstantiation returns [EObject current=null] : ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1907:28: ( ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1908:1: ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1908:1: ( () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1908:2: () otherlv_1= 'SYSTEM' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1908:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1909:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSystemInstantiationAccess().getSystemInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSystemInstantiation4168); 

                	newLeafNode(otherlv_1, grammarAccess.getSystemInstantiationAccess().getSYSTEMKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1918:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1919:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1919:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1920:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleSystemInstantiation4189);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1936:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1936:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleSystemInstantiation4202); 

                        	newLeafNode(otherlv_3, grammarAccess.getSystemInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleSystemInstantiation4214); 

                        	newLeafNode(otherlv_4, grammarAccess.getSystemInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1944:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1945:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1945:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1946:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleSystemInstantiation4235);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSystemInstantiation4247); 

                        	newLeafNode(otherlv_6, grammarAccess.getSystemInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1966:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1966:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1966:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1967:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1967:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1968:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation4269);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1984:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==15) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1984:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleSystemInstantiation4282); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getSystemInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1988:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1989:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1989:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1990:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSystemInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation4303);
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
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleSystemInstantiation4319); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2018:1: entryRulePlasmidInstantiation returns [EObject current=null] : iv_rulePlasmidInstantiation= rulePlasmidInstantiation EOF ;
    public final EObject entryRulePlasmidInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlasmidInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2019:2: (iv_rulePlasmidInstantiation= rulePlasmidInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2020:2: iv_rulePlasmidInstantiation= rulePlasmidInstantiation EOF
            {
             newCompositeNode(grammarAccess.getPlasmidInstantiationRule()); 
            pushFollow(FOLLOW_rulePlasmidInstantiation_in_entryRulePlasmidInstantiation4357);
            iv_rulePlasmidInstantiation=rulePlasmidInstantiation();

            state._fsp--;

             current =iv_rulePlasmidInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlasmidInstantiation4367); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2027:1: rulePlasmidInstantiation returns [EObject current=null] : ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2030:28: ( ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2031:1: ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2031:1: ( () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2031:2: () otherlv_1= 'PLASMID' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2031:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2032:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPlasmidInstantiationAccess().getPlasmidInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePlasmidInstantiation4413); 

                	newLeafNode(otherlv_1, grammarAccess.getPlasmidInstantiationAccess().getPLASMIDKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2041:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2042:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2042:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2043:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_rulePlasmidInstantiation4434);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2059:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2059:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_rulePlasmidInstantiation4447); 

                        	newLeafNode(otherlv_3, grammarAccess.getPlasmidInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePlasmidInstantiation4459); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlasmidInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2067:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2068:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2068:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2069:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_rulePlasmidInstantiation4480);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_rulePlasmidInstantiation4492); 

                        	newLeafNode(otherlv_6, grammarAccess.getPlasmidInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2089:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2089:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2089:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2090:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2090:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2091:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation4514);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2107:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==15) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2107:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_rulePlasmidInstantiation4527); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getPlasmidInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2111:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2112:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2112:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2113:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPlasmidInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation4548);
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
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_rulePlasmidInstantiation4564); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2141:1: entryRuleChromosomeInstantiation returns [EObject current=null] : iv_ruleChromosomeInstantiation= ruleChromosomeInstantiation EOF ;
    public final EObject entryRuleChromosomeInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChromosomeInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2142:2: (iv_ruleChromosomeInstantiation= ruleChromosomeInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2143:2: iv_ruleChromosomeInstantiation= ruleChromosomeInstantiation EOF
            {
             newCompositeNode(grammarAccess.getChromosomeInstantiationRule()); 
            pushFollow(FOLLOW_ruleChromosomeInstantiation_in_entryRuleChromosomeInstantiation4602);
            iv_ruleChromosomeInstantiation=ruleChromosomeInstantiation();

            state._fsp--;

             current =iv_ruleChromosomeInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChromosomeInstantiation4612); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2150:1: ruleChromosomeInstantiation returns [EObject current=null] : ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2153:28: ( ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2154:1: ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2154:1: ( () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2154:2: () otherlv_1= 'CHROMOSOME' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2154:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2155:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChromosomeInstantiationAccess().getChromosomeInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleChromosomeInstantiation4658); 

                	newLeafNode(otherlv_1, grammarAccess.getChromosomeInstantiationAccess().getCHROMOSOMEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2164:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2165:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2165:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2166:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation4679);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2182:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==33) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2182:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleChromosomeInstantiation4692); 

                        	newLeafNode(otherlv_3, grammarAccess.getChromosomeInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleChromosomeInstantiation4704); 

                        	newLeafNode(otherlv_4, grammarAccess.getChromosomeInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2190:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2191:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2191:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2192:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation4725);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleChromosomeInstantiation4737); 

                        	newLeafNode(otherlv_6, grammarAccess.getChromosomeInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2212:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2212:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2212:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2213:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2213:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2214:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation4759);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2230:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==15) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2230:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleChromosomeInstantiation4772); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getChromosomeInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2234:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2235:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2235:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2236:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getChromosomeInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation4793);
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
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleChromosomeInstantiation4809); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2264:1: entryRuleCellInstantiation returns [EObject current=null] : iv_ruleCellInstantiation= ruleCellInstantiation EOF ;
    public final EObject entryRuleCellInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellInstantiation = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2265:2: (iv_ruleCellInstantiation= ruleCellInstantiation EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2266:2: iv_ruleCellInstantiation= ruleCellInstantiation EOF
            {
             newCompositeNode(grammarAccess.getCellInstantiationRule()); 
            pushFollow(FOLLOW_ruleCellInstantiation_in_entryRuleCellInstantiation4847);
            iv_ruleCellInstantiation=ruleCellInstantiation();

            state._fsp--;

             current =iv_ruleCellInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCellInstantiation4857); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2273:1: ruleCellInstantiation returns [EObject current=null] : ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2276:28: ( ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2277:1: ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2277:1: ( () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2277:2: () otherlv_1= 'CELL' ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2277:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2278:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCellInstantiationAccess().getCellInstantiationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCellInstantiation4903); 

                	newLeafNode(otherlv_1, grammarAccess.getCellInstantiationAccess().getCELLKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2287:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2288:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2288:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2289:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleCellInstantiation4924);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2305:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2305:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleCellInstantiation4937); 

                        	newLeafNode(otherlv_3, grammarAccess.getCellInstantiationAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleCellInstantiation4949); 

                        	newLeafNode(otherlv_4, grammarAccess.getCellInstantiationAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2313:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2314:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2314:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2315:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleCellInstantiation4970);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleCellInstantiation4982); 

                        	newLeafNode(otherlv_6, grammarAccess.getCellInstantiationAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2335:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2335:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2335:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2336:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2336:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2337:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation5004);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2353:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==15) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2353:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleCellInstantiation5017); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getCellInstantiationAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2357:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2358:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2358:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2359:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCellInstantiationAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation5038);
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
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleCellInstantiation5054); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2387:1: entryRuleVariableName returns [String current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final String entryRuleVariableName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2388:2: (iv_ruleVariableName= ruleVariableName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2389:2: iv_ruleVariableName= ruleVariableName EOF
            {
             newCompositeNode(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName5093);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;

             current =iv_ruleVariableName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName5104); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2396:1: ruleVariableName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVariableName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2399:28: (this_ID_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2400:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableName5143); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2415:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2416:2: (iv_ruleVariableType= ruleVariableType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2417:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType5188);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType5199); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2424:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2427:28: ( (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2428:1: (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2428:1: (kw= 'MOLECULE' | kw= 'CHASSIS' | kw= 'COMPLEX' | kw= 'RIBOSOME' | kw= 'PROMOTER' | kw= 'PROTEIN' | kw= 'DNA' | kw= 'RNA' | kw= 'GENE' | kw= 'INTEGER' | kw= 'RATE' )
            int alt51=11;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt51=1;
                }
                break;
            case 37:
                {
                alt51=2;
                }
                break;
            case 38:
                {
                alt51=3;
                }
                break;
            case 39:
                {
                alt51=4;
                }
                break;
            case 40:
                {
                alt51=5;
                }
                break;
            case 41:
                {
                alt51=6;
                }
                break;
            case 42:
                {
                alt51=7;
                }
                break;
            case 43:
                {
                alt51=8;
                }
                break;
            case 44:
                {
                alt51=9;
                }
                break;
            case 45:
                {
                alt51=10;
                }
                break;
            case 46:
                {
                alt51=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2429:2: kw= 'MOLECULE'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVariableType5237); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getMOLECULEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2436:2: kw= 'CHASSIS'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVariableType5256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCHASSISKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2443:2: kw= 'COMPLEX'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVariableType5275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCOMPLEXKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2450:2: kw= 'RIBOSOME'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVariableType5294); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRIBOSOMEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2457:2: kw= 'PROMOTER'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleVariableType5313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROMOTERKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2464:2: kw= 'PROTEIN'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleVariableType5332); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getPROTEINKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2471:2: kw= 'DNA'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleVariableType5351); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getDNAKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2478:2: kw= 'RNA'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleVariableType5370); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getRNAKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2485:2: kw= 'GENE'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVariableType5389); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getGENEKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2492:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVariableType5408); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTEGERKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2499:2: kw= 'RATE'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVariableType5427); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2512:1: entryRuleVariableComplex returns [EObject current=null] : iv_ruleVariableComplex= ruleVariableComplex EOF ;
    public final EObject entryRuleVariableComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableComplex = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2513:2: (iv_ruleVariableComplex= ruleVariableComplex EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2514:2: iv_ruleVariableComplex= ruleVariableComplex EOF
            {
             newCompositeNode(grammarAccess.getVariableComplexRule()); 
            pushFollow(FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex5467);
            iv_ruleVariableComplex=ruleVariableComplex();

            state._fsp--;

             current =iv_ruleVariableComplex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableComplex5477); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2521:1: ruleVariableComplex returns [EObject current=null] : ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) ;
    public final EObject ruleVariableComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_components_1_0 = null;

        AntlrDatatypeRuleToken lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2524:28: ( ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2525:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2525:1: ( () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+ )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2525:2: () ( (lv_components_1_0= ruleVariableName ) ) (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2525:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2526:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableComplexAccess().getVariableComplexAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2531:2: ( (lv_components_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2532:1: (lv_components_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2532:1: (lv_components_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2533:3: lv_components_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex5532);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2549:2: (otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==47) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2549:4: otherlv_2= '~' ( (lv_components_3_0= ruleVariableName ) )
            	    {
            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleVariableComplex5545); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVariableComplexAccess().getTildeKeyword_2_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2553:1: ( (lv_components_3_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2554:1: (lv_components_3_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2554:1: (lv_components_3_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2555:3: lv_components_3_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableComplexAccess().getComponentsVariableNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableComplex5566);
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
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2579:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2580:2: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2581:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute5604);
            iv_ruleVariableAttribute=ruleVariableAttribute();

            state._fsp--;

             current =iv_ruleVariableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute5614); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2588:1: ruleVariableAttribute returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_complex_2_0 = null;

        AntlrDatatypeRuleToken lv_attribute_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2591:28: ( ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2592:1: ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2592:1: ( () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2592:2: () ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) ) otherlv_3= '.' ( (lv_attribute_4_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2592:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2593:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2598:2: ( ( (lv_name_1_0= ruleVariableName ) ) | ( (lv_complex_2_0= ruleVariableComplex ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==48) ) {
                    alt53=1;
                }
                else if ( (LA53_1==47) ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2598:3: ( (lv_name_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2598:3: ( (lv_name_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2599:1: (lv_name_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2599:1: (lv_name_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2600:3: lv_name_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getNameVariableNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute5670);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2617:6: ( (lv_complex_2_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2617:6: ( (lv_complex_2_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2618:1: (lv_complex_2_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2618:1: (lv_complex_2_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2619:3: lv_complex_2_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getComplexVariableComplexParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleVariableAttribute5697);
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

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleVariableAttribute5710); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2639:1: ( (lv_attribute_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2640:1: (lv_attribute_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2640:1: (lv_attribute_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2641:3: lv_attribute_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getAttributeVariableNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAttribute5731);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2665:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2666:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2667:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition5767);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition5777); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2674:1: ruleVariableDefinition returns [EObject current=null] : ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2677:28: ( ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2678:1: ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2678:1: ( () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2678:2: () ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) ) (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2678:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2679:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2684:2: ( ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2685:1: ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2685:1: ( (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2686:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2686:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )
            int alt54=4;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2687:3: lv_definition_1_1= ruleVariableDefinitionBuiltIn
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBuiltInParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition5834);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2702:8: lv_definition_1_2= ruleVariableDefinitionUserDefined
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionUserDefinedParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition5853);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2717:8: lv_definition_1_3= ruleVariableDefinitionCollection
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionCollectionParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition5872);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2732:8: lv_definition_1_4= ruleVariableDefinitionBasic
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefinitionVariableDefinitionBasicParserRuleCall_1_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition5891);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2750:2: (otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2750:4: otherlv_2= ':' ( (lv_qualifier_3_0= ruleVariableQualifier ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleVariableDefinition5907); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionAccess().getColonKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2754:1: ( (lv_qualifier_3_0= ruleVariableQualifier ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2755:1: (lv_qualifier_3_0= ruleVariableQualifier )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2755:1: (lv_qualifier_3_0= ruleVariableQualifier )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2756:3: lv_qualifier_3_0= ruleVariableQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getQualifierVariableQualifierParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition5928);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2780:1: entryRuleVariableQualifier returns [String current=null] : iv_ruleVariableQualifier= ruleVariableQualifier EOF ;
    public final String entryRuleVariableQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableQualifier = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2781:2: (iv_ruleVariableQualifier= ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2782:2: iv_ruleVariableQualifier= ruleVariableQualifier EOF
            {
             newCompositeNode(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier5967);
            iv_ruleVariableQualifier=ruleVariableQualifier();

            state._fsp--;

             current =iv_ruleVariableQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier5978); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2789:1: ruleVariableQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'observable' ;
    public final AntlrDatatypeRuleToken ruleVariableQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2792:28: (kw= 'observable' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2794:2: kw= 'observable'
            {
            kw=(Token)match(input,49,FOLLOW_49_in_ruleVariableQualifier6015); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2807:1: entryRuleVariableDefinitionBuiltIn returns [EObject current=null] : iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF ;
    public final EObject entryRuleVariableDefinitionBuiltIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBuiltIn = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2808:2: (iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2809:2: iv_ruleVariableDefinitionBuiltIn= ruleVariableDefinitionBuiltIn EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBuiltInRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn6054);
            iv_ruleVariableDefinitionBuiltIn=ruleVariableDefinitionBuiltIn();

            state._fsp--;

             current =iv_ruleVariableDefinitionBuiltIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn6064); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2816:1: ruleVariableDefinitionBuiltIn returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2819:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2820:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2820:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2820:2: () ( (lv_type_1_0= ruleVariableType ) ) ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) ) (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2820:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2821:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBuiltInAccess().getVariableDefinitionBuiltInAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2826:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2827:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2827:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2828:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn6119);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2844:2: ( ( (lv_name_2_0= ruleVariableName ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==EOF||LA56_1==RULE_ID||LA56_1==16||(LA56_1>=20 && LA56_1<=24)||LA56_1==28||(LA56_1>=32 && LA56_1<=33)||(LA56_1>=36 && LA56_1<=46)||(LA56_1>=50 && LA56_1<=52)||LA56_1==56||LA56_1==59||LA56_1==61) ) {
                    alt56=1;
                }
                else if ( (LA56_1==47) ) {
                    alt56=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2844:3: ( (lv_name_2_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2844:3: ( (lv_name_2_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2845:1: (lv_name_2_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2845:1: (lv_name_2_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2846:3: lv_name_2_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getNameVariableNameParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn6141);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2863:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2863:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2864:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2864:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2865:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getComplexVariableComplexParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn6168);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2881:3: (otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==33) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2881:5: otherlv_4= '=' otherlv_5= 'new' ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) ) otherlv_7= '(' ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )? otherlv_11= ')'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionBuiltIn6182); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionBuiltInAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleVariableDefinitionBuiltIn6194); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionBuiltInAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2889:1: ( ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2890:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2890:1: ( (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2891:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2891:1: (lv_constructor_6_1= ruleVariableType | lv_constructor_6_2= ruleVariableName )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=36 && LA57_0<=46)) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==RULE_ID) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2892:3: lv_constructor_6_1= ruleVariableType
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableTypeParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn6217);
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2907:8: lv_constructor_6_2= ruleVariableName
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getConstructorVariableNameParserRuleCall_3_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn6236);
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

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinitionBuiltIn6251); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionBuiltInAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2929:1: ( ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_ID) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2929:2: ( (lv_parameters_8_0= ruleParameterAssignment ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2929:2: ( (lv_parameters_8_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2930:1: (lv_parameters_8_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2930:1: (lv_parameters_8_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2931:3: lv_parameters_8_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn6273);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2947:2: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==15) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2947:4: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionBuiltIn6286); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getVariableDefinitionBuiltInAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2951:1: ( (lv_parameters_10_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2952:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2952:1: (lv_parameters_10_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2953:3: lv_parameters_10_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionBuiltInAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn6307);
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
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinitionBuiltIn6323); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2981:1: entryRuleVariableDefinitionUserDefined returns [EObject current=null] : iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF ;
    public final EObject entryRuleVariableDefinitionUserDefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionUserDefined = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2982:2: (iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2983:2: iv_ruleVariableDefinitionUserDefined= ruleVariableDefinitionUserDefined EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined6361);
            iv_ruleVariableDefinitionUserDefined=ruleVariableDefinitionUserDefined();

            state._fsp--;

             current =iv_ruleVariableDefinitionUserDefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined6371); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2990:1: ruleVariableDefinitionUserDefined returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2993:28: ( ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2994:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2994:1: ( () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2994:2: () ( (lv_type_1_0= ruleVariableName ) ) ( (lv_name_2_0= ruleVariableName ) ) (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2994:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2995:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionUserDefinedAccess().getVariableDefinitionUserDefinedAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3000:2: ( (lv_type_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3001:1: (lv_type_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3001:1: (lv_type_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3002:3: lv_type_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getTypeVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined6426);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3018:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3019:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3019:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3020:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined6447);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3036:2: (otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==33) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3036:4: otherlv_3= '=' otherlv_4= 'new' ( (lv_constructor_5_0= ruleVariableName ) ) otherlv_6= '(' ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionUserDefined6460); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionUserDefinedAccess().getEqualsSignKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleVariableDefinitionUserDefined6472); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionUserDefinedAccess().getNewKeyword_3_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3044:1: ( (lv_constructor_5_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3045:1: (lv_constructor_5_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3045:1: (lv_constructor_5_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3046:3: lv_constructor_5_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getConstructorVariableNameParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined6493);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinitionUserDefined6505); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionUserDefinedAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3066:1: ( ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )* )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_ID) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3066:2: ( (lv_parameters_7_0= ruleParameterAssignment ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3066:2: ( (lv_parameters_7_0= ruleParameterAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3067:1: (lv_parameters_7_0= ruleParameterAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3067:1: (lv_parameters_7_0= ruleParameterAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3068:3: lv_parameters_7_0= ruleParameterAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined6527);
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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3084:2: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) ) )*
                            loop61:
                            do {
                                int alt61=2;
                                int LA61_0 = input.LA(1);

                                if ( (LA61_0==15) ) {
                                    alt61=1;
                                }


                                switch (alt61) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3084:4: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    {
                            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinitionUserDefined6540); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionUserDefinedAccess().getCommaKeyword_3_4_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3088:1: ( (lv_parameters_9_0= ruleParameterAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3089:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3089:1: (lv_parameters_9_0= ruleParameterAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3090:3: lv_parameters_9_0= ruleParameterAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDefinitionUserDefinedAccess().getParametersParameterAssignmentParserRuleCall_3_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined6561);
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
                            	    break loop61;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinitionUserDefined6577); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3118:1: entryRuleVariableDefinitionCollection returns [EObject current=null] : iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF ;
    public final EObject entryRuleVariableDefinitionCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionCollection = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3119:2: (iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3120:2: iv_ruleVariableDefinitionCollection= ruleVariableDefinitionCollection EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionCollectionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection6615);
            iv_ruleVariableDefinitionCollection=ruleVariableDefinitionCollection();

            state._fsp--;

             current =iv_ruleVariableDefinitionCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionCollection6625); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3127:1: ruleVariableDefinitionCollection returns [EObject current=null] : ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3130:28: ( ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3131:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3131:1: ( () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3131:2: () ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) ) (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3131:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3132:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionCollectionAccess().getVariableDefinitionCollectionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3137:2: ( ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3137:3: ( (lv_collection_1_0= ruleCollectionID ) ) otherlv_2= '<' ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) ) otherlv_4= '>' ( (lv_name_5_0= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3137:3: ( (lv_collection_1_0= ruleCollectionID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3138:1: (lv_collection_1_0= ruleCollectionID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3138:1: (lv_collection_1_0= ruleCollectionID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3139:3: lv_collection_1_0= ruleCollectionID
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection6681);
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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleVariableDefinitionCollection6693); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionCollectionAccess().getLessThanSignKeyword_1_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3159:1: ( ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3160:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3160:1: ( (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3161:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3161:1: (lv_type_3_1= ruleVariableType | lv_type_3_2= ruleVariableName )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=36 && LA64_0<=46)) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ID) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3162:3: lv_type_3_1= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableTypeParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection6716);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3177:8: lv_type_3_2= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getTypeVariableNameParserRuleCall_1_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection6735);
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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleVariableDefinitionCollection6750); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionCollectionAccess().getGreaterThanSignKeyword_1_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3199:1: ( (lv_name_5_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3200:1: (lv_name_5_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3200:1: (lv_name_5_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3201:3: lv_name_5_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getNameVariableNameParserRuleCall_1_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection6771);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3217:3: (otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==33) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3217:5: otherlv_6= '=' ( (lv_value_7_0= ruleList ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionCollection6785); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionCollectionAccess().getEqualsSignKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3221:1: ( (lv_value_7_0= ruleList ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3222:1: (lv_value_7_0= ruleList )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3222:1: (lv_value_7_0= ruleList )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3223:3: lv_value_7_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionCollectionAccess().getValueListParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleVariableDefinitionCollection6806);
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

                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinitionCollection6818); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3251:1: entryRuleCollectionID returns [String current=null] : iv_ruleCollectionID= ruleCollectionID EOF ;
    public final String entryRuleCollectionID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionID = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3252:2: (iv_ruleCollectionID= ruleCollectionID EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3253:2: iv_ruleCollectionID= ruleCollectionID EOF
            {
             newCompositeNode(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID6857);
            iv_ruleCollectionID=ruleCollectionID();

            state._fsp--;

             current =iv_ruleCollectionID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID6868); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3260:1: ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3263:28: ( (kw= 'LIST' | kw= 'SET' | kw= 'HASH' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3264:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3264:1: (kw= 'LIST' | kw= 'SET' | kw= 'HASH' )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt66=1;
                }
                break;
            case 51:
                {
                alt66=2;
                }
                break;
            case 52:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3265:2: kw= 'LIST'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleCollectionID6906); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3272:2: kw= 'SET'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleCollectionID6925); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3279:2: kw= 'HASH'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleCollectionID6944); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3292:1: entryRuleVariableDefinitionBasic returns [EObject current=null] : iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF ;
    public final EObject entryRuleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionBasic = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3293:2: (iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3294:2: iv_ruleVariableDefinitionBasic= ruleVariableDefinitionBasic EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionBasicRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic6984);
            iv_ruleVariableDefinitionBasic=ruleVariableDefinitionBasic();

            state._fsp--;

             current =iv_ruleVariableDefinitionBasic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionBasic6994); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3301:1: ruleVariableDefinitionBasic returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableDefinitionBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3304:28: ( ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3305:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3305:1: ( () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3305:2: () ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3305:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3306:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionBasicAccess().getVariableDefinitionBasicAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3311:2: ( (lv_type_1_0= ruleVariableType ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3312:1: (lv_type_1_0= ruleVariableType )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3312:1: (lv_type_1_0= ruleVariableType )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3313:3: lv_type_1_0= ruleVariableType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getTypeVariableTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic7049);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3329:2: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3330:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3330:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3331:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic7070);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinitionBasic7082); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionBasicAccess().getEqualsSignKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3351:1: ( (lv_expression_4_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3352:1: (lv_expression_4_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3352:1: (lv_expression_4_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3353:3: lv_expression_4_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableDefinitionBasicAccess().getExpressionVariableExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic7103);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3377:1: entryRuleParameterAssignment returns [EObject current=null] : iv_ruleParameterAssignment= ruleParameterAssignment EOF ;
    public final EObject entryRuleParameterAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3378:2: (iv_ruleParameterAssignment= ruleParameterAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3379:2: iv_ruleParameterAssignment= ruleParameterAssignment EOF
            {
             newCompositeNode(grammarAccess.getParameterAssignmentRule()); 
            pushFollow(FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment7139);
            iv_ruleParameterAssignment=ruleParameterAssignment();

            state._fsp--;

             current =iv_ruleParameterAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterAssignment7149); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3386:1: ruleParameterAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) ;
    public final EObject ruleParameterAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3389:28: ( ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3390:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3390:1: ( ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3390:2: ( (lv_name_0_0= ruleVariableName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVariableExpressionObject ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3390:2: ( (lv_name_0_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3391:1: (lv_name_0_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3391:1: (lv_name_0_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3392:3: lv_name_0_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getNameVariableNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleParameterAssignment7195);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleParameterAssignment7207); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3412:1: ( (lv_value_2_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3413:1: (lv_value_2_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3413:1: (lv_value_2_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3414:3: lv_value_2_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getParameterAssignmentAccess().getValueVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment7228);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3438:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3439:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3440:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment7264);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment7274); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3447:1: ruleVariableAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3450:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3451:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3451:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3451:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3451:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3452:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3457:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3458:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3458:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3459:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment7329);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleVariableAssignment7341); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3479:1: ( (lv_expression_3_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3480:1: (lv_expression_3_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3480:1: (lv_expression_3_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3481:3: lv_expression_3_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableAssignment7362);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3505:1: entryRuleVariableAssignmentObject returns [EObject current=null] : iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF ;
    public final EObject entryRuleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignmentObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3506:2: (iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3507:2: iv_ruleVariableAssignmentObject= ruleVariableAssignmentObject EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentObjectRule()); 
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject7398);
            iv_ruleVariableAssignmentObject=ruleVariableAssignmentObject();

            state._fsp--;

             current =iv_ruleVariableAssignmentObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignmentObject7408); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3514:1: ruleVariableAssignmentObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) ;
    public final EObject ruleVariableAssignmentObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAttribute_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3517:28: ( ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:1: ( ( () ruleVariableName ) | this_VariableAttribute_2= ruleVariableAttribute )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==EOF||LA67_1==33) ) {
                    alt67=1;
                }
                else if ( ((LA67_1>=47 && LA67_1<=48)) ) {
                    alt67=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3518:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3519:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariableAssignmentObjectAccess().getVariableAssignmentObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject7459);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3534:5: this_VariableAttribute_2= ruleVariableAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAssignmentObjectAccess().getVariableAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject7487);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3550:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3551:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3552:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression7522);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression7532); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3559:1: ruleVariableExpression returns [EObject current=null] : ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3562:28: ( ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3563:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3563:1: ( () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3563:2: () ( (lv_members_1_0= ruleVariableExpressionObject ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3563:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3564:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3569:2: ( (lv_members_1_0= ruleVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3570:1: (lv_members_1_0= ruleVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3570:1: (lv_members_1_0= ruleVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3571:3: lv_members_1_0= ruleVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression7587);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3587:2: ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=53 && LA68_0<=55)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3588:5: ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression7604);
            	    ruleVariableExpressionOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3595:1: ( (lv_members_3_0= ruleVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3596:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3596:1: (lv_members_3_0= ruleVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3597:3: lv_members_3_0= ruleVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableExpressionObjectParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression7624);
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
            	    break loop68;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3621:1: entryRuleVariableExpressionObject returns [EObject current=null] : iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF ;
    public final EObject entryRuleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3622:2: (iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3623:2: iv_ruleVariableExpressionObject= ruleVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject7662);
            iv_ruleVariableExpressionObject=ruleVariableExpressionObject();

            state._fsp--;

             current =iv_ruleVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionObject7672); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3630:1: ruleVariableExpressionObject returns [EObject current=null] : (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) ;
    public final EObject ruleVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicVariableExpressionObject_0 = null;

        EObject this_CompoundVariableExpressionObject_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3633:28: ( (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3634:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3634:1: (this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject | this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_INT)||(LA69_0>=53 && LA69_0<=54)) ) {
                alt69=1;
            }
            else if ( (LA69_0==71) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3635:5: this_AtomicVariableExpressionObject_0= ruleAtomicVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getAtomicVariableExpressionObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject7719);
                    this_AtomicVariableExpressionObject_0=ruleAtomicVariableExpressionObject();

                    state._fsp--;

                     
                            current = this_AtomicVariableExpressionObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3645:5: this_CompoundVariableExpressionObject_1= ruleCompoundVariableExpressionObject
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExpressionObjectAccess().getCompoundVariableExpressionObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject7746);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3661:1: entryRuleAtomicVariableExpressionObject returns [EObject current=null] : iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF ;
    public final EObject entryRuleAtomicVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3662:2: (iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3663:2: iv_ruleAtomicVariableExpressionObject= ruleAtomicVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject7781);
            iv_ruleAtomicVariableExpressionObject=ruleAtomicVariableExpressionObject();

            state._fsp--;

             current =iv_ruleAtomicVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject7791); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3670:1: ruleAtomicVariableExpressionObject returns [EObject current=null] : ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3673:28: ( ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )
            int alt70=6;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:2: ( () ( (lv_variable_1_0= ruleVariableName ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:3: () ( (lv_variable_1_0= ruleVariableName ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3674:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3675:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicVariableExpressionObjectAccess().getAtomicVariableExpressionObjectAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3680:2: ( (lv_variable_1_0= ruleVariableName ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3681:1: (lv_variable_1_0= ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3681:1: (lv_variable_1_0= ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3682:3: lv_variable_1_0= ruleVariableName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getVariableVariableNameParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject7847);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3699:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3699:6: ( (lv_attribute_2_0= ruleVariableAttribute ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3700:1: (lv_attribute_2_0= ruleVariableAttribute )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3700:1: (lv_attribute_2_0= ruleVariableAttribute )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3701:3: lv_attribute_2_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getAttributeVariableAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject7875);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3718:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3718:6: ( (lv_complex_3_0= ruleVariableComplex ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3719:1: (lv_complex_3_0= ruleVariableComplex )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3719:1: (lv_complex_3_0= ruleVariableComplex )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3720:3: lv_complex_3_0= ruleVariableComplex
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getComplexVariableComplexParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject7902);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3737:6: ( (lv_value_4_0= ruleREAL ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3737:6: ( (lv_value_4_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3738:1: (lv_value_4_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3738:1: (lv_value_4_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3739:3: lv_value_4_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getValueREALParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject7929);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3756:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3756:6: ( (lv_quantity_5_0= ruleQuantity ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3757:1: (lv_quantity_5_0= ruleQuantity )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3757:1: (lv_quantity_5_0= ruleQuantity )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3758:3: lv_quantity_5_0= ruleQuantity
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicVariableExpressionObjectAccess().getQuantityQuantityParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject7956);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3775:6: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3775:6: ( (lv_string_6_0= RULE_STRING ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3776:1: (lv_string_6_0= RULE_STRING )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3776:1: (lv_string_6_0= RULE_STRING )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3777:3: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject7979); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3801:1: entryRuleCompoundVariableExpressionObject returns [EObject current=null] : iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF ;
    public final EObject entryRuleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundVariableExpressionObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3802:2: (iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3803:2: iv_ruleCompoundVariableExpressionObject= ruleCompoundVariableExpressionObject EOF
            {
             newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectRule()); 
            pushFollow(FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject8020);
            iv_ruleCompoundVariableExpressionObject=ruleCompoundVariableExpressionObject();

            state._fsp--;

             current =iv_ruleCompoundVariableExpressionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject8030); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3810:1: ruleCompoundVariableExpressionObject returns [EObject current=null] : ( () ( (lv_list_1_0= ruleList ) ) ) ;
    public final EObject ruleCompoundVariableExpressionObject() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3813:28: ( ( () ( (lv_list_1_0= ruleList ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3814:1: ( () ( (lv_list_1_0= ruleList ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3814:1: ( () ( (lv_list_1_0= ruleList ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3814:2: () ( (lv_list_1_0= ruleList ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3814:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3815:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompoundVariableExpressionObjectAccess().getCompoundVariableExpressionObjectAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3820:2: ( (lv_list_1_0= ruleList ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3821:1: (lv_list_1_0= ruleList )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3821:1: (lv_list_1_0= ruleList )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3822:3: lv_list_1_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getCompoundVariableExpressionObjectAccess().getListListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject8085);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3846:1: entryRuleVariableExpressionOperator returns [String current=null] : iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF ;
    public final String entryRuleVariableExpressionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableExpressionOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3847:2: (iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3848:2: iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator8122);
            iv_ruleVariableExpressionOperator=ruleVariableExpressionOperator();

            state._fsp--;

             current =iv_ruleVariableExpressionOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator8133); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3855:1: ruleVariableExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleVariableExpressionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3858:28: ( (kw= '+' | kw= '-' | kw= '|' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3859:1: (kw= '+' | kw= '-' | kw= '|' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3859:1: (kw= '+' | kw= '-' | kw= '|' )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt71=1;
                }
                break;
            case 54:
                {
                alt71=2;
                }
                break;
            case 55:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3860:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleVariableExpressionOperator8171); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3867:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleVariableExpressionOperator8190); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3874:2: kw= '|'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleVariableExpressionOperator8209); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3887:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3888:2: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3889:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition8249);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition8259); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3896:1: ruleRuleDefinition returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3899:28: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3900:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3900:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3900:2: () otherlv_1= 'RULE' ( (lv_name_2_0= ruleVariableName ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3900:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3901:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleRuleDefinition8305); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3910:1: ( (lv_name_2_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3911:1: (lv_name_2_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3911:1: (lv_name_2_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3912:3: lv_name_2_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getNameVariableNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRuleDefinition8326);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRuleDefinition8338); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3932:1: ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3932:2: ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3932:2: ( (lv_lhs_4_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3933:1: (lv_lhs_4_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3933:1: (lv_lhs_4_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3934:3: lv_lhs_4_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition8360);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3950:2: (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==53) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3950:4: otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleRuleDefinition8373); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3954:1: ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3955:1: (lv_lhs_6_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3955:1: (lv_lhs_6_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3956:3: lv_lhs_6_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition8394);
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
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3972:6: (otherlv_7= '->' | ( (lv_reversible_8_0= '<->' ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==57) ) {
                alt74=1;
            }
            else if ( (LA74_0==58) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3972:8: otherlv_7= '->'
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleRuleDefinition8411); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3977:6: ( (lv_reversible_8_0= '<->' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3977:6: ( (lv_reversible_8_0= '<->' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3978:1: (lv_reversible_8_0= '<->' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3978:1: (lv_reversible_8_0= '<->' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3979:3: lv_reversible_8_0= '<->'
                    {
                    lv_reversible_8_0=(Token)match(input,58,FOLLOW_58_in_ruleRuleDefinition8435); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3992:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3992:4: ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3992:4: ( (lv_rhs_9_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3993:1: (lv_rhs_9_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3993:1: (lv_rhs_9_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:3994:3: lv_rhs_9_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition8471);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4010:2: (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==53) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4010:4: otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleRuleDefinition8484); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4014:1: ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4015:1: (lv_rhs_11_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4015:1: (lv_rhs_11_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4016:3: lv_rhs_11_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition8505);
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
                    	    break loop75;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4040:1: entryRuleRuleObject returns [EObject current=null] : iv_ruleRuleObject= ruleRuleObject EOF ;
    public final EObject entryRuleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4041:2: (iv_ruleRuleObject= ruleRuleObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4042:2: iv_ruleRuleObject= ruleRuleObject EOF
            {
             newCompositeNode(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject8545);
            iv_ruleRuleObject=ruleRuleObject();

            state._fsp--;

             current =iv_ruleRuleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject8555); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4049:1: ruleRuleObject returns [EObject current=null] : ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) ;
    public final EObject ruleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject this_VariableComplex_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4052:28: ( ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4053:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4053:1: ( ( () ruleVariableName ) | this_VariableComplex_2= ruleVariableComplex )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==EOF||LA77_1==RULE_ID||LA77_1==16||(LA77_1>=20 && LA77_1<=24)||LA77_1==32||(LA77_1>=36 && LA77_1<=46)||(LA77_1>=50 && LA77_1<=53)||(LA77_1>=56 && LA77_1<=59)||LA77_1==61) ) {
                    alt77=1;
                }
                else if ( (LA77_1==47) ) {
                    alt77=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4053:2: ( () ruleVariableName )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4053:2: ( () ruleVariableName )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4053:3: () ruleVariableName
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4053:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4054:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getRuleObjectAccess().getRuleObjectAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableNameParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableName_in_ruleRuleObject8606);
                    ruleVariableName();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4069:5: this_VariableComplex_2= ruleVariableComplex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleObjectAccess().getVariableComplexParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableComplex_in_ruleRuleObject8634);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4085:1: entryRuleATGCDefinition returns [EObject current=null] : iv_ruleATGCDefinition= ruleATGCDefinition EOF ;
    public final EObject entryRuleATGCDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATGCDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4086:2: (iv_ruleATGCDefinition= ruleATGCDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4087:2: iv_ruleATGCDefinition= ruleATGCDefinition EOF
            {
             newCompositeNode(grammarAccess.getATGCDefinitionRule()); 
            pushFollow(FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition8669);
            iv_ruleATGCDefinition=ruleATGCDefinition();

            state._fsp--;

             current =iv_ruleATGCDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCDefinition8679); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4094:1: ruleATGCDefinition returns [EObject current=null] : ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4097:28: ( ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4098:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4098:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4098:2: () otherlv_1= 'ATGC' ( (lv_command_2_0= ruleATGCCommand ) ) otherlv_3= ':' ( (lv_arguments_4_0= ruleVariableName ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4098:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4099:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleATGCDefinition8725); 

                	newLeafNode(otherlv_1, grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4108:1: ( (lv_command_2_0= ruleATGCCommand ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4109:1: (lv_command_2_0= ruleATGCCommand )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4109:1: (lv_command_2_0= ruleATGCCommand )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4110:3: lv_command_2_0= ruleATGCCommand
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getCommandATGCCommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATGCCommand_in_ruleATGCDefinition8746);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleATGCDefinition8758); 

                	newLeafNode(otherlv_3, grammarAccess.getATGCDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4130:1: ( (lv_arguments_4_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4131:1: (lv_arguments_4_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4131:1: (lv_arguments_4_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4132:3: lv_arguments_4_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition8779);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4148:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==15) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4148:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleVariableName ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleATGCDefinition8792); 

            	        	newLeafNode(otherlv_5, grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4152:1: ( (lv_arguments_6_0= ruleVariableName ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4153:1: (lv_arguments_6_0= ruleVariableName )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4153:1: (lv_arguments_6_0= ruleVariableName )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4154:3: lv_arguments_6_0= ruleVariableName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getATGCDefinitionAccess().getArgumentsVariableNameParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableName_in_ruleATGCDefinition8813);
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
    // $ANTLR end "ruleATGCDefinition"


    // $ANTLR start "entryRuleATGCCommand"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4178:1: entryRuleATGCCommand returns [String current=null] : iv_ruleATGCCommand= ruleATGCCommand EOF ;
    public final String entryRuleATGCCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATGCCommand = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4179:2: (iv_ruleATGCCommand= ruleATGCCommand EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4180:2: iv_ruleATGCCommand= ruleATGCCommand EOF
            {
             newCompositeNode(grammarAccess.getATGCCommandRule()); 
            pushFollow(FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand8852);
            iv_ruleATGCCommand=ruleATGCCommand();

            state._fsp--;

             current =iv_ruleATGCCommand.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCCommand8863); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4187:1: ruleATGCCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ARRANGE' ;
    public final AntlrDatatypeRuleToken ruleATGCCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4190:28: (kw= 'ARRANGE' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4192:2: kw= 'ARRANGE'
            {
            kw=(Token)match(input,60,FOLLOW_60_in_ruleATGCCommand8900); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4205:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4206:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4207:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition8939);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition8949); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4214:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_property_2_1 = null;

        EObject lv_property_2_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4217:28: ( ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4218:1: ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4218:1: ( () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4218:2: () otherlv_1= 'VERIFY' ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4218:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4219:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_rulePropertyDefinition8995); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getVERIFYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4228:1: ( ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4229:1: ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4229:1: ( (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4230:1: (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4230:1: (lv_property_2_1= ruleProbabilityProperty | lv_property_2_2= ruleRewardProperty )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==71) ) {
                alt79=1;
            }
            else if ( (LA79_0==70) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4231:3: lv_property_2_1= ruleProbabilityProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyProbabilityPropertyParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProbabilityProperty_in_rulePropertyDefinition9018);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4246:8: lv_property_2_2= ruleRewardProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyRewardPropertyParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleRewardProperty_in_rulePropertyDefinition9037);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4272:1: entryRuleProbabilityProperty returns [EObject current=null] : iv_ruleProbabilityProperty= ruleProbabilityProperty EOF ;
    public final EObject entryRuleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4273:2: (iv_ruleProbabilityProperty= ruleProbabilityProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4274:2: iv_ruleProbabilityProperty= ruleProbabilityProperty EOF
            {
             newCompositeNode(grammarAccess.getProbabilityPropertyRule()); 
            pushFollow(FOLLOW_ruleProbabilityProperty_in_entryRuleProbabilityProperty9076);
            iv_ruleProbabilityProperty=ruleProbabilityProperty();

            state._fsp--;

             current =iv_ruleProbabilityProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbabilityProperty9086); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4281:1: ruleProbabilityProperty returns [EObject current=null] : ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4284:28: ( ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4285:1: ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4285:1: ( () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4285:2: () ( (lv_stateFormula1_1_0= ruleStateFormula ) ) ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) ) ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )? (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4285:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4286:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProbabilityPropertyAccess().getProbabilityPropertyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4291:2: ( (lv_stateFormula1_1_0= ruleStateFormula ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4292:1: (lv_stateFormula1_1_0= ruleStateFormula )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4292:1: (lv_stateFormula1_1_0= ruleStateFormula )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4293:3: lv_stateFormula1_1_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getStateFormula1StateFormulaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleProbabilityProperty9141);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:2: ( ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? ) | ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=62 && LA85_0<=66)) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=67 && LA85_0<=68)) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:3: ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:3: ( ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )? )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:4: ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) ) ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )?
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:4: ( ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) ) | ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) ) )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( ((LA82_0>=62 && LA82_0<=64)) ) {
                        alt82=1;
                    }
                    else if ( ((LA82_0>=65 && LA82_0<=66)) ) {
                        alt82=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:5: ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:5: ( ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) ) | ( (lv_isNever_3_0= 'NEVER HOLDS' ) ) | ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) ) )
                            int alt80=3;
                            switch ( input.LA(1) ) {
                            case 62:
                                {
                                alt80=1;
                                }
                                break;
                            case 63:
                                {
                                alt80=2;
                                }
                                break;
                            case 64:
                                {
                                alt80=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 80, 0, input);

                                throw nvae;
                            }

                            switch (alt80) {
                                case 1 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:6: ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4309:6: ( (lv_isEventually_2_0= 'EVENTUALLY HOLDS' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4310:1: (lv_isEventually_2_0= 'EVENTUALLY HOLDS' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4310:1: (lv_isEventually_2_0= 'EVENTUALLY HOLDS' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4311:3: lv_isEventually_2_0= 'EVENTUALLY HOLDS'
                                    {
                                    lv_isEventually_2_0=(Token)match(input,62,FOLLOW_62_in_ruleProbabilityProperty9163); 

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
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4325:6: ( (lv_isNever_3_0= 'NEVER HOLDS' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4325:6: ( (lv_isNever_3_0= 'NEVER HOLDS' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4326:1: (lv_isNever_3_0= 'NEVER HOLDS' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4326:1: (lv_isNever_3_0= 'NEVER HOLDS' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4327:3: lv_isNever_3_0= 'NEVER HOLDS'
                                    {
                                    lv_isNever_3_0=(Token)match(input,63,FOLLOW_63_in_ruleProbabilityProperty9200); 

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
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4341:6: ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4341:6: ( (lv_isAlways_4_0= 'ALWAYS HOLDS' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4342:1: (lv_isAlways_4_0= 'ALWAYS HOLDS' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4342:1: (lv_isAlways_4_0= 'ALWAYS HOLDS' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4343:3: lv_isAlways_4_0= 'ALWAYS HOLDS'
                                    {
                                    lv_isAlways_4_0=(Token)match(input,64,FOLLOW_64_in_ruleProbabilityProperty9237); 

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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4357:6: ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4357:6: ( ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4357:7: ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) ) ( (lv_stateFormula2_7_0= ruleStateFormula ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4357:7: ( ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) ) | ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) ) )
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==65) ) {
                                alt81=1;
                            }
                            else if ( (LA81_0==66) ) {
                                alt81=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 81, 0, input);

                                throw nvae;
                            }
                            switch (alt81) {
                                case 1 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4357:8: ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4357:8: ( (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4358:1: (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4358:1: (lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4359:3: lv_isUntilThen_5_0= 'WILL HOLD UNTIL THEN'
                                    {
                                    lv_isUntilThen_5_0=(Token)match(input,65,FOLLOW_65_in_ruleProbabilityProperty9277); 

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
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4373:6: ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4373:6: ( (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4374:1: (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4374:1: (lv_isFollowedBy_6_0= 'IS FOLLOWED BY' )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4375:3: lv_isFollowedBy_6_0= 'IS FOLLOWED BY'
                                    {
                                    lv_isFollowedBy_6_0=(Token)match(input,66,FOLLOW_66_in_ruleProbabilityProperty9314); 

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

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4388:3: ( (lv_stateFormula2_7_0= ruleStateFormula ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4389:1: (lv_stateFormula2_7_0= ruleStateFormula )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4389:1: (lv_stateFormula2_7_0= ruleStateFormula )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4390:3: lv_stateFormula2_7_0= ruleStateFormula
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getStateFormula2StateFormulaParserRuleCall_2_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStateFormula_in_ruleProbabilityProperty9349);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4406:4: ( ( (lv_timeInstant_8_0= ruleTimeInstant ) ) | ( (lv_timeInterval_9_0= ruleTimeInterval ) ) )?
                    int alt83=3;
                    int LA83_0 = input.LA(1);

                    if ( ((LA83_0>=78 && LA83_0<=80)) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==81) ) {
                        alt83=2;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4406:5: ( (lv_timeInstant_8_0= ruleTimeInstant ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4406:5: ( (lv_timeInstant_8_0= ruleTimeInstant ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4407:1: (lv_timeInstant_8_0= ruleTimeInstant )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4407:1: (lv_timeInstant_8_0= ruleTimeInstant )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4408:3: lv_timeInstant_8_0= ruleTimeInstant
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getTimeInstantTimeInstantParserRuleCall_2_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTimeInstant_in_ruleProbabilityProperty9373);
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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4425:6: ( (lv_timeInterval_9_0= ruleTimeInterval ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4425:6: ( (lv_timeInterval_9_0= ruleTimeInterval ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4426:1: (lv_timeInterval_9_0= ruleTimeInterval )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4426:1: (lv_timeInterval_9_0= ruleTimeInterval )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4427:3: lv_timeInterval_9_0= ruleTimeInterval
                            {
                             
                            	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getTimeIntervalTimeIntervalParserRuleCall_2_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTimeInterval_in_ruleProbabilityProperty9400);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4444:6: ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4444:6: ( ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) ) | ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==67) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==68) ) {
                        alt84=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4444:7: ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4444:7: ( (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4445:1: (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4445:1: (lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4446:3: lv_isSteadyState_10_0= 'HOLDS IN STEADY-STATE'
                            {
                            lv_isSteadyState_10_0=(Token)match(input,67,FOLLOW_67_in_ruleProbabilityProperty9428); 

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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4460:6: ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4460:6: ( (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4461:1: (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4461:1: (lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4462:3: lv_isInfinitelyOften_11_0= 'HOLDS INFINITELY OFTEN'
                            {
                            lv_isInfinitelyOften_11_0=(Token)match(input,68,FOLLOW_68_in_ruleProbabilityProperty9465); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4475:4: ( (lv_probabilityConstraint_12_0= ruleProbabilityConstraint ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==82) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4476:1: (lv_probabilityConstraint_12_0= ruleProbabilityConstraint )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4476:1: (lv_probabilityConstraint_12_0= ruleProbabilityConstraint )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4477:3: lv_probabilityConstraint_12_0= ruleProbabilityConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getProbabilityConstraintProbabilityConstraintParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProbabilityConstraint_in_ruleProbabilityProperty9501);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4493:3: (otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==69) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4493:5: otherlv_13= 'GIVEN' ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) ) (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_13=(Token)match(input,69,FOLLOW_69_in_ruleProbabilityProperty9515); 

                        	newLeafNode(otherlv_13, grammarAccess.getProbabilityPropertyAccess().getGIVENKeyword_4_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4497:1: ( (lv_initialConditions_14_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4498:1: (lv_initialConditions_14_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4498:1: (lv_initialConditions_14_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4499:3: lv_initialConditions_14_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty9536);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4515:2: (otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==15) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4515:4: otherlv_15= ',' ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleProbabilityProperty9549); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getProbabilityPropertyAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4519:1: ( (lv_initialConditions_16_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4520:1: (lv_initialConditions_16_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4520:1: (lv_initialConditions_16_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4521:3: lv_initialConditions_16_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty9570);
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
                    	    break loop87;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4545:1: entryRuleRewardProperty returns [EObject current=null] : iv_ruleRewardProperty= ruleRewardProperty EOF ;
    public final EObject entryRuleRewardProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewardProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4546:2: (iv_ruleRewardProperty= ruleRewardProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4547:2: iv_ruleRewardProperty= ruleRewardProperty EOF
            {
             newCompositeNode(grammarAccess.getRewardPropertyRule()); 
            pushFollow(FOLLOW_ruleRewardProperty_in_entryRuleRewardProperty9610);
            iv_ruleRewardProperty=ruleRewardProperty();

            state._fsp--;

             current =iv_ruleRewardProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewardProperty9620); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4554:1: ruleRewardProperty returns [EObject current=null] : ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4557:28: ( ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4558:1: ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4558:1: ( () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4558:2: () otherlv_1= 'EXPECTED' otherlv_2= '[' ( (lv_name_3_0= ruleVariableName ) ) otherlv_4= ']' ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) ) otherlv_6= 'IS ' ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) ) (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4558:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4559:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRewardPropertyAccess().getRewardPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleRewardProperty9666); 

                	newLeafNode(otherlv_1, grammarAccess.getRewardPropertyAccess().getEXPECTEDKeyword_1());
                
            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleRewardProperty9678); 

                	newLeafNode(otherlv_2, grammarAccess.getRewardPropertyAccess().getLeftSquareBracketKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4572:1: ( (lv_name_3_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4573:1: (lv_name_3_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4573:1: (lv_name_3_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4574:3: lv_name_3_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getNameVariableNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleRewardProperty9699);
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

            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleRewardProperty9711); 

                	newLeafNode(otherlv_4, grammarAccess.getRewardPropertyAccess().getRightSquareBracketKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4594:1: ( (lv_timeInstant_5_0= ruleRewardTimeInstant ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4595:1: (lv_timeInstant_5_0= ruleRewardTimeInstant )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4595:1: (lv_timeInstant_5_0= ruleRewardTimeInstant )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4596:3: lv_timeInstant_5_0= ruleRewardTimeInstant
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getTimeInstantRewardTimeInstantParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRewardTimeInstant_in_ruleRewardProperty9732);
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

            otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleRewardProperty9744); 

                	newLeafNode(otherlv_6, grammarAccess.getRewardPropertyAccess().getISKeyword_6());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4616:1: ( (lv_concentrationConstraint_7_0= ruleConcentrationConstraint ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4617:1: (lv_concentrationConstraint_7_0= ruleConcentrationConstraint )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4617:1: (lv_concentrationConstraint_7_0= ruleConcentrationConstraint )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4618:3: lv_concentrationConstraint_7_0= ruleConcentrationConstraint
            {
             
            	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getConcentrationConstraintConcentrationConstraintParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationConstraint_in_ruleRewardProperty9765);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4634:2: (otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==69) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4634:4: otherlv_8= 'GIVEN' ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) ) (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )*
                    {
                    otherlv_8=(Token)match(input,69,FOLLOW_69_in_ruleRewardProperty9778); 

                        	newLeafNode(otherlv_8, grammarAccess.getRewardPropertyAccess().getGIVENKeyword_8_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4638:1: ( (lv_initialConditions_9_0= rulePropertyInitialCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4639:1: (lv_initialConditions_9_0= rulePropertyInitialCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4639:1: (lv_initialConditions_9_0= rulePropertyInitialCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4640:3: lv_initialConditions_9_0= rulePropertyInitialCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty9799);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4656:2: (otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==15) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4656:4: otherlv_10= ',' ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleRewardProperty9812); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRewardPropertyAccess().getCommaKeyword_8_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4660:1: ( (lv_initialConditions_11_0= rulePropertyInitialCondition ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4661:1: (lv_initialConditions_11_0= rulePropertyInitialCondition )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4661:1: (lv_initialConditions_11_0= rulePropertyInitialCondition )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4662:3: lv_initialConditions_11_0= rulePropertyInitialCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRewardPropertyAccess().getInitialConditionsPropertyInitialConditionParserRuleCall_8_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty9833);
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
                    	    break loop89;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4686:1: entryRuleStateExpression returns [EObject current=null] : iv_ruleStateExpression= ruleStateExpression EOF ;
    public final EObject entryRuleStateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4687:2: (iv_ruleStateExpression= ruleStateExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4688:2: iv_ruleStateExpression= ruleStateExpression EOF
            {
             newCompositeNode(grammarAccess.getStateExpressionRule()); 
            pushFollow(FOLLOW_ruleStateExpression_in_entryRuleStateExpression9873);
            iv_ruleStateExpression=ruleStateExpression();

            state._fsp--;

             current =iv_ruleStateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateExpression9883); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4695:1: ruleStateExpression returns [EObject current=null] : ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) ) ;
    public final EObject ruleStateExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_concentrationQuantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4698:28: ( ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4699:1: ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4699:1: ( () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4699:2: () ( (lv_name_1_0= ruleVariableName ) ) ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4699:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4700:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateExpressionAccess().getStateExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4705:2: ( (lv_name_1_0= ruleVariableName ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4706:1: (lv_name_1_0= ruleVariableName )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4706:1: (lv_name_1_0= ruleVariableName )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4707:3: lv_name_1_0= ruleVariableName
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getNameVariableNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableName_in_ruleStateExpression9938);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4723:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4724:1: (lv_operator_2_0= ruleRelationalOperator )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4724:1: (lv_operator_2_0= ruleRelationalOperator )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4725:3: lv_operator_2_0= ruleRelationalOperator
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getOperatorRelationalOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleStateExpression9959);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4741:2: ( (lv_concentrationQuantity_3_0= ruleConcentrationQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4742:1: (lv_concentrationQuantity_3_0= ruleConcentrationQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4742:1: (lv_concentrationQuantity_3_0= ruleConcentrationQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4743:3: lv_concentrationQuantity_3_0= ruleConcentrationQuantity
            {
             
            	        newCompositeNode(grammarAccess.getStateExpressionAccess().getConcentrationQuantityConcentrationQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_ruleStateExpression9980);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4767:1: entryRuleStateFormula returns [EObject current=null] : iv_ruleStateFormula= ruleStateFormula EOF ;
    public final EObject entryRuleStateFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFormula = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4768:2: (iv_ruleStateFormula= ruleStateFormula EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4769:2: iv_ruleStateFormula= ruleStateFormula EOF
            {
             newCompositeNode(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula10016);
            iv_ruleStateFormula=ruleStateFormula();

            state._fsp--;

             current =iv_ruleStateFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula10026); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4776:1: ruleStateFormula returns [EObject current=null] : ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4779:28: ( ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4780:1: ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4780:1: ( ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' ) | (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' ) )
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==71) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt92=1;
                    }
                    break;
                case 71:
                    {
                    alt92=3;
                    }
                    break;
                case 74:
                    {
                    alt92=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4780:2: ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4780:2: ( () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4780:3: () ( (lv_formula_1_0= '[' ) ) ( (lv_atomicFormula_2_0= ruleStateExpression ) ) otherlv_3= ']'
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4780:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4781:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStateFormulaAccess().getStateFormulaAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4786:2: ( (lv_formula_1_0= '[' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4787:1: (lv_formula_1_0= '[' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4787:1: (lv_formula_1_0= '[' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4788:3: lv_formula_1_0= '['
                    {
                    lv_formula_1_0=(Token)match(input,71,FOLLOW_71_in_ruleStateFormula10079); 

                            newLeafNode(lv_formula_1_0, grammarAccess.getStateFormulaAccess().getFormulaLeftSquareBracketKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateFormulaRule());
                    	        }
                           		setWithLastConsumed(current, "formula", lv_formula_1_0, "[");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4801:2: ( (lv_atomicFormula_2_0= ruleStateExpression ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4802:1: (lv_atomicFormula_2_0= ruleStateExpression )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4802:1: (lv_atomicFormula_2_0= ruleStateExpression )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4803:3: lv_atomicFormula_2_0= ruleStateExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getAtomicFormulaStateExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateExpression_in_ruleStateFormula10113);
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

                    otherlv_3=(Token)match(input,72,FOLLOW_72_in_ruleStateFormula10125); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateFormulaAccess().getRightSquareBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4824:6: (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4824:6: (otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4824:8: otherlv_4= '[' ( (lv_isNegation_5_0= 'NOT' ) ) ( (lv_negatedFormula_6_0= ruleStateFormula ) ) otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleStateFormula10145); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateFormulaAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4828:1: ( (lv_isNegation_5_0= 'NOT' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4829:1: (lv_isNegation_5_0= 'NOT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4829:1: (lv_isNegation_5_0= 'NOT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4830:3: lv_isNegation_5_0= 'NOT'
                    {
                    lv_isNegation_5_0=(Token)match(input,74,FOLLOW_74_in_ruleStateFormula10163); 

                            newLeafNode(lv_isNegation_5_0, grammarAccess.getStateFormulaAccess().getIsNegationNOTKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateFormulaRule());
                    	        }
                           		setWithLastConsumed(current, "isNegation", true, "NOT");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4843:2: ( (lv_negatedFormula_6_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4844:1: (lv_negatedFormula_6_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4844:1: (lv_negatedFormula_6_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4845:3: lv_negatedFormula_6_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getNegatedFormulaStateFormulaParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula10197);
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

                    otherlv_7=(Token)match(input,72,FOLLOW_72_in_ruleStateFormula10209); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateFormulaAccess().getRightSquareBracketKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4866:6: (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4866:6: (otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4866:8: otherlv_8= '[' ( (lv_leftFormula_9_0= ruleStateFormula ) ) ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) ) ( (lv_rightFormula_13_0= ruleStateFormula ) ) otherlv_14= ']'
                    {
                    otherlv_8=(Token)match(input,71,FOLLOW_71_in_ruleStateFormula10229); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateFormulaAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4870:1: ( (lv_leftFormula_9_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4871:1: (lv_leftFormula_9_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4871:1: (lv_leftFormula_9_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4872:3: lv_leftFormula_9_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftFormulaStateFormulaParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula10250);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4888:2: ( ( (lv_isConjunction_10_0= 'AND' ) ) | ( (lv_isDisjunction_11_0= 'OR' ) ) | ( (lv_isImplication_12_0= 'IMPLIES' ) ) )
                    int alt91=3;
                    switch ( input.LA(1) ) {
                    case 75:
                        {
                        alt91=1;
                        }
                        break;
                    case 76:
                        {
                        alt91=2;
                        }
                        break;
                    case 77:
                        {
                        alt91=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }

                    switch (alt91) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4888:3: ( (lv_isConjunction_10_0= 'AND' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4888:3: ( (lv_isConjunction_10_0= 'AND' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4889:1: (lv_isConjunction_10_0= 'AND' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4889:1: (lv_isConjunction_10_0= 'AND' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4890:3: lv_isConjunction_10_0= 'AND'
                            {
                            lv_isConjunction_10_0=(Token)match(input,75,FOLLOW_75_in_ruleStateFormula10269); 

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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4904:6: ( (lv_isDisjunction_11_0= 'OR' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4904:6: ( (lv_isDisjunction_11_0= 'OR' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4905:1: (lv_isDisjunction_11_0= 'OR' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4905:1: (lv_isDisjunction_11_0= 'OR' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4906:3: lv_isDisjunction_11_0= 'OR'
                            {
                            lv_isDisjunction_11_0=(Token)match(input,76,FOLLOW_76_in_ruleStateFormula10306); 

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
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4920:6: ( (lv_isImplication_12_0= 'IMPLIES' ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4920:6: ( (lv_isImplication_12_0= 'IMPLIES' ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4921:1: (lv_isImplication_12_0= 'IMPLIES' )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4921:1: (lv_isImplication_12_0= 'IMPLIES' )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4922:3: lv_isImplication_12_0= 'IMPLIES'
                            {
                            lv_isImplication_12_0=(Token)match(input,77,FOLLOW_77_in_ruleStateFormula10343); 

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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4935:3: ( (lv_rightFormula_13_0= ruleStateFormula ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4936:1: (lv_rightFormula_13_0= ruleStateFormula )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4936:1: (lv_rightFormula_13_0= ruleStateFormula )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4937:3: lv_rightFormula_13_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightFormulaStateFormulaParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula10378);
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

                    otherlv_14=(Token)match(input,72,FOLLOW_72_in_ruleStateFormula10390); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4965:1: entryRuleTimeInstant returns [EObject current=null] : iv_ruleTimeInstant= ruleTimeInstant EOF ;
    public final EObject entryRuleTimeInstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInstant = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4966:2: (iv_ruleTimeInstant= ruleTimeInstant EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4967:2: iv_ruleTimeInstant= ruleTimeInstant EOF
            {
             newCompositeNode(grammarAccess.getTimeInstantRule()); 
            pushFollow(FOLLOW_ruleTimeInstant_in_entryRuleTimeInstant10427);
            iv_ruleTimeInstant=ruleTimeInstant();

            state._fsp--;

             current =iv_ruleTimeInstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeInstant10437); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4974:1: ruleTimeInstant returns [EObject current=null] : ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4977:28: ( ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4978:1: ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4978:1: ( () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4978:2: () ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4978:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4979:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeInstantAccess().getTimeInstantAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4984:2: ( ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) ) | ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) ) | ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt93=1;
                }
                break;
            case 79:
                {
                alt93=2;
                }
                break;
            case 80:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4984:3: ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4984:3: ( ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4984:4: ( (lv_isEqualTo_1_0= 'AT' ) ) ( (lv_timeInstant_2_0= RULE_INT ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4984:4: ( (lv_isEqualTo_1_0= 'AT' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4985:1: (lv_isEqualTo_1_0= 'AT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4985:1: (lv_isEqualTo_1_0= 'AT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4986:3: lv_isEqualTo_1_0= 'AT'
                    {
                    lv_isEqualTo_1_0=(Token)match(input,78,FOLLOW_78_in_ruleTimeInstant10491); 

                            newLeafNode(lv_isEqualTo_1_0, grammarAccess.getTimeInstantAccess().getIsEqualToATKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isEqualTo", true, "AT");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:4999:2: ( (lv_timeInstant_2_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5000:1: (lv_timeInstant_2_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5000:1: (lv_timeInstant_2_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5001:3: lv_timeInstant_2_0= RULE_INT
                    {
                    lv_timeInstant_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInstant10521); 

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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5018:6: ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5018:6: ( ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5018:7: ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) ) ( (lv_timeInstant_4_0= RULE_INT ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5018:7: ( (lv_isLessThanOrEqual_3_0= 'BEFORE' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5019:1: (lv_isLessThanOrEqual_3_0= 'BEFORE' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5019:1: (lv_isLessThanOrEqual_3_0= 'BEFORE' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5020:3: lv_isLessThanOrEqual_3_0= 'BEFORE'
                    {
                    lv_isLessThanOrEqual_3_0=(Token)match(input,79,FOLLOW_79_in_ruleTimeInstant10552); 

                            newLeafNode(lv_isLessThanOrEqual_3_0, grammarAccess.getTimeInstantAccess().getIsLessThanOrEqualBEFOREKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isLessThanOrEqual", true, "BEFORE");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5033:2: ( (lv_timeInstant_4_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5034:1: (lv_timeInstant_4_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5034:1: (lv_timeInstant_4_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5035:3: lv_timeInstant_4_0= RULE_INT
                    {
                    lv_timeInstant_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInstant10582); 

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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5052:6: ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5052:6: ( ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5052:7: ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) ) ( (lv_timeInstant_6_0= RULE_INT ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5052:7: ( (lv_isGreaterThanOrEqual_5_0= 'AFTER' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5053:1: (lv_isGreaterThanOrEqual_5_0= 'AFTER' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5053:1: (lv_isGreaterThanOrEqual_5_0= 'AFTER' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5054:3: lv_isGreaterThanOrEqual_5_0= 'AFTER'
                    {
                    lv_isGreaterThanOrEqual_5_0=(Token)match(input,80,FOLLOW_80_in_ruleTimeInstant10613); 

                            newLeafNode(lv_isGreaterThanOrEqual_5_0, grammarAccess.getTimeInstantAccess().getIsGreaterThanOrEqualAFTERKeyword_1_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeInstantRule());
                    	        }
                           		setWithLastConsumed(current, "isGreaterThanOrEqual", true, "AFTER");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5067:2: ( (lv_timeInstant_6_0= RULE_INT ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5068:1: (lv_timeInstant_6_0= RULE_INT )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5068:1: (lv_timeInstant_6_0= RULE_INT )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5069:3: lv_timeInstant_6_0= RULE_INT
                    {
                    lv_timeInstant_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInstant10643); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5085:4: ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5086:1: (lv_timeUnit_7_0= ruleTimeUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5086:1: (lv_timeUnit_7_0= ruleTimeUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5087:3: lv_timeUnit_7_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getTimeInstantAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeInstant10671);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5111:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5112:2: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5113:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_ruleTimeInterval_in_entryRuleTimeInterval10707);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;

             current =iv_ruleTimeInterval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeInterval10717); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5120:1: ruleTimeInterval returns [EObject current=null] : ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5123:28: ( ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5124:1: ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5124:1: ( () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5124:2: () otherlv_1= 'WITHIN' otherlv_2= '[' ( (lv_lowerBound_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_upperBound_5_0= RULE_INT ) ) otherlv_6= ']' ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5124:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5125:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTimeIntervalAccess().getTimeIntervalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleTimeInterval10763); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getWITHINKeyword_1());
                
            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleTimeInterval10775); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeIntervalAccess().getLeftSquareBracketKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5138:1: ( (lv_lowerBound_3_0= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5139:1: (lv_lowerBound_3_0= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5139:1: (lv_lowerBound_3_0= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5140:3: lv_lowerBound_3_0= RULE_INT
            {
            lv_lowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInterval10792); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTimeInterval10809); 

                	newLeafNode(otherlv_4, grammarAccess.getTimeIntervalAccess().getCommaKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5160:1: ( (lv_upperBound_5_0= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5161:1: (lv_upperBound_5_0= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5161:1: (lv_upperBound_5_0= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5162:3: lv_upperBound_5_0= RULE_INT
            {
            lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeInterval10826); 

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

            otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleTimeInterval10843); 

                	newLeafNode(otherlv_6, grammarAccess.getTimeIntervalAccess().getRightSquareBracketKeyword_6());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5182:1: ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5183:1: (lv_timeUnit_7_0= ruleTimeUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5183:1: (lv_timeUnit_7_0= ruleTimeUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5184:3: lv_timeUnit_7_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getTimeIntervalAccess().getTimeUnitTimeUnitParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeInterval10864);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5208:1: entryRuleRewardTimeInstant returns [EObject current=null] : iv_ruleRewardTimeInstant= ruleRewardTimeInstant EOF ;
    public final EObject entryRuleRewardTimeInstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewardTimeInstant = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5209:2: (iv_ruleRewardTimeInstant= ruleRewardTimeInstant EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5210:2: iv_ruleRewardTimeInstant= ruleRewardTimeInstant EOF
            {
             newCompositeNode(grammarAccess.getRewardTimeInstantRule()); 
            pushFollow(FOLLOW_ruleRewardTimeInstant_in_entryRuleRewardTimeInstant10900);
            iv_ruleRewardTimeInstant=ruleRewardTimeInstant();

            state._fsp--;

             current =iv_ruleRewardTimeInstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewardTimeInstant10910); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5217:1: ruleRewardTimeInstant returns [EObject current=null] : ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleRewardTimeInstant() throws RecognitionException {
        EObject current = null;

        Token lv_isEqualTo_1_0=null;
        Token lv_isLessThanOrEqual_2_0=null;
        Token lv_timeValue_3_0=null;
        AntlrDatatypeRuleToken lv_timeUnit_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5220:28: ( ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5221:1: ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5221:1: ( () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5221:2: () ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) ) ( (lv_timeValue_3_0= RULE_INT ) ) ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5221:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5222:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRewardTimeInstantAccess().getRewardTimeInstantAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5227:2: ( ( (lv_isEqualTo_1_0= 'AT' ) ) | ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==78) ) {
                alt94=1;
            }
            else if ( (LA94_0==81) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5227:3: ( (lv_isEqualTo_1_0= 'AT' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5227:3: ( (lv_isEqualTo_1_0= 'AT' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5228:1: (lv_isEqualTo_1_0= 'AT' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5228:1: (lv_isEqualTo_1_0= 'AT' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5229:3: lv_isEqualTo_1_0= 'AT'
                    {
                    lv_isEqualTo_1_0=(Token)match(input,78,FOLLOW_78_in_ruleRewardTimeInstant10963); 

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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5243:6: ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5243:6: ( (lv_isLessThanOrEqual_2_0= 'WITHIN' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5244:1: (lv_isLessThanOrEqual_2_0= 'WITHIN' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5244:1: (lv_isLessThanOrEqual_2_0= 'WITHIN' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5245:3: lv_isLessThanOrEqual_2_0= 'WITHIN'
                    {
                    lv_isLessThanOrEqual_2_0=(Token)match(input,81,FOLLOW_81_in_ruleRewardTimeInstant11000); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5258:3: ( (lv_timeValue_3_0= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5259:1: (lv_timeValue_3_0= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5259:1: (lv_timeValue_3_0= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5260:3: lv_timeValue_3_0= RULE_INT
            {
            lv_timeValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRewardTimeInstant11031); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5276:2: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5277:1: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5277:1: (lv_timeUnit_4_0= ruleTimeUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5278:3: lv_timeUnit_4_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getRewardTimeInstantAccess().getTimeUnitTimeUnitParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleRewardTimeInstant11057);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5302:1: entryRuleProbabilityConstraint returns [EObject current=null] : iv_ruleProbabilityConstraint= ruleProbabilityConstraint EOF ;
    public final EObject entryRuleProbabilityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityConstraint = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5303:2: (iv_ruleProbabilityConstraint= ruleProbabilityConstraint EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5304:2: iv_ruleProbabilityConstraint= ruleProbabilityConstraint EOF
            {
             newCompositeNode(grammarAccess.getProbabilityConstraintRule()); 
            pushFollow(FOLLOW_ruleProbabilityConstraint_in_entryRuleProbabilityConstraint11093);
            iv_ruleProbabilityConstraint=ruleProbabilityConstraint();

            state._fsp--;

             current =iv_ruleProbabilityConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbabilityConstraint11103); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5311:1: ruleProbabilityConstraint returns [EObject current=null] : ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) ) ;
    public final EObject ruleProbabilityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasUnknownProbability_4_0=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_probability_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5314:28: ( ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5315:1: ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5315:1: ( () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5315:2: () otherlv_1= 'WITH PROBABILITY' ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5315:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5316:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProbabilityConstraintAccess().getProbabilityConstraintAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleProbabilityConstraint11149); 

                	newLeafNode(otherlv_1, grammarAccess.getProbabilityConstraintAccess().getWITHPROBABILITYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5325:1: ( ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) ) | ( (lv_hasUnknownProbability_4_0= '?' ) ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=26 && LA95_0<=27)||(LA95_0>=101 && LA95_0<=104)) ) {
                alt95=1;
            }
            else if ( (LA95_0==83) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5325:2: ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5325:2: ( ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5325:3: ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_probability_3_0= ruleUnitInterval ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5325:3: ( (lv_operator_2_0= ruleRelationalOperator ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5326:1: (lv_operator_2_0= ruleRelationalOperator )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5326:1: (lv_operator_2_0= ruleRelationalOperator )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5327:3: lv_operator_2_0= ruleRelationalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityConstraintAccess().getOperatorRelationalOperatorParserRuleCall_2_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleProbabilityConstraint11172);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5343:2: ( (lv_probability_3_0= ruleUnitInterval ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5344:1: (lv_probability_3_0= ruleUnitInterval )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5344:1: (lv_probability_3_0= ruleUnitInterval )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5345:3: lv_probability_3_0= ruleUnitInterval
                    {
                     
                    	        newCompositeNode(grammarAccess.getProbabilityConstraintAccess().getProbabilityUnitIntervalParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnitInterval_in_ruleProbabilityConstraint11193);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5362:6: ( (lv_hasUnknownProbability_4_0= '?' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5362:6: ( (lv_hasUnknownProbability_4_0= '?' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5363:1: (lv_hasUnknownProbability_4_0= '?' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5363:1: (lv_hasUnknownProbability_4_0= '?' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5364:3: lv_hasUnknownProbability_4_0= '?'
                    {
                    lv_hasUnknownProbability_4_0=(Token)match(input,83,FOLLOW_83_in_ruleProbabilityConstraint11218); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5385:1: entryRuleConcentrationConstraint returns [EObject current=null] : iv_ruleConcentrationConstraint= ruleConcentrationConstraint EOF ;
    public final EObject entryRuleConcentrationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcentrationConstraint = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5386:2: (iv_ruleConcentrationConstraint= ruleConcentrationConstraint EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5387:2: iv_ruleConcentrationConstraint= ruleConcentrationConstraint EOF
            {
             newCompositeNode(grammarAccess.getConcentrationConstraintRule()); 
            pushFollow(FOLLOW_ruleConcentrationConstraint_in_entryRuleConcentrationConstraint11268);
            iv_ruleConcentrationConstraint=ruleConcentrationConstraint();

            state._fsp--;

             current =iv_ruleConcentrationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationConstraint11278); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5394:1: ruleConcentrationConstraint returns [EObject current=null] : ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) ) ;
    public final EObject ruleConcentrationConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_isUnknown_4_0=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5397:28: ( ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5398:1: ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5398:1: ( ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) ) | ( (lv_isUnknown_4_0= '?' ) ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=26 && LA96_0<=27)||(LA96_0>=101 && LA96_0<=104)) ) {
                alt96=1;
            }
            else if ( (LA96_0==83) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5398:2: ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5398:2: ( () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5398:3: () ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5398:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5399:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConcentrationConstraintAccess().getConcentrationConstraintAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5404:2: ( ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5404:3: ( (lv_operator_1_0= ruleRelationalOperator ) ) ( (lv_value_2_0= ruleREAL ) ) ( (lv_unit_3_0= ruleConcentrationUnit ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5404:3: ( (lv_operator_1_0= ruleRelationalOperator ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5405:1: (lv_operator_1_0= ruleRelationalOperator )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5405:1: (lv_operator_1_0= ruleRelationalOperator )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5406:3: lv_operator_1_0= ruleRelationalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcentrationConstraintAccess().getOperatorRelationalOperatorParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleConcentrationConstraint11335);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5422:2: ( (lv_value_2_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5423:1: (lv_value_2_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5423:1: (lv_value_2_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5424:3: lv_value_2_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcentrationConstraintAccess().getValueREALParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleConcentrationConstraint11356);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5440:2: ( (lv_unit_3_0= ruleConcentrationUnit ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5441:1: (lv_unit_3_0= ruleConcentrationUnit )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5441:1: (lv_unit_3_0= ruleConcentrationUnit )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5442:3: lv_unit_3_0= ruleConcentrationUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getConcentrationConstraintAccess().getUnitConcentrationUnitParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleConcentrationConstraint11377);
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5459:6: ( (lv_isUnknown_4_0= '?' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5459:6: ( (lv_isUnknown_4_0= '?' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5460:1: (lv_isUnknown_4_0= '?' )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5460:1: (lv_isUnknown_4_0= '?' )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5461:3: lv_isUnknown_4_0= '?'
                    {
                    lv_isUnknown_4_0=(Token)match(input,83,FOLLOW_83_in_ruleConcentrationConstraint11403); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5482:1: entryRulePropertyInitialCondition returns [EObject current=null] : iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF ;
    public final EObject entryRulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInitialCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5483:2: (iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5484:2: iv_rulePropertyInitialCondition= rulePropertyInitialCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyInitialConditionRule()); 
            pushFollow(FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition11452);
            iv_rulePropertyInitialCondition=rulePropertyInitialCondition();

            state._fsp--;

             current =iv_rulePropertyInitialCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInitialCondition11462); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5491:1: rulePropertyInitialCondition returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) ) ;
    public final EObject rulePropertyInitialCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5494:28: ( ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5495:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5495:1: ( () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5495:2: () ( (lv_variable_1_0= ruleVariableAssignmentObject ) ) otherlv_2= '=' ( (lv_value_3_0= ruleConcentrationQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5495:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyInitialConditionAccess().getPropertyInitialConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5501:2: ( (lv_variable_1_0= ruleVariableAssignmentObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5502:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5502:1: (lv_variable_1_0= ruleVariableAssignmentObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5503:3: lv_variable_1_0= ruleVariableAssignmentObject
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getVariableVariableAssignmentObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition11517);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_rulePropertyInitialCondition11529); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyInitialConditionAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5523:1: ( (lv_value_3_0= ruleConcentrationQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5524:1: (lv_value_3_0= ruleConcentrationQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5524:1: (lv_value_3_0= ruleConcentrationQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5525:3: lv_value_3_0= ruleConcentrationQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyInitialConditionAccess().getValueConcentrationQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_rulePropertyInitialCondition11550);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5549:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5550:2: (iv_ruleREAL= ruleREAL EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5551:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL11587);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL11598); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5558:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decimal_0 = null;

        AntlrDatatypeRuleToken this_DecimalExp_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5561:28: ( (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5562:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5562:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            int alt97=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA97_1 = input.LA(2);

                if ( (LA97_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 48:
                        {
                        int LA97_4 = input.LA(4);

                        if ( (LA97_4==RULE_INT) ) {
                            int LA97_7 = input.LA(5);

                            if ( (LA97_7==EOF||LA97_7==RULE_ID||(LA97_7>=15 && LA97_7<=16)||LA97_7==18||(LA97_7>=20 && LA97_7<=24)||LA97_7==28||LA97_7==32||(LA97_7>=36 && LA97_7<=46)||(LA97_7>=50 && LA97_7<=56)||LA97_7==59||LA97_7==61||LA97_7==72||(LA97_7>=88 && LA97_7<=100)) ) {
                                alt97=1;
                            }
                            else if ( ((LA97_7>=86 && LA97_7<=87)) ) {
                                alt97=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 97, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 97, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 86:
                    case 87:
                        {
                        alt97=2;
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
                        alt97=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA97_2 = input.LA(2);

                if ( (LA97_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 48:
                        {
                        int LA97_4 = input.LA(4);

                        if ( (LA97_4==RULE_INT) ) {
                            int LA97_7 = input.LA(5);

                            if ( (LA97_7==EOF||LA97_7==RULE_ID||(LA97_7>=15 && LA97_7<=16)||LA97_7==18||(LA97_7>=20 && LA97_7<=24)||LA97_7==28||LA97_7==32||(LA97_7>=36 && LA97_7<=46)||(LA97_7>=50 && LA97_7<=56)||LA97_7==59||LA97_7==61||LA97_7==72||(LA97_7>=88 && LA97_7<=100)) ) {
                                alt97=1;
                            }
                            else if ( ((LA97_7>=86 && LA97_7<=87)) ) {
                                alt97=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 97, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 97, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 86:
                    case 87:
                        {
                        alt97=2;
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
                        alt97=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    int LA97_4 = input.LA(3);

                    if ( (LA97_4==RULE_INT) ) {
                        int LA97_7 = input.LA(4);

                        if ( (LA97_7==EOF||LA97_7==RULE_ID||(LA97_7>=15 && LA97_7<=16)||LA97_7==18||(LA97_7>=20 && LA97_7<=24)||LA97_7==28||LA97_7==32||(LA97_7>=36 && LA97_7<=46)||(LA97_7>=50 && LA97_7<=56)||LA97_7==59||LA97_7==61||LA97_7==72||(LA97_7>=88 && LA97_7<=100)) ) {
                            alt97=1;
                        }
                        else if ( ((LA97_7>=86 && LA97_7<=87)) ) {
                            alt97=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 97, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 86:
                case 87:
                    {
                    alt97=2;
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
                    alt97=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5563:5: this_Decimal_0= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecimal_in_ruleREAL11645);
                    this_Decimal_0=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5575:5: this_DecimalExp_1= ruleDecimalExp
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDecimalExp_in_ruleREAL11678);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5593:1: entryRuleUnitInterval returns [String current=null] : iv_ruleUnitInterval= ruleUnitInterval EOF ;
    public final String entryRuleUnitInterval() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnitInterval = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5594:2: (iv_ruleUnitInterval= ruleUnitInterval EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5595:2: iv_ruleUnitInterval= ruleUnitInterval EOF
            {
             newCompositeNode(grammarAccess.getUnitIntervalRule()); 
            pushFollow(FOLLOW_ruleUnitInterval_in_entryRuleUnitInterval11724);
            iv_ruleUnitInterval=ruleUnitInterval();

            state._fsp--;

             current =iv_ruleUnitInterval.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitInterval11735); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5602:1: ruleUnitInterval returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) ) ;
    public final AntlrDatatypeRuleToken ruleUnitInterval() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5605:28: ( (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5606:1: (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5606:1: (kw= '1.0' | (kw= '.' (this_INT_2= RULE_INT )* ) | (kw= '0.' (this_INT_4= RULE_INT )* ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt100=1;
                }
                break;
            case 48:
                {
                alt100=2;
                }
                break;
            case 85:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5607:2: kw= '1.0'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleUnitInterval11773); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getDigitOneFullStopDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5613:6: (kw= '.' (this_INT_2= RULE_INT )* )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5613:6: (kw= '.' (this_INT_2= RULE_INT )* )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5614:2: kw= '.' (this_INT_2= RULE_INT )*
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleUnitInterval11793); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getFullStopKeyword_1_0()); 
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5619:1: (this_INT_2= RULE_INT )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==RULE_INT) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5619:6: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnitInterval11809); 

                    	    		current.merge(this_INT_2);
                    	        
                    	     
                    	        newLeafNode(this_INT_2, grammarAccess.getUnitIntervalAccess().getINTTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5627:6: (kw= '0.' (this_INT_4= RULE_INT )* )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5627:6: (kw= '0.' (this_INT_4= RULE_INT )* )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5628:2: kw= '0.' (this_INT_4= RULE_INT )*
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleUnitInterval11837); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnitIntervalAccess().getDigitZeroFullStopKeyword_2_0()); 
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5633:1: (this_INT_4= RULE_INT )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==RULE_INT) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5633:6: this_INT_4= RULE_INT
                    	    {
                    	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnitInterval11853); 

                    	    		current.merge(this_INT_4);
                    	        
                    	     
                    	        newLeafNode(this_INT_4, grammarAccess.getUnitIntervalAccess().getINTTerminalRuleCall_2_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5648:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5652:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5653:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal11908);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal11919); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5663:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5667:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5668:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5668:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5668:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5668:2: (kw= '+' | kw= '-' )?
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==53) ) {
                alt101=1;
            }
            else if ( (LA101_0==54) ) {
                alt101=2;
            }
            switch (alt101) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5669:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleDecimal11962); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5676:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleDecimal11981); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal11998); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5688:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==48) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5689:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleDecimal12017); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal12032); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5712:1: entryRuleDecimalExp returns [String current=null] : iv_ruleDecimalExp= ruleDecimalExp EOF ;
    public final String entryRuleDecimalExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimalExp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5716:2: (iv_ruleDecimalExp= ruleDecimalExp EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5717:2: iv_ruleDecimalExp= ruleDecimalExp EOF
            {
             newCompositeNode(grammarAccess.getDecimalExpRule()); 
            pushFollow(FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp12090);
            iv_ruleDecimalExp=ruleDecimalExp();

            state._fsp--;

             current =iv_ruleDecimalExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalExp12101); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5727:1: ruleDecimalExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimalExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_9=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5731:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5732:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5732:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5732:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5732:2: (kw= '+' | kw= '-' )?
            int alt103=3;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==53) ) {
                alt103=1;
            }
            else if ( (LA103_0==54) ) {
                alt103=2;
            }
            switch (alt103) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5733:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleDecimalExp12144); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5740:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleDecimalExp12163); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp12180); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5752:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==48) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5753:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleDecimalExp12199); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp12214); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5765:3: (kw= 'E' | kw= 'e' )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==86) ) {
                alt105=1;
            }
            else if ( (LA105_0==87) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5766:2: kw= 'E'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleDecimalExp12235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5773:2: kw= 'e'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleDecimalExp12254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5778:2: (kw= '+' | kw= '-' )?
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==53) ) {
                alt106=1;
            }
            else if ( (LA106_0==54) ) {
                alt106=2;
            }
            switch (alt106) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5779:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleDecimalExp12269); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5786:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleDecimalExp12288); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 
                        

                    }
                    break;

            }

            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp12305); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5809:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5810:2: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5811:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_ruleTimeUnit_in_entryRuleTimeUnit12355);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeUnit12366); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5818:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's' | kw= 'min' | kw= 'mins' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5821:28: ( (kw= 's' | kw= 'min' | kw= 'mins' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5822:1: (kw= 's' | kw= 'min' | kw= 'mins' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5822:1: (kw= 's' | kw= 'min' | kw= 'mins' )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt107=1;
                }
                break;
            case 89:
                {
                alt107=2;
                }
                break;
            case 90:
                {
                alt107=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5823:2: kw= 's'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTimeUnit12404); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5830:2: kw= 'min'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleTimeUnit12423); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMinKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5837:2: kw= 'mins'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleTimeUnit12442); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5850:1: entryRuleFluxUnit returns [String current=null] : iv_ruleFluxUnit= ruleFluxUnit EOF ;
    public final String entryRuleFluxUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFluxUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5851:2: (iv_ruleFluxUnit= ruleFluxUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5852:2: iv_ruleFluxUnit= ruleFluxUnit EOF
            {
             newCompositeNode(grammarAccess.getFluxUnitRule()); 
            pushFollow(FOLLOW_ruleFluxUnit_in_entryRuleFluxUnit12483);
            iv_ruleFluxUnit=ruleFluxUnit();

            state._fsp--;

             current =iv_ruleFluxUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluxUnit12494); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5859:1: ruleFluxUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 's^-1' | kw= 'min^-1' ) ;
    public final AntlrDatatypeRuleToken ruleFluxUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5862:28: ( (kw= 's^-1' | kw= 'min^-1' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5863:1: (kw= 's^-1' | kw= 'min^-1' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5863:1: (kw= 's^-1' | kw= 'min^-1' )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==91) ) {
                alt108=1;
            }
            else if ( (LA108_0==92) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5864:2: kw= 's^-1'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleFluxUnit12532); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFluxUnitAccess().getS1Keyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5871:2: kw= 'min^-1'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleFluxUnit12551); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5884:1: entryRuleConcentrationUnit returns [String current=null] : iv_ruleConcentrationUnit= ruleConcentrationUnit EOF ;
    public final String entryRuleConcentrationUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConcentrationUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5885:2: (iv_ruleConcentrationUnit= ruleConcentrationUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5886:2: iv_ruleConcentrationUnit= ruleConcentrationUnit EOF
            {
             newCompositeNode(grammarAccess.getConcentrationUnitRule()); 
            pushFollow(FOLLOW_ruleConcentrationUnit_in_entryRuleConcentrationUnit12592);
            iv_ruleConcentrationUnit=ruleConcentrationUnit();

            state._fsp--;

             current =iv_ruleConcentrationUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationUnit12603); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5893:1: ruleConcentrationUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) ;
    public final AntlrDatatypeRuleToken ruleConcentrationUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5896:28: ( (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5897:1: (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5897:1: (kw= 'M' | kw= 'mM' | kw= 'uM' | kw= 'nM' | kw= 'pM' | kw= 'fM' | kw= 'molecule' | kw= 'molecules' )
            int alt109=8;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt109=1;
                }
                break;
            case 94:
                {
                alt109=2;
                }
                break;
            case 95:
                {
                alt109=3;
                }
                break;
            case 96:
                {
                alt109=4;
                }
                break;
            case 97:
                {
                alt109=5;
                }
                break;
            case 98:
                {
                alt109=6;
                }
                break;
            case 99:
                {
                alt109=7;
                }
                break;
            case 100:
                {
                alt109=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5898:2: kw= 'M'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleConcentrationUnit12641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5905:2: kw= 'mM'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleConcentrationUnit12660); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMMKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5912:2: kw= 'uM'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleConcentrationUnit12679); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getUMKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5919:2: kw= 'nM'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleConcentrationUnit12698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getNMKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5926:2: kw= 'pM'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleConcentrationUnit12717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getPMKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5933:2: kw= 'fM'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleConcentrationUnit12736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getFMKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5940:2: kw= 'molecule'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleConcentrationUnit12755); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConcentrationUnitAccess().getMoleculeKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5947:2: kw= 'molecules'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleConcentrationUnit12774); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5960:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5961:2: (iv_ruleUnit= ruleUnit EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5962:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit12815);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit12826); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5969:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TimeUnit_0 = null;

        AntlrDatatypeRuleToken this_FluxUnit_1 = null;

        AntlrDatatypeRuleToken this_ConcentrationUnit_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5972:28: ( (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5973:1: (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5973:1: (this_TimeUnit_0= ruleTimeUnit | this_FluxUnit_1= ruleFluxUnit | this_ConcentrationUnit_2= ruleConcentrationUnit )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 88:
            case 89:
            case 90:
                {
                alt110=1;
                }
                break;
            case 91:
            case 92:
                {
                alt110=2;
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
                alt110=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5974:5: this_TimeUnit_0= ruleTimeUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getTimeUnitParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleUnit12873);
                    this_TimeUnit_0=ruleTimeUnit();

                    state._fsp--;


                    		current.merge(this_TimeUnit_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5986:5: this_FluxUnit_1= ruleFluxUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getFluxUnitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFluxUnit_in_ruleUnit12906);
                    this_FluxUnit_1=ruleFluxUnit();

                    state._fsp--;


                    		current.merge(this_FluxUnit_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:5998:5: this_ConcentrationUnit_2= ruleConcentrationUnit
                    {
                     
                            newCompositeNode(grammarAccess.getUnitAccess().getConcentrationUnitParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleUnit12939);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6016:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6017:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6018:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_ruleQuantity_in_entryRuleQuantity12984);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantity12994); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6025:1: ruleQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_units_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6028:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6029:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6029:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6029:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= ruleUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6029:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6030:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityAccess().getQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6035:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6036:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6036:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6037:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleQuantity13049);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6053:2: ( (lv_units_2_0= ruleUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6054:1: (lv_units_2_0= ruleUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6054:1: (lv_units_2_0= ruleUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6055:3: lv_units_2_0= ruleUnit
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getUnitsUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnit_in_ruleQuantity13070);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6079:1: entryRuleConcentrationQuantity returns [EObject current=null] : iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF ;
    public final EObject entryRuleConcentrationQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcentrationQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6080:2: (iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6081:2: iv_ruleConcentrationQuantity= ruleConcentrationQuantity EOF
            {
             newCompositeNode(grammarAccess.getConcentrationQuantityRule()); 
            pushFollow(FOLLOW_ruleConcentrationQuantity_in_entryRuleConcentrationQuantity13106);
            iv_ruleConcentrationQuantity=ruleConcentrationQuantity();

            state._fsp--;

             current =iv_ruleConcentrationQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcentrationQuantity13116); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6088:1: ruleConcentrationQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) ) ;
    public final EObject ruleConcentrationQuantity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6091:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6092:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6092:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6092:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_unit_2_0= ruleConcentrationUnit ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6092:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6093:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConcentrationQuantityAccess().getConcentrationQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6098:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6099:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6099:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6100:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getConcentrationQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleConcentrationQuantity13171);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6116:2: ( (lv_unit_2_0= ruleConcentrationUnit ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6117:1: (lv_unit_2_0= ruleConcentrationUnit )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6117:1: (lv_unit_2_0= ruleConcentrationUnit )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6118:3: lv_unit_2_0= ruleConcentrationUnit
            {
             
            	        newCompositeNode(grammarAccess.getConcentrationQuantityAccess().getUnitConcentrationUnitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConcentrationUnit_in_ruleConcentrationQuantity13192);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6142:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6143:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6144:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator13229);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator13240); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6151:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6154:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6155:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6155:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt111=6;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt111=1;
                }
                break;
            case 102:
                {
                alt111=2;
                }
                break;
            case 26:
                {
                alt111=3;
                }
                break;
            case 27:
                {
                alt111=4;
                }
                break;
            case 103:
                {
                alt111=5;
                }
                break;
            case 104:
                {
                alt111=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6156:2: kw= '=='
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleRelationalOperator13278); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6163:2: kw= '!='
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleRelationalOperator13297); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6170:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleRelationalOperator13316); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6177:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleRelationalOperator13335); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6184:2: kw= '<='
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleRelationalOperator13354); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6191:2: kw= '>='
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleRelationalOperator13373); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6206:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6207:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6208:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard13416);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard13427); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6215:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6218:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6219:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6219:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6220:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard13474);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6230:1: (kw= '.*' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==105) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6231:2: kw= '.*'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleQualifiedNameWithWildcard13493); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6244:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6245:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6246:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13536);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13547); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6253:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6256:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6257:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6257:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6257:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13587); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6264:1: (kw= '.' this_ID_2= RULE_ID )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==48) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6265:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleQualifiedName13606); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13621); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop113;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6285:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6286:2: (iv_ruleList= ruleList EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6287:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList13668);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList13678); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6294:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entries_2_0 = null;

        EObject lv_entries_4_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6297:28: ( ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6298:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6298:1: ( () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6298:2: () otherlv_1= '[' ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) ) (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )* otherlv_5= ']'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6298:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6299:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListAccess().getListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleList13724); 

                	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6308:1: ( (lv_entries_2_0= ruleAtomicVariableExpressionObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6309:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6309:1: (lv_entries_2_0= ruleAtomicVariableExpressionObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6310:3: lv_entries_2_0= ruleAtomicVariableExpressionObject
            {
             
            	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList13745);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6326:2: (otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==15) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6326:4: otherlv_3= ',' ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleList13758); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_3_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6330:1: ( (lv_entries_4_0= ruleAtomicVariableExpressionObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6331:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6331:1: (lv_entries_4_0= ruleAtomicVariableExpressionObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:6332:3: lv_entries_4_0= ruleAtomicVariableExpressionObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListAccess().getEntriesAtomicVariableExpressionObjectParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList13779);
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
            	    break loop114;
                }
            } while (true);

            otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleList13793); 

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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA27_eotS =
        "\15\uffff";
    static final String DFA27_eofS =
        "\15\uffff";
    static final String DFA27_minS =
        "\1\4\11\uffff\1\4\2\uffff";
    static final String DFA27_maxS =
        "\1\75\11\uffff\1\60\2\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\1\12";
    static final String DFA27_specialS =
        "\15\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\12\13\uffff\1\6\4\uffff\1\11\1\5\1\3\1\2\7\uffff\1\4\3\uffff"+
            "\13\13\3\uffff\3\13\3\uffff\1\10\2\uffff\1\1\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\34\uffff\1\14\15\uffff\2\14",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1170:1: (this_ATGCDefinition_0= ruleATGCDefinition | this_CellInstantiation_1= ruleCellInstantiation | this_ChromosomeInstantiation_2= ruleChromosomeInstantiation | this_DeviceDefinition_3= ruleDeviceDefinition | this_PlasmidInstantiation_4= rulePlasmidInstantiation | this_ProcessInstantiation_5= ruleProcessInstantiation | this_PropertyDefinition_6= rulePropertyDefinition | this_RuleDefinition_7= ruleRuleDefinition | this_SystemInstantiation_8= ruleSystemInstantiation | this_VariableAssignment_9= ruleVariableAssignment | this_VariableDefinition_10= ruleVariableDefinition )";
        }
    }
    static final String DFA54_eotS =
        "\22\uffff";
    static final String DFA54_eofS =
        "\16\uffff\1\20\3\uffff";
    static final String DFA54_minS =
        "\14\4\2\uffff\2\4\2\uffff";
    static final String DFA54_maxS =
        "\1\64\13\4\2\uffff\1\75\1\107\2\uffff";
    static final String DFA54_acceptS =
        "\14\uffff\1\2\1\3\2\uffff\1\1\1\4";
    static final String DFA54_specialS =
        "\22\uffff}>";
    static final String[] DFA54_transitionS = {
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

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "2686:1: (lv_definition_1_1= ruleVariableDefinitionBuiltIn | lv_definition_1_2= ruleVariableDefinitionUserDefined | lv_definition_1_3= ruleVariableDefinitionCollection | lv_definition_1_4= ruleVariableDefinitionBasic )";
        }
    }
    static final String DFA70_eotS =
        "\24\uffff";
    static final String DFA70_eofS =
        "\1\uffff\1\6\2\uffff\1\14\11\uffff\1\23\1\14\2\uffff\1\14\1\uffff";
    static final String DFA70_minS =
        "\2\4\2\6\1\4\2\uffff\1\4\1\uffff\3\6\2\uffff\2\4\2\6\1\4\1\uffff";
    static final String DFA70_maxS =
        "\1\66\1\110\2\6\1\144\2\uffff\1\4\1\uffff\1\6\2\66\2\uffff\1\110"+
        "\1\144\2\6\1\144\1\uffff";
    static final String DFA70_acceptS =
        "\5\uffff\1\6\1\1\1\uffff\1\2\3\uffff\1\4\1\5\5\uffff\1\3";
    static final String DFA70_specialS =
        "\24\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\5\1\4\56\uffff\1\2\1\3",
            "\1\6\12\uffff\2\6\1\uffff\1\6\1\uffff\5\6\3\uffff\1\6\3\uffff"+
            "\1\6\3\uffff\13\6\1\7\1\10\1\uffff\7\6\2\uffff\1\6\1\uffff\1"+
            "\6\12\uffff\1\6",
            "\1\4",
            "\1\4",
            "\1\14\12\uffff\2\14\1\uffff\1\14\1\uffff\5\14\3\uffff\1\14"+
            "\3\uffff\1\14\3\uffff\13\14\1\uffff\1\11\1\uffff\7\14\2\uffff"+
            "\1\14\1\uffff\1\14\12\uffff\1\14\15\uffff\1\12\1\13\15\15",
            "",
            "",
            "\1\16",
            "",
            "\1\17",
            "\1\22\56\uffff\1\20\1\21",
            "\1\22\56\uffff\1\20\1\21",
            "",
            "",
            "\1\23\12\uffff\2\23\1\uffff\1\23\1\uffff\5\23\3\uffff\1\23"+
            "\3\uffff\1\23\3\uffff\13\23\1\7\1\10\1\uffff\7\23\2\uffff\1"+
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3674:1: ( ( () ( (lv_variable_1_0= ruleVariableName ) ) ) | ( (lv_attribute_2_0= ruleVariableAttribute ) ) | ( (lv_complex_3_0= ruleVariableComplex ) ) | ( (lv_value_4_0= ruleREAL ) ) | ( (lv_quantity_5_0= ruleQuantity ) ) | ( (lv_string_6_0= RULE_STRING ) ) )";
        }
    }
    static final String DFA76_eotS =
        "\12\uffff";
    static final String DFA76_eofS =
        "\1\2\1\5\6\uffff\1\5\1\uffff";
    static final String DFA76_minS =
        "\2\4\1\uffff\2\4\1\uffff\4\4";
    static final String DFA76_maxS =
        "\2\75\1\uffff\1\75\1\4\1\uffff\1\107\2\75\1\107";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA76_specialS =
        "\12\uffff}>";
    static final String[] DFA76_transitionS = {
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
            return "3992:3: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?";
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
    public static final BitSet FOLLOW_ruleFunctionBodyType_in_ruleFunctionDefinition521 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition534 = new BitSet(new long[]{0x00007FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition555 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition568 = new BitSet(new long[]{0x00007FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition589 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleFunctionBodyType_in_entryRuleFunctionBodyType629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBodyType639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessBody_in_ruleFunctionBodyType686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemBody_in_ruleFunctionBodyType713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidBody_in_ruleFunctionBodyType740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeBody_in_ruleFunctionBodyType767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellBody_in_ruleFunctionBodyType794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionBody_in_ruleFunctionBodyType821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFunctionBody_in_ruleFunctionBodyType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessBody_in_entryRuleProcessBody883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessBody893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProcessBody939 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcessBody951 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody973 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleProcessBody986 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleProcessBody1007 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleProcessBody1023 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleProcessBody1035 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleProcessBody1056 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_ruleProcessBody1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemBody_in_entryRuleSystemBody1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemBody1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSystemBody1161 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystemBody1173 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1195 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleSystemBody1208 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleSystemBody1229 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleSystemBody1245 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSystemBody1257 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleSystemBody1278 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_ruleSystemBody1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidBody_in_entryRulePlasmidBody1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlasmidBody1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePlasmidBody1383 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlasmidBody1395 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1417 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulePlasmidBody1430 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rulePlasmidBody1451 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulePlasmidBody1467 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlasmidBody1479 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_rulePlasmidBody1500 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_rulePlasmidBody1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeBody_in_entryRuleChromosomeBody1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChromosomeBody1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleChromosomeBody1605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChromosomeBody1617 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1639 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleChromosomeBody1652 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleChromosomeBody1673 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleChromosomeBody1689 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleChromosomeBody1701 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleChromosomeBody1722 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_ruleChromosomeBody1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellBody_in_entryRuleCellBody1771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellBody1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCellBody1827 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCellBody1839 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1861 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleCellBody1874 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCellBody1895 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleCellBody1911 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCellBody1923 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleCellBody1944 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_ruleCellBody1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionBody_in_entryRuleRegionBody1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionBody2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRegionBody2049 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRegionBody2061 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody2083 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleRegionBody2096 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleRegionBody2117 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleRegionBody2133 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRegionBody2145 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleRegionBody2166 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_ruleRegionBody2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomFunctionBody_in_entryRuleCustomFunctionBody2215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomFunctionBody2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleCustomFunctionBody2280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustomFunctionBody2292 = new BitSet(new long[]{0x001C7FF000040000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2314 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleCustomFunctionBody2327 = new BitSet(new long[]{0x001C7FF000000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleCustomFunctionBody2348 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleCustomFunctionBody2364 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomFunctionBody2376 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_ruleCustomFunctionBody2397 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_ruleCustomFunctionBody2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBodyMember_in_entryRuleFunctionBodyMember2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBodyMember2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleFunctionBodyMember2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellInstantiation_in_ruleFunctionBodyMember2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeInstantiation_in_ruleFunctionBodyMember2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleFunctionBodyMember2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidInstantiation_in_ruleFunctionBodyMember2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleFunctionBodyMember2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleFunctionBodyMember2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleFunctionBodyMember2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemInstantiation_in_ruleFunctionBodyMember2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleFunctionBodyMember2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleFunctionBodyMember2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember2808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionParameterMember2865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleFunctionParameterMember2893 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionParameterMember2905 = new BitSet(new long[]{0x00007FF000000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionParameterMember2928 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionParameterMember2947 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionParameterMember2962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionParameterMember2985 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionParameterMember2998 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_ruleFunctionParameterMember3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterScope_in_entryRuleFunctionParameterScope3058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterScope3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionParameterScope3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunctionParameterScope3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunctionParameterScope3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember3185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUseMember3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionUseMember3241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleFunctionUseMember3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition3298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDefinition3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition3354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleDeviceDefinition3375 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition3387 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDeviceDefinition3399 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDeviceDefinition3411 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition3423 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDeviceDefinition3435 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition3447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition3468 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition3480 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition3492 = new BitSet(new long[]{0x0000000020048000L});
    public static final BitSet FOLLOW_29_in_ruleDeviceDefinition3505 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition3517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition3538 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleDeviceDefinition3553 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDeviceDefinition3565 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDeviceDefinition3577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleDeviceDefinition3598 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition3612 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDeviceDefinition3624 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition3645 = new BitSet(new long[]{0x291C7FF101F10010L});
    public static final BitSet FOLLOW_20_in_ruleDeviceDefinition3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers3694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceMembers3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleDeviceMembers3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleDeviceMembers3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_ruleDeviceMembers3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessInstantiation_in_entryRuleProcessInstantiation3867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessInstantiation3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProcessInstantiation3923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleProcessInstantiation3944 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleProcessInstantiation3957 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleProcessInstantiation3969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleProcessInstantiation3990 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcessInstantiation4002 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation4024 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleProcessInstantiation4037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleProcessInstantiation4058 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleProcessInstantiation4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemInstantiation_in_entryRuleSystemInstantiation4112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemInstantiation4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSystemInstantiation4168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleSystemInstantiation4189 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleSystemInstantiation4202 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSystemInstantiation4214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleSystemInstantiation4235 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystemInstantiation4247 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation4269 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleSystemInstantiation4282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleSystemInstantiation4303 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleSystemInstantiation4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlasmidInstantiation_in_entryRulePlasmidInstantiation4357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlasmidInstantiation4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePlasmidInstantiation4413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_rulePlasmidInstantiation4434 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulePlasmidInstantiation4447 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePlasmidInstantiation4459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_rulePlasmidInstantiation4480 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlasmidInstantiation4492 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation4514 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulePlasmidInstantiation4527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_rulePlasmidInstantiation4548 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_rulePlasmidInstantiation4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChromosomeInstantiation_in_entryRuleChromosomeInstantiation4602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChromosomeInstantiation4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleChromosomeInstantiation4658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation4679 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleChromosomeInstantiation4692 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleChromosomeInstantiation4704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleChromosomeInstantiation4725 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChromosomeInstantiation4737 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation4759 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleChromosomeInstantiation4772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleChromosomeInstantiation4793 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleChromosomeInstantiation4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellInstantiation_in_entryRuleCellInstantiation4847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCellInstantiation4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCellInstantiation4903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleCellInstantiation4924 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleCellInstantiation4937 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCellInstantiation4949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleCellInstantiation4970 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCellInstantiation4982 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation5004 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleCellInstantiation5017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleCellInstantiation5038 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleCellInstantiation5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName5093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType5188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVariableType5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVariableType5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVariableType5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVariableType5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVariableType5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVariableType5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVariableType5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVariableType5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariableType5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVariableType5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVariableType5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_entryRuleVariableComplex5467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableComplex5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex5532 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleVariableComplex5545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableComplex5566 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute5604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute5670 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleVariableAttribute5697 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleVariableAttribute5710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAttribute5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition5767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_ruleVariableDefinition5834 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_ruleVariableDefinition5853 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_ruleVariableDefinition5872 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_ruleVariableDefinition5891 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleVariableDefinition5907 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_ruleVariableDefinition5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier5967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVariableQualifier6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBuiltIn_in_entryRuleVariableDefinitionBuiltIn6054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBuiltIn6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn6119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn6141 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleVariableDefinitionBuiltIn6168 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionBuiltIn6182 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleVariableDefinitionBuiltIn6194 = new BitSet(new long[]{0x00007FF000000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBuiltIn6217 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBuiltIn6236 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinitionBuiltIn6251 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn6273 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionBuiltIn6286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionBuiltIn6307 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinitionBuiltIn6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionUserDefined_in_entryRuleVariableDefinitionUserDefined6361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionUserDefined6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined6426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined6447 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionUserDefined6460 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleVariableDefinitionUserDefined6472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionUserDefined6493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinitionUserDefined6505 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined6527 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinitionUserDefined6540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_ruleVariableDefinitionUserDefined6561 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinitionUserDefined6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionCollection_in_entryRuleVariableDefinitionCollection6615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionCollection6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleVariableDefinitionCollection6681 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVariableDefinitionCollection6693 = new BitSet(new long[]{0x00007FF000000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionCollection6716 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection6735 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVariableDefinitionCollection6750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionCollection6771 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionCollection6785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleList_in_ruleVariableDefinitionCollection6806 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinitionCollection6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID6857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCollectionID6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCollectionID6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCollectionID6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionBasic_in_entryRuleVariableDefinitionBasic6984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionBasic6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinitionBasic7049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDefinitionBasic7070 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinitionBasic7082 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableDefinitionBasic7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAssignment_in_entryRuleParameterAssignment7139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterAssignment7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleParameterAssignment7195 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleParameterAssignment7207 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleParameterAssignment7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment7264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_ruleVariableAssignment7329 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariableAssignment7341 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableAssignment7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_entryRuleVariableAssignmentObject7398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignmentObject7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableAssignmentObject7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableAssignmentObject7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression7522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression7587 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression7604 = new BitSet(new long[]{0x0060000000000070L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_ruleVariableExpression7624 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionObject_in_entryRuleVariableExpressionObject7662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionObject7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleVariableExpressionObject7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_ruleVariableExpressionObject7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_entryRuleAtomicVariableExpressionObject7781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicVariableExpressionObject7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleAtomicVariableExpressionObject7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleAtomicVariableExpressionObject7875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleAtomicVariableExpressionObject7902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleAtomicVariableExpressionObject7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleAtomicVariableExpressionObject7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicVariableExpressionObject7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundVariableExpressionObject_in_entryRuleCompoundVariableExpressionObject8020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundVariableExpressionObject8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleCompoundVariableExpressionObject8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator8122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleVariableExpressionOperator8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVariableExpressionOperator8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVariableExpressionOperator8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition8249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRuleDefinition8305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleDefinition8326 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRuleDefinition8338 = new BitSet(new long[]{0x0600000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition8360 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_53_in_ruleRuleDefinition8373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition8394 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_57_in_ruleRuleDefinition8411 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_58_in_ruleRuleDefinition8435 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition8471 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleRuleDefinition8484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition8505 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject8545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRuleObject8606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableComplex_in_ruleRuleObject8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition8669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCDefinition8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleATGCDefinition8725 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_ruleATGCDefinition8746 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleATGCDefinition8758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition8779 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleATGCDefinition8792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleATGCDefinition8813 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleATGCCommand_in_entryRuleATGCCommand8852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCCommand8863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleATGCCommand8900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition8939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePropertyDefinition8995 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleProbabilityProperty_in_rulePropertyDefinition9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewardProperty_in_rulePropertyDefinition9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbabilityProperty_in_entryRuleProbabilityProperty9076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityProperty9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleProbabilityProperty9141 = new BitSet(new long[]{0xC000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_62_in_ruleProbabilityProperty9163 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_63_in_ruleProbabilityProperty9200 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_64_in_ruleProbabilityProperty9237 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_65_in_ruleProbabilityProperty9277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66_in_ruleProbabilityProperty9314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleProbabilityProperty9349 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C020L});
    public static final BitSet FOLLOW_ruleTimeInstant_in_ruleProbabilityProperty9373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_ruleTimeInterval_in_ruleProbabilityProperty9400 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_67_in_ruleProbabilityProperty9428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_68_in_ruleProbabilityProperty9465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProbabilityConstraint_in_ruleProbabilityProperty9501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleProbabilityProperty9515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty9536 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleProbabilityProperty9549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleProbabilityProperty9570 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleRewardProperty_in_entryRuleRewardProperty9610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewardProperty9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleRewardProperty9666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleRewardProperty9678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleRewardProperty9699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleRewardProperty9711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleRewardTimeInstant_in_ruleRewardProperty9732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleRewardProperty9744 = new BitSet(new long[]{0x000000000C000000L,0x000001E000080000L});
    public static final BitSet FOLLOW_ruleConcentrationConstraint_in_ruleRewardProperty9765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleRewardProperty9778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty9799 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRewardProperty9812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_ruleRewardProperty9833 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleStateExpression_in_entryRuleStateExpression9873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExpression9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleStateExpression9938 = new BitSet(new long[]{0x000000000C000000L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleStateExpression9959 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_ruleStateExpression9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula10016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleStateFormula10079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStateExpression_in_ruleStateFormula10113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStateFormula10125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleStateFormula10145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleStateFormula10163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula10197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStateFormula10209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleStateFormula10229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula10250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_ruleStateFormula10269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_76_in_ruleStateFormula10306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_77_in_ruleStateFormula10343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula10378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleStateFormula10390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeInstant_in_entryRuleTimeInstant10427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeInstant10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTimeInstant10491 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInstant10521 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_79_in_ruleTimeInstant10552 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInstant10582 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_80_in_ruleTimeInstant10613 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInstant10643 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeInstant10671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeInterval_in_entryRuleTimeInterval10707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeInterval10717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTimeInterval10763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleTimeInterval10775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInterval10792 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTimeInterval10809 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeInterval10826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleTimeInterval10843 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeInterval10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewardTimeInstant_in_entryRuleRewardTimeInstant10900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewardTimeInstant10910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleRewardTimeInstant10963 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_81_in_ruleRewardTimeInstant11000 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRewardTimeInstant11031 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleRewardTimeInstant11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbabilityConstraint_in_entryRuleProbabilityConstraint11093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbabilityConstraint11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleProbabilityConstraint11149 = new BitSet(new long[]{0x000000000C000000L,0x000001E000080000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleProbabilityConstraint11172 = new BitSet(new long[]{0x0001000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleUnitInterval_in_ruleProbabilityConstraint11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleProbabilityConstraint11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationConstraint_in_entryRuleConcentrationConstraint11268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationConstraint11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleConcentrationConstraint11335 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleConcentrationConstraint11356 = new BitSet(new long[]{0x0000000000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleConcentrationConstraint11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleConcentrationConstraint11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInitialCondition_in_entryRulePropertyInitialCondition11452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInitialCondition11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignmentObject_in_rulePropertyInitialCondition11517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePropertyInitialCondition11529 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_rulePropertyInitialCondition11550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL11587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleREAL11645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_ruleREAL11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitInterval_in_entryRuleUnitInterval11724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitInterval11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnitInterval11773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUnitInterval11793 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnitInterval11809 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_85_in_ruleUnitInterval11837 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnitInterval11853 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal11908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDecimal11962 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54_in_ruleDecimal11981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal11998 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDecimal12017 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp12090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalExp12101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDecimalExp12144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54_in_ruleDecimalExp12163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp12180 = new BitSet(new long[]{0x0001000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_48_in_ruleDecimalExp12199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp12214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_ruleDecimalExp12235 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_87_in_ruleDecimalExp12254 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_53_in_ruleDecimalExp12269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54_in_ruleDecimalExp12288 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_entryRuleTimeUnit12355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeUnit12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTimeUnit12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTimeUnit12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTimeUnit12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluxUnit_in_entryRuleFluxUnit12483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluxUnit12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleFluxUnit12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleFluxUnit12551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_entryRuleConcentrationUnit12592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationUnit12603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleConcentrationUnit12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleConcentrationUnit12660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleConcentrationUnit12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleConcentrationUnit12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleConcentrationUnit12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleConcentrationUnit12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleConcentrationUnit12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleConcentrationUnit12774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit12815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleUnit12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluxUnit_in_ruleUnit12906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleUnit12939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity12984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantity12994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleQuantity13049 = new BitSet(new long[]{0x0000000000000000L,0x0000001FFF000000L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleQuantity13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcentrationQuantity_in_entryRuleConcentrationQuantity13106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcentrationQuantity13116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleConcentrationQuantity13171 = new BitSet(new long[]{0x0000000000000000L,0x0000001FE0000000L});
    public static final BitSet FOLLOW_ruleConcentrationUnit_in_ruleConcentrationQuantity13192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator13229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleRelationalOperator13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleRelationalOperator13297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelationalOperator13316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRelationalOperator13335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleRelationalOperator13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleRelationalOperator13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard13416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard13427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard13474 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleQualifiedNameWithWildcard13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13587 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleQualifiedName13606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13621 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList13668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList13678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleList13724 = new BitSet(new long[]{0x0060000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList13745 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_15_in_ruleList13758 = new BitSet(new long[]{0x0060000000000070L});
    public static final BitSet FOLLOW_ruleAtomicVariableExpressionObject_in_ruleList13779 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleList13793 = new BitSet(new long[]{0x0000000000000002L});

}