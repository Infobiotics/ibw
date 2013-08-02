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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'required'", "'returned'", "'+'", "'-'", "'|'", "'ID'", "'URI'", "'DNA'", "'CHASSIS'", "'PROCESS'", "'LIST'", "'SET'", "'->'", "'<->'", "'define'", "'{'", "'}'", "'('", "')'", "'USES'", "','", "':'", "'<'", "'>'", "'.'", "'='", "'RULE'", "'~'", "'import'", "'.*'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleFunctionParameterMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:172:1: entryRuleFunctionParameterMember : ruleFunctionParameterMember EOF ;
    public final void entryRuleFunctionParameterMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:173:1: ( ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:174:1: ruleFunctionParameterMember EOF
            {
             before(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember301);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionParameterMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember308); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:181:1: ruleFunctionParameterMember : ( ( rule__FunctionParameterMember__Group__0 ) ) ;
    public final void ruleFunctionParameterMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:185:2: ( ( ( rule__FunctionParameterMember__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:186:1: ( ( rule__FunctionParameterMember__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:186:1: ( ( rule__FunctionParameterMember__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:187:1: ( rule__FunctionParameterMember__Group__0 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:188:1: ( rule__FunctionParameterMember__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:188:2: rule__FunctionParameterMember__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__0_in_ruleFunctionParameterMember334);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:200:1: entryRuleParameterScope : ruleParameterScope EOF ;
    public final void entryRuleParameterScope() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:201:1: ( ruleParameterScope EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:202:1: ruleParameterScope EOF
            {
             before(grammarAccess.getParameterScopeRule()); 
            pushFollow(FOLLOW_ruleParameterScope_in_entryRuleParameterScope361);
            ruleParameterScope();

            state._fsp--;

             after(grammarAccess.getParameterScopeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterScope368); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:209:1: ruleParameterScope : ( ( rule__ParameterScope__Alternatives ) ) ;
    public final void ruleParameterScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:213:2: ( ( ( rule__ParameterScope__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:214:1: ( ( rule__ParameterScope__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:214:1: ( ( rule__ParameterScope__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:215:1: ( rule__ParameterScope__Alternatives )
            {
             before(grammarAccess.getParameterScopeAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:216:1: ( rule__ParameterScope__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:216:2: rule__ParameterScope__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterScope__Alternatives_in_ruleParameterScope394);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:228:1: entryRuleFunctionDefinitionMember : ruleFunctionDefinitionMember EOF ;
    public final void entryRuleFunctionDefinitionMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:229:1: ( ruleFunctionDefinitionMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:230:1: ruleFunctionDefinitionMember EOF
            {
             before(grammarAccess.getFunctionDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember421);
            ruleFunctionDefinitionMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinitionMember428); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:237:1: ruleFunctionDefinitionMember : ( ( rule__FunctionDefinitionMember__Alternatives ) ) ;
    public final void ruleFunctionDefinitionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:241:2: ( ( ( rule__FunctionDefinitionMember__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:242:1: ( ( rule__FunctionDefinitionMember__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:242:1: ( ( rule__FunctionDefinitionMember__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:243:1: ( rule__FunctionDefinitionMember__Alternatives )
            {
             before(grammarAccess.getFunctionDefinitionMemberAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:244:1: ( rule__FunctionDefinitionMember__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:244:2: rule__FunctionDefinitionMember__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionDefinitionMember__Alternatives_in_ruleFunctionDefinitionMember454);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:256:1: entryRuleVariableDefinitionMember : ruleVariableDefinitionMember EOF ;
    public final void entryRuleVariableDefinitionMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:257:1: ( ruleVariableDefinitionMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:258:1: ruleVariableDefinitionMember EOF
            {
             before(grammarAccess.getVariableDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember481);
            ruleVariableDefinitionMember();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionMember488); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:265:1: ruleVariableDefinitionMember : ( ruleVariableDeclaration ) ;
    public final void ruleVariableDefinitionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:269:2: ( ( ruleVariableDeclaration ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:270:1: ( ruleVariableDeclaration )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:270:1: ( ruleVariableDeclaration )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:271:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariableDefinitionMemberAccess().getVariableDeclarationParserRuleCall()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember514);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:284:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:285:1: ( ruleVariableDeclaration EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:286:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration540);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration547); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:293:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Alternatives ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:297:2: ( ( ( rule__VariableDeclaration__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:298:1: ( ( rule__VariableDeclaration__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:298:1: ( ( rule__VariableDeclaration__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:299:1: ( rule__VariableDeclaration__Alternatives )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:300:1: ( rule__VariableDeclaration__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:300:2: rule__VariableDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration573);
            rule__VariableDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:312:1: entryRuleVariableType : ruleVariableType EOF ;
    public final void entryRuleVariableType() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:313:1: ( ruleVariableType EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:314:1: ruleVariableType EOF
            {
             before(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_ruleVariableType_in_entryRuleVariableType600);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableType607); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:321:1: ruleVariableType : ( ( rule__VariableType__Group__0 ) ) ;
    public final void ruleVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:325:2: ( ( ( rule__VariableType__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:326:1: ( ( rule__VariableType__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:326:1: ( ( rule__VariableType__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:327:1: ( rule__VariableType__Group__0 )
            {
             before(grammarAccess.getVariableTypeAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:328:1: ( rule__VariableType__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:328:2: rule__VariableType__Group__0
            {
            pushFollow(FOLLOW_rule__VariableType__Group__0_in_ruleVariableType633);
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


    // $ANTLR start "entryRuleVariableAttribute"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:340:1: entryRuleVariableAttribute : ruleVariableAttribute EOF ;
    public final void entryRuleVariableAttribute() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:341:1: ( ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:342:1: ruleVariableAttribute EOF
            {
             before(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute660);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getVariableAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute667); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:349:1: ruleVariableAttribute : ( ( rule__VariableAttribute__Group__0 ) ) ;
    public final void ruleVariableAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:353:2: ( ( ( rule__VariableAttribute__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:354:1: ( ( rule__VariableAttribute__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:354:1: ( ( rule__VariableAttribute__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:355:1: ( rule__VariableAttribute__Group__0 )
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:356:1: ( rule__VariableAttribute__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:356:2: rule__VariableAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__0_in_ruleVariableAttribute693);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:368:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:369:1: ( ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:370:1: ruleVariableAssignment EOF
            {
             before(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment720);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment727); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:377:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:381:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:382:1: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:382:1: ( ( rule__VariableAssignment__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:383:1: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:384:1: ( rule__VariableAssignment__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:384:2: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment753);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:396:1: entryRuleVariableExpression : ruleVariableExpression EOF ;
    public final void entryRuleVariableExpression() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:397:1: ( ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:398:1: ruleVariableExpression EOF
            {
             before(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression780);
            ruleVariableExpression();

            state._fsp--;

             after(grammarAccess.getVariableExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression787); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:405:1: ruleVariableExpression : ( ( rule__VariableExpression__Group__0 ) ) ;
    public final void ruleVariableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:409:2: ( ( ( rule__VariableExpression__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:410:1: ( ( rule__VariableExpression__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:410:1: ( ( rule__VariableExpression__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:411:1: ( rule__VariableExpression__Group__0 )
            {
             before(grammarAccess.getVariableExpressionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:412:1: ( rule__VariableExpression__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:412:2: rule__VariableExpression__Group__0
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__0_in_ruleVariableExpression813);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:424:1: entryRuleVariableExpressionOperator : ruleVariableExpressionOperator EOF ;
    public final void entryRuleVariableExpressionOperator() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:425:1: ( ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:426:1: ruleVariableExpressionOperator EOF
            {
             before(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator840);
            ruleVariableExpressionOperator();

            state._fsp--;

             after(grammarAccess.getVariableExpressionOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator847); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:433:1: ruleVariableExpressionOperator : ( ( rule__VariableExpressionOperator__Alternatives ) ) ;
    public final void ruleVariableExpressionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:437:2: ( ( ( rule__VariableExpressionOperator__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:438:1: ( ( rule__VariableExpressionOperator__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:438:1: ( ( rule__VariableExpressionOperator__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:439:1: ( rule__VariableExpressionOperator__Alternatives )
            {
             before(grammarAccess.getVariableExpressionOperatorAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:440:1: ( rule__VariableExpressionOperator__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:440:2: rule__VariableExpressionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableExpressionOperator__Alternatives_in_ruleVariableExpressionOperator873);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:452:1: entryRulePrimitiveVariableType : rulePrimitiveVariableType EOF ;
    public final void entryRulePrimitiveVariableType() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:453:1: ( rulePrimitiveVariableType EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:454:1: rulePrimitiveVariableType EOF
            {
             before(grammarAccess.getPrimitiveVariableTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveVariableType_in_entryRulePrimitiveVariableType900);
            rulePrimitiveVariableType();

            state._fsp--;

             after(grammarAccess.getPrimitiveVariableTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveVariableType907); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:461:1: rulePrimitiveVariableType : ( ( rule__PrimitiveVariableType__Alternatives ) ) ;
    public final void rulePrimitiveVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:465:2: ( ( ( rule__PrimitiveVariableType__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:466:1: ( ( rule__PrimitiveVariableType__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:466:1: ( ( rule__PrimitiveVariableType__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:467:1: ( rule__PrimitiveVariableType__Alternatives )
            {
             before(grammarAccess.getPrimitiveVariableTypeAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:468:1: ( rule__PrimitiveVariableType__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:468:2: rule__PrimitiveVariableType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveVariableType__Alternatives_in_rulePrimitiveVariableType933);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:480:1: entryRuleCollectionID : ruleCollectionID EOF ;
    public final void entryRuleCollectionID() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:481:1: ( ruleCollectionID EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:482:1: ruleCollectionID EOF
            {
             before(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID960);
            ruleCollectionID();

            state._fsp--;

             after(grammarAccess.getCollectionIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID967); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:489:1: ruleCollectionID : ( ( rule__CollectionID__Alternatives ) ) ;
    public final void ruleCollectionID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:493:2: ( ( ( rule__CollectionID__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:494:1: ( ( rule__CollectionID__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:494:1: ( ( rule__CollectionID__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:495:1: ( rule__CollectionID__Alternatives )
            {
             before(grammarAccess.getCollectionIDAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:496:1: ( rule__CollectionID__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:496:2: rule__CollectionID__Alternatives
            {
            pushFollow(FOLLOW_rule__CollectionID__Alternatives_in_ruleCollectionID993);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:508:1: entryRuleRuleDefinition : ruleRuleDefinition EOF ;
    public final void entryRuleRuleDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:509:1: ( ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:510:1: ruleRuleDefinition EOF
            {
             before(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1020);
            ruleRuleDefinition();

            state._fsp--;

             after(grammarAccess.getRuleDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition1027); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:517:1: ruleRuleDefinition : ( ( rule__RuleDefinition__Group__0 ) ) ;
    public final void ruleRuleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:521:2: ( ( ( rule__RuleDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:522:1: ( ( rule__RuleDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:522:1: ( ( rule__RuleDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:523:1: ( rule__RuleDefinition__Group__0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:524:1: ( rule__RuleDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:524:2: rule__RuleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__0_in_ruleRuleDefinition1053);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:536:1: entryRuleRuleObject : ruleRuleObject EOF ;
    public final void entryRuleRuleObject() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:537:1: ( ruleRuleObject EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:538:1: ruleRuleObject EOF
            {
             before(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject1080);
            ruleRuleObject();

            state._fsp--;

             after(grammarAccess.getRuleObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject1087); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:545:1: ruleRuleObject : ( ( rule__RuleObject__Group__0 ) ) ;
    public final void ruleRuleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:549:2: ( ( ( rule__RuleObject__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:550:1: ( ( rule__RuleObject__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:550:1: ( ( rule__RuleObject__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:551:1: ( rule__RuleObject__Group__0 )
            {
             before(grammarAccess.getRuleObjectAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:552:1: ( rule__RuleObject__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:552:2: rule__RuleObject__Group__0
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__0_in_ruleRuleObject1113);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:564:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:565:1: ( ruleImport EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:566:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1140);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1147); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:573:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:577:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:578:1: ( ( rule__Import__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:578:1: ( ( rule__Import__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:579:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:580:1: ( rule__Import__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:580:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport1173);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:592:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:593:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:594:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1200);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1207); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:601:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:605:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:606:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:606:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:607:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:608:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:608:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1233);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:620:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:621:1: ( ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:622:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1260);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1267); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:629:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:633:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:634:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:634:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:635:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:636:1: ( rule__QualifiedName__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:636:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1293);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:648:1: rule__ModelMember__Alternatives : ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) );
    public final void rule__ModelMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:652:1: ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:653:1: ( ruleImport )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:653:1: ( ruleImport )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:654:1: ruleImport
                    {
                     before(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__ModelMember__Alternatives1329);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:659:6: ( ruleVariableDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:659:6: ( ruleVariableDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:660:1: ruleVariableDefinition
                    {
                     before(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariableDefinition_in_rule__ModelMember__Alternatives1346);
                    ruleVariableDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:665:6: ( ruleFunctionDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:665:6: ( ruleFunctionDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:666:1: ruleFunctionDefinition
                    {
                     before(grammarAccess.getModelMemberAccess().getFunctionDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_rule__ModelMember__Alternatives1363);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:676:1: rule__ParameterScope__Alternatives : ( ( 'required' ) | ( 'returned' ) );
    public final void rule__ParameterScope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:680:1: ( ( 'required' ) | ( 'returned' ) )
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:681:1: ( 'required' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:681:1: ( 'required' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:682:1: 'required'
                    {
                     before(grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ParameterScope__Alternatives1396); 
                     after(grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:689:6: ( 'returned' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:689:6: ( 'returned' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:690:1: 'returned'
                    {
                     before(grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ParameterScope__Alternatives1416); 
                     after(grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:702:1: rule__FunctionDefinitionMember__Alternatives : ( ( ruleRuleDefinition ) | ( ruleVariableAssignment ) );
    public final void rule__FunctionDefinitionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:706:1: ( ( ruleRuleDefinition ) | ( ruleVariableAssignment ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:707:1: ( ruleRuleDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:707:1: ( ruleRuleDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:708:1: ruleRuleDefinition
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRuleDefinition_in_rule__FunctionDefinitionMember__Alternatives1450);
                    ruleRuleDefinition();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:713:6: ( ruleVariableAssignment )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:713:6: ( ruleVariableAssignment )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:714:1: ruleVariableAssignment
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rule__FunctionDefinitionMember__Alternatives1467);
                    ruleVariableAssignment();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_1()); 

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


    // $ANTLR start "rule__VariableDeclaration__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:724:1: rule__VariableDeclaration__Alternatives : ( ( ( rule__VariableDeclaration__Group_0__0 ) ) | ( ( rule__VariableDeclaration__Group_1__0 ) ) );
    public final void rule__VariableDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:728:1: ( ( ( rule__VariableDeclaration__Group_0__0 ) ) | ( ( rule__VariableDeclaration__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=16 && LA4_0<=20)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:729:1: ( ( rule__VariableDeclaration__Group_0__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:729:1: ( ( rule__VariableDeclaration__Group_0__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:730:1: ( rule__VariableDeclaration__Group_0__0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getGroup_0()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:731:1: ( rule__VariableDeclaration__Group_0__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:731:2: rule__VariableDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_0__0_in_rule__VariableDeclaration__Alternatives1499);
                    rule__VariableDeclaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:735:6: ( ( rule__VariableDeclaration__Group_1__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:735:6: ( ( rule__VariableDeclaration__Group_1__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:736:1: ( rule__VariableDeclaration__Group_1__0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getGroup_1()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:737:1: ( rule__VariableDeclaration__Group_1__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:737:2: rule__VariableDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__0_in_rule__VariableDeclaration__Alternatives1517);
                    rule__VariableDeclaration__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Alternatives"


    // $ANTLR start "rule__VariableType__PrimitiveAlternatives_1_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:746:1: rule__VariableType__PrimitiveAlternatives_1_0 : ( ( rulePrimitiveVariableType ) | ( RULE_ID ) );
    public final void rule__VariableType__PrimitiveAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:750:1: ( ( rulePrimitiveVariableType ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=20)) ) {
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:751:1: ( rulePrimitiveVariableType )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:751:1: ( rulePrimitiveVariableType )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:752:1: rulePrimitiveVariableType
                    {
                     before(grammarAccess.getVariableTypeAccess().getPrimitivePrimitiveVariableTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_rulePrimitiveVariableType_in_rule__VariableType__PrimitiveAlternatives_1_01550);
                    rulePrimitiveVariableType();

                    state._fsp--;

                     after(grammarAccess.getVariableTypeAccess().getPrimitivePrimitiveVariableTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:757:6: ( RULE_ID )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:757:6: ( RULE_ID )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:758:1: RULE_ID
                    {
                     before(grammarAccess.getVariableTypeAccess().getPrimitiveIDTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableType__PrimitiveAlternatives_1_01567); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:768:1: rule__VariableExpressionOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '|' ) );
    public final void rule__VariableExpressionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:772:1: ( ( '+' ) | ( '-' ) | ( '|' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:773:1: ( '+' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:773:1: ( '+' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:774:1: '+'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__VariableExpressionOperator__Alternatives1600); 
                     after(grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:781:6: ( '-' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:781:6: ( '-' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:782:1: '-'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__VariableExpressionOperator__Alternatives1620); 
                     after(grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:789:6: ( '|' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:789:6: ( '|' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:790:1: '|'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getVerticalLineKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__VariableExpressionOperator__Alternatives1640); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:802:1: rule__PrimitiveVariableType__Alternatives : ( ( 'ID' ) | ( 'URI' ) | ( 'DNA' ) | ( 'CHASSIS' ) | ( 'PROCESS' ) );
    public final void rule__PrimitiveVariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:806:1: ( ( 'ID' ) | ( 'URI' ) | ( 'DNA' ) | ( 'CHASSIS' ) | ( 'PROCESS' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:807:1: ( 'ID' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:807:1: ( 'ID' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:808:1: 'ID'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getIDKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__PrimitiveVariableType__Alternatives1675); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getIDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:815:6: ( 'URI' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:815:6: ( 'URI' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:816:1: 'URI'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getURIKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__PrimitiveVariableType__Alternatives1695); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getURIKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:823:6: ( 'DNA' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:823:6: ( 'DNA' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:824:1: 'DNA'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getDNAKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__PrimitiveVariableType__Alternatives1715); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getDNAKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:831:6: ( 'CHASSIS' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:831:6: ( 'CHASSIS' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:832:1: 'CHASSIS'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getCHASSISKeyword_3()); 
                    match(input,19,FOLLOW_19_in_rule__PrimitiveVariableType__Alternatives1735); 
                     after(grammarAccess.getPrimitiveVariableTypeAccess().getCHASSISKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:839:6: ( 'PROCESS' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:839:6: ( 'PROCESS' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:840:1: 'PROCESS'
                    {
                     before(grammarAccess.getPrimitiveVariableTypeAccess().getPROCESSKeyword_4()); 
                    match(input,20,FOLLOW_20_in_rule__PrimitiveVariableType__Alternatives1755); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:852:1: rule__CollectionID__Alternatives : ( ( 'LIST' ) | ( 'SET' ) );
    public final void rule__CollectionID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:856:1: ( ( 'LIST' ) | ( 'SET' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:857:1: ( 'LIST' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:857:1: ( 'LIST' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:858:1: 'LIST'
                    {
                     before(grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                    match(input,21,FOLLOW_21_in_rule__CollectionID__Alternatives1790); 
                     after(grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:865:6: ( 'SET' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:865:6: ( 'SET' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:866:1: 'SET'
                    {
                     before(grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                    match(input,22,FOLLOW_22_in_rule__CollectionID__Alternatives1810); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:878:1: rule__RuleDefinition__Alternatives_5 : ( ( '->' ) | ( '<->' ) );
    public final void rule__RuleDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:882:1: ( ( '->' ) | ( '<->' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:883:1: ( '->' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:883:1: ( '->' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:884:1: '->'
                    {
                     before(grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
                    match(input,23,FOLLOW_23_in_rule__RuleDefinition__Alternatives_51845); 
                     after(grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:891:6: ( '<->' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:891:6: ( '<->' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:892:1: '<->'
                    {
                     before(grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1()); 
                    match(input,24,FOLLOW_24_in_rule__RuleDefinition__Alternatives_51865); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:906:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:910:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:911:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01897);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01900);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:918:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:922:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:923:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:923:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:924:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:925:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:927:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:937:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:941:1: ( rule__Model__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:942:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11958);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:948:1: rule__Model__Group__1__Impl : ( ( rule__Model__MembersAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:952:1: ( ( ( rule__Model__MembersAssignment_1 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:953:1: ( ( rule__Model__MembersAssignment_1 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:953:1: ( ( rule__Model__MembersAssignment_1 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:954:1: ( rule__Model__MembersAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getMembersAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:955:1: ( rule__Model__MembersAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25||LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:955:2: rule__Model__MembersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__MembersAssignment_1_in_rule__Model__Group__1__Impl1985);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:969:1: rule__VariableDefinition__Group__0 : rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 ;
    public final void rule__VariableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:973:1: ( rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:974:2: rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__0__Impl_in_rule__VariableDefinition__Group__02020);
            rule__VariableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__1_in_rule__VariableDefinition__Group__02023);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:981:1: rule__VariableDefinition__Group__0__Impl : ( () ) ;
    public final void rule__VariableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:985:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:986:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:986:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:987:1: ()
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:988:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:990:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1000:1: rule__VariableDefinition__Group__1 : rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 ;
    public final void rule__VariableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1004:1: ( rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1005:2: rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__1__Impl_in_rule__VariableDefinition__Group__12081);
            rule__VariableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__2_in_rule__VariableDefinition__Group__12084);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1012:1: rule__VariableDefinition__Group__1__Impl : ( 'define' ) ;
    public final void rule__VariableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1016:1: ( ( 'define' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1017:1: ( 'define' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1017:1: ( 'define' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1018:1: 'define'
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__VariableDefinition__Group__1__Impl2112); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1031:1: rule__VariableDefinition__Group__2 : rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 ;
    public final void rule__VariableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1035:1: ( rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1036:2: rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__2__Impl_in_rule__VariableDefinition__Group__22143);
            rule__VariableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__3_in_rule__VariableDefinition__Group__22146);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1043:1: rule__VariableDefinition__Group__2__Impl : ( ( rule__VariableDefinition__TypeAssignment_2 )? ) ;
    public final void rule__VariableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1047:1: ( ( ( rule__VariableDefinition__TypeAssignment_2 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1048:1: ( ( rule__VariableDefinition__TypeAssignment_2 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1048:1: ( ( rule__VariableDefinition__TypeAssignment_2 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1049:1: ( rule__VariableDefinition__TypeAssignment_2 )?
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1050:1: ( rule__VariableDefinition__TypeAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=16 && LA11_0<=20)) ) {
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1050:2: rule__VariableDefinition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__VariableDefinition__TypeAssignment_2_in_rule__VariableDefinition__Group__2__Impl2173);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1060:1: rule__VariableDefinition__Group__3 : rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 ;
    public final void rule__VariableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1064:1: ( rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1065:2: rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__3__Impl_in_rule__VariableDefinition__Group__32204);
            rule__VariableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__4_in_rule__VariableDefinition__Group__32207);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1072:1: rule__VariableDefinition__Group__3__Impl : ( ( rule__VariableDefinition__NameAssignment_3 ) ) ;
    public final void rule__VariableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1076:1: ( ( ( rule__VariableDefinition__NameAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1077:1: ( ( rule__VariableDefinition__NameAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1077:1: ( ( rule__VariableDefinition__NameAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1078:1: ( rule__VariableDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1079:1: ( rule__VariableDefinition__NameAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1079:2: rule__VariableDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableDefinition__NameAssignment_3_in_rule__VariableDefinition__Group__3__Impl2234);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1089:1: rule__VariableDefinition__Group__4 : rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5 ;
    public final void rule__VariableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1093:1: ( rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1094:2: rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__4__Impl_in_rule__VariableDefinition__Group__42264);
            rule__VariableDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__5_in_rule__VariableDefinition__Group__42267);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1101:1: rule__VariableDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__VariableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1105:1: ( ( '{' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1106:1: ( '{' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1106:1: ( '{' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1107:1: '{'
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__VariableDefinition__Group__4__Impl2295); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1120:1: rule__VariableDefinition__Group__5 : rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6 ;
    public final void rule__VariableDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1124:1: ( rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1125:2: rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__5__Impl_in_rule__VariableDefinition__Group__52326);
            rule__VariableDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__6_in_rule__VariableDefinition__Group__52329);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1132:1: rule__VariableDefinition__Group__5__Impl : ( ( rule__VariableDefinition__MembersAssignment_5 )* ) ;
    public final void rule__VariableDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1136:1: ( ( ( rule__VariableDefinition__MembersAssignment_5 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1137:1: ( ( rule__VariableDefinition__MembersAssignment_5 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1137:1: ( ( rule__VariableDefinition__MembersAssignment_5 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1138:1: ( rule__VariableDefinition__MembersAssignment_5 )*
            {
             before(grammarAccess.getVariableDefinitionAccess().getMembersAssignment_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1139:1: ( rule__VariableDefinition__MembersAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=16 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1139:2: rule__VariableDefinition__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__VariableDefinition__MembersAssignment_5_in_rule__VariableDefinition__Group__5__Impl2356);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1149:1: rule__VariableDefinition__Group__6 : rule__VariableDefinition__Group__6__Impl ;
    public final void rule__VariableDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1153:1: ( rule__VariableDefinition__Group__6__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1154:2: rule__VariableDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__6__Impl_in_rule__VariableDefinition__Group__62387);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1160:1: rule__VariableDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__VariableDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1164:1: ( ( '}' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1165:1: ( '}' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1165:1: ( '}' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1166:1: '}'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__VariableDefinition__Group__6__Impl2415); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1193:1: rule__FunctionDefinition__Group__0 : rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 ;
    public final void rule__FunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1197:1: ( rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1198:2: rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02460);
            rule__FunctionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02463);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1205:1: rule__FunctionDefinition__Group__0__Impl : ( () ) ;
    public final void rule__FunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1209:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1210:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1210:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1211:1: ()
            {
             before(grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1212:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1214:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1224:1: rule__FunctionDefinition__Group__1 : rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 ;
    public final void rule__FunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1228:1: ( rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1229:2: rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12521);
            rule__FunctionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12524);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1236:1: rule__FunctionDefinition__Group__1__Impl : ( 'define' ) ;
    public final void rule__FunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1240:1: ( ( 'define' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1241:1: ( 'define' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1241:1: ( 'define' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1242:1: 'define'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__FunctionDefinition__Group__1__Impl2552); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1255:1: rule__FunctionDefinition__Group__2 : rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 ;
    public final void rule__FunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1259:1: ( rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1260:2: rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22583);
            rule__FunctionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22586);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1267:1: rule__FunctionDefinition__Group__2__Impl : ( ( rule__FunctionDefinition__TypeAssignment_2 )? ) ;
    public final void rule__FunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1271:1: ( ( ( rule__FunctionDefinition__TypeAssignment_2 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1272:1: ( ( rule__FunctionDefinition__TypeAssignment_2 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1272:1: ( ( rule__FunctionDefinition__TypeAssignment_2 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1273:1: ( rule__FunctionDefinition__TypeAssignment_2 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getTypeAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1274:1: ( rule__FunctionDefinition__TypeAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=16 && LA13_0<=20)) ) {
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1274:2: rule__FunctionDefinition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__TypeAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2613);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1284:1: rule__FunctionDefinition__Group__3 : rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 ;
    public final void rule__FunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1288:1: ( rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1289:2: rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32644);
            rule__FunctionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32647);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1296:1: rule__FunctionDefinition__Group__3__Impl : ( ( rule__FunctionDefinition__NameAssignment_3 ) ) ;
    public final void rule__FunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1300:1: ( ( ( rule__FunctionDefinition__NameAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1301:1: ( ( rule__FunctionDefinition__NameAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1301:1: ( ( rule__FunctionDefinition__NameAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1302:1: ( rule__FunctionDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1303:1: ( rule__FunctionDefinition__NameAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1303:2: rule__FunctionDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__NameAssignment_3_in_rule__FunctionDefinition__Group__3__Impl2674);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1313:1: rule__FunctionDefinition__Group__4 : rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 ;
    public final void rule__FunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1317:1: ( rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1318:2: rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42704);
            rule__FunctionDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42707);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1325:1: rule__FunctionDefinition__Group__4__Impl : ( '(' ) ;
    public final void rule__FunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1329:1: ( ( '(' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1330:1: ( '(' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1330:1: ( '(' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1331:1: '('
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__FunctionDefinition__Group__4__Impl2735); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1344:1: rule__FunctionDefinition__Group__5 : rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6 ;
    public final void rule__FunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1348:1: ( rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1349:2: rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52766);
            rule__FunctionDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__6_in_rule__FunctionDefinition__Group__52769);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1356:1: rule__FunctionDefinition__Group__5__Impl : ( ( rule__FunctionDefinition__ParametersAssignment_5 )* ) ;
    public final void rule__FunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1360:1: ( ( ( rule__FunctionDefinition__ParametersAssignment_5 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1361:1: ( ( rule__FunctionDefinition__ParametersAssignment_5 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1361:1: ( ( rule__FunctionDefinition__ParametersAssignment_5 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1362:1: ( rule__FunctionDefinition__ParametersAssignment_5 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1363:1: ( rule__FunctionDefinition__ParametersAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        int LA14_2 = input.LA(3);

                        if ( (LA14_2==32) ) {
                            int LA14_3 = input.LA(4);

                            if ( (LA14_3==11) ) {
                                int LA14_4 = input.LA(5);

                                if ( (LA14_4==RULE_ID) ) {
                                    alt14=1;
                                }


                            }
                            else if ( (LA14_3==12) ) {
                                int LA14_5 = input.LA(5);

                                if ( (LA14_5==RULE_ID) ) {
                                    alt14=1;
                                }


                            }


                        }


                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1363:2: rule__FunctionDefinition__ParametersAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2796);
            	    rule__FunctionDefinition__ParametersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1373:1: rule__FunctionDefinition__Group__6 : rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7 ;
    public final void rule__FunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1377:1: ( rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1378:2: rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__6__Impl_in_rule__FunctionDefinition__Group__62827);
            rule__FunctionDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__7_in_rule__FunctionDefinition__Group__62830);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1385:1: rule__FunctionDefinition__Group__6__Impl : ( ( rule__FunctionDefinition__ParametersAssignment_6 ) ) ;
    public final void rule__FunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1389:1: ( ( ( rule__FunctionDefinition__ParametersAssignment_6 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1390:1: ( ( rule__FunctionDefinition__ParametersAssignment_6 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1390:1: ( ( rule__FunctionDefinition__ParametersAssignment_6 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1391:1: ( rule__FunctionDefinition__ParametersAssignment_6 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_6()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1392:1: ( rule__FunctionDefinition__ParametersAssignment_6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1392:2: rule__FunctionDefinition__ParametersAssignment_6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ParametersAssignment_6_in_rule__FunctionDefinition__Group__6__Impl2857);
            rule__FunctionDefinition__ParametersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_6()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1402:1: rule__FunctionDefinition__Group__7 : rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8 ;
    public final void rule__FunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1406:1: ( rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1407:2: rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__7__Impl_in_rule__FunctionDefinition__Group__72887);
            rule__FunctionDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__8_in_rule__FunctionDefinition__Group__72890);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1414:1: rule__FunctionDefinition__Group__7__Impl : ( ( rule__FunctionDefinition__Group_7__0 )* ) ;
    public final void rule__FunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1418:1: ( ( ( rule__FunctionDefinition__Group_7__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1419:1: ( ( rule__FunctionDefinition__Group_7__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1419:1: ( ( rule__FunctionDefinition__Group_7__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1420:1: ( rule__FunctionDefinition__Group_7__0 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_7()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1421:1: ( rule__FunctionDefinition__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1421:2: rule__FunctionDefinition__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__Group_7__0_in_rule__FunctionDefinition__Group__7__Impl2917);
            	    rule__FunctionDefinition__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_7()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1431:1: rule__FunctionDefinition__Group__8 : rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9 ;
    public final void rule__FunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1435:1: ( rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1436:2: rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__8__Impl_in_rule__FunctionDefinition__Group__82948);
            rule__FunctionDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__9_in_rule__FunctionDefinition__Group__82951);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1443:1: rule__FunctionDefinition__Group__8__Impl : ( ')' ) ;
    public final void rule__FunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1447:1: ( ( ')' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1448:1: ( ')' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1448:1: ( ')' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1449:1: ')'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_8()); 
            match(input,29,FOLLOW_29_in_rule__FunctionDefinition__Group__8__Impl2979); 
             after(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_8()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1462:1: rule__FunctionDefinition__Group__9 : rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10 ;
    public final void rule__FunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1466:1: ( rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1467:2: rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__9__Impl_in_rule__FunctionDefinition__Group__93010);
            rule__FunctionDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__10_in_rule__FunctionDefinition__Group__93013);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1474:1: rule__FunctionDefinition__Group__9__Impl : ( '{' ) ;
    public final void rule__FunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1478:1: ( ( '{' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1479:1: ( '{' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1479:1: ( '{' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1480:1: '{'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_26_in_rule__FunctionDefinition__Group__9__Impl3041); 
             after(grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_9()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1493:1: rule__FunctionDefinition__Group__10 : rule__FunctionDefinition__Group__10__Impl rule__FunctionDefinition__Group__11 ;
    public final void rule__FunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1497:1: ( rule__FunctionDefinition__Group__10__Impl rule__FunctionDefinition__Group__11 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1498:2: rule__FunctionDefinition__Group__10__Impl rule__FunctionDefinition__Group__11
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__10__Impl_in_rule__FunctionDefinition__Group__103072);
            rule__FunctionDefinition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__11_in_rule__FunctionDefinition__Group__103075);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1505:1: rule__FunctionDefinition__Group__10__Impl : ( ( rule__FunctionDefinition__MembersAssignment_10 )* ) ;
    public final void rule__FunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1509:1: ( ( ( rule__FunctionDefinition__MembersAssignment_10 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1510:1: ( ( rule__FunctionDefinition__MembersAssignment_10 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1510:1: ( ( rule__FunctionDefinition__MembersAssignment_10 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1511:1: ( rule__FunctionDefinition__MembersAssignment_10 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_10()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1512:1: ( rule__FunctionDefinition__MembersAssignment_10 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1512:2: rule__FunctionDefinition__MembersAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__MembersAssignment_10_in_rule__FunctionDefinition__Group__10__Impl3102);
            	    rule__FunctionDefinition__MembersAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_10()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1522:1: rule__FunctionDefinition__Group__11 : rule__FunctionDefinition__Group__11__Impl rule__FunctionDefinition__Group__12 ;
    public final void rule__FunctionDefinition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1526:1: ( rule__FunctionDefinition__Group__11__Impl rule__FunctionDefinition__Group__12 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1527:2: rule__FunctionDefinition__Group__11__Impl rule__FunctionDefinition__Group__12
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__11__Impl_in_rule__FunctionDefinition__Group__113133);
            rule__FunctionDefinition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__12_in_rule__FunctionDefinition__Group__113136);
            rule__FunctionDefinition__Group__12();

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1534:1: rule__FunctionDefinition__Group__11__Impl : ( '}' ) ;
    public final void rule__FunctionDefinition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1538:1: ( ( '}' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1539:1: ( '}' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1539:1: ( '}' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1540:1: '}'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,27,FOLLOW_27_in_rule__FunctionDefinition__Group__11__Impl3164); 
             after(grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_11()); 

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


    // $ANTLR start "rule__FunctionDefinition__Group__12"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1553:1: rule__FunctionDefinition__Group__12 : rule__FunctionDefinition__Group__12__Impl ;
    public final void rule__FunctionDefinition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1557:1: ( rule__FunctionDefinition__Group__12__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1558:2: rule__FunctionDefinition__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__12__Impl_in_rule__FunctionDefinition__Group__123195);
            rule__FunctionDefinition__Group__12__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group__12"


    // $ANTLR start "rule__FunctionDefinition__Group__12__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1564:1: rule__FunctionDefinition__Group__12__Impl : ( ( 'USES' )? ) ;
    public final void rule__FunctionDefinition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1568:1: ( ( ( 'USES' )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1569:1: ( ( 'USES' )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1569:1: ( ( 'USES' )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1570:1: ( 'USES' )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_12()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1571:1: ( 'USES' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1572:2: 'USES'
                    {
                    match(input,30,FOLLOW_30_in_rule__FunctionDefinition__Group__12__Impl3224); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_12()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group__12__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_7__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1609:1: rule__FunctionDefinition__Group_7__0 : rule__FunctionDefinition__Group_7__0__Impl rule__FunctionDefinition__Group_7__1 ;
    public final void rule__FunctionDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1613:1: ( rule__FunctionDefinition__Group_7__0__Impl rule__FunctionDefinition__Group_7__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1614:2: rule__FunctionDefinition__Group_7__0__Impl rule__FunctionDefinition__Group_7__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_7__0__Impl_in_rule__FunctionDefinition__Group_7__03283);
            rule__FunctionDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_7__1_in_rule__FunctionDefinition__Group_7__03286);
            rule__FunctionDefinition__Group_7__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group_7__0"


    // $ANTLR start "rule__FunctionDefinition__Group_7__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1621:1: rule__FunctionDefinition__Group_7__0__Impl : ( ',' ) ;
    public final void rule__FunctionDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1625:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1626:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1626:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1627:1: ','
            {
             before(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__FunctionDefinition__Group_7__0__Impl3314); 
             after(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_7__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1640:1: rule__FunctionDefinition__Group_7__1 : rule__FunctionDefinition__Group_7__1__Impl ;
    public final void rule__FunctionDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1644:1: ( rule__FunctionDefinition__Group_7__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1645:2: rule__FunctionDefinition__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_7__1__Impl_in_rule__FunctionDefinition__Group_7__13345);
            rule__FunctionDefinition__Group_7__1__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group_7__1"


    // $ANTLR start "rule__FunctionDefinition__Group_7__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1651:1: rule__FunctionDefinition__Group_7__1__Impl : ( ( rule__FunctionDefinition__ParametersAssignment_7_1 ) ) ;
    public final void rule__FunctionDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1655:1: ( ( ( rule__FunctionDefinition__ParametersAssignment_7_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1656:1: ( ( rule__FunctionDefinition__ParametersAssignment_7_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1656:1: ( ( rule__FunctionDefinition__ParametersAssignment_7_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1657:1: ( rule__FunctionDefinition__ParametersAssignment_7_1 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_7_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1658:1: ( rule__FunctionDefinition__ParametersAssignment_7_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1658:2: rule__FunctionDefinition__ParametersAssignment_7_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ParametersAssignment_7_1_in_rule__FunctionDefinition__Group_7__1__Impl3372);
            rule__FunctionDefinition__ParametersAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_7_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__FunctionParameterMember__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1672:1: rule__FunctionParameterMember__Group__0 : rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1 ;
    public final void rule__FunctionParameterMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1676:1: ( rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1677:2: rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__0__Impl_in_rule__FunctionParameterMember__Group__03406);
            rule__FunctionParameterMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__1_in_rule__FunctionParameterMember__Group__03409);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1684:1: rule__FunctionParameterMember__Group__0__Impl : ( ( rule__FunctionParameterMember__TypeAssignment_0 ) ) ;
    public final void rule__FunctionParameterMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1688:1: ( ( ( rule__FunctionParameterMember__TypeAssignment_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1689:1: ( ( rule__FunctionParameterMember__TypeAssignment_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1689:1: ( ( rule__FunctionParameterMember__TypeAssignment_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1690:1: ( rule__FunctionParameterMember__TypeAssignment_0 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getTypeAssignment_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1691:1: ( rule__FunctionParameterMember__TypeAssignment_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1691:2: rule__FunctionParameterMember__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__TypeAssignment_0_in_rule__FunctionParameterMember__Group__0__Impl3436);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1701:1: rule__FunctionParameterMember__Group__1 : rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2 ;
    public final void rule__FunctionParameterMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1705:1: ( rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1706:2: rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__1__Impl_in_rule__FunctionParameterMember__Group__13466);
            rule__FunctionParameterMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__2_in_rule__FunctionParameterMember__Group__13469);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1713:1: rule__FunctionParameterMember__Group__1__Impl : ( ( rule__FunctionParameterMember__NameAssignment_1 ) ) ;
    public final void rule__FunctionParameterMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1717:1: ( ( ( rule__FunctionParameterMember__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1718:1: ( ( rule__FunctionParameterMember__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1718:1: ( ( rule__FunctionParameterMember__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1719:1: ( rule__FunctionParameterMember__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1720:1: ( rule__FunctionParameterMember__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1720:2: rule__FunctionParameterMember__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__NameAssignment_1_in_rule__FunctionParameterMember__Group__1__Impl3496);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1730:1: rule__FunctionParameterMember__Group__2 : rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3 ;
    public final void rule__FunctionParameterMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1734:1: ( rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1735:2: rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__2__Impl_in_rule__FunctionParameterMember__Group__23526);
            rule__FunctionParameterMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__3_in_rule__FunctionParameterMember__Group__23529);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1742:1: rule__FunctionParameterMember__Group__2__Impl : ( ':' ) ;
    public final void rule__FunctionParameterMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1746:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1747:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1747:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1748:1: ':'
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__FunctionParameterMember__Group__2__Impl3557); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1761:1: rule__FunctionParameterMember__Group__3 : rule__FunctionParameterMember__Group__3__Impl ;
    public final void rule__FunctionParameterMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1765:1: ( rule__FunctionParameterMember__Group__3__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1766:2: rule__FunctionParameterMember__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__3__Impl_in_rule__FunctionParameterMember__Group__33588);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1772:1: rule__FunctionParameterMember__Group__3__Impl : ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) ) ;
    public final void rule__FunctionParameterMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1776:1: ( ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1777:1: ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1777:1: ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1778:1: ( rule__FunctionParameterMember__ScopeAssignment_3 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getScopeAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1779:1: ( rule__FunctionParameterMember__ScopeAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1779:2: rule__FunctionParameterMember__ScopeAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__ScopeAssignment_3_in_rule__FunctionParameterMember__Group__3__Impl3615);
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


    // $ANTLR start "rule__VariableDeclaration__Group_0__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1797:1: rule__VariableDeclaration__Group_0__0 : rule__VariableDeclaration__Group_0__0__Impl rule__VariableDeclaration__Group_0__1 ;
    public final void rule__VariableDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1801:1: ( rule__VariableDeclaration__Group_0__0__Impl rule__VariableDeclaration__Group_0__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1802:2: rule__VariableDeclaration__Group_0__0__Impl rule__VariableDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_0__0__Impl_in_rule__VariableDeclaration__Group_0__03653);
            rule__VariableDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_0__1_in_rule__VariableDeclaration__Group_0__03656);
            rule__VariableDeclaration__Group_0__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_0__0"


    // $ANTLR start "rule__VariableDeclaration__Group_0__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1809:1: rule__VariableDeclaration__Group_0__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1813:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1814:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1814:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1815:1: ()
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1816:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1818:1: 
            {
            }

             after(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_0__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1828:1: rule__VariableDeclaration__Group_0__1 : rule__VariableDeclaration__Group_0__1__Impl ;
    public final void rule__VariableDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1832:1: ( rule__VariableDeclaration__Group_0__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1833:2: rule__VariableDeclaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_0__1__Impl_in_rule__VariableDeclaration__Group_0__13714);
            rule__VariableDeclaration__Group_0__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_0__1"


    // $ANTLR start "rule__VariableDeclaration__Group_0__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1839:1: rule__VariableDeclaration__Group_0__1__Impl : ( ( rule__VariableDeclaration__Group_0_1__0 ) ) ;
    public final void rule__VariableDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1843:1: ( ( ( rule__VariableDeclaration__Group_0_1__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1844:1: ( ( rule__VariableDeclaration__Group_0_1__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1844:1: ( ( rule__VariableDeclaration__Group_0_1__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1845:1: ( rule__VariableDeclaration__Group_0_1__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_0_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1846:1: ( rule__VariableDeclaration__Group_0_1__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1846:2: rule__VariableDeclaration__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_0_1__0_in_rule__VariableDeclaration__Group_0__1__Impl3741);
            rule__VariableDeclaration__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_0_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1860:1: rule__VariableDeclaration__Group_0_1__0 : rule__VariableDeclaration__Group_0_1__0__Impl rule__VariableDeclaration__Group_0_1__1 ;
    public final void rule__VariableDeclaration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1864:1: ( rule__VariableDeclaration__Group_0_1__0__Impl rule__VariableDeclaration__Group_0_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1865:2: rule__VariableDeclaration__Group_0_1__0__Impl rule__VariableDeclaration__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_0_1__0__Impl_in_rule__VariableDeclaration__Group_0_1__03775);
            rule__VariableDeclaration__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_0_1__1_in_rule__VariableDeclaration__Group_0_1__03778);
            rule__VariableDeclaration__Group_0_1__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_0_1__0"


    // $ANTLR start "rule__VariableDeclaration__Group_0_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1872:1: rule__VariableDeclaration__Group_0_1__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_0_1_0 ) ) ;
    public final void rule__VariableDeclaration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1876:1: ( ( ( rule__VariableDeclaration__TypeAssignment_0_1_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1877:1: ( ( rule__VariableDeclaration__TypeAssignment_0_1_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1877:1: ( ( rule__VariableDeclaration__TypeAssignment_0_1_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1878:1: ( rule__VariableDeclaration__TypeAssignment_0_1_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0_1_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1879:1: ( rule__VariableDeclaration__TypeAssignment_0_1_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1879:2: rule__VariableDeclaration__TypeAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_0_1_0_in_rule__VariableDeclaration__Group_0_1__0__Impl3805);
            rule__VariableDeclaration__TypeAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_0_1__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_0_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1889:1: rule__VariableDeclaration__Group_0_1__1 : rule__VariableDeclaration__Group_0_1__1__Impl ;
    public final void rule__VariableDeclaration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1893:1: ( rule__VariableDeclaration__Group_0_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1894:2: rule__VariableDeclaration__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_0_1__1__Impl_in_rule__VariableDeclaration__Group_0_1__13835);
            rule__VariableDeclaration__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_0_1__1"


    // $ANTLR start "rule__VariableDeclaration__Group_0_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1900:1: rule__VariableDeclaration__Group_0_1__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_0_1_1 ) ) ;
    public final void rule__VariableDeclaration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1904:1: ( ( ( rule__VariableDeclaration__NameAssignment_0_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1905:1: ( ( rule__VariableDeclaration__NameAssignment_0_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1905:1: ( ( rule__VariableDeclaration__NameAssignment_0_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1906:1: ( rule__VariableDeclaration__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1907:1: ( rule__VariableDeclaration__NameAssignment_0_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1907:2: rule__VariableDeclaration__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_0_1_1_in_rule__VariableDeclaration__Group_0_1__1__Impl3862);
            rule__VariableDeclaration__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0_1_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_0_1__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1921:1: rule__VariableDeclaration__Group_1__0 : rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1 ;
    public final void rule__VariableDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1925:1: ( rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1926:2: rule__VariableDeclaration__Group_1__0__Impl rule__VariableDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__0__Impl_in_rule__VariableDeclaration__Group_1__03896);
            rule__VariableDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__1_in_rule__VariableDeclaration__Group_1__03899);
            rule__VariableDeclaration__Group_1__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__0"


    // $ANTLR start "rule__VariableDeclaration__Group_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1933:1: rule__VariableDeclaration__Group_1__0__Impl : ( ( rule__VariableDeclaration__CollectionAssignment_1_0 ) ) ;
    public final void rule__VariableDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1937:1: ( ( ( rule__VariableDeclaration__CollectionAssignment_1_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1938:1: ( ( rule__VariableDeclaration__CollectionAssignment_1_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1938:1: ( ( rule__VariableDeclaration__CollectionAssignment_1_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1939:1: ( rule__VariableDeclaration__CollectionAssignment_1_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getCollectionAssignment_1_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1940:1: ( rule__VariableDeclaration__CollectionAssignment_1_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1940:2: rule__VariableDeclaration__CollectionAssignment_1_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__CollectionAssignment_1_0_in_rule__VariableDeclaration__Group_1__0__Impl3926);
            rule__VariableDeclaration__CollectionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getCollectionAssignment_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1950:1: rule__VariableDeclaration__Group_1__1 : rule__VariableDeclaration__Group_1__1__Impl rule__VariableDeclaration__Group_1__2 ;
    public final void rule__VariableDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1954:1: ( rule__VariableDeclaration__Group_1__1__Impl rule__VariableDeclaration__Group_1__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1955:2: rule__VariableDeclaration__Group_1__1__Impl rule__VariableDeclaration__Group_1__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__1__Impl_in_rule__VariableDeclaration__Group_1__13956);
            rule__VariableDeclaration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__2_in_rule__VariableDeclaration__Group_1__13959);
            rule__VariableDeclaration__Group_1__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__1"


    // $ANTLR start "rule__VariableDeclaration__Group_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1962:1: rule__VariableDeclaration__Group_1__1__Impl : ( '<' ) ;
    public final void rule__VariableDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1966:1: ( ( '<' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1967:1: ( '<' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1967:1: ( '<' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1968:1: '<'
            {
             before(grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_1_1()); 
            match(input,33,FOLLOW_33_in_rule__VariableDeclaration__Group_1__1__Impl3987); 
             after(grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_1__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1981:1: rule__VariableDeclaration__Group_1__2 : rule__VariableDeclaration__Group_1__2__Impl rule__VariableDeclaration__Group_1__3 ;
    public final void rule__VariableDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1985:1: ( rule__VariableDeclaration__Group_1__2__Impl rule__VariableDeclaration__Group_1__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1986:2: rule__VariableDeclaration__Group_1__2__Impl rule__VariableDeclaration__Group_1__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__2__Impl_in_rule__VariableDeclaration__Group_1__24018);
            rule__VariableDeclaration__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__3_in_rule__VariableDeclaration__Group_1__24021);
            rule__VariableDeclaration__Group_1__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__2"


    // $ANTLR start "rule__VariableDeclaration__Group_1__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1993:1: rule__VariableDeclaration__Group_1__2__Impl : ( ( rule__VariableDeclaration__TypeAssignment_1_2 ) ) ;
    public final void rule__VariableDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1997:1: ( ( ( rule__VariableDeclaration__TypeAssignment_1_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1998:1: ( ( rule__VariableDeclaration__TypeAssignment_1_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1998:1: ( ( rule__VariableDeclaration__TypeAssignment_1_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1999:1: ( rule__VariableDeclaration__TypeAssignment_1_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2000:1: ( rule__VariableDeclaration__TypeAssignment_1_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2000:2: rule__VariableDeclaration__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_1_2_in_rule__VariableDeclaration__Group_1__2__Impl4048);
            rule__VariableDeclaration__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1_2()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_1__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2010:1: rule__VariableDeclaration__Group_1__3 : rule__VariableDeclaration__Group_1__3__Impl rule__VariableDeclaration__Group_1__4 ;
    public final void rule__VariableDeclaration__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2014:1: ( rule__VariableDeclaration__Group_1__3__Impl rule__VariableDeclaration__Group_1__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2015:2: rule__VariableDeclaration__Group_1__3__Impl rule__VariableDeclaration__Group_1__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__3__Impl_in_rule__VariableDeclaration__Group_1__34078);
            rule__VariableDeclaration__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__4_in_rule__VariableDeclaration__Group_1__34081);
            rule__VariableDeclaration__Group_1__4();

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__3"


    // $ANTLR start "rule__VariableDeclaration__Group_1__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2022:1: rule__VariableDeclaration__Group_1__3__Impl : ( '>' ) ;
    public final void rule__VariableDeclaration__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2026:1: ( ( '>' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2027:1: ( '>' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2027:1: ( '>' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2028:1: '>'
            {
             before(grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_1_3()); 
            match(input,34,FOLLOW_34_in_rule__VariableDeclaration__Group_1__3__Impl4109); 
             after(grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_1_3()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_1__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2041:1: rule__VariableDeclaration__Group_1__4 : rule__VariableDeclaration__Group_1__4__Impl ;
    public final void rule__VariableDeclaration__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2045:1: ( rule__VariableDeclaration__Group_1__4__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2046:2: rule__VariableDeclaration__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_1__4__Impl_in_rule__VariableDeclaration__Group_1__44140);
            rule__VariableDeclaration__Group_1__4__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__4"


    // $ANTLR start "rule__VariableDeclaration__Group_1__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2052:1: rule__VariableDeclaration__Group_1__4__Impl : ( ( rule__VariableDeclaration__NameAssignment_1_4 ) ) ;
    public final void rule__VariableDeclaration__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2056:1: ( ( ( rule__VariableDeclaration__NameAssignment_1_4 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2057:1: ( ( rule__VariableDeclaration__NameAssignment_1_4 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2057:1: ( ( rule__VariableDeclaration__NameAssignment_1_4 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2058:1: ( rule__VariableDeclaration__NameAssignment_1_4 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2059:1: ( rule__VariableDeclaration__NameAssignment_1_4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2059:2: rule__VariableDeclaration__NameAssignment_1_4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_1_4_in_rule__VariableDeclaration__Group_1__4__Impl4167);
            rule__VariableDeclaration__NameAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1_4()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group_1__4__Impl"


    // $ANTLR start "rule__VariableType__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2079:1: rule__VariableType__Group__0 : rule__VariableType__Group__0__Impl rule__VariableType__Group__1 ;
    public final void rule__VariableType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2083:1: ( rule__VariableType__Group__0__Impl rule__VariableType__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2084:2: rule__VariableType__Group__0__Impl rule__VariableType__Group__1
            {
            pushFollow(FOLLOW_rule__VariableType__Group__0__Impl_in_rule__VariableType__Group__04207);
            rule__VariableType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableType__Group__1_in_rule__VariableType__Group__04210);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2091:1: rule__VariableType__Group__0__Impl : ( () ) ;
    public final void rule__VariableType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2095:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2096:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2096:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2097:1: ()
            {
             before(grammarAccess.getVariableTypeAccess().getVariableTypeAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2098:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2100:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2110:1: rule__VariableType__Group__1 : rule__VariableType__Group__1__Impl ;
    public final void rule__VariableType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2114:1: ( rule__VariableType__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2115:2: rule__VariableType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableType__Group__1__Impl_in_rule__VariableType__Group__14268);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2121:1: rule__VariableType__Group__1__Impl : ( ( rule__VariableType__PrimitiveAssignment_1 ) ) ;
    public final void rule__VariableType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2125:1: ( ( ( rule__VariableType__PrimitiveAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2126:1: ( ( rule__VariableType__PrimitiveAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2126:1: ( ( rule__VariableType__PrimitiveAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2127:1: ( rule__VariableType__PrimitiveAssignment_1 )
            {
             before(grammarAccess.getVariableTypeAccess().getPrimitiveAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2128:1: ( rule__VariableType__PrimitiveAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2128:2: rule__VariableType__PrimitiveAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableType__PrimitiveAssignment_1_in_rule__VariableType__Group__1__Impl4295);
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


    // $ANTLR start "rule__VariableAttribute__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2142:1: rule__VariableAttribute__Group__0 : rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 ;
    public final void rule__VariableAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2146:1: ( rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2147:2: rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__0__Impl_in_rule__VariableAttribute__Group__04329);
            rule__VariableAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group__1_in_rule__VariableAttribute__Group__04332);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2154:1: rule__VariableAttribute__Group__0__Impl : ( () ) ;
    public final void rule__VariableAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2158:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2159:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2159:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2160:1: ()
            {
             before(grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2161:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2163:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2173:1: rule__VariableAttribute__Group__1 : rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 ;
    public final void rule__VariableAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2177:1: ( rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2178:2: rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__1__Impl_in_rule__VariableAttribute__Group__14390);
            rule__VariableAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group__2_in_rule__VariableAttribute__Group__14393);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2185:1: rule__VariableAttribute__Group__1__Impl : ( ( rule__VariableAttribute__NameAssignment_1 ) ) ;
    public final void rule__VariableAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2189:1: ( ( ( rule__VariableAttribute__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2190:1: ( ( rule__VariableAttribute__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2190:1: ( ( rule__VariableAttribute__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2191:1: ( rule__VariableAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAttributeAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2192:1: ( rule__VariableAttribute__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2192:2: rule__VariableAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__NameAssignment_1_in_rule__VariableAttribute__Group__1__Impl4420);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2202:1: rule__VariableAttribute__Group__2 : rule__VariableAttribute__Group__2__Impl ;
    public final void rule__VariableAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2206:1: ( rule__VariableAttribute__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2207:2: rule__VariableAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__2__Impl_in_rule__VariableAttribute__Group__24450);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2213:1: rule__VariableAttribute__Group__2__Impl : ( ( rule__VariableAttribute__Group_2__0 )? ) ;
    public final void rule__VariableAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2217:1: ( ( ( rule__VariableAttribute__Group_2__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2218:1: ( ( rule__VariableAttribute__Group_2__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2218:1: ( ( rule__VariableAttribute__Group_2__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2219:1: ( rule__VariableAttribute__Group_2__0 )?
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2220:1: ( rule__VariableAttribute__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2220:2: rule__VariableAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VariableAttribute__Group_2__0_in_rule__VariableAttribute__Group__2__Impl4477);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2236:1: rule__VariableAttribute__Group_2__0 : rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1 ;
    public final void rule__VariableAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2240:1: ( rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2241:2: rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__0__Impl_in_rule__VariableAttribute__Group_2__04514);
            rule__VariableAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__1_in_rule__VariableAttribute__Group_2__04517);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2248:1: rule__VariableAttribute__Group_2__0__Impl : ( '.' ) ;
    public final void rule__VariableAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2252:1: ( ( '.' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2253:1: ( '.' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2253:1: ( '.' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2254:1: '.'
            {
             before(grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__VariableAttribute__Group_2__0__Impl4545); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2267:1: rule__VariableAttribute__Group_2__1 : rule__VariableAttribute__Group_2__1__Impl ;
    public final void rule__VariableAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2271:1: ( rule__VariableAttribute__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2272:2: rule__VariableAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__1__Impl_in_rule__VariableAttribute__Group_2__14576);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2278:1: rule__VariableAttribute__Group_2__1__Impl : ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) ) ;
    public final void rule__VariableAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2282:1: ( ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2283:1: ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2283:1: ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2284:1: ( rule__VariableAttribute__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getVariableAttributeAccess().getAttributeAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2285:1: ( rule__VariableAttribute__AttributeAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2285:2: rule__VariableAttribute__AttributeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__AttributeAssignment_2_1_in_rule__VariableAttribute__Group_2__1__Impl4603);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2299:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2303:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2304:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__04637);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__04640);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2311:1: rule__VariableAssignment__Group__0__Impl : ( () ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2315:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2316:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2316:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2317:1: ()
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2318:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2320:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2330:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2334:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2335:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__14698);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__14701);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2342:1: rule__VariableAssignment__Group__1__Impl : ( ( rule__VariableAssignment__VariableAssignment_1 ) ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2346:1: ( ( ( rule__VariableAssignment__VariableAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2347:1: ( ( rule__VariableAssignment__VariableAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2347:1: ( ( rule__VariableAssignment__VariableAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2348:1: ( rule__VariableAssignment__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2349:1: ( rule__VariableAssignment__VariableAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2349:2: rule__VariableAssignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__VariableAssignment_1_in_rule__VariableAssignment__Group__1__Impl4728);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2359:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3 ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2363:1: ( rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2364:2: rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__24758);
            rule__VariableAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__3_in_rule__VariableAssignment__Group__24761);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2371:1: rule__VariableAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2375:1: ( ( '=' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2376:1: ( '=' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2376:1: ( '=' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2377:1: '='
            {
             before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__VariableAssignment__Group__2__Impl4789); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2390:1: rule__VariableAssignment__Group__3 : rule__VariableAssignment__Group__3__Impl ;
    public final void rule__VariableAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2394:1: ( rule__VariableAssignment__Group__3__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2395:2: rule__VariableAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__3__Impl_in_rule__VariableAssignment__Group__34820);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2401:1: rule__VariableAssignment__Group__3__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2405:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2406:1: ( ( rule__VariableAssignment__ExpressionAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2406:1: ( ( rule__VariableAssignment__ExpressionAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2407:1: ( rule__VariableAssignment__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2408:1: ( rule__VariableAssignment__ExpressionAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2408:2: rule__VariableAssignment__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableAssignment__ExpressionAssignment_3_in_rule__VariableAssignment__Group__3__Impl4847);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2426:1: rule__VariableExpression__Group__0 : rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1 ;
    public final void rule__VariableExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2430:1: ( rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2431:2: rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__0__Impl_in_rule__VariableExpression__Group__04885);
            rule__VariableExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group__1_in_rule__VariableExpression__Group__04888);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2438:1: rule__VariableExpression__Group__0__Impl : ( () ) ;
    public final void rule__VariableExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2442:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2443:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2443:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2444:1: ()
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2445:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2447:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2457:1: rule__VariableExpression__Group__1 : rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2 ;
    public final void rule__VariableExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2461:1: ( rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2462:2: rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__1__Impl_in_rule__VariableExpression__Group__14946);
            rule__VariableExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group__2_in_rule__VariableExpression__Group__14949);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2469:1: rule__VariableExpression__Group__1__Impl : ( ( rule__VariableExpression__MembersAssignment_1 ) ) ;
    public final void rule__VariableExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2473:1: ( ( ( rule__VariableExpression__MembersAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2474:1: ( ( rule__VariableExpression__MembersAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2474:1: ( ( rule__VariableExpression__MembersAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2475:1: ( rule__VariableExpression__MembersAssignment_1 )
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2476:1: ( rule__VariableExpression__MembersAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2476:2: rule__VariableExpression__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableExpression__MembersAssignment_1_in_rule__VariableExpression__Group__1__Impl4976);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2486:1: rule__VariableExpression__Group__2 : rule__VariableExpression__Group__2__Impl ;
    public final void rule__VariableExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2490:1: ( rule__VariableExpression__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2491:2: rule__VariableExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__2__Impl_in_rule__VariableExpression__Group__25006);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2497:1: rule__VariableExpression__Group__2__Impl : ( ( rule__VariableExpression__Group_2__0 )* ) ;
    public final void rule__VariableExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2501:1: ( ( ( rule__VariableExpression__Group_2__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2502:1: ( ( rule__VariableExpression__Group_2__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2502:1: ( ( rule__VariableExpression__Group_2__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2503:1: ( rule__VariableExpression__Group_2__0 )*
            {
             before(grammarAccess.getVariableExpressionAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2504:1: ( rule__VariableExpression__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=13 && LA19_0<=15)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2504:2: rule__VariableExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableExpression__Group_2__0_in_rule__VariableExpression__Group__2__Impl5033);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2520:1: rule__VariableExpression__Group_2__0 : rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1 ;
    public final void rule__VariableExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2524:1: ( rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2525:2: rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group_2__0__Impl_in_rule__VariableExpression__Group_2__05070);
            rule__VariableExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group_2__1_in_rule__VariableExpression__Group_2__05073);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2532:1: rule__VariableExpression__Group_2__0__Impl : ( ruleVariableExpressionOperator ) ;
    public final void rule__VariableExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2536:1: ( ( ruleVariableExpressionOperator ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2537:1: ( ruleVariableExpressionOperator )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2537:1: ( ruleVariableExpressionOperator )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2538:1: ruleVariableExpressionOperator
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_rule__VariableExpression__Group_2__0__Impl5100);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2549:1: rule__VariableExpression__Group_2__1 : rule__VariableExpression__Group_2__1__Impl ;
    public final void rule__VariableExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2553:1: ( rule__VariableExpression__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2554:2: rule__VariableExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group_2__1__Impl_in_rule__VariableExpression__Group_2__15129);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2560:1: rule__VariableExpression__Group_2__1__Impl : ( ( rule__VariableExpression__MembersAssignment_2_1 ) ) ;
    public final void rule__VariableExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2564:1: ( ( ( rule__VariableExpression__MembersAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2565:1: ( ( rule__VariableExpression__MembersAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2565:1: ( ( rule__VariableExpression__MembersAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2566:1: ( rule__VariableExpression__MembersAssignment_2_1 )
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2567:1: ( rule__VariableExpression__MembersAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2567:2: rule__VariableExpression__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariableExpression__MembersAssignment_2_1_in_rule__VariableExpression__Group_2__1__Impl5156);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2581:1: rule__RuleDefinition__Group__0 : rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1 ;
    public final void rule__RuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2585:1: ( rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2586:2: rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__0__Impl_in_rule__RuleDefinition__Group__05190);
            rule__RuleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__1_in_rule__RuleDefinition__Group__05193);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2593:1: rule__RuleDefinition__Group__0__Impl : ( () ) ;
    public final void rule__RuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2597:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2598:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2598:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2599:1: ()
            {
             before(grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2600:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2602:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2612:1: rule__RuleDefinition__Group__1 : rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2 ;
    public final void rule__RuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2616:1: ( rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2617:2: rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__1__Impl_in_rule__RuleDefinition__Group__15251);
            rule__RuleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__2_in_rule__RuleDefinition__Group__15254);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2624:1: rule__RuleDefinition__Group__1__Impl : ( 'RULE' ) ;
    public final void rule__RuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2628:1: ( ( 'RULE' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2629:1: ( 'RULE' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2629:1: ( 'RULE' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2630:1: 'RULE'
            {
             before(grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__RuleDefinition__Group__1__Impl5282); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2643:1: rule__RuleDefinition__Group__2 : rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3 ;
    public final void rule__RuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2647:1: ( rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2648:2: rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__2__Impl_in_rule__RuleDefinition__Group__25313);
            rule__RuleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__3_in_rule__RuleDefinition__Group__25316);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2655:1: rule__RuleDefinition__Group__2__Impl : ( ( rule__RuleDefinition__NameAssignment_2 ) ) ;
    public final void rule__RuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2659:1: ( ( ( rule__RuleDefinition__NameAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2660:1: ( ( rule__RuleDefinition__NameAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2660:1: ( ( rule__RuleDefinition__NameAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2661:1: ( rule__RuleDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getNameAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2662:1: ( rule__RuleDefinition__NameAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2662:2: rule__RuleDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RuleDefinition__NameAssignment_2_in_rule__RuleDefinition__Group__2__Impl5343);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2672:1: rule__RuleDefinition__Group__3 : rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4 ;
    public final void rule__RuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2676:1: ( rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2677:2: rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__3__Impl_in_rule__RuleDefinition__Group__35373);
            rule__RuleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__4_in_rule__RuleDefinition__Group__35376);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2684:1: rule__RuleDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__RuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2688:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2689:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2689:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2690:1: ':'
            {
             before(grammarAccess.getRuleDefinitionAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__RuleDefinition__Group__3__Impl5404); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2703:1: rule__RuleDefinition__Group__4 : rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5 ;
    public final void rule__RuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2707:1: ( rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2708:2: rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__4__Impl_in_rule__RuleDefinition__Group__45435);
            rule__RuleDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__5_in_rule__RuleDefinition__Group__45438);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2715:1: rule__RuleDefinition__Group__4__Impl : ( ( rule__RuleDefinition__Group_4__0 )? ) ;
    public final void rule__RuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2719:1: ( ( ( rule__RuleDefinition__Group_4__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2720:1: ( ( rule__RuleDefinition__Group_4__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2720:1: ( ( rule__RuleDefinition__Group_4__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2721:1: ( rule__RuleDefinition__Group_4__0 )?
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2722:1: ( rule__RuleDefinition__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2722:2: rule__RuleDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RuleDefinition__Group_4__0_in_rule__RuleDefinition__Group__4__Impl5465);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2732:1: rule__RuleDefinition__Group__5 : rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6 ;
    public final void rule__RuleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2736:1: ( rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2737:2: rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__5__Impl_in_rule__RuleDefinition__Group__55496);
            rule__RuleDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__6_in_rule__RuleDefinition__Group__55499);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2744:1: rule__RuleDefinition__Group__5__Impl : ( ( rule__RuleDefinition__Alternatives_5 ) ) ;
    public final void rule__RuleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2748:1: ( ( ( rule__RuleDefinition__Alternatives_5 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2749:1: ( ( rule__RuleDefinition__Alternatives_5 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2749:1: ( ( rule__RuleDefinition__Alternatives_5 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2750:1: ( rule__RuleDefinition__Alternatives_5 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getAlternatives_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2751:1: ( rule__RuleDefinition__Alternatives_5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2751:2: rule__RuleDefinition__Alternatives_5
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Alternatives_5_in_rule__RuleDefinition__Group__5__Impl5526);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2761:1: rule__RuleDefinition__Group__6 : rule__RuleDefinition__Group__6__Impl ;
    public final void rule__RuleDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2765:1: ( rule__RuleDefinition__Group__6__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2766:2: rule__RuleDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__6__Impl_in_rule__RuleDefinition__Group__65556);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2772:1: rule__RuleDefinition__Group__6__Impl : ( ( rule__RuleDefinition__Group_6__0 )? ) ;
    public final void rule__RuleDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2776:1: ( ( ( rule__RuleDefinition__Group_6__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2777:1: ( ( rule__RuleDefinition__Group_6__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2777:1: ( ( rule__RuleDefinition__Group_6__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2778:1: ( rule__RuleDefinition__Group_6__0 )?
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_6()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2779:1: ( rule__RuleDefinition__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||LA21_1==RULE_ID||LA21_1==13||LA21_1==27||(LA21_1>=37 && LA21_1<=38)) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2779:2: rule__RuleDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RuleDefinition__Group_6__0_in_rule__RuleDefinition__Group__6__Impl5583);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2803:1: rule__RuleDefinition__Group_4__0 : rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1 ;
    public final void rule__RuleDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2807:1: ( rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2808:2: rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__0__Impl_in_rule__RuleDefinition__Group_4__05628);
            rule__RuleDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__1_in_rule__RuleDefinition__Group_4__05631);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2815:1: rule__RuleDefinition__Group_4__0__Impl : ( ( rule__RuleDefinition__LhsAssignment_4_0 ) ) ;
    public final void rule__RuleDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2819:1: ( ( ( rule__RuleDefinition__LhsAssignment_4_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2820:1: ( ( rule__RuleDefinition__LhsAssignment_4_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2820:1: ( ( rule__RuleDefinition__LhsAssignment_4_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2821:1: ( rule__RuleDefinition__LhsAssignment_4_0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2822:1: ( rule__RuleDefinition__LhsAssignment_4_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2822:2: rule__RuleDefinition__LhsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__LhsAssignment_4_0_in_rule__RuleDefinition__Group_4__0__Impl5658);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2832:1: rule__RuleDefinition__Group_4__1 : rule__RuleDefinition__Group_4__1__Impl ;
    public final void rule__RuleDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2836:1: ( rule__RuleDefinition__Group_4__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2837:2: rule__RuleDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__1__Impl_in_rule__RuleDefinition__Group_4__15688);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2843:1: rule__RuleDefinition__Group_4__1__Impl : ( ( rule__RuleDefinition__Group_4_1__0 )* ) ;
    public final void rule__RuleDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2847:1: ( ( ( rule__RuleDefinition__Group_4_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2848:1: ( ( rule__RuleDefinition__Group_4_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2848:1: ( ( rule__RuleDefinition__Group_4_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2849:1: ( rule__RuleDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_4_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2850:1: ( rule__RuleDefinition__Group_4_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2850:2: rule__RuleDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__0_in_rule__RuleDefinition__Group_4__1__Impl5715);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2864:1: rule__RuleDefinition__Group_4_1__0 : rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1 ;
    public final void rule__RuleDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2868:1: ( rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2869:2: rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__0__Impl_in_rule__RuleDefinition__Group_4_1__05750);
            rule__RuleDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__1_in_rule__RuleDefinition__Group_4_1__05753);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2876:1: rule__RuleDefinition__Group_4_1__0__Impl : ( '+' ) ;
    public final void rule__RuleDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2880:1: ( ( '+' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2881:1: ( '+' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2881:1: ( '+' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2882:1: '+'
            {
             before(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0()); 
            match(input,13,FOLLOW_13_in_rule__RuleDefinition__Group_4_1__0__Impl5781); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2895:1: rule__RuleDefinition__Group_4_1__1 : rule__RuleDefinition__Group_4_1__1__Impl ;
    public final void rule__RuleDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2899:1: ( rule__RuleDefinition__Group_4_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2900:2: rule__RuleDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__1__Impl_in_rule__RuleDefinition__Group_4_1__15812);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2906:1: rule__RuleDefinition__Group_4_1__1__Impl : ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) ) ;
    public final void rule__RuleDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2910:1: ( ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2911:1: ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2911:1: ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2912:1: ( rule__RuleDefinition__LhsAssignment_4_1_1 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2913:1: ( rule__RuleDefinition__LhsAssignment_4_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2913:2: rule__RuleDefinition__LhsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__LhsAssignment_4_1_1_in_rule__RuleDefinition__Group_4_1__1__Impl5839);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2927:1: rule__RuleDefinition__Group_6__0 : rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1 ;
    public final void rule__RuleDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2931:1: ( rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2932:2: rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__0__Impl_in_rule__RuleDefinition__Group_6__05873);
            rule__RuleDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__1_in_rule__RuleDefinition__Group_6__05876);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2939:1: rule__RuleDefinition__Group_6__0__Impl : ( ( rule__RuleDefinition__RhsAssignment_6_0 ) ) ;
    public final void rule__RuleDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2943:1: ( ( ( rule__RuleDefinition__RhsAssignment_6_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2944:1: ( ( rule__RuleDefinition__RhsAssignment_6_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2944:1: ( ( rule__RuleDefinition__RhsAssignment_6_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2945:1: ( rule__RuleDefinition__RhsAssignment_6_0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2946:1: ( rule__RuleDefinition__RhsAssignment_6_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2946:2: rule__RuleDefinition__RhsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__RhsAssignment_6_0_in_rule__RuleDefinition__Group_6__0__Impl5903);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2956:1: rule__RuleDefinition__Group_6__1 : rule__RuleDefinition__Group_6__1__Impl ;
    public final void rule__RuleDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2960:1: ( rule__RuleDefinition__Group_6__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2961:2: rule__RuleDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__1__Impl_in_rule__RuleDefinition__Group_6__15933);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2967:1: rule__RuleDefinition__Group_6__1__Impl : ( ( rule__RuleDefinition__Group_6_1__0 )* ) ;
    public final void rule__RuleDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2971:1: ( ( ( rule__RuleDefinition__Group_6_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2972:1: ( ( rule__RuleDefinition__Group_6_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2972:1: ( ( rule__RuleDefinition__Group_6_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2973:1: ( rule__RuleDefinition__Group_6_1__0 )*
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_6_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2974:1: ( rule__RuleDefinition__Group_6_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2974:2: rule__RuleDefinition__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__0_in_rule__RuleDefinition__Group_6__1__Impl5960);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2988:1: rule__RuleDefinition__Group_6_1__0 : rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1 ;
    public final void rule__RuleDefinition__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2992:1: ( rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2993:2: rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__0__Impl_in_rule__RuleDefinition__Group_6_1__05995);
            rule__RuleDefinition__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__1_in_rule__RuleDefinition__Group_6_1__05998);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3000:1: rule__RuleDefinition__Group_6_1__0__Impl : ( '+' ) ;
    public final void rule__RuleDefinition__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3004:1: ( ( '+' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3005:1: ( '+' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3005:1: ( '+' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3006:1: '+'
            {
             before(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0()); 
            match(input,13,FOLLOW_13_in_rule__RuleDefinition__Group_6_1__0__Impl6026); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3019:1: rule__RuleDefinition__Group_6_1__1 : rule__RuleDefinition__Group_6_1__1__Impl ;
    public final void rule__RuleDefinition__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3023:1: ( rule__RuleDefinition__Group_6_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3024:2: rule__RuleDefinition__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__1__Impl_in_rule__RuleDefinition__Group_6_1__16057);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3030:1: rule__RuleDefinition__Group_6_1__1__Impl : ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) ) ;
    public final void rule__RuleDefinition__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3034:1: ( ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3035:1: ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3035:1: ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3036:1: ( rule__RuleDefinition__RhsAssignment_6_1_1 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3037:1: ( rule__RuleDefinition__RhsAssignment_6_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3037:2: rule__RuleDefinition__RhsAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__RhsAssignment_6_1_1_in_rule__RuleDefinition__Group_6_1__1__Impl6084);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3051:1: rule__RuleObject__Group__0 : rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1 ;
    public final void rule__RuleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3055:1: ( rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3056:2: rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__0__Impl_in_rule__RuleObject__Group__06118);
            rule__RuleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group__1_in_rule__RuleObject__Group__06121);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3063:1: rule__RuleObject__Group__0__Impl : ( () ) ;
    public final void rule__RuleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3067:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3068:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3068:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3069:1: ()
            {
             before(grammarAccess.getRuleObjectAccess().getRuleObjectAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3070:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3072:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3082:1: rule__RuleObject__Group__1 : rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2 ;
    public final void rule__RuleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3086:1: ( rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3087:2: rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__1__Impl_in_rule__RuleObject__Group__16179);
            rule__RuleObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group__2_in_rule__RuleObject__Group__16182);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3094:1: rule__RuleObject__Group__1__Impl : ( ( rule__RuleObject__SubobjectsAssignment_1 ) ) ;
    public final void rule__RuleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3098:1: ( ( ( rule__RuleObject__SubobjectsAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3099:1: ( ( rule__RuleObject__SubobjectsAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3099:1: ( ( rule__RuleObject__SubobjectsAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3100:1: ( rule__RuleObject__SubobjectsAssignment_1 )
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3101:1: ( rule__RuleObject__SubobjectsAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3101:2: rule__RuleObject__SubobjectsAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleObject__SubobjectsAssignment_1_in_rule__RuleObject__Group__1__Impl6209);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3111:1: rule__RuleObject__Group__2 : rule__RuleObject__Group__2__Impl ;
    public final void rule__RuleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3115:1: ( rule__RuleObject__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3116:2: rule__RuleObject__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__2__Impl_in_rule__RuleObject__Group__26239);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3122:1: rule__RuleObject__Group__2__Impl : ( ( rule__RuleObject__Group_2__0 )* ) ;
    public final void rule__RuleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3126:1: ( ( ( rule__RuleObject__Group_2__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3127:1: ( ( rule__RuleObject__Group_2__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3127:1: ( ( rule__RuleObject__Group_2__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3128:1: ( rule__RuleObject__Group_2__0 )*
            {
             before(grammarAccess.getRuleObjectAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3129:1: ( rule__RuleObject__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3129:2: rule__RuleObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleObject__Group_2__0_in_rule__RuleObject__Group__2__Impl6266);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3145:1: rule__RuleObject__Group_2__0 : rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1 ;
    public final void rule__RuleObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3149:1: ( rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3150:2: rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__RuleObject__Group_2__0__Impl_in_rule__RuleObject__Group_2__06303);
            rule__RuleObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group_2__1_in_rule__RuleObject__Group_2__06306);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3157:1: rule__RuleObject__Group_2__0__Impl : ( '~' ) ;
    public final void rule__RuleObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3161:1: ( ( '~' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3162:1: ( '~' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3162:1: ( '~' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3163:1: '~'
            {
             before(grammarAccess.getRuleObjectAccess().getTildeKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__RuleObject__Group_2__0__Impl6334); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3176:1: rule__RuleObject__Group_2__1 : rule__RuleObject__Group_2__1__Impl ;
    public final void rule__RuleObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3180:1: ( rule__RuleObject__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3181:2: rule__RuleObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleObject__Group_2__1__Impl_in_rule__RuleObject__Group_2__16365);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3187:1: rule__RuleObject__Group_2__1__Impl : ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) ) ;
    public final void rule__RuleObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3191:1: ( ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3192:1: ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3192:1: ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3193:1: ( rule__RuleObject__SubobjectsAssignment_2_1 )
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3194:1: ( rule__RuleObject__SubobjectsAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3194:2: rule__RuleObject__SubobjectsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RuleObject__SubobjectsAssignment_2_1_in_rule__RuleObject__Group_2__1__Impl6392);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3208:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3212:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3213:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__06426);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__06429);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3220:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3224:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3225:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3225:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3226:1: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3227:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3229:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3239:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3243:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3244:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__16487);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__16490);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3251:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3255:1: ( ( 'import' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3256:1: ( 'import' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3256:1: ( 'import' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3257:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Import__Group__1__Impl6518); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3270:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3274:1: ( rule__Import__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3275:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__26549);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3281:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3285:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3286:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3286:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3287:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3288:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3288:2: rule__Import__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl6576);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3304:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3308:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3309:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__06612);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__06615);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3316:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3320:1: ( ( ruleQualifiedName ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3321:1: ( ruleQualifiedName )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3321:1: ( ruleQualifiedName )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3322:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl6642);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3333:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3337:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3338:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__16671);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3344:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3348:1: ( ( ( '.*' )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3349:1: ( ( '.*' )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3349:1: ( ( '.*' )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3350:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3351:1: ( '.*' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3352:2: '.*'
                    {
                    match(input,40,FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group__1__Impl6700); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3367:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3371:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3372:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06737);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06740);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3379:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3383:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3384:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3384:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3385:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6767); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3396:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3400:1: ( rule__QualifiedName__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3401:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16796);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3407:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3411:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3412:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3412:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3413:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3414:1: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3414:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6823);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3428:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3432:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3433:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06858);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06861);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3440:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3444:1: ( ( '.' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3445:1: ( '.' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3445:1: ( '.' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3446:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl6889); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3459:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3463:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3464:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16920);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3470:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3474:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3475:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3475:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3476:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6947); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3492:1: rule__Model__MembersAssignment_1 : ( ruleModelMember ) ;
    public final void rule__Model__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3496:1: ( ( ruleModelMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3497:1: ( ruleModelMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3497:1: ( ruleModelMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3498:1: ruleModelMember
            {
             before(grammarAccess.getModelAccess().getMembersModelMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelMember_in_rule__Model__MembersAssignment_16985);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3507:1: rule__VariableDefinition__TypeAssignment_2 : ( ruleVariableType ) ;
    public final void rule__VariableDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3511:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3512:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3512:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3513:1: ruleVariableType
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__VariableDefinition__TypeAssignment_27016);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3522:1: rule__VariableDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3526:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3527:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3527:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3528:1: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDefinition__NameAssignment_37047); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3537:1: rule__VariableDefinition__MembersAssignment_5 : ( ruleVariableDefinitionMember ) ;
    public final void rule__VariableDefinition__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3541:1: ( ( ruleVariableDefinitionMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3542:1: ( ruleVariableDefinitionMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3542:1: ( ruleVariableDefinitionMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3543:1: ruleVariableDefinitionMember
            {
             before(grammarAccess.getVariableDefinitionAccess().getMembersVariableDefinitionMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_rule__VariableDefinition__MembersAssignment_57078);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3552:1: rule__FunctionDefinition__TypeAssignment_2 : ( ruleVariableType ) ;
    public final void rule__FunctionDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3556:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3557:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3557:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3558:1: ruleVariableType
            {
             before(grammarAccess.getFunctionDefinitionAccess().getTypeVariableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__FunctionDefinition__TypeAssignment_27109);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3567:1: rule__FunctionDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FunctionDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3571:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3572:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3572:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3573:1: RULE_ID
            {
             before(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_37140); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3582:1: rule__FunctionDefinition__ParametersAssignment_5 : ( ruleFunctionParameterMember ) ;
    public final void rule__FunctionDefinition__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3586:1: ( ( ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3587:1: ( ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3587:1: ( ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3588:1: ruleFunctionParameterMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_57171);
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


    // $ANTLR start "rule__FunctionDefinition__ParametersAssignment_6"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3597:1: rule__FunctionDefinition__ParametersAssignment_6 : ( ruleFunctionParameterMember ) ;
    public final void rule__FunctionDefinition__ParametersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3601:1: ( ( ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3602:1: ( ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3602:1: ( ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3603:1: ruleFunctionParameterMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_67202);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__ParametersAssignment_6"


    // $ANTLR start "rule__FunctionDefinition__ParametersAssignment_7_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3612:1: rule__FunctionDefinition__ParametersAssignment_7_1 : ( ruleFunctionParameterMember ) ;
    public final void rule__FunctionDefinition__ParametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3616:1: ( ( ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3617:1: ( ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3617:1: ( ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3618:1: ruleFunctionParameterMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_7_17233);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__ParametersAssignment_7_1"


    // $ANTLR start "rule__FunctionDefinition__MembersAssignment_10"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3627:1: rule__FunctionDefinition__MembersAssignment_10 : ( ruleFunctionDefinitionMember ) ;
    public final void rule__FunctionDefinition__MembersAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3631:1: ( ( ruleFunctionDefinitionMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3632:1: ( ruleFunctionDefinitionMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3632:1: ( ruleFunctionDefinitionMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3633:1: ruleFunctionDefinitionMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_rule__FunctionDefinition__MembersAssignment_107264);
            ruleFunctionDefinitionMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__MembersAssignment_10"


    // $ANTLR start "rule__FunctionParameterMember__TypeAssignment_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3642:1: rule__FunctionParameterMember__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionParameterMember__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3646:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3647:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3647:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3648:1: RULE_ID
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameterMember__TypeAssignment_07295); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3657:1: rule__FunctionParameterMember__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionParameterMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3661:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3662:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3662:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3663:1: RULE_ID
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameterMember__NameAssignment_17326); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3672:1: rule__FunctionParameterMember__ScopeAssignment_3 : ( ruleParameterScope ) ;
    public final void rule__FunctionParameterMember__ScopeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3676:1: ( ( ruleParameterScope ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3677:1: ( ruleParameterScope )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3677:1: ( ruleParameterScope )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3678:1: ruleParameterScope
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameterScope_in_rule__FunctionParameterMember__ScopeAssignment_37357);
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


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_0_1_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3687:1: rule__VariableDeclaration__TypeAssignment_0_1_0 : ( ruleVariableType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3691:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3692:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3692:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3693:1: ruleVariableType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_0_1_07388);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_0_1_0"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_0_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3702:1: rule__VariableDeclaration__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3706:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3707:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3707:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3708:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_0_1_17419); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_0_1_1"


    // $ANTLR start "rule__VariableDeclaration__CollectionAssignment_1_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3717:1: rule__VariableDeclaration__CollectionAssignment_1_0 : ( ruleCollectionID ) ;
    public final void rule__VariableDeclaration__CollectionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3721:1: ( ( ruleCollectionID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3722:1: ( ruleCollectionID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3722:1: ( ruleCollectionID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3723:1: ruleCollectionID
            {
             before(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCollectionID_in_rule__VariableDeclaration__CollectionAssignment_1_07450);
            ruleCollectionID();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__CollectionAssignment_1_0"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_1_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3732:1: rule__VariableDeclaration__TypeAssignment_1_2 : ( ruleVariableType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3736:1: ( ( ruleVariableType ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3737:1: ( ruleVariableType )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3737:1: ( ruleVariableType )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3738:1: ruleVariableType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_1_27481);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_1_2"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1_4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3747:1: rule__VariableDeclaration__NameAssignment_1_4 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3751:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3752:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3752:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3753:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_1_47512); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1_4"


    // $ANTLR start "rule__VariableType__PrimitiveAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3762:1: rule__VariableType__PrimitiveAssignment_1 : ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) ) ;
    public final void rule__VariableType__PrimitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3766:1: ( ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3767:1: ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3767:1: ( ( rule__VariableType__PrimitiveAlternatives_1_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3768:1: ( rule__VariableType__PrimitiveAlternatives_1_0 )
            {
             before(grammarAccess.getVariableTypeAccess().getPrimitiveAlternatives_1_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3769:1: ( rule__VariableType__PrimitiveAlternatives_1_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3769:2: rule__VariableType__PrimitiveAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__VariableType__PrimitiveAlternatives_1_0_in_rule__VariableType__PrimitiveAssignment_17543);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3778:1: rule__VariableAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3782:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3783:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3783:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3784:1: RULE_ID
            {
             before(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAttribute__NameAssignment_17576); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3793:1: rule__VariableAttribute__AttributeAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__VariableAttribute__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3797:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3798:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3798:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3799:1: RULE_ID
            {
             before(grammarAccess.getVariableAttributeAccess().getAttributeIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAttribute__AttributeAssignment_2_17607); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3808:1: rule__VariableAssignment__VariableAssignment_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableAssignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3812:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3813:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3813:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3814:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableVariableAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableAssignment__VariableAssignment_17638);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3823:1: rule__VariableAssignment__ExpressionAssignment_3 : ( ruleVariableExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3827:1: ( ( ruleVariableExpression ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3828:1: ( ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3828:1: ( ruleVariableExpression )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3829:1: ruleVariableExpression
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_rule__VariableAssignment__ExpressionAssignment_37669);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3838:1: rule__VariableExpression__MembersAssignment_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableExpression__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3842:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3843:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3843:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3844:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_17700);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3853:1: rule__VariableExpression__MembersAssignment_2_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableExpression__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3857:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3858:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3858:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3859:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_2_17731);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3868:1: rule__RuleDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RuleDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3872:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3873:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3873:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3874:1: RULE_ID
            {
             before(grammarAccess.getRuleDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleDefinition__NameAssignment_27762); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3883:1: rule__RuleDefinition__LhsAssignment_4_0 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__LhsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3887:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3888:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3888:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3889:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_07793);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3898:1: rule__RuleDefinition__LhsAssignment_4_1_1 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__LhsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3902:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3903:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3903:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3904:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_1_17824);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3913:1: rule__RuleDefinition__RhsAssignment_6_0 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__RhsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3917:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3918:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3918:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3919:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_07855);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3928:1: rule__RuleDefinition__RhsAssignment_6_1_1 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__RhsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3932:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3933:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3933:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3934:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_1_17886);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3943:1: rule__RuleObject__SubobjectsAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleObject__SubobjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3947:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3948:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3948:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3949:1: RULE_ID
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_17917); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3958:1: rule__RuleObject__SubobjectsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__RuleObject__SubobjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3962:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3963:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3963:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3964:1: RULE_ID
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_2_17948); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3973:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3977:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3978:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3978:1: ( ruleQualifiedNameWithWildcard )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3979:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_27979);
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
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\31\1\uffff\7\4\1\32\2\uffff";
    static final String DFA1_maxS =
        "\1\47\1\uffff\1\24\5\4\2\34\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\10\uffff\1\3\1\2";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\15\uffff\1\1",
            "",
            "\1\10\13\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11\25\uffff\1\13\1\uffff\1\12",
            "\1\13\1\uffff\1\12",
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
            return "648:1: rule__ModelMember__Alternatives : ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) );";
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
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__0_in_ruleFunctionParameterMember334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_entryRuleParameterScope361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterScope368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterScope__Alternatives_in_ruleParameterScope394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinitionMember428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinitionMember__Alternatives_in_ruleFunctionDefinitionMember454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionMember488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_entryRuleVariableType600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableType607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__Group__0_in_ruleVariableType633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__0_in_ruleVariableAttribute693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__0_in_ruleVariableExpression813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpressionOperator__Alternatives_in_ruleVariableExpressionOperator873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveVariableType_in_entryRulePrimitiveVariableType900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveVariableType907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveVariableType__Alternatives_in_rulePrimitiveVariableType933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionID__Alternatives_in_ruleCollectionID993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__0_in_ruleRuleDefinition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__0_in_ruleRuleObject1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ModelMember__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_rule__ModelMember__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_rule__ModelMember__Alternatives1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ParameterScope__Alternatives1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ParameterScope__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_rule__FunctionDefinitionMember__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__FunctionDefinitionMember__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0__0_in_rule__VariableDeclaration__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__0_in_rule__VariableDeclaration__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveVariableType_in_rule__VariableType__PrimitiveAlternatives_1_01550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableType__PrimitiveAlternatives_1_01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VariableExpressionOperator__Alternatives1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VariableExpressionOperator__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VariableExpressionOperator__Alternatives1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimitiveVariableType__Alternatives1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimitiveVariableType__Alternatives1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimitiveVariableType__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimitiveVariableType__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveVariableType__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CollectionID__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CollectionID__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RuleDefinition__Alternatives_51845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RuleDefinition__Alternatives_51865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01897 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MembersAssignment_1_in_rule__Model__Group__1__Impl1985 = new BitSet(new long[]{0x0000008002000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__0__Impl_in_rule__VariableDefinition__Group__02020 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__1_in_rule__VariableDefinition__Group__02023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__1__Impl_in_rule__VariableDefinition__Group__12081 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__2_in_rule__VariableDefinition__Group__12084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VariableDefinition__Group__1__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__2__Impl_in_rule__VariableDefinition__Group__22143 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__3_in_rule__VariableDefinition__Group__22146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__TypeAssignment_2_in_rule__VariableDefinition__Group__2__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__3__Impl_in_rule__VariableDefinition__Group__32204 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__4_in_rule__VariableDefinition__Group__32207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__NameAssignment_3_in_rule__VariableDefinition__Group__3__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__4__Impl_in_rule__VariableDefinition__Group__42264 = new BitSet(new long[]{0x00000000087F0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__5_in_rule__VariableDefinition__Group__42267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VariableDefinition__Group__4__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__5__Impl_in_rule__VariableDefinition__Group__52326 = new BitSet(new long[]{0x00000000087F0010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__6_in_rule__VariableDefinition__Group__52329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__MembersAssignment_5_in_rule__VariableDefinition__Group__5__Impl2356 = new BitSet(new long[]{0x00000000007F0012L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__6__Impl_in_rule__VariableDefinition__Group__62387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VariableDefinition__Group__6__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02460 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12521 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FunctionDefinition__Group__1__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22583 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__TypeAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32644 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__NameAssignment_3_in_rule__FunctionDefinition__Group__3__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionDefinition__Group__4__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__6_in_rule__FunctionDefinition__Group__52769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2796 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__6__Impl_in_rule__FunctionDefinition__Group__62827 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__7_in_rule__FunctionDefinition__Group__62830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ParametersAssignment_6_in_rule__FunctionDefinition__Group__6__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__7__Impl_in_rule__FunctionDefinition__Group__72887 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__8_in_rule__FunctionDefinition__Group__72890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_7__0_in_rule__FunctionDefinition__Group__7__Impl2917 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__8__Impl_in_rule__FunctionDefinition__Group__82948 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__9_in_rule__FunctionDefinition__Group__82951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDefinition__Group__8__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__9__Impl_in_rule__FunctionDefinition__Group__93010 = new BitSet(new long[]{0x0000002008000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__10_in_rule__FunctionDefinition__Group__93013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionDefinition__Group__9__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__10__Impl_in_rule__FunctionDefinition__Group__103072 = new BitSet(new long[]{0x0000002008000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__11_in_rule__FunctionDefinition__Group__103075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__MembersAssignment_10_in_rule__FunctionDefinition__Group__10__Impl3102 = new BitSet(new long[]{0x0000002000000012L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__11__Impl_in_rule__FunctionDefinition__Group__113133 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__12_in_rule__FunctionDefinition__Group__113136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FunctionDefinition__Group__11__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__12__Impl_in_rule__FunctionDefinition__Group__123195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionDefinition__Group__12__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_7__0__Impl_in_rule__FunctionDefinition__Group_7__03283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_7__1_in_rule__FunctionDefinition__Group_7__03286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionDefinition__Group_7__0__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_7__1__Impl_in_rule__FunctionDefinition__Group_7__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ParametersAssignment_7_1_in_rule__FunctionDefinition__Group_7__1__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__0__Impl_in_rule__FunctionParameterMember__Group__03406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__1_in_rule__FunctionParameterMember__Group__03409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__TypeAssignment_0_in_rule__FunctionParameterMember__Group__0__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__1__Impl_in_rule__FunctionParameterMember__Group__13466 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__2_in_rule__FunctionParameterMember__Group__13469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__NameAssignment_1_in_rule__FunctionParameterMember__Group__1__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__2__Impl_in_rule__FunctionParameterMember__Group__23526 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__3_in_rule__FunctionParameterMember__Group__23529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionParameterMember__Group__2__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__3__Impl_in_rule__FunctionParameterMember__Group__33588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__ScopeAssignment_3_in_rule__FunctionParameterMember__Group__3__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0__0__Impl_in_rule__VariableDeclaration__Group_0__03653 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0__1_in_rule__VariableDeclaration__Group_0__03656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0__1__Impl_in_rule__VariableDeclaration__Group_0__13714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0_1__0_in_rule__VariableDeclaration__Group_0__1__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0_1__0__Impl_in_rule__VariableDeclaration__Group_0_1__03775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0_1__1_in_rule__VariableDeclaration__Group_0_1__03778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_0_1_0_in_rule__VariableDeclaration__Group_0_1__0__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_0_1__1__Impl_in_rule__VariableDeclaration__Group_0_1__13835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_0_1_1_in_rule__VariableDeclaration__Group_0_1__1__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__0__Impl_in_rule__VariableDeclaration__Group_1__03896 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__1_in_rule__VariableDeclaration__Group_1__03899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__CollectionAssignment_1_0_in_rule__VariableDeclaration__Group_1__0__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__1__Impl_in_rule__VariableDeclaration__Group_1__13956 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__2_in_rule__VariableDeclaration__Group_1__13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VariableDeclaration__Group_1__1__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__2__Impl_in_rule__VariableDeclaration__Group_1__24018 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__3_in_rule__VariableDeclaration__Group_1__24021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_1_2_in_rule__VariableDeclaration__Group_1__2__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__3__Impl_in_rule__VariableDeclaration__Group_1__34078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__4_in_rule__VariableDeclaration__Group_1__34081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VariableDeclaration__Group_1__3__Impl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_1__4__Impl_in_rule__VariableDeclaration__Group_1__44140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_1_4_in_rule__VariableDeclaration__Group_1__4__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__Group__0__Impl_in_rule__VariableType__Group__04207 = new BitSet(new long[]{0x00000000001F0010L});
    public static final BitSet FOLLOW_rule__VariableType__Group__1_in_rule__VariableType__Group__04210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__Group__1__Impl_in_rule__VariableType__Group__14268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__PrimitiveAssignment_1_in_rule__VariableType__Group__1__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__0__Impl_in_rule__VariableAttribute__Group__04329 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__1_in_rule__VariableAttribute__Group__04332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__1__Impl_in_rule__VariableAttribute__Group__14390 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__2_in_rule__VariableAttribute__Group__14393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__NameAssignment_1_in_rule__VariableAttribute__Group__1__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__2__Impl_in_rule__VariableAttribute__Group__24450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__0_in_rule__VariableAttribute__Group__2__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__0__Impl_in_rule__VariableAttribute__Group_2__04514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__1_in_rule__VariableAttribute__Group_2__04517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VariableAttribute__Group_2__0__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__1__Impl_in_rule__VariableAttribute__Group_2__14576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__AttributeAssignment_2_1_in_rule__VariableAttribute__Group_2__1__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__04637 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__04640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__14698 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__14701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__VariableAssignment_1_in_rule__VariableAssignment__Group__1__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__24758 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__3_in_rule__VariableAssignment__Group__24761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VariableAssignment__Group__2__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__3__Impl_in_rule__VariableAssignment__Group__34820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__ExpressionAssignment_3_in_rule__VariableAssignment__Group__3__Impl4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__0__Impl_in_rule__VariableExpression__Group__04885 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__1_in_rule__VariableExpression__Group__04888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__1__Impl_in_rule__VariableExpression__Group__14946 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__2_in_rule__VariableExpression__Group__14949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__MembersAssignment_1_in_rule__VariableExpression__Group__1__Impl4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__2__Impl_in_rule__VariableExpression__Group__25006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__0_in_rule__VariableExpression__Group__2__Impl5033 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__0__Impl_in_rule__VariableExpression__Group_2__05070 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__1_in_rule__VariableExpression__Group_2__05073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_rule__VariableExpression__Group_2__0__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__1__Impl_in_rule__VariableExpression__Group_2__15129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__MembersAssignment_2_1_in_rule__VariableExpression__Group_2__1__Impl5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__0__Impl_in_rule__RuleDefinition__Group__05190 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__1_in_rule__RuleDefinition__Group__05193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__1__Impl_in_rule__RuleDefinition__Group__15251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__2_in_rule__RuleDefinition__Group__15254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RuleDefinition__Group__1__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__2__Impl_in_rule__RuleDefinition__Group__25313 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__3_in_rule__RuleDefinition__Group__25316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__NameAssignment_2_in_rule__RuleDefinition__Group__2__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__3__Impl_in_rule__RuleDefinition__Group__35373 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__4_in_rule__RuleDefinition__Group__35376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RuleDefinition__Group__3__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__4__Impl_in_rule__RuleDefinition__Group__45435 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__5_in_rule__RuleDefinition__Group__45438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__0_in_rule__RuleDefinition__Group__4__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__5__Impl_in_rule__RuleDefinition__Group__55496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__6_in_rule__RuleDefinition__Group__55499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Alternatives_5_in_rule__RuleDefinition__Group__5__Impl5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__6__Impl_in_rule__RuleDefinition__Group__65556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__0_in_rule__RuleDefinition__Group__6__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__0__Impl_in_rule__RuleDefinition__Group_4__05628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__1_in_rule__RuleDefinition__Group_4__05631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__LhsAssignment_4_0_in_rule__RuleDefinition__Group_4__0__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__1__Impl_in_rule__RuleDefinition__Group_4__15688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__0_in_rule__RuleDefinition__Group_4__1__Impl5715 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__0__Impl_in_rule__RuleDefinition__Group_4_1__05750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__1_in_rule__RuleDefinition__Group_4_1__05753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RuleDefinition__Group_4_1__0__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__1__Impl_in_rule__RuleDefinition__Group_4_1__15812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__LhsAssignment_4_1_1_in_rule__RuleDefinition__Group_4_1__1__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__0__Impl_in_rule__RuleDefinition__Group_6__05873 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__1_in_rule__RuleDefinition__Group_6__05876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__RhsAssignment_6_0_in_rule__RuleDefinition__Group_6__0__Impl5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__1__Impl_in_rule__RuleDefinition__Group_6__15933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__0_in_rule__RuleDefinition__Group_6__1__Impl5960 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__0__Impl_in_rule__RuleDefinition__Group_6_1__05995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__1_in_rule__RuleDefinition__Group_6_1__05998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RuleDefinition__Group_6_1__0__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__1__Impl_in_rule__RuleDefinition__Group_6_1__16057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__RhsAssignment_6_1_1_in_rule__RuleDefinition__Group_6_1__1__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__0__Impl_in_rule__RuleObject__Group__06118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__1_in_rule__RuleObject__Group__06121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__1__Impl_in_rule__RuleObject__Group__16179 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__2_in_rule__RuleObject__Group__16182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__SubobjectsAssignment_1_in_rule__RuleObject__Group__1__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__2__Impl_in_rule__RuleObject__Group__26239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__0_in_rule__RuleObject__Group__2__Impl6266 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__0__Impl_in_rule__RuleObject__Group_2__06303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__1_in_rule__RuleObject__Group_2__06306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RuleObject__Group_2__0__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__1__Impl_in_rule__RuleObject__Group_2__16365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__SubobjectsAssignment_2_1_in_rule__RuleObject__Group_2__1__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__06426 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__06429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__16487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__16490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Import__Group__1__Impl6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__26549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__06612 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__06615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__16671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group__1__Impl6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06737 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6823 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_rule__Model__MembersAssignment_16985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__VariableDefinition__TypeAssignment_27016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDefinition__NameAssignment_37047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_rule__VariableDefinition__MembersAssignment_57078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__FunctionDefinition__TypeAssignment_27109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_37140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_57171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_67202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_7_17233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_rule__FunctionDefinition__MembersAssignment_107264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameterMember__TypeAssignment_07295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameterMember__NameAssignment_17326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_rule__FunctionParameterMember__ScopeAssignment_37357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_0_1_07388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_0_1_17419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_rule__VariableDeclaration__CollectionAssignment_1_07450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableType_in_rule__VariableDeclaration__TypeAssignment_1_27481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_1_47512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableType__PrimitiveAlternatives_1_0_in_rule__VariableType__PrimitiveAssignment_17543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAttribute__NameAssignment_17576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAttribute__AttributeAssignment_2_17607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableAssignment__VariableAssignment_17638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_rule__VariableAssignment__ExpressionAssignment_37669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_17700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_2_17731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleDefinition__NameAssignment_27762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_07793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_1_17824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_07855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_1_17886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_17917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_2_17948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_27979 = new BitSet(new long[]{0x0000000000000002L});

}