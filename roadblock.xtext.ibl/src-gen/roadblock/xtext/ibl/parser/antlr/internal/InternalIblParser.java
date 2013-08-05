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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'define'", "'{'", "'}'", "'('", "','", "')'", "'USES'", "':'", "'required'", "'returned'", "'optional'", "'<'", "'>'", "'='", "'observable'", "'LIST'", "'SET'", "'~'", "'+'", "'-'", "'|'", "'RULE'", "'->'", "'<->'", "'PROCESS'", "'DEVICE'", "'ATGC'", "'PROPERTY'", "'VERIFY'", "'['", "']'", "'EXPECTED'", "'AT TIME INSTANT'", "'IS'", "'?'", "'<='", "'>='", "'&'", "'WILL HOLD'", "'NEVER HOLDS'", "'ALWAYS HOLDS'", "'WITHIN TIME BOUND'", "'WITH PROBABILITY BOUND'", "'E'", "'e'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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

                if ( (LA1_0==11||LA1_0==14) ) {
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
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==15) ) {
                            alt2=2;
                        }
                        else if ( (LA2_4==17) ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 15:
                        {
                        alt2=2;
                        }
                        break;
                    case 17:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
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


    // $ANTLR start "entryRuleImport"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:162:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:163:2: (iv_ruleImport= ruleImport EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:164:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport323);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport333); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:171:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:174:28: ( ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:1: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:1: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:2: () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:175:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:176:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportAccess().getImportAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleImport379); 

                	newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:185:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:186:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:186:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:187:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport400);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:211:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:212:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:213:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard437);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard448); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:220:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:223:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:224:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:224:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:225:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard495);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:235:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:236:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildcard514); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:249:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:250:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:251:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName557);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName568); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:258:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:261:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:262:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:262:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:262:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName608); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:269:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:270:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName627); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName642); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:290:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:291:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:292:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition689);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition699); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:299:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:302:28: ( ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:303:1: ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:303:1: ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:303:2: () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_members_5_0= ruleVariableDefinitionMember ) )* otherlv_6= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:303:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:304:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinition745); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:313:1: ( (lv_type_2_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:314:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:314:1: (lv_type_2_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:315:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition762); 

                    			newLeafNode(lv_type_2_0, grammarAccess.getVariableDefinitionAccess().getTypeIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:331:3: ( (lv_name_3_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:332:1: (lv_name_3_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:332:1: (lv_name_3_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:333:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition785); 

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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition802); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:353:1: ( (lv_members_5_0= ruleVariableDefinitionMember ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=28 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:354:1: (lv_members_5_0= ruleVariableDefinitionMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:354:1: (lv_members_5_0= ruleVariableDefinitionMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:355:3: lv_members_5_0= ruleVariableDefinitionMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getMembersVariableDefinitionMemberParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDefinitionMember_in_ruleVariableDefinition823);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinition836); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:383:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:384:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:385:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition872);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition882); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:392:1: ruleFunctionDefinition returns [EObject current=null] : ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_members_10_0= ruleFunctionDefinitionMember ) )* otherlv_11= '}' (otherlv_12= 'USES' ( (lv_uses_13_0= ruleFunctionUseMember ) ) (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )* )? ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_members_10_0 = null;

        EObject lv_uses_13_0 = null;

        EObject lv_uses_15_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:395:28: ( ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_members_10_0= ruleFunctionDefinitionMember ) )* otherlv_11= '}' (otherlv_12= 'USES' ( (lv_uses_13_0= ruleFunctionUseMember ) ) (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:396:1: ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_members_10_0= ruleFunctionDefinitionMember ) )* otherlv_11= '}' (otherlv_12= 'USES' ( (lv_uses_13_0= ruleFunctionUseMember ) ) (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:396:1: ( () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_members_10_0= ruleFunctionDefinitionMember ) )* otherlv_11= '}' (otherlv_12= 'USES' ( (lv_uses_13_0= ruleFunctionUseMember ) ) (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:396:2: () otherlv_1= 'define' ( (lv_type_2_0= RULE_ID ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )* )? otherlv_8= ')' otherlv_9= '{' ( (lv_members_10_0= ruleFunctionDefinitionMember ) )* otherlv_11= '}' (otherlv_12= 'USES' ( (lv_uses_13_0= ruleFunctionUseMember ) ) (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:396:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:397:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition928); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:406:1: ( (lv_type_2_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:407:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:407:1: (lv_type_2_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:408:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDefinition945); 

                    			newLeafNode(lv_type_2_0, grammarAccess.getFunctionDefinitionAccess().getTypeIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:424:3: ( (lv_name_3_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:425:1: (lv_name_3_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:425:1: (lv_name_3_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:426:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDefinition968); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFunctionDefinition985); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:446:1: ( ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:446:2: ( (lv_parameters_5_0= ruleFunctionParameterMember ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:446:2: ( (lv_parameters_5_0= ruleFunctionParameterMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:447:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:447:1: (lv_parameters_5_0= ruleFunctionParameterMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:448:3: lv_parameters_5_0= ruleFunctionParameterMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition1007);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:464:2: (otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:464:4: otherlv_6= ',' ( (lv_parameters_7_0= ruleFunctionParameterMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDefinition1020); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:468:1: ( (lv_parameters_7_0= ruleFunctionParameterMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:1: (lv_parameters_7_0= ruleFunctionParameterMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:469:1: (lv_parameters_7_0= ruleFunctionParameterMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:470:3: lv_parameters_7_0= ruleFunctionParameterMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition1041);
                    	    lv_parameters_7_0=ruleFunctionParameterMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_7_0, 
                    	            		"FunctionParameterMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleFunctionDefinition1057); 

                	newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_6());
                
            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition1069); 

                	newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:494:1: ( (lv_members_10_0= ruleFunctionDefinitionMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_INT||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=32 && LA10_0<=33)||LA10_0==35||(LA10_0>=39 && LA10_0<=42)||LA10_0==45) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:495:1: (lv_members_10_0= ruleFunctionDefinitionMember )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:495:1: (lv_members_10_0= ruleFunctionDefinitionMember )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:496:3: lv_members_10_0= ruleFunctionDefinitionMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_ruleFunctionDefinition1090);
            	    lv_members_10_0=ruleFunctionDefinitionMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_10_0, 
            	            		"FunctionDefinitionMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition1103); 

                	newLeafNode(otherlv_11, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_9());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:516:1: (otherlv_12= 'USES' ( (lv_uses_13_0= ruleFunctionUseMember ) ) (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:516:3: otherlv_12= 'USES' ( (lv_uses_13_0= ruleFunctionUseMember ) ) (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )*
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleFunctionDefinition1116); 

                        	newLeafNode(otherlv_12, grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_10_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:520:1: ( (lv_uses_13_0= ruleFunctionUseMember ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:521:1: (lv_uses_13_0= ruleFunctionUseMember )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:521:1: (lv_uses_13_0= ruleFunctionUseMember )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:522:3: lv_uses_13_0= ruleFunctionUseMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition1137);
                    lv_uses_13_0=ruleFunctionUseMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"uses",
                            		lv_uses_13_0, 
                            		"FunctionUseMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:538:2: (otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:538:4: otherlv_14= ',' ( (lv_uses_15_0= ruleFunctionUseMember ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDefinition1150); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_10_2_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:542:1: ( (lv_uses_15_0= ruleFunctionUseMember ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:543:1: (lv_uses_15_0= ruleFunctionUseMember )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:543:1: (lv_uses_15_0= ruleFunctionUseMember )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:544:3: lv_uses_15_0= ruleFunctionUseMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_10_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition1171);
                    	    lv_uses_15_0=ruleFunctionUseMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"uses",
                    	            		lv_uses_15_0, 
                    	            		"FunctionUseMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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


    // $ANTLR start "entryRuleFunctionParameterMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:568:1: entryRuleFunctionParameterMember returns [EObject current=null] : iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF ;
    public final EObject entryRuleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:569:2: (iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:570:2: iv_ruleFunctionParameterMember= ruleFunctionParameterMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember1211);
            iv_ruleFunctionParameterMember=ruleFunctionParameterMember();

            state._fsp--;

             current =iv_ruleFunctionParameterMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember1221); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:577:1: ruleFunctionParameterMember returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) ) ;
    public final EObject ruleFunctionParameterMember() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:580:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:581:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:581:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:581:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_scope_3_0= ruleParameterScope ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:581:2: ( (lv_type_0_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:582:1: (lv_type_0_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:582:1: (lv_type_0_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:583:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionParameterMember1263); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:599:2: ( (lv_name_1_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:1: (lv_name_1_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:600:1: (lv_name_1_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:601:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionParameterMember1285); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFunctionParameterMember1302); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:621:1: ( (lv_scope_3_0= ruleParameterScope ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:622:1: (lv_scope_3_0= ruleParameterScope )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:622:1: (lv_scope_3_0= ruleParameterScope )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:623:3: lv_scope_3_0= ruleParameterScope
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterScope_in_ruleFunctionParameterMember1323);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:647:1: entryRuleParameterScope returns [String current=null] : iv_ruleParameterScope= ruleParameterScope EOF ;
    public final String entryRuleParameterScope() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterScope = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:648:2: (iv_ruleParameterScope= ruleParameterScope EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:649:2: iv_ruleParameterScope= ruleParameterScope EOF
            {
             newCompositeNode(grammarAccess.getParameterScopeRule()); 
            pushFollow(FOLLOW_ruleParameterScope_in_entryRuleParameterScope1360);
            iv_ruleParameterScope=ruleParameterScope();

            state._fsp--;

             current =iv_ruleParameterScope.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterScope1371); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:656:1: ruleParameterScope returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'required' | kw= 'returned' | kw= 'optional' ) ;
    public final AntlrDatatypeRuleToken ruleParameterScope() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:659:28: ( (kw= 'required' | kw= 'returned' | kw= 'optional' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:660:1: (kw= 'required' | kw= 'returned' | kw= 'optional' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:660:1: (kw= 'required' | kw= 'returned' | kw= 'optional' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:661:2: kw= 'required'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleParameterScope1409); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:668:2: kw= 'returned'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleParameterScope1428); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:675:2: kw= 'optional'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleParameterScope1447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterScopeAccess().getOptionalKeyword_2()); 
                        

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:688:1: entryRuleFunctionDefinitionMember returns [EObject current=null] : iv_ruleFunctionDefinitionMember= ruleFunctionDefinitionMember EOF ;
    public final EObject entryRuleFunctionDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:689:2: (iv_ruleFunctionDefinitionMember= ruleFunctionDefinitionMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:690:2: iv_ruleFunctionDefinitionMember= ruleFunctionDefinitionMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember1487);
            iv_ruleFunctionDefinitionMember=ruleFunctionDefinitionMember();

            state._fsp--;

             current =iv_ruleFunctionDefinitionMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinitionMember1497); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:697:1: ruleFunctionDefinitionMember returns [EObject current=null] : (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_VariableDeclaration_3= ruleVariableDeclaration | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition ) ;
    public final EObject ruleFunctionDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject this_RuleDefinition_0 = null;

        EObject this_DeviceDefinition_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_VariableDeclaration_3 = null;

        EObject this_ATGCDefinition_4 = null;

        EObject this_PropertyDefinition_5 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:700:28: ( (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_VariableDeclaration_3= ruleVariableDeclaration | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:701:1: (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_VariableDeclaration_3= ruleVariableDeclaration | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:701:1: (this_RuleDefinition_0= ruleRuleDefinition | this_DeviceDefinition_1= ruleDeviceDefinition | this_VariableAssignment_2= ruleVariableAssignment | this_VariableDeclaration_3= ruleVariableDeclaration | this_ATGCDefinition_4= ruleATGCDefinition | this_PropertyDefinition_5= rulePropertyDefinition )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case 39:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==RULE_ID) ) {
                    alt14=4;
                }
                else if ( (LA14_3==13||LA14_3==27||LA14_3==31) ) {
                    alt14=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 32:
            case 33:
                {
                alt14=3;
                }
                break;
            case 28:
            case 29:
            case 30:
                {
                alt14=4;
                }
                break;
            case 40:
                {
                alt14=5;
                }
                break;
            case 41:
            case 42:
            case 45:
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:702:5: this_RuleDefinition_0= ruleRuleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleDefinition_in_ruleFunctionDefinitionMember1544);
                    this_RuleDefinition_0=ruleRuleDefinition();

                    state._fsp--;

                     
                            current = this_RuleDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:712:5: this_DeviceDefinition_1= ruleDeviceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getDeviceDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_ruleFunctionDefinitionMember1571);
                    this_DeviceDefinition_1=ruleDeviceDefinition();

                    state._fsp--;

                     
                            current = this_DeviceDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:722:5: this_VariableAssignment_2= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleFunctionDefinitionMember1598);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:732:5: this_VariableDeclaration_3= ruleVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getVariableDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFunctionDefinitionMember1625);
                    this_VariableDeclaration_3=ruleVariableDeclaration();

                    state._fsp--;

                     
                            current = this_VariableDeclaration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:742:5: this_ATGCDefinition_4= ruleATGCDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getATGCDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleATGCDefinition_in_ruleFunctionDefinitionMember1652);
                    this_ATGCDefinition_4=ruleATGCDefinition();

                    state._fsp--;

                     
                            current = this_ATGCDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:752:5: this_PropertyDefinition_5= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDefinitionMemberAccess().getPropertyDefinitionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleFunctionDefinitionMember1679);
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
    // $ANTLR end "ruleFunctionDefinitionMember"


    // $ANTLR start "entryRuleFunctionUseMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:768:1: entryRuleFunctionUseMember returns [EObject current=null] : iv_ruleFunctionUseMember= ruleFunctionUseMember EOF ;
    public final EObject entryRuleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUseMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:769:2: (iv_ruleFunctionUseMember= ruleFunctionUseMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:770:2: iv_ruleFunctionUseMember= ruleFunctionUseMember EOF
            {
             newCompositeNode(grammarAccess.getFunctionUseMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember1714);
            iv_ruleFunctionUseMember=ruleFunctionUseMember();

            state._fsp--;

             current =iv_ruleFunctionUseMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUseMember1724); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:777:1: ruleFunctionUseMember returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionUseMember() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:780:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:781:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:781:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:781:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:781:2: ( (lv_type_0_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:782:1: (lv_type_0_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:782:1: (lv_type_0_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:783:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionUseMember1766); 

            			newLeafNode(lv_type_0_0, grammarAccess.getFunctionUseMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionUseMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ID");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:799:2: ( (lv_name_1_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:800:1: (lv_name_1_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:800:1: (lv_name_1_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:801:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionUseMember1788); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionUseMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionUseMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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


    // $ANTLR start "entryRuleVariableDefinitionMember"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:825:1: entryRuleVariableDefinitionMember returns [EObject current=null] : iv_ruleVariableDefinitionMember= ruleVariableDefinitionMember EOF ;
    public final EObject entryRuleVariableDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinitionMember = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:826:2: (iv_ruleVariableDefinitionMember= ruleVariableDefinitionMember EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:827:2: iv_ruleVariableDefinitionMember= ruleVariableDefinitionMember EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember1829);
            iv_ruleVariableDefinitionMember=ruleVariableDefinitionMember();

            state._fsp--;

             current =iv_ruleVariableDefinitionMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionMember1839); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:834:1: ruleVariableDefinitionMember returns [EObject current=null] : this_VariableDeclaration_0= ruleVariableDeclaration ;
    public final EObject ruleVariableDefinitionMember() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:837:28: (this_VariableDeclaration_0= ruleVariableDeclaration )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:839:5: this_VariableDeclaration_0= ruleVariableDeclaration
            {
             
                    newCompositeNode(grammarAccess.getVariableDefinitionMemberAccess().getVariableDeclarationParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember1885);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:855:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:856:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:857:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1919);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1929); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:864:1: ruleVariableDeclaration returns [EObject current=null] : ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) | ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) ) ) (otherlv_9= '=' ( (lv_constructor_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )? otherlv_15= ')' )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_type_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_constructor_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_qualifier_1_0 = null;

        AntlrDatatypeRuleToken lv_collection_4_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:867:28: ( ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) | ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) ) ) (otherlv_9= '=' ( (lv_constructor_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )? otherlv_15= ')' )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:868:1: ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) | ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) ) ) (otherlv_9= '=' ( (lv_constructor_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )? otherlv_15= ')' )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:868:1: ( () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) | ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) ) ) (otherlv_9= '=' ( (lv_constructor_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )? otherlv_15= ')' )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:868:2: () ( (lv_qualifier_1_0= ruleVariableQualifier ) )? ( ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) | ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) ) ) (otherlv_9= '=' ( (lv_constructor_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )? otherlv_15= ')' )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:868:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:869:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:874:2: ( (lv_qualifier_1_0= ruleVariableQualifier ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:875:1: (lv_qualifier_1_0= ruleVariableQualifier )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:875:1: (lv_qualifier_1_0= ruleVariableQualifier )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:876:3: lv_qualifier_1_0= ruleVariableQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getQualifierVariableQualifierParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableQualifier_in_ruleVariableDeclaration1984);
                    lv_qualifier_1_0=ruleVariableQualifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:3: ( ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ) | ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=29 && LA16_0<=30)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:4: ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:4: ( ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:5: ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:892:5: ( (lv_type_2_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:893:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:893:1: (lv_type_2_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:894:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2004); 

                    			newLeafNode(lv_type_2_0, grammarAccess.getVariableDeclarationAccess().getTypeIDTerminalRuleCall_2_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:910:2: ( (lv_name_3_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:911:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:911:1: (lv_name_3_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:912:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2026); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:929:6: ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:929:6: ( ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:929:7: ( (lv_collection_4_0= ruleCollectionID ) ) otherlv_5= '<' ( (lv_type_6_0= RULE_ID ) ) otherlv_7= '>' ( (lv_name_8_0= RULE_ID ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:929:7: ( (lv_collection_4_0= ruleCollectionID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:930:1: (lv_collection_4_0= ruleCollectionID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:930:1: (lv_collection_4_0= ruleCollectionID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:931:3: lv_collection_4_0= ruleCollectionID
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionID_in_ruleVariableDeclaration2060);
                    lv_collection_4_0=ruleCollectionID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"collection",
                            		lv_collection_4_0, 
                            		"CollectionID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleVariableDeclaration2072); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_2_1_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:951:1: ( (lv_type_6_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:952:1: (lv_type_6_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:952:1: (lv_type_6_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:953:3: lv_type_6_0= RULE_ID
                    {
                    lv_type_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2089); 

                    			newLeafNode(lv_type_6_0, grammarAccess.getVariableDeclarationAccess().getTypeIDTerminalRuleCall_2_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleVariableDeclaration2106); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_2_1_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:973:1: ( (lv_name_8_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:974:1: (lv_name_8_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:974:1: (lv_name_8_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:975:3: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2123); 

                    			newLeafNode(lv_name_8_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:991:4: (otherlv_9= '=' ( (lv_constructor_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )? otherlv_15= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:991:6: otherlv_9= '=' ( (lv_constructor_10_0= RULE_ID ) ) otherlv_11= '(' ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )? otherlv_15= ')'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleVariableDeclaration2143); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:995:1: ( (lv_constructor_10_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:996:1: (lv_constructor_10_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:996:1: (lv_constructor_10_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:997:3: lv_constructor_10_0= RULE_ID
                    {
                    lv_constructor_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2160); 

                    			newLeafNode(lv_constructor_10_0, grammarAccess.getVariableDeclarationAccess().getConstructorIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constructor",
                            		lv_constructor_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration2177); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_2());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1017:1: ( ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==RULE_INT||(LA18_0>=32 && LA18_0<=33)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1017:2: ( (lv_parameters_12_0= ruleVariableAssignment ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )*
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1017:2: ( (lv_parameters_12_0= ruleVariableAssignment ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1018:1: (lv_parameters_12_0= ruleVariableAssignment )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1018:1: (lv_parameters_12_0= ruleVariableAssignment )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1019:3: lv_parameters_12_0= ruleVariableAssignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getParametersVariableAssignmentParserRuleCall_3_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableAssignment_in_ruleVariableDeclaration2199);
                            lv_parameters_12_0=ruleVariableAssignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_12_0, 
                                    		"VariableAssignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1035:2: (otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==18) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1035:4: otherlv_13= ',' ( (lv_parameters_14_0= ruleVariableAssignment ) )
                            	    {
                            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration2212); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_3_1_0());
                            	        
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1039:1: ( (lv_parameters_14_0= ruleVariableAssignment ) )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1040:1: (lv_parameters_14_0= ruleVariableAssignment )
                            	    {
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1040:1: (lv_parameters_14_0= ruleVariableAssignment )
                            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1041:3: lv_parameters_14_0= ruleVariableAssignment
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getParametersVariableAssignmentParserRuleCall_3_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleVariableDeclaration2233);
                            	    lv_parameters_14_0=ruleVariableAssignment();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameters",
                            	            		lv_parameters_14_0, 
                            	            		"VariableAssignment");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleVariableDeclaration2249); 

                        	newLeafNode(otherlv_15, grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_4());
                        

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableQualifier"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1069:1: entryRuleVariableQualifier returns [String current=null] : iv_ruleVariableQualifier= ruleVariableQualifier EOF ;
    public final String entryRuleVariableQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableQualifier = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1070:2: (iv_ruleVariableQualifier= ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1071:2: iv_ruleVariableQualifier= ruleVariableQualifier EOF
            {
             newCompositeNode(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier2288);
            iv_ruleVariableQualifier=ruleVariableQualifier();

            state._fsp--;

             current =iv_ruleVariableQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier2299); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1078:1: ruleVariableQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'observable' ;
    public final AntlrDatatypeRuleToken ruleVariableQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1081:28: (kw= 'observable' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1083:2: kw= 'observable'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleVariableQualifier2336); 

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


    // $ANTLR start "entryRuleCollectionID"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1096:1: entryRuleCollectionID returns [String current=null] : iv_ruleCollectionID= ruleCollectionID EOF ;
    public final String entryRuleCollectionID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionID = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1097:2: (iv_ruleCollectionID= ruleCollectionID EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1098:2: iv_ruleCollectionID= ruleCollectionID EOF
            {
             newCompositeNode(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID2376);
            iv_ruleCollectionID=ruleCollectionID();

            state._fsp--;

             current =iv_ruleCollectionID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID2387); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1105:1: ruleCollectionID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LIST' | kw= 'SET' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1108:28: ( (kw= 'LIST' | kw= 'SET' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1109:1: (kw= 'LIST' | kw= 'SET' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1109:1: (kw= 'LIST' | kw= 'SET' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            else if ( (LA20_0==30) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1110:2: kw= 'LIST'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCollectionID2425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1117:2: kw= 'SET'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleCollectionID2444); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1130:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1131:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1132:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2484);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment2494); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1139:1: ruleVariableAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleVariableAttribute ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1142:28: ( ( () ( (lv_variable_1_0= ruleVariableAttribute ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1143:1: ( () ( (lv_variable_1_0= ruleVariableAttribute ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1143:1: ( () ( (lv_variable_1_0= ruleVariableAttribute ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1143:2: () ( (lv_variable_1_0= ruleVariableAttribute ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleVariableExpression ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1143:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1144:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1149:2: ( (lv_variable_1_0= ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1150:1: (lv_variable_1_0= ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1150:1: (lv_variable_1_0= ruleVariableAttribute )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1151:3: lv_variable_1_0= ruleVariableAttribute
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableAttributeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableAssignment2549);
            lv_variable_1_0=ruleVariableAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"VariableAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleVariableAssignment2561); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1171:1: ( (lv_expression_3_0= ruleVariableExpression ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1172:1: (lv_expression_3_0= ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1172:1: (lv_expression_3_0= ruleVariableExpression )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1173:3: lv_expression_3_0= ruleVariableExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableExpression_in_ruleVariableAssignment2582);
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


    // $ANTLR start "entryRuleVariableAttribute"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1197:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1198:2: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1199:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute2618);
            iv_ruleVariableAttribute=ruleVariableAttribute();

            state._fsp--;

             current =iv_ruleVariableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute2628); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1206:1: ruleVariableAttribute returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) ) ) ( (otherlv_2= '.' | otherlv_3= '~' ) ( (lv_attribute_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_attribute_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_2 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1209:28: ( ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) ) ) ( (otherlv_2= '.' | otherlv_3= '~' ) ( (lv_attribute_4_0= RULE_ID ) ) )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:1: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) ) ) ( (otherlv_2= '.' | otherlv_3= '~' ) ( (lv_attribute_4_0= RULE_ID ) ) )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:1: ( () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) ) ) ( (otherlv_2= '.' | otherlv_3= '~' ) ( (lv_attribute_4_0= RULE_ID ) ) )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:2: () ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) ) ) ( (otherlv_2= '.' | otherlv_3= '~' ) ( (lv_attribute_4_0= RULE_ID ) ) )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1210:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1211:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1216:2: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1217:1: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1217:1: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1218:1: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1218:1: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleREAL )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_INT||(LA21_0>=32 && LA21_0<=33)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1219:3: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAttribute2681); 

                    			newLeafNode(lv_name_1_1, grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1234:8: lv_name_1_2= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAttributeAccess().getNameREALParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleVariableAttribute2705);
                    lv_name_1_2=ruleREAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"REAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1252:2: ( (otherlv_2= '.' | otherlv_3= '~' ) ( (lv_attribute_4_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13||LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1252:3: (otherlv_2= '.' | otherlv_3= '~' ) ( (lv_attribute_4_0= RULE_ID ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1252:3: (otherlv_2= '.' | otherlv_3= '~' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==13) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==31) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1252:5: otherlv_2= '.'
                            {
                            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleVariableAttribute2722); 

                                	newLeafNode(otherlv_2, grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1257:7: otherlv_3= '~'
                            {
                            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleVariableAttribute2740); 

                                	newLeafNode(otherlv_3, grammarAccess.getVariableAttributeAccess().getTildeKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1261:2: ( (lv_attribute_4_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1262:1: (lv_attribute_4_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1262:1: (lv_attribute_4_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1263:3: lv_attribute_4_0= RULE_ID
                    {
                    lv_attribute_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAttribute2758); 

                    			newLeafNode(lv_attribute_4_0, grammarAccess.getVariableAttributeAccess().getAttributeIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_4_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleVariableAttribute"


    // $ANTLR start "entryRuleVariableExpression"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1287:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1288:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1289:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression2801);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression2811); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1296:1: ruleVariableExpression returns [EObject current=null] : ( () ( (lv_members_1_0= ruleVariableAttribute ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) ) )* ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1299:28: ( ( () ( (lv_members_1_0= ruleVariableAttribute ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:1: ( () ( (lv_members_1_0= ruleVariableAttribute ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:1: ( () ( (lv_members_1_0= ruleVariableAttribute ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:2: () ( (lv_members_1_0= ruleVariableAttribute ) ) ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1300:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1306:2: ( (lv_members_1_0= ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1307:1: (lv_members_1_0= ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1307:1: (lv_members_1_0= ruleVariableAttribute )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1308:3: lv_members_1_0= ruleVariableAttribute
            {
             
            	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableExpression2866);
            lv_members_1_0=ruleVariableAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"VariableAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1324:2: ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) ) )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1325:5: ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression2883);
            	    ruleVariableExpressionOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1332:1: ( (lv_members_3_0= ruleVariableAttribute ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1333:1: (lv_members_3_0= ruleVariableAttribute )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1333:1: (lv_members_3_0= ruleVariableAttribute )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1334:3: lv_members_3_0= ruleVariableAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleVariableExpression2903);
            	    lv_members_3_0=ruleVariableAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"VariableAttribute");
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


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleVariableExpressionOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1358:1: entryRuleVariableExpressionOperator returns [String current=null] : iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF ;
    public final String entryRuleVariableExpressionOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableExpressionOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1359:2: (iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1360:2: iv_ruleVariableExpressionOperator= ruleVariableExpressionOperator EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator2942);
            iv_ruleVariableExpressionOperator=ruleVariableExpressionOperator();

            state._fsp--;

             current =iv_ruleVariableExpressionOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator2953); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1367:1: ruleVariableExpressionOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleVariableExpressionOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1370:28: ( (kw= '+' | kw= '-' | kw= '|' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1371:1: (kw= '+' | kw= '-' | kw= '|' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1371:1: (kw= '+' | kw= '-' | kw= '|' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt25=1;
                }
                break;
            case 33:
                {
                alt25=2;
                }
                break;
            case 34:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1372:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleVariableExpressionOperator2991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1379:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleVariableExpressionOperator3010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1386:2: kw= '|'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleVariableExpressionOperator3029); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1399:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1400:2: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1401:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition3069);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition3079); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1408:1: ruleRuleDefinition returns [EObject current=null] : ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) ;
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
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1411:28: ( ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1412:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1412:1: ( () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1412:2: () otherlv_1= 'RULE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )? (otherlv_7= '->' | otherlv_8= '<->' ) ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1412:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1413:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleRuleDefinition3125); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1422:1: ( (lv_name_2_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1423:1: (lv_name_2_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1423:1: (lv_name_2_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1424:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleDefinition3142); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleRuleDefinition3159); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1444:1: ( ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1444:2: ( (lv_lhs_4_0= ruleRuleObject ) ) (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1444:2: ( (lv_lhs_4_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1445:1: (lv_lhs_4_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1445:1: (lv_lhs_4_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1446:3: lv_lhs_4_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition3181);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1462:2: (otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==32) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1462:4: otherlv_5= '+' ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleRuleDefinition3194); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1466:1: ( (lv_lhs_6_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1467:1: (lv_lhs_6_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1467:1: (lv_lhs_6_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1468:3: lv_lhs_6_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition3215);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:6: (otherlv_7= '->' | otherlv_8= '<->' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            else if ( (LA28_0==37) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1484:8: otherlv_7= '->'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleRuleDefinition3232); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1489:7: otherlv_8= '<->'
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleRuleDefinition3250); 

                        	newLeafNode(otherlv_8, grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1());
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1493:2: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1493:3: ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1493:3: ( (lv_rhs_9_0= ruleRuleObject ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1494:1: (lv_rhs_9_0= ruleRuleObject )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1494:1: (lv_rhs_9_0= ruleRuleObject )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1495:3: lv_rhs_9_0= ruleRuleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition3273);
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

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1511:2: (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==32) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==RULE_ID) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1511:4: otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    {
                    	    otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleRuleDefinition3286); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1515:1: ( (lv_rhs_11_0= ruleRuleObject ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1516:1: (lv_rhs_11_0= ruleRuleObject )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1516:1: (lv_rhs_11_0= ruleRuleObject )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1517:3: lv_rhs_11_0= ruleRuleObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRuleObject_in_ruleRuleDefinition3307);
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
                    	    break loop29;
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1541:1: entryRuleRuleObject returns [EObject current=null] : iv_ruleRuleObject= ruleRuleObject EOF ;
    public final EObject entryRuleRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleObject = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1542:2: (iv_ruleRuleObject= ruleRuleObject EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1543:2: iv_ruleRuleObject= ruleRuleObject EOF
            {
             newCompositeNode(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject3347);
            iv_ruleRuleObject=ruleRuleObject();

            state._fsp--;

             current =iv_ruleRuleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject3357); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1550:1: ruleRuleObject returns [EObject current=null] : ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleRuleObject() throws RecognitionException {
        EObject current = null;

        Token lv_subobjects_1_0=null;
        Token otherlv_2=null;
        Token lv_subobjects_3_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1553:28: ( ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1554:1: ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1554:1: ( () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1554:2: () ( (lv_subobjects_1_0= RULE_ID ) ) (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1554:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1555:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleObjectAccess().getRuleObjectAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1560:2: ( (lv_subobjects_1_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1561:1: (lv_subobjects_1_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1561:1: (lv_subobjects_1_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1562:3: lv_subobjects_1_0= RULE_ID
            {
            lv_subobjects_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleObject3408); 

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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1578:2: (otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1578:4: otherlv_2= '~' ( (lv_subobjects_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleRuleObject3426); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRuleObjectAccess().getTildeKeyword_2_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1582:1: ( (lv_subobjects_3_0= RULE_ID ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1583:1: (lv_subobjects_3_0= RULE_ID )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1583:1: (lv_subobjects_3_0= RULE_ID )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1584:3: lv_subobjects_3_0= RULE_ID
            	    {
            	    lv_subobjects_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleObject3443); 

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
            	    break loop31;
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


    // $ANTLR start "entryRuleProcessDeclaration"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1608:1: entryRuleProcessDeclaration returns [EObject current=null] : iv_ruleProcessDeclaration= ruleProcessDeclaration EOF ;
    public final EObject entryRuleProcessDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessDeclaration = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1609:2: (iv_ruleProcessDeclaration= ruleProcessDeclaration EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1610:2: iv_ruleProcessDeclaration= ruleProcessDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcessDeclarationRule()); 
            pushFollow(FOLLOW_ruleProcessDeclaration_in_entryRuleProcessDeclaration3486);
            iv_ruleProcessDeclaration=ruleProcessDeclaration();

            state._fsp--;

             current =iv_ruleProcessDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessDeclaration3496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessDeclaration"


    // $ANTLR start "ruleProcessDeclaration"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1617:1: ruleProcessDeclaration returns [EObject current=null] : ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_constructor_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleVariableAssignment ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleProcessDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_constructor_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1620:28: ( ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_constructor_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleVariableAssignment ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )* )? otherlv_9= ')' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1621:1: ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_constructor_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleVariableAssignment ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )* )? otherlv_9= ')' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1621:1: ( () otherlv_1= 'PROCESS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_constructor_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleVariableAssignment ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )* )? otherlv_9= ')' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1621:2: () otherlv_1= 'PROCESS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_constructor_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleVariableAssignment ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )* )? otherlv_9= ')'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1621:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1622:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessDeclarationAccess().getProcessDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleProcessDeclaration3542); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessDeclarationAccess().getPROCESSKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1631:1: ( (lv_name_2_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1632:1: (lv_name_2_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1632:1: (lv_name_2_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1633:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessDeclaration3559); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProcessDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleProcessDeclaration3576); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessDeclarationAccess().getEqualsSignKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1653:1: ( (lv_constructor_4_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1654:1: (lv_constructor_4_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1654:1: (lv_constructor_4_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1655:3: lv_constructor_4_0= RULE_ID
            {
            lv_constructor_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessDeclaration3593); 

            			newLeafNode(lv_constructor_4_0, grammarAccess.getProcessDeclarationAccess().getConstructorIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"constructor",
                    		lv_constructor_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleProcessDeclaration3610); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessDeclarationAccess().getLeftParenthesisKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1675:1: ( ( (lv_parameters_6_0= ruleVariableAssignment ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==RULE_INT||(LA33_0>=32 && LA33_0<=33)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1675:2: ( (lv_parameters_6_0= ruleVariableAssignment ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1675:2: ( (lv_parameters_6_0= ruleVariableAssignment ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1676:1: (lv_parameters_6_0= ruleVariableAssignment )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1676:1: (lv_parameters_6_0= ruleVariableAssignment )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1677:3: lv_parameters_6_0= ruleVariableAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessDeclarationAccess().getParametersVariableAssignmentParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleProcessDeclaration3632);
                    lv_parameters_6_0=ruleVariableAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_6_0, 
                            		"VariableAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1693:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1693:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleVariableAssignment ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleProcessDeclaration3645); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getProcessDeclarationAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1697:1: ( (lv_parameters_8_0= ruleVariableAssignment ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1698:1: (lv_parameters_8_0= ruleVariableAssignment )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1698:1: (lv_parameters_8_0= ruleVariableAssignment )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1699:3: lv_parameters_8_0= ruleVariableAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessDeclarationAccess().getParametersVariableAssignmentParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleProcessDeclaration3666);
                    	    lv_parameters_8_0=ruleVariableAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_8_0, 
                    	            		"VariableAssignment");
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
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleProcessDeclaration3682); 

                	newLeafNode(otherlv_9, grammarAccess.getProcessDeclarationAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessDeclaration"


    // $ANTLR start "entryRuleDeviceDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1727:1: entryRuleDeviceDefinition returns [EObject current=null] : iv_ruleDeviceDefinition= ruleDeviceDefinition EOF ;
    public final EObject entryRuleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1728:2: (iv_ruleDeviceDefinition= ruleDeviceDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1729:2: iv_ruleDeviceDefinition= ruleDeviceDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeviceDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition3718);
            iv_ruleDeviceDefinition=ruleDeviceDefinition();

            state._fsp--;

             current =iv_ruleDeviceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDefinition3728); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1736:1: ruleDeviceDefinition returns [EObject current=null] : ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'DEVICE' otherlv_5= '(' ( ( (lv_parts_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )* ) otherlv_9= ')' otherlv_10= '(' ( ( (lv_parameters_11_0= ruleVariableAssignment ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )* )? otherlv_14= ')' otherlv_15= '{' ( (lv_members_16_0= ruleDeviceMembers ) )* otherlv_17= '}' ) ;
    public final EObject ruleDeviceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_parts_6_0=null;
        Token otherlv_7=null;
        Token lv_parts_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_members_16_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1739:28: ( ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'DEVICE' otherlv_5= '(' ( ( (lv_parts_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )* ) otherlv_9= ')' otherlv_10= '(' ( ( (lv_parameters_11_0= ruleVariableAssignment ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )* )? otherlv_14= ')' otherlv_15= '{' ( (lv_members_16_0= ruleDeviceMembers ) )* otherlv_17= '}' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1740:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'DEVICE' otherlv_5= '(' ( ( (lv_parts_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )* ) otherlv_9= ')' otherlv_10= '(' ( ( (lv_parameters_11_0= ruleVariableAssignment ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )* )? otherlv_14= ')' otherlv_15= '{' ( (lv_members_16_0= ruleDeviceMembers ) )* otherlv_17= '}' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1740:1: ( () otherlv_1= 'DEVICE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'DEVICE' otherlv_5= '(' ( ( (lv_parts_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )* ) otherlv_9= ')' otherlv_10= '(' ( ( (lv_parameters_11_0= ruleVariableAssignment ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )* )? otherlv_14= ')' otherlv_15= '{' ( (lv_members_16_0= ruleDeviceMembers ) )* otherlv_17= '}' )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1740:2: () otherlv_1= 'DEVICE' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'DEVICE' otherlv_5= '(' ( ( (lv_parts_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )* ) otherlv_9= ')' otherlv_10= '(' ( ( (lv_parameters_11_0= ruleVariableAssignment ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )* )? otherlv_14= ')' otherlv_15= '{' ( (lv_members_16_0= ruleDeviceMembers ) )* otherlv_17= '}'
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1740:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1741:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleDeviceDefinition3774); 

                	newLeafNode(otherlv_1, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1750:1: ( (lv_name_2_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1751:1: (lv_name_2_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1751:1: (lv_name_2_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1752:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeviceDefinition3791); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDeviceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleDeviceDefinition3808); 

                	newLeafNode(otherlv_3, grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleDeviceDefinition3820); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_4());
                
            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition3832); 

                	newLeafNode(otherlv_5, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_5());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1780:1: ( ( (lv_parts_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1780:2: ( (lv_parts_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1780:2: ( (lv_parts_6_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1781:1: (lv_parts_6_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1781:1: (lv_parts_6_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1782:3: lv_parts_6_0= RULE_ID
            {
            lv_parts_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeviceDefinition3850); 

            			newLeafNode(lv_parts_6_0, grammarAccess.getDeviceDefinitionAccess().getPartsIDTerminalRuleCall_6_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceDefinitionRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"parts",
                    		lv_parts_6_0, 
                    		"ID");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1798:2: (otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1798:4: otherlv_7= ',' ( (lv_parts_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition3868); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_6_1_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1802:1: ( (lv_parts_8_0= RULE_ID ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1803:1: (lv_parts_8_0= RULE_ID )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1803:1: (lv_parts_8_0= RULE_ID )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1804:3: lv_parts_8_0= RULE_ID
            	    {
            	    lv_parts_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeviceDefinition3885); 

            	    			newLeafNode(lv_parts_8_0, grammarAccess.getDeviceDefinitionAccess().getPartsIDTerminalRuleCall_6_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeviceDefinitionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"parts",
            	            		lv_parts_8_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleDeviceDefinition3905); 

                	newLeafNode(otherlv_9, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_7());
                
            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleDeviceDefinition3917); 

                	newLeafNode(otherlv_10, grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_8());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1828:1: ( ( (lv_parameters_11_0= ruleVariableAssignment ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==RULE_INT||(LA36_0>=32 && LA36_0<=33)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1828:2: ( (lv_parameters_11_0= ruleVariableAssignment ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )*
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1828:2: ( (lv_parameters_11_0= ruleVariableAssignment ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1829:1: (lv_parameters_11_0= ruleVariableAssignment )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1829:1: (lv_parameters_11_0= ruleVariableAssignment )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1830:3: lv_parameters_11_0= ruleVariableAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getParametersVariableAssignmentParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleDeviceDefinition3939);
                    lv_parameters_11_0=ruleVariableAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_11_0, 
                            		"VariableAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1846:2: (otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==18) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1846:4: otherlv_12= ',' ( (lv_parameters_13_0= ruleVariableAssignment ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleDeviceDefinition3952); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_9_1_0());
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1850:1: ( (lv_parameters_13_0= ruleVariableAssignment ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1851:1: (lv_parameters_13_0= ruleVariableAssignment )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1851:1: (lv_parameters_13_0= ruleVariableAssignment )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1852:3: lv_parameters_13_0= ruleVariableAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getParametersVariableAssignmentParserRuleCall_9_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleDeviceDefinition3973);
                    	    lv_parameters_13_0=ruleVariableAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_13_0, 
                    	            		"VariableAssignment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleDeviceDefinition3989); 

                	newLeafNode(otherlv_14, grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10());
                
            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleDeviceDefinition4001); 

                	newLeafNode(otherlv_15, grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_11());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1876:1: ( (lv_members_16_0= ruleDeviceMembers ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==38||(LA37_0>=41 && LA37_0<=42)||LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1877:1: (lv_members_16_0= ruleDeviceMembers )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1877:1: (lv_members_16_0= ruleDeviceMembers )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1878:3: lv_members_16_0= ruleDeviceMembers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeviceDefinitionAccess().getMembersDeviceMembersParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition4022);
            	    lv_members_16_0=ruleDeviceMembers();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeviceDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_16_0, 
            	            		"DeviceMembers");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleDeviceDefinition4035); 

                	newLeafNode(otherlv_17, grammarAccess.getDeviceDefinitionAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1906:1: entryRuleDeviceMembers returns [EObject current=null] : iv_ruleDeviceMembers= ruleDeviceMembers EOF ;
    public final EObject entryRuleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceMembers = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1907:2: (iv_ruleDeviceMembers= ruleDeviceMembers EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1908:2: iv_ruleDeviceMembers= ruleDeviceMembers EOF
            {
             newCompositeNode(grammarAccess.getDeviceMembersRule()); 
            pushFollow(FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers4071);
            iv_ruleDeviceMembers=ruleDeviceMembers();

            state._fsp--;

             current =iv_ruleDeviceMembers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceMembers4081); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1915:1: ruleDeviceMembers returns [EObject current=null] : (this_ProcessDeclaration_0= ruleProcessDeclaration | this_PropertyDefinition_1= rulePropertyDefinition ) ;
    public final EObject ruleDeviceMembers() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessDeclaration_0 = null;

        EObject this_PropertyDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1918:28: ( (this_ProcessDeclaration_0= ruleProcessDeclaration | this_PropertyDefinition_1= rulePropertyDefinition ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1919:1: (this_ProcessDeclaration_0= ruleProcessDeclaration | this_PropertyDefinition_1= rulePropertyDefinition )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1919:1: (this_ProcessDeclaration_0= ruleProcessDeclaration | this_PropertyDefinition_1= rulePropertyDefinition )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=41 && LA38_0<=42)||LA38_0==45) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1920:5: this_ProcessDeclaration_0= ruleProcessDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getProcessDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProcessDeclaration_in_ruleDeviceMembers4128);
                    this_ProcessDeclaration_0=ruleProcessDeclaration();

                    state._fsp--;

                     
                            current = this_ProcessDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1930:5: this_PropertyDefinition_1= rulePropertyDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeviceMembersAccess().getPropertyDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers4155);
                    this_PropertyDefinition_1=rulePropertyDefinition();

                    state._fsp--;

                     
                            current = this_PropertyDefinition_1; 
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1946:1: entryRuleATGCDefinition returns [EObject current=null] : iv_ruleATGCDefinition= ruleATGCDefinition EOF ;
    public final EObject entryRuleATGCDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATGCDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1947:2: (iv_ruleATGCDefinition= ruleATGCDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1948:2: iv_ruleATGCDefinition= ruleATGCDefinition EOF
            {
             newCompositeNode(grammarAccess.getATGCDefinitionRule()); 
            pushFollow(FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition4190);
            iv_ruleATGCDefinition=ruleATGCDefinition();

            state._fsp--;

             current =iv_ruleATGCDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCDefinition4200); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1955:1: ruleATGCDefinition returns [EObject current=null] : ( () otherlv_1= 'ATGC' ( (lv_command_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_arguments_6_0= RULE_ID ) ) )* ) ;
    public final EObject ruleATGCDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_command_2_0=null;
        Token otherlv_3=null;
        Token lv_arguments_4_0=null;
        Token otherlv_5=null;
        Token lv_arguments_6_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1958:28: ( ( () otherlv_1= 'ATGC' ( (lv_command_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_arguments_6_0= RULE_ID ) ) )* ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1959:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_arguments_6_0= RULE_ID ) ) )* )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1959:1: ( () otherlv_1= 'ATGC' ( (lv_command_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_arguments_6_0= RULE_ID ) ) )* )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1959:2: () otherlv_1= 'ATGC' ( (lv_command_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_arguments_6_0= RULE_ID ) ) )*
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1959:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1960:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleATGCDefinition4246); 

                	newLeafNode(otherlv_1, grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1969:1: ( (lv_command_2_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1970:1: (lv_command_2_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1970:1: (lv_command_2_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1971:3: lv_command_2_0= RULE_ID
            {
            lv_command_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleATGCDefinition4263); 

            			newLeafNode(lv_command_2_0, grammarAccess.getATGCDefinitionAccess().getCommandIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getATGCDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"command",
                    		lv_command_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleATGCDefinition4280); 

                	newLeafNode(otherlv_3, grammarAccess.getATGCDefinitionAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1991:1: ( (lv_arguments_4_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1992:1: (lv_arguments_4_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1992:1: (lv_arguments_4_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:1993:3: lv_arguments_4_0= RULE_ID
            {
            lv_arguments_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleATGCDefinition4297); 

            			newLeafNode(lv_arguments_4_0, grammarAccess.getATGCDefinitionAccess().getArgumentsIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getATGCDefinitionRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"arguments",
                    		lv_arguments_4_0, 
                    		"ID");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2009:2: (otherlv_5= ',' ( (lv_arguments_6_0= RULE_ID ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2009:4: otherlv_5= ',' ( (lv_arguments_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleATGCDefinition4315); 

            	        	newLeafNode(otherlv_5, grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0());
            	        
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2013:1: ( (lv_arguments_6_0= RULE_ID ) )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2014:1: (lv_arguments_6_0= RULE_ID )
            	    {
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2014:1: (lv_arguments_6_0= RULE_ID )
            	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2015:3: lv_arguments_6_0= RULE_ID
            	    {
            	    lv_arguments_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleATGCDefinition4332); 

            	    			newLeafNode(lv_arguments_6_0, grammarAccess.getATGCDefinitionAccess().getArgumentsIDTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getATGCDefinitionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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


    // $ANTLR start "entryRulePropertyDefinition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2039:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2040:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2041:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition4375);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition4385); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2048:1: rulePropertyDefinition returns [EObject current=null] : (this_PropertyStatement_0= rulePropertyStatement | this_VerificationStatement_1= ruleVerificationStatement ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyStatement_0 = null;

        EObject this_VerificationStatement_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2051:28: ( (this_PropertyStatement_0= rulePropertyStatement | this_VerificationStatement_1= ruleVerificationStatement ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2052:1: (this_PropertyStatement_0= rulePropertyStatement | this_VerificationStatement_1= ruleVerificationStatement )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2052:1: (this_PropertyStatement_0= rulePropertyStatement | this_VerificationStatement_1= ruleVerificationStatement )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            else if ( (LA40_0==42||LA40_0==45) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2053:5: this_PropertyStatement_0= rulePropertyStatement
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePropertyStatement_in_rulePropertyDefinition4432);
                    this_PropertyStatement_0=rulePropertyStatement();

                    state._fsp--;

                     
                            current = this_PropertyStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2063:5: this_VerificationStatement_1= ruleVerificationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getVerificationStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVerificationStatement_in_rulePropertyDefinition4459);
                    this_VerificationStatement_1=ruleVerificationStatement();

                    state._fsp--;

                     
                            current = this_VerificationStatement_1; 
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePropertyStatement"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2079:1: entryRulePropertyStatement returns [EObject current=null] : iv_rulePropertyStatement= rulePropertyStatement EOF ;
    public final EObject entryRulePropertyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyStatement = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2080:2: (iv_rulePropertyStatement= rulePropertyStatement EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2081:2: iv_rulePropertyStatement= rulePropertyStatement EOF
            {
             newCompositeNode(grammarAccess.getPropertyStatementRule()); 
            pushFollow(FOLLOW_rulePropertyStatement_in_entryRulePropertyStatement4494);
            iv_rulePropertyStatement=rulePropertyStatement();

            state._fsp--;

             current =iv_rulePropertyStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyStatement4504); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyStatement"


    // $ANTLR start "rulePropertyStatement"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2088:1: rulePropertyStatement returns [EObject current=null] : ( () otherlv_1= 'PROPERTY' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_STRING ) ) ) ;
    public final EObject rulePropertyStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_arguments_4_0=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2091:28: ( ( () otherlv_1= 'PROPERTY' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_STRING ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2092:1: ( () otherlv_1= 'PROPERTY' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_STRING ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2092:1: ( () otherlv_1= 'PROPERTY' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_STRING ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2092:2: () otherlv_1= 'PROPERTY' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_arguments_4_0= RULE_STRING ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2092:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2093:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyStatementAccess().getPropertyStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_rulePropertyStatement4550); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyStatementAccess().getPROPERTYKeyword_1());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2102:1: ( (lv_name_2_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2103:1: (lv_name_2_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2103:1: (lv_name_2_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2104:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyStatement4567); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPropertyStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePropertyStatement4584); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyStatementAccess().getColonKeyword_3());
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2124:1: ( (lv_arguments_4_0= RULE_STRING ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2125:1: (lv_arguments_4_0= RULE_STRING )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2125:1: (lv_arguments_4_0= RULE_STRING )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2126:3: lv_arguments_4_0= RULE_STRING
            {
            lv_arguments_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyStatement4601); 

            			newLeafNode(lv_arguments_4_0, grammarAccess.getPropertyStatementAccess().getArgumentsSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arguments",
                    		lv_arguments_4_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "rulePropertyStatement"


    // $ANTLR start "entryRuleVerificationStatement"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2150:1: entryRuleVerificationStatement returns [EObject current=null] : iv_ruleVerificationStatement= ruleVerificationStatement EOF ;
    public final EObject entryRuleVerificationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationStatement = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2151:2: (iv_ruleVerificationStatement= ruleVerificationStatement EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2152:2: iv_ruleVerificationStatement= ruleVerificationStatement EOF
            {
             newCompositeNode(grammarAccess.getVerificationStatementRule()); 
            pushFollow(FOLLOW_ruleVerificationStatement_in_entryRuleVerificationStatement4642);
            iv_ruleVerificationStatement=ruleVerificationStatement();

            state._fsp--;

             current =iv_ruleVerificationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationStatement4652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationStatement"


    // $ANTLR start "ruleVerificationStatement"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2159:1: ruleVerificationStatement returns [EObject current=null] : ( ( () otherlv_1= 'VERIFY' (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) ) | (otherlv_8= 'EXPECTED' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= 'AT TIME INSTANT' ( (lv_time_11_0= ruleREAL ) ) otherlv_12= 'IS' ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' ) ) ) ;
    public final EObject ruleVerificationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject lv_property_3_0 = null;

        EObject lv_property_5_0 = null;

        EObject lv_condition_7_0 = null;

        AntlrDatatypeRuleToken lv_time_11_0 = null;

        AntlrDatatypeRuleToken lv_operator_13_0 = null;

        EObject lv_concentration_14_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2162:28: ( ( ( () otherlv_1= 'VERIFY' (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) ) | (otherlv_8= 'EXPECTED' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= 'AT TIME INSTANT' ( (lv_time_11_0= ruleREAL ) ) otherlv_12= 'IS' ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2163:1: ( ( () otherlv_1= 'VERIFY' (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) ) | (otherlv_8= 'EXPECTED' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= 'AT TIME INSTANT' ( (lv_time_11_0= ruleREAL ) ) otherlv_12= 'IS' ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2163:1: ( ( () otherlv_1= 'VERIFY' (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) ) | (otherlv_8= 'EXPECTED' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= 'AT TIME INSTANT' ( (lv_time_11_0= ruleREAL ) ) otherlv_12= 'IS' ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            else if ( (LA43_0==45) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2163:2: ( () otherlv_1= 'VERIFY' (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2163:2: ( () otherlv_1= 'VERIFY' (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2163:3: () otherlv_1= 'VERIFY' (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2163:3: ()
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2164:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVerificationStatementAccess().getVerificationStatementAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleVerificationStatement4699); 

                        	newLeafNode(otherlv_1, grammarAccess.getVerificationStatementAccess().getVERIFYKeyword_0_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2173:1: (otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2173:3: otherlv_2= '[' ( (lv_property_3_0= ruleProperty ) ) ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ']' ( (lv_condition_7_0= rulePropertyCondition ) )
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleVerificationStatement4712); 

                        	newLeafNode(otherlv_2, grammarAccess.getVerificationStatementAccess().getLeftSquareBracketKeyword_0_2_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2177:1: ( (lv_property_3_0= ruleProperty ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2178:1: (lv_property_3_0= ruleProperty )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2178:1: (lv_property_3_0= ruleProperty )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2179:3: lv_property_3_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationStatementAccess().getPropertyPropertyParserRuleCall_0_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProperty_in_ruleVerificationStatement4733);
                    lv_property_3_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"property",
                            		lv_property_3_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2195:2: ( rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==34||LA41_0==51) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2196:5: rulePropertyLogicalOperator ( (lv_property_5_0= ruleProperty ) )
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getVerificationStatementAccess().getPropertyLogicalOperatorParserRuleCall_0_2_2_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulePropertyLogicalOperator_in_ruleVerificationStatement4750);
                    	    rulePropertyLogicalOperator();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2203:1: ( (lv_property_5_0= ruleProperty ) )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2204:1: (lv_property_5_0= ruleProperty )
                    	    {
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2204:1: (lv_property_5_0= ruleProperty )
                    	    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2205:3: lv_property_5_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVerificationStatementAccess().getPropertyPropertyParserRuleCall_0_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleVerificationStatement4770);
                    	    lv_property_5_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVerificationStatementRule());
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleVerificationStatement4784); 

                        	newLeafNode(otherlv_6, grammarAccess.getVerificationStatementAccess().getRightSquareBracketKeyword_0_2_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2225:1: ( (lv_condition_7_0= rulePropertyCondition ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2226:1: (lv_condition_7_0= rulePropertyCondition )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2226:1: (lv_condition_7_0= rulePropertyCondition )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2227:3: lv_condition_7_0= rulePropertyCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationStatementAccess().getConditionPropertyConditionParserRuleCall_0_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyCondition_in_ruleVerificationStatement4805);
                    lv_condition_7_0=rulePropertyCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationStatementRule());
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


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2244:6: (otherlv_8= 'EXPECTED' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= 'AT TIME INSTANT' ( (lv_time_11_0= ruleREAL ) ) otherlv_12= 'IS' ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' ) )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2244:6: (otherlv_8= 'EXPECTED' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= 'AT TIME INSTANT' ( (lv_time_11_0= ruleREAL ) ) otherlv_12= 'IS' ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2244:8: otherlv_8= 'EXPECTED' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= 'AT TIME INSTANT' ( (lv_time_11_0= ruleREAL ) ) otherlv_12= 'IS' ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleVerificationStatement4826); 

                        	newLeafNode(otherlv_8, grammarAccess.getVerificationStatementAccess().getEXPECTEDKeyword_1_0());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2248:1: ( (lv_name_9_0= RULE_ID ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2249:1: (lv_name_9_0= RULE_ID )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2249:1: (lv_name_9_0= RULE_ID )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2250:3: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationStatement4843); 

                    			newLeafNode(lv_name_9_0, grammarAccess.getVerificationStatementAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_9_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,46,FOLLOW_46_in_ruleVerificationStatement4860); 

                        	newLeafNode(otherlv_10, grammarAccess.getVerificationStatementAccess().getATTIMEINSTANTKeyword_1_2());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2270:1: ( (lv_time_11_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2271:1: (lv_time_11_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2271:1: (lv_time_11_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2272:3: lv_time_11_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationStatementAccess().getTimeREALParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_ruleVerificationStatement4881);
                    lv_time_11_0=ruleREAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"time",
                            		lv_time_11_0, 
                            		"REAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,47,FOLLOW_47_in_ruleVerificationStatement4893); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerificationStatementAccess().getISKeyword_1_4());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2292:1: ( ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) ) | otherlv_15= '?' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=25 && LA42_0<=27)||(LA42_0>=49 && LA42_0<=50)) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==48) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2292:2: ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2292:2: ( ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2292:3: ( (lv_operator_13_0= rulePropertyRelationalOperator ) ) ( (lv_concentration_14_0= ruleQuantity ) )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2292:3: ( (lv_operator_13_0= rulePropertyRelationalOperator ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2293:1: (lv_operator_13_0= rulePropertyRelationalOperator )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2293:1: (lv_operator_13_0= rulePropertyRelationalOperator )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2294:3: lv_operator_13_0= rulePropertyRelationalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getVerificationStatementAccess().getOperatorPropertyRelationalOperatorParserRuleCall_1_5_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePropertyRelationalOperator_in_ruleVerificationStatement4916);
                            lv_operator_13_0=rulePropertyRelationalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVerificationStatementRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"operator",
                                    		lv_operator_13_0, 
                                    		"PropertyRelationalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2310:2: ( (lv_concentration_14_0= ruleQuantity ) )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2311:1: (lv_concentration_14_0= ruleQuantity )
                            {
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2311:1: (lv_concentration_14_0= ruleQuantity )
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2312:3: lv_concentration_14_0= ruleQuantity
                            {
                             
                            	        newCompositeNode(grammarAccess.getVerificationStatementAccess().getConcentrationQuantityParserRuleCall_1_5_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQuantity_in_ruleVerificationStatement4937);
                            lv_concentration_14_0=ruleQuantity();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVerificationStatementRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"concentration",
                                    		lv_concentration_14_0, 
                                    		"Quantity");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2329:7: otherlv_15= '?'
                            {
                            otherlv_15=(Token)match(input,48,FOLLOW_48_in_ruleVerificationStatement4956); 

                                	newLeafNode(otherlv_15, grammarAccess.getVerificationStatementAccess().getQuestionMarkKeyword_1_5_1());
                                

                            }
                            break;

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
    // $ANTLR end "ruleVerificationStatement"


    // $ANTLR start "entryRuleProperty"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2341:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2342:2: (iv_ruleProperty= ruleProperty EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2343:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty4994);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty5004); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2350:1: ruleProperty returns [EObject current=null] : ( () ( (lv_lhs_1_0= RULE_ID ) ) ( (lv_operator_2_0= rulePropertyOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_lhs_1_0=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2353:28: ( ( () ( (lv_lhs_1_0= RULE_ID ) ) ( (lv_operator_2_0= rulePropertyOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2354:1: ( () ( (lv_lhs_1_0= RULE_ID ) ) ( (lv_operator_2_0= rulePropertyOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2354:1: ( () ( (lv_lhs_1_0= RULE_ID ) ) ( (lv_operator_2_0= rulePropertyOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2354:2: () ( (lv_lhs_1_0= RULE_ID ) ) ( (lv_operator_2_0= rulePropertyOperator ) ) ( (lv_rhs_3_0= ruleQuantity ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2354:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2355:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2360:2: ( (lv_lhs_1_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2361:1: (lv_lhs_1_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2361:1: (lv_lhs_1_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2362:3: lv_lhs_1_0= RULE_ID
            {
            lv_lhs_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty5055); 

            			newLeafNode(lv_lhs_1_0, grammarAccess.getPropertyAccess().getLhsIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"ID");
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2378:2: ( (lv_operator_2_0= rulePropertyOperator ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2379:1: (lv_operator_2_0= rulePropertyOperator )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2379:1: (lv_operator_2_0= rulePropertyOperator )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2380:3: lv_operator_2_0= rulePropertyOperator
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getOperatorPropertyOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyOperator_in_ruleProperty5081);
            lv_operator_2_0=rulePropertyOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"PropertyOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2396:2: ( (lv_rhs_3_0= ruleQuantity ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2397:1: (lv_rhs_3_0= ruleQuantity )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2397:1: (lv_rhs_3_0= ruleQuantity )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2398:3: lv_rhs_3_0= ruleQuantity
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getRhsQuantityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantity_in_ruleProperty5102);
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


    // $ANTLR start "entryRulePropertyOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2422:1: entryRulePropertyOperator returns [String current=null] : iv_rulePropertyOperator= rulePropertyOperator EOF ;
    public final String entryRulePropertyOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2423:2: (iv_rulePropertyOperator= rulePropertyOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2424:2: iv_rulePropertyOperator= rulePropertyOperator EOF
            {
             newCompositeNode(grammarAccess.getPropertyOperatorRule()); 
            pushFollow(FOLLOW_rulePropertyOperator_in_entryRulePropertyOperator5139);
            iv_rulePropertyOperator=rulePropertyOperator();

            state._fsp--;

             current =iv_rulePropertyOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyOperator5150); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyOperator"


    // $ANTLR start "rulePropertyOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2431:1: rulePropertyOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken rulePropertyOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2434:28: ( (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2435:1: (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2435:1: (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' )
            int alt44=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt44=1;
                }
                break;
            case 26:
                {
                alt44=2;
                }
                break;
            case 27:
                {
                alt44=3;
                }
                break;
            case 49:
                {
                alt44=4;
                }
                break;
            case 50:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2436:2: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulePropertyOperator5188); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyOperatorAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2443:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulePropertyOperator5207); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyOperatorAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2450:2: kw= '='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulePropertyOperator5226); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyOperatorAccess().getEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2457:2: kw= '<='
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_rulePropertyOperator5245); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2464:2: kw= '>='
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_rulePropertyOperator5264); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                        

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
    // $ANTLR end "rulePropertyOperator"


    // $ANTLR start "entryRulePropertyLogicalOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2477:1: entryRulePropertyLogicalOperator returns [String current=null] : iv_rulePropertyLogicalOperator= rulePropertyLogicalOperator EOF ;
    public final String entryRulePropertyLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyLogicalOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2478:2: (iv_rulePropertyLogicalOperator= rulePropertyLogicalOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2479:2: iv_rulePropertyLogicalOperator= rulePropertyLogicalOperator EOF
            {
             newCompositeNode(grammarAccess.getPropertyLogicalOperatorRule()); 
            pushFollow(FOLLOW_rulePropertyLogicalOperator_in_entryRulePropertyLogicalOperator5305);
            iv_rulePropertyLogicalOperator=rulePropertyLogicalOperator();

            state._fsp--;

             current =iv_rulePropertyLogicalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyLogicalOperator5316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyLogicalOperator"


    // $ANTLR start "rulePropertyLogicalOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2486:1: rulePropertyLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulePropertyLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2489:28: ( (kw= '&' | kw= '|' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2490:1: (kw= '&' | kw= '|' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2490:1: (kw= '&' | kw= '|' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            else if ( (LA45_0==34) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2491:2: kw= '&'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_rulePropertyLogicalOperator5354); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyLogicalOperatorAccess().getAmpersandKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2498:2: kw= '|'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulePropertyLogicalOperator5373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyLogicalOperatorAccess().getVerticalLineKeyword_1()); 
                        

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
    // $ANTLR end "rulePropertyLogicalOperator"


    // $ANTLR start "entryRulePropertyCondition"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2511:1: entryRulePropertyCondition returns [EObject current=null] : iv_rulePropertyCondition= rulePropertyCondition EOF ;
    public final EObject entryRulePropertyCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCondition = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2512:2: (iv_rulePropertyCondition= rulePropertyCondition EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2513:2: iv_rulePropertyCondition= rulePropertyCondition EOF
            {
             newCompositeNode(grammarAccess.getPropertyConditionRule()); 
            pushFollow(FOLLOW_rulePropertyCondition_in_entryRulePropertyCondition5413);
            iv_rulePropertyCondition=rulePropertyCondition();

            state._fsp--;

             current =iv_rulePropertyCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCondition5423); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2520:1: rulePropertyCondition returns [EObject current=null] : ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' ) (otherlv_4= 'WITHIN TIME BOUND' otherlv_5= '[' ( (lv_lowerBound_6_0= ruleREAL ) ) otherlv_7= ',' ( (lv_upperBounds_8_0= ruleREAL ) ) otherlv_9= ']' (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )? )? ) ;
    public final EObject rulePropertyCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_lowerBound_6_0 = null;

        AntlrDatatypeRuleToken lv_upperBounds_8_0 = null;

        AntlrDatatypeRuleToken lv_operator_11_0 = null;

        AntlrDatatypeRuleToken lv_probability_12_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2523:28: ( ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' ) (otherlv_4= 'WITHIN TIME BOUND' otherlv_5= '[' ( (lv_lowerBound_6_0= ruleREAL ) ) otherlv_7= ',' ( (lv_upperBounds_8_0= ruleREAL ) ) otherlv_9= ']' (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )? )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2524:1: ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' ) (otherlv_4= 'WITHIN TIME BOUND' otherlv_5= '[' ( (lv_lowerBound_6_0= ruleREAL ) ) otherlv_7= ',' ( (lv_upperBounds_8_0= ruleREAL ) ) otherlv_9= ']' (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )? )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2524:1: ( () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' ) (otherlv_4= 'WITHIN TIME BOUND' otherlv_5= '[' ( (lv_lowerBound_6_0= ruleREAL ) ) otherlv_7= ',' ( (lv_upperBounds_8_0= ruleREAL ) ) otherlv_9= ']' (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )? )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2524:2: () (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' ) (otherlv_4= 'WITHIN TIME BOUND' otherlv_5= '[' ( (lv_lowerBound_6_0= ruleREAL ) ) otherlv_7= ',' ( (lv_upperBounds_8_0= ruleREAL ) ) otherlv_9= ']' (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )? )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2524:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2525:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyConditionAccess().getPropertyConditionAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2530:2: (otherlv_1= 'WILL HOLD' | otherlv_2= 'NEVER HOLDS' | otherlv_3= 'ALWAYS HOLDS' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt46=1;
                }
                break;
            case 53:
                {
                alt46=2;
                }
                break;
            case 54:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2530:4: otherlv_1= 'WILL HOLD'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_rulePropertyCondition5470); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyConditionAccess().getWILLHOLDKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2535:7: otherlv_2= 'NEVER HOLDS'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_rulePropertyCondition5488); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyConditionAccess().getNEVERHOLDSKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2540:7: otherlv_3= 'ALWAYS HOLDS'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_rulePropertyCondition5506); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyConditionAccess().getALWAYSHOLDSKeyword_1_2());
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2544:2: (otherlv_4= 'WITHIN TIME BOUND' otherlv_5= '[' ( (lv_lowerBound_6_0= ruleREAL ) ) otherlv_7= ',' ( (lv_upperBounds_8_0= ruleREAL ) ) otherlv_9= ']' (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2544:4: otherlv_4= 'WITHIN TIME BOUND' otherlv_5= '[' ( (lv_lowerBound_6_0= ruleREAL ) ) otherlv_7= ',' ( (lv_upperBounds_8_0= ruleREAL ) ) otherlv_9= ']' (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )?
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_rulePropertyCondition5520); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyConditionAccess().getWITHINTIMEBOUNDKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_rulePropertyCondition5532); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertyConditionAccess().getLeftSquareBracketKeyword_2_1());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2552:1: ( (lv_lowerBound_6_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2553:1: (lv_lowerBound_6_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2553:1: (lv_lowerBound_6_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2554:3: lv_lowerBound_6_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getLowerBoundREALParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_rulePropertyCondition5553);
                    lv_lowerBound_6_0=ruleREAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_6_0, 
                            		"REAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_rulePropertyCondition5565); 

                        	newLeafNode(otherlv_7, grammarAccess.getPropertyConditionAccess().getCommaKeyword_2_3());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2574:1: ( (lv_upperBounds_8_0= ruleREAL ) )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2575:1: (lv_upperBounds_8_0= ruleREAL )
                    {
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2575:1: (lv_upperBounds_8_0= ruleREAL )
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2576:3: lv_upperBounds_8_0= ruleREAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getUpperBoundsREALParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleREAL_in_rulePropertyCondition5586);
                    lv_upperBounds_8_0=ruleREAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBounds",
                            		lv_upperBounds_8_0, 
                            		"REAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,44,FOLLOW_44_in_rulePropertyCondition5598); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyConditionAccess().getRightSquareBracketKeyword_2_5());
                        
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2596:1: (otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==56) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2596:3: otherlv_10= 'WITH PROBABILITY BOUND' ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' )
                            {
                            otherlv_10=(Token)match(input,56,FOLLOW_56_in_rulePropertyCondition5611); 

                                	newLeafNode(otherlv_10, grammarAccess.getPropertyConditionAccess().getWITHPROBABILITYBOUNDKeyword_2_6_0());
                                
                            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2600:1: ( ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) ) | otherlv_13= '?' )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( ((LA47_0>=25 && LA47_0<=27)||(LA47_0>=49 && LA47_0<=50)) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==48) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2600:2: ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2600:2: ( ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2600:3: ( (lv_operator_11_0= rulePropertyRelationalOperator ) ) ( (lv_probability_12_0= ruleREAL ) )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2600:3: ( (lv_operator_11_0= rulePropertyRelationalOperator ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2601:1: (lv_operator_11_0= rulePropertyRelationalOperator )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2601:1: (lv_operator_11_0= rulePropertyRelationalOperator )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2602:3: lv_operator_11_0= rulePropertyRelationalOperator
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getOperatorPropertyRelationalOperatorParserRuleCall_2_6_1_0_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_rulePropertyRelationalOperator_in_rulePropertyCondition5634);
                                    lv_operator_11_0=rulePropertyRelationalOperator();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"operator",
                                            		lv_operator_11_0, 
                                            		"PropertyRelationalOperator");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2618:2: ( (lv_probability_12_0= ruleREAL ) )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2619:1: (lv_probability_12_0= ruleREAL )
                                    {
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2619:1: (lv_probability_12_0= ruleREAL )
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2620:3: lv_probability_12_0= ruleREAL
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getPropertyConditionAccess().getProbabilityREALParserRuleCall_2_6_1_0_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleREAL_in_rulePropertyCondition5655);
                                    lv_probability_12_0=ruleREAL();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getPropertyConditionRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"probability",
                                            		lv_probability_12_0, 
                                            		"REAL");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2637:7: otherlv_13= '?'
                                    {
                                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_rulePropertyCondition5674); 

                                        	newLeafNode(otherlv_13, grammarAccess.getPropertyConditionAccess().getQuestionMarkKeyword_2_6_1_1());
                                        

                                    }
                                    break;

                            }


                            }
                            break;

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
    // $ANTLR end "rulePropertyCondition"


    // $ANTLR start "entryRulePropertyRelationalOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2649:1: entryRulePropertyRelationalOperator returns [String current=null] : iv_rulePropertyRelationalOperator= rulePropertyRelationalOperator EOF ;
    public final String entryRulePropertyRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyRelationalOperator = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2650:2: (iv_rulePropertyRelationalOperator= rulePropertyRelationalOperator EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2651:2: iv_rulePropertyRelationalOperator= rulePropertyRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getPropertyRelationalOperatorRule()); 
            pushFollow(FOLLOW_rulePropertyRelationalOperator_in_entryRulePropertyRelationalOperator5716);
            iv_rulePropertyRelationalOperator=rulePropertyRelationalOperator();

            state._fsp--;

             current =iv_rulePropertyRelationalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyRelationalOperator5727); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyRelationalOperator"


    // $ANTLR start "rulePropertyRelationalOperator"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2658:1: rulePropertyRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken rulePropertyRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2661:28: ( (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2662:1: (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2662:1: (kw= '<' | kw= '>' | kw= '=' | kw= '<=' | kw= '>=' )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt50=1;
                }
                break;
            case 26:
                {
                alt50=2;
                }
                break;
            case 27:
                {
                alt50=3;
                }
                break;
            case 49:
                {
                alt50=4;
                }
                break;
            case 50:
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2663:2: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulePropertyRelationalOperator5765); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyRelationalOperatorAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2670:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulePropertyRelationalOperator5784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyRelationalOperatorAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2677:2: kw= '='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulePropertyRelationalOperator5803); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyRelationalOperatorAccess().getEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2684:2: kw= '<='
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_rulePropertyRelationalOperator5822); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2691:2: kw= '>='
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_rulePropertyRelationalOperator5841); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                        

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
    // $ANTLR end "rulePropertyRelationalOperator"


    // $ANTLR start "entryRuleQuantity"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2704:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2705:2: (iv_ruleQuantity= ruleQuantity EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2706:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_ruleQuantity_in_entryRuleQuantity5881);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantity5891); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2713:1: ruleQuantity returns [EObject current=null] : ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_units_2_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2716:28: ( ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= RULE_ID ) ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2717:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= RULE_ID ) ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2717:1: ( () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= RULE_ID ) ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2717:2: () ( (lv_value_1_0= ruleREAL ) ) ( (lv_units_2_0= RULE_ID ) )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2717:2: ()
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2718:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityAccess().getQuantityAction_0(),
                        current);
                

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2723:2: ( (lv_value_1_0= ruleREAL ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2724:1: (lv_value_1_0= ruleREAL )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2724:1: (lv_value_1_0= ruleREAL )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2725:3: lv_value_1_0= ruleREAL
            {
             
            	        newCompositeNode(grammarAccess.getQuantityAccess().getValueREALParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleREAL_in_ruleQuantity5946);
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

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2741:2: ( (lv_units_2_0= RULE_ID ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2742:1: (lv_units_2_0= RULE_ID )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2742:1: (lv_units_2_0= RULE_ID )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2743:3: lv_units_2_0= RULE_ID
            {
            lv_units_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuantity5963); 

            			newLeafNode(lv_units_2_0, grammarAccess.getQuantityAccess().getUnitsIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuantityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"units",
                    		lv_units_2_0, 
                    		"ID");
            	    

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


    // $ANTLR start "entryRuleREAL"
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2767:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2768:2: (iv_ruleREAL= ruleREAL EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2769:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL6005);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL6016); 

            }

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2776:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decimal_0 = null;

        AntlrDatatypeRuleToken this_DecimalExp_1 = null;


         enterRule(); 
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2779:28: ( (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2780:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2780:1: (this_Decimal_0= ruleDecimal | this_DecimalExp_1= ruleDecimalExp )
            int alt51=2;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        int LA51_4 = input.LA(4);

                        if ( (LA51_4==RULE_INT) ) {
                            int LA51_7 = input.LA(5);

                            if ( ((LA51_7>=57 && LA51_7<=58)) ) {
                                alt51=2;
                            }
                            else if ( (LA51_7==EOF||LA51_7==RULE_ID||LA51_7==RULE_INT||LA51_7==13||LA51_7==16||(LA51_7>=18 && LA51_7<=19)||(LA51_7>=27 && LA51_7<=35)||(LA51_7>=38 && LA51_7<=42)||(LA51_7>=44 && LA51_7<=45)||LA51_7==47) ) {
                                alt51=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA51_4==RULE_ID) ) {
                            alt51=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 57:
                    case 58:
                        {
                        alt51=2;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_INT:
                    case 16:
                    case 18:
                    case 19:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 44:
                    case 45:
                    case 47:
                        {
                        alt51=1;
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
            case 33:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        int LA51_4 = input.LA(4);

                        if ( (LA51_4==RULE_INT) ) {
                            int LA51_7 = input.LA(5);

                            if ( ((LA51_7>=57 && LA51_7<=58)) ) {
                                alt51=2;
                            }
                            else if ( (LA51_7==EOF||LA51_7==RULE_ID||LA51_7==RULE_INT||LA51_7==13||LA51_7==16||(LA51_7>=18 && LA51_7<=19)||(LA51_7>=27 && LA51_7<=35)||(LA51_7>=38 && LA51_7<=42)||(LA51_7>=44 && LA51_7<=45)||LA51_7==47) ) {
                                alt51=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA51_4==RULE_ID) ) {
                            alt51=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 57:
                    case 58:
                        {
                        alt51=2;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_INT:
                    case 16:
                    case 18:
                    case 19:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 44:
                    case 45:
                    case 47:
                        {
                        alt51=1;
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
                case 13:
                    {
                    int LA51_4 = input.LA(3);

                    if ( (LA51_4==RULE_INT) ) {
                        int LA51_7 = input.LA(4);

                        if ( ((LA51_7>=57 && LA51_7<=58)) ) {
                            alt51=2;
                        }
                        else if ( (LA51_7==EOF||LA51_7==RULE_ID||LA51_7==RULE_INT||LA51_7==13||LA51_7==16||(LA51_7>=18 && LA51_7<=19)||(LA51_7>=27 && LA51_7<=35)||(LA51_7>=38 && LA51_7<=42)||(LA51_7>=44 && LA51_7<=45)||LA51_7==47) ) {
                            alt51=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA51_4==RULE_ID) ) {
                        alt51=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 57:
                case 58:
                    {
                    alt51=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case 16:
                case 18:
                case 19:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 44:
                case 45:
                case 47:
                    {
                    alt51=1;
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
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2781:5: this_Decimal_0= ruleDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecimal_in_ruleREAL6063);
                    this_Decimal_0=ruleDecimal();

                    state._fsp--;


                    		current.merge(this_Decimal_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2793:5: this_DecimalExp_1= ruleDecimalExp
                    {
                     
                            newCompositeNode(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDecimalExp_in_ruleREAL6096);
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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2811:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2815:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2816:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal6148);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal6159); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2826:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2830:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2831:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2831:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2831:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )?
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2831:2: (kw= '+' | kw= '-' )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==32) ) {
                alt52=1;
            }
            else if ( (LA52_0==33) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2832:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleDecimal6202); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2839:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleDecimal6221); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal6238); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2851:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==13) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_INT) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2852:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleDecimal6257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimal6272); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2875:1: entryRuleDecimalExp returns [String current=null] : iv_ruleDecimalExp= ruleDecimalExp EOF ;
    public final String entryRuleDecimalExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimalExp = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2879:2: (iv_ruleDecimalExp= ruleDecimalExp EOF )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2880:2: iv_ruleDecimalExp= ruleDecimalExp EOF
            {
             newCompositeNode(grammarAccess.getDecimalExpRule()); 
            pushFollow(FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp6330);
            iv_ruleDecimalExp=ruleDecimalExp();

            state._fsp--;

             current =iv_ruleDecimalExp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalExp6341); 

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
    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2890:1: ruleDecimalExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimalExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_9=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2894:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT ) )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2895:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2895:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT )
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2895:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT (kw= '.' this_INT_4= RULE_INT )? (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_9= RULE_INT
            {
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2895:2: (kw= '+' | kw= '-' )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==32) ) {
                alt54=1;
            }
            else if ( (LA54_0==33) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2896:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleDecimalExp6384); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2903:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleDecimalExp6403); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp6420); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 
                
            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2915:1: (kw= '.' this_INT_4= RULE_INT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==13) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2916:2: kw= '.' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleDecimalExp6439); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp6454); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2928:3: (kw= 'E' | kw= 'e' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==57) ) {
                alt56=1;
            }
            else if ( (LA56_0==58) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2929:2: kw= 'E'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleDecimalExp6475); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2936:2: kw= 'e'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleDecimalExp6494); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2941:2: (kw= '+' | kw= '-' )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==32) ) {
                alt57=1;
            }
            else if ( (LA57_0==33) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2942:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleDecimalExp6509); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl/src-gen/roadblock/xtext/ibl/parser/antlr/internal/InternalIbl.g:2949:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleDecimalExp6528); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 
                        

                    }
                    break;

            }

            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalExp6545); 

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

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA24_eotS =
        "\20\uffff";
    static final String DFA24_eofS =
        "\1\1\4\uffff\1\4\4\uffff\2\4\2\uffff\1\4\1\uffff";
    static final String DFA24_minS =
        "\1\4\1\uffff\2\4\1\uffff\3\4\2\6\2\4\2\6\2\4";
    static final String DFA24_maxS =
        "\1\55\1\uffff\2\41\1\uffff\1\72\1\6\1\4\2\41\1\72\1\55\2\6\1\55"+
        "\1\4";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\13\uffff";
    static final String DFA24_specialS =
        "\20\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\uffff\1\1\11\uffff\1\1\1\uffff\2\1\10\uffff\3\1\1\uffff"+
            "\1\2\1\3\1\4\1\1\3\uffff\4\1\2\uffff\1\1",
            "",
            "\1\4\1\uffff\1\5\31\uffff\2\4",
            "\1\4\1\uffff\1\5\31\uffff\2\4",
            "",
            "\1\4\1\uffff\1\4\6\uffff\1\6\2\uffff\1\4\1\uffff\2\4\7\uffff"+
            "\1\1\3\4\1\7\4\4\3\uffff\4\4\2\uffff\1\4\13\uffff\1\10\1\11",
            "\1\13\1\uffff\1\12",
            "\1\13",
            "\1\16\31\uffff\1\14\1\15",
            "\1\16\31\uffff\1\14\1\15",
            "\1\4\1\uffff\1\4\6\uffff\1\17\2\uffff\1\4\1\uffff\2\4\7\uffff"+
            "\1\1\3\4\1\7\4\4\3\uffff\4\4\2\uffff\1\4\13\uffff\1\10\1\11",
            "\1\4\1\uffff\1\4\11\uffff\1\4\1\uffff\2\4\7\uffff\1\1\3\4\1"+
            "\uffff\4\4\3\uffff\4\4\2\uffff\1\4",
            "\1\16",
            "\1\16",
            "\1\4\1\uffff\1\4\6\uffff\1\17\2\uffff\1\4\1\uffff\2\4\7\uffff"+
            "\1\1\3\4\1\7\4\4\3\uffff\4\4\2\uffff\1\4",
            "\1\13"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 1324:2: ( ruleVariableExpressionOperator ( (lv_members_3_0= ruleVariableAttribute ) ) )*";
        }
    }
    static final String DFA30_eotS =
        "\14\uffff";
    static final String DFA30_eofS =
        "\1\2\1\5\6\uffff\1\5\3\uffff";
    static final String DFA30_minS =
        "\2\4\1\uffff\2\4\1\uffff\6\4";
    static final String DFA30_maxS =
        "\2\55\1\uffff\1\55\1\4\1\uffff\1\55\1\41\1\55\1\41\2\55";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\6\uffff";
    static final String DFA30_specialS =
        "\14\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\1\uffff\1\2\11\uffff\1\2\13\uffff\3\2\1\uffff\2\2\1\uffff"+
            "\1\2\3\uffff\4\2\2\uffff\1\2",
            "\1\3\1\uffff\1\5\6\uffff\1\2\2\uffff\1\5\12\uffff\1\2\3\5\1"+
            "\4\2\5\1\uffff\1\5\3\uffff\4\5\2\uffff\1\5",
            "",
            "\1\6\1\uffff\1\2\6\uffff\1\5\2\uffff\1\2\12\uffff\1\7\3\2\1"+
            "\5\2\2\1\uffff\1\2\3\uffff\4\2\2\uffff\1\2",
            "\1\10",
            "",
            "\1\3\1\uffff\1\5\6\uffff\1\2\2\uffff\1\5\12\uffff\1\11\3\5"+
            "\1\2\2\5\1\uffff\1\5\3\uffff\4\5\2\uffff\1\5",
            "\1\12\1\uffff\1\5\31\uffff\2\5",
            "\1\5\1\uffff\1\5\11\uffff\1\5\12\uffff\1\2\6\5\1\uffff\1\5"+
            "\3\uffff\4\5\2\uffff\1\5",
            "\1\13\1\uffff\1\2\31\uffff\2\2",
            "\1\5\1\uffff\1\5\6\uffff\1\5\2\uffff\1\5\1\2\12\uffff\10\5"+
            "\3\uffff\4\5\2\uffff\1\5",
            "\1\2\1\uffff\1\2\6\uffff\1\2\2\uffff\1\2\1\5\12\uffff\10\2"+
            "\3\uffff\4\2\2\uffff\1\2"
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
            return "1493:2: ( ( (lv_rhs_9_0= ruleRuleObject ) ) (otherlv_10= '+' ( (lv_rhs_11_0= ruleRuleObject ) ) )* )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_ruleModel140 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleModelMember_in_entryRuleModelMember177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMember187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModelMember234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleModelMember261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleModelMember288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard495 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildcard514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName608 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName642 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinition745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition785 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition802 = new BitSet(new long[]{0x0000000070010010L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_ruleVariableDefinition823 = new BitSet(new long[]{0x0000000070010010L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinition836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDefinition945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDefinition968 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDefinition985 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition1007 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDefinition1020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_ruleFunctionDefinition1041 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionDefinition1057 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition1069 = new BitSet(new long[]{0x0000278B70010050L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_ruleFunctionDefinition1090 = new BitSet(new long[]{0x0000278B70010050L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition1103 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFunctionDefinition1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition1137 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDefinition1150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_ruleFunctionDefinition1171 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionParameterMember1263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionParameterMember1285 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionParameterMember1302 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_ruleParameterScope_in_ruleFunctionParameterMember1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_entryRuleParameterScope1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterScope1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleParameterScope1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameterScope1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterScope1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinitionMember1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_ruleFunctionDefinitionMember1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_ruleFunctionDefinitionMember1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleFunctionDefinitionMember1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFunctionDefinitionMember1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_ruleFunctionDefinitionMember1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleFunctionDefinitionMember1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUseMember1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionUseMember1766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionUseMember1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionMember1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_ruleVariableDeclaration1984 = new BitSet(new long[]{0x0000000070000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2026 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_ruleVariableDeclaration2060 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariableDeclaration2072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2089 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVariableDeclaration2106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2123 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleVariableDeclaration2143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2160 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration2177 = new BitSet(new long[]{0x0000000300080050L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleVariableDeclaration2199 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration2212 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleVariableDeclaration2233 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleVariableDeclaration2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier2288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVariableQualifier2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID2376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCollectionID2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCollectionID2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableAssignment2549 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVariableAssignment2561 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_ruleVariableAssignment2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAttribute2681 = new BitSet(new long[]{0x0000000080002002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleVariableAttribute2705 = new BitSet(new long[]{0x0000000080002002L});
    public static final BitSet FOLLOW_13_in_ruleVariableAttribute2722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31_in_ruleVariableAttribute2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAttribute2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression2801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableExpression2866 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_ruleVariableExpression2883 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleVariableExpression2903 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableExpressionOperator2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableExpressionOperator3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVariableExpressionOperator3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition3069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRuleDefinition3125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleDefinition3142 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleDefinition3159 = new BitSet(new long[]{0x0000003000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition3181 = new BitSet(new long[]{0x0000003100000000L});
    public static final BitSet FOLLOW_32_in_ruleRuleDefinition3194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition3215 = new BitSet(new long[]{0x0000003100000000L});
    public static final BitSet FOLLOW_36_in_ruleRuleDefinition3232 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_37_in_ruleRuleDefinition3250 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition3273 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleRuleDefinition3286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRuleObject_in_ruleRuleDefinition3307 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject3347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleObject3408 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleRuleObject3426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleObject3443 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleProcessDeclaration_in_entryRuleProcessDeclaration3486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessDeclaration3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleProcessDeclaration3542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessDeclaration3559 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleProcessDeclaration3576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessDeclaration3593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProcessDeclaration3610 = new BitSet(new long[]{0x0000000300080050L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleProcessDeclaration3632 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleProcessDeclaration3645 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleProcessDeclaration3666 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleProcessDeclaration3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition3718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDefinition3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDeviceDefinition3774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeviceDefinition3791 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDeviceDefinition3808 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDeviceDefinition3820 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition3832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeviceDefinition3850 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition3868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeviceDefinition3885 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleDeviceDefinition3905 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeviceDefinition3917 = new BitSet(new long[]{0x0000000300080050L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleDeviceDefinition3939 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleDeviceDefinition3952 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleDeviceDefinition3973 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleDeviceDefinition3989 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeviceDefinition4001 = new BitSet(new long[]{0x000027CB70010050L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_ruleDeviceDefinition4022 = new BitSet(new long[]{0x000027CB70010050L});
    public static final BitSet FOLLOW_16_in_ruleDeviceDefinition4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceMembers_in_entryRuleDeviceMembers4071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceMembers4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessDeclaration_in_ruleDeviceMembers4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleDeviceMembers4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition4190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCDefinition4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleATGCDefinition4246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleATGCDefinition4263 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleATGCDefinition4280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleATGCDefinition4297 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleATGCDefinition4315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleATGCDefinition4332 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition4375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyStatement_in_rulePropertyDefinition4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationStatement_in_rulePropertyDefinition4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyStatement_in_entryRulePropertyStatement4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyStatement4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePropertyStatement4550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyStatement4567 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePropertyStatement4584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyStatement4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationStatement_in_entryRuleVerificationStatement4642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationStatement4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVerificationStatement4699 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleVerificationStatement4712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleVerificationStatement4733 = new BitSet(new long[]{0x0008100400000000L});
    public static final BitSet FOLLOW_rulePropertyLogicalOperator_in_ruleVerificationStatement4750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleVerificationStatement4770 = new BitSet(new long[]{0x0008100400000000L});
    public static final BitSet FOLLOW_44_in_ruleVerificationStatement4784 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_rulePropertyCondition_in_ruleVerificationStatement4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVerificationStatement4826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationStatement4843 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleVerificationStatement4860 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleVerificationStatement4881 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleVerificationStatement4893 = new BitSet(new long[]{0x000700000E000000L});
    public static final BitSet FOLLOW_rulePropertyRelationalOperator_in_ruleVerificationStatement4916 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleVerificationStatement4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVerificationStatement4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty4994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty5055 = new BitSet(new long[]{0x000600000E000000L});
    public static final BitSet FOLLOW_rulePropertyOperator_in_ruleProperty5081 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleQuantity_in_ruleProperty5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyOperator_in_entryRulePropertyOperator5139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyOperator5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePropertyOperator5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePropertyOperator5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePropertyOperator5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePropertyOperator5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePropertyOperator5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyLogicalOperator_in_entryRulePropertyLogicalOperator5305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyLogicalOperator5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePropertyLogicalOperator5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePropertyLogicalOperator5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCondition_in_entryRulePropertyCondition5413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCondition5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePropertyCondition5470 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_53_in_rulePropertyCondition5488 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_54_in_rulePropertyCondition5506 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_rulePropertyCondition5520 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePropertyCondition5532 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleREAL_in_rulePropertyCondition5553 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertyCondition5565 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleREAL_in_rulePropertyCondition5586 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePropertyCondition5598 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_rulePropertyCondition5611 = new BitSet(new long[]{0x000700000E000000L});
    public static final BitSet FOLLOW_rulePropertyRelationalOperator_in_rulePropertyCondition5634 = new BitSet(new long[]{0x0000000300000050L});
    public static final BitSet FOLLOW_ruleREAL_in_rulePropertyCondition5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePropertyCondition5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationalOperator_in_entryRulePropertyRelationalOperator5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyRelationalOperator5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePropertyRelationalOperator5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePropertyRelationalOperator5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePropertyRelationalOperator5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePropertyRelationalOperator5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePropertyRelationalOperator5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantity_in_entryRuleQuantity5881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantity5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleQuantity5946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuantity5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL6005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_ruleREAL6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_ruleREAL6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal6148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDecimal6202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33_in_ruleDecimal6221 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal6238 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleDecimal6257 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp6330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalExp6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDecimalExp6384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33_in_ruleDecimalExp6403 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp6420 = new BitSet(new long[]{0x0600000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDecimalExp6439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp6454 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDecimalExp6475 = new BitSet(new long[]{0x0000000300000040L});
    public static final BitSet FOLLOW_58_in_ruleDecimalExp6494 = new BitSet(new long[]{0x0000000300000040L});
    public static final BitSet FOLLOW_32_in_ruleDecimalExp6509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33_in_ruleDecimalExp6528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalExp6545 = new BitSet(new long[]{0x0000000000000002L});

}