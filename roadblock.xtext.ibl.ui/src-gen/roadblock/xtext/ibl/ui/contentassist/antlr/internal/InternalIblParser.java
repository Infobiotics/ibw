package roadblock.xtext.ibl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import roadblock.xtext.ibl.services.IblGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIblParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'required'", "'returned'", "'optional'", "'+'", "'-'", "'|'", "'ID'", "'URI'", "'DNA'", "'CHASSIS'", "'PROCESS'", "'LIST'", "'SET'", "'->'", "'<->'", "'define'", "'{'", "'}'", "'('", "')'", "','", "'USES'", "':'", "'<'", "'>'", "'observable'", "'.'", "'='", "'RULE'", "'~'", "'import'", "'.*'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g"; }


     
     	private IblGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IblGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:61:1: ( ruleModel EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:76:1: ( rule__Model__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:88:1: entryRuleModelMember : ruleModelMember EOF ;
    public final void entryRuleModelMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:89:1: ( ruleModelMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:90:1: ruleModelMember EOF
            {
             before(grammarAccess.getModelMemberRule()); 
            pushFollow(FOLLOW_ruleModelMember_in_entryRuleModelMember121);
            ruleModelMember();

            state._fsp--;

             after(grammarAccess.getModelMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMember128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelMember"


    // $ANTLR start "ruleModelMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:97:1: ruleModelMember : ( ( rule__ModelMember__Alternatives ) ) ;
    public final void ruleModelMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:101:2: ( ( ( rule__ModelMember__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:102:1: ( ( rule__ModelMember__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:102:1: ( ( rule__ModelMember__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:103:1: ( rule__ModelMember__Alternatives )
            {
             before(grammarAccess.getModelMemberAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:104:1: ( rule__ModelMember__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:104:2: rule__ModelMember__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelMember__Alternatives_in_ruleModelMember154);
            rule__ModelMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelMember"


    // $ANTLR start "entryRuleVariableDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:116:1: entryRuleVariableDefinition : ruleVariableDefinition EOF ;
    public final void entryRuleVariableDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:117:1: ( ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:118:1: ruleVariableDefinition EOF
            {
             before(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition181);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:125:1: ruleVariableDefinition : ( ( rule__VariableDefinition__Group__0 ) ) ;
    public final void ruleVariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:129:2: ( ( ( rule__VariableDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:130:1: ( ( rule__VariableDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:130:1: ( ( rule__VariableDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:131:1: ( rule__VariableDefinition__Group__0 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:132:1: ( rule__VariableDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:132:2: rule__VariableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__0_in_ruleVariableDefinition214);
            rule__VariableDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:144:1: entryRuleFunctionDefinition : ruleFunctionDefinition EOF ;
    public final void entryRuleFunctionDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:145:1: ( ruleFunctionDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:146:1: ruleFunctionDefinition EOF
            {
             before(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition241);
            ruleFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:153:1: ruleFunctionDefinition : ( ( rule__FunctionDefinition__Group__0 ) ) ;
    public final void ruleFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:157:2: ( ( ( rule__FunctionDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:158:1: ( ( rule__FunctionDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:158:1: ( ( rule__FunctionDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:159:1: ( rule__FunctionDefinition__Group__0 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:160:1: ( rule__FunctionDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:160:2: rule__FunctionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0_in_ruleFunctionDefinition274);
            rule__FunctionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleFunctionUseMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:172:1: entryRuleFunctionUseMember : ruleFunctionUseMember EOF ;
    public final void entryRuleFunctionUseMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:173:1: ( ruleFunctionUseMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:174:1: ruleFunctionUseMember EOF
            {
             before(grammarAccess.getFunctionUseMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember301);
            ruleFunctionUseMember();

            state._fsp--;

             after(grammarAccess.getFunctionUseMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUseMember308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionUseMember"


    // $ANTLR start "ruleFunctionUseMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:181:1: ruleFunctionUseMember : ( ( rule__FunctionUseMember__Group__0 ) ) ;
    public final void ruleFunctionUseMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:185:2: ( ( ( rule__FunctionUseMember__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:186:1: ( ( rule__FunctionUseMember__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:186:1: ( ( rule__FunctionUseMember__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:187:1: ( rule__FunctionUseMember__Group__0 )
            {
             before(grammarAccess.getFunctionUseMemberAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:188:1: ( rule__FunctionUseMember__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:188:2: rule__FunctionUseMember__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__Group__0_in_ruleFunctionUseMember334);
            rule__FunctionUseMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionUseMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionUseMember"


    // $ANTLR start "entryRuleFunctionParameterMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:200:1: entryRuleFunctionParameterMember : ruleFunctionParameterMember EOF ;
    public final void entryRuleFunctionParameterMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:201:1: ( ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:202:1: ruleFunctionParameterMember EOF
            {
             before(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember361);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionParameterMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionParameterMember"


    // $ANTLR start "ruleFunctionParameterMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:209:1: ruleFunctionParameterMember : ( ( rule__FunctionParameterMember__Group__0 ) ) ;
    public final void ruleFunctionParameterMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:213:2: ( ( ( rule__FunctionParameterMember__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:214:1: ( ( rule__FunctionParameterMember__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:214:1: ( ( rule__FunctionParameterMember__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:215:1: ( rule__FunctionParameterMember__Group__0 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:216:1: ( rule__FunctionParameterMember__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:216:2: rule__FunctionParameterMember__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__0_in_ruleFunctionParameterMember394);
            rule__FunctionParameterMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParameterMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionParameterMember"


    // $ANTLR start "entryRuleParameterScope"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:228:1: entryRuleParameterScope : ruleParameterScope EOF ;
    public final void entryRuleParameterScope() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:229:1: ( ruleParameterScope EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:230:1: ruleParameterScope EOF
            {
             before(grammarAccess.getParameterScopeRule()); 
            pushFollow(FOLLOW_ruleParameterScope_in_entryRuleParameterScope421);
            ruleParameterScope();

            state._fsp--;

             after(grammarAccess.getParameterScopeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterScope428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterScope"


    // $ANTLR start "ruleParameterScope"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:237:1: ruleParameterScope : ( ( rule__ParameterScope__Alternatives ) ) ;
    public final void ruleParameterScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:241:2: ( ( ( rule__ParameterScope__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:242:1: ( ( rule__ParameterScope__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:242:1: ( ( rule__ParameterScope__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:243:1: ( rule__ParameterScope__Alternatives )
            {
             before(grammarAccess.getParameterScopeAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:244:1: ( rule__ParameterScope__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:244:2: rule__ParameterScope__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterScope__Alternatives_in_ruleParameterScope454);
            rule__ParameterScope__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterScopeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterScope"


    // $ANTLR start "entryRuleFunctionDefinitionMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:256:1: entryRuleFunctionDefinitionMember : ruleFunctionDefinitionMember EOF ;
    public final void entryRuleFunctionDefinitionMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:257:1: ( ruleFunctionDefinitionMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:258:1: ruleFunctionDefinitionMember EOF
            {
             before(grammarAccess.getFunctionDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember481);
            ruleFunctionDefinitionMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinitionMember488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionDefinitionMember"


    // $ANTLR start "ruleFunctionDefinitionMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:265:1: ruleFunctionDefinitionMember : ( ( rule__FunctionDefinitionMember__Alternatives ) ) ;
    public final void ruleFunctionDefinitionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:269:2: ( ( ( rule__FunctionDefinitionMember__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:270:1: ( ( rule__FunctionDefinitionMember__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:270:1: ( ( rule__FunctionDefinitionMember__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:271:1: ( rule__FunctionDefinitionMember__Alternatives )
            {
             before(grammarAccess.getFunctionDefinitionMemberAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:272:1: ( rule__FunctionDefinitionMember__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:272:2: rule__FunctionDefinitionMember__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionDefinitionMember__Alternatives_in_ruleFunctionDefinitionMember514);
            rule__FunctionDefinitionMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDefinitionMember"


    // $ANTLR start "entryRuleVariableDefinitionMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:284:1: entryRuleVariableDefinitionMember : ruleVariableDefinitionMember EOF ;
    public final void entryRuleVariableDefinitionMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:285:1: ( ruleVariableDefinitionMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:286:1: ruleVariableDefinitionMember EOF
            {
             before(grammarAccess.getVariableDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember541);
            ruleVariableDefinitionMember();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionMember548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDefinitionMember"


    // $ANTLR start "ruleVariableDefinitionMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:293:1: ruleVariableDefinitionMember : ( ruleVariableDeclaration ) ;
    public final void ruleVariableDefinitionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:297:2: ( ( ruleVariableDeclaration ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:298:1: ( ruleVariableDeclaration )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:298:1: ( ruleVariableDeclaration )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:299:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariableDefinitionMemberAccess().getVariableDeclarationParserRuleCall()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember574);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionMemberAccess().getVariableDeclarationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDefinitionMember"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:312:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:313:1: ( ruleVariableDeclaration EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:314:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration600);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:321:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:325:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:326:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:326:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:327:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:328:1: ( rule__VariableDeclaration__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:328:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration633);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableType"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:340:1: entryRuleVariableType : ruleVariableType EOF ;
    public final void entryRuleVariableType() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:341:1: ( ruleVariableType EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:342:1: ruleVariableType EOF
            {
             before(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType660);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:349:1: ruleVariableType : ( ( rule__VariableType__Group__0 ) ) ;
    public final void ruleVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:353:2: ( ( ( rule__VariableType__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:354:1: ( ( rule__VariableType__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:354:1: ( ( rule__VariableType__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:355:1: ( rule__VariableType__Group__0 )
            {
             before(grammarAccess.getVariableTypeAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:356:1: ( rule__VariableType__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:356:2: rule__VariableType__Group__0
            {
            pushFollow(FOLLOW_rule__VariableType__Group__0_in_ruleVariableType693);
            rule__VariableType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleVariableQualifier"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:368:1: entryRuleVariableQualifier : ruleVariableQualifier EOF ;
    public final void entryRuleVariableQualifier() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:369:1: ( ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:370:1: ruleVariableQualifier EOF
            {
             before(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier720);
            ruleVariableQualifier();

            state._fsp--;

             after(grammarAccess.getVariableQualifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableQualifier"


    // $ANTLR start "ruleVariableQualifier"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:377:1: ruleVariableQualifier : ( ( rule__VariableQualifier__Group__0 ) ) ;
    public final void ruleVariableQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:381:2: ( ( ( rule__VariableQualifier__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:382:1: ( ( rule__VariableQualifier__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:382:1: ( ( rule__VariableQualifier__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:383:1: ( rule__VariableQualifier__Group__0 )
            {
             before(grammarAccess.getVariableQualifierAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:384:1: ( rule__VariableQualifier__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:384:2: rule__VariableQualifier__Group__0
            {
            pushFollow(FOLLOW_rule__VariableQualifier__Group__0_in_ruleVariableQualifier753);
            rule__VariableQualifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableQualifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableQualifier"


    // $ANTLR start "entryRuleVariableAttribute"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:396:1: entryRuleVariableAttribute : ruleVariableAttribute EOF ;
    public final void entryRuleVariableAttribute() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:397:1: ( ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:398:1: ruleVariableAttribute EOF
            {
             before(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute780);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getVariableAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableAttribute"


    // $ANTLR start "ruleVariableAttribute"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:405:1: ruleVariableAttribute : ( ( rule__VariableAttribute__Group__0 ) ) ;
    public final void ruleVariableAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:409:2: ( ( ( rule__VariableAttribute__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:410:1: ( ( rule__VariableAttribute__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:410:1: ( ( rule__VariableAttribute__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:411:1: ( rule__VariableAttribute__Group__0 )
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:412:1: ( rule__VariableAttribute__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:412:2: rule__VariableAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__0_in_ruleVariableAttribute813);
            rule__VariableAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAttribute"


    // $ANTLR start "entryRuleVariableAssignment"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:424:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:425:1: ( ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:426:1: ruleVariableAssignment EOF
            {
             before(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment840);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:433:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:437:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:438:1: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:438:1: ( ( rule__VariableAssignment__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:439:1: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:440:1: ( rule__VariableAssignment__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:440:2: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment873);
            rule__VariableAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleVariableExpression"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:452:1: entryRuleVariableExpression : ruleVariableExpression EOF ;
    public final void entryRuleVariableExpression() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:453:1: ( ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:454:1: ruleVariableExpression EOF
            {
             before(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression900);
            ruleVariableExpression();

            state._fsp--;

             after(grammarAccess.getVariableExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:461:1: ruleVariableExpression : ( ( rule__VariableExpression__Group__0 ) ) ;
    public final void ruleVariableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:465:2: ( ( ( rule__VariableExpression__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:466:1: ( ( rule__VariableExpression__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:466:1: ( ( rule__VariableExpression__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:467:1: ( rule__VariableExpression__Group__0 )
            {
             before(grammarAccess.getVariableExpressionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:468:1: ( rule__VariableExpression__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:468:2: rule__VariableExpression__Group__0
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__0_in_ruleVariableExpression933);
            rule__VariableExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "entryRuleVariableExpressionOperator"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:480:1: entryRuleVariableExpressionOperator : ruleVariableExpressionOperator EOF ;
    public final void entryRuleVariableExpressionOperator() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:481:1: ( ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:482:1: ruleVariableExpressionOperator EOF
            {
             before(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator960);
            ruleVariableExpressionOperator();

            state._fsp--;

             after(grammarAccess.getVariableExpressionOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableExpressionOperator"


    // $ANTLR start "ruleVariableExpressionOperator"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:489:1: ruleVariableExpressionOperator : ( ( rule__VariableExpressionOperator__Alternatives ) ) ;
    public final void ruleVariableExpressionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:493:2: ( ( ( rule__VariableExpressionOperator__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:494:1: ( ( rule__VariableExpressionOperator__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:494:1: ( ( rule__VariableExpressionOperator__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:495:1: ( rule__VariableExpressionOperator__Alternatives )
            {
             before(grammarAccess.getVariableExpressionOperatorAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:496:1: ( rule__VariableExpressionOperator__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:496:2: rule__VariableExpressionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableExpressionOperator__Alternatives_in_ruleVariableExpressionOperator993);
            rule__VariableExpressionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpressionOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableExpressionOperator"


    // $ANTLR start "entryRulePrimitiveVariableType"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:508:1: entryRulePrimitiveVariableType : rulePrimitiveVariableType EOF ;
    public final void entryRulePrimitiveVariableType() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:509:1: ( rulePrimitiveVariableType EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:510:1: rulePrimitiveVariableType EOF
            {
             before(grammarAccess.getPrimitiveVariableTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveVariableType_in_entryRulePrimitiveVariableType1020);
            rulePrimitiveVariableType();

            state._fsp--;

             after(grammarAccess.getPrimitiveVariableTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveVariableType1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveVariableType"


    // $ANTLR start "rulePrimitiveVariableType"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:517:1: rulePrimitiveVariableType : ( ( rule__PrimitiveVariableType__Alternatives ) ) ;
    public final void rulePrimitiveVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:521:2: ( ( ( rule__PrimitiveVariableType__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:522:1: ( ( rule__PrimitiveVariableType__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:522:1: ( ( rule__PrimitiveVariableType__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:523:1: ( rule__PrimitiveVariableType__Alternatives )
            {
             before(grammarAccess.getPrimitiveVariableTypeAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:524:1: ( rule__PrimitiveVariableType__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:524:2: rule__PrimitiveVariableType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveVariableType__Alternatives_in_rulePrimitiveVariableType1053);
            rule__PrimitiveVariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveVariableTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveVariableType"


    // $ANTLR start "entryRuleCollectionID"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:536:1: entryRuleCollectionID : ruleCollectionID EOF ;
    public final void entryRuleCollectionID() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:537:1: ( ruleCollectionID EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:538:1: ruleCollectionID EOF
            {
             before(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID1080);
            ruleCollectionID();

            state._fsp--;

             after(grammarAccess.getCollectionIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollectionID"


    // $ANTLR start "ruleCollectionID"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:545:1: ruleCollectionID : ( ( rule__CollectionID__Alternatives ) ) ;
    public final void ruleCollectionID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:549:2: ( ( ( rule__CollectionID__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:550:1: ( ( rule__CollectionID__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:550:1: ( ( rule__CollectionID__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:551:1: ( rule__CollectionID__Alternatives )
            {
             before(grammarAccess.getCollectionIDAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:552:1: ( rule__CollectionID__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:552:2: rule__CollectionID__Alternatives
            {
            pushFollow(FOLLOW_rule__CollectionID__Alternatives_in_ruleCollectionID1113);
            rule__CollectionID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionID"


    // $ANTLR start "entryRuleRuleDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:564:1: entryRuleRuleDefinition : ruleRuleDefinition EOF ;
    public final void entryRuleRuleDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:565:1: ( ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:566:1: ruleRuleDefinition EOF
            {
             before(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1140);
            ruleRuleDefinition();

            state._fsp--;

             after(grammarAccess.getRuleDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleDefinition"


    // $ANTLR start "ruleRuleDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:573:1: ruleRuleDefinition : ( ( rule__RuleDefinition__Group__0 ) ) ;
    public final void ruleRuleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:577:2: ( ( ( rule__RuleDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:578:1: ( ( rule__RuleDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:578:1: ( ( rule__RuleDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:579:1: ( rule__RuleDefinition__Group__0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:580:1: ( rule__RuleDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:580:2: rule__RuleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__0_in_ruleRuleDefinition1173);
            rule__RuleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleDefinition"


    // $ANTLR start "entryRuleRuleObject"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:592:1: entryRuleRuleObject : ruleRuleObject EOF ;
    public final void entryRuleRuleObject() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:593:1: ( ruleRuleObject EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:594:1: ruleRuleObject EOF
            {
             before(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject1200);
            ruleRuleObject();

            state._fsp--;

             after(grammarAccess.getRuleObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleObject"


    // $ANTLR start "ruleRuleObject"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:601:1: ruleRuleObject : ( ( rule__RuleObject__Group__0 ) ) ;
    public final void ruleRuleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:605:2: ( ( ( rule__RuleObject__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:606:1: ( ( rule__RuleObject__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:606:1: ( ( rule__RuleObject__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:607:1: ( rule__RuleObject__Group__0 )
            {
             before(grammarAccess.getRuleObjectAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:608:1: ( rule__RuleObject__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:608:2: rule__RuleObject__Group__0
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__0_in_ruleRuleObject1233);
            rule__RuleObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleObject"


    // $ANTLR start "entryRuleImport"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:620:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:621:1: ( ruleImport EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:622:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1260);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1267); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:629:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:633:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:634:1: ( ( rule__Import__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:634:1: ( ( rule__Import__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:635:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:636:1: ( rule__Import__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:636:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport1293);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:648:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:649:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:650:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1320);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:657:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:661:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:662:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:662:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:663:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:664:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:664:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1353);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:676:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:677:1: ( ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:678:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1380);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:685:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:689:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:690:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:690:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:691:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:692:1: ( rule__QualifiedName__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:692:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1413);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__ModelMember__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:704:1: rule__ModelMember__Alternatives : ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) );
    public final void rule__ModelMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:708:1: ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:709:1: ( ruleImport )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:709:1: ( ruleImport )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:710:1: ruleImport
                    {
                     before(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__ModelMember__Alternatives1449);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:715:6: ( ruleVariableDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:715:6: ( ruleVariableDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:716:1: ruleVariableDefinition
                    {
                     before(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariableDefinition_in_rule__ModelMember__Alternatives1466);
                    ruleVariableDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:721:6: ( ruleFunctionDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:721:6: ( ruleFunctionDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:722:1: ruleFunctionDefinition
                    {
                     before(grammarAccess.getModelMemberAccess().getFunctionDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_rule__ModelMember__Alternatives1483);
                    ruleFunctionDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelMemberAccess().getFunctionDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMember__Alternatives"


    // $ANTLR start "rule__ParameterScope__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:732:1: rule__ParameterScope__Alternatives : ( ( 'required' ) | ( 'returned' ) | ( 'optional' ) );
    public final void rule__ParameterScope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:736:1: ( ( 'required' ) | ( 'returned' ) | ( 'optional' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:737:1: ( 'required' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:737:1: ( 'required' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:738:1: 'required'
                    {
                     before(grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ParameterScope__Alternatives1516); 
                     after(grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:745:6: ( 'returned' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:745:6: ( 'returned' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:746:1: 'returned'
                    {
                     before(grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ParameterScope__Alternatives1536); 
                     after(grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:753:6: ( 'optional' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:753:6: ( 'optional' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:754:1: 'optional'
                    {
                     before(grammarAccess.getParameterScopeAccess().getOptionalKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__ParameterScope__Alternatives1556); 
                     after(grammarAccess.getParameterScopeAccess().getOptionalKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterScope__Alternatives"


    // $ANTLR start "rule__FunctionDefinitionMember__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:766:1: rule__FunctionDefinitionMember__Alternatives : ( ( ruleRuleDefinition ) | ( ruleVariableAssignment ) | ( ruleVariableDefinitionMember ) );
    public final void rule__FunctionDefinitionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:770:1: ( ( ruleRuleDefinition ) | ( ruleVariableAssignment ) | ( ruleVariableDefinitionMember ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID) ) {
                    alt3=3;
                }
                else if ( ((LA3_2>=37 && LA3_2<=38)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 36:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:771:1: ( ruleRuleDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:771:1: ( ruleRuleDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:772:1: ruleRuleDefinition
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRuleDefinition_in_rule__FunctionDefinitionMember__Alternatives1590);
                    ruleRuleDefinition();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:777:6: ( ruleVariableAssignment )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:777:6: ( ruleVariableAssignment )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:778:1: ruleVariableAssignment
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rule__FunctionDefinitionMember__Alternatives1607);
                    ruleVariableAssignment();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:783:6: ( ruleVariableDefinitionMember )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:783:6: ( ruleVariableDefinitionMember )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:784:1: ruleVariableDefinitionMember
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getVariableDefinitionMemberParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleVariableDefinitionMember_in_rule__FunctionDefinitionMember__Alternatives1624);
                    ruleVariableDefinitionMember();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getVariableDefinitionMemberParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinitionMember__Alternatives"


    // $ANTLR start "rule__VariableDeclaration__Alternatives_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:794:1: rule__VariableDeclaration__Alternatives_2 : ( ( ( rule__VariableDeclaration__Group_2_0__0 ) ) | ( ( rule__VariableDeclaration__Group_2_1__0 ) ) );
    public final void rule__VariableDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:798:1: ( ( ( rule__VariableDeclaration__Group_2_0__0 ) ) | ( ( rule__VariableDeclaration__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=17 && LA4_0<=21)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=22 && LA4_0<=23)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:799:1: ( ( rule__VariableDeclaration__Group_2_0__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:799:1: ( ( rule__VariableDeclaration__Group_2_0__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:800:1: ( rule__VariableDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getGroup_2_0()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:801:1: ( rule__VariableDeclaration__Group_2_0__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:801:2: rule__VariableDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__0_in_rule__VariableDeclaration__Alternatives_21656);
                    rule__VariableDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:805:6: ( ( rule__VariableDeclaration__Group_2_1__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:805:6: ( ( rule__VariableDeclaration__Group_2_1__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:806:1: ( rule__VariableDeclaration__Group_2_1__0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getGroup_2_1()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:807:1: ( rule__VariableDeclaration__Group_2_1__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:807:2: rule__VariableDeclaration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__0_in_rule__VariableDeclaration__Alternatives_21674);
                    rule__VariableDeclaration__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Alternatives_2"


    // $ANTLR start "rule__VariableType__PrimitiveAlternatives_1_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:816:1: rule__VariableType__PrimitiveAlternatives_1_0 : ( ( rulePrimitiveVariableType ) | ( RULE_ID ) );
    public final void rule__VariableType__PrimitiveAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:820:1: ( ( rulePrimitiveVariableType ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=21)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:821:1: ( rulePrimitiveVariableType )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:821:1: ( rulePrimitiveVariableType )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:822:1: rulePrimitiveVariableType
                    {
                     before(grammarAccess.getVariableTypeAccess().getPrimitivePrimitiveVariableTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_rulePrimitiveVariableType_in_rule__VariableType__PrimitiveAlternatives_1_01707);
                    rulePrimitiveVariableType();

                    state._fsp--;

                     after(grammarAccess.getVariableTypeAccess().getPrimitivePrimitiveVariableTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:827:6: ( RULE_ID )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:827:6: ( RULE_ID )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:828:1: RULE_ID
                    {
                     before(grammarAccess.getVariableTypeAccess().getPrimitiveIDTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableType__PrimitiveAlternatives_1_01724); 
                     after(grammarAccess.getVariableTypeAccess().getPrimitiveIDTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__PrimitiveAlternatives_1_0"


    // $ANTLR start "rule__VariableExpressionOperator__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:838:1: rule__VariableExpressionOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '|' ) );
    public final void rule__VariableExpressionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:842:1: ( ( '+' ) | ( '-' ) | ( '|' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:843:1: ( '+' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:843:1: ( '+' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:844:1: '+'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__VariableExpressionOperator__Alternatives1757); 
                     after(grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:851:6: ( '-' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:851:6: ( '-' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:852:1: '-'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__VariableExpressionOperator__Alternatives1777); 
                     after(grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:859:6: ( '|' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:859:6: ( '|' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:860:1: '|'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getVerticalLineKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__VariableExpressionOperator__Alternatives1797); 
                     after(grammarAccess.getVariableExpressionOperatorAccess().getVerticalLineKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpressionOperator__Alternatives"


    // $ANTLR start "rule__PrimitiveVariableType__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:872:1: rule__PrimitiveVariableType__Alternatives : ( ( 'ID' ) | ( 'URI' ) | ( 'DNA' ) | ( 'CHASSIS' ) | ( 'PROCESS' ) );
    public final void rule__PrimitiveVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:876:1: ( ( 'ID' ) | ( 'URI' ) | ( 'DNA' ) | ( 'CHASSIS' ) | ( 'PROCESS' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:877:1: ( 'ID' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:877:1: ( 'ID' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:878:1: 'ID'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getIDKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__PrimitiveVariableType__Alternatives1832); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getIDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:885:6: ( 'URI' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:885:6: ( 'URI' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:886:1: 'URI'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getURIKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__PrimitiveVariableType__Alternatives1852); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getURIKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:893:6: ( 'DNA' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:893:6: ( 'DNA' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:894:1: 'DNA'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getDNAKeyword_2()); 
                    match(input,19,FOLLOW_19_in_rule__PrimitiveVariableType__Alternatives1872); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getDNAKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:901:6: ( 'CHASSIS' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:901:6: ( 'CHASSIS' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:902:1: 'CHASSIS'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getCHASSISKeyword_3()); 
                    match(input,20,FOLLOW_20_in_rule__PrimitiveVariableType__Alternatives1892); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getCHASSISKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:909:6: ( 'PROCESS' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:909:6: ( 'PROCESS' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:910:1: 'PROCESS'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getPROCESSKeyword_4()); 
                    match(input,21,FOLLOW_21_in_rule__PrimitiveVariableType__Alternatives1912); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getPROCESSKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveVariableType__Alternatives"


    // $ANTLR start "rule__CollectionID__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:922:1: rule__CollectionID__Alternatives : ( ( 'LIST' ) | ( 'SET' ) );
    public final void rule__CollectionID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:926:1: ( ( 'LIST' ) | ( 'SET' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:927:1: ( 'LIST' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:927:1: ( 'LIST' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:928:1: 'LIST'
                    {
                     before(grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__CollectionID__Alternatives1947); 
                     after(grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:935:6: ( 'SET' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:935:6: ( 'SET' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:936:1: 'SET'
                    {
                     before(grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__CollectionID__Alternatives1967); 
                     after(grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionID__Alternatives"


    // $ANTLR start "rule__RuleDefinition__Alternatives_5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:948:1: rule__RuleDefinition__Alternatives_5 : ( ( '->' ) | ( '<->' ) );
    public final void rule__RuleDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:952:1: ( ( '->' ) | ( '<->' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:953:1: ( '->' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:953:1: ( '->' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:954:1: '->'
                    {
                     before(grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
                    match(input,24,FOLLOW_24_in_rule__RuleDefinition__Alternatives_52002); 
                     after(grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:961:6: ( '<->' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:961:6: ( '<->' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:962:1: '<->'
                    {
                     before(grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1()); 
                    match(input,25,FOLLOW_25_in_rule__RuleDefinition__Alternatives_52022); 
                     after(grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Alternatives_5"


    // $ANTLR start "rule__Model__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:976:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:980:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:981:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02054);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02057);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:988:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:992:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:993:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:993:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:994:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:995:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:997:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1007:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1011:1: ( rule__Model__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1012:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12115);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1018:1: rule__Model__Group__1__Impl : ( ( rule__Model__MembersAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1022:1: ( ( ( rule__Model__MembersAssignment_1 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1023:1: ( ( rule__Model__MembersAssignment_1 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1023:1: ( ( rule__Model__MembersAssignment_1 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1024:1: ( rule__Model__MembersAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getMembersAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1025:1: ( rule__Model__MembersAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26||LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1025:2: rule__Model__MembersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__MembersAssignment_1_in_rule__Model__Group__1__Impl2142);
            	    rule__Model__MembersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMembersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1039:1: rule__VariableDefinition__Group__0 : rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 ;
    public final void rule__VariableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1043:1: ( rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1044:2: rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__0__Impl_in_rule__VariableDefinition__Group__02177);
            rule__VariableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__1_in_rule__VariableDefinition__Group__02180);
            rule__VariableDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__0"


    // $ANTLR start "rule__VariableDefinition__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1051:1: rule__VariableDefinition__Group__0__Impl : ( () ) ;
    public final void rule__VariableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1055:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1056:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1056:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1057:1: ()
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1058:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1060:1: 
            {
            }

             after(grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1070:1: rule__VariableDefinition__Group__1 : rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 ;
    public final void rule__VariableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1074:1: ( rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1075:2: rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__1__Impl_in_rule__VariableDefinition__Group__12238);
            rule__VariableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__2_in_rule__VariableDefinition__Group__12241);
            rule__VariableDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__1"


    // $ANTLR start "rule__VariableDefinition__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1082:1: rule__VariableDefinition__Group__1__Impl : ( 'define' ) ;
    public final void rule__VariableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1086:1: ( ( 'define' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1087:1: ( 'define' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1087:1: ( 'define' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1088:1: 'define'
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__VariableDefinition__Group__1__Impl2269); 
             after(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1101:1: rule__VariableDefinition__Group__2 : rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 ;
    public final void rule__VariableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1105:1: ( rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1106:2: rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__2__Impl_in_rule__VariableDefinition__Group__22300);
            rule__VariableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__3_in_rule__VariableDefinition__Group__22303);
            rule__VariableDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__2"


    // $ANTLR start "rule__VariableDefinition__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1113:1: rule__VariableDefinition__Group__2__Impl : ( ( rule__VariableDefinition__TypeAssignment_2 )? ) ;
    public final void rule__VariableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1117:1: ( ( ( rule__VariableDefinition__TypeAssignment_2 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1118:1: ( ( rule__VariableDefinition__TypeAssignment_2 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1118:1: ( ( rule__VariableDefinition__TypeAssignment_2 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1119:1: ( rule__VariableDefinition__TypeAssignment_2 )?
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1120:1: ( rule__VariableDefinition__TypeAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=17 && LA11_0<=21)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_ID) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1120:2: rule__VariableDefinition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__VariableDefinition__TypeAssignment_2_in_rule__VariableDefinition__Group__2__Impl2330);
                    rule__VariableDefinition__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1130:1: rule__VariableDefinition__Group__3 : rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 ;
    public final void rule__VariableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1134:1: ( rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1135:2: rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__3__Impl_in_rule__VariableDefinition__Group__32361);
            rule__VariableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__4_in_rule__VariableDefinition__Group__32364);
            rule__VariableDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__3"


    // $ANTLR start "rule__VariableDefinition__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1142:1: rule__VariableDefinition__Group__3__Impl : ( ( rule__VariableDefinition__NameAssignment_3 ) ) ;
    public final void rule__VariableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1146:1: ( ( ( rule__VariableDefinition__NameAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1147:1: ( ( rule__VariableDefinition__NameAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1147:1: ( ( rule__VariableDefinition__NameAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1148:1: ( rule__VariableDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1149:1: ( rule__VariableDefinition__NameAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1149:2: rule__VariableDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableDefinition__NameAssignment_3_in_rule__VariableDefinition__Group__3__Impl2391);
            rule__VariableDefinition__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__3__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1159:1: rule__VariableDefinition__Group__4 : rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5 ;
    public final void rule__VariableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1163:1: ( rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1164:2: rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__4__Impl_in_rule__VariableDefinition__Group__42421);
            rule__VariableDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__5_in_rule__VariableDefinition__Group__42424);
            rule__VariableDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__4"


    // $ANTLR start "rule__VariableDefinition__Group__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1171:1: rule__VariableDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__VariableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1175:1: ( ( '{' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1176:1: ( '{' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1176:1: ( '{' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1177:1: '{'
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__VariableDefinition__Group__4__Impl2452); 
             after(grammarAccess.getVariableDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__4__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1190:1: rule__VariableDefinition__Group__5 : rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6 ;
    public final void rule__VariableDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1194:1: ( rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1195:2: rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__5__Impl_in_rule__VariableDefinition__Group__52483);
            rule__VariableDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__6_in_rule__VariableDefinition__Group__52486);
            rule__VariableDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__5"


    // $ANTLR start "rule__VariableDefinition__Group__5__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1202:1: rule__VariableDefinition__Group__5__Impl : ( ( rule__VariableDefinition__MembersAssignment_5 )* ) ;
    public final void rule__VariableDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1206:1: ( ( ( rule__VariableDefinition__MembersAssignment_5 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1207:1: ( ( rule__VariableDefinition__MembersAssignment_5 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1207:1: ( ( rule__VariableDefinition__MembersAssignment_5 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1208:1: ( rule__VariableDefinition__MembersAssignment_5 )*
            {
             before(grammarAccess.getVariableDefinitionAccess().getMembersAssignment_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1209:1: ( rule__VariableDefinition__MembersAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=17 && LA12_0<=23)||LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1209:2: rule__VariableDefinition__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__VariableDefinition__MembersAssignment_5_in_rule__VariableDefinition__Group__5__Impl2513);
            	    rule__VariableDefinition__MembersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getVariableDefinitionAccess().getMembersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__5__Impl"


    // $ANTLR start "rule__VariableDefinition__Group__6"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1219:1: rule__VariableDefinition__Group__6 : rule__VariableDefinition__Group__6__Impl ;
    public final void rule__VariableDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1223:1: ( rule__VariableDefinition__Group__6__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1224:2: rule__VariableDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__6__Impl_in_rule__VariableDefinition__Group__62544);
            rule__VariableDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__6"


    // $ANTLR start "rule__VariableDefinition__Group__6__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1230:1: rule__VariableDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__VariableDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1234:1: ( ( '}' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1235:1: ( '}' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1235:1: ( '}' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1236:1: '}'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__VariableDefinition__Group__6__Impl2572); 
             after(grammarAccess.getVariableDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__Group__6__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1263:1: rule__FunctionDefinition__Group__0 : rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 ;
    public final void rule__FunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1267:1: ( rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1268:2: rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02617);
            rule__FunctionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02620);
            rule__FunctionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__0"


    // $ANTLR start "rule__FunctionDefinition__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1275:1: rule__FunctionDefinition__Group__0__Impl : ( () ) ;
    public final void rule__FunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1279:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1280:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1280:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1281:1: ()
            {
             before(grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1282:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1284:1: 
            {
            }

             after(grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1294:1: rule__FunctionDefinition__Group__1 : rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 ;
    public final void rule__FunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1298:1: ( rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1299:2: rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12678);
            rule__FunctionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12681);
            rule__FunctionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__1"


    // $ANTLR start "rule__FunctionDefinition__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1306:1: rule__FunctionDefinition__Group__1__Impl : ( 'define' ) ;
    public final void rule__FunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1310:1: ( ( 'define' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1311:1: ( 'define' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1311:1: ( 'define' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1312:1: 'define'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__FunctionDefinition__Group__1__Impl2709); 
             after(grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1325:1: rule__FunctionDefinition__Group__2 : rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 ;
    public final void rule__FunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1329:1: ( rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1330:2: rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22740);
            rule__FunctionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22743);
            rule__FunctionDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__2"


    // $ANTLR start "rule__FunctionDefinition__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1337:1: rule__FunctionDefinition__Group__2__Impl : ( ( rule__FunctionDefinition__TypeAssignment_2 )? ) ;
    public final void rule__FunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1341:1: ( ( ( rule__FunctionDefinition__TypeAssignment_2 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1342:1: ( ( rule__FunctionDefinition__TypeAssignment_2 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1342:1: ( ( rule__FunctionDefinition__TypeAssignment_2 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1343:1: ( rule__FunctionDefinition__TypeAssignment_2 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getTypeAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1344:1: ( rule__FunctionDefinition__TypeAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=17 && LA13_0<=21)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==RULE_ID) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1344:2: rule__FunctionDefinition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__TypeAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2770);
                    rule__FunctionDefinition__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1354:1: rule__FunctionDefinition__Group__3 : rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 ;
    public final void rule__FunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1358:1: ( rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1359:2: rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32801);
            rule__FunctionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32804);
            rule__FunctionDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__3"


    // $ANTLR start "rule__FunctionDefinition__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1366:1: rule__FunctionDefinition__Group__3__Impl : ( ( rule__FunctionDefinition__NameAssignment_3 ) ) ;
    public final void rule__FunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1370:1: ( ( ( rule__FunctionDefinition__NameAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1371:1: ( ( rule__FunctionDefinition__NameAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1371:1: ( ( rule__FunctionDefinition__NameAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1372:1: ( rule__FunctionDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1373:1: ( rule__FunctionDefinition__NameAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1373:2: rule__FunctionDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__NameAssignment_3_in_rule__FunctionDefinition__Group__3__Impl2831);
            rule__FunctionDefinition__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__3__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1383:1: rule__FunctionDefinition__Group__4 : rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 ;
    public final void rule__FunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1387:1: ( rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1388:2: rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42861);
            rule__FunctionDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42864);
            rule__FunctionDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__4"


    // $ANTLR start "rule__FunctionDefinition__Group__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1395:1: rule__FunctionDefinition__Group__4__Impl : ( '(' ) ;
    public final void rule__FunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1399:1: ( ( '(' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1400:1: ( '(' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1400:1: ( '(' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1401:1: '('
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__FunctionDefinition__Group__4__Impl2892); 
             after(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__4__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1414:1: rule__FunctionDefinition__Group__5 : rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6 ;
    public final void rule__FunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1418:1: ( rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1419:2: rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52923);
            rule__FunctionDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__6_in_rule__FunctionDefinition__Group__52926);
            rule__FunctionDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__5"


    // $ANTLR start "rule__FunctionDefinition__Group__5__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1426:1: rule__FunctionDefinition__Group__5__Impl : ( ( rule__FunctionDefinition__ParametersAssignment_5 ) ) ;
    public final void rule__FunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1430:1: ( ( ( rule__FunctionDefinition__ParametersAssignment_5 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1431:1: ( ( rule__FunctionDefinition__ParametersAssignment_5 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1431:1: ( ( rule__FunctionDefinition__ParametersAssignment_5 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1432:1: ( rule__FunctionDefinition__ParametersAssignment_5 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1433:1: ( rule__FunctionDefinition__ParametersAssignment_5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1433:2: rule__FunctionDefinition__ParametersAssignment_5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2953);
            rule__FunctionDefinition__ParametersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__5__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__6"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1443:1: rule__FunctionDefinition__Group__6 : rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7 ;
    public final void rule__FunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1447:1: ( rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1448:2: rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__6__Impl_in_rule__FunctionDefinition__Group__62983);
            rule__FunctionDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__7_in_rule__FunctionDefinition__Group__62986);
            rule__FunctionDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__6"


    // $ANTLR start "rule__FunctionDefinition__Group__6__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1455:1: rule__FunctionDefinition__Group__6__Impl : ( ( rule__FunctionDefinition__Group_6__0 )* ) ;
    public final void rule__FunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1459:1: ( ( ( rule__FunctionDefinition__Group_6__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1460:1: ( ( rule__FunctionDefinition__Group_6__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1460:1: ( ( rule__FunctionDefinition__Group_6__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1461:1: ( rule__FunctionDefinition__Group_6__0 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_6()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1462:1: ( rule__FunctionDefinition__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1462:2: rule__FunctionDefinition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__Group_6__0_in_rule__FunctionDefinition__Group__6__Impl3013);
            	    rule__FunctionDefinition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__6__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__7"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1472:1: rule__FunctionDefinition__Group__7 : rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8 ;
    public final void rule__FunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1476:1: ( rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1477:2: rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__7__Impl_in_rule__FunctionDefinition__Group__73044);
            rule__FunctionDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__8_in_rule__FunctionDefinition__Group__73047);
            rule__FunctionDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__7"


    // $ANTLR start "rule__FunctionDefinition__Group__7__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1484:1: rule__FunctionDefinition__Group__7__Impl : ( ')' ) ;
    public final void rule__FunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1488:1: ( ( ')' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1489:1: ( ')' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1489:1: ( ')' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1490:1: ')'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__FunctionDefinition__Group__7__Impl3075); 
             after(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__7__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__8"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1503:1: rule__FunctionDefinition__Group__8 : rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9 ;
    public final void rule__FunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1507:1: ( rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1508:2: rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__8__Impl_in_rule__FunctionDefinition__Group__83106);
            rule__FunctionDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__9_in_rule__FunctionDefinition__Group__83109);
            rule__FunctionDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__8"


    // $ANTLR start "rule__FunctionDefinition__Group__8__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1515:1: rule__FunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__FunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1519:1: ( ( '{' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1520:1: ( '{' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1520:1: ( '{' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1521:1: '{'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__FunctionDefinition__Group__8__Impl3137); 
             after(grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__8__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__9"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1534:1: rule__FunctionDefinition__Group__9 : rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10 ;
    public final void rule__FunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1538:1: ( rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1539:2: rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__9__Impl_in_rule__FunctionDefinition__Group__93168);
            rule__FunctionDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__10_in_rule__FunctionDefinition__Group__93171);
            rule__FunctionDefinition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__9"


    // $ANTLR start "rule__FunctionDefinition__Group__9__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1546:1: rule__FunctionDefinition__Group__9__Impl : ( ( rule__FunctionDefinition__MembersAssignment_9 )* ) ;
    public final void rule__FunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1550:1: ( ( ( rule__FunctionDefinition__MembersAssignment_9 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1551:1: ( ( rule__FunctionDefinition__MembersAssignment_9 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1551:1: ( ( rule__FunctionDefinition__MembersAssignment_9 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1552:1: ( rule__FunctionDefinition__MembersAssignment_9 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_9()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1553:1: ( rule__FunctionDefinition__MembersAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=17 && LA15_0<=23)||LA15_0==36||LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1553:2: rule__FunctionDefinition__MembersAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__MembersAssignment_9_in_rule__FunctionDefinition__Group__9__Impl3198);
            	    rule__FunctionDefinition__MembersAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__9__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__10"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1563:1: rule__FunctionDefinition__Group__10 : rule__FunctionDefinition__Group__10__Impl rule__FunctionDefinition__Group__11 ;
    public final void rule__FunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1567:1: ( rule__FunctionDefinition__Group__10__Impl rule__FunctionDefinition__Group__11 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1568:2: rule__FunctionDefinition__Group__10__Impl rule__FunctionDefinition__Group__11
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__10__Impl_in_rule__FunctionDefinition__Group__103229);
            rule__FunctionDefinition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__11_in_rule__FunctionDefinition__Group__103232);
            rule__FunctionDefinition__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__10"


    // $ANTLR start "rule__FunctionDefinition__Group__10__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1575:1: rule__FunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__FunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1579:1: ( ( '}' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1580:1: ( '}' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1580:1: ( '}' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1581:1: '}'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,28,FOLLOW_28_in_rule__FunctionDefinition__Group__10__Impl3260); 
             after(grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__10__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__11"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1594:1: rule__FunctionDefinition__Group__11 : rule__FunctionDefinition__Group__11__Impl ;
    public final void rule__FunctionDefinition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1598:1: ( rule__FunctionDefinition__Group__11__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1599:2: rule__FunctionDefinition__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__11__Impl_in_rule__FunctionDefinition__Group__113291);
            rule__FunctionDefinition__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__11"


    // $ANTLR start "rule__FunctionDefinition__Group__11__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1605:1: rule__FunctionDefinition__Group__11__Impl : ( ( rule__FunctionDefinition__Group_11__0 )? ) ;
    public final void rule__FunctionDefinition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1609:1: ( ( ( rule__FunctionDefinition__Group_11__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1610:1: ( ( rule__FunctionDefinition__Group_11__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1610:1: ( ( rule__FunctionDefinition__Group_11__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1611:1: ( rule__FunctionDefinition__Group_11__0 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_11()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1612:1: ( rule__FunctionDefinition__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1612:2: rule__FunctionDefinition__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_11__0_in_rule__FunctionDefinition__Group__11__Impl3318);
                    rule__FunctionDefinition__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group__11__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_6__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1646:1: rule__FunctionDefinition__Group_6__0 : rule__FunctionDefinition__Group_6__0__Impl rule__FunctionDefinition__Group_6__1 ;
    public final void rule__FunctionDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1650:1: ( rule__FunctionDefinition__Group_6__0__Impl rule__FunctionDefinition__Group_6__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1651:2: rule__FunctionDefinition__Group_6__0__Impl rule__FunctionDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_6__0__Impl_in_rule__FunctionDefinition__Group_6__03373);
            rule__FunctionDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_6__1_in_rule__FunctionDefinition__Group_6__03376);
            rule__FunctionDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_6__0"


    // $ANTLR start "rule__FunctionDefinition__Group_6__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1658:1: rule__FunctionDefinition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__FunctionDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1662:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1663:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1663:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1664:1: ','
            {
             before(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__FunctionDefinition__Group_6__0__Impl3404); 
             after(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_6__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1677:1: rule__FunctionDefinition__Group_6__1 : rule__FunctionDefinition__Group_6__1__Impl ;
    public final void rule__FunctionDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1681:1: ( rule__FunctionDefinition__Group_6__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1682:2: rule__FunctionDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_6__1__Impl_in_rule__FunctionDefinition__Group_6__13435);
            rule__FunctionDefinition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_6__1"


    // $ANTLR start "rule__FunctionDefinition__Group_6__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1688:1: rule__FunctionDefinition__Group_6__1__Impl : ( ( rule__FunctionDefinition__ParametersAssignment_6_1 ) ) ;
    public final void rule__FunctionDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1692:1: ( ( ( rule__FunctionDefinition__ParametersAssignment_6_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1693:1: ( ( rule__FunctionDefinition__ParametersAssignment_6_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1693:1: ( ( rule__FunctionDefinition__ParametersAssignment_6_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1694:1: ( rule__FunctionDefinition__ParametersAssignment_6_1 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_6_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1695:1: ( rule__FunctionDefinition__ParametersAssignment_6_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1695:2: rule__FunctionDefinition__ParametersAssignment_6_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ParametersAssignment_6_1_in_rule__FunctionDefinition__Group_6__1__Impl3462);
            rule__FunctionDefinition__ParametersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_11__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1709:1: rule__FunctionDefinition__Group_11__0 : rule__FunctionDefinition__Group_11__0__Impl rule__FunctionDefinition__Group_11__1 ;
    public final void rule__FunctionDefinition__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1713:1: ( rule__FunctionDefinition__Group_11__0__Impl rule__FunctionDefinition__Group_11__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1714:2: rule__FunctionDefinition__Group_11__0__Impl rule__FunctionDefinition__Group_11__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11__0__Impl_in_rule__FunctionDefinition__Group_11__03496);
            rule__FunctionDefinition__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11__1_in_rule__FunctionDefinition__Group_11__03499);
            rule__FunctionDefinition__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11__0"


    // $ANTLR start "rule__FunctionDefinition__Group_11__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1721:1: rule__FunctionDefinition__Group_11__0__Impl : ( 'USES' ) ;
    public final void rule__FunctionDefinition__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1725:1: ( ( 'USES' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1726:1: ( 'USES' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1726:1: ( 'USES' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1727:1: 'USES'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_11_0()); 
            match(input,32,FOLLOW_32_in_rule__FunctionDefinition__Group_11__0__Impl3527); 
             after(grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_11__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1740:1: rule__FunctionDefinition__Group_11__1 : rule__FunctionDefinition__Group_11__1__Impl rule__FunctionDefinition__Group_11__2 ;
    public final void rule__FunctionDefinition__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1744:1: ( rule__FunctionDefinition__Group_11__1__Impl rule__FunctionDefinition__Group_11__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1745:2: rule__FunctionDefinition__Group_11__1__Impl rule__FunctionDefinition__Group_11__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11__1__Impl_in_rule__FunctionDefinition__Group_11__13558);
            rule__FunctionDefinition__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11__2_in_rule__FunctionDefinition__Group_11__13561);
            rule__FunctionDefinition__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11__1"


    // $ANTLR start "rule__FunctionDefinition__Group_11__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1752:1: rule__FunctionDefinition__Group_11__1__Impl : ( ( rule__FunctionDefinition__UsesAssignment_11_1 ) ) ;
    public final void rule__FunctionDefinition__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1756:1: ( ( ( rule__FunctionDefinition__UsesAssignment_11_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1757:1: ( ( rule__FunctionDefinition__UsesAssignment_11_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1757:1: ( ( rule__FunctionDefinition__UsesAssignment_11_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1758:1: ( rule__FunctionDefinition__UsesAssignment_11_1 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1759:1: ( rule__FunctionDefinition__UsesAssignment_11_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1759:2: rule__FunctionDefinition__UsesAssignment_11_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__UsesAssignment_11_1_in_rule__FunctionDefinition__Group_11__1__Impl3588);
            rule__FunctionDefinition__UsesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_11__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1769:1: rule__FunctionDefinition__Group_11__2 : rule__FunctionDefinition__Group_11__2__Impl ;
    public final void rule__FunctionDefinition__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1773:1: ( rule__FunctionDefinition__Group_11__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1774:2: rule__FunctionDefinition__Group_11__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11__2__Impl_in_rule__FunctionDefinition__Group_11__23618);
            rule__FunctionDefinition__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11__2"


    // $ANTLR start "rule__FunctionDefinition__Group_11__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1780:1: rule__FunctionDefinition__Group_11__2__Impl : ( ( rule__FunctionDefinition__Group_11_2__0 ) ) ;
    public final void rule__FunctionDefinition__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1784:1: ( ( ( rule__FunctionDefinition__Group_11_2__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1785:1: ( ( rule__FunctionDefinition__Group_11_2__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1785:1: ( ( rule__FunctionDefinition__Group_11_2__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1786:1: ( rule__FunctionDefinition__Group_11_2__0 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_11_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1787:1: ( rule__FunctionDefinition__Group_11_2__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1787:2: rule__FunctionDefinition__Group_11_2__0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11_2__0_in_rule__FunctionDefinition__Group_11__2__Impl3645);
            rule__FunctionDefinition__Group_11_2__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_11_2__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1803:1: rule__FunctionDefinition__Group_11_2__0 : rule__FunctionDefinition__Group_11_2__0__Impl rule__FunctionDefinition__Group_11_2__1 ;
    public final void rule__FunctionDefinition__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1807:1: ( rule__FunctionDefinition__Group_11_2__0__Impl rule__FunctionDefinition__Group_11_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1808:2: rule__FunctionDefinition__Group_11_2__0__Impl rule__FunctionDefinition__Group_11_2__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11_2__0__Impl_in_rule__FunctionDefinition__Group_11_2__03681);
            rule__FunctionDefinition__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11_2__1_in_rule__FunctionDefinition__Group_11_2__03684);
            rule__FunctionDefinition__Group_11_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11_2__0"


    // $ANTLR start "rule__FunctionDefinition__Group_11_2__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1815:1: rule__FunctionDefinition__Group_11_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionDefinition__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1819:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1820:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1820:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1821:1: ','
            {
             before(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_11_2_0()); 
            match(input,31,FOLLOW_31_in_rule__FunctionDefinition__Group_11_2__0__Impl3712); 
             after(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11_2__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_11_2__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1834:1: rule__FunctionDefinition__Group_11_2__1 : rule__FunctionDefinition__Group_11_2__1__Impl ;
    public final void rule__FunctionDefinition__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1838:1: ( rule__FunctionDefinition__Group_11_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1839:2: rule__FunctionDefinition__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_11_2__1__Impl_in_rule__FunctionDefinition__Group_11_2__13743);
            rule__FunctionDefinition__Group_11_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11_2__1"


    // $ANTLR start "rule__FunctionDefinition__Group_11_2__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1845:1: rule__FunctionDefinition__Group_11_2__1__Impl : ( ( rule__FunctionDefinition__UsesAssignment_11_2_1 ) ) ;
    public final void rule__FunctionDefinition__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1849:1: ( ( ( rule__FunctionDefinition__UsesAssignment_11_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1850:1: ( ( rule__FunctionDefinition__UsesAssignment_11_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1850:1: ( ( rule__FunctionDefinition__UsesAssignment_11_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1851:1: ( rule__FunctionDefinition__UsesAssignment_11_2_1 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1852:1: ( rule__FunctionDefinition__UsesAssignment_11_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1852:2: rule__FunctionDefinition__UsesAssignment_11_2_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__UsesAssignment_11_2_1_in_rule__FunctionDefinition__Group_11_2__1__Impl3770);
            rule__FunctionDefinition__UsesAssignment_11_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_11_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_11_2__1__Impl"


    // $ANTLR start "rule__FunctionUseMember__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1866:1: rule__FunctionUseMember__Group__0 : rule__FunctionUseMember__Group__0__Impl rule__FunctionUseMember__Group__1 ;
    public final void rule__FunctionUseMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1870:1: ( rule__FunctionUseMember__Group__0__Impl rule__FunctionUseMember__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1871:2: rule__FunctionUseMember__Group__0__Impl rule__FunctionUseMember__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__Group__0__Impl_in_rule__FunctionUseMember__Group__03804);
            rule__FunctionUseMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionUseMember__Group__1_in_rule__FunctionUseMember__Group__03807);
            rule__FunctionUseMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUseMember__Group__0"


    // $ANTLR start "rule__FunctionUseMember__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1878:1: rule__FunctionUseMember__Group__0__Impl : ( ( rule__FunctionUseMember__TypeAssignment_0 ) ) ;
    public final void rule__FunctionUseMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1882:1: ( ( ( rule__FunctionUseMember__TypeAssignment_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1883:1: ( ( rule__FunctionUseMember__TypeAssignment_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1883:1: ( ( rule__FunctionUseMember__TypeAssignment_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1884:1: ( rule__FunctionUseMember__TypeAssignment_0 )
            {
             before(grammarAccess.getFunctionUseMemberAccess().getTypeAssignment_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1885:1: ( rule__FunctionUseMember__TypeAssignment_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1885:2: rule__FunctionUseMember__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__TypeAssignment_0_in_rule__FunctionUseMember__Group__0__Impl3834);
            rule__FunctionUseMember__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionUseMemberAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUseMember__Group__0__Impl"


    // $ANTLR start "rule__FunctionUseMember__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1895:1: rule__FunctionUseMember__Group__1 : rule__FunctionUseMember__Group__1__Impl ;
    public final void rule__FunctionUseMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1899:1: ( rule__FunctionUseMember__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1900:2: rule__FunctionUseMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__Group__1__Impl_in_rule__FunctionUseMember__Group__13864);
            rule__FunctionUseMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUseMember__Group__1"


    // $ANTLR start "rule__FunctionUseMember__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1906:1: rule__FunctionUseMember__Group__1__Impl : ( ( rule__FunctionUseMember__NameAssignment_1 ) ) ;
    public final void rule__FunctionUseMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1910:1: ( ( ( rule__FunctionUseMember__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1911:1: ( ( rule__FunctionUseMember__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1911:1: ( ( rule__FunctionUseMember__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1912:1: ( rule__FunctionUseMember__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionUseMemberAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1913:1: ( rule__FunctionUseMember__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1913:2: rule__FunctionUseMember__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__NameAssignment_1_in_rule__FunctionUseMember__Group__1__Impl3891);
            rule__FunctionUseMember__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionUseMemberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUseMember__Group__1__Impl"


    // $ANTLR start "rule__FunctionParameterMember__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1927:1: rule__FunctionParameterMember__Group__0 : rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1 ;
    public final void rule__FunctionParameterMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1931:1: ( rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1932:2: rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__0__Impl_in_rule__FunctionParameterMember__Group__03925);
            rule__FunctionParameterMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__1_in_rule__FunctionParameterMember__Group__03928);
            rule__FunctionParameterMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__0"


    // $ANTLR start "rule__FunctionParameterMember__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1939:1: rule__FunctionParameterMember__Group__0__Impl : ( ( rule__FunctionParameterMember__TypeAssignment_0 ) ) ;
    public final void rule__FunctionParameterMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1943:1: ( ( ( rule__FunctionParameterMember__TypeAssignment_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1944:1: ( ( rule__FunctionParameterMember__TypeAssignment_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1944:1: ( ( rule__FunctionParameterMember__TypeAssignment_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1945:1: ( rule__FunctionParameterMember__TypeAssignment_0 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getTypeAssignment_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1946:1: ( rule__FunctionParameterMember__TypeAssignment_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1946:2: rule__FunctionParameterMember__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__TypeAssignment_0_in_rule__FunctionParameterMember__Group__0__Impl3955);
            rule__FunctionParameterMember__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParameterMemberAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__0__Impl"


    // $ANTLR start "rule__FunctionParameterMember__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1956:1: rule__FunctionParameterMember__Group__1 : rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2 ;
    public final void rule__FunctionParameterMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1960:1: ( rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1961:2: rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__1__Impl_in_rule__FunctionParameterMember__Group__13985);
            rule__FunctionParameterMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__2_in_rule__FunctionParameterMember__Group__13988);
            rule__FunctionParameterMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__1"


    // $ANTLR start "rule__FunctionParameterMember__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1968:1: rule__FunctionParameterMember__Group__1__Impl : ( ( rule__FunctionParameterMember__NameAssignment_1 ) ) ;
    public final void rule__FunctionParameterMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1972:1: ( ( ( rule__FunctionParameterMember__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1973:1: ( ( rule__FunctionParameterMember__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1973:1: ( ( rule__FunctionParameterMember__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1974:1: ( rule__FunctionParameterMember__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1975:1: ( rule__FunctionParameterMember__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1975:2: rule__FunctionParameterMember__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__NameAssignment_1_in_rule__FunctionParameterMember__Group__1__Impl4015);
            rule__FunctionParameterMember__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParameterMemberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__1__Impl"


    // $ANTLR start "rule__FunctionParameterMember__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1985:1: rule__FunctionParameterMember__Group__2 : rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3 ;
    public final void rule__FunctionParameterMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1989:1: ( rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1990:2: rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__2__Impl_in_rule__FunctionParameterMember__Group__24045);
            rule__FunctionParameterMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__3_in_rule__FunctionParameterMember__Group__24048);
            rule__FunctionParameterMember__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__2"


    // $ANTLR start "rule__FunctionParameterMember__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1997:1: rule__FunctionParameterMember__Group__2__Impl : ( ':' ) ;
    public final void rule__FunctionParameterMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2001:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2002:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2002:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2003:1: ':'
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionParameterMember__Group__2__Impl4076); 
             after(grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__2__Impl"


    // $ANTLR start "rule__FunctionParameterMember__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2016:1: rule__FunctionParameterMember__Group__3 : rule__FunctionParameterMember__Group__3__Impl ;
    public final void rule__FunctionParameterMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2020:1: ( rule__FunctionParameterMember__Group__3__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2021:2: rule__FunctionParameterMember__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__3__Impl_in_rule__FunctionParameterMember__Group__34107);
            rule__FunctionParameterMember__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__3"


    // $ANTLR start "rule__FunctionParameterMember__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2027:1: rule__FunctionParameterMember__Group__3__Impl : ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) ) ;
    public final void rule__FunctionParameterMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2031:1: ( ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2032:1: ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2032:1: ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2033:1: ( rule__FunctionParameterMember__ScopeAssignment_3 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getScopeAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2034:1: ( rule__FunctionParameterMember__ScopeAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2034:2: rule__FunctionParameterMember__ScopeAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__ScopeAssignment_3_in_rule__FunctionParameterMember__Group__3__Impl4134);
            rule__FunctionParameterMember__ScopeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParameterMemberAccess().getScopeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2052:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2056:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2057:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04172);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04175);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2064:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2068:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2069:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2069:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2070:1: ()
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2071:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2073:1: 
            {
            }

             after(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2083:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2087:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2088:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14233);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14236);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2095:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__QualifierAssignment_1 )? ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2099:1: ( ( ( rule__VariableDeclaration__QualifierAssignment_1 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2100:1: ( ( rule__VariableDeclaration__QualifierAssignment_1 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2100:1: ( ( rule__VariableDeclaration__QualifierAssignment_1 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2101:1: ( rule__VariableDeclaration__QualifierAssignment_1 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getQualifierAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2102:1: ( rule__VariableDeclaration__QualifierAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2102:2: rule__VariableDeclaration__QualifierAssignment_1
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__QualifierAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4263);
                    rule__VariableDeclaration__QualifierAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclarationAccess().getQualifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2112:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2116:1: ( rule__VariableDeclaration__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2117:2: rule__VariableDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24294);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2123:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__Alternatives_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2127:1: ( ( ( rule__VariableDeclaration__Alternatives_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2128:1: ( ( rule__VariableDeclaration__Alternatives_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2128:1: ( ( rule__VariableDeclaration__Alternatives_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2129:1: ( rule__VariableDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2130:1: ( rule__VariableDeclaration__Alternatives_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2130:2: rule__VariableDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Alternatives_2_in_rule__VariableDeclaration__Group__2__Impl4321);
            rule__VariableDeclaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2146:1: rule__VariableDeclaration__Group_2_0__0 : rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1 ;
    public final void rule__VariableDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2150:1: ( rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2151:2: rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__0__Impl_in_rule__VariableDeclaration__Group_2_0__04357);
            rule__VariableDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__1_in_rule__VariableDeclaration__Group_2_0__04360);
            rule__VariableDeclaration__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__0"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2158:1: rule__VariableDeclaration__Group_2_0__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) ) ;
    public final void rule__VariableDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2162:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2163:1: ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2163:1: ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2164:1: ( rule__VariableDeclaration__TypeAssignment_2_0_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_0_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2165:1: ( rule__VariableDeclaration__TypeAssignment_2_0_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2165:2: rule__VariableDeclaration__TypeAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_2_0_0_in_rule__VariableDeclaration__Group_2_0__0__Impl4387);
            rule__VariableDeclaration__TypeAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2175:1: rule__VariableDeclaration__Group_2_0__1 : rule__VariableDeclaration__Group_2_0__1__Impl ;
    public final void rule__VariableDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2179:1: ( rule__VariableDeclaration__Group_2_0__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2180:2: rule__VariableDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__1__Impl_in_rule__VariableDeclaration__Group_2_0__14417);
            rule__VariableDeclaration__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__1"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2186:1: rule__VariableDeclaration__Group_2_0__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) ) ;
    public final void rule__VariableDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2190:1: ( ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2191:1: ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2191:1: ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2192:1: ( rule__VariableDeclaration__NameAssignment_2_0_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2_0_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2193:1: ( rule__VariableDeclaration__NameAssignment_2_0_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2193:2: rule__VariableDeclaration__NameAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_0_1_in_rule__VariableDeclaration__Group_2_0__1__Impl4444);
            rule__VariableDeclaration__NameAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_0__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2207:1: rule__VariableDeclaration__Group_2_1__0 : rule__VariableDeclaration__Group_2_1__0__Impl rule__VariableDeclaration__Group_2_1__1 ;
    public final void rule__VariableDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2211:1: ( rule__VariableDeclaration__Group_2_1__0__Impl rule__VariableDeclaration__Group_2_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2212:2: rule__VariableDeclaration__Group_2_1__0__Impl rule__VariableDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__0__Impl_in_rule__VariableDeclaration__Group_2_1__04478);
            rule__VariableDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__1_in_rule__VariableDeclaration__Group_2_1__04481);
            rule__VariableDeclaration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__0"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2219:1: rule__VariableDeclaration__Group_2_1__0__Impl : ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) ) ;
    public final void rule__VariableDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2223:1: ( ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2224:1: ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2224:1: ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2225:1: ( rule__VariableDeclaration__CollectionAssignment_2_1_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getCollectionAssignment_2_1_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2226:1: ( rule__VariableDeclaration__CollectionAssignment_2_1_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2226:2: rule__VariableDeclaration__CollectionAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__CollectionAssignment_2_1_0_in_rule__VariableDeclaration__Group_2_1__0__Impl4508);
            rule__VariableDeclaration__CollectionAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getCollectionAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2236:1: rule__VariableDeclaration__Group_2_1__1 : rule__VariableDeclaration__Group_2_1__1__Impl rule__VariableDeclaration__Group_2_1__2 ;
    public final void rule__VariableDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2240:1: ( rule__VariableDeclaration__Group_2_1__1__Impl rule__VariableDeclaration__Group_2_1__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2241:2: rule__VariableDeclaration__Group_2_1__1__Impl rule__VariableDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__1__Impl_in_rule__VariableDeclaration__Group_2_1__14538);
            rule__VariableDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__2_in_rule__VariableDeclaration__Group_2_1__14541);
            rule__VariableDeclaration__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__1"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2248:1: rule__VariableDeclaration__Group_2_1__1__Impl : ( '<' ) ;
    public final void rule__VariableDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2252:1: ( ( '<' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2253:1: ( '<' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2253:1: ( '<' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2254:1: '<'
            {
             before(grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_2_1_1()); 
            match(input,34,FOLLOW_34_in_rule__VariableDeclaration__Group_2_1__1__Impl4569); 
             after(grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2267:1: rule__VariableDeclaration__Group_2_1__2 : rule__VariableDeclaration__Group_2_1__2__Impl rule__VariableDeclaration__Group_2_1__3 ;
    public final void rule__VariableDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2271:1: ( rule__VariableDeclaration__Group_2_1__2__Impl rule__VariableDeclaration__Group_2_1__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2272:2: rule__VariableDeclaration__Group_2_1__2__Impl rule__VariableDeclaration__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__2__Impl_in_rule__VariableDeclaration__Group_2_1__24600);
            rule__VariableDeclaration__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__3_in_rule__VariableDeclaration__Group_2_1__24603);
            rule__VariableDeclaration__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__2"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2279:1: rule__VariableDeclaration__Group_2_1__2__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) ) ;
    public final void rule__VariableDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2283:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2284:1: ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2284:1: ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2285:1: ( rule__VariableDeclaration__TypeAssignment_2_1_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_1_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2286:1: ( rule__VariableDeclaration__TypeAssignment_2_1_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2286:2: rule__VariableDeclaration__TypeAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_2_1_2_in_rule__VariableDeclaration__Group_2_1__2__Impl4630);
            rule__VariableDeclaration__TypeAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2296:1: rule__VariableDeclaration__Group_2_1__3 : rule__VariableDeclaration__Group_2_1__3__Impl rule__VariableDeclaration__Group_2_1__4 ;
    public final void rule__VariableDeclaration__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2300:1: ( rule__VariableDeclaration__Group_2_1__3__Impl rule__VariableDeclaration__Group_2_1__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2301:2: rule__VariableDeclaration__Group_2_1__3__Impl rule__VariableDeclaration__Group_2_1__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__3__Impl_in_rule__VariableDeclaration__Group_2_1__34660);
            rule__VariableDeclaration__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__4_in_rule__VariableDeclaration__Group_2_1__34663);
            rule__VariableDeclaration__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__3"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2308:1: rule__VariableDeclaration__Group_2_1__3__Impl : ( '>' ) ;
    public final void rule__VariableDeclaration__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2312:1: ( ( '>' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2313:1: ( '>' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2313:1: ( '>' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2314:1: '>'
            {
             before(grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_2_1_3()); 
            match(input,35,FOLLOW_35_in_rule__VariableDeclaration__Group_2_1__3__Impl4691); 
             after(grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2327:1: rule__VariableDeclaration__Group_2_1__4 : rule__VariableDeclaration__Group_2_1__4__Impl ;
    public final void rule__VariableDeclaration__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2331:1: ( rule__VariableDeclaration__Group_2_1__4__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2332:2: rule__VariableDeclaration__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__4__Impl_in_rule__VariableDeclaration__Group_2_1__44722);
            rule__VariableDeclaration__Group_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__4"


    // $ANTLR start "rule__VariableDeclaration__Group_2_1__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2338:1: rule__VariableDeclaration__Group_2_1__4__Impl : ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) ) ;
    public final void rule__VariableDeclaration__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2342:1: ( ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2343:1: ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2343:1: ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2344:1: ( rule__VariableDeclaration__NameAssignment_2_1_4 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2_1_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2345:1: ( rule__VariableDeclaration__NameAssignment_2_1_4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2345:2: rule__VariableDeclaration__NameAssignment_2_1_4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_1_4_in_rule__VariableDeclaration__Group_2_1__4__Impl4749);
            rule__VariableDeclaration__NameAssignment_2_1_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_2_1__4__Impl"


    // $ANTLR start "rule__VariableType__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2365:1: rule__VariableType__Group__0 : rule__VariableType__Group__0__Impl rule__VariableType__Group__1 ;
    public final void rule__VariableType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2369:1: ( rule__VariableType__Group__0__Impl rule__VariableType__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2370:2: rule__VariableType__Group__0__Impl rule__VariableType__Group__1
            {
            pushFollow(FOLLOW_rule__VariableType__Group__0__Impl_in_rule__VariableType__Group__04789);
            rule__VariableType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableType__Group__1_in_rule__VariableType__Group__04792);
            rule__VariableType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__Group__0"


    // $ANTLR start "rule__VariableType__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2377:1: rule__VariableType__Group__0__Impl : ( () ) ;
    public final void rule__VariableType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2381:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2382:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2382:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2383:1: ()
            {
             before(grammarAccess.getVariableTypeAccess().getVariableTypeAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2384:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2386:1: 
            {
            }

             after(grammarAccess.getVariableTypeAccess().getVariableTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__Group__0__Impl"


    // $ANTLR start "rule__VariableType__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2396:1: rule__VariableType__Group__1 : rule__VariableType__Group__1__Impl ;
    public final void rule__VariableType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2400:1: ( rule__VariableType__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2401:2: rule__VariableType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableType__Group__1__Impl_in_rule__VariableType__Group__14850);
            rule__VariableType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__Group__1"


    // $ANTLR start "rule__VariableType__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2407:1: rule__VariableType__Group__1__Impl : ( ( rule__VariableType__PrimitiveAssignment_1 ) ) ;
    public final void rule__VariableType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2411:1: ( ( ( rule__VariableType__PrimitiveAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2412:1: ( ( rule__VariableType__PrimitiveAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2412:1: ( ( rule__VariableType__PrimitiveAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2413:1: ( rule__VariableType__PrimitiveAssignment_1 )
            {
             before(grammarAccess.getVariableTypeAccess().getPrimitiveAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2414:1: ( rule__VariableType__PrimitiveAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2414:2: rule__VariableType__PrimitiveAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableType__PrimitiveAssignment_1_in_rule__VariableType__Group__1__Impl4877);
            rule__VariableType__PrimitiveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getPrimitiveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__Group__1__Impl"


    // $ANTLR start "rule__VariableQualifier__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2428:1: rule__VariableQualifier__Group__0 : rule__VariableQualifier__Group__0__Impl rule__VariableQualifier__Group__1 ;
    public final void rule__VariableQualifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2432:1: ( rule__VariableQualifier__Group__0__Impl rule__VariableQualifier__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2433:2: rule__VariableQualifier__Group__0__Impl rule__VariableQualifier__Group__1
            {
            pushFollow(FOLLOW_rule__VariableQualifier__Group__0__Impl_in_rule__VariableQualifier__Group__04911);
            rule__VariableQualifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableQualifier__Group__1_in_rule__VariableQualifier__Group__04914);
            rule__VariableQualifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableQualifier__Group__0"


    // $ANTLR start "rule__VariableQualifier__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2440:1: rule__VariableQualifier__Group__0__Impl : ( () ) ;
    public final void rule__VariableQualifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2444:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2445:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2445:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2446:1: ()
            {
             before(grammarAccess.getVariableQualifierAccess().getVariableQualifierAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2447:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2449:1: 
            {
            }

             after(grammarAccess.getVariableQualifierAccess().getVariableQualifierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableQualifier__Group__0__Impl"


    // $ANTLR start "rule__VariableQualifier__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2459:1: rule__VariableQualifier__Group__1 : rule__VariableQualifier__Group__1__Impl ;
    public final void rule__VariableQualifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2463:1: ( rule__VariableQualifier__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2464:2: rule__VariableQualifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableQualifier__Group__1__Impl_in_rule__VariableQualifier__Group__14972);
            rule__VariableQualifier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableQualifier__Group__1"


    // $ANTLR start "rule__VariableQualifier__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2470:1: rule__VariableQualifier__Group__1__Impl : ( 'observable' ) ;
    public final void rule__VariableQualifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2474:1: ( ( 'observable' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2475:1: ( 'observable' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2475:1: ( 'observable' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2476:1: 'observable'
            {
             before(grammarAccess.getVariableQualifierAccess().getObservableKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__VariableQualifier__Group__1__Impl5000); 
             after(grammarAccess.getVariableQualifierAccess().getObservableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableQualifier__Group__1__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2493:1: rule__VariableAttribute__Group__0 : rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 ;
    public final void rule__VariableAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2497:1: ( rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2498:2: rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__0__Impl_in_rule__VariableAttribute__Group__05035);
            rule__VariableAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group__1_in_rule__VariableAttribute__Group__05038);
            rule__VariableAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__0"


    // $ANTLR start "rule__VariableAttribute__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2505:1: rule__VariableAttribute__Group__0__Impl : ( () ) ;
    public final void rule__VariableAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2509:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2510:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2510:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2511:1: ()
            {
             before(grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2512:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2514:1: 
            {
            }

             after(grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__0__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2524:1: rule__VariableAttribute__Group__1 : rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 ;
    public final void rule__VariableAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2528:1: ( rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2529:2: rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__1__Impl_in_rule__VariableAttribute__Group__15096);
            rule__VariableAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group__2_in_rule__VariableAttribute__Group__15099);
            rule__VariableAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__1"


    // $ANTLR start "rule__VariableAttribute__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2536:1: rule__VariableAttribute__Group__1__Impl : ( ( rule__VariableAttribute__NameAssignment_1 ) ) ;
    public final void rule__VariableAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2540:1: ( ( ( rule__VariableAttribute__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2541:1: ( ( rule__VariableAttribute__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2541:1: ( ( rule__VariableAttribute__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2542:1: ( rule__VariableAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAttributeAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2543:1: ( rule__VariableAttribute__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2543:2: rule__VariableAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__NameAssignment_1_in_rule__VariableAttribute__Group__1__Impl5126);
            rule__VariableAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__1__Impl"


    // $ANTLR start "rule__VariableAttribute__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2553:1: rule__VariableAttribute__Group__2 : rule__VariableAttribute__Group__2__Impl ;
    public final void rule__VariableAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2557:1: ( rule__VariableAttribute__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2558:2: rule__VariableAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__2__Impl_in_rule__VariableAttribute__Group__25156);
            rule__VariableAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__2"


    // $ANTLR start "rule__VariableAttribute__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2564:1: rule__VariableAttribute__Group__2__Impl : ( ( rule__VariableAttribute__Group_2__0 )? ) ;
    public final void rule__VariableAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2568:1: ( ( ( rule__VariableAttribute__Group_2__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2569:1: ( ( rule__VariableAttribute__Group_2__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2569:1: ( ( rule__VariableAttribute__Group_2__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2570:1: ( rule__VariableAttribute__Group_2__0 )?
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2571:1: ( rule__VariableAttribute__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2571:2: rule__VariableAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VariableAttribute__Group_2__0_in_rule__VariableAttribute__Group__2__Impl5183);
                    rule__VariableAttribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAttributeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group__2__Impl"


    // $ANTLR start "rule__VariableAttribute__Group_2__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2587:1: rule__VariableAttribute__Group_2__0 : rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1 ;
    public final void rule__VariableAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2591:1: ( rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2592:2: rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__0__Impl_in_rule__VariableAttribute__Group_2__05220);
            rule__VariableAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__1_in_rule__VariableAttribute__Group_2__05223);
            rule__VariableAttribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_2__0"


    // $ANTLR start "rule__VariableAttribute__Group_2__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2599:1: rule__VariableAttribute__Group_2__0__Impl : ( '.' ) ;
    public final void rule__VariableAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2603:1: ( ( '.' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2604:1: ( '.' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2604:1: ( '.' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2605:1: '.'
            {
             before(grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__VariableAttribute__Group_2__0__Impl5251); 
             after(grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_2__0__Impl"


    // $ANTLR start "rule__VariableAttribute__Group_2__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2618:1: rule__VariableAttribute__Group_2__1 : rule__VariableAttribute__Group_2__1__Impl ;
    public final void rule__VariableAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2622:1: ( rule__VariableAttribute__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2623:2: rule__VariableAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__1__Impl_in_rule__VariableAttribute__Group_2__15282);
            rule__VariableAttribute__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_2__1"


    // $ANTLR start "rule__VariableAttribute__Group_2__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2629:1: rule__VariableAttribute__Group_2__1__Impl : ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) ) ;
    public final void rule__VariableAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2633:1: ( ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2634:1: ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2634:1: ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2635:1: ( rule__VariableAttribute__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getVariableAttributeAccess().getAttributeAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2636:1: ( rule__VariableAttribute__AttributeAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2636:2: rule__VariableAttribute__AttributeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__AttributeAssignment_2_1_in_rule__VariableAttribute__Group_2__1__Impl5309);
            rule__VariableAttribute__AttributeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getAttributeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__Group_2__1__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2650:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2654:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2655:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__05343);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__05346);
            rule__VariableAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__0"


    // $ANTLR start "rule__VariableAssignment__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2662:1: rule__VariableAssignment__Group__0__Impl : ( () ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2666:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2667:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2667:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2668:1: ()
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2669:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2671:1: 
            {
            }

             after(grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__0__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2681:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2685:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2686:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__15404);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__15407);
            rule__VariableAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__1"


    // $ANTLR start "rule__VariableAssignment__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2693:1: rule__VariableAssignment__Group__1__Impl : ( ( rule__VariableAssignment__VariableAssignment_1 ) ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2697:1: ( ( ( rule__VariableAssignment__VariableAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2698:1: ( ( rule__VariableAssignment__VariableAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2698:1: ( ( rule__VariableAssignment__VariableAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2699:1: ( rule__VariableAssignment__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2700:1: ( rule__VariableAssignment__VariableAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2700:2: rule__VariableAssignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__VariableAssignment_1_in_rule__VariableAssignment__Group__1__Impl5434);
            rule__VariableAssignment__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__1__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2710:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3 ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2714:1: ( rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2715:2: rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__25464);
            rule__VariableAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__3_in_rule__VariableAssignment__Group__25467);
            rule__VariableAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__2"


    // $ANTLR start "rule__VariableAssignment__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2722:1: rule__VariableAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2726:1: ( ( '=' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2727:1: ( '=' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2727:1: ( '=' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2728:1: '='
            {
             before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__VariableAssignment__Group__2__Impl5495); 
             after(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__2__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2741:1: rule__VariableAssignment__Group__3 : rule__VariableAssignment__Group__3__Impl ;
    public final void rule__VariableAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2745:1: ( rule__VariableAssignment__Group__3__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2746:2: rule__VariableAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__3__Impl_in_rule__VariableAssignment__Group__35526);
            rule__VariableAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__3"


    // $ANTLR start "rule__VariableAssignment__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2752:1: rule__VariableAssignment__Group__3__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2756:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2757:1: ( ( rule__VariableAssignment__ExpressionAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2757:1: ( ( rule__VariableAssignment__ExpressionAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2758:1: ( rule__VariableAssignment__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2759:1: ( rule__VariableAssignment__ExpressionAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2759:2: rule__VariableAssignment__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableAssignment__ExpressionAssignment_3_in_rule__VariableAssignment__Group__3__Impl5553);
            rule__VariableAssignment__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__3__Impl"


    // $ANTLR start "rule__VariableExpression__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2777:1: rule__VariableExpression__Group__0 : rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1 ;
    public final void rule__VariableExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2781:1: ( rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2782:2: rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__0__Impl_in_rule__VariableExpression__Group__05591);
            rule__VariableExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group__1_in_rule__VariableExpression__Group__05594);
            rule__VariableExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group__0"


    // $ANTLR start "rule__VariableExpression__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2789:1: rule__VariableExpression__Group__0__Impl : ( () ) ;
    public final void rule__VariableExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2793:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2794:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2794:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2795:1: ()
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2796:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2798:1: 
            {
            }

             after(grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group__0__Impl"


    // $ANTLR start "rule__VariableExpression__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2808:1: rule__VariableExpression__Group__1 : rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2 ;
    public final void rule__VariableExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2812:1: ( rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2813:2: rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__1__Impl_in_rule__VariableExpression__Group__15652);
            rule__VariableExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group__2_in_rule__VariableExpression__Group__15655);
            rule__VariableExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group__1"


    // $ANTLR start "rule__VariableExpression__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2820:1: rule__VariableExpression__Group__1__Impl : ( ( rule__VariableExpression__MembersAssignment_1 ) ) ;
    public final void rule__VariableExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2824:1: ( ( ( rule__VariableExpression__MembersAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2825:1: ( ( rule__VariableExpression__MembersAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2825:1: ( ( rule__VariableExpression__MembersAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2826:1: ( rule__VariableExpression__MembersAssignment_1 )
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2827:1: ( rule__VariableExpression__MembersAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2827:2: rule__VariableExpression__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableExpression__MembersAssignment_1_in_rule__VariableExpression__Group__1__Impl5682);
            rule__VariableExpression__MembersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpressionAccess().getMembersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group__1__Impl"


    // $ANTLR start "rule__VariableExpression__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2837:1: rule__VariableExpression__Group__2 : rule__VariableExpression__Group__2__Impl ;
    public final void rule__VariableExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2841:1: ( rule__VariableExpression__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2842:2: rule__VariableExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__2__Impl_in_rule__VariableExpression__Group__25712);
            rule__VariableExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group__2"


    // $ANTLR start "rule__VariableExpression__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2848:1: rule__VariableExpression__Group__2__Impl : ( ( rule__VariableExpression__Group_2__0 )* ) ;
    public final void rule__VariableExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2852:1: ( ( ( rule__VariableExpression__Group_2__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2853:1: ( ( rule__VariableExpression__Group_2__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2853:1: ( ( rule__VariableExpression__Group_2__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2854:1: ( rule__VariableExpression__Group_2__0 )*
            {
             before(grammarAccess.getVariableExpressionAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2855:1: ( rule__VariableExpression__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=14 && LA19_0<=16)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2855:2: rule__VariableExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableExpression__Group_2__0_in_rule__VariableExpression__Group__2__Impl5739);
            	    rule__VariableExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getVariableExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group__2__Impl"


    // $ANTLR start "rule__VariableExpression__Group_2__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2871:1: rule__VariableExpression__Group_2__0 : rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1 ;
    public final void rule__VariableExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2875:1: ( rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2876:2: rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group_2__0__Impl_in_rule__VariableExpression__Group_2__05776);
            rule__VariableExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group_2__1_in_rule__VariableExpression__Group_2__05779);
            rule__VariableExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group_2__0"


    // $ANTLR start "rule__VariableExpression__Group_2__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2883:1: rule__VariableExpression__Group_2__0__Impl : ( ruleVariableExpressionOperator ) ;
    public final void rule__VariableExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2887:1: ( ( ruleVariableExpressionOperator ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2888:1: ( ruleVariableExpressionOperator )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2888:1: ( ruleVariableExpressionOperator )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2889:1: ruleVariableExpressionOperator
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_rule__VariableExpression__Group_2__0__Impl5806);
            ruleVariableExpressionOperator();

            state._fsp--;

             after(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group_2__0__Impl"


    // $ANTLR start "rule__VariableExpression__Group_2__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2900:1: rule__VariableExpression__Group_2__1 : rule__VariableExpression__Group_2__1__Impl ;
    public final void rule__VariableExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2904:1: ( rule__VariableExpression__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2905:2: rule__VariableExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group_2__1__Impl_in_rule__VariableExpression__Group_2__15835);
            rule__VariableExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group_2__1"


    // $ANTLR start "rule__VariableExpression__Group_2__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2911:1: rule__VariableExpression__Group_2__1__Impl : ( ( rule__VariableExpression__MembersAssignment_2_1 ) ) ;
    public final void rule__VariableExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2915:1: ( ( ( rule__VariableExpression__MembersAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2916:1: ( ( rule__VariableExpression__MembersAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2916:1: ( ( rule__VariableExpression__MembersAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2917:1: ( rule__VariableExpression__MembersAssignment_2_1 )
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2918:1: ( rule__VariableExpression__MembersAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2918:2: rule__VariableExpression__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariableExpression__MembersAssignment_2_1_in_rule__VariableExpression__Group_2__1__Impl5862);
            rule__VariableExpression__MembersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpressionAccess().getMembersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__Group_2__1__Impl"


    // $ANTLR start "rule__RuleDefinition__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2932:1: rule__RuleDefinition__Group__0 : rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1 ;
    public final void rule__RuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2936:1: ( rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2937:2: rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__0__Impl_in_rule__RuleDefinition__Group__05896);
            rule__RuleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__1_in_rule__RuleDefinition__Group__05899);
            rule__RuleDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__0"


    // $ANTLR start "rule__RuleDefinition__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2944:1: rule__RuleDefinition__Group__0__Impl : ( () ) ;
    public final void rule__RuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2948:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2949:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2949:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2950:1: ()
            {
             before(grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2951:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2953:1: 
            {
            }

             after(grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__0__Impl"


    // $ANTLR start "rule__RuleDefinition__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2963:1: rule__RuleDefinition__Group__1 : rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2 ;
    public final void rule__RuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2967:1: ( rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2968:2: rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__1__Impl_in_rule__RuleDefinition__Group__15957);
            rule__RuleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__2_in_rule__RuleDefinition__Group__15960);
            rule__RuleDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__1"


    // $ANTLR start "rule__RuleDefinition__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2975:1: rule__RuleDefinition__Group__1__Impl : ( 'RULE' ) ;
    public final void rule__RuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2979:1: ( ( 'RULE' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2980:1: ( 'RULE' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2980:1: ( 'RULE' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2981:1: 'RULE'
            {
             before(grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__RuleDefinition__Group__1__Impl5988); 
             after(grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__1__Impl"


    // $ANTLR start "rule__RuleDefinition__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2994:1: rule__RuleDefinition__Group__2 : rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3 ;
    public final void rule__RuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2998:1: ( rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2999:2: rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__2__Impl_in_rule__RuleDefinition__Group__26019);
            rule__RuleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__3_in_rule__RuleDefinition__Group__26022);
            rule__RuleDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__2"


    // $ANTLR start "rule__RuleDefinition__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3006:1: rule__RuleDefinition__Group__2__Impl : ( ( rule__RuleDefinition__NameAssignment_2 ) ) ;
    public final void rule__RuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3010:1: ( ( ( rule__RuleDefinition__NameAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3011:1: ( ( rule__RuleDefinition__NameAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3011:1: ( ( rule__RuleDefinition__NameAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3012:1: ( rule__RuleDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getNameAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3013:1: ( rule__RuleDefinition__NameAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3013:2: rule__RuleDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RuleDefinition__NameAssignment_2_in_rule__RuleDefinition__Group__2__Impl6049);
            rule__RuleDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__2__Impl"


    // $ANTLR start "rule__RuleDefinition__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3023:1: rule__RuleDefinition__Group__3 : rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4 ;
    public final void rule__RuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3027:1: ( rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3028:2: rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__3__Impl_in_rule__RuleDefinition__Group__36079);
            rule__RuleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__4_in_rule__RuleDefinition__Group__36082);
            rule__RuleDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__3"


    // $ANTLR start "rule__RuleDefinition__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3035:1: rule__RuleDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__RuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3039:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3040:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3040:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3041:1: ':'
            {
             before(grammarAccess.getRuleDefinitionAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__RuleDefinition__Group__3__Impl6110); 
             after(grammarAccess.getRuleDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__3__Impl"


    // $ANTLR start "rule__RuleDefinition__Group__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3054:1: rule__RuleDefinition__Group__4 : rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5 ;
    public final void rule__RuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3058:1: ( rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3059:2: rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__4__Impl_in_rule__RuleDefinition__Group__46141);
            rule__RuleDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__5_in_rule__RuleDefinition__Group__46144);
            rule__RuleDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__4"


    // $ANTLR start "rule__RuleDefinition__Group__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3066:1: rule__RuleDefinition__Group__4__Impl : ( ( rule__RuleDefinition__Group_4__0 )? ) ;
    public final void rule__RuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3070:1: ( ( ( rule__RuleDefinition__Group_4__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3071:1: ( ( rule__RuleDefinition__Group_4__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3071:1: ( ( rule__RuleDefinition__Group_4__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3072:1: ( rule__RuleDefinition__Group_4__0 )?
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3073:1: ( rule__RuleDefinition__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3073:2: rule__RuleDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RuleDefinition__Group_4__0_in_rule__RuleDefinition__Group__4__Impl6171);
                    rule__RuleDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__4__Impl"


    // $ANTLR start "rule__RuleDefinition__Group__5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3083:1: rule__RuleDefinition__Group__5 : rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6 ;
    public final void rule__RuleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3087:1: ( rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3088:2: rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__5__Impl_in_rule__RuleDefinition__Group__56202);
            rule__RuleDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__6_in_rule__RuleDefinition__Group__56205);
            rule__RuleDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__5"


    // $ANTLR start "rule__RuleDefinition__Group__5__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3095:1: rule__RuleDefinition__Group__5__Impl : ( ( rule__RuleDefinition__Alternatives_5 ) ) ;
    public final void rule__RuleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3099:1: ( ( ( rule__RuleDefinition__Alternatives_5 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3100:1: ( ( rule__RuleDefinition__Alternatives_5 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3100:1: ( ( rule__RuleDefinition__Alternatives_5 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3101:1: ( rule__RuleDefinition__Alternatives_5 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getAlternatives_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3102:1: ( rule__RuleDefinition__Alternatives_5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3102:2: rule__RuleDefinition__Alternatives_5
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Alternatives_5_in_rule__RuleDefinition__Group__5__Impl6232);
            rule__RuleDefinition__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefinitionAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__5__Impl"


    // $ANTLR start "rule__RuleDefinition__Group__6"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3112:1: rule__RuleDefinition__Group__6 : rule__RuleDefinition__Group__6__Impl ;
    public final void rule__RuleDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3116:1: ( rule__RuleDefinition__Group__6__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3117:2: rule__RuleDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__6__Impl_in_rule__RuleDefinition__Group__66262);
            rule__RuleDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__6"


    // $ANTLR start "rule__RuleDefinition__Group__6__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3123:1: rule__RuleDefinition__Group__6__Impl : ( ( rule__RuleDefinition__Group_6__0 )? ) ;
    public final void rule__RuleDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3127:1: ( ( ( rule__RuleDefinition__Group_6__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3128:1: ( ( rule__RuleDefinition__Group_6__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3128:1: ( ( rule__RuleDefinition__Group_6__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3129:1: ( rule__RuleDefinition__Group_6__0 )?
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_6()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3130:1: ( rule__RuleDefinition__Group_6__0 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3130:2: rule__RuleDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RuleDefinition__Group_6__0_in_rule__RuleDefinition__Group__6__Impl6289);
                    rule__RuleDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group__6__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_4__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3154:1: rule__RuleDefinition__Group_4__0 : rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1 ;
    public final void rule__RuleDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3158:1: ( rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3159:2: rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__0__Impl_in_rule__RuleDefinition__Group_4__06334);
            rule__RuleDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__1_in_rule__RuleDefinition__Group_4__06337);
            rule__RuleDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4__0"


    // $ANTLR start "rule__RuleDefinition__Group_4__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3166:1: rule__RuleDefinition__Group_4__0__Impl : ( ( rule__RuleDefinition__LhsAssignment_4_0 ) ) ;
    public final void rule__RuleDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3170:1: ( ( ( rule__RuleDefinition__LhsAssignment_4_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3171:1: ( ( rule__RuleDefinition__LhsAssignment_4_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3171:1: ( ( rule__RuleDefinition__LhsAssignment_4_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3172:1: ( rule__RuleDefinition__LhsAssignment_4_0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3173:1: ( rule__RuleDefinition__LhsAssignment_4_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3173:2: rule__RuleDefinition__LhsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__LhsAssignment_4_0_in_rule__RuleDefinition__Group_4__0__Impl6364);
            rule__RuleDefinition__LhsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_4__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3183:1: rule__RuleDefinition__Group_4__1 : rule__RuleDefinition__Group_4__1__Impl ;
    public final void rule__RuleDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3187:1: ( rule__RuleDefinition__Group_4__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3188:2: rule__RuleDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__1__Impl_in_rule__RuleDefinition__Group_4__16394);
            rule__RuleDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4__1"


    // $ANTLR start "rule__RuleDefinition__Group_4__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3194:1: rule__RuleDefinition__Group_4__1__Impl : ( ( rule__RuleDefinition__Group_4_1__0 )* ) ;
    public final void rule__RuleDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3198:1: ( ( ( rule__RuleDefinition__Group_4_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3199:1: ( ( rule__RuleDefinition__Group_4_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3199:1: ( ( rule__RuleDefinition__Group_4_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3200:1: ( rule__RuleDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_4_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3201:1: ( rule__RuleDefinition__Group_4_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3201:2: rule__RuleDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__0_in_rule__RuleDefinition__Group_4__1__Impl6421);
            	    rule__RuleDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRuleDefinitionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_4_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3215:1: rule__RuleDefinition__Group_4_1__0 : rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1 ;
    public final void rule__RuleDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3219:1: ( rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3220:2: rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__0__Impl_in_rule__RuleDefinition__Group_4_1__06456);
            rule__RuleDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__1_in_rule__RuleDefinition__Group_4_1__06459);
            rule__RuleDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4_1__0"


    // $ANTLR start "rule__RuleDefinition__Group_4_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3227:1: rule__RuleDefinition__Group_4_1__0__Impl : ( '+' ) ;
    public final void rule__RuleDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3231:1: ( ( '+' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3232:1: ( '+' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3232:1: ( '+' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3233:1: '+'
            {
             before(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0()); 
            match(input,14,FOLLOW_14_in_rule__RuleDefinition__Group_4_1__0__Impl6487); 
             after(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_4_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3246:1: rule__RuleDefinition__Group_4_1__1 : rule__RuleDefinition__Group_4_1__1__Impl ;
    public final void rule__RuleDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3250:1: ( rule__RuleDefinition__Group_4_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3251:2: rule__RuleDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__1__Impl_in_rule__RuleDefinition__Group_4_1__16518);
            rule__RuleDefinition__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4_1__1"


    // $ANTLR start "rule__RuleDefinition__Group_4_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3257:1: rule__RuleDefinition__Group_4_1__1__Impl : ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) ) ;
    public final void rule__RuleDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3261:1: ( ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3262:1: ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3262:1: ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3263:1: ( rule__RuleDefinition__LhsAssignment_4_1_1 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3264:1: ( rule__RuleDefinition__LhsAssignment_4_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3264:2: rule__RuleDefinition__LhsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__LhsAssignment_4_1_1_in_rule__RuleDefinition__Group_4_1__1__Impl6545);
            rule__RuleDefinition__LhsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_6__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3278:1: rule__RuleDefinition__Group_6__0 : rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1 ;
    public final void rule__RuleDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3282:1: ( rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3283:2: rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__0__Impl_in_rule__RuleDefinition__Group_6__06579);
            rule__RuleDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__1_in_rule__RuleDefinition__Group_6__06582);
            rule__RuleDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6__0"


    // $ANTLR start "rule__RuleDefinition__Group_6__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3290:1: rule__RuleDefinition__Group_6__0__Impl : ( ( rule__RuleDefinition__RhsAssignment_6_0 ) ) ;
    public final void rule__RuleDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3294:1: ( ( ( rule__RuleDefinition__RhsAssignment_6_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3295:1: ( ( rule__RuleDefinition__RhsAssignment_6_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3295:1: ( ( rule__RuleDefinition__RhsAssignment_6_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3296:1: ( rule__RuleDefinition__RhsAssignment_6_0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3297:1: ( rule__RuleDefinition__RhsAssignment_6_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3297:2: rule__RuleDefinition__RhsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__RhsAssignment_6_0_in_rule__RuleDefinition__Group_6__0__Impl6609);
            rule__RuleDefinition__RhsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_6__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3307:1: rule__RuleDefinition__Group_6__1 : rule__RuleDefinition__Group_6__1__Impl ;
    public final void rule__RuleDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3311:1: ( rule__RuleDefinition__Group_6__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3312:2: rule__RuleDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__1__Impl_in_rule__RuleDefinition__Group_6__16639);
            rule__RuleDefinition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6__1"


    // $ANTLR start "rule__RuleDefinition__Group_6__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3318:1: rule__RuleDefinition__Group_6__1__Impl : ( ( rule__RuleDefinition__Group_6_1__0 )* ) ;
    public final void rule__RuleDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3322:1: ( ( ( rule__RuleDefinition__Group_6_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3323:1: ( ( rule__RuleDefinition__Group_6_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3323:1: ( ( rule__RuleDefinition__Group_6_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3324:1: ( rule__RuleDefinition__Group_6_1__0 )*
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_6_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3325:1: ( rule__RuleDefinition__Group_6_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3325:2: rule__RuleDefinition__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__0_in_rule__RuleDefinition__Group_6__1__Impl6666);
            	    rule__RuleDefinition__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRuleDefinitionAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_6_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3339:1: rule__RuleDefinition__Group_6_1__0 : rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1 ;
    public final void rule__RuleDefinition__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3343:1: ( rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3344:2: rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__0__Impl_in_rule__RuleDefinition__Group_6_1__06701);
            rule__RuleDefinition__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__1_in_rule__RuleDefinition__Group_6_1__06704);
            rule__RuleDefinition__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6_1__0"


    // $ANTLR start "rule__RuleDefinition__Group_6_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3351:1: rule__RuleDefinition__Group_6_1__0__Impl : ( '+' ) ;
    public final void rule__RuleDefinition__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3355:1: ( ( '+' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3356:1: ( '+' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3356:1: ( '+' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3357:1: '+'
            {
             before(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0()); 
            match(input,14,FOLLOW_14_in_rule__RuleDefinition__Group_6_1__0__Impl6732); 
             after(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6_1__0__Impl"


    // $ANTLR start "rule__RuleDefinition__Group_6_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3370:1: rule__RuleDefinition__Group_6_1__1 : rule__RuleDefinition__Group_6_1__1__Impl ;
    public final void rule__RuleDefinition__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3374:1: ( rule__RuleDefinition__Group_6_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3375:2: rule__RuleDefinition__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__1__Impl_in_rule__RuleDefinition__Group_6_1__16763);
            rule__RuleDefinition__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6_1__1"


    // $ANTLR start "rule__RuleDefinition__Group_6_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3381:1: rule__RuleDefinition__Group_6_1__1__Impl : ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) ) ;
    public final void rule__RuleDefinition__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3385:1: ( ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3386:1: ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3386:1: ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3387:1: ( rule__RuleDefinition__RhsAssignment_6_1_1 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3388:1: ( rule__RuleDefinition__RhsAssignment_6_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3388:2: rule__RuleDefinition__RhsAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__RhsAssignment_6_1_1_in_rule__RuleDefinition__Group_6_1__1__Impl6790);
            rule__RuleDefinition__RhsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__Group_6_1__1__Impl"


    // $ANTLR start "rule__RuleObject__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3402:1: rule__RuleObject__Group__0 : rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1 ;
    public final void rule__RuleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3406:1: ( rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3407:2: rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__0__Impl_in_rule__RuleObject__Group__06824);
            rule__RuleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group__1_in_rule__RuleObject__Group__06827);
            rule__RuleObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group__0"


    // $ANTLR start "rule__RuleObject__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3414:1: rule__RuleObject__Group__0__Impl : ( () ) ;
    public final void rule__RuleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3418:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3419:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3419:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3420:1: ()
            {
             before(grammarAccess.getRuleObjectAccess().getRuleObjectAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3421:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3423:1: 
            {
            }

             after(grammarAccess.getRuleObjectAccess().getRuleObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group__0__Impl"


    // $ANTLR start "rule__RuleObject__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3433:1: rule__RuleObject__Group__1 : rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2 ;
    public final void rule__RuleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3437:1: ( rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3438:2: rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__1__Impl_in_rule__RuleObject__Group__16885);
            rule__RuleObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group__2_in_rule__RuleObject__Group__16888);
            rule__RuleObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group__1"


    // $ANTLR start "rule__RuleObject__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3445:1: rule__RuleObject__Group__1__Impl : ( ( rule__RuleObject__SubobjectsAssignment_1 ) ) ;
    public final void rule__RuleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3449:1: ( ( ( rule__RuleObject__SubobjectsAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3450:1: ( ( rule__RuleObject__SubobjectsAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3450:1: ( ( rule__RuleObject__SubobjectsAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3451:1: ( rule__RuleObject__SubobjectsAssignment_1 )
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3452:1: ( rule__RuleObject__SubobjectsAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3452:2: rule__RuleObject__SubobjectsAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleObject__SubobjectsAssignment_1_in_rule__RuleObject__Group__1__Impl6915);
            rule__RuleObject__SubobjectsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group__1__Impl"


    // $ANTLR start "rule__RuleObject__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3462:1: rule__RuleObject__Group__2 : rule__RuleObject__Group__2__Impl ;
    public final void rule__RuleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3466:1: ( rule__RuleObject__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3467:2: rule__RuleObject__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__2__Impl_in_rule__RuleObject__Group__26945);
            rule__RuleObject__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group__2"


    // $ANTLR start "rule__RuleObject__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3473:1: rule__RuleObject__Group__2__Impl : ( ( rule__RuleObject__Group_2__0 )* ) ;
    public final void rule__RuleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3477:1: ( ( ( rule__RuleObject__Group_2__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3478:1: ( ( rule__RuleObject__Group_2__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3478:1: ( ( rule__RuleObject__Group_2__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3479:1: ( rule__RuleObject__Group_2__0 )*
            {
             before(grammarAccess.getRuleObjectAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3480:1: ( rule__RuleObject__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3480:2: rule__RuleObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleObject__Group_2__0_in_rule__RuleObject__Group__2__Impl6972);
            	    rule__RuleObject__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getRuleObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group__2__Impl"


    // $ANTLR start "rule__RuleObject__Group_2__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3496:1: rule__RuleObject__Group_2__0 : rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1 ;
    public final void rule__RuleObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3500:1: ( rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3501:2: rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__RuleObject__Group_2__0__Impl_in_rule__RuleObject__Group_2__07009);
            rule__RuleObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group_2__1_in_rule__RuleObject__Group_2__07012);
            rule__RuleObject__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group_2__0"


    // $ANTLR start "rule__RuleObject__Group_2__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3508:1: rule__RuleObject__Group_2__0__Impl : ( '~' ) ;
    public final void rule__RuleObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3512:1: ( ( '~' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3513:1: ( '~' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3513:1: ( '~' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3514:1: '~'
            {
             before(grammarAccess.getRuleObjectAccess().getTildeKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__RuleObject__Group_2__0__Impl7040); 
             after(grammarAccess.getRuleObjectAccess().getTildeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group_2__0__Impl"


    // $ANTLR start "rule__RuleObject__Group_2__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3527:1: rule__RuleObject__Group_2__1 : rule__RuleObject__Group_2__1__Impl ;
    public final void rule__RuleObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3531:1: ( rule__RuleObject__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3532:2: rule__RuleObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleObject__Group_2__1__Impl_in_rule__RuleObject__Group_2__17071);
            rule__RuleObject__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group_2__1"


    // $ANTLR start "rule__RuleObject__Group_2__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3538:1: rule__RuleObject__Group_2__1__Impl : ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) ) ;
    public final void rule__RuleObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3542:1: ( ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3543:1: ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3543:1: ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3544:1: ( rule__RuleObject__SubobjectsAssignment_2_1 )
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3545:1: ( rule__RuleObject__SubobjectsAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3545:2: rule__RuleObject__SubobjectsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RuleObject__SubobjectsAssignment_2_1_in_rule__RuleObject__Group_2__1__Impl7098);
            rule__RuleObject__SubobjectsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__Group_2__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3559:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3563:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3564:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__07132);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07135);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3571:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3575:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3576:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3576:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3577:1: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3578:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3580:1: 
            {
            }

             after(grammarAccess.getImportAccess().getImportAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3590:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3594:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3595:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__17193);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__17196);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3602:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3606:1: ( ( 'import' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3607:1: ( 'import' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3607:1: ( 'import' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3608:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Import__Group__1__Impl7224); 
             after(grammarAccess.getImportAccess().getImportKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3621:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3625:1: ( rule__Import__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3626:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__27255);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3632:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3636:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3637:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3637:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3638:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3639:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3639:2: rule__Import__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl7282);
            rule__Import__ImportedNamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3655:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3659:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3660:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07318);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07321);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3667:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3671:1: ( ( ruleQualifiedName ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3672:1: ( ruleQualifiedName )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3672:1: ( ruleQualifiedName )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3673:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7348);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3684:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3688:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3689:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__17377);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3695:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3699:1: ( ( ( '.*' )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3700:1: ( ( '.*' )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3700:1: ( ( '.*' )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3701:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3702:1: ( '.*' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3703:2: '.*'
                    {
                    match(input,42,FOLLOW_42_in_rule__QualifiedNameWithWildcard__Group__1__Impl7406); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3718:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3722:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3723:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07443);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07446);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3730:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3734:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3735:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3735:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3736:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7473); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3747:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3751:1: ( rule__QualifiedName__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3752:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17502);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3758:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3762:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3763:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3763:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3764:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3765:1: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3765:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7529);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3779:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3783:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3784:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07564);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07567);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3791:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3795:1: ( ( '.' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3796:1: ( '.' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3796:1: ( '.' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3797:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl7595); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3810:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3814:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3815:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17626);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3821:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3825:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3826:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3826:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3827:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7653); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__MembersAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3843:1: rule__Model__MembersAssignment_1 : ( ruleModelMember ) ;
    public final void rule__Model__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3847:1: ( ( ruleModelMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3848:1: ( ruleModelMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3848:1: ( ruleModelMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3849:1: ruleModelMember
            {
             before(grammarAccess.getModelAccess().getMembersModelMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelMember_in_rule__Model__MembersAssignment_17691);
            ruleModelMember();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMembersModelMemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MembersAssignment_1"


    // $ANTLR start "rule__VariableDefinition__TypeAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3858:1: rule__VariableDefinition__TypeAssignment_2 : ( ruleVariableType ) ;
    public final void rule__VariableDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3862:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3863:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3863:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3864:1: ruleVariableType
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__VariableDefinition__TypeAssignment_27722);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__TypeAssignment_2"


    // $ANTLR start "rule__VariableDefinition__NameAssignment_3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3873:1: rule__VariableDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3877:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3878:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3878:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3879:1: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDefinition__NameAssignment_37753); 
             after(grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__NameAssignment_3"


    // $ANTLR start "rule__VariableDefinition__MembersAssignment_5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3888:1: rule__VariableDefinition__MembersAssignment_5 : ( ruleVariableDefinitionMember ) ;
    public final void rule__VariableDefinition__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3892:1: ( ( ruleVariableDefinitionMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3893:1: ( ruleVariableDefinitionMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3893:1: ( ruleVariableDefinitionMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3894:1: ruleVariableDefinitionMember
            {
             before(grammarAccess.getVariableDefinitionAccess().getMembersVariableDefinitionMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_rule__VariableDefinition__MembersAssignment_57784);
            ruleVariableDefinitionMember();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getMembersVariableDefinitionMemberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDefinition__MembersAssignment_5"


    // $ANTLR start "rule__FunctionDefinition__TypeAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3903:1: rule__FunctionDefinition__TypeAssignment_2 : ( ruleVariableType ) ;
    public final void rule__FunctionDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3907:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3908:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3908:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3909:1: ruleVariableType
            {
             before(grammarAccess.getFunctionDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__FunctionDefinition__TypeAssignment_27815);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__TypeAssignment_2"


    // $ANTLR start "rule__FunctionDefinition__NameAssignment_3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3918:1: rule__FunctionDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FunctionDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3922:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3923:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3923:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3924:1: RULE_ID
            {
             before(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_37846); 
             after(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__NameAssignment_3"


    // $ANTLR start "rule__FunctionDefinition__ParametersAssignment_5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3933:1: rule__FunctionDefinition__ParametersAssignment_5 : ( ruleFunctionParameterMember ) ;
    public final void rule__FunctionDefinition__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3937:1: ( ( ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3938:1: ( ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3938:1: ( ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3939:1: ruleFunctionParameterMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_57877);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__ParametersAssignment_5"


    // $ANTLR start "rule__FunctionDefinition__ParametersAssignment_6_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3948:1: rule__FunctionDefinition__ParametersAssignment_6_1 : ( ruleFunctionParameterMember ) ;
    public final void rule__FunctionDefinition__ParametersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3952:1: ( ( ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3953:1: ( ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3953:1: ( ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3954:1: ruleFunctionParameterMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_6_17908);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__ParametersAssignment_6_1"


    // $ANTLR start "rule__FunctionDefinition__MembersAssignment_9"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3963:1: rule__FunctionDefinition__MembersAssignment_9 : ( ruleFunctionDefinitionMember ) ;
    public final void rule__FunctionDefinition__MembersAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3967:1: ( ( ruleFunctionDefinitionMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3968:1: ( ruleFunctionDefinitionMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3968:1: ( ruleFunctionDefinitionMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3969:1: ruleFunctionDefinitionMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_rule__FunctionDefinition__MembersAssignment_97939);
            ruleFunctionDefinitionMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__MembersAssignment_9"


    // $ANTLR start "rule__FunctionDefinition__UsesAssignment_11_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3978:1: rule__FunctionDefinition__UsesAssignment_11_1 : ( ruleFunctionUseMember ) ;
    public final void rule__FunctionDefinition__UsesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3982:1: ( ( ruleFunctionUseMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3983:1: ( ruleFunctionUseMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3983:1: ( ruleFunctionUseMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3984:1: ruleFunctionUseMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_11_17970);
            ruleFunctionUseMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__UsesAssignment_11_1"


    // $ANTLR start "rule__FunctionDefinition__UsesAssignment_11_2_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3993:1: rule__FunctionDefinition__UsesAssignment_11_2_1 : ( ruleFunctionUseMember ) ;
    public final void rule__FunctionDefinition__UsesAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3997:1: ( ( ruleFunctionUseMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3998:1: ( ruleFunctionUseMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3998:1: ( ruleFunctionUseMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3999:1: ruleFunctionUseMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_2_1_0()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_11_2_18001);
            ruleFunctionUseMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_11_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__UsesAssignment_11_2_1"


    // $ANTLR start "rule__FunctionUseMember__TypeAssignment_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4008:1: rule__FunctionUseMember__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionUseMember__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4012:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4013:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4013:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4014:1: RULE_ID
            {
             before(grammarAccess.getFunctionUseMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionUseMember__TypeAssignment_08032); 
             after(grammarAccess.getFunctionUseMemberAccess().getTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUseMember__TypeAssignment_0"


    // $ANTLR start "rule__FunctionUseMember__NameAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4023:1: rule__FunctionUseMember__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionUseMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4027:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4028:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4028:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4029:1: RULE_ID
            {
             before(grammarAccess.getFunctionUseMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionUseMember__NameAssignment_18063); 
             after(grammarAccess.getFunctionUseMemberAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUseMember__NameAssignment_1"


    // $ANTLR start "rule__FunctionParameterMember__TypeAssignment_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4038:1: rule__FunctionParameterMember__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionParameterMember__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4042:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4043:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4043:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4044:1: RULE_ID
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameterMember__TypeAssignment_08094); 
             after(grammarAccess.getFunctionParameterMemberAccess().getTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__TypeAssignment_0"


    // $ANTLR start "rule__FunctionParameterMember__NameAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4053:1: rule__FunctionParameterMember__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionParameterMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4057:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4058:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4058:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4059:1: RULE_ID
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameterMember__NameAssignment_18125); 
             after(grammarAccess.getFunctionParameterMemberAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__NameAssignment_1"


    // $ANTLR start "rule__FunctionParameterMember__ScopeAssignment_3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4068:1: rule__FunctionParameterMember__ScopeAssignment_3 : ( ruleParameterScope ) ;
    public final void rule__FunctionParameterMember__ScopeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4072:1: ( ( ruleParameterScope ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4073:1: ( ruleParameterScope )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4073:1: ( ruleParameterScope )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4074:1: ruleParameterScope
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameterScope_in_rule__FunctionParameterMember__ScopeAssignment_38156);
            ruleParameterScope();

            state._fsp--;

             after(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameterMember__ScopeAssignment_3"


    // $ANTLR start "rule__VariableDeclaration__QualifierAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4083:1: rule__VariableDeclaration__QualifierAssignment_1 : ( ruleVariableQualifier ) ;
    public final void rule__VariableDeclaration__QualifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4087:1: ( ( ruleVariableQualifier ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4088:1: ( ruleVariableQualifier )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4088:1: ( ruleVariableQualifier )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4089:1: ruleVariableQualifier
            {
             before(grammarAccess.getVariableDeclarationAccess().getQualifierVariableQualifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_rule__VariableDeclaration__QualifierAssignment_18187);
            ruleVariableQualifier();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getQualifierVariableQualifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__QualifierAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_2_0_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4098:1: rule__VariableDeclaration__TypeAssignment_2_0_0 : ( ruleVariableType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4102:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4103:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4103:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4104:1: ruleVariableType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_2_0_08218);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_2_0_0"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_2_0_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4113:1: rule__VariableDeclaration__NameAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4117:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4118:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4118:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4119:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_0_18249); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_2_0_1"


    // $ANTLR start "rule__VariableDeclaration__CollectionAssignment_2_1_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4128:1: rule__VariableDeclaration__CollectionAssignment_2_1_0 : ( ruleCollectionID ) ;
    public final void rule__VariableDeclaration__CollectionAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4132:1: ( ( ruleCollectionID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4133:1: ( ruleCollectionID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4133:1: ( ruleCollectionID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4134:1: ruleCollectionID
            {
             before(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleCollectionID_in_rule__VariableDeclaration__CollectionAssignment_2_1_08280);
            ruleCollectionID();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__CollectionAssignment_2_1_0"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_2_1_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4143:1: rule__VariableDeclaration__TypeAssignment_2_1_2 : ( ruleVariableType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4147:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4148:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4148:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4149:1: ruleVariableType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_2_1_28311);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_2_1_2"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_2_1_4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4158:1: rule__VariableDeclaration__NameAssignment_2_1_4 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4162:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4163:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4163:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4164:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_1_48342); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_2_1_4"


    // $ANTLR start "rule__VariableType__PrimitiveAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4173:1: rule__VariableType__PrimitiveAssignment_1 : ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) ) ;
    public final void rule__VariableType__PrimitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4177:1: ( ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4178:1: ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4178:1: ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4179:1: ( rule__VariableType__PrimitiveAlternatives_1_0 )
            {
             before(grammarAccess.getVariableTypeAccess().getPrimitiveAlternatives_1_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4180:1: ( rule__VariableType__PrimitiveAlternatives_1_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4180:2: rule__VariableType__PrimitiveAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__VariableType__PrimitiveAlternatives_1_0_in_rule__VariableType__PrimitiveAssignment_18373);
            rule__VariableType__PrimitiveAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getPrimitiveAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__PrimitiveAssignment_1"


    // $ANTLR start "rule__VariableAttribute__NameAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4189:1: rule__VariableAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4193:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4194:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4194:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4195:1: RULE_ID
            {
             before(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAttribute__NameAssignment_18406); 
             after(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__NameAssignment_1"


    // $ANTLR start "rule__VariableAttribute__AttributeAssignment_2_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4204:1: rule__VariableAttribute__AttributeAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__VariableAttribute__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4208:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4209:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4209:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4210:1: RULE_ID
            {
             before(grammarAccess.getVariableAttributeAccess().getAttributeIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAttribute__AttributeAssignment_2_18437); 
             after(grammarAccess.getVariableAttributeAccess().getAttributeIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAttribute__AttributeAssignment_2_1"


    // $ANTLR start "rule__VariableAssignment__VariableAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4219:1: rule__VariableAssignment__VariableAssignment_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableAssignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4223:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4224:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4224:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4225:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableVariableAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableAssignment__VariableAssignment_18468);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentAccess().getVariableVariableAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__VariableAssignment_1"


    // $ANTLR start "rule__VariableAssignment__ExpressionAssignment_3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4234:1: rule__VariableAssignment__ExpressionAssignment_3 : ( ruleVariableExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4238:1: ( ( ruleVariableExpression ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4239:1: ( ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4239:1: ( ruleVariableExpression )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4240:1: ruleVariableExpression
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_rule__VariableAssignment__ExpressionAssignment_38499);
            ruleVariableExpression();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__ExpressionAssignment_3"


    // $ANTLR start "rule__VariableExpression__MembersAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4249:1: rule__VariableExpression__MembersAssignment_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableExpression__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4253:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4254:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4254:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4255:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_18530);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__MembersAssignment_1"


    // $ANTLR start "rule__VariableExpression__MembersAssignment_2_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4264:1: rule__VariableExpression__MembersAssignment_2_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableExpression__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4268:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4269:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4269:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4270:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_2_18561);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExpression__MembersAssignment_2_1"


    // $ANTLR start "rule__RuleDefinition__NameAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4279:1: rule__RuleDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RuleDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4283:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4284:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4284:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4285:1: RULE_ID
            {
             before(grammarAccess.getRuleDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleDefinition__NameAssignment_28592); 
             after(grammarAccess.getRuleDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__NameAssignment_2"


    // $ANTLR start "rule__RuleDefinition__LhsAssignment_4_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4294:1: rule__RuleDefinition__LhsAssignment_4_0 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__LhsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4298:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4299:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4299:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4300:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_08623);
            ruleRuleObject();

            state._fsp--;

             after(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__LhsAssignment_4_0"


    // $ANTLR start "rule__RuleDefinition__LhsAssignment_4_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4309:1: rule__RuleDefinition__LhsAssignment_4_1_1 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__LhsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4313:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4314:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4314:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4315:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_1_18654);
            ruleRuleObject();

            state._fsp--;

             after(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__LhsAssignment_4_1_1"


    // $ANTLR start "rule__RuleDefinition__RhsAssignment_6_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4324:1: rule__RuleDefinition__RhsAssignment_6_0 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__RhsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4328:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4329:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4329:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4330:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_08685);
            ruleRuleObject();

            state._fsp--;

             after(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__RhsAssignment_6_0"


    // $ANTLR start "rule__RuleDefinition__RhsAssignment_6_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4339:1: rule__RuleDefinition__RhsAssignment_6_1_1 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__RhsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4343:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4344:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4344:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4345:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_1_18716);
            ruleRuleObject();

            state._fsp--;

             after(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDefinition__RhsAssignment_6_1_1"


    // $ANTLR start "rule__RuleObject__SubobjectsAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4354:1: rule__RuleObject__SubobjectsAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleObject__SubobjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4358:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4359:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4359:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4360:1: RULE_ID
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_18747); 
             after(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__SubobjectsAssignment_1"


    // $ANTLR start "rule__RuleObject__SubobjectsAssignment_2_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4369:1: rule__RuleObject__SubobjectsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__RuleObject__SubobjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4373:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4374:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4374:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4375:1: RULE_ID
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_2_18778); 
             after(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleObject__SubobjectsAssignment_2_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4384:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4388:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4389:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4389:1: ( ruleQualifiedNameWithWildcard )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4390:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_28809);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\32\1\uffff\7\4\1\33\2\uffff";
    static final String DFA1_maxS =
        "\1\51\1\uffff\1\25\5\4\2\35\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\1\3";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\16\uffff\1\1",
            "",
            "\1\10\14\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11\26\uffff\1\12\1\uffff\1\13",
            "\1\12\1\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "704:1: rule__ModelMember__Alternatives : ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) );";
        }
    }
    static final String DFA21_eotS =
        "\6\uffff";
    static final String DFA21_eofS =
        "\1\2\1\4\4\uffff";
    static final String DFA21_minS =
        "\2\4\1\uffff\1\4\1\uffff\1\4";
    static final String DFA21_maxS =
        "\1\47\1\50\1\uffff\1\47\1\uffff\1\47";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA21_specialS =
        "\6\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\14\uffff\7\2\4\uffff\1\2\7\uffff\1\2\2\uffff\1\2",
            "\1\3\11\uffff\1\4\2\uffff\7\4\4\uffff\1\4\7\uffff\1\4\2\2\2"+
            "\4",
            "",
            "\1\5\14\uffff\7\2\4\uffff\1\2\7\uffff\1\2\2\4\1\2",
            "",
            "\1\3\14\uffff\7\4\4\uffff\1\4\7\uffff\1\4\2\2\1\4"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "3130:1: ( rule__RuleDefinition__Group_6__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_entryRuleModelMember121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMember128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMember__Alternatives_in_ruleModelMember154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__0_in_ruleVariableDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0_in_ruleFunctionDefinition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUseMember308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__0_in_ruleFunctionUseMember334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__0_in_ruleFunctionParameterMember394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_entryRuleParameterScope421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterScope428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterScope__Alternatives_in_ruleParameterScope454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinitionMember488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinitionMember__Alternatives_in_ruleFunctionDefinitionMember514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionMember548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__Group__0_in_ruleVariableType693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableQualifier__Group__0_in_ruleVariableQualifier753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__0_in_ruleVariableAttribute813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__0_in_ruleVariableExpression933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpressionOperator__Alternatives_in_ruleVariableExpressionOperator993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveVariableType_in_entryRulePrimitiveVariableType1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveVariableType1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveVariableType__Alternatives_in_rulePrimitiveVariableType1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionID__Alternatives_in_ruleCollectionID1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__0_in_ruleRuleDefinition1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__0_in_ruleRuleObject1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ModelMember__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_rule__ModelMember__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_rule__ModelMember__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ParameterScope__Alternatives1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ParameterScope__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ParameterScope__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_rule__FunctionDefinitionMember__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__FunctionDefinitionMember__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_rule__FunctionDefinitionMember__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__0_in_rule__VariableDeclaration__Alternatives_21656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__0_in_rule__VariableDeclaration__Alternatives_21674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveVariableType_in_rule__VariableType__PrimitiveAlternatives_1_01707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableType__PrimitiveAlternatives_1_01724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VariableExpressionOperator__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VariableExpressionOperator__Alternatives1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VariableExpressionOperator__Alternatives1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimitiveVariableType__Alternatives1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimitiveVariableType__Alternatives1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimitiveVariableType__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveVariableType__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimitiveVariableType__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CollectionID__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionID__Alternatives1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RuleDefinition__Alternatives_52002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RuleDefinition__Alternatives_52022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02054 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MembersAssignment_1_in_rule__Model__Group__1__Impl2142 = new BitSet(new long[]{0x0000020004000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__0__Impl_in_rule__VariableDefinition__Group__02177 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__1_in_rule__VariableDefinition__Group__02180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__1__Impl_in_rule__VariableDefinition__Group__12238 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__2_in_rule__VariableDefinition__Group__12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VariableDefinition__Group__1__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__2__Impl_in_rule__VariableDefinition__Group__22300 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__3_in_rule__VariableDefinition__Group__22303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__TypeAssignment_2_in_rule__VariableDefinition__Group__2__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__3__Impl_in_rule__VariableDefinition__Group__32361 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__4_in_rule__VariableDefinition__Group__32364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__NameAssignment_3_in_rule__VariableDefinition__Group__3__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__4__Impl_in_rule__VariableDefinition__Group__42421 = new BitSet(new long[]{0x0000001010FE0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__5_in_rule__VariableDefinition__Group__42424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VariableDefinition__Group__4__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__5__Impl_in_rule__VariableDefinition__Group__52483 = new BitSet(new long[]{0x0000001010FE0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__6_in_rule__VariableDefinition__Group__52486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__MembersAssignment_5_in_rule__VariableDefinition__Group__5__Impl2513 = new BitSet(new long[]{0x0000001000FE0012L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__6__Impl_in_rule__VariableDefinition__Group__62544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VariableDefinition__Group__6__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02617 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12678 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionDefinition__Group__1__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22740 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__TypeAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32801 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__NameAssignment_3_in_rule__FunctionDefinition__Group__3__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDefinition__Group__4__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52923 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__6_in_rule__FunctionDefinition__Group__52926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__6__Impl_in_rule__FunctionDefinition__Group__62983 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__7_in_rule__FunctionDefinition__Group__62986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_6__0_in_rule__FunctionDefinition__Group__6__Impl3013 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__7__Impl_in_rule__FunctionDefinition__Group__73044 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__8_in_rule__FunctionDefinition__Group__73047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionDefinition__Group__7__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__8__Impl_in_rule__FunctionDefinition__Group__83106 = new BitSet(new long[]{0x0000009010FE0010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__9_in_rule__FunctionDefinition__Group__83109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FunctionDefinition__Group__8__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__9__Impl_in_rule__FunctionDefinition__Group__93168 = new BitSet(new long[]{0x0000009010FE0010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__10_in_rule__FunctionDefinition__Group__93171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__MembersAssignment_9_in_rule__FunctionDefinition__Group__9__Impl3198 = new BitSet(new long[]{0x0000009000FE0012L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__10__Impl_in_rule__FunctionDefinition__Group__103229 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__11_in_rule__FunctionDefinition__Group__103232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionDefinition__Group__10__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__11__Impl_in_rule__FunctionDefinition__Group__113291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11__0_in_rule__FunctionDefinition__Group__11__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_6__0__Impl_in_rule__FunctionDefinition__Group_6__03373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_6__1_in_rule__FunctionDefinition__Group_6__03376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionDefinition__Group_6__0__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_6__1__Impl_in_rule__FunctionDefinition__Group_6__13435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ParametersAssignment_6_1_in_rule__FunctionDefinition__Group_6__1__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11__0__Impl_in_rule__FunctionDefinition__Group_11__03496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11__1_in_rule__FunctionDefinition__Group_11__03499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionDefinition__Group_11__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11__1__Impl_in_rule__FunctionDefinition__Group_11__13558 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11__2_in_rule__FunctionDefinition__Group_11__13561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__UsesAssignment_11_1_in_rule__FunctionDefinition__Group_11__1__Impl3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11__2__Impl_in_rule__FunctionDefinition__Group_11__23618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11_2__0_in_rule__FunctionDefinition__Group_11__2__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11_2__0__Impl_in_rule__FunctionDefinition__Group_11_2__03681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11_2__1_in_rule__FunctionDefinition__Group_11_2__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionDefinition__Group_11_2__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_11_2__1__Impl_in_rule__FunctionDefinition__Group_11_2__13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__UsesAssignment_11_2_1_in_rule__FunctionDefinition__Group_11_2__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__0__Impl_in_rule__FunctionUseMember__Group__03804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__1_in_rule__FunctionUseMember__Group__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__TypeAssignment_0_in_rule__FunctionUseMember__Group__0__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__1__Impl_in_rule__FunctionUseMember__Group__13864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__NameAssignment_1_in_rule__FunctionUseMember__Group__1__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__0__Impl_in_rule__FunctionParameterMember__Group__03925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__1_in_rule__FunctionParameterMember__Group__03928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__TypeAssignment_0_in_rule__FunctionParameterMember__Group__0__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__1__Impl_in_rule__FunctionParameterMember__Group__13985 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__2_in_rule__FunctionParameterMember__Group__13988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__NameAssignment_1_in_rule__FunctionParameterMember__Group__1__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__2__Impl_in_rule__FunctionParameterMember__Group__24045 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__3_in_rule__FunctionParameterMember__Group__24048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionParameterMember__Group__2__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__3__Impl_in_rule__FunctionParameterMember__Group__34107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__ScopeAssignment_3_in_rule__FunctionParameterMember__Group__3__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04172 = new BitSet(new long[]{0x0000001000FE0010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14233 = new BitSet(new long[]{0x0000001000FE0010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__QualifierAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Alternatives_2_in_rule__VariableDeclaration__Group__2__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__0__Impl_in_rule__VariableDeclaration__Group_2_0__04357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__1_in_rule__VariableDeclaration__Group_2_0__04360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_2_0_0_in_rule__VariableDeclaration__Group_2_0__0__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__1__Impl_in_rule__VariableDeclaration__Group_2_0__14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_0_1_in_rule__VariableDeclaration__Group_2_0__1__Impl4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__0__Impl_in_rule__VariableDeclaration__Group_2_1__04478 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__1_in_rule__VariableDeclaration__Group_2_1__04481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__CollectionAssignment_2_1_0_in_rule__VariableDeclaration__Group_2_1__0__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__1__Impl_in_rule__VariableDeclaration__Group_2_1__14538 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__2_in_rule__VariableDeclaration__Group_2_1__14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VariableDeclaration__Group_2_1__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__2__Impl_in_rule__VariableDeclaration__Group_2_1__24600 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__3_in_rule__VariableDeclaration__Group_2_1__24603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_2_1_2_in_rule__VariableDeclaration__Group_2_1__2__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__3__Impl_in_rule__VariableDeclaration__Group_2_1__34660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__4_in_rule__VariableDeclaration__Group_2_1__34663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VariableDeclaration__Group_2_1__3__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__4__Impl_in_rule__VariableDeclaration__Group_2_1__44722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_1_4_in_rule__VariableDeclaration__Group_2_1__4__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__Group__0__Impl_in_rule__VariableType__Group__04789 = new BitSet(new long[]{0x00000000003E0010L});
    public static final BitSet FOLLOW_rule__VariableType__Group__1_in_rule__VariableType__Group__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__Group__1__Impl_in_rule__VariableType__Group__14850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__PrimitiveAssignment_1_in_rule__VariableType__Group__1__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableQualifier__Group__0__Impl_in_rule__VariableQualifier__Group__04911 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__VariableQualifier__Group__1_in_rule__VariableQualifier__Group__04914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableQualifier__Group__1__Impl_in_rule__VariableQualifier__Group__14972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VariableQualifier__Group__1__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__0__Impl_in_rule__VariableAttribute__Group__05035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__1_in_rule__VariableAttribute__Group__05038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__1__Impl_in_rule__VariableAttribute__Group__15096 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__2_in_rule__VariableAttribute__Group__15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__NameAssignment_1_in_rule__VariableAttribute__Group__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__2__Impl_in_rule__VariableAttribute__Group__25156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__0_in_rule__VariableAttribute__Group__2__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__0__Impl_in_rule__VariableAttribute__Group_2__05220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__1_in_rule__VariableAttribute__Group_2__05223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VariableAttribute__Group_2__0__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__1__Impl_in_rule__VariableAttribute__Group_2__15282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__AttributeAssignment_2_1_in_rule__VariableAttribute__Group_2__1__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__05343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__05346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__15404 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__15407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__VariableAssignment_1_in_rule__VariableAssignment__Group__1__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__25464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__3_in_rule__VariableAssignment__Group__25467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VariableAssignment__Group__2__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__3__Impl_in_rule__VariableAssignment__Group__35526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__ExpressionAssignment_3_in_rule__VariableAssignment__Group__3__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__0__Impl_in_rule__VariableExpression__Group__05591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__1_in_rule__VariableExpression__Group__05594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__1__Impl_in_rule__VariableExpression__Group__15652 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__2_in_rule__VariableExpression__Group__15655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__MembersAssignment_1_in_rule__VariableExpression__Group__1__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__2__Impl_in_rule__VariableExpression__Group__25712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__0_in_rule__VariableExpression__Group__2__Impl5739 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__0__Impl_in_rule__VariableExpression__Group_2__05776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__1_in_rule__VariableExpression__Group_2__05779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_rule__VariableExpression__Group_2__0__Impl5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__1__Impl_in_rule__VariableExpression__Group_2__15835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__MembersAssignment_2_1_in_rule__VariableExpression__Group_2__1__Impl5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__0__Impl_in_rule__RuleDefinition__Group__05896 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__1_in_rule__RuleDefinition__Group__05899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__1__Impl_in_rule__RuleDefinition__Group__15957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__2_in_rule__RuleDefinition__Group__15960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RuleDefinition__Group__1__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__2__Impl_in_rule__RuleDefinition__Group__26019 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__3_in_rule__RuleDefinition__Group__26022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__NameAssignment_2_in_rule__RuleDefinition__Group__2__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__3__Impl_in_rule__RuleDefinition__Group__36079 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__4_in_rule__RuleDefinition__Group__36082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RuleDefinition__Group__3__Impl6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__4__Impl_in_rule__RuleDefinition__Group__46141 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__5_in_rule__RuleDefinition__Group__46144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__0_in_rule__RuleDefinition__Group__4__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__5__Impl_in_rule__RuleDefinition__Group__56202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__6_in_rule__RuleDefinition__Group__56205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Alternatives_5_in_rule__RuleDefinition__Group__5__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__6__Impl_in_rule__RuleDefinition__Group__66262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__0_in_rule__RuleDefinition__Group__6__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__0__Impl_in_rule__RuleDefinition__Group_4__06334 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__1_in_rule__RuleDefinition__Group_4__06337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__LhsAssignment_4_0_in_rule__RuleDefinition__Group_4__0__Impl6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__1__Impl_in_rule__RuleDefinition__Group_4__16394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__0_in_rule__RuleDefinition__Group_4__1__Impl6421 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__0__Impl_in_rule__RuleDefinition__Group_4_1__06456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__1_in_rule__RuleDefinition__Group_4_1__06459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RuleDefinition__Group_4_1__0__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__1__Impl_in_rule__RuleDefinition__Group_4_1__16518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__LhsAssignment_4_1_1_in_rule__RuleDefinition__Group_4_1__1__Impl6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__0__Impl_in_rule__RuleDefinition__Group_6__06579 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__1_in_rule__RuleDefinition__Group_6__06582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__RhsAssignment_6_0_in_rule__RuleDefinition__Group_6__0__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__1__Impl_in_rule__RuleDefinition__Group_6__16639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__0_in_rule__RuleDefinition__Group_6__1__Impl6666 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__0__Impl_in_rule__RuleDefinition__Group_6_1__06701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__1_in_rule__RuleDefinition__Group_6_1__06704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RuleDefinition__Group_6_1__0__Impl6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__1__Impl_in_rule__RuleDefinition__Group_6_1__16763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__RhsAssignment_6_1_1_in_rule__RuleDefinition__Group_6_1__1__Impl6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__0__Impl_in_rule__RuleObject__Group__06824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__1_in_rule__RuleObject__Group__06827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__1__Impl_in_rule__RuleObject__Group__16885 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__2_in_rule__RuleObject__Group__16888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__SubobjectsAssignment_1_in_rule__RuleObject__Group__1__Impl6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__2__Impl_in_rule__RuleObject__Group__26945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__0_in_rule__RuleObject__Group__2__Impl6972 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__0__Impl_in_rule__RuleObject__Group_2__07009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__1_in_rule__RuleObject__Group_2__07012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__RuleObject__Group_2__0__Impl7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__1__Impl_in_rule__RuleObject__Group_2__17071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__SubobjectsAssignment_2_1_in_rule__RuleObject__Group_2__1__Impl7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__07132 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__17193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__17196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Import__Group__1__Impl7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__27255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07318 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__17377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__QualifiedNameWithWildcard__Group__1__Impl7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07443 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7529 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_rule__Model__MembersAssignment_17691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__VariableDefinition__TypeAssignment_27722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDefinition__NameAssignment_37753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_rule__VariableDefinition__MembersAssignment_57784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__FunctionDefinition__TypeAssignment_27815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_37846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_57877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_6_17908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_rule__FunctionDefinition__MembersAssignment_97939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_11_17970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_11_2_18001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionUseMember__TypeAssignment_08032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionUseMember__NameAssignment_18063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameterMember__TypeAssignment_08094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameterMember__NameAssignment_18125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_rule__FunctionParameterMember__ScopeAssignment_38156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_rule__VariableDeclaration__QualifierAssignment_18187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_2_0_08218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_0_18249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_rule__VariableDeclaration__CollectionAssignment_2_1_08280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_2_1_28311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_1_48342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__PrimitiveAlternatives_1_0_in_rule__VariableType__PrimitiveAssignment_18373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAttribute__NameAssignment_18406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAttribute__AttributeAssignment_2_18437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableAssignment__VariableAssignment_18468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_rule__VariableAssignment__ExpressionAssignment_38499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_18530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_2_18561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleDefinition__NameAssignment_28592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_08623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_1_18654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_08685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_1_18716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_18747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_2_18778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_28809 = new BitSet(new long[]{0x0000000000000002L});

}