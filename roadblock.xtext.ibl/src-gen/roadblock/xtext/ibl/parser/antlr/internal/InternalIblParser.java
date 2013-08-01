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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'{'", "'}'", "'('", "','", "')'", "':'", "'required'", "'returned'", "'<'", "'>'", "'LIST'", "'SET'", "'ID'", "'URI'", "'DNA'", "'RATE'", "'CHASSIS'", "'PROCESS'", "'RULE'", "'+'", "'->'", "'<->'", "'~'", "'import'", "'.*'", "'.'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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

                if ( (LA1_0==11||LA1_0==35) ) {
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:121:1: ruleModelMember returns [EObject current=null] : (this_Import_0= ruleImport | this_VariableDefinition_1= ruleVariableDefinition | this_FunctionDefinition_2= ruleFunctionDefinition ) ;
    public final EObject ruleModelMember() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_VariableDefinition_1 = null;

        EObject this_FunctionDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:124:28: ( (this_Import_0= ruleImport | this_VariableDefinition_1= ruleVariableDefinition | this_FunctionDefinition_2= ruleFunctionDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:125:1: (this_Import_0= ruleImport | this_VariableDefinition_1= ruleVariableDefinition | this_FunctionDefinition_2= ruleFunctionDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:125:1: (this_Import_0= ruleImport | this_VariableDefinition_1= ruleVariableDefinition | this_FunctionDefinition_2= ruleFunctionDefinition )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:126:5: this_Import_0= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleModelMember234);
                    this_Import_0=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:136:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleModelMember261);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:146:5: this_FunctionDefinition_2= ruleFunctionDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelMemberAccess().getFunctionDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleModelMember288);
                    this_FunctionDefinition_2=ruleFunctionDefinition();

                    state._fsp--;

                     
                            current = this_FunctionDefinition_2; 
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:162:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:163:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:164:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition323);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition333); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:171:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:174:28: ( ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:1: ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:1: ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:2: () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:176:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVariableDefinition379); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:185:1: ( (lv_type_2_0= ruleVariableType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=30)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:186:1: (lv_type_2_0= ruleVariableType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:186:1: (lv_type_2_0= ruleVariableType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:187:3: lv_type_2_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDefinition400);
                    lv_type_2_0=ruleVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"VariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:203:3: ( (lv_name_3_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:204:1: (lv_name_3_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:204:1: (lv_name_3_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:205:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition418); 

            			newLeafNode(lv_name_3_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleVariableDefinition435); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:225:1: ( (lv_members_5_0= ruleVariableDefinitionMember ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=22 && LA4_0<=30)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:226:1: (lv_members_5_0= ruleVariableDefinitionMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:226:1: (lv_members_5_0= ruleVariableDefinitionMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:227:3: lv_members_5_0= ruleVariableDefinitionMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getMembersVariableDefinitionMemberParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDefinitionMember_in_ruleVariableDefinition456);
            	    lv_members_5_0=ruleVariableDefinitionMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_5_0, 
            	            		"VariableDefinitionMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleVariableDefinition469); 

                	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:255:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:256:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:257:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition505);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition515); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:264:1: ruleFunctionDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )* ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionDefinitionMember ) )* otherlv_12= '}' ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_type_2_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_members_11_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:267:28: ( ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )* ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionDefinitionMember ) )* otherlv_12= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:268:1: ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )* ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionDefinitionMember ) )* otherlv_12= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:268:1: ( () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )* ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionDefinitionMember ) )* otherlv_12= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:268:2: () otherlv_1= 'define' ( (lv_type_2_0= ruleVariableType ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleFunctionParameterMember ) )* ( (lv_parameters_6_0= ruleFunctionParameterMember ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )* otherlv_9= ')' otherlv_10= '{' ( (lv_members_11_0= ruleFunctionDefinitionMember ) )* otherlv_12= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:268:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:269:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFunctionDefinition561); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:278:1: ( (lv_type_2_0= ruleVariableType ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=24 && LA5_0<=30)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:279:1: (lv_type_2_0= ruleVariableType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:279:1: (lv_type_2_0= ruleVariableType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:280:3: lv_type_2_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleFunctionDefinition582);
                    lv_type_2_0=ruleVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"VariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:296:3: ( (lv_name_3_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:297:1: (lv_name_3_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:297:1: (lv_name_3_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:298:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDefinition600); 

            			newLeafNode(lv_name_3_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition617); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:318:1: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        int LA6_2 = input.LA(3);

                        if ( (LA6_2==17) ) {
                            int LA6_3 = input.LA(4);

                            if ( (LA6_3==18) ) {
                                int LA6_4 = input.LA(5);

                                if ( (LA6_4==RULE_ID) ) {
                                    alt6=1;
                                }


                            }
                            else if ( (LA6_3==19) ) {
                                int LA6_5 = input.LA(5);

                                if ( (LA6_5==RULE_ID) ) {
                                    alt6=1;
                                }


                            }


                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:319:1: (lv_parameters_5_0= ruleFunctionParameterMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:319:1: (lv_parameters_5_0= ruleFunctionParameterMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:320:3: lv_parameters_5_0= ruleFunctionParameterMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition638);
            	    lv_parameters_5_0=ruleFunctionParameterMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_5_0, 
            	            		"FunctionParameterMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:336:3: ( (lv_parameters_6_0= ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:337:1: (lv_parameters_6_0= ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:337:1: (lv_parameters_6_0= ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:338:3: lv_parameters_6_0= ruleFunctionParameterMember
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition660);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:354:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:354:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleFunctionParameterMember ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition673); 

            	        	newLeafNode(otherlv_7, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_7_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:358:1: ( (lv_parameters_8_0= ruleFunctionParameterMember ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:359:1: (lv_parameters_8_0= ruleFunctionParameterMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:359:1: (lv_parameters_8_0= ruleFunctionParameterMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:360:3: lv_parameters_8_0= ruleFunctionParameterMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition694);
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
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition708); 

                	newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleFunctionDefinition720); 

                	newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_9());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:384:1: ( (lv_members_11_0= ruleFunctionDefinitionMember ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:385:1: (lv_members_11_0= ruleFunctionDefinitionMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:385:1: (lv_members_11_0= ruleFunctionDefinitionMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:386:3: lv_members_11_0= ruleFunctionDefinitionMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_ruleFunctionDefinition741);
            	    lv_members_11_0=ruleFunctionDefinitionMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_11_0, 
            	            		"FunctionDefinitionMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDefinition754); 

                	newLeafNode(otherlv_12, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleFunctionParameterMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:414:1: entryRuleFunctionParameterMember returns [EObject current=null] : iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF ;
    public final EObject entryRuleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:415:2: (iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:416:2: iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember790);
            iv_ruleFunctionParameterMember=ruleFunctionParameterMember();

            state._fsp--;

             current =iv_ruleFunctionParameterMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember800); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:423:1: ruleFunctionParameterMember returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) ) ;
    public final EObject ruleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:426:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:427:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:427:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:427:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:427:2: ( (lv_type_0_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:428:1: (lv_type_0_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:428:1: (lv_type_0_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:429:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionParameterMember842); 

            			newLeafNode(lv_type_0_0, grammarAccess.getFunctionParameterMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionParameterMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ID");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:445:2: ( (lv_name_1_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:446:1: (lv_name_1_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:446:1: (lv_name_1_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionParameterMember864); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionParameterMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionParameterMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleFunctionParameterMember881); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:467:1: ( (lv_scope_3_0= ruleParameterScope ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:468:1: (lv_scope_3_0= ruleParameterScope )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:468:1: (lv_scope_3_0= ruleParameterScope )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:3: lv_scope_3_0= ruleParameterScope
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterScope_in_ruleFunctionParameterMember902);
            lv_scope_3_0=ruleParameterScope();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionParameterMemberRule());
            	        }
                   		set(
                   			current, 
                   			"scope",
                    		lv_scope_3_0, 
                    		"ParameterScope");
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
    // $ANTLR end "ruleFunctionParameterMember"


    // $ANTLR start "entryRuleParameterScope"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:493:1: entryRuleParameterScope returns [String current=null] : iv_ruleParameterScope= ruleParameterScope EOF ;
    public final String entryRuleParameterScope() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterScope = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:494:2: (iv_ruleParameterScope= ruleParameterScope EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:495:2: iv_ruleParameterScope= ruleParameterScope EOF
            {
             newCompositeNode(grammarAccess.getParameterScopeRule()); 
            pushFollow(FOLLOW_ruleParameterScope_in_entryRuleParameterScope939);
            iv_ruleParameterScope=ruleParameterScope();

            state._fsp--;

             current =iv_ruleParameterScope.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterScope950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterScope"


    // $ANTLR start "ruleParameterScope"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:502:1: ruleParameterScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'required' | kw= 'returned' ) ;
    public final AntlrDatatypeRuleToken ruleParameterScope() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:505:28: ( (kw= 'required' | kw= 'returned' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:506:1: (kw= 'required' | kw= 'returned' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:506:1: (kw= 'required' | kw= 'returned' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:507:2: kw= 'required'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleParameterScope988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:514:2: kw= 'returned'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleParameterScope1007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 
                        

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
    // $ANTLR end "ruleParameterScope"


    // $ANTLR start "entryRuleFunctionDefinitionMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:527:1: entryRuleFunctionDefinitionMember returns [EObject current=null] : iv_ruleFunctionDefinitionMember= ruleFunctionDefinitionMember EOF ;
    public final EObject entryRuleFunctionDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:528:2: (iv_ruleFunctionDefinitionMember= ruleFunctionDefinitionMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:529:2: iv_ruleFunctionDefinitionMember= ruleFunctionDefinitionMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember1047);
            iv_ruleFunctionDefinitionMember=ruleFunctionDefinitionMember();

            state._fsp--;

             current =iv_ruleFunctionDefinitionMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinitionMember1057); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinitionMember"


    // $ANTLR start "ruleFunctionDefinitionMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:536:1: ruleFunctionDefinitionMember returns [EObject current=null] : this_RuleDefinition_0= ruleRuleDefinition ;
    public final EObject ruleFunctionDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:539:28: (this_RuleDefinition_0= ruleRuleDefinition )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:541:5: this_RuleDefinition_0= ruleRuleDefinition
            {
             
                    newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRuleDefinition_in_ruleFunctionDefinitionMember1103);
            this_RuleDefinition_0=ruleRuleDefinition();

            state._fsp--;

             
                    current = this_RuleDefinition_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinitionMember"


    // $ANTLR start "entryRuleVariableDefinitionMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:557:1: entryRuleVariableDefinitionMember returns [EObject current=null] : iv_ruleVariableDefinitionMember= ruleVariableDefinitionMember EOF ;
    public final EObject entryRuleVariableDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:558:2: (iv_ruleVariableDefinitionMember= ruleVariableDefinitionMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:559:2: iv_ruleVariableDefinitionMember= ruleVariableDefinitionMember EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember1137);
            iv_ruleVariableDefinitionMember=ruleVariableDefinitionMember();

            state._fsp--;

             current =iv_ruleVariableDefinitionMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionMember1147); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinitionMember"


    // $ANTLR start "ruleVariableDefinitionMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:566:1: ruleVariableDefinitionMember returns [EObject current=null] : this_VariableDeclaration_0= ruleVariableDeclaration ;
    public final EObject ruleVariableDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:569:28: (this_VariableDeclaration_0= ruleVariableDeclaration )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:571:5: this_VariableDeclaration_0= ruleVariableDeclaration
            {
             
                    newCompositeNode(grammarAccess.getVariableDefinitionMemberAccess().getVariableDeclarationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember1193);
            this_VariableDeclaration_0=ruleVariableDeclaration();

            state._fsp--;

             
                    current = this_VariableDeclaration_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinitionMember"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:587:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:588:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:589:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1227);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1237); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:596:1: ruleVariableDeclaration returns [EObject current=null] : ( ( () ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ) | ( ( (lv_collection_3_0= ruleCollectionID ) ) otherlv_4= '<' ( (lv_type_5_0= ruleVariableType ) ) otherlv_6= '>' ( (lv_name_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_collection_3_0 = null;

        EObject lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:599:28: ( ( ( () ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ) | ( ( (lv_collection_3_0= ruleCollectionID ) ) otherlv_4= '<' ( (lv_type_5_0= ruleVariableType ) ) otherlv_6= '>' ( (lv_name_7_0= RULE_ID ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:1: ( ( () ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ) | ( ( (lv_collection_3_0= ruleCollectionID ) ) otherlv_4= '<' ( (lv_type_5_0= ruleVariableType ) ) otherlv_6= '>' ( (lv_name_7_0= RULE_ID ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:1: ( ( () ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ) | ( ( (lv_collection_3_0= ruleCollectionID ) ) otherlv_4= '<' ( (lv_type_5_0= ruleVariableType ) ) otherlv_6= '>' ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=24 && LA10_0<=30)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:2: ( () ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:2: ( () ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:3: () ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:601:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0_0(),
                                current);
                        

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:606:2: ( ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:606:3: ( (lv_type_1_0= ruleVariableType ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:606:3: ( (lv_type_1_0= ruleVariableType ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:607:1: (lv_type_1_0= ruleVariableType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:607:1: (lv_type_1_0= ruleVariableType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:608:3: lv_type_1_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDeclaration1294);
                    lv_type_1_0=ruleVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"VariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:624:2: ( (lv_name_2_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:625:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:625:1: (lv_name_2_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:626:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1311); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:643:6: ( ( (lv_collection_3_0= ruleCollectionID ) ) otherlv_4= '<' ( (lv_type_5_0= ruleVariableType ) ) otherlv_6= '>' ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:643:6: ( ( (lv_collection_3_0= ruleCollectionID ) ) otherlv_4= '<' ( (lv_type_5_0= ruleVariableType ) ) otherlv_6= '>' ( (lv_name_7_0= RULE_ID ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:643:7: ( (lv_collection_3_0= ruleCollectionID ) ) otherlv_4= '<' ( (lv_type_5_0= ruleVariableType ) ) otherlv_6= '>' ( (lv_name_7_0= RULE_ID ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:643:7: ( (lv_collection_3_0= ruleCollectionID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:644:1: (lv_collection_3_0= ruleCollectionID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:644:1: (lv_collection_3_0= ruleCollectionID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:645:3: lv_collection_3_0= ruleCollectionID
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionID_in_ruleVariableDeclaration1346);
                    lv_collection_3_0=ruleCollectionID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"collection",
                            		lv_collection_3_0, 
                            		"CollectionID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleVariableDeclaration1358); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:665:1: ( (lv_type_5_0= ruleVariableType ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:666:1: (lv_type_5_0= ruleVariableType )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:666:1: (lv_type_5_0= ruleVariableType )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:667:3: lv_type_5_0= ruleVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableType_in_ruleVariableDeclaration1379);
                    lv_type_5_0=ruleVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"VariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleVariableDeclaration1391); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_1_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:687:1: ( (lv_name_7_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:688:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:688:1: (lv_name_7_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:689:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1408); 

                    			newLeafNode(lv_name_7_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:713:1: entryRuleVariableType returns [EObject current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final EObject entryRuleVariableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:714:2: (iv_ruleVariableType= ruleVariableType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:715:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType1450);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType1460); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:722:1: ruleVariableType returns [EObject current=null] : ( () ( ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) ) ) ) ;
    public final EObject ruleVariableType() throws RecognitionException {
        EObject current = null;

        Token lv_primitive_1_2=null;
        AntlrDatatypeRuleToken lv_primitive_1_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:725:28: ( ( () ( ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:726:1: ( () ( ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:726:1: ( () ( ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:726:2: () ( ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:726:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableTypeAccess().getVariableTypeAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:2: ( ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:733:1: ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:733:1: ( (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:734:1: (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:734:1: (lv_primitive_1_1= rulePrimitiveVariableType | lv_primitive_1_2= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=30)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:735:3: lv_primitive_1_1= rulePrimitiveVariableType
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableTypeAccess().getPrimitivePrimitiveVariableTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveVariableType_in_ruleVariableType1517);
                    lv_primitive_1_1=rulePrimitiveVariableType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primitive",
                            		lv_primitive_1_1, 
                            		"PrimitiveVariableType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:750:8: lv_primitive_1_2= RULE_ID
                    {
                    lv_primitive_1_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableType1532); 

                    			newLeafNode(lv_primitive_1_2, grammarAccess.getVariableTypeAccess().getPrimitiveIDTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"primitive",
                            		lv_primitive_1_2, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleCollectionID"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:776:1: entryRuleCollectionID returns [String current=null] : iv_ruleCollectionID= ruleCollectionID EOF ;
    public final String entryRuleCollectionID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionID = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:777:2: (iv_ruleCollectionID= ruleCollectionID EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:778:2: iv_ruleCollectionID= ruleCollectionID EOF
            {
             newCompositeNode(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID1577);
            iv_ruleCollectionID=ruleCollectionID();

            state._fsp--;

             current =iv_ruleCollectionID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID1588); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:785:1: ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LIST' | kw= 'SET' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:788:28: ( (kw= 'LIST' | kw= 'SET' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:789:1: (kw= 'LIST' | kw= 'SET' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:789:1: (kw= 'LIST' | kw= 'SET' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:790:2: kw= 'LIST'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleCollectionID1626); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:797:2: kw= 'SET'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleCollectionID1645); 

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


    // $ANTLR start "entryRulePrimitiveVariableType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:810:1: entryRulePrimitiveVariableType returns [String current=null] : iv_rulePrimitiveVariableType= rulePrimitiveVariableType EOF ;
    public final String entryRulePrimitiveVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveVariableType = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:811:2: (iv_rulePrimitiveVariableType= rulePrimitiveVariableType EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:812:2: iv_rulePrimitiveVariableType= rulePrimitiveVariableType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveVariableTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveVariableType_in_entryRulePrimitiveVariableType1686);
            iv_rulePrimitiveVariableType=rulePrimitiveVariableType();

            state._fsp--;

             current =iv_rulePrimitiveVariableType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveVariableType1697); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveVariableType"


    // $ANTLR start "rulePrimitiveVariableType"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:819:1: rulePrimitiveVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ID' | kw= 'URI' | kw= 'DNA' | kw= 'RATE' | kw= 'CHASSIS' | kw= 'PROCESS' | kw= 'RULE' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:822:28: ( (kw= 'ID' | kw= 'URI' | kw= 'DNA' | kw= 'RATE' | kw= 'CHASSIS' | kw= 'PROCESS' | kw= 'RULE' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:823:1: (kw= 'ID' | kw= 'URI' | kw= 'DNA' | kw= 'RATE' | kw= 'CHASSIS' | kw= 'PROCESS' | kw= 'RULE' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:823:1: (kw= 'ID' | kw= 'URI' | kw= 'DNA' | kw= 'RATE' | kw= 'CHASSIS' | kw= 'PROCESS' | kw= 'RULE' )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            case 30:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:824:2: kw= 'ID'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveVariableType1735); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getIDKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:831:2: kw= 'URI'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulePrimitiveVariableType1754); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getURIKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:838:2: kw= 'DNA'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveVariableType1773); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getDNAKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:845:2: kw= 'RATE'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulePrimitiveVariableType1792); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getRATEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:852:2: kw= 'CHASSIS'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_rulePrimitiveVariableType1811); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getCHASSISKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:859:2: kw= 'PROCESS'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulePrimitiveVariableType1830); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getPROCESSKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:866:2: kw= 'RULE'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulePrimitiveVariableType1849); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveVariableTypeAccess().getRULEKeyword_6()); 
                        

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
    // $ANTLR end "rulePrimitiveVariableType"


    // $ANTLR start "entryRuleRuleDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:879:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:880:2: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:881:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1889);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition1899); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:888:1: ruleRuleDefinition returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* ) (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* ) ) ;
    public final EObject ruleRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_lhs_4_0 = null;

        EObject lv_lhs_6_0 = null;

        EObject lv_rhs_9_0 = null;

        EObject lv_rhs_11_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:891:28: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* ) (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* ) (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* ) (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:2: () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* ) (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleRuleDefinition1945); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:902:1: ( (lv_name_2_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:903:1: (lv_name_2_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:903:1: (lv_name_2_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:904:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleDefinition1962); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRuleDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleRuleDefinition1979); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:924:1: ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:924:2: ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:924:2: ( (lv_lhs_4_0= ruleRuleObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:925:1: (lv_lhs_4_0= ruleRuleObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:925:1: (lv_lhs_4_0= ruleRuleObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:926:3: lv_lhs_4_0= ruleRuleObject
            {
             
            	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition2001);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:942:2: (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:942:4: otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) )
            	    {
            	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleRuleDefinition2014); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:946:1: ( (lv_lhs_6_0= ruleRuleObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:947:1: (lv_lhs_6_0= ruleRuleObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:947:1: (lv_lhs_6_0= ruleRuleObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:948:3: lv_lhs_6_0= ruleRuleObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition2035);
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
            	    break loop14;
                }
            } while (true);


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:964:5: (otherlv_7= '->' | otherlv_8= '<->' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:964:7: otherlv_7= '->'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleRuleDefinition2051); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:969:7: otherlv_8= '<->'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleRuleDefinition2069); 

                        	newLeafNode(otherlv_8, grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1());
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:973:2: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:973:3: ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:973:3: ( (lv_rhs_9_0= ruleRuleObject ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:974:1: (lv_rhs_9_0= ruleRuleObject )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:974:1: (lv_rhs_9_0= ruleRuleObject )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:975:3: lv_rhs_9_0= ruleRuleObject
            {
             
            	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition2092);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:991:2: (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:991:4: otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) )
            	    {
            	    otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleRuleDefinition2105); 

            	        	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:995:1: ( (lv_rhs_11_0= ruleRuleObject ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:996:1: (lv_rhs_11_0= ruleRuleObject )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:996:1: (lv_rhs_11_0= ruleRuleObject )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:997:3: lv_rhs_11_0= ruleRuleObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition2126);
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
            	    break loop16;
                }
            } while (true);


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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1021:1: entryRuleRuleObject returns [EObject current=null] : iv_ruleRuleObject= ruleRuleObject EOF ;
    public final EObject entryRuleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1022:2: (iv_ruleRuleObject= ruleRuleObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1023:2: iv_ruleRuleObject= ruleRuleObject EOF
            {
             newCompositeNode(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject2165);
            iv_ruleRuleObject=ruleRuleObject();

            state._fsp--;

             current =iv_ruleRuleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject2175); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1030:1: ruleRuleObject returns [EObject current=null] : ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleRuleObject() throws RecognitionException {
        EObject current = null;

        Token lv_subobjects_1_0=null;
        Token otherlv_2=null;
        Token lv_subobjects_3_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1033:28: ( ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1034:1: ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1034:1: ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1034:2: () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1034:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1035:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleObjectAccess().getRuleObjectAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1040:2: ( (lv_subobjects_1_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1041:1: (lv_subobjects_1_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1041:1: (lv_subobjects_1_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1042:3: lv_subobjects_1_0= RULE_ID
            {
            lv_subobjects_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleObject2226); 

            			newLeafNode(lv_subobjects_1_0, grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleObjectRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"subobjects",
                    		lv_subobjects_1_0, 
                    		"ID");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1058:2: (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1058:4: otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleRuleObject2244); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRuleObjectAccess().getTildeKeyword_2_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1062:1: ( (lv_subobjects_3_0= RULE_ID ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1063:1: (lv_subobjects_3_0= RULE_ID )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1063:1: (lv_subobjects_3_0= RULE_ID )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1064:3: lv_subobjects_3_0= RULE_ID
            	    {
            	    lv_subobjects_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleObject2261); 

            	    			newLeafNode(lv_subobjects_3_0, grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRuleObjectRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"subobjects",
            	            		lv_subobjects_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleRuleObject"


    // $ANTLR start "entryRuleImport"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1088:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1089:2: (iv_ruleImport= ruleImport EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1090:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2304);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1097:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1100:28: ( ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1101:1: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1101:1: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1101:2: () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1101:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1102:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportAccess().getImportAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleImport2360); 

                	newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1111:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1112:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1112:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1113:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport2381);
            lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1137:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1138:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1139:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2418);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2429); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1146:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1149:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1150:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1150:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1151:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard2476);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1161:1: (kw= '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1162:2: kw= '.*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleQualifiedNameWithWildcard2495); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1175:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1176:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1177:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2538);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2549); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1184:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1187:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1188:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1188:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1188:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2589); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1195:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1196:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName2608); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2623); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\13\1\uffff\11\4\1\14\2\uffff";
    static final String DFA2_maxS =
        "\1\43\1\uffff\1\36\7\4\2\16\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\12\uffff\1\2\1\3";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\27\uffff\1\1",
            "",
            "\1\12\23\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13\7\uffff\1\14\1\uffff\1\15",
            "\1\14\1\uffff\1\15",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "125:1: (this_Import_0= ruleImport | this_VariableDefinition_1= ruleVariableDefinition | this_FunctionDefinition_2= ruleFunctionDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_ruleModel140 = new BitSet(new long[]{0x0000000800000802L});
    public static final BitSet FOLLOW_ruleModelMember_in_entryRuleModelMember177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMember187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModelMember234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleModelMember261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleModelMember288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVariableDefinition379 = new BitSet(new long[]{0x000000007F000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDefinition400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition418 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVariableDefinition435 = new BitSet(new long[]{0x000000007FC02010L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_ruleVariableDefinition456 = new BitSet(new long[]{0x000000007FC02010L});
    public static final BitSet FOLLOW_13_in_ruleVariableDefinition469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFunctionDefinition561 = new BitSet(new long[]{0x000000007F000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleFunctionDefinition582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDefinition600 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition660 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition694 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition708 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionDefinition720 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_ruleFunctionDefinition741 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionParameterMember842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionParameterMember864 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionParameterMember881 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleParameterScope_in_ruleFunctionParameterMember902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_entryRuleParameterScope939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterScope950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleParameterScope988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleParameterScope1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinitionMember1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleFunctionDefinitionMember1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionMember1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDeclaration1294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleVariableDeclaration1346 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDeclaration1358 = new BitSet(new long[]{0x000000007F000010L});
    public static final BitSet FOLLOW_ruleVariableType_in_ruleVariableDeclaration1379 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariableDeclaration1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveVariableType_in_ruleVariableType1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableType1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCollectionID1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCollectionID1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveVariableType_in_entryRulePrimitiveVariableType1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveVariableType1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveVariableType1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveVariableType1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveVariableType1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveVariableType1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveVariableType1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimitiveVariableType1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimitiveVariableType1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRuleDefinition1945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleDefinition1962 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRuleDefinition1979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition2001 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_31_in_ruleRuleDefinition2014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition2035 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_32_in_ruleRuleDefinition2051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33_in_ruleRuleDefinition2069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition2092 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleRuleDefinition2105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition2126 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleObject2226 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleRuleObject2244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleObject2261 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleImport2360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard2476 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleQualifiedNameWithWildcard2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2589 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName2608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2623 = new BitSet(new long[]{0x0000002000000002L});

}