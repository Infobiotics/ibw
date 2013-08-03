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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'observable'", "'required'", "'returned'", "'optional'", "'LIST'", "'SET'", "'.'", "'~'", "'+'", "'-'", "'|'", "'->'", "'<->'", "'E'", "'e'", "'import'", "'.*'", "'define'", "'{'", "'}'", "'('", "')'", "','", "'USES'", "':'", "'<'", "'>'", "'='", "'RULE'", "'DEVICE'", "'ATGC'", "'PROPERTY'", "'VERIFY'"
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
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleImport"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:117:1: ( ruleImport EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:132:1: ( rule__Import__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:144:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:145:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:146:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard241);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard248); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:153:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:157:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:158:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:159:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:160:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:160:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard274);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:172:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:173:1: ( ruleQualifiedName EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:174:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName308); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:181:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:185:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:187:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:188:1: ( rule__QualifiedName__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:188:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334);
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:200:1: entryRuleVariableDefinition : ruleVariableDefinition EOF ;
    public final void entryRuleVariableDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:201:1: ( ruleVariableDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:202:1: ruleVariableDefinition EOF
            {
             before(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition361);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition368); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:209:1: ruleVariableDefinition : ( ( rule__VariableDefinition__Group__0 ) ) ;
    public final void ruleVariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:213:2: ( ( ( rule__VariableDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:214:1: ( ( rule__VariableDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:214:1: ( ( rule__VariableDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:215:1: ( rule__VariableDefinition__Group__0 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:216:1: ( rule__VariableDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:216:2: rule__VariableDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__0_in_ruleVariableDefinition394);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:228:1: entryRuleFunctionDefinition : ruleFunctionDefinition EOF ;
    public final void entryRuleFunctionDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:229:1: ( ruleFunctionDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:230:1: ruleFunctionDefinition EOF
            {
             before(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition421);
            ruleFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition428); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:237:1: ruleFunctionDefinition : ( ( rule__FunctionDefinition__Group__0 ) ) ;
    public final void ruleFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:241:2: ( ( ( rule__FunctionDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:242:1: ( ( rule__FunctionDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:242:1: ( ( rule__FunctionDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:243:1: ( rule__FunctionDefinition__Group__0 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:244:1: ( rule__FunctionDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:244:2: rule__FunctionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0_in_ruleFunctionDefinition454);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:256:1: entryRuleFunctionParameterMember : ruleFunctionParameterMember EOF ;
    public final void entryRuleFunctionParameterMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:257:1: ( ruleFunctionParameterMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:258:1: ruleFunctionParameterMember EOF
            {
             before(grammarAccess.getFunctionParameterMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember481);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionParameterMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterMember488); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:265:1: ruleFunctionParameterMember : ( ( rule__FunctionParameterMember__Group__0 ) ) ;
    public final void ruleFunctionParameterMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:269:2: ( ( ( rule__FunctionParameterMember__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:270:1: ( ( rule__FunctionParameterMember__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:270:1: ( ( rule__FunctionParameterMember__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:271:1: ( rule__FunctionParameterMember__Group__0 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:272:1: ( rule__FunctionParameterMember__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:272:2: rule__FunctionParameterMember__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__0_in_ruleFunctionParameterMember514);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:284:1: entryRuleParameterScope : ruleParameterScope EOF ;
    public final void entryRuleParameterScope() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:285:1: ( ruleParameterScope EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:286:1: ruleParameterScope EOF
            {
             before(grammarAccess.getParameterScopeRule()); 
            pushFollow(FOLLOW_ruleParameterScope_in_entryRuleParameterScope541);
            ruleParameterScope();

            state._fsp--;

             after(grammarAccess.getParameterScopeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterScope548); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:293:1: ruleParameterScope : ( ( rule__ParameterScope__Alternatives ) ) ;
    public final void ruleParameterScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:297:2: ( ( ( rule__ParameterScope__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:298:1: ( ( rule__ParameterScope__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:298:1: ( ( rule__ParameterScope__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:299:1: ( rule__ParameterScope__Alternatives )
            {
             before(grammarAccess.getParameterScopeAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:300:1: ( rule__ParameterScope__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:300:2: rule__ParameterScope__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterScope__Alternatives_in_ruleParameterScope574);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:312:1: entryRuleFunctionDefinitionMember : ruleFunctionDefinitionMember EOF ;
    public final void entryRuleFunctionDefinitionMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:313:1: ( ruleFunctionDefinitionMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:314:1: ruleFunctionDefinitionMember EOF
            {
             before(grammarAccess.getFunctionDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember601);
            ruleFunctionDefinitionMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinitionMember608); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:321:1: ruleFunctionDefinitionMember : ( ( rule__FunctionDefinitionMember__Alternatives ) ) ;
    public final void ruleFunctionDefinitionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:325:2: ( ( ( rule__FunctionDefinitionMember__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:326:1: ( ( rule__FunctionDefinitionMember__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:326:1: ( ( rule__FunctionDefinitionMember__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:327:1: ( rule__FunctionDefinitionMember__Alternatives )
            {
             before(grammarAccess.getFunctionDefinitionMemberAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:328:1: ( rule__FunctionDefinitionMember__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:328:2: rule__FunctionDefinitionMember__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionDefinitionMember__Alternatives_in_ruleFunctionDefinitionMember634);
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


    // $ANTLR start "entryRuleFunctionUseMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:340:1: entryRuleFunctionUseMember : ruleFunctionUseMember EOF ;
    public final void entryRuleFunctionUseMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:341:1: ( ruleFunctionUseMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:342:1: ruleFunctionUseMember EOF
            {
             before(grammarAccess.getFunctionUseMemberRule()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember661);
            ruleFunctionUseMember();

            state._fsp--;

             after(grammarAccess.getFunctionUseMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUseMember668); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:349:1: ruleFunctionUseMember : ( ( rule__FunctionUseMember__Group__0 ) ) ;
    public final void ruleFunctionUseMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:353:2: ( ( ( rule__FunctionUseMember__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:354:1: ( ( rule__FunctionUseMember__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:354:1: ( ( rule__FunctionUseMember__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:355:1: ( rule__FunctionUseMember__Group__0 )
            {
             before(grammarAccess.getFunctionUseMemberAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:356:1: ( rule__FunctionUseMember__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:356:2: rule__FunctionUseMember__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__Group__0_in_ruleFunctionUseMember694);
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


    // $ANTLR start "entryRuleVariableDefinitionMember"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:368:1: entryRuleVariableDefinitionMember : ruleVariableDefinitionMember EOF ;
    public final void entryRuleVariableDefinitionMember() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:369:1: ( ruleVariableDefinitionMember EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:370:1: ruleVariableDefinitionMember EOF
            {
             before(grammarAccess.getVariableDefinitionMemberRule()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember721);
            ruleVariableDefinitionMember();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinitionMember728); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:377:1: ruleVariableDefinitionMember : ( ruleVariableDeclaration ) ;
    public final void ruleVariableDefinitionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:381:2: ( ( ruleVariableDeclaration ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:382:1: ( ruleVariableDeclaration )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:382:1: ( ruleVariableDeclaration )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:383:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariableDefinitionMemberAccess().getVariableDeclarationParserRuleCall()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember754);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:396:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:397:1: ( ruleVariableDeclaration EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:398:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration780);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration787); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:405:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:409:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:410:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:410:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:411:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:412:1: ( rule__VariableDeclaration__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:412:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration813);
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


    // $ANTLR start "entryRuleVariableQualifier"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:424:1: entryRuleVariableQualifier : ruleVariableQualifier EOF ;
    public final void entryRuleVariableQualifier() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:425:1: ( ruleVariableQualifier EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:426:1: ruleVariableQualifier EOF
            {
             before(grammarAccess.getVariableQualifierRule()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier840);
            ruleVariableQualifier();

            state._fsp--;

             after(grammarAccess.getVariableQualifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableQualifier847); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:433:1: ruleVariableQualifier : ( 'observable' ) ;
    public final void ruleVariableQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:437:2: ( ( 'observable' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:438:1: ( 'observable' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:438:1: ( 'observable' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:439:1: 'observable'
            {
             before(grammarAccess.getVariableQualifierAccess().getObservableKeyword()); 
            match(input,11,FOLLOW_11_in_ruleVariableQualifier874); 
             after(grammarAccess.getVariableQualifierAccess().getObservableKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCollectionID"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:454:1: entryRuleCollectionID : ruleCollectionID EOF ;
    public final void entryRuleCollectionID() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:455:1: ( ruleCollectionID EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:456:1: ruleCollectionID EOF
            {
             before(grammarAccess.getCollectionIDRule()); 
            pushFollow(FOLLOW_ruleCollectionID_in_entryRuleCollectionID902);
            ruleCollectionID();

            state._fsp--;

             after(grammarAccess.getCollectionIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionID909); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:463:1: ruleCollectionID : ( ( rule__CollectionID__Alternatives ) ) ;
    public final void ruleCollectionID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:467:2: ( ( ( rule__CollectionID__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:468:1: ( ( rule__CollectionID__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:468:1: ( ( rule__CollectionID__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:469:1: ( rule__CollectionID__Alternatives )
            {
             before(grammarAccess.getCollectionIDAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:470:1: ( rule__CollectionID__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:470:2: rule__CollectionID__Alternatives
            {
            pushFollow(FOLLOW_rule__CollectionID__Alternatives_in_ruleCollectionID935);
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


    // $ANTLR start "entryRuleVariableAssignment"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:482:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:483:1: ( ruleVariableAssignment EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:484:1: ruleVariableAssignment EOF
            {
             before(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment962);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment969); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:491:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:495:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:496:1: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:496:1: ( ( rule__VariableAssignment__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:497:1: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:498:1: ( rule__VariableAssignment__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:498:2: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment995);
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


    // $ANTLR start "entryRuleVariableAttribute"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:510:1: entryRuleVariableAttribute : ruleVariableAttribute EOF ;
    public final void entryRuleVariableAttribute() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:511:1: ( ruleVariableAttribute EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:512:1: ruleVariableAttribute EOF
            {
             before(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute1022);
            ruleVariableAttribute();

            state._fsp--;

             after(grammarAccess.getVariableAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute1029); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:519:1: ruleVariableAttribute : ( ( rule__VariableAttribute__Group__0 ) ) ;
    public final void ruleVariableAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:523:2: ( ( ( rule__VariableAttribute__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:524:1: ( ( rule__VariableAttribute__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:524:1: ( ( rule__VariableAttribute__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:525:1: ( rule__VariableAttribute__Group__0 )
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:526:1: ( rule__VariableAttribute__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:526:2: rule__VariableAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__0_in_ruleVariableAttribute1055);
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


    // $ANTLR start "entryRuleVariableExpression"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:538:1: entryRuleVariableExpression : ruleVariableExpression EOF ;
    public final void entryRuleVariableExpression() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:539:1: ( ruleVariableExpression EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:540:1: ruleVariableExpression EOF
            {
             before(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression1082);
            ruleVariableExpression();

            state._fsp--;

             after(grammarAccess.getVariableExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression1089); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:547:1: ruleVariableExpression : ( ( rule__VariableExpression__Group__0 ) ) ;
    public final void ruleVariableExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:551:2: ( ( ( rule__VariableExpression__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:552:1: ( ( rule__VariableExpression__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:552:1: ( ( rule__VariableExpression__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:553:1: ( rule__VariableExpression__Group__0 )
            {
             before(grammarAccess.getVariableExpressionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:554:1: ( rule__VariableExpression__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:554:2: rule__VariableExpression__Group__0
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__0_in_ruleVariableExpression1115);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:566:1: entryRuleVariableExpressionOperator : ruleVariableExpressionOperator EOF ;
    public final void entryRuleVariableExpressionOperator() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:567:1: ( ruleVariableExpressionOperator EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:568:1: ruleVariableExpressionOperator EOF
            {
             before(grammarAccess.getVariableExpressionOperatorRule()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator1142);
            ruleVariableExpressionOperator();

            state._fsp--;

             after(grammarAccess.getVariableExpressionOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpressionOperator1149); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:575:1: ruleVariableExpressionOperator : ( ( rule__VariableExpressionOperator__Alternatives ) ) ;
    public final void ruleVariableExpressionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:579:2: ( ( ( rule__VariableExpressionOperator__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:580:1: ( ( rule__VariableExpressionOperator__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:580:1: ( ( rule__VariableExpressionOperator__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:581:1: ( rule__VariableExpressionOperator__Alternatives )
            {
             before(grammarAccess.getVariableExpressionOperatorAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:582:1: ( rule__VariableExpressionOperator__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:582:2: rule__VariableExpressionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableExpressionOperator__Alternatives_in_ruleVariableExpressionOperator1175);
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


    // $ANTLR start "entryRuleRuleDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:594:1: entryRuleRuleDefinition : ruleRuleDefinition EOF ;
    public final void entryRuleRuleDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:595:1: ( ruleRuleDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:596:1: ruleRuleDefinition EOF
            {
             before(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1202);
            ruleRuleDefinition();

            state._fsp--;

             after(grammarAccess.getRuleDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDefinition1209); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:603:1: ruleRuleDefinition : ( ( rule__RuleDefinition__Group__0 ) ) ;
    public final void ruleRuleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:607:2: ( ( ( rule__RuleDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:608:1: ( ( rule__RuleDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:608:1: ( ( rule__RuleDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:609:1: ( rule__RuleDefinition__Group__0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:610:1: ( rule__RuleDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:610:2: rule__RuleDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__0_in_ruleRuleDefinition1235);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:622:1: entryRuleRuleObject : ruleRuleObject EOF ;
    public final void entryRuleRuleObject() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:623:1: ( ruleRuleObject EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:624:1: ruleRuleObject EOF
            {
             before(grammarAccess.getRuleObjectRule()); 
            pushFollow(FOLLOW_ruleRuleObject_in_entryRuleRuleObject1262);
            ruleRuleObject();

            state._fsp--;

             after(grammarAccess.getRuleObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleObject1269); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:631:1: ruleRuleObject : ( ( rule__RuleObject__Group__0 ) ) ;
    public final void ruleRuleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:635:2: ( ( ( rule__RuleObject__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:636:1: ( ( rule__RuleObject__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:636:1: ( ( rule__RuleObject__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:637:1: ( rule__RuleObject__Group__0 )
            {
             before(grammarAccess.getRuleObjectAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:638:1: ( rule__RuleObject__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:638:2: rule__RuleObject__Group__0
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__0_in_ruleRuleObject1295);
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


    // $ANTLR start "entryRuleDeviceDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:650:1: entryRuleDeviceDefinition : ruleDeviceDefinition EOF ;
    public final void entryRuleDeviceDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:651:1: ( ruleDeviceDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:652:1: ruleDeviceDefinition EOF
            {
             before(grammarAccess.getDeviceDefinitionRule()); 
            pushFollow(FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition1322);
            ruleDeviceDefinition();

            state._fsp--;

             after(grammarAccess.getDeviceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeviceDefinition1329); 

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
    // $ANTLR end "entryRuleDeviceDefinition"


    // $ANTLR start "ruleDeviceDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:659:1: ruleDeviceDefinition : ( ( rule__DeviceDefinition__Group__0 ) ) ;
    public final void ruleDeviceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:663:2: ( ( ( rule__DeviceDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:664:1: ( ( rule__DeviceDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:664:1: ( ( rule__DeviceDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:665:1: ( rule__DeviceDefinition__Group__0 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:666:1: ( rule__DeviceDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:666:2: rule__DeviceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__0_in_ruleDeviceDefinition1355);
            rule__DeviceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceDefinition"


    // $ANTLR start "entryRuleATGCDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:678:1: entryRuleATGCDefinition : ruleATGCDefinition EOF ;
    public final void entryRuleATGCDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:679:1: ( ruleATGCDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:680:1: ruleATGCDefinition EOF
            {
             before(grammarAccess.getATGCDefinitionRule()); 
            pushFollow(FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition1382);
            ruleATGCDefinition();

            state._fsp--;

             after(grammarAccess.getATGCDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATGCDefinition1389); 

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
    // $ANTLR end "entryRuleATGCDefinition"


    // $ANTLR start "ruleATGCDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:687:1: ruleATGCDefinition : ( ( rule__ATGCDefinition__Group__0 ) ) ;
    public final void ruleATGCDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:691:2: ( ( ( rule__ATGCDefinition__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:692:1: ( ( rule__ATGCDefinition__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:692:1: ( ( rule__ATGCDefinition__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:693:1: ( rule__ATGCDefinition__Group__0 )
            {
             before(grammarAccess.getATGCDefinitionAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:694:1: ( rule__ATGCDefinition__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:694:2: rule__ATGCDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group__0_in_ruleATGCDefinition1415);
            rule__ATGCDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getATGCDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleATGCDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:706:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:707:1: ( rulePropertyDefinition EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:708:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1442);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1449); 

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:715:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Alternatives ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:719:2: ( ( ( rule__PropertyDefinition__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:720:1: ( ( rule__PropertyDefinition__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:720:1: ( ( rule__PropertyDefinition__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:721:1: ( rule__PropertyDefinition__Alternatives )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:722:1: ( rule__PropertyDefinition__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:722:2: rule__PropertyDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Alternatives_in_rulePropertyDefinition1475);
            rule__PropertyDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleREAL"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:734:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:735:1: ( ruleREAL EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:736:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL1502);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL1509); 

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
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:743:1: ruleREAL : ( ( rule__REAL__Alternatives ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:747:2: ( ( ( rule__REAL__Alternatives ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:748:1: ( ( rule__REAL__Alternatives ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:748:1: ( ( rule__REAL__Alternatives ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:749:1: ( rule__REAL__Alternatives )
            {
             before(grammarAccess.getREALAccess().getAlternatives()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:750:1: ( rule__REAL__Alternatives )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:750:2: rule__REAL__Alternatives
            {
            pushFollow(FOLLOW_rule__REAL__Alternatives_in_ruleREAL1535);
            rule__REAL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleDecimal"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:762:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:766:1: ( ruleDecimal EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:767:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_ruleDecimal_in_entryRuleDecimal1567);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimal1574); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:777:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:782:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:783:1: ( ( rule__Decimal__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:783:1: ( ( rule__Decimal__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:784:1: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:785:1: ( rule__Decimal__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:785:2: rule__Decimal__Group__0
            {
            pushFollow(FOLLOW_rule__Decimal__Group__0_in_ruleDecimal1604);
            rule__Decimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleDecimalExp"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:798:1: entryRuleDecimalExp : ruleDecimalExp EOF ;
    public final void entryRuleDecimalExp() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:802:1: ( ruleDecimalExp EOF )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:803:1: ruleDecimalExp EOF
            {
             before(grammarAccess.getDecimalExpRule()); 
            pushFollow(FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp1636);
            ruleDecimalExp();

            state._fsp--;

             after(grammarAccess.getDecimalExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalExp1643); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalExp"


    // $ANTLR start "ruleDecimalExp"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:813:1: ruleDecimalExp : ( ( rule__DecimalExp__Group__0 ) ) ;
    public final void ruleDecimalExp() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:818:2: ( ( ( rule__DecimalExp__Group__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:819:1: ( ( rule__DecimalExp__Group__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:819:1: ( ( rule__DecimalExp__Group__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:820:1: ( rule__DecimalExp__Group__0 )
            {
             before(grammarAccess.getDecimalExpAccess().getGroup()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:821:1: ( rule__DecimalExp__Group__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:821:2: rule__DecimalExp__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group__0_in_ruleDecimalExp1673);
            rule__DecimalExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleDecimalExp"


    // $ANTLR start "rule__ModelMember__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:834:1: rule__ModelMember__Alternatives : ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) );
    public final void rule__ModelMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:838:1: ( ( ruleImport ) | ( ruleVariableDefinition ) | ( ruleFunctionDefinition ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==28) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        alt1=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5==31) ) {
                            alt1=3;
                        }
                        else if ( (LA1_5==29) ) {
                            alt1=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                        {
                        alt1=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:839:1: ( ruleImport )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:839:1: ( ruleImport )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:840:1: ruleImport
                    {
                     before(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__ModelMember__Alternatives1709);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getModelMemberAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:845:6: ( ruleVariableDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:845:6: ( ruleVariableDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:846:1: ruleVariableDefinition
                    {
                     before(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariableDefinition_in_rule__ModelMember__Alternatives1726);
                    ruleVariableDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelMemberAccess().getVariableDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:851:6: ( ruleFunctionDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:851:6: ( ruleFunctionDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:852:1: ruleFunctionDefinition
                    {
                     before(grammarAccess.getModelMemberAccess().getFunctionDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_rule__ModelMember__Alternatives1743);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:862:1: rule__ParameterScope__Alternatives : ( ( 'required' ) | ( 'returned' ) | ( 'optional' ) );
    public final void rule__ParameterScope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:866:1: ( ( 'required' ) | ( 'returned' ) | ( 'optional' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:867:1: ( 'required' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:867:1: ( 'required' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:868:1: 'required'
                    {
                     before(grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__ParameterScope__Alternatives1776); 
                     after(grammarAccess.getParameterScopeAccess().getRequiredKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:875:6: ( 'returned' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:875:6: ( 'returned' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:876:1: 'returned'
                    {
                     before(grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__ParameterScope__Alternatives1796); 
                     after(grammarAccess.getParameterScopeAccess().getReturnedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:883:6: ( 'optional' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:883:6: ( 'optional' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:884:1: 'optional'
                    {
                     before(grammarAccess.getParameterScopeAccess().getOptionalKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__ParameterScope__Alternatives1816); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:896:1: rule__FunctionDefinitionMember__Alternatives : ( ( ruleRuleDefinition ) | ( ruleDeviceDefinition ) | ( ruleVariableAssignment ) | ( ruleVariableDeclaration ) | ( ruleATGCDefinition ) | ( rulePropertyDefinition ) );
    public final void rule__FunctionDefinitionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:900:1: ( ( ruleRuleDefinition ) | ( ruleDeviceDefinition ) | ( ruleVariableAssignment ) | ( ruleVariableDeclaration ) | ( ruleATGCDefinition ) | ( rulePropertyDefinition ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_ID) ) {
                    alt3=4;
                }
                else if ( ((LA3_3>=17 && LA3_3<=18)||LA3_3==38) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 19:
            case 20:
                {
                alt3=3;
                }
                break;
            case 11:
            case 15:
            case 16:
                {
                alt3=4;
                }
                break;
            case 41:
                {
                alt3=5;
                }
                break;
            case 42:
            case 43:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:901:1: ( ruleRuleDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:901:1: ( ruleRuleDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:902:1: ruleRuleDefinition
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRuleDefinition_in_rule__FunctionDefinitionMember__Alternatives1850);
                    ruleRuleDefinition();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getRuleDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:907:6: ( ruleDeviceDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:907:6: ( ruleDeviceDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:908:1: ruleDeviceDefinition
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getDeviceDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeviceDefinition_in_rule__FunctionDefinitionMember__Alternatives1867);
                    ruleDeviceDefinition();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getDeviceDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:913:6: ( ruleVariableAssignment )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:913:6: ( ruleVariableAssignment )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:914:1: ruleVariableAssignment
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rule__FunctionDefinitionMember__Alternatives1884);
                    ruleVariableAssignment();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getVariableAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:919:6: ( ruleVariableDeclaration )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:919:6: ( ruleVariableDeclaration )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:920:1: ruleVariableDeclaration
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getVariableDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__FunctionDefinitionMember__Alternatives1901);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getVariableDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:925:6: ( ruleATGCDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:925:6: ( ruleATGCDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:926:1: ruleATGCDefinition
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getATGCDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleATGCDefinition_in_rule__FunctionDefinitionMember__Alternatives1918);
                    ruleATGCDefinition();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getATGCDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:931:6: ( rulePropertyDefinition )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:931:6: ( rulePropertyDefinition )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:932:1: rulePropertyDefinition
                    {
                     before(grammarAccess.getFunctionDefinitionMemberAccess().getPropertyDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePropertyDefinition_in_rule__FunctionDefinitionMember__Alternatives1935);
                    rulePropertyDefinition();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionMemberAccess().getPropertyDefinitionParserRuleCall_5()); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:942:1: rule__VariableDeclaration__Alternatives_2 : ( ( ( rule__VariableDeclaration__Group_2_0__0 ) ) | ( ( rule__VariableDeclaration__Group_2_1__0 ) ) );
    public final void rule__VariableDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:946:1: ( ( ( rule__VariableDeclaration__Group_2_0__0 ) ) | ( ( rule__VariableDeclaration__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:947:1: ( ( rule__VariableDeclaration__Group_2_0__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:947:1: ( ( rule__VariableDeclaration__Group_2_0__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:948:1: ( rule__VariableDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getGroup_2_0()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:949:1: ( rule__VariableDeclaration__Group_2_0__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:949:2: rule__VariableDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__0_in_rule__VariableDeclaration__Alternatives_21967);
                    rule__VariableDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:953:6: ( ( rule__VariableDeclaration__Group_2_1__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:953:6: ( ( rule__VariableDeclaration__Group_2_1__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:954:1: ( rule__VariableDeclaration__Group_2_1__0 )
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getGroup_2_1()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:955:1: ( rule__VariableDeclaration__Group_2_1__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:955:2: rule__VariableDeclaration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__0_in_rule__VariableDeclaration__Alternatives_21985);
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


    // $ANTLR start "rule__CollectionID__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:964:1: rule__CollectionID__Alternatives : ( ( 'LIST' ) | ( 'SET' ) );
    public final void rule__CollectionID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:968:1: ( ( 'LIST' ) | ( 'SET' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:969:1: ( 'LIST' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:969:1: ( 'LIST' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:970:1: 'LIST'
                    {
                     before(grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__CollectionID__Alternatives2019); 
                     after(grammarAccess.getCollectionIDAccess().getLISTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:977:6: ( 'SET' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:977:6: ( 'SET' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:978:1: 'SET'
                    {
                     before(grammarAccess.getCollectionIDAccess().getSETKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__CollectionID__Alternatives2039); 
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


    // $ANTLR start "rule__VariableAttribute__NameAlternatives_1_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:990:1: rule__VariableAttribute__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleREAL ) );
    public final void rule__VariableAttribute__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:994:1: ( ( RULE_ID ) | ( ruleREAL ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT||(LA6_0>=19 && LA6_0<=20)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:995:1: ( RULE_ID )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:995:1: ( RULE_ID )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:996:1: RULE_ID
                    {
                     before(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAttribute__NameAlternatives_1_02073); 
                     after(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1001:6: ( ruleREAL )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1001:6: ( ruleREAL )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1002:1: ruleREAL
                    {
                     before(grammarAccess.getVariableAttributeAccess().getNameREALParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleREAL_in_rule__VariableAttribute__NameAlternatives_1_02090);
                    ruleREAL();

                    state._fsp--;

                     after(grammarAccess.getVariableAttributeAccess().getNameREALParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__VariableAttribute__NameAlternatives_1_0"


    // $ANTLR start "rule__VariableAttribute__Alternatives_2_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1012:1: rule__VariableAttribute__Alternatives_2_0 : ( ( '.' ) | ( '~' ) );
    public final void rule__VariableAttribute__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1016:1: ( ( '.' ) | ( '~' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1017:1: ( '.' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1017:1: ( '.' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1018:1: '.'
                    {
                     before(grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__VariableAttribute__Alternatives_2_02123); 
                     after(grammarAccess.getVariableAttributeAccess().getFullStopKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1025:6: ( '~' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1025:6: ( '~' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1026:1: '~'
                    {
                     before(grammarAccess.getVariableAttributeAccess().getTildeKeyword_2_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__VariableAttribute__Alternatives_2_02143); 
                     after(grammarAccess.getVariableAttributeAccess().getTildeKeyword_2_0_1()); 

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
    // $ANTLR end "rule__VariableAttribute__Alternatives_2_0"


    // $ANTLR start "rule__VariableExpressionOperator__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1038:1: rule__VariableExpressionOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '|' ) );
    public final void rule__VariableExpressionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1042:1: ( ( '+' ) | ( '-' ) | ( '|' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1043:1: ( '+' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1043:1: ( '+' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1044:1: '+'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__VariableExpressionOperator__Alternatives2178); 
                     after(grammarAccess.getVariableExpressionOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1051:6: ( '-' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1051:6: ( '-' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1052:1: '-'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__VariableExpressionOperator__Alternatives2198); 
                     after(grammarAccess.getVariableExpressionOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1059:6: ( '|' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1059:6: ( '|' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1060:1: '|'
                    {
                     before(grammarAccess.getVariableExpressionOperatorAccess().getVerticalLineKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__VariableExpressionOperator__Alternatives2218); 
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


    // $ANTLR start "rule__RuleDefinition__Alternatives_5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1072:1: rule__RuleDefinition__Alternatives_5 : ( ( '->' ) | ( '<->' ) );
    public final void rule__RuleDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1076:1: ( ( '->' ) | ( '<->' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1077:1: ( '->' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1077:1: ( '->' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1078:1: '->'
                    {
                     before(grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
                    match(input,22,FOLLOW_22_in_rule__RuleDefinition__Alternatives_52253); 
                     after(grammarAccess.getRuleDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1085:6: ( '<->' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1085:6: ( '<->' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1086:1: '<->'
                    {
                     before(grammarAccess.getRuleDefinitionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5_1()); 
                    match(input,23,FOLLOW_23_in_rule__RuleDefinition__Alternatives_52273); 
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


    // $ANTLR start "rule__PropertyDefinition__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1098:1: rule__PropertyDefinition__Alternatives : ( ( ( rule__PropertyDefinition__Group_0__0 ) ) | ( ( rule__PropertyDefinition__Group_1__0 ) ) );
    public final void rule__PropertyDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1102:1: ( ( ( rule__PropertyDefinition__Group_0__0 ) ) | ( ( rule__PropertyDefinition__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            else if ( (LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1103:1: ( ( rule__PropertyDefinition__Group_0__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1103:1: ( ( rule__PropertyDefinition__Group_0__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1104:1: ( rule__PropertyDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getGroup_0()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1105:1: ( rule__PropertyDefinition__Group_0__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1105:2: rule__PropertyDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__0_in_rule__PropertyDefinition__Alternatives2307);
                    rule__PropertyDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1109:6: ( ( rule__PropertyDefinition__Group_1__0 ) )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1109:6: ( ( rule__PropertyDefinition__Group_1__0 ) )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1110:1: ( rule__PropertyDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getGroup_1()); 
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1111:1: ( rule__PropertyDefinition__Group_1__0 )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1111:2: rule__PropertyDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_1__0_in_rule__PropertyDefinition__Alternatives2325);
                    rule__PropertyDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Alternatives"


    // $ANTLR start "rule__REAL__Alternatives"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1120:1: rule__REAL__Alternatives : ( ( ruleDecimal ) | ( ruleDecimalExp ) );
    public final void rule__REAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1124:1: ( ( ruleDecimal ) | ( ruleDecimalExp ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==RULE_INT) ) {
                            int LA11_7 = input.LA(5);

                            if ( ((LA11_7>=24 && LA11_7<=25)) ) {
                                alt11=2;
                            }
                            else if ( (LA11_7==EOF||(LA11_7>=RULE_ID && LA11_7<=RULE_INT)||LA11_7==11||(LA11_7>=15 && LA11_7<=21)||LA11_7==30||(LA11_7>=32 && LA11_7<=33)||(LA11_7>=38 && LA11_7<=43)) ) {
                                alt11=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA11_4==RULE_ID) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                    case 25:
                        {
                        alt11=2;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_INT:
                    case 11:
                    case 15:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 30:
                    case 32:
                    case 33:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                        {
                        alt11=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==RULE_INT) ) {
                            int LA11_7 = input.LA(5);

                            if ( ((LA11_7>=24 && LA11_7<=25)) ) {
                                alt11=2;
                            }
                            else if ( (LA11_7==EOF||(LA11_7>=RULE_ID && LA11_7<=RULE_INT)||LA11_7==11||(LA11_7>=15 && LA11_7<=21)||LA11_7==30||(LA11_7>=32 && LA11_7<=33)||(LA11_7>=38 && LA11_7<=43)) ) {
                                alt11=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA11_4==RULE_ID) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                    case 25:
                        {
                        alt11=2;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_INT:
                    case 11:
                    case 15:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 30:
                    case 32:
                    case 33:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                        {
                        alt11=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==RULE_INT) ) {
                        int LA11_7 = input.LA(4);

                        if ( ((LA11_7>=24 && LA11_7<=25)) ) {
                            alt11=2;
                        }
                        else if ( (LA11_7==EOF||(LA11_7>=RULE_ID && LA11_7<=RULE_INT)||LA11_7==11||(LA11_7>=15 && LA11_7<=21)||LA11_7==30||(LA11_7>=32 && LA11_7<=33)||(LA11_7>=38 && LA11_7<=43)) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA11_4==RULE_ID) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                case 25:
                    {
                    alt11=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case 11:
                case 15:
                case 16:
                case 18:
                case 19:
                case 20:
                case 21:
                case 30:
                case 32:
                case 33:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1125:1: ( ruleDecimal )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1125:1: ( ruleDecimal )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1126:1: ruleDecimal
                    {
                     before(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecimal_in_rule__REAL__Alternatives2358);
                    ruleDecimal();

                    state._fsp--;

                     after(grammarAccess.getREALAccess().getDecimalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1131:6: ( ruleDecimalExp )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1131:6: ( ruleDecimalExp )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1132:1: ruleDecimalExp
                    {
                     before(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDecimalExp_in_rule__REAL__Alternatives2375);
                    ruleDecimalExp();

                    state._fsp--;

                     after(grammarAccess.getREALAccess().getDecimalExpParserRuleCall_1()); 

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
    // $ANTLR end "rule__REAL__Alternatives"


    // $ANTLR start "rule__Decimal__Alternatives_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1142:1: rule__Decimal__Alternatives_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Decimal__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1146:1: ( ( '+' ) | ( '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1147:1: ( '+' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1147:1: ( '+' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1148:1: '+'
                    {
                     before(grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Decimal__Alternatives_02408); 
                     after(grammarAccess.getDecimalAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1155:6: ( '-' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1155:6: ( '-' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1156:1: '-'
                    {
                     before(grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Decimal__Alternatives_02428); 
                     after(grammarAccess.getDecimalAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__Decimal__Alternatives_0"


    // $ANTLR start "rule__DecimalExp__Alternatives_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1168:1: rule__DecimalExp__Alternatives_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__DecimalExp__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1172:1: ( ( '+' ) | ( '-' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1173:1: ( '+' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1173:1: ( '+' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1174:1: '+'
                    {
                     before(grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__DecimalExp__Alternatives_02463); 
                     after(grammarAccess.getDecimalExpAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1181:6: ( '-' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1181:6: ( '-' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1182:1: '-'
                    {
                     before(grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__DecimalExp__Alternatives_02483); 
                     after(grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__DecimalExp__Alternatives_0"


    // $ANTLR start "rule__DecimalExp__Alternatives_3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1194:1: rule__DecimalExp__Alternatives_3 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__DecimalExp__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1198:1: ( ( 'E' ) | ( 'e' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1199:1: ( 'E' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1199:1: ( 'E' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1200:1: 'E'
                    {
                     before(grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 
                    match(input,24,FOLLOW_24_in_rule__DecimalExp__Alternatives_32518); 
                     after(grammarAccess.getDecimalExpAccess().getEKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1207:6: ( 'e' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1207:6: ( 'e' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1208:1: 'e'
                    {
                     before(grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 
                    match(input,25,FOLLOW_25_in_rule__DecimalExp__Alternatives_32538); 
                     after(grammarAccess.getDecimalExpAccess().getEKeyword_3_1()); 

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
    // $ANTLR end "rule__DecimalExp__Alternatives_3"


    // $ANTLR start "rule__DecimalExp__Alternatives_4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1220:1: rule__DecimalExp__Alternatives_4 : ( ( '+' ) | ( '-' ) );
    public final void rule__DecimalExp__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1224:1: ( ( '+' ) | ( '-' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1225:1: ( '+' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1225:1: ( '+' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1226:1: '+'
                    {
                     before(grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 
                    match(input,19,FOLLOW_19_in_rule__DecimalExp__Alternatives_42573); 
                     after(grammarAccess.getDecimalExpAccess().getPlusSignKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1233:6: ( '-' )
                    {
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1233:6: ( '-' )
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1234:1: '-'
                    {
                     before(grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 
                    match(input,20,FOLLOW_20_in_rule__DecimalExp__Alternatives_42593); 
                     after(grammarAccess.getDecimalExpAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__DecimalExp__Alternatives_4"


    // $ANTLR start "rule__Model__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1248:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1252:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1253:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02625);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02628);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1260:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1264:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1265:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1265:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1266:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1267:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1269:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1279:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1283:1: ( rule__Model__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1284:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12686);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1290:1: rule__Model__Group__1__Impl : ( ( rule__Model__MembersAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1294:1: ( ( ( rule__Model__MembersAssignment_1 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1295:1: ( ( rule__Model__MembersAssignment_1 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1295:1: ( ( rule__Model__MembersAssignment_1 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1296:1: ( rule__Model__MembersAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getMembersAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1297:1: ( rule__Model__MembersAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1297:2: rule__Model__MembersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__MembersAssignment_1_in_rule__Model__Group__1__Impl2713);
            	    rule__Model__MembersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "rule__Import__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1311:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1315:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1316:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02748);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02751);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1323:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1327:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1328:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1328:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1329:1: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1330:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1332:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1342:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1346:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1347:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12809);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__12812);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1354:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1358:1: ( ( 'import' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1359:1: ( 'import' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1359:1: ( 'import' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1360:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Import__Group__1__Impl2840); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1373:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1377:1: ( rule__Import__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1378:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__22871);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1384:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1388:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1389:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1389:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1390:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1391:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1391:2: rule__Import__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl2898);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1407:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1411:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1412:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02934);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02937);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1419:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1423:1: ( ( ruleQualifiedName ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1424:1: ( ruleQualifiedName )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1424:1: ( ruleQualifiedName )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1425:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2964);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1436:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1440:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1441:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12993);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1447:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1451:1: ( ( ( '.*' )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1452:1: ( ( '.*' )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1452:1: ( ( '.*' )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1453:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1454:1: ( '.*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1455:2: '.*'
                    {
                    match(input,27,FOLLOW_27_in_rule__QualifiedNameWithWildcard__Group__1__Impl3022); 

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1470:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1474:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1475:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03059);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03062);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1482:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1486:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1487:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1487:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1488:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3089); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1499:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1503:1: ( rule__QualifiedName__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1504:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13118);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1510:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1514:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1515:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1515:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1516:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1517:1: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1517:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3145);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1531:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1535:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1536:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03180);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03183);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1543:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1547:1: ( ( '.' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1548:1: ( '.' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1548:1: ( '.' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1549:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl3211); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1562:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1566:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1567:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13242);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1573:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1577:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1578:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1578:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1579:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3269); 
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


    // $ANTLR start "rule__VariableDefinition__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1594:1: rule__VariableDefinition__Group__0 : rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 ;
    public final void rule__VariableDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1598:1: ( rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1599:2: rule__VariableDefinition__Group__0__Impl rule__VariableDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__0__Impl_in_rule__VariableDefinition__Group__03302);
            rule__VariableDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__1_in_rule__VariableDefinition__Group__03305);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1606:1: rule__VariableDefinition__Group__0__Impl : ( () ) ;
    public final void rule__VariableDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1610:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1611:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1611:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1612:1: ()
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1613:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1615:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1625:1: rule__VariableDefinition__Group__1 : rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 ;
    public final void rule__VariableDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1629:1: ( rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1630:2: rule__VariableDefinition__Group__1__Impl rule__VariableDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__1__Impl_in_rule__VariableDefinition__Group__13363);
            rule__VariableDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__2_in_rule__VariableDefinition__Group__13366);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1637:1: rule__VariableDefinition__Group__1__Impl : ( 'define' ) ;
    public final void rule__VariableDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1641:1: ( ( 'define' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1642:1: ( 'define' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1642:1: ( 'define' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1643:1: 'define'
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__VariableDefinition__Group__1__Impl3394); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1656:1: rule__VariableDefinition__Group__2 : rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 ;
    public final void rule__VariableDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1660:1: ( rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1661:2: rule__VariableDefinition__Group__2__Impl rule__VariableDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__2__Impl_in_rule__VariableDefinition__Group__23425);
            rule__VariableDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__3_in_rule__VariableDefinition__Group__23428);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1668:1: rule__VariableDefinition__Group__2__Impl : ( ( rule__VariableDefinition__TypeAssignment_2 )? ) ;
    public final void rule__VariableDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1672:1: ( ( ( rule__VariableDefinition__TypeAssignment_2 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1673:1: ( ( rule__VariableDefinition__TypeAssignment_2 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1673:1: ( ( rule__VariableDefinition__TypeAssignment_2 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1674:1: ( rule__VariableDefinition__TypeAssignment_2 )?
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1675:1: ( rule__VariableDefinition__TypeAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ID) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1675:2: rule__VariableDefinition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__VariableDefinition__TypeAssignment_2_in_rule__VariableDefinition__Group__2__Impl3455);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1685:1: rule__VariableDefinition__Group__3 : rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 ;
    public final void rule__VariableDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1689:1: ( rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1690:2: rule__VariableDefinition__Group__3__Impl rule__VariableDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__3__Impl_in_rule__VariableDefinition__Group__33486);
            rule__VariableDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__4_in_rule__VariableDefinition__Group__33489);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1697:1: rule__VariableDefinition__Group__3__Impl : ( ( rule__VariableDefinition__NameAssignment_3 ) ) ;
    public final void rule__VariableDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1701:1: ( ( ( rule__VariableDefinition__NameAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1702:1: ( ( rule__VariableDefinition__NameAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1702:1: ( ( rule__VariableDefinition__NameAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1703:1: ( rule__VariableDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1704:1: ( rule__VariableDefinition__NameAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1704:2: rule__VariableDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableDefinition__NameAssignment_3_in_rule__VariableDefinition__Group__3__Impl3516);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1714:1: rule__VariableDefinition__Group__4 : rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5 ;
    public final void rule__VariableDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1718:1: ( rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1719:2: rule__VariableDefinition__Group__4__Impl rule__VariableDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__4__Impl_in_rule__VariableDefinition__Group__43546);
            rule__VariableDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__5_in_rule__VariableDefinition__Group__43549);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1726:1: rule__VariableDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__VariableDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1730:1: ( ( '{' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1731:1: ( '{' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1731:1: ( '{' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1732:1: '{'
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__VariableDefinition__Group__4__Impl3577); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1745:1: rule__VariableDefinition__Group__5 : rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6 ;
    public final void rule__VariableDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1749:1: ( rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1750:2: rule__VariableDefinition__Group__5__Impl rule__VariableDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__5__Impl_in_rule__VariableDefinition__Group__53608);
            rule__VariableDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDefinition__Group__6_in_rule__VariableDefinition__Group__53611);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1757:1: rule__VariableDefinition__Group__5__Impl : ( ( rule__VariableDefinition__MembersAssignment_5 )* ) ;
    public final void rule__VariableDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1761:1: ( ( ( rule__VariableDefinition__MembersAssignment_5 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1762:1: ( ( rule__VariableDefinition__MembersAssignment_5 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1762:1: ( ( rule__VariableDefinition__MembersAssignment_5 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1763:1: ( rule__VariableDefinition__MembersAssignment_5 )*
            {
             before(grammarAccess.getVariableDefinitionAccess().getMembersAssignment_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1764:1: ( rule__VariableDefinition__MembersAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==11||(LA20_0>=15 && LA20_0<=16)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1764:2: rule__VariableDefinition__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__VariableDefinition__MembersAssignment_5_in_rule__VariableDefinition__Group__5__Impl3638);
            	    rule__VariableDefinition__MembersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1774:1: rule__VariableDefinition__Group__6 : rule__VariableDefinition__Group__6__Impl ;
    public final void rule__VariableDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1778:1: ( rule__VariableDefinition__Group__6__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1779:2: rule__VariableDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__VariableDefinition__Group__6__Impl_in_rule__VariableDefinition__Group__63669);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1785:1: rule__VariableDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__VariableDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1789:1: ( ( '}' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1790:1: ( '}' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1790:1: ( '}' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1791:1: '}'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__VariableDefinition__Group__6__Impl3697); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1818:1: rule__FunctionDefinition__Group__0 : rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 ;
    public final void rule__FunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1822:1: ( rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1823:2: rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__03742);
            rule__FunctionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__03745);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1830:1: rule__FunctionDefinition__Group__0__Impl : ( () ) ;
    public final void rule__FunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1834:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1835:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1835:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1836:1: ()
            {
             before(grammarAccess.getFunctionDefinitionAccess().getFunctionDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1837:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1839:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1849:1: rule__FunctionDefinition__Group__1 : rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 ;
    public final void rule__FunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1853:1: ( rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1854:2: rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__13803);
            rule__FunctionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__13806);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1861:1: rule__FunctionDefinition__Group__1__Impl : ( 'define' ) ;
    public final void rule__FunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1865:1: ( ( 'define' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1866:1: ( 'define' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1866:1: ( 'define' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1867:1: 'define'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__FunctionDefinition__Group__1__Impl3834); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1880:1: rule__FunctionDefinition__Group__2 : rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 ;
    public final void rule__FunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1884:1: ( rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1885:2: rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__23865);
            rule__FunctionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__23868);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1892:1: rule__FunctionDefinition__Group__2__Impl : ( ( rule__FunctionDefinition__TypeAssignment_2 )? ) ;
    public final void rule__FunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1896:1: ( ( ( rule__FunctionDefinition__TypeAssignment_2 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1897:1: ( ( rule__FunctionDefinition__TypeAssignment_2 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1897:1: ( ( rule__FunctionDefinition__TypeAssignment_2 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1898:1: ( rule__FunctionDefinition__TypeAssignment_2 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getTypeAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1899:1: ( rule__FunctionDefinition__TypeAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1899:2: rule__FunctionDefinition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__TypeAssignment_2_in_rule__FunctionDefinition__Group__2__Impl3895);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1909:1: rule__FunctionDefinition__Group__3 : rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 ;
    public final void rule__FunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1913:1: ( rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1914:2: rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__33926);
            rule__FunctionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__33929);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1921:1: rule__FunctionDefinition__Group__3__Impl : ( ( rule__FunctionDefinition__NameAssignment_3 ) ) ;
    public final void rule__FunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1925:1: ( ( ( rule__FunctionDefinition__NameAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1926:1: ( ( rule__FunctionDefinition__NameAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1926:1: ( ( rule__FunctionDefinition__NameAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1927:1: ( rule__FunctionDefinition__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1928:1: ( rule__FunctionDefinition__NameAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1928:2: rule__FunctionDefinition__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__NameAssignment_3_in_rule__FunctionDefinition__Group__3__Impl3956);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1938:1: rule__FunctionDefinition__Group__4 : rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 ;
    public final void rule__FunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1942:1: ( rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1943:2: rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__43986);
            rule__FunctionDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__43989);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1950:1: rule__FunctionDefinition__Group__4__Impl : ( '(' ) ;
    public final void rule__FunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1954:1: ( ( '(' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1955:1: ( '(' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1955:1: ( '(' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1956:1: '('
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__FunctionDefinition__Group__4__Impl4017); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1969:1: rule__FunctionDefinition__Group__5 : rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6 ;
    public final void rule__FunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1973:1: ( rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1974:2: rule__FunctionDefinition__Group__5__Impl rule__FunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__54048);
            rule__FunctionDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__6_in_rule__FunctionDefinition__Group__54051);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1981:1: rule__FunctionDefinition__Group__5__Impl : ( ( rule__FunctionDefinition__Group_5__0 )? ) ;
    public final void rule__FunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1985:1: ( ( ( rule__FunctionDefinition__Group_5__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1986:1: ( ( rule__FunctionDefinition__Group_5__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1986:1: ( ( rule__FunctionDefinition__Group_5__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1987:1: ( rule__FunctionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1988:1: ( rule__FunctionDefinition__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1988:2: rule__FunctionDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_5__0_in_rule__FunctionDefinition__Group__5__Impl4078);
                    rule__FunctionDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_5()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:1998:1: rule__FunctionDefinition__Group__6 : rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7 ;
    public final void rule__FunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2002:1: ( rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2003:2: rule__FunctionDefinition__Group__6__Impl rule__FunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__6__Impl_in_rule__FunctionDefinition__Group__64109);
            rule__FunctionDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__7_in_rule__FunctionDefinition__Group__64112);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2010:1: rule__FunctionDefinition__Group__6__Impl : ( ')' ) ;
    public final void rule__FunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2014:1: ( ( ')' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2015:1: ( ')' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2015:1: ( ')' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2016:1: ')'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__FunctionDefinition__Group__6__Impl4140); 
             after(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2029:1: rule__FunctionDefinition__Group__7 : rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8 ;
    public final void rule__FunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2033:1: ( rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2034:2: rule__FunctionDefinition__Group__7__Impl rule__FunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__7__Impl_in_rule__FunctionDefinition__Group__74171);
            rule__FunctionDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__8_in_rule__FunctionDefinition__Group__74174);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2041:1: rule__FunctionDefinition__Group__7__Impl : ( '{' ) ;
    public final void rule__FunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2045:1: ( ( '{' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2046:1: ( '{' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2046:1: ( '{' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2047:1: '{'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_29_in_rule__FunctionDefinition__Group__7__Impl4202); 
             after(grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2060:1: rule__FunctionDefinition__Group__8 : rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9 ;
    public final void rule__FunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2064:1: ( rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2065:2: rule__FunctionDefinition__Group__8__Impl rule__FunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__8__Impl_in_rule__FunctionDefinition__Group__84233);
            rule__FunctionDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__9_in_rule__FunctionDefinition__Group__84236);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2072:1: rule__FunctionDefinition__Group__8__Impl : ( ( rule__FunctionDefinition__MembersAssignment_8 )* ) ;
    public final void rule__FunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2076:1: ( ( ( rule__FunctionDefinition__MembersAssignment_8 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2077:1: ( ( rule__FunctionDefinition__MembersAssignment_8 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2077:1: ( ( rule__FunctionDefinition__MembersAssignment_8 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2078:1: ( rule__FunctionDefinition__MembersAssignment_8 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_8()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2079:1: ( rule__FunctionDefinition__MembersAssignment_8 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==11||(LA23_0>=15 && LA23_0<=16)||(LA23_0>=19 && LA23_0<=20)||(LA23_0>=39 && LA23_0<=43)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2079:2: rule__FunctionDefinition__MembersAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__MembersAssignment_8_in_rule__FunctionDefinition__Group__8__Impl4263);
            	    rule__FunctionDefinition__MembersAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getMembersAssignment_8()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2089:1: rule__FunctionDefinition__Group__9 : rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10 ;
    public final void rule__FunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2093:1: ( rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2094:2: rule__FunctionDefinition__Group__9__Impl rule__FunctionDefinition__Group__10
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__9__Impl_in_rule__FunctionDefinition__Group__94294);
            rule__FunctionDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__10_in_rule__FunctionDefinition__Group__94297);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2101:1: rule__FunctionDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__FunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2105:1: ( ( '}' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2106:1: ( '}' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2106:1: ( '}' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2107:1: '}'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,30,FOLLOW_30_in_rule__FunctionDefinition__Group__9__Impl4325); 
             after(grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2120:1: rule__FunctionDefinition__Group__10 : rule__FunctionDefinition__Group__10__Impl ;
    public final void rule__FunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2124:1: ( rule__FunctionDefinition__Group__10__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2125:2: rule__FunctionDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__10__Impl_in_rule__FunctionDefinition__Group__104356);
            rule__FunctionDefinition__Group__10__Impl();

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2131:1: rule__FunctionDefinition__Group__10__Impl : ( ( rule__FunctionDefinition__Group_10__0 )? ) ;
    public final void rule__FunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2135:1: ( ( ( rule__FunctionDefinition__Group_10__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2136:1: ( ( rule__FunctionDefinition__Group_10__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2136:1: ( ( rule__FunctionDefinition__Group_10__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2137:1: ( rule__FunctionDefinition__Group_10__0 )?
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_10()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2138:1: ( rule__FunctionDefinition__Group_10__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2138:2: rule__FunctionDefinition__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_10__0_in_rule__FunctionDefinition__Group__10__Impl4383);
                    rule__FunctionDefinition__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__FunctionDefinition__Group_5__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2170:1: rule__FunctionDefinition__Group_5__0 : rule__FunctionDefinition__Group_5__0__Impl rule__FunctionDefinition__Group_5__1 ;
    public final void rule__FunctionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2174:1: ( rule__FunctionDefinition__Group_5__0__Impl rule__FunctionDefinition__Group_5__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2175:2: rule__FunctionDefinition__Group_5__0__Impl rule__FunctionDefinition__Group_5__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_5__0__Impl_in_rule__FunctionDefinition__Group_5__04436);
            rule__FunctionDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_5__1_in_rule__FunctionDefinition__Group_5__04439);
            rule__FunctionDefinition__Group_5__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group_5__0"


    // $ANTLR start "rule__FunctionDefinition__Group_5__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2182:1: rule__FunctionDefinition__Group_5__0__Impl : ( ( rule__FunctionDefinition__ParametersAssignment_5_0 ) ) ;
    public final void rule__FunctionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2186:1: ( ( ( rule__FunctionDefinition__ParametersAssignment_5_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2187:1: ( ( rule__FunctionDefinition__ParametersAssignment_5_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2187:1: ( ( rule__FunctionDefinition__ParametersAssignment_5_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2188:1: ( rule__FunctionDefinition__ParametersAssignment_5_0 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2189:1: ( rule__FunctionDefinition__ParametersAssignment_5_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2189:2: rule__FunctionDefinition__ParametersAssignment_5_0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_0_in_rule__FunctionDefinition__Group_5__0__Impl4466);
            rule__FunctionDefinition__ParametersAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_5__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2199:1: rule__FunctionDefinition__Group_5__1 : rule__FunctionDefinition__Group_5__1__Impl ;
    public final void rule__FunctionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2203:1: ( rule__FunctionDefinition__Group_5__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2204:2: rule__FunctionDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_5__1__Impl_in_rule__FunctionDefinition__Group_5__14496);
            rule__FunctionDefinition__Group_5__1__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group_5__1"


    // $ANTLR start "rule__FunctionDefinition__Group_5__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2210:1: rule__FunctionDefinition__Group_5__1__Impl : ( ( rule__FunctionDefinition__Group_5_1__0 )* ) ;
    public final void rule__FunctionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2214:1: ( ( ( rule__FunctionDefinition__Group_5_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2215:1: ( ( rule__FunctionDefinition__Group_5_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2215:1: ( ( rule__FunctionDefinition__Group_5_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2216:1: ( rule__FunctionDefinition__Group_5_1__0 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_5_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2217:1: ( rule__FunctionDefinition__Group_5_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2217:2: rule__FunctionDefinition__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__Group_5_1__0_in_rule__FunctionDefinition__Group_5__1__Impl4523);
            	    rule__FunctionDefinition__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_5_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2231:1: rule__FunctionDefinition__Group_5_1__0 : rule__FunctionDefinition__Group_5_1__0__Impl rule__FunctionDefinition__Group_5_1__1 ;
    public final void rule__FunctionDefinition__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2235:1: ( rule__FunctionDefinition__Group_5_1__0__Impl rule__FunctionDefinition__Group_5_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2236:2: rule__FunctionDefinition__Group_5_1__0__Impl rule__FunctionDefinition__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_5_1__0__Impl_in_rule__FunctionDefinition__Group_5_1__04558);
            rule__FunctionDefinition__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_5_1__1_in_rule__FunctionDefinition__Group_5_1__04561);
            rule__FunctionDefinition__Group_5_1__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group_5_1__0"


    // $ANTLR start "rule__FunctionDefinition__Group_5_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2243:1: rule__FunctionDefinition__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDefinition__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2247:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2248:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2248:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2249:1: ','
            {
             before(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_5_1_0()); 
            match(input,33,FOLLOW_33_in_rule__FunctionDefinition__Group_5_1__0__Impl4589); 
             after(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_5_1__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_5_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2262:1: rule__FunctionDefinition__Group_5_1__1 : rule__FunctionDefinition__Group_5_1__1__Impl ;
    public final void rule__FunctionDefinition__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2266:1: ( rule__FunctionDefinition__Group_5_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2267:2: rule__FunctionDefinition__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_5_1__1__Impl_in_rule__FunctionDefinition__Group_5_1__14620);
            rule__FunctionDefinition__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group_5_1__1"


    // $ANTLR start "rule__FunctionDefinition__Group_5_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2273:1: rule__FunctionDefinition__Group_5_1__1__Impl : ( ( rule__FunctionDefinition__ParametersAssignment_5_1_1 ) ) ;
    public final void rule__FunctionDefinition__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2277:1: ( ( ( rule__FunctionDefinition__ParametersAssignment_5_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2278:1: ( ( rule__FunctionDefinition__ParametersAssignment_5_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2278:1: ( ( rule__FunctionDefinition__ParametersAssignment_5_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2279:1: ( rule__FunctionDefinition__ParametersAssignment_5_1_1 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2280:1: ( rule__FunctionDefinition__ParametersAssignment_5_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2280:2: rule__FunctionDefinition__ParametersAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_1_1_in_rule__FunctionDefinition__Group_5_1__1__Impl4647);
            rule__FunctionDefinition__ParametersAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_5_1__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_10__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2294:1: rule__FunctionDefinition__Group_10__0 : rule__FunctionDefinition__Group_10__0__Impl rule__FunctionDefinition__Group_10__1 ;
    public final void rule__FunctionDefinition__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2298:1: ( rule__FunctionDefinition__Group_10__0__Impl rule__FunctionDefinition__Group_10__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2299:2: rule__FunctionDefinition__Group_10__0__Impl rule__FunctionDefinition__Group_10__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10__0__Impl_in_rule__FunctionDefinition__Group_10__04681);
            rule__FunctionDefinition__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10__1_in_rule__FunctionDefinition__Group_10__04684);
            rule__FunctionDefinition__Group_10__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group_10__0"


    // $ANTLR start "rule__FunctionDefinition__Group_10__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2306:1: rule__FunctionDefinition__Group_10__0__Impl : ( 'USES' ) ;
    public final void rule__FunctionDefinition__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2310:1: ( ( 'USES' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2311:1: ( 'USES' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2311:1: ( 'USES' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2312:1: 'USES'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_10_0()); 
            match(input,34,FOLLOW_34_in_rule__FunctionDefinition__Group_10__0__Impl4712); 
             after(grammarAccess.getFunctionDefinitionAccess().getUSESKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_10__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_10__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2325:1: rule__FunctionDefinition__Group_10__1 : rule__FunctionDefinition__Group_10__1__Impl rule__FunctionDefinition__Group_10__2 ;
    public final void rule__FunctionDefinition__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2329:1: ( rule__FunctionDefinition__Group_10__1__Impl rule__FunctionDefinition__Group_10__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2330:2: rule__FunctionDefinition__Group_10__1__Impl rule__FunctionDefinition__Group_10__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10__1__Impl_in_rule__FunctionDefinition__Group_10__14743);
            rule__FunctionDefinition__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10__2_in_rule__FunctionDefinition__Group_10__14746);
            rule__FunctionDefinition__Group_10__2();

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
    // $ANTLR end "rule__FunctionDefinition__Group_10__1"


    // $ANTLR start "rule__FunctionDefinition__Group_10__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2337:1: rule__FunctionDefinition__Group_10__1__Impl : ( ( rule__FunctionDefinition__UsesAssignment_10_1 ) ) ;
    public final void rule__FunctionDefinition__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2341:1: ( ( ( rule__FunctionDefinition__UsesAssignment_10_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2342:1: ( ( rule__FunctionDefinition__UsesAssignment_10_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2342:1: ( ( rule__FunctionDefinition__UsesAssignment_10_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2343:1: ( rule__FunctionDefinition__UsesAssignment_10_1 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_10_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2344:1: ( rule__FunctionDefinition__UsesAssignment_10_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2344:2: rule__FunctionDefinition__UsesAssignment_10_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__UsesAssignment_10_1_in_rule__FunctionDefinition__Group_10__1__Impl4773);
            rule__FunctionDefinition__UsesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_10__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_10__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2354:1: rule__FunctionDefinition__Group_10__2 : rule__FunctionDefinition__Group_10__2__Impl ;
    public final void rule__FunctionDefinition__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2358:1: ( rule__FunctionDefinition__Group_10__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2359:2: rule__FunctionDefinition__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10__2__Impl_in_rule__FunctionDefinition__Group_10__24803);
            rule__FunctionDefinition__Group_10__2__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group_10__2"


    // $ANTLR start "rule__FunctionDefinition__Group_10__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2365:1: rule__FunctionDefinition__Group_10__2__Impl : ( ( rule__FunctionDefinition__Group_10_2__0 )* ) ;
    public final void rule__FunctionDefinition__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2369:1: ( ( ( rule__FunctionDefinition__Group_10_2__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2370:1: ( ( rule__FunctionDefinition__Group_10_2__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2370:1: ( ( rule__FunctionDefinition__Group_10_2__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2371:1: ( rule__FunctionDefinition__Group_10_2__0 )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup_10_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2372:1: ( rule__FunctionDefinition__Group_10_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2372:2: rule__FunctionDefinition__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDefinition__Group_10_2__0_in_rule__FunctionDefinition__Group_10__2__Impl4830);
            	    rule__FunctionDefinition__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_10__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_10_2__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2388:1: rule__FunctionDefinition__Group_10_2__0 : rule__FunctionDefinition__Group_10_2__0__Impl rule__FunctionDefinition__Group_10_2__1 ;
    public final void rule__FunctionDefinition__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2392:1: ( rule__FunctionDefinition__Group_10_2__0__Impl rule__FunctionDefinition__Group_10_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2393:2: rule__FunctionDefinition__Group_10_2__0__Impl rule__FunctionDefinition__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10_2__0__Impl_in_rule__FunctionDefinition__Group_10_2__04867);
            rule__FunctionDefinition__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10_2__1_in_rule__FunctionDefinition__Group_10_2__04870);
            rule__FunctionDefinition__Group_10_2__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group_10_2__0"


    // $ANTLR start "rule__FunctionDefinition__Group_10_2__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2400:1: rule__FunctionDefinition__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionDefinition__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2404:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2405:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2405:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2406:1: ','
            {
             before(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_10_2_0()); 
            match(input,33,FOLLOW_33_in_rule__FunctionDefinition__Group_10_2__0__Impl4898); 
             after(grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_10_2__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_10_2__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2419:1: rule__FunctionDefinition__Group_10_2__1 : rule__FunctionDefinition__Group_10_2__1__Impl ;
    public final void rule__FunctionDefinition__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2423:1: ( rule__FunctionDefinition__Group_10_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2424:2: rule__FunctionDefinition__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_10_2__1__Impl_in_rule__FunctionDefinition__Group_10_2__14929);
            rule__FunctionDefinition__Group_10_2__1__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group_10_2__1"


    // $ANTLR start "rule__FunctionDefinition__Group_10_2__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2430:1: rule__FunctionDefinition__Group_10_2__1__Impl : ( ( rule__FunctionDefinition__UsesAssignment_10_2_1 ) ) ;
    public final void rule__FunctionDefinition__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2434:1: ( ( ( rule__FunctionDefinition__UsesAssignment_10_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2435:1: ( ( rule__FunctionDefinition__UsesAssignment_10_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2435:1: ( ( rule__FunctionDefinition__UsesAssignment_10_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2436:1: ( rule__FunctionDefinition__UsesAssignment_10_2_1 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_10_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2437:1: ( rule__FunctionDefinition__UsesAssignment_10_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2437:2: rule__FunctionDefinition__UsesAssignment_10_2_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__UsesAssignment_10_2_1_in_rule__FunctionDefinition__Group_10_2__1__Impl4956);
            rule__FunctionDefinition__UsesAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getUsesAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__Group_10_2__1__Impl"


    // $ANTLR start "rule__FunctionParameterMember__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2451:1: rule__FunctionParameterMember__Group__0 : rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1 ;
    public final void rule__FunctionParameterMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2455:1: ( rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2456:2: rule__FunctionParameterMember__Group__0__Impl rule__FunctionParameterMember__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__0__Impl_in_rule__FunctionParameterMember__Group__04990);
            rule__FunctionParameterMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__1_in_rule__FunctionParameterMember__Group__04993);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2463:1: rule__FunctionParameterMember__Group__0__Impl : ( ( rule__FunctionParameterMember__TypeAssignment_0 ) ) ;
    public final void rule__FunctionParameterMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2467:1: ( ( ( rule__FunctionParameterMember__TypeAssignment_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2468:1: ( ( rule__FunctionParameterMember__TypeAssignment_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2468:1: ( ( rule__FunctionParameterMember__TypeAssignment_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2469:1: ( rule__FunctionParameterMember__TypeAssignment_0 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getTypeAssignment_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2470:1: ( rule__FunctionParameterMember__TypeAssignment_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2470:2: rule__FunctionParameterMember__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__TypeAssignment_0_in_rule__FunctionParameterMember__Group__0__Impl5020);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2480:1: rule__FunctionParameterMember__Group__1 : rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2 ;
    public final void rule__FunctionParameterMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2484:1: ( rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2485:2: rule__FunctionParameterMember__Group__1__Impl rule__FunctionParameterMember__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__1__Impl_in_rule__FunctionParameterMember__Group__15050);
            rule__FunctionParameterMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__2_in_rule__FunctionParameterMember__Group__15053);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2492:1: rule__FunctionParameterMember__Group__1__Impl : ( ( rule__FunctionParameterMember__NameAssignment_1 ) ) ;
    public final void rule__FunctionParameterMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2496:1: ( ( ( rule__FunctionParameterMember__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2497:1: ( ( rule__FunctionParameterMember__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2497:1: ( ( rule__FunctionParameterMember__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2498:1: ( rule__FunctionParameterMember__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2499:1: ( rule__FunctionParameterMember__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2499:2: rule__FunctionParameterMember__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__NameAssignment_1_in_rule__FunctionParameterMember__Group__1__Impl5080);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2509:1: rule__FunctionParameterMember__Group__2 : rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3 ;
    public final void rule__FunctionParameterMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2513:1: ( rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2514:2: rule__FunctionParameterMember__Group__2__Impl rule__FunctionParameterMember__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__2__Impl_in_rule__FunctionParameterMember__Group__25110);
            rule__FunctionParameterMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__3_in_rule__FunctionParameterMember__Group__25113);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2521:1: rule__FunctionParameterMember__Group__2__Impl : ( ':' ) ;
    public final void rule__FunctionParameterMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2525:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2526:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2526:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2527:1: ':'
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__FunctionParameterMember__Group__2__Impl5141); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2540:1: rule__FunctionParameterMember__Group__3 : rule__FunctionParameterMember__Group__3__Impl ;
    public final void rule__FunctionParameterMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2544:1: ( rule__FunctionParameterMember__Group__3__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2545:2: rule__FunctionParameterMember__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__Group__3__Impl_in_rule__FunctionParameterMember__Group__35172);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2551:1: rule__FunctionParameterMember__Group__3__Impl : ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) ) ;
    public final void rule__FunctionParameterMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2555:1: ( ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2556:1: ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2556:1: ( ( rule__FunctionParameterMember__ScopeAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2557:1: ( rule__FunctionParameterMember__ScopeAssignment_3 )
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getScopeAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2558:1: ( rule__FunctionParameterMember__ScopeAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2558:2: rule__FunctionParameterMember__ScopeAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionParameterMember__ScopeAssignment_3_in_rule__FunctionParameterMember__Group__3__Impl5199);
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


    // $ANTLR start "rule__FunctionUseMember__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2576:1: rule__FunctionUseMember__Group__0 : rule__FunctionUseMember__Group__0__Impl rule__FunctionUseMember__Group__1 ;
    public final void rule__FunctionUseMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2580:1: ( rule__FunctionUseMember__Group__0__Impl rule__FunctionUseMember__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2581:2: rule__FunctionUseMember__Group__0__Impl rule__FunctionUseMember__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__Group__0__Impl_in_rule__FunctionUseMember__Group__05237);
            rule__FunctionUseMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionUseMember__Group__1_in_rule__FunctionUseMember__Group__05240);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2588:1: rule__FunctionUseMember__Group__0__Impl : ( ( rule__FunctionUseMember__TypeAssignment_0 ) ) ;
    public final void rule__FunctionUseMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2592:1: ( ( ( rule__FunctionUseMember__TypeAssignment_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2593:1: ( ( rule__FunctionUseMember__TypeAssignment_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2593:1: ( ( rule__FunctionUseMember__TypeAssignment_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2594:1: ( rule__FunctionUseMember__TypeAssignment_0 )
            {
             before(grammarAccess.getFunctionUseMemberAccess().getTypeAssignment_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2595:1: ( rule__FunctionUseMember__TypeAssignment_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2595:2: rule__FunctionUseMember__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__TypeAssignment_0_in_rule__FunctionUseMember__Group__0__Impl5267);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2605:1: rule__FunctionUseMember__Group__1 : rule__FunctionUseMember__Group__1__Impl ;
    public final void rule__FunctionUseMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2609:1: ( rule__FunctionUseMember__Group__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2610:2: rule__FunctionUseMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__Group__1__Impl_in_rule__FunctionUseMember__Group__15297);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2616:1: rule__FunctionUseMember__Group__1__Impl : ( ( rule__FunctionUseMember__NameAssignment_1 ) ) ;
    public final void rule__FunctionUseMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2620:1: ( ( ( rule__FunctionUseMember__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2621:1: ( ( rule__FunctionUseMember__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2621:1: ( ( rule__FunctionUseMember__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2622:1: ( rule__FunctionUseMember__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionUseMemberAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2623:1: ( rule__FunctionUseMember__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2623:2: rule__FunctionUseMember__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionUseMember__NameAssignment_1_in_rule__FunctionUseMember__Group__1__Impl5324);
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


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2637:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2641:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2642:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__05358);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__05361);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2649:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2653:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2654:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2654:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2655:1: ()
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2656:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2658:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2668:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2672:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2673:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__15419);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__15422);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2680:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__QualifierAssignment_1 )? ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2684:1: ( ( ( rule__VariableDeclaration__QualifierAssignment_1 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2685:1: ( ( rule__VariableDeclaration__QualifierAssignment_1 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2685:1: ( ( rule__VariableDeclaration__QualifierAssignment_1 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2686:1: ( rule__VariableDeclaration__QualifierAssignment_1 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getQualifierAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2687:1: ( rule__VariableDeclaration__QualifierAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2687:2: rule__VariableDeclaration__QualifierAssignment_1
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__QualifierAssignment_1_in_rule__VariableDeclaration__Group__1__Impl5449);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2697:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2701:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2702:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__25480);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__25483);
            rule__VariableDeclaration__Group__3();

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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2709:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__Alternatives_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2713:1: ( ( ( rule__VariableDeclaration__Alternatives_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2714:1: ( ( rule__VariableDeclaration__Alternatives_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2714:1: ( ( rule__VariableDeclaration__Alternatives_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2715:1: ( rule__VariableDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2716:1: ( rule__VariableDeclaration__Alternatives_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2716:2: rule__VariableDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Alternatives_2_in_rule__VariableDeclaration__Group__2__Impl5510);
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


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2726:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2730:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2731:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__35540);
            rule__VariableDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2737:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2741:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2742:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2742:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2743:1: ( rule__VariableDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2744:1: ( rule__VariableDeclaration__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2744:2: rule__VariableDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl5567);
                    rule__VariableDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_2_0__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2762:1: rule__VariableDeclaration__Group_2_0__0 : rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1 ;
    public final void rule__VariableDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2766:1: ( rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2767:2: rule__VariableDeclaration__Group_2_0__0__Impl rule__VariableDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__0__Impl_in_rule__VariableDeclaration__Group_2_0__05606);
            rule__VariableDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__1_in_rule__VariableDeclaration__Group_2_0__05609);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2774:1: rule__VariableDeclaration__Group_2_0__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) ) ;
    public final void rule__VariableDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2778:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2779:1: ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2779:1: ( ( rule__VariableDeclaration__TypeAssignment_2_0_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2780:1: ( rule__VariableDeclaration__TypeAssignment_2_0_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_0_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2781:1: ( rule__VariableDeclaration__TypeAssignment_2_0_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2781:2: rule__VariableDeclaration__TypeAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_2_0_0_in_rule__VariableDeclaration__Group_2_0__0__Impl5636);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2791:1: rule__VariableDeclaration__Group_2_0__1 : rule__VariableDeclaration__Group_2_0__1__Impl ;
    public final void rule__VariableDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2795:1: ( rule__VariableDeclaration__Group_2_0__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2796:2: rule__VariableDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_0__1__Impl_in_rule__VariableDeclaration__Group_2_0__15666);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2802:1: rule__VariableDeclaration__Group_2_0__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) ) ;
    public final void rule__VariableDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2806:1: ( ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2807:1: ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2807:1: ( ( rule__VariableDeclaration__NameAssignment_2_0_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2808:1: ( rule__VariableDeclaration__NameAssignment_2_0_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2_0_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2809:1: ( rule__VariableDeclaration__NameAssignment_2_0_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2809:2: rule__VariableDeclaration__NameAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_0_1_in_rule__VariableDeclaration__Group_2_0__1__Impl5693);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2823:1: rule__VariableDeclaration__Group_2_1__0 : rule__VariableDeclaration__Group_2_1__0__Impl rule__VariableDeclaration__Group_2_1__1 ;
    public final void rule__VariableDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2827:1: ( rule__VariableDeclaration__Group_2_1__0__Impl rule__VariableDeclaration__Group_2_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2828:2: rule__VariableDeclaration__Group_2_1__0__Impl rule__VariableDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__0__Impl_in_rule__VariableDeclaration__Group_2_1__05727);
            rule__VariableDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__1_in_rule__VariableDeclaration__Group_2_1__05730);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2835:1: rule__VariableDeclaration__Group_2_1__0__Impl : ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) ) ;
    public final void rule__VariableDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2839:1: ( ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2840:1: ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2840:1: ( ( rule__VariableDeclaration__CollectionAssignment_2_1_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2841:1: ( rule__VariableDeclaration__CollectionAssignment_2_1_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getCollectionAssignment_2_1_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2842:1: ( rule__VariableDeclaration__CollectionAssignment_2_1_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2842:2: rule__VariableDeclaration__CollectionAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__CollectionAssignment_2_1_0_in_rule__VariableDeclaration__Group_2_1__0__Impl5757);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2852:1: rule__VariableDeclaration__Group_2_1__1 : rule__VariableDeclaration__Group_2_1__1__Impl rule__VariableDeclaration__Group_2_1__2 ;
    public final void rule__VariableDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2856:1: ( rule__VariableDeclaration__Group_2_1__1__Impl rule__VariableDeclaration__Group_2_1__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2857:2: rule__VariableDeclaration__Group_2_1__1__Impl rule__VariableDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__1__Impl_in_rule__VariableDeclaration__Group_2_1__15787);
            rule__VariableDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__2_in_rule__VariableDeclaration__Group_2_1__15790);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2864:1: rule__VariableDeclaration__Group_2_1__1__Impl : ( '<' ) ;
    public final void rule__VariableDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2868:1: ( ( '<' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2869:1: ( '<' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2869:1: ( '<' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2870:1: '<'
            {
             before(grammarAccess.getVariableDeclarationAccess().getLessThanSignKeyword_2_1_1()); 
            match(input,36,FOLLOW_36_in_rule__VariableDeclaration__Group_2_1__1__Impl5818); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2883:1: rule__VariableDeclaration__Group_2_1__2 : rule__VariableDeclaration__Group_2_1__2__Impl rule__VariableDeclaration__Group_2_1__3 ;
    public final void rule__VariableDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2887:1: ( rule__VariableDeclaration__Group_2_1__2__Impl rule__VariableDeclaration__Group_2_1__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2888:2: rule__VariableDeclaration__Group_2_1__2__Impl rule__VariableDeclaration__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__2__Impl_in_rule__VariableDeclaration__Group_2_1__25849);
            rule__VariableDeclaration__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__3_in_rule__VariableDeclaration__Group_2_1__25852);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2895:1: rule__VariableDeclaration__Group_2_1__2__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) ) ;
    public final void rule__VariableDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2899:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2900:1: ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2900:1: ( ( rule__VariableDeclaration__TypeAssignment_2_1_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2901:1: ( rule__VariableDeclaration__TypeAssignment_2_1_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_1_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2902:1: ( rule__VariableDeclaration__TypeAssignment_2_1_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2902:2: rule__VariableDeclaration__TypeAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_2_1_2_in_rule__VariableDeclaration__Group_2_1__2__Impl5879);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2912:1: rule__VariableDeclaration__Group_2_1__3 : rule__VariableDeclaration__Group_2_1__3__Impl rule__VariableDeclaration__Group_2_1__4 ;
    public final void rule__VariableDeclaration__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2916:1: ( rule__VariableDeclaration__Group_2_1__3__Impl rule__VariableDeclaration__Group_2_1__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2917:2: rule__VariableDeclaration__Group_2_1__3__Impl rule__VariableDeclaration__Group_2_1__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__3__Impl_in_rule__VariableDeclaration__Group_2_1__35909);
            rule__VariableDeclaration__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__4_in_rule__VariableDeclaration__Group_2_1__35912);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2924:1: rule__VariableDeclaration__Group_2_1__3__Impl : ( '>' ) ;
    public final void rule__VariableDeclaration__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2928:1: ( ( '>' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2929:1: ( '>' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2929:1: ( '>' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2930:1: '>'
            {
             before(grammarAccess.getVariableDeclarationAccess().getGreaterThanSignKeyword_2_1_3()); 
            match(input,37,FOLLOW_37_in_rule__VariableDeclaration__Group_2_1__3__Impl5940); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2943:1: rule__VariableDeclaration__Group_2_1__4 : rule__VariableDeclaration__Group_2_1__4__Impl ;
    public final void rule__VariableDeclaration__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2947:1: ( rule__VariableDeclaration__Group_2_1__4__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2948:2: rule__VariableDeclaration__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_2_1__4__Impl_in_rule__VariableDeclaration__Group_2_1__45971);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2954:1: rule__VariableDeclaration__Group_2_1__4__Impl : ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) ) ;
    public final void rule__VariableDeclaration__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2958:1: ( ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2959:1: ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2959:1: ( ( rule__VariableDeclaration__NameAssignment_2_1_4 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2960:1: ( rule__VariableDeclaration__NameAssignment_2_1_4 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2_1_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2961:1: ( rule__VariableDeclaration__NameAssignment_2_1_4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2961:2: rule__VariableDeclaration__NameAssignment_2_1_4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_1_4_in_rule__VariableDeclaration__Group_2_1__4__Impl5998);
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


    // $ANTLR start "rule__VariableDeclaration__Group_3__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2981:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2985:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2986:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__06038);
            rule__VariableDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__06041);
            rule__VariableDeclaration__Group_3__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3__0"


    // $ANTLR start "rule__VariableDeclaration__Group_3__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2993:1: rule__VariableDeclaration__Group_3__0__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2997:1: ( ( '=' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2998:1: ( '=' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2998:1: ( '=' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:2999:1: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl6069); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3012:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3016:1: ( rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3017:2: rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__16100);
            rule__VariableDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__16103);
            rule__VariableDeclaration__Group_3__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3__1"


    // $ANTLR start "rule__VariableDeclaration__Group_3__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3024:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__ConstructorAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3028:1: ( ( ( rule__VariableDeclaration__ConstructorAssignment_3_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3029:1: ( ( rule__VariableDeclaration__ConstructorAssignment_3_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3029:1: ( ( rule__VariableDeclaration__ConstructorAssignment_3_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3030:1: ( rule__VariableDeclaration__ConstructorAssignment_3_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getConstructorAssignment_3_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3031:1: ( rule__VariableDeclaration__ConstructorAssignment_3_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3031:2: rule__VariableDeclaration__ConstructorAssignment_3_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__ConstructorAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl6130);
            rule__VariableDeclaration__ConstructorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getConstructorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3041:1: rule__VariableDeclaration__Group_3__2 : rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 ;
    public final void rule__VariableDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3045:1: ( rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3046:2: rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__26160);
            rule__VariableDeclaration__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__26163);
            rule__VariableDeclaration__Group_3__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3__2"


    // $ANTLR start "rule__VariableDeclaration__Group_3__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3053:1: rule__VariableDeclaration__Group_3__2__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3057:1: ( ( '(' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3058:1: ( '(' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3058:1: ( '(' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3059:1: '('
            {
             before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,31,FOLLOW_31_in_rule__VariableDeclaration__Group_3__2__Impl6191); 
             after(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3072:1: rule__VariableDeclaration__Group_3__3 : rule__VariableDeclaration__Group_3__3__Impl rule__VariableDeclaration__Group_3__4 ;
    public final void rule__VariableDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3076:1: ( rule__VariableDeclaration__Group_3__3__Impl rule__VariableDeclaration__Group_3__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3077:2: rule__VariableDeclaration__Group_3__3__Impl rule__VariableDeclaration__Group_3__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__36222);
            rule__VariableDeclaration__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__4_in_rule__VariableDeclaration__Group_3__36225);
            rule__VariableDeclaration__Group_3__4();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3__3"


    // $ANTLR start "rule__VariableDeclaration__Group_3__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3084:1: rule__VariableDeclaration__Group_3__3__Impl : ( ( rule__VariableDeclaration__Group_3_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3088:1: ( ( ( rule__VariableDeclaration__Group_3_3__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3089:1: ( ( rule__VariableDeclaration__Group_3_3__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3089:1: ( ( rule__VariableDeclaration__Group_3_3__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3090:1: ( rule__VariableDeclaration__Group_3_3__0 )?
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_3_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3091:1: ( rule__VariableDeclaration__Group_3_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||(LA29_0>=19 && LA29_0<=20)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3091:2: rule__VariableDeclaration__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3__0_in_rule__VariableDeclaration__Group_3__3__Impl6252);
                    rule__VariableDeclaration__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3101:1: rule__VariableDeclaration__Group_3__4 : rule__VariableDeclaration__Group_3__4__Impl ;
    public final void rule__VariableDeclaration__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3105:1: ( rule__VariableDeclaration__Group_3__4__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3106:2: rule__VariableDeclaration__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__4__Impl_in_rule__VariableDeclaration__Group_3__46283);
            rule__VariableDeclaration__Group_3__4__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3__4"


    // $ANTLR start "rule__VariableDeclaration__Group_3__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3112:1: rule__VariableDeclaration__Group_3__4__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3116:1: ( ( ')' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3117:1: ( ')' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3117:1: ( ')' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3118:1: ')'
            {
             before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_4()); 
            match(input,32,FOLLOW_32_in_rule__VariableDeclaration__Group_3__4__Impl6311); 
             after(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__4__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3141:1: rule__VariableDeclaration__Group_3_3__0 : rule__VariableDeclaration__Group_3_3__0__Impl rule__VariableDeclaration__Group_3_3__1 ;
    public final void rule__VariableDeclaration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3145:1: ( rule__VariableDeclaration__Group_3_3__0__Impl rule__VariableDeclaration__Group_3_3__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3146:2: rule__VariableDeclaration__Group_3_3__0__Impl rule__VariableDeclaration__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3__0__Impl_in_rule__VariableDeclaration__Group_3_3__06352);
            rule__VariableDeclaration__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3__1_in_rule__VariableDeclaration__Group_3_3__06355);
            rule__VariableDeclaration__Group_3_3__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3_3__0"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3153:1: rule__VariableDeclaration__Group_3_3__0__Impl : ( ( rule__VariableDeclaration__ParametersAssignment_3_3_0 ) ) ;
    public final void rule__VariableDeclaration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3157:1: ( ( ( rule__VariableDeclaration__ParametersAssignment_3_3_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3158:1: ( ( rule__VariableDeclaration__ParametersAssignment_3_3_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3158:1: ( ( rule__VariableDeclaration__ParametersAssignment_3_3_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3159:1: ( rule__VariableDeclaration__ParametersAssignment_3_3_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getParametersAssignment_3_3_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3160:1: ( rule__VariableDeclaration__ParametersAssignment_3_3_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3160:2: rule__VariableDeclaration__ParametersAssignment_3_3_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__ParametersAssignment_3_3_0_in_rule__VariableDeclaration__Group_3_3__0__Impl6382);
            rule__VariableDeclaration__ParametersAssignment_3_3_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getParametersAssignment_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_3__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3170:1: rule__VariableDeclaration__Group_3_3__1 : rule__VariableDeclaration__Group_3_3__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3174:1: ( rule__VariableDeclaration__Group_3_3__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3175:2: rule__VariableDeclaration__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3__1__Impl_in_rule__VariableDeclaration__Group_3_3__16412);
            rule__VariableDeclaration__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3_3__1"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3181:1: rule__VariableDeclaration__Group_3_3__1__Impl : ( ( rule__VariableDeclaration__Group_3_3_1__0 )* ) ;
    public final void rule__VariableDeclaration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3185:1: ( ( ( rule__VariableDeclaration__Group_3_3_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3186:1: ( ( rule__VariableDeclaration__Group_3_3_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3186:1: ( ( rule__VariableDeclaration__Group_3_3_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3187:1: ( rule__VariableDeclaration__Group_3_3_1__0 )*
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup_3_3_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3188:1: ( rule__VariableDeclaration__Group_3_3_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3188:2: rule__VariableDeclaration__Group_3_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3_1__0_in_rule__VariableDeclaration__Group_3_3__1__Impl6439);
            	    rule__VariableDeclaration__Group_3_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getVariableDeclarationAccess().getGroup_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_3__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3202:1: rule__VariableDeclaration__Group_3_3_1__0 : rule__VariableDeclaration__Group_3_3_1__0__Impl rule__VariableDeclaration__Group_3_3_1__1 ;
    public final void rule__VariableDeclaration__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3206:1: ( rule__VariableDeclaration__Group_3_3_1__0__Impl rule__VariableDeclaration__Group_3_3_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3207:2: rule__VariableDeclaration__Group_3_3_1__0__Impl rule__VariableDeclaration__Group_3_3_1__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3_1__0__Impl_in_rule__VariableDeclaration__Group_3_3_1__06474);
            rule__VariableDeclaration__Group_3_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3_1__1_in_rule__VariableDeclaration__Group_3_3_1__06477);
            rule__VariableDeclaration__Group_3_3_1__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3_3_1__0"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3214:1: rule__VariableDeclaration__Group_3_3_1__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3218:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3219:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3219:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3220:1: ','
            {
             before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_3_1_0()); 
            match(input,33,FOLLOW_33_in_rule__VariableDeclaration__Group_3_3_1__0__Impl6505); 
             after(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_3_1__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3233:1: rule__VariableDeclaration__Group_3_3_1__1 : rule__VariableDeclaration__Group_3_3_1__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3237:1: ( rule__VariableDeclaration__Group_3_3_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3238:2: rule__VariableDeclaration__Group_3_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_3_1__1__Impl_in_rule__VariableDeclaration__Group_3_3_1__16536);
            rule__VariableDeclaration__Group_3_3_1__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group_3_3_1__1"


    // $ANTLR start "rule__VariableDeclaration__Group_3_3_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3244:1: rule__VariableDeclaration__Group_3_3_1__1__Impl : ( ( rule__VariableDeclaration__ParametersAssignment_3_3_1_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3248:1: ( ( ( rule__VariableDeclaration__ParametersAssignment_3_3_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3249:1: ( ( rule__VariableDeclaration__ParametersAssignment_3_3_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3249:1: ( ( rule__VariableDeclaration__ParametersAssignment_3_3_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3250:1: ( rule__VariableDeclaration__ParametersAssignment_3_3_1_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getParametersAssignment_3_3_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3251:1: ( rule__VariableDeclaration__ParametersAssignment_3_3_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3251:2: rule__VariableDeclaration__ParametersAssignment_3_3_1_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__ParametersAssignment_3_3_1_1_in_rule__VariableDeclaration__Group_3_3_1__1__Impl6563);
            rule__VariableDeclaration__ParametersAssignment_3_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getParametersAssignment_3_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_3_1__1__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3265:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3269:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3270:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__06597);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__06600);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3277:1: rule__VariableAssignment__Group__0__Impl : ( () ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3281:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3282:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3282:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3283:1: ()
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3284:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3286:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3296:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3300:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3301:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__16658);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__16661);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3308:1: rule__VariableAssignment__Group__1__Impl : ( ( rule__VariableAssignment__VariableAssignment_1 ) ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3312:1: ( ( ( rule__VariableAssignment__VariableAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3313:1: ( ( rule__VariableAssignment__VariableAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3313:1: ( ( rule__VariableAssignment__VariableAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3314:1: ( rule__VariableAssignment__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3315:1: ( rule__VariableAssignment__VariableAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3315:2: rule__VariableAssignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__VariableAssignment_1_in_rule__VariableAssignment__Group__1__Impl6688);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3325:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3 ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3329:1: ( rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3330:2: rule__VariableAssignment__Group__2__Impl rule__VariableAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__26718);
            rule__VariableAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__3_in_rule__VariableAssignment__Group__26721);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3337:1: rule__VariableAssignment__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3341:1: ( ( '=' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3342:1: ( '=' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3342:1: ( '=' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3343:1: '='
            {
             before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__VariableAssignment__Group__2__Impl6749); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3356:1: rule__VariableAssignment__Group__3 : rule__VariableAssignment__Group__3__Impl ;
    public final void rule__VariableAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3360:1: ( rule__VariableAssignment__Group__3__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3361:2: rule__VariableAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__3__Impl_in_rule__VariableAssignment__Group__36780);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3367:1: rule__VariableAssignment__Group__3__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3371:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3372:1: ( ( rule__VariableAssignment__ExpressionAssignment_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3372:1: ( ( rule__VariableAssignment__ExpressionAssignment_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3373:1: ( rule__VariableAssignment__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3374:1: ( rule__VariableAssignment__ExpressionAssignment_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3374:2: rule__VariableAssignment__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableAssignment__ExpressionAssignment_3_in_rule__VariableAssignment__Group__3__Impl6807);
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


    // $ANTLR start "rule__VariableAttribute__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3392:1: rule__VariableAttribute__Group__0 : rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 ;
    public final void rule__VariableAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3396:1: ( rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3397:2: rule__VariableAttribute__Group__0__Impl rule__VariableAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__0__Impl_in_rule__VariableAttribute__Group__06845);
            rule__VariableAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group__1_in_rule__VariableAttribute__Group__06848);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3404:1: rule__VariableAttribute__Group__0__Impl : ( () ) ;
    public final void rule__VariableAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3408:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3409:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3409:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3410:1: ()
            {
             before(grammarAccess.getVariableAttributeAccess().getVariableAttributeAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3411:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3413:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3423:1: rule__VariableAttribute__Group__1 : rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 ;
    public final void rule__VariableAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3427:1: ( rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3428:2: rule__VariableAttribute__Group__1__Impl rule__VariableAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__1__Impl_in_rule__VariableAttribute__Group__16906);
            rule__VariableAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group__2_in_rule__VariableAttribute__Group__16909);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3435:1: rule__VariableAttribute__Group__1__Impl : ( ( rule__VariableAttribute__NameAssignment_1 ) ) ;
    public final void rule__VariableAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3439:1: ( ( ( rule__VariableAttribute__NameAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3440:1: ( ( rule__VariableAttribute__NameAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3440:1: ( ( rule__VariableAttribute__NameAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3441:1: ( rule__VariableAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAttributeAccess().getNameAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3442:1: ( rule__VariableAttribute__NameAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3442:2: rule__VariableAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__NameAssignment_1_in_rule__VariableAttribute__Group__1__Impl6936);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3452:1: rule__VariableAttribute__Group__2 : rule__VariableAttribute__Group__2__Impl ;
    public final void rule__VariableAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3456:1: ( rule__VariableAttribute__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3457:2: rule__VariableAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group__2__Impl_in_rule__VariableAttribute__Group__26966);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3463:1: rule__VariableAttribute__Group__2__Impl : ( ( rule__VariableAttribute__Group_2__0 )? ) ;
    public final void rule__VariableAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3467:1: ( ( ( rule__VariableAttribute__Group_2__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3468:1: ( ( rule__VariableAttribute__Group_2__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3468:1: ( ( rule__VariableAttribute__Group_2__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3469:1: ( rule__VariableAttribute__Group_2__0 )?
            {
             before(grammarAccess.getVariableAttributeAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3470:1: ( rule__VariableAttribute__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=17 && LA31_0<=18)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3470:2: rule__VariableAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VariableAttribute__Group_2__0_in_rule__VariableAttribute__Group__2__Impl6993);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3486:1: rule__VariableAttribute__Group_2__0 : rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1 ;
    public final void rule__VariableAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3490:1: ( rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3491:2: rule__VariableAttribute__Group_2__0__Impl rule__VariableAttribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__0__Impl_in_rule__VariableAttribute__Group_2__07030);
            rule__VariableAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__1_in_rule__VariableAttribute__Group_2__07033);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3498:1: rule__VariableAttribute__Group_2__0__Impl : ( ( rule__VariableAttribute__Alternatives_2_0 ) ) ;
    public final void rule__VariableAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3502:1: ( ( ( rule__VariableAttribute__Alternatives_2_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3503:1: ( ( rule__VariableAttribute__Alternatives_2_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3503:1: ( ( rule__VariableAttribute__Alternatives_2_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3504:1: ( rule__VariableAttribute__Alternatives_2_0 )
            {
             before(grammarAccess.getVariableAttributeAccess().getAlternatives_2_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3505:1: ( rule__VariableAttribute__Alternatives_2_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3505:2: rule__VariableAttribute__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Alternatives_2_0_in_rule__VariableAttribute__Group_2__0__Impl7060);
            rule__VariableAttribute__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getAlternatives_2_0()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3515:1: rule__VariableAttribute__Group_2__1 : rule__VariableAttribute__Group_2__1__Impl ;
    public final void rule__VariableAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3519:1: ( rule__VariableAttribute__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3520:2: rule__VariableAttribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableAttribute__Group_2__1__Impl_in_rule__VariableAttribute__Group_2__17090);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3526:1: rule__VariableAttribute__Group_2__1__Impl : ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) ) ;
    public final void rule__VariableAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3530:1: ( ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3531:1: ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3531:1: ( ( rule__VariableAttribute__AttributeAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3532:1: ( rule__VariableAttribute__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getVariableAttributeAccess().getAttributeAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3533:1: ( rule__VariableAttribute__AttributeAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3533:2: rule__VariableAttribute__AttributeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariableAttribute__AttributeAssignment_2_1_in_rule__VariableAttribute__Group_2__1__Impl7117);
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


    // $ANTLR start "rule__VariableExpression__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3547:1: rule__VariableExpression__Group__0 : rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1 ;
    public final void rule__VariableExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3551:1: ( rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3552:2: rule__VariableExpression__Group__0__Impl rule__VariableExpression__Group__1
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__0__Impl_in_rule__VariableExpression__Group__07151);
            rule__VariableExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group__1_in_rule__VariableExpression__Group__07154);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3559:1: rule__VariableExpression__Group__0__Impl : ( () ) ;
    public final void rule__VariableExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3563:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3564:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3564:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3565:1: ()
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableExpressionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3566:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3568:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3578:1: rule__VariableExpression__Group__1 : rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2 ;
    public final void rule__VariableExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3582:1: ( rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3583:2: rule__VariableExpression__Group__1__Impl rule__VariableExpression__Group__2
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__1__Impl_in_rule__VariableExpression__Group__17212);
            rule__VariableExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group__2_in_rule__VariableExpression__Group__17215);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3590:1: rule__VariableExpression__Group__1__Impl : ( ( rule__VariableExpression__MembersAssignment_1 ) ) ;
    public final void rule__VariableExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3594:1: ( ( ( rule__VariableExpression__MembersAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3595:1: ( ( rule__VariableExpression__MembersAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3595:1: ( ( rule__VariableExpression__MembersAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3596:1: ( rule__VariableExpression__MembersAssignment_1 )
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3597:1: ( rule__VariableExpression__MembersAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3597:2: rule__VariableExpression__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableExpression__MembersAssignment_1_in_rule__VariableExpression__Group__1__Impl7242);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3607:1: rule__VariableExpression__Group__2 : rule__VariableExpression__Group__2__Impl ;
    public final void rule__VariableExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3611:1: ( rule__VariableExpression__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3612:2: rule__VariableExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group__2__Impl_in_rule__VariableExpression__Group__27272);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3618:1: rule__VariableExpression__Group__2__Impl : ( ( rule__VariableExpression__Group_2__0 )* ) ;
    public final void rule__VariableExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3622:1: ( ( ( rule__VariableExpression__Group_2__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3623:1: ( ( rule__VariableExpression__Group_2__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3623:1: ( ( rule__VariableExpression__Group_2__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3624:1: ( rule__VariableExpression__Group_2__0 )*
            {
             before(grammarAccess.getVariableExpressionAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3625:1: ( rule__VariableExpression__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3625:2: rule__VariableExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableExpression__Group_2__0_in_rule__VariableExpression__Group__2__Impl7299);
            	    rule__VariableExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3641:1: rule__VariableExpression__Group_2__0 : rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1 ;
    public final void rule__VariableExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3645:1: ( rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3646:2: rule__VariableExpression__Group_2__0__Impl rule__VariableExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group_2__0__Impl_in_rule__VariableExpression__Group_2__07336);
            rule__VariableExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableExpression__Group_2__1_in_rule__VariableExpression__Group_2__07339);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3653:1: rule__VariableExpression__Group_2__0__Impl : ( ruleVariableExpressionOperator ) ;
    public final void rule__VariableExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3657:1: ( ( ruleVariableExpressionOperator ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3658:1: ( ruleVariableExpressionOperator )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3658:1: ( ruleVariableExpressionOperator )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3659:1: ruleVariableExpressionOperator
            {
             before(grammarAccess.getVariableExpressionAccess().getVariableExpressionOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableExpressionOperator_in_rule__VariableExpression__Group_2__0__Impl7366);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3670:1: rule__VariableExpression__Group_2__1 : rule__VariableExpression__Group_2__1__Impl ;
    public final void rule__VariableExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3674:1: ( rule__VariableExpression__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3675:2: rule__VariableExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableExpression__Group_2__1__Impl_in_rule__VariableExpression__Group_2__17395);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3681:1: rule__VariableExpression__Group_2__1__Impl : ( ( rule__VariableExpression__MembersAssignment_2_1 ) ) ;
    public final void rule__VariableExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3685:1: ( ( ( rule__VariableExpression__MembersAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3686:1: ( ( rule__VariableExpression__MembersAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3686:1: ( ( rule__VariableExpression__MembersAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3687:1: ( rule__VariableExpression__MembersAssignment_2_1 )
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3688:1: ( rule__VariableExpression__MembersAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3688:2: rule__VariableExpression__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariableExpression__MembersAssignment_2_1_in_rule__VariableExpression__Group_2__1__Impl7422);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3702:1: rule__RuleDefinition__Group__0 : rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1 ;
    public final void rule__RuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3706:1: ( rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3707:2: rule__RuleDefinition__Group__0__Impl rule__RuleDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__0__Impl_in_rule__RuleDefinition__Group__07456);
            rule__RuleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__1_in_rule__RuleDefinition__Group__07459);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3714:1: rule__RuleDefinition__Group__0__Impl : ( () ) ;
    public final void rule__RuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3718:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3719:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3719:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3720:1: ()
            {
             before(grammarAccess.getRuleDefinitionAccess().getRuleDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3721:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3723:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3733:1: rule__RuleDefinition__Group__1 : rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2 ;
    public final void rule__RuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3737:1: ( rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3738:2: rule__RuleDefinition__Group__1__Impl rule__RuleDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__1__Impl_in_rule__RuleDefinition__Group__17517);
            rule__RuleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__2_in_rule__RuleDefinition__Group__17520);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3745:1: rule__RuleDefinition__Group__1__Impl : ( 'RULE' ) ;
    public final void rule__RuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3749:1: ( ( 'RULE' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3750:1: ( 'RULE' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3750:1: ( 'RULE' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3751:1: 'RULE'
            {
             before(grammarAccess.getRuleDefinitionAccess().getRULEKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__RuleDefinition__Group__1__Impl7548); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3764:1: rule__RuleDefinition__Group__2 : rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3 ;
    public final void rule__RuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3768:1: ( rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3769:2: rule__RuleDefinition__Group__2__Impl rule__RuleDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__2__Impl_in_rule__RuleDefinition__Group__27579);
            rule__RuleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__3_in_rule__RuleDefinition__Group__27582);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3776:1: rule__RuleDefinition__Group__2__Impl : ( ( rule__RuleDefinition__NameAssignment_2 ) ) ;
    public final void rule__RuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3780:1: ( ( ( rule__RuleDefinition__NameAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3781:1: ( ( rule__RuleDefinition__NameAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3781:1: ( ( rule__RuleDefinition__NameAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3782:1: ( rule__RuleDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getNameAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3783:1: ( rule__RuleDefinition__NameAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3783:2: rule__RuleDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RuleDefinition__NameAssignment_2_in_rule__RuleDefinition__Group__2__Impl7609);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3793:1: rule__RuleDefinition__Group__3 : rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4 ;
    public final void rule__RuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3797:1: ( rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3798:2: rule__RuleDefinition__Group__3__Impl rule__RuleDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__3__Impl_in_rule__RuleDefinition__Group__37639);
            rule__RuleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__4_in_rule__RuleDefinition__Group__37642);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3805:1: rule__RuleDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__RuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3809:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3810:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3810:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3811:1: ':'
            {
             before(grammarAccess.getRuleDefinitionAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__RuleDefinition__Group__3__Impl7670); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3824:1: rule__RuleDefinition__Group__4 : rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5 ;
    public final void rule__RuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3828:1: ( rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3829:2: rule__RuleDefinition__Group__4__Impl rule__RuleDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__4__Impl_in_rule__RuleDefinition__Group__47701);
            rule__RuleDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__5_in_rule__RuleDefinition__Group__47704);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3836:1: rule__RuleDefinition__Group__4__Impl : ( ( rule__RuleDefinition__Group_4__0 )? ) ;
    public final void rule__RuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3840:1: ( ( ( rule__RuleDefinition__Group_4__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3841:1: ( ( rule__RuleDefinition__Group_4__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3841:1: ( ( rule__RuleDefinition__Group_4__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3842:1: ( rule__RuleDefinition__Group_4__0 )?
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3843:1: ( rule__RuleDefinition__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3843:2: rule__RuleDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RuleDefinition__Group_4__0_in_rule__RuleDefinition__Group__4__Impl7731);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3853:1: rule__RuleDefinition__Group__5 : rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6 ;
    public final void rule__RuleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3857:1: ( rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3858:2: rule__RuleDefinition__Group__5__Impl rule__RuleDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__5__Impl_in_rule__RuleDefinition__Group__57762);
            rule__RuleDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group__6_in_rule__RuleDefinition__Group__57765);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3865:1: rule__RuleDefinition__Group__5__Impl : ( ( rule__RuleDefinition__Alternatives_5 ) ) ;
    public final void rule__RuleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3869:1: ( ( ( rule__RuleDefinition__Alternatives_5 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3870:1: ( ( rule__RuleDefinition__Alternatives_5 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3870:1: ( ( rule__RuleDefinition__Alternatives_5 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3871:1: ( rule__RuleDefinition__Alternatives_5 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getAlternatives_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3872:1: ( rule__RuleDefinition__Alternatives_5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3872:2: rule__RuleDefinition__Alternatives_5
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Alternatives_5_in_rule__RuleDefinition__Group__5__Impl7792);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3882:1: rule__RuleDefinition__Group__6 : rule__RuleDefinition__Group__6__Impl ;
    public final void rule__RuleDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3886:1: ( rule__RuleDefinition__Group__6__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3887:2: rule__RuleDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group__6__Impl_in_rule__RuleDefinition__Group__67822);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3893:1: rule__RuleDefinition__Group__6__Impl : ( ( rule__RuleDefinition__Group_6__0 )? ) ;
    public final void rule__RuleDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3897:1: ( ( ( rule__RuleDefinition__Group_6__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3898:1: ( ( rule__RuleDefinition__Group_6__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3898:1: ( ( rule__RuleDefinition__Group_6__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3899:1: ( rule__RuleDefinition__Group_6__0 )?
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_6()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3900:1: ( rule__RuleDefinition__Group_6__0 )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3900:2: rule__RuleDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RuleDefinition__Group_6__0_in_rule__RuleDefinition__Group__6__Impl7849);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3924:1: rule__RuleDefinition__Group_4__0 : rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1 ;
    public final void rule__RuleDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3928:1: ( rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3929:2: rule__RuleDefinition__Group_4__0__Impl rule__RuleDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__0__Impl_in_rule__RuleDefinition__Group_4__07894);
            rule__RuleDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__1_in_rule__RuleDefinition__Group_4__07897);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3936:1: rule__RuleDefinition__Group_4__0__Impl : ( ( rule__RuleDefinition__LhsAssignment_4_0 ) ) ;
    public final void rule__RuleDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3940:1: ( ( ( rule__RuleDefinition__LhsAssignment_4_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3941:1: ( ( rule__RuleDefinition__LhsAssignment_4_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3941:1: ( ( rule__RuleDefinition__LhsAssignment_4_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3942:1: ( rule__RuleDefinition__LhsAssignment_4_0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3943:1: ( rule__RuleDefinition__LhsAssignment_4_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3943:2: rule__RuleDefinition__LhsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__LhsAssignment_4_0_in_rule__RuleDefinition__Group_4__0__Impl7924);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3953:1: rule__RuleDefinition__Group_4__1 : rule__RuleDefinition__Group_4__1__Impl ;
    public final void rule__RuleDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3957:1: ( rule__RuleDefinition__Group_4__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3958:2: rule__RuleDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4__1__Impl_in_rule__RuleDefinition__Group_4__17954);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3964:1: rule__RuleDefinition__Group_4__1__Impl : ( ( rule__RuleDefinition__Group_4_1__0 )* ) ;
    public final void rule__RuleDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3968:1: ( ( ( rule__RuleDefinition__Group_4_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3969:1: ( ( rule__RuleDefinition__Group_4_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3969:1: ( ( rule__RuleDefinition__Group_4_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3970:1: ( rule__RuleDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_4_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3971:1: ( rule__RuleDefinition__Group_4_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3971:2: rule__RuleDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__0_in_rule__RuleDefinition__Group_4__1__Impl7981);
            	    rule__RuleDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3985:1: rule__RuleDefinition__Group_4_1__0 : rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1 ;
    public final void rule__RuleDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3989:1: ( rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3990:2: rule__RuleDefinition__Group_4_1__0__Impl rule__RuleDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__0__Impl_in_rule__RuleDefinition__Group_4_1__08016);
            rule__RuleDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__1_in_rule__RuleDefinition__Group_4_1__08019);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:3997:1: rule__RuleDefinition__Group_4_1__0__Impl : ( '+' ) ;
    public final void rule__RuleDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4001:1: ( ( '+' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4002:1: ( '+' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4002:1: ( '+' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4003:1: '+'
            {
             before(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_4_1_0()); 
            match(input,19,FOLLOW_19_in_rule__RuleDefinition__Group_4_1__0__Impl8047); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4016:1: rule__RuleDefinition__Group_4_1__1 : rule__RuleDefinition__Group_4_1__1__Impl ;
    public final void rule__RuleDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4020:1: ( rule__RuleDefinition__Group_4_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4021:2: rule__RuleDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_4_1__1__Impl_in_rule__RuleDefinition__Group_4_1__18078);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4027:1: rule__RuleDefinition__Group_4_1__1__Impl : ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) ) ;
    public final void rule__RuleDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4031:1: ( ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4032:1: ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4032:1: ( ( rule__RuleDefinition__LhsAssignment_4_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4033:1: ( rule__RuleDefinition__LhsAssignment_4_1_1 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsAssignment_4_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4034:1: ( rule__RuleDefinition__LhsAssignment_4_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4034:2: rule__RuleDefinition__LhsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__LhsAssignment_4_1_1_in_rule__RuleDefinition__Group_4_1__1__Impl8105);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4048:1: rule__RuleDefinition__Group_6__0 : rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1 ;
    public final void rule__RuleDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4052:1: ( rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4053:2: rule__RuleDefinition__Group_6__0__Impl rule__RuleDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__0__Impl_in_rule__RuleDefinition__Group_6__08139);
            rule__RuleDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__1_in_rule__RuleDefinition__Group_6__08142);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4060:1: rule__RuleDefinition__Group_6__0__Impl : ( ( rule__RuleDefinition__RhsAssignment_6_0 ) ) ;
    public final void rule__RuleDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4064:1: ( ( ( rule__RuleDefinition__RhsAssignment_6_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4065:1: ( ( rule__RuleDefinition__RhsAssignment_6_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4065:1: ( ( rule__RuleDefinition__RhsAssignment_6_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4066:1: ( rule__RuleDefinition__RhsAssignment_6_0 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4067:1: ( rule__RuleDefinition__RhsAssignment_6_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4067:2: rule__RuleDefinition__RhsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__RuleDefinition__RhsAssignment_6_0_in_rule__RuleDefinition__Group_6__0__Impl8169);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4077:1: rule__RuleDefinition__Group_6__1 : rule__RuleDefinition__Group_6__1__Impl ;
    public final void rule__RuleDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4081:1: ( rule__RuleDefinition__Group_6__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4082:2: rule__RuleDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6__1__Impl_in_rule__RuleDefinition__Group_6__18199);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4088:1: rule__RuleDefinition__Group_6__1__Impl : ( ( rule__RuleDefinition__Group_6_1__0 )* ) ;
    public final void rule__RuleDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4092:1: ( ( ( rule__RuleDefinition__Group_6_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4093:1: ( ( rule__RuleDefinition__Group_6_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4093:1: ( ( rule__RuleDefinition__Group_6_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4094:1: ( rule__RuleDefinition__Group_6_1__0 )*
            {
             before(grammarAccess.getRuleDefinitionAccess().getGroup_6_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4095:1: ( rule__RuleDefinition__Group_6_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==19) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_ID) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4095:2: rule__RuleDefinition__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__0_in_rule__RuleDefinition__Group_6__1__Impl8226);
            	    rule__RuleDefinition__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4109:1: rule__RuleDefinition__Group_6_1__0 : rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1 ;
    public final void rule__RuleDefinition__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4113:1: ( rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4114:2: rule__RuleDefinition__Group_6_1__0__Impl rule__RuleDefinition__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__0__Impl_in_rule__RuleDefinition__Group_6_1__08261);
            rule__RuleDefinition__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__1_in_rule__RuleDefinition__Group_6_1__08264);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4121:1: rule__RuleDefinition__Group_6_1__0__Impl : ( '+' ) ;
    public final void rule__RuleDefinition__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4125:1: ( ( '+' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4126:1: ( '+' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4126:1: ( '+' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4127:1: '+'
            {
             before(grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_6_1_0()); 
            match(input,19,FOLLOW_19_in_rule__RuleDefinition__Group_6_1__0__Impl8292); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4140:1: rule__RuleDefinition__Group_6_1__1 : rule__RuleDefinition__Group_6_1__1__Impl ;
    public final void rule__RuleDefinition__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4144:1: ( rule__RuleDefinition__Group_6_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4145:2: rule__RuleDefinition__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDefinition__Group_6_1__1__Impl_in_rule__RuleDefinition__Group_6_1__18323);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4151:1: rule__RuleDefinition__Group_6_1__1__Impl : ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) ) ;
    public final void rule__RuleDefinition__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4155:1: ( ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4156:1: ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4156:1: ( ( rule__RuleDefinition__RhsAssignment_6_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4157:1: ( rule__RuleDefinition__RhsAssignment_6_1_1 )
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsAssignment_6_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4158:1: ( rule__RuleDefinition__RhsAssignment_6_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4158:2: rule__RuleDefinition__RhsAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__RuleDefinition__RhsAssignment_6_1_1_in_rule__RuleDefinition__Group_6_1__1__Impl8350);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4172:1: rule__RuleObject__Group__0 : rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1 ;
    public final void rule__RuleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4176:1: ( rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4177:2: rule__RuleObject__Group__0__Impl rule__RuleObject__Group__1
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__0__Impl_in_rule__RuleObject__Group__08384);
            rule__RuleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group__1_in_rule__RuleObject__Group__08387);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4184:1: rule__RuleObject__Group__0__Impl : ( () ) ;
    public final void rule__RuleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4188:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4189:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4189:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4190:1: ()
            {
             before(grammarAccess.getRuleObjectAccess().getRuleObjectAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4191:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4193:1: 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4203:1: rule__RuleObject__Group__1 : rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2 ;
    public final void rule__RuleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4207:1: ( rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4208:2: rule__RuleObject__Group__1__Impl rule__RuleObject__Group__2
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__1__Impl_in_rule__RuleObject__Group__18445);
            rule__RuleObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group__2_in_rule__RuleObject__Group__18448);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4215:1: rule__RuleObject__Group__1__Impl : ( ( rule__RuleObject__SubobjectsAssignment_1 ) ) ;
    public final void rule__RuleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4219:1: ( ( ( rule__RuleObject__SubobjectsAssignment_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4220:1: ( ( rule__RuleObject__SubobjectsAssignment_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4220:1: ( ( rule__RuleObject__SubobjectsAssignment_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4221:1: ( rule__RuleObject__SubobjectsAssignment_1 )
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4222:1: ( rule__RuleObject__SubobjectsAssignment_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4222:2: rule__RuleObject__SubobjectsAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleObject__SubobjectsAssignment_1_in_rule__RuleObject__Group__1__Impl8475);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4232:1: rule__RuleObject__Group__2 : rule__RuleObject__Group__2__Impl ;
    public final void rule__RuleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4236:1: ( rule__RuleObject__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4237:2: rule__RuleObject__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RuleObject__Group__2__Impl_in_rule__RuleObject__Group__28505);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4243:1: rule__RuleObject__Group__2__Impl : ( ( rule__RuleObject__Group_2__0 )* ) ;
    public final void rule__RuleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4247:1: ( ( ( rule__RuleObject__Group_2__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4248:1: ( ( rule__RuleObject__Group_2__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4248:1: ( ( rule__RuleObject__Group_2__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4249:1: ( rule__RuleObject__Group_2__0 )*
            {
             before(grammarAccess.getRuleObjectAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4250:1: ( rule__RuleObject__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4250:2: rule__RuleObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleObject__Group_2__0_in_rule__RuleObject__Group__2__Impl8532);
            	    rule__RuleObject__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4266:1: rule__RuleObject__Group_2__0 : rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1 ;
    public final void rule__RuleObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4270:1: ( rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4271:2: rule__RuleObject__Group_2__0__Impl rule__RuleObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__RuleObject__Group_2__0__Impl_in_rule__RuleObject__Group_2__08569);
            rule__RuleObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleObject__Group_2__1_in_rule__RuleObject__Group_2__08572);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4278:1: rule__RuleObject__Group_2__0__Impl : ( '~' ) ;
    public final void rule__RuleObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4282:1: ( ( '~' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4283:1: ( '~' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4283:1: ( '~' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4284:1: '~'
            {
             before(grammarAccess.getRuleObjectAccess().getTildeKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__RuleObject__Group_2__0__Impl8600); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4297:1: rule__RuleObject__Group_2__1 : rule__RuleObject__Group_2__1__Impl ;
    public final void rule__RuleObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4301:1: ( rule__RuleObject__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4302:2: rule__RuleObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleObject__Group_2__1__Impl_in_rule__RuleObject__Group_2__18631);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4308:1: rule__RuleObject__Group_2__1__Impl : ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) ) ;
    public final void rule__RuleObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4312:1: ( ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4313:1: ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4313:1: ( ( rule__RuleObject__SubobjectsAssignment_2_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4314:1: ( rule__RuleObject__SubobjectsAssignment_2_1 )
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsAssignment_2_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4315:1: ( rule__RuleObject__SubobjectsAssignment_2_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4315:2: rule__RuleObject__SubobjectsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RuleObject__SubobjectsAssignment_2_1_in_rule__RuleObject__Group_2__1__Impl8658);
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


    // $ANTLR start "rule__DeviceDefinition__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4329:1: rule__DeviceDefinition__Group__0 : rule__DeviceDefinition__Group__0__Impl rule__DeviceDefinition__Group__1 ;
    public final void rule__DeviceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4333:1: ( rule__DeviceDefinition__Group__0__Impl rule__DeviceDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4334:2: rule__DeviceDefinition__Group__0__Impl rule__DeviceDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__0__Impl_in_rule__DeviceDefinition__Group__08692);
            rule__DeviceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__1_in_rule__DeviceDefinition__Group__08695);
            rule__DeviceDefinition__Group__1();

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
    // $ANTLR end "rule__DeviceDefinition__Group__0"


    // $ANTLR start "rule__DeviceDefinition__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4341:1: rule__DeviceDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DeviceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4345:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4346:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4346:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4347:1: ()
            {
             before(grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4348:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4350:1: 
            {
            }

             after(grammarAccess.getDeviceDefinitionAccess().getDeviceDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__0__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4360:1: rule__DeviceDefinition__Group__1 : rule__DeviceDefinition__Group__1__Impl rule__DeviceDefinition__Group__2 ;
    public final void rule__DeviceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4364:1: ( rule__DeviceDefinition__Group__1__Impl rule__DeviceDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4365:2: rule__DeviceDefinition__Group__1__Impl rule__DeviceDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__1__Impl_in_rule__DeviceDefinition__Group__18753);
            rule__DeviceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__2_in_rule__DeviceDefinition__Group__18756);
            rule__DeviceDefinition__Group__2();

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
    // $ANTLR end "rule__DeviceDefinition__Group__1"


    // $ANTLR start "rule__DeviceDefinition__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4372:1: rule__DeviceDefinition__Group__1__Impl : ( 'DEVICE' ) ;
    public final void rule__DeviceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4376:1: ( ( 'DEVICE' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4377:1: ( 'DEVICE' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4377:1: ( 'DEVICE' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4378:1: 'DEVICE'
            {
             before(grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__DeviceDefinition__Group__1__Impl8784); 
             after(grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__1__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4391:1: rule__DeviceDefinition__Group__2 : rule__DeviceDefinition__Group__2__Impl rule__DeviceDefinition__Group__3 ;
    public final void rule__DeviceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4395:1: ( rule__DeviceDefinition__Group__2__Impl rule__DeviceDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4396:2: rule__DeviceDefinition__Group__2__Impl rule__DeviceDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__2__Impl_in_rule__DeviceDefinition__Group__28815);
            rule__DeviceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__3_in_rule__DeviceDefinition__Group__28818);
            rule__DeviceDefinition__Group__3();

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
    // $ANTLR end "rule__DeviceDefinition__Group__2"


    // $ANTLR start "rule__DeviceDefinition__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4403:1: rule__DeviceDefinition__Group__2__Impl : ( ( rule__DeviceDefinition__NameAssignment_2 ) ) ;
    public final void rule__DeviceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4407:1: ( ( ( rule__DeviceDefinition__NameAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4408:1: ( ( rule__DeviceDefinition__NameAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4408:1: ( ( rule__DeviceDefinition__NameAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4409:1: ( rule__DeviceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getNameAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4410:1: ( rule__DeviceDefinition__NameAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4410:2: rule__DeviceDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__NameAssignment_2_in_rule__DeviceDefinition__Group__2__Impl8845);
            rule__DeviceDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__2__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4420:1: rule__DeviceDefinition__Group__3 : rule__DeviceDefinition__Group__3__Impl rule__DeviceDefinition__Group__4 ;
    public final void rule__DeviceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4424:1: ( rule__DeviceDefinition__Group__3__Impl rule__DeviceDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4425:2: rule__DeviceDefinition__Group__3__Impl rule__DeviceDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__3__Impl_in_rule__DeviceDefinition__Group__38875);
            rule__DeviceDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__4_in_rule__DeviceDefinition__Group__38878);
            rule__DeviceDefinition__Group__4();

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
    // $ANTLR end "rule__DeviceDefinition__Group__3"


    // $ANTLR start "rule__DeviceDefinition__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4432:1: rule__DeviceDefinition__Group__3__Impl : ( '=' ) ;
    public final void rule__DeviceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4436:1: ( ( '=' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4437:1: ( '=' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4437:1: ( '=' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4438:1: '='
            {
             before(grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__DeviceDefinition__Group__3__Impl8906); 
             after(grammarAccess.getDeviceDefinitionAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__3__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4451:1: rule__DeviceDefinition__Group__4 : rule__DeviceDefinition__Group__4__Impl rule__DeviceDefinition__Group__5 ;
    public final void rule__DeviceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4455:1: ( rule__DeviceDefinition__Group__4__Impl rule__DeviceDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4456:2: rule__DeviceDefinition__Group__4__Impl rule__DeviceDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__4__Impl_in_rule__DeviceDefinition__Group__48937);
            rule__DeviceDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__5_in_rule__DeviceDefinition__Group__48940);
            rule__DeviceDefinition__Group__5();

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
    // $ANTLR end "rule__DeviceDefinition__Group__4"


    // $ANTLR start "rule__DeviceDefinition__Group__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4463:1: rule__DeviceDefinition__Group__4__Impl : ( 'DEVICE' ) ;
    public final void rule__DeviceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4467:1: ( ( 'DEVICE' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4468:1: ( 'DEVICE' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4468:1: ( 'DEVICE' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4469:1: 'DEVICE'
            {
             before(grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_4()); 
            match(input,40,FOLLOW_40_in_rule__DeviceDefinition__Group__4__Impl8968); 
             after(grammarAccess.getDeviceDefinitionAccess().getDEVICEKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__4__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4482:1: rule__DeviceDefinition__Group__5 : rule__DeviceDefinition__Group__5__Impl rule__DeviceDefinition__Group__6 ;
    public final void rule__DeviceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4486:1: ( rule__DeviceDefinition__Group__5__Impl rule__DeviceDefinition__Group__6 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4487:2: rule__DeviceDefinition__Group__5__Impl rule__DeviceDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__5__Impl_in_rule__DeviceDefinition__Group__58999);
            rule__DeviceDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__6_in_rule__DeviceDefinition__Group__59002);
            rule__DeviceDefinition__Group__6();

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
    // $ANTLR end "rule__DeviceDefinition__Group__5"


    // $ANTLR start "rule__DeviceDefinition__Group__5__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4494:1: rule__DeviceDefinition__Group__5__Impl : ( '(' ) ;
    public final void rule__DeviceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4498:1: ( ( '(' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4499:1: ( '(' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4499:1: ( '(' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4500:1: '('
            {
             before(grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__DeviceDefinition__Group__5__Impl9030); 
             after(grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__5__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__6"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4513:1: rule__DeviceDefinition__Group__6 : rule__DeviceDefinition__Group__6__Impl rule__DeviceDefinition__Group__7 ;
    public final void rule__DeviceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4517:1: ( rule__DeviceDefinition__Group__6__Impl rule__DeviceDefinition__Group__7 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4518:2: rule__DeviceDefinition__Group__6__Impl rule__DeviceDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__6__Impl_in_rule__DeviceDefinition__Group__69061);
            rule__DeviceDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__7_in_rule__DeviceDefinition__Group__69064);
            rule__DeviceDefinition__Group__7();

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
    // $ANTLR end "rule__DeviceDefinition__Group__6"


    // $ANTLR start "rule__DeviceDefinition__Group__6__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4525:1: rule__DeviceDefinition__Group__6__Impl : ( ( rule__DeviceDefinition__Group_6__0 ) ) ;
    public final void rule__DeviceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4529:1: ( ( ( rule__DeviceDefinition__Group_6__0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4530:1: ( ( rule__DeviceDefinition__Group_6__0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4530:1: ( ( rule__DeviceDefinition__Group_6__0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4531:1: ( rule__DeviceDefinition__Group_6__0 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getGroup_6()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4532:1: ( rule__DeviceDefinition__Group_6__0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4532:2: rule__DeviceDefinition__Group_6__0
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_6__0_in_rule__DeviceDefinition__Group__6__Impl9091);
            rule__DeviceDefinition__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__6__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__7"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4542:1: rule__DeviceDefinition__Group__7 : rule__DeviceDefinition__Group__7__Impl rule__DeviceDefinition__Group__8 ;
    public final void rule__DeviceDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4546:1: ( rule__DeviceDefinition__Group__7__Impl rule__DeviceDefinition__Group__8 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4547:2: rule__DeviceDefinition__Group__7__Impl rule__DeviceDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__7__Impl_in_rule__DeviceDefinition__Group__79121);
            rule__DeviceDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__8_in_rule__DeviceDefinition__Group__79124);
            rule__DeviceDefinition__Group__8();

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
    // $ANTLR end "rule__DeviceDefinition__Group__7"


    // $ANTLR start "rule__DeviceDefinition__Group__7__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4554:1: rule__DeviceDefinition__Group__7__Impl : ( ')' ) ;
    public final void rule__DeviceDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4558:1: ( ( ')' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4559:1: ( ')' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4559:1: ( ')' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4560:1: ')'
            {
             before(grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_7()); 
            match(input,32,FOLLOW_32_in_rule__DeviceDefinition__Group__7__Impl9152); 
             after(grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__7__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__8"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4573:1: rule__DeviceDefinition__Group__8 : rule__DeviceDefinition__Group__8__Impl rule__DeviceDefinition__Group__9 ;
    public final void rule__DeviceDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4577:1: ( rule__DeviceDefinition__Group__8__Impl rule__DeviceDefinition__Group__9 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4578:2: rule__DeviceDefinition__Group__8__Impl rule__DeviceDefinition__Group__9
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__8__Impl_in_rule__DeviceDefinition__Group__89183);
            rule__DeviceDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__9_in_rule__DeviceDefinition__Group__89186);
            rule__DeviceDefinition__Group__9();

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
    // $ANTLR end "rule__DeviceDefinition__Group__8"


    // $ANTLR start "rule__DeviceDefinition__Group__8__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4585:1: rule__DeviceDefinition__Group__8__Impl : ( '(' ) ;
    public final void rule__DeviceDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4589:1: ( ( '(' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4590:1: ( '(' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4590:1: ( '(' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4591:1: '('
            {
             before(grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_8()); 
            match(input,31,FOLLOW_31_in_rule__DeviceDefinition__Group__8__Impl9214); 
             after(grammarAccess.getDeviceDefinitionAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__8__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__9"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4604:1: rule__DeviceDefinition__Group__9 : rule__DeviceDefinition__Group__9__Impl rule__DeviceDefinition__Group__10 ;
    public final void rule__DeviceDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4608:1: ( rule__DeviceDefinition__Group__9__Impl rule__DeviceDefinition__Group__10 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4609:2: rule__DeviceDefinition__Group__9__Impl rule__DeviceDefinition__Group__10
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__9__Impl_in_rule__DeviceDefinition__Group__99245);
            rule__DeviceDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__10_in_rule__DeviceDefinition__Group__99248);
            rule__DeviceDefinition__Group__10();

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
    // $ANTLR end "rule__DeviceDefinition__Group__9"


    // $ANTLR start "rule__DeviceDefinition__Group__9__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4616:1: rule__DeviceDefinition__Group__9__Impl : ( ( rule__DeviceDefinition__Group_9__0 )? ) ;
    public final void rule__DeviceDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4620:1: ( ( ( rule__DeviceDefinition__Group_9__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4621:1: ( ( rule__DeviceDefinition__Group_9__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4621:1: ( ( rule__DeviceDefinition__Group_9__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4622:1: ( rule__DeviceDefinition__Group_9__0 )?
            {
             before(grammarAccess.getDeviceDefinitionAccess().getGroup_9()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4623:1: ( rule__DeviceDefinition__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_INT)||(LA38_0>=19 && LA38_0<=20)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4623:2: rule__DeviceDefinition__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__DeviceDefinition__Group_9__0_in_rule__DeviceDefinition__Group__9__Impl9275);
                    rule__DeviceDefinition__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceDefinitionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__9__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__10"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4633:1: rule__DeviceDefinition__Group__10 : rule__DeviceDefinition__Group__10__Impl rule__DeviceDefinition__Group__11 ;
    public final void rule__DeviceDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4637:1: ( rule__DeviceDefinition__Group__10__Impl rule__DeviceDefinition__Group__11 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4638:2: rule__DeviceDefinition__Group__10__Impl rule__DeviceDefinition__Group__11
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__10__Impl_in_rule__DeviceDefinition__Group__109306);
            rule__DeviceDefinition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__11_in_rule__DeviceDefinition__Group__109309);
            rule__DeviceDefinition__Group__11();

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
    // $ANTLR end "rule__DeviceDefinition__Group__10"


    // $ANTLR start "rule__DeviceDefinition__Group__10__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4645:1: rule__DeviceDefinition__Group__10__Impl : ( ')' ) ;
    public final void rule__DeviceDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4649:1: ( ( ')' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4650:1: ( ')' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4650:1: ( ')' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4651:1: ')'
            {
             before(grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10()); 
            match(input,32,FOLLOW_32_in_rule__DeviceDefinition__Group__10__Impl9337); 
             after(grammarAccess.getDeviceDefinitionAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__10__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__11"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4664:1: rule__DeviceDefinition__Group__11 : rule__DeviceDefinition__Group__11__Impl rule__DeviceDefinition__Group__12 ;
    public final void rule__DeviceDefinition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4668:1: ( rule__DeviceDefinition__Group__11__Impl rule__DeviceDefinition__Group__12 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4669:2: rule__DeviceDefinition__Group__11__Impl rule__DeviceDefinition__Group__12
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__11__Impl_in_rule__DeviceDefinition__Group__119368);
            rule__DeviceDefinition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__12_in_rule__DeviceDefinition__Group__119371);
            rule__DeviceDefinition__Group__12();

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
    // $ANTLR end "rule__DeviceDefinition__Group__11"


    // $ANTLR start "rule__DeviceDefinition__Group__11__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4676:1: rule__DeviceDefinition__Group__11__Impl : ( '{' ) ;
    public final void rule__DeviceDefinition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4680:1: ( ( '{' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4681:1: ( '{' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4681:1: ( '{' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4682:1: '{'
            {
             before(grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,29,FOLLOW_29_in_rule__DeviceDefinition__Group__11__Impl9399); 
             after(grammarAccess.getDeviceDefinitionAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__11__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__12"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4695:1: rule__DeviceDefinition__Group__12 : rule__DeviceDefinition__Group__12__Impl rule__DeviceDefinition__Group__13 ;
    public final void rule__DeviceDefinition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4699:1: ( rule__DeviceDefinition__Group__12__Impl rule__DeviceDefinition__Group__13 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4700:2: rule__DeviceDefinition__Group__12__Impl rule__DeviceDefinition__Group__13
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__12__Impl_in_rule__DeviceDefinition__Group__129430);
            rule__DeviceDefinition__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group__13_in_rule__DeviceDefinition__Group__129433);
            rule__DeviceDefinition__Group__13();

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
    // $ANTLR end "rule__DeviceDefinition__Group__12"


    // $ANTLR start "rule__DeviceDefinition__Group__12__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4707:1: rule__DeviceDefinition__Group__12__Impl : ( ( rule__DeviceDefinition__Group_12__0 )? ) ;
    public final void rule__DeviceDefinition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4711:1: ( ( ( rule__DeviceDefinition__Group_12__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4712:1: ( ( rule__DeviceDefinition__Group_12__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4712:1: ( ( rule__DeviceDefinition__Group_12__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4713:1: ( rule__DeviceDefinition__Group_12__0 )?
            {
             before(grammarAccess.getDeviceDefinitionAccess().getGroup_12()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4714:1: ( rule__DeviceDefinition__Group_12__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==11||(LA39_0>=15 && LA39_0<=16)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4714:2: rule__DeviceDefinition__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__DeviceDefinition__Group_12__0_in_rule__DeviceDefinition__Group__12__Impl9460);
                    rule__DeviceDefinition__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceDefinitionAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__12__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group__13"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4724:1: rule__DeviceDefinition__Group__13 : rule__DeviceDefinition__Group__13__Impl ;
    public final void rule__DeviceDefinition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4728:1: ( rule__DeviceDefinition__Group__13__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4729:2: rule__DeviceDefinition__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group__13__Impl_in_rule__DeviceDefinition__Group__139491);
            rule__DeviceDefinition__Group__13__Impl();

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
    // $ANTLR end "rule__DeviceDefinition__Group__13"


    // $ANTLR start "rule__DeviceDefinition__Group__13__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4735:1: rule__DeviceDefinition__Group__13__Impl : ( '}' ) ;
    public final void rule__DeviceDefinition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4739:1: ( ( '}' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4740:1: ( '}' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4740:1: ( '}' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4741:1: '}'
            {
             before(grammarAccess.getDeviceDefinitionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,30,FOLLOW_30_in_rule__DeviceDefinition__Group__13__Impl9519); 
             after(grammarAccess.getDeviceDefinitionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group__13__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_6__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4782:1: rule__DeviceDefinition__Group_6__0 : rule__DeviceDefinition__Group_6__0__Impl rule__DeviceDefinition__Group_6__1 ;
    public final void rule__DeviceDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4786:1: ( rule__DeviceDefinition__Group_6__0__Impl rule__DeviceDefinition__Group_6__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4787:2: rule__DeviceDefinition__Group_6__0__Impl rule__DeviceDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_6__0__Impl_in_rule__DeviceDefinition__Group_6__09578);
            rule__DeviceDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group_6__1_in_rule__DeviceDefinition__Group_6__09581);
            rule__DeviceDefinition__Group_6__1();

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
    // $ANTLR end "rule__DeviceDefinition__Group_6__0"


    // $ANTLR start "rule__DeviceDefinition__Group_6__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4794:1: rule__DeviceDefinition__Group_6__0__Impl : ( ( rule__DeviceDefinition__PartsAssignment_6_0 ) ) ;
    public final void rule__DeviceDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4798:1: ( ( ( rule__DeviceDefinition__PartsAssignment_6_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4799:1: ( ( rule__DeviceDefinition__PartsAssignment_6_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4799:1: ( ( rule__DeviceDefinition__PartsAssignment_6_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4800:1: ( rule__DeviceDefinition__PartsAssignment_6_0 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getPartsAssignment_6_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4801:1: ( rule__DeviceDefinition__PartsAssignment_6_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4801:2: rule__DeviceDefinition__PartsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__PartsAssignment_6_0_in_rule__DeviceDefinition__Group_6__0__Impl9608);
            rule__DeviceDefinition__PartsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getPartsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_6__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4811:1: rule__DeviceDefinition__Group_6__1 : rule__DeviceDefinition__Group_6__1__Impl ;
    public final void rule__DeviceDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4815:1: ( rule__DeviceDefinition__Group_6__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4816:2: rule__DeviceDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_6__1__Impl_in_rule__DeviceDefinition__Group_6__19638);
            rule__DeviceDefinition__Group_6__1__Impl();

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
    // $ANTLR end "rule__DeviceDefinition__Group_6__1"


    // $ANTLR start "rule__DeviceDefinition__Group_6__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4822:1: rule__DeviceDefinition__Group_6__1__Impl : ( ( rule__DeviceDefinition__Group_6_1__0 )* ) ;
    public final void rule__DeviceDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4826:1: ( ( ( rule__DeviceDefinition__Group_6_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4827:1: ( ( rule__DeviceDefinition__Group_6_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4827:1: ( ( rule__DeviceDefinition__Group_6_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4828:1: ( rule__DeviceDefinition__Group_6_1__0 )*
            {
             before(grammarAccess.getDeviceDefinitionAccess().getGroup_6_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4829:1: ( rule__DeviceDefinition__Group_6_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==33) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4829:2: rule__DeviceDefinition__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DeviceDefinition__Group_6_1__0_in_rule__DeviceDefinition__Group_6__1__Impl9665);
            	    rule__DeviceDefinition__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getDeviceDefinitionAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_6_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4843:1: rule__DeviceDefinition__Group_6_1__0 : rule__DeviceDefinition__Group_6_1__0__Impl rule__DeviceDefinition__Group_6_1__1 ;
    public final void rule__DeviceDefinition__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4847:1: ( rule__DeviceDefinition__Group_6_1__0__Impl rule__DeviceDefinition__Group_6_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4848:2: rule__DeviceDefinition__Group_6_1__0__Impl rule__DeviceDefinition__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_6_1__0__Impl_in_rule__DeviceDefinition__Group_6_1__09700);
            rule__DeviceDefinition__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group_6_1__1_in_rule__DeviceDefinition__Group_6_1__09703);
            rule__DeviceDefinition__Group_6_1__1();

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
    // $ANTLR end "rule__DeviceDefinition__Group_6_1__0"


    // $ANTLR start "rule__DeviceDefinition__Group_6_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4855:1: rule__DeviceDefinition__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__DeviceDefinition__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4859:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4860:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4860:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4861:1: ','
            {
             before(grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_6_1_0()); 
            match(input,33,FOLLOW_33_in_rule__DeviceDefinition__Group_6_1__0__Impl9731); 
             after(grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_6_1__0__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_6_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4874:1: rule__DeviceDefinition__Group_6_1__1 : rule__DeviceDefinition__Group_6_1__1__Impl ;
    public final void rule__DeviceDefinition__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4878:1: ( rule__DeviceDefinition__Group_6_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4879:2: rule__DeviceDefinition__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_6_1__1__Impl_in_rule__DeviceDefinition__Group_6_1__19762);
            rule__DeviceDefinition__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__DeviceDefinition__Group_6_1__1"


    // $ANTLR start "rule__DeviceDefinition__Group_6_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4885:1: rule__DeviceDefinition__Group_6_1__1__Impl : ( ( rule__DeviceDefinition__PartsAssignment_6_1_1 ) ) ;
    public final void rule__DeviceDefinition__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4889:1: ( ( ( rule__DeviceDefinition__PartsAssignment_6_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4890:1: ( ( rule__DeviceDefinition__PartsAssignment_6_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4890:1: ( ( rule__DeviceDefinition__PartsAssignment_6_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4891:1: ( rule__DeviceDefinition__PartsAssignment_6_1_1 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getPartsAssignment_6_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4892:1: ( rule__DeviceDefinition__PartsAssignment_6_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4892:2: rule__DeviceDefinition__PartsAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__PartsAssignment_6_1_1_in_rule__DeviceDefinition__Group_6_1__1__Impl9789);
            rule__DeviceDefinition__PartsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getPartsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_6_1__1__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_9__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4906:1: rule__DeviceDefinition__Group_9__0 : rule__DeviceDefinition__Group_9__0__Impl rule__DeviceDefinition__Group_9__1 ;
    public final void rule__DeviceDefinition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4910:1: ( rule__DeviceDefinition__Group_9__0__Impl rule__DeviceDefinition__Group_9__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4911:2: rule__DeviceDefinition__Group_9__0__Impl rule__DeviceDefinition__Group_9__1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_9__0__Impl_in_rule__DeviceDefinition__Group_9__09823);
            rule__DeviceDefinition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group_9__1_in_rule__DeviceDefinition__Group_9__09826);
            rule__DeviceDefinition__Group_9__1();

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
    // $ANTLR end "rule__DeviceDefinition__Group_9__0"


    // $ANTLR start "rule__DeviceDefinition__Group_9__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4918:1: rule__DeviceDefinition__Group_9__0__Impl : ( ( rule__DeviceDefinition__ParametersAssignment_9_0 ) ) ;
    public final void rule__DeviceDefinition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4922:1: ( ( ( rule__DeviceDefinition__ParametersAssignment_9_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4923:1: ( ( rule__DeviceDefinition__ParametersAssignment_9_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4923:1: ( ( rule__DeviceDefinition__ParametersAssignment_9_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4924:1: ( rule__DeviceDefinition__ParametersAssignment_9_0 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getParametersAssignment_9_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4925:1: ( rule__DeviceDefinition__ParametersAssignment_9_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4925:2: rule__DeviceDefinition__ParametersAssignment_9_0
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__ParametersAssignment_9_0_in_rule__DeviceDefinition__Group_9__0__Impl9853);
            rule__DeviceDefinition__ParametersAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getParametersAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_9__0__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_9__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4935:1: rule__DeviceDefinition__Group_9__1 : rule__DeviceDefinition__Group_9__1__Impl ;
    public final void rule__DeviceDefinition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4939:1: ( rule__DeviceDefinition__Group_9__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4940:2: rule__DeviceDefinition__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_9__1__Impl_in_rule__DeviceDefinition__Group_9__19883);
            rule__DeviceDefinition__Group_9__1__Impl();

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
    // $ANTLR end "rule__DeviceDefinition__Group_9__1"


    // $ANTLR start "rule__DeviceDefinition__Group_9__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4946:1: rule__DeviceDefinition__Group_9__1__Impl : ( ( rule__DeviceDefinition__Group_9_1__0 )* ) ;
    public final void rule__DeviceDefinition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4950:1: ( ( ( rule__DeviceDefinition__Group_9_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4951:1: ( ( rule__DeviceDefinition__Group_9_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4951:1: ( ( rule__DeviceDefinition__Group_9_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4952:1: ( rule__DeviceDefinition__Group_9_1__0 )*
            {
             before(grammarAccess.getDeviceDefinitionAccess().getGroup_9_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4953:1: ( rule__DeviceDefinition__Group_9_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4953:2: rule__DeviceDefinition__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DeviceDefinition__Group_9_1__0_in_rule__DeviceDefinition__Group_9__1__Impl9910);
            	    rule__DeviceDefinition__Group_9_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getDeviceDefinitionAccess().getGroup_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_9__1__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_9_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4967:1: rule__DeviceDefinition__Group_9_1__0 : rule__DeviceDefinition__Group_9_1__0__Impl rule__DeviceDefinition__Group_9_1__1 ;
    public final void rule__DeviceDefinition__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4971:1: ( rule__DeviceDefinition__Group_9_1__0__Impl rule__DeviceDefinition__Group_9_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4972:2: rule__DeviceDefinition__Group_9_1__0__Impl rule__DeviceDefinition__Group_9_1__1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_9_1__0__Impl_in_rule__DeviceDefinition__Group_9_1__09945);
            rule__DeviceDefinition__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group_9_1__1_in_rule__DeviceDefinition__Group_9_1__09948);
            rule__DeviceDefinition__Group_9_1__1();

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
    // $ANTLR end "rule__DeviceDefinition__Group_9_1__0"


    // $ANTLR start "rule__DeviceDefinition__Group_9_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4979:1: rule__DeviceDefinition__Group_9_1__0__Impl : ( ',' ) ;
    public final void rule__DeviceDefinition__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4983:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4984:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4984:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4985:1: ','
            {
             before(grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_9_1_0()); 
            match(input,33,FOLLOW_33_in_rule__DeviceDefinition__Group_9_1__0__Impl9976); 
             after(grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_9_1__0__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_9_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:4998:1: rule__DeviceDefinition__Group_9_1__1 : rule__DeviceDefinition__Group_9_1__1__Impl ;
    public final void rule__DeviceDefinition__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5002:1: ( rule__DeviceDefinition__Group_9_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5003:2: rule__DeviceDefinition__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_9_1__1__Impl_in_rule__DeviceDefinition__Group_9_1__110007);
            rule__DeviceDefinition__Group_9_1__1__Impl();

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
    // $ANTLR end "rule__DeviceDefinition__Group_9_1__1"


    // $ANTLR start "rule__DeviceDefinition__Group_9_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5009:1: rule__DeviceDefinition__Group_9_1__1__Impl : ( ( rule__DeviceDefinition__ParametersAssignment_9_1_1 ) ) ;
    public final void rule__DeviceDefinition__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5013:1: ( ( ( rule__DeviceDefinition__ParametersAssignment_9_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5014:1: ( ( rule__DeviceDefinition__ParametersAssignment_9_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5014:1: ( ( rule__DeviceDefinition__ParametersAssignment_9_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5015:1: ( rule__DeviceDefinition__ParametersAssignment_9_1_1 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getParametersAssignment_9_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5016:1: ( rule__DeviceDefinition__ParametersAssignment_9_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5016:2: rule__DeviceDefinition__ParametersAssignment_9_1_1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__ParametersAssignment_9_1_1_in_rule__DeviceDefinition__Group_9_1__1__Impl10034);
            rule__DeviceDefinition__ParametersAssignment_9_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getParametersAssignment_9_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_9_1__1__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_12__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5030:1: rule__DeviceDefinition__Group_12__0 : rule__DeviceDefinition__Group_12__0__Impl rule__DeviceDefinition__Group_12__1 ;
    public final void rule__DeviceDefinition__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5034:1: ( rule__DeviceDefinition__Group_12__0__Impl rule__DeviceDefinition__Group_12__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5035:2: rule__DeviceDefinition__Group_12__0__Impl rule__DeviceDefinition__Group_12__1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_12__0__Impl_in_rule__DeviceDefinition__Group_12__010068);
            rule__DeviceDefinition__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group_12__1_in_rule__DeviceDefinition__Group_12__010071);
            rule__DeviceDefinition__Group_12__1();

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
    // $ANTLR end "rule__DeviceDefinition__Group_12__0"


    // $ANTLR start "rule__DeviceDefinition__Group_12__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5042:1: rule__DeviceDefinition__Group_12__0__Impl : ( ( rule__DeviceDefinition__MembersAssignment_12_0 ) ) ;
    public final void rule__DeviceDefinition__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5046:1: ( ( ( rule__DeviceDefinition__MembersAssignment_12_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5047:1: ( ( rule__DeviceDefinition__MembersAssignment_12_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5047:1: ( ( rule__DeviceDefinition__MembersAssignment_12_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5048:1: ( rule__DeviceDefinition__MembersAssignment_12_0 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getMembersAssignment_12_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5049:1: ( rule__DeviceDefinition__MembersAssignment_12_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5049:2: rule__DeviceDefinition__MembersAssignment_12_0
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__MembersAssignment_12_0_in_rule__DeviceDefinition__Group_12__0__Impl10098);
            rule__DeviceDefinition__MembersAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getMembersAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_12__0__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_12__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5059:1: rule__DeviceDefinition__Group_12__1 : rule__DeviceDefinition__Group_12__1__Impl ;
    public final void rule__DeviceDefinition__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5063:1: ( rule__DeviceDefinition__Group_12__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5064:2: rule__DeviceDefinition__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_12__1__Impl_in_rule__DeviceDefinition__Group_12__110128);
            rule__DeviceDefinition__Group_12__1__Impl();

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
    // $ANTLR end "rule__DeviceDefinition__Group_12__1"


    // $ANTLR start "rule__DeviceDefinition__Group_12__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5070:1: rule__DeviceDefinition__Group_12__1__Impl : ( ( rule__DeviceDefinition__Group_12_1__0 )* ) ;
    public final void rule__DeviceDefinition__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5074:1: ( ( ( rule__DeviceDefinition__Group_12_1__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5075:1: ( ( rule__DeviceDefinition__Group_12_1__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5075:1: ( ( rule__DeviceDefinition__Group_12_1__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5076:1: ( rule__DeviceDefinition__Group_12_1__0 )*
            {
             before(grammarAccess.getDeviceDefinitionAccess().getGroup_12_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5077:1: ( rule__DeviceDefinition__Group_12_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==33) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5077:2: rule__DeviceDefinition__Group_12_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DeviceDefinition__Group_12_1__0_in_rule__DeviceDefinition__Group_12__1__Impl10155);
            	    rule__DeviceDefinition__Group_12_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getDeviceDefinitionAccess().getGroup_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_12__1__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_12_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5091:1: rule__DeviceDefinition__Group_12_1__0 : rule__DeviceDefinition__Group_12_1__0__Impl rule__DeviceDefinition__Group_12_1__1 ;
    public final void rule__DeviceDefinition__Group_12_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5095:1: ( rule__DeviceDefinition__Group_12_1__0__Impl rule__DeviceDefinition__Group_12_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5096:2: rule__DeviceDefinition__Group_12_1__0__Impl rule__DeviceDefinition__Group_12_1__1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_12_1__0__Impl_in_rule__DeviceDefinition__Group_12_1__010190);
            rule__DeviceDefinition__Group_12_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeviceDefinition__Group_12_1__1_in_rule__DeviceDefinition__Group_12_1__010193);
            rule__DeviceDefinition__Group_12_1__1();

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
    // $ANTLR end "rule__DeviceDefinition__Group_12_1__0"


    // $ANTLR start "rule__DeviceDefinition__Group_12_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5103:1: rule__DeviceDefinition__Group_12_1__0__Impl : ( ',' ) ;
    public final void rule__DeviceDefinition__Group_12_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5107:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5108:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5108:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5109:1: ','
            {
             before(grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_12_1_0()); 
            match(input,33,FOLLOW_33_in_rule__DeviceDefinition__Group_12_1__0__Impl10221); 
             after(grammarAccess.getDeviceDefinitionAccess().getCommaKeyword_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_12_1__0__Impl"


    // $ANTLR start "rule__DeviceDefinition__Group_12_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5122:1: rule__DeviceDefinition__Group_12_1__1 : rule__DeviceDefinition__Group_12_1__1__Impl ;
    public final void rule__DeviceDefinition__Group_12_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5126:1: ( rule__DeviceDefinition__Group_12_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5127:2: rule__DeviceDefinition__Group_12_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__Group_12_1__1__Impl_in_rule__DeviceDefinition__Group_12_1__110252);
            rule__DeviceDefinition__Group_12_1__1__Impl();

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
    // $ANTLR end "rule__DeviceDefinition__Group_12_1__1"


    // $ANTLR start "rule__DeviceDefinition__Group_12_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5133:1: rule__DeviceDefinition__Group_12_1__1__Impl : ( ( rule__DeviceDefinition__MembersAssignment_12_1_1 ) ) ;
    public final void rule__DeviceDefinition__Group_12_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5137:1: ( ( ( rule__DeviceDefinition__MembersAssignment_12_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5138:1: ( ( rule__DeviceDefinition__MembersAssignment_12_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5138:1: ( ( rule__DeviceDefinition__MembersAssignment_12_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5139:1: ( rule__DeviceDefinition__MembersAssignment_12_1_1 )
            {
             before(grammarAccess.getDeviceDefinitionAccess().getMembersAssignment_12_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5140:1: ( rule__DeviceDefinition__MembersAssignment_12_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5140:2: rule__DeviceDefinition__MembersAssignment_12_1_1
            {
            pushFollow(FOLLOW_rule__DeviceDefinition__MembersAssignment_12_1_1_in_rule__DeviceDefinition__Group_12_1__1__Impl10279);
            rule__DeviceDefinition__MembersAssignment_12_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceDefinitionAccess().getMembersAssignment_12_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__Group_12_1__1__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5154:1: rule__ATGCDefinition__Group__0 : rule__ATGCDefinition__Group__0__Impl rule__ATGCDefinition__Group__1 ;
    public final void rule__ATGCDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5158:1: ( rule__ATGCDefinition__Group__0__Impl rule__ATGCDefinition__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5159:2: rule__ATGCDefinition__Group__0__Impl rule__ATGCDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group__0__Impl_in_rule__ATGCDefinition__Group__010313);
            rule__ATGCDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ATGCDefinition__Group__1_in_rule__ATGCDefinition__Group__010316);
            rule__ATGCDefinition__Group__1();

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
    // $ANTLR end "rule__ATGCDefinition__Group__0"


    // $ANTLR start "rule__ATGCDefinition__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5166:1: rule__ATGCDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ATGCDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5170:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5171:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5171:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5172:1: ()
            {
             before(grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5173:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5175:1: 
            {
            }

             after(grammarAccess.getATGCDefinitionAccess().getATGCDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group__0__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5185:1: rule__ATGCDefinition__Group__1 : rule__ATGCDefinition__Group__1__Impl rule__ATGCDefinition__Group__2 ;
    public final void rule__ATGCDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5189:1: ( rule__ATGCDefinition__Group__1__Impl rule__ATGCDefinition__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5190:2: rule__ATGCDefinition__Group__1__Impl rule__ATGCDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group__1__Impl_in_rule__ATGCDefinition__Group__110374);
            rule__ATGCDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ATGCDefinition__Group__2_in_rule__ATGCDefinition__Group__110377);
            rule__ATGCDefinition__Group__2();

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
    // $ANTLR end "rule__ATGCDefinition__Group__1"


    // $ANTLR start "rule__ATGCDefinition__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5197:1: rule__ATGCDefinition__Group__1__Impl : ( 'ATGC' ) ;
    public final void rule__ATGCDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5201:1: ( ( 'ATGC' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5202:1: ( 'ATGC' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5202:1: ( 'ATGC' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5203:1: 'ATGC'
            {
             before(grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ATGCDefinition__Group__1__Impl10405); 
             after(grammarAccess.getATGCDefinitionAccess().getATGCKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group__1__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5216:1: rule__ATGCDefinition__Group__2 : rule__ATGCDefinition__Group__2__Impl rule__ATGCDefinition__Group__3 ;
    public final void rule__ATGCDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5220:1: ( rule__ATGCDefinition__Group__2__Impl rule__ATGCDefinition__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5221:2: rule__ATGCDefinition__Group__2__Impl rule__ATGCDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group__2__Impl_in_rule__ATGCDefinition__Group__210436);
            rule__ATGCDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ATGCDefinition__Group__3_in_rule__ATGCDefinition__Group__210439);
            rule__ATGCDefinition__Group__3();

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
    // $ANTLR end "rule__ATGCDefinition__Group__2"


    // $ANTLR start "rule__ATGCDefinition__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5228:1: rule__ATGCDefinition__Group__2__Impl : ( ( rule__ATGCDefinition__CommandAssignment_2 ) ) ;
    public final void rule__ATGCDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5232:1: ( ( ( rule__ATGCDefinition__CommandAssignment_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5233:1: ( ( rule__ATGCDefinition__CommandAssignment_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5233:1: ( ( rule__ATGCDefinition__CommandAssignment_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5234:1: ( rule__ATGCDefinition__CommandAssignment_2 )
            {
             before(grammarAccess.getATGCDefinitionAccess().getCommandAssignment_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5235:1: ( rule__ATGCDefinition__CommandAssignment_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5235:2: rule__ATGCDefinition__CommandAssignment_2
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__CommandAssignment_2_in_rule__ATGCDefinition__Group__2__Impl10466);
            rule__ATGCDefinition__CommandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getATGCDefinitionAccess().getCommandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group__2__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5245:1: rule__ATGCDefinition__Group__3 : rule__ATGCDefinition__Group__3__Impl rule__ATGCDefinition__Group__4 ;
    public final void rule__ATGCDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5249:1: ( rule__ATGCDefinition__Group__3__Impl rule__ATGCDefinition__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5250:2: rule__ATGCDefinition__Group__3__Impl rule__ATGCDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group__3__Impl_in_rule__ATGCDefinition__Group__310496);
            rule__ATGCDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ATGCDefinition__Group__4_in_rule__ATGCDefinition__Group__310499);
            rule__ATGCDefinition__Group__4();

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
    // $ANTLR end "rule__ATGCDefinition__Group__3"


    // $ANTLR start "rule__ATGCDefinition__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5257:1: rule__ATGCDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__ATGCDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5261:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5262:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5262:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5263:1: ':'
            {
             before(grammarAccess.getATGCDefinitionAccess().getColonKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__ATGCDefinition__Group__3__Impl10527); 
             after(grammarAccess.getATGCDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group__3__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5276:1: rule__ATGCDefinition__Group__4 : rule__ATGCDefinition__Group__4__Impl rule__ATGCDefinition__Group__5 ;
    public final void rule__ATGCDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5280:1: ( rule__ATGCDefinition__Group__4__Impl rule__ATGCDefinition__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5281:2: rule__ATGCDefinition__Group__4__Impl rule__ATGCDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group__4__Impl_in_rule__ATGCDefinition__Group__410558);
            rule__ATGCDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ATGCDefinition__Group__5_in_rule__ATGCDefinition__Group__410561);
            rule__ATGCDefinition__Group__5();

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
    // $ANTLR end "rule__ATGCDefinition__Group__4"


    // $ANTLR start "rule__ATGCDefinition__Group__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5288:1: rule__ATGCDefinition__Group__4__Impl : ( ( rule__ATGCDefinition__ArgumentsAssignment_4 ) ) ;
    public final void rule__ATGCDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5292:1: ( ( ( rule__ATGCDefinition__ArgumentsAssignment_4 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5293:1: ( ( rule__ATGCDefinition__ArgumentsAssignment_4 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5293:1: ( ( rule__ATGCDefinition__ArgumentsAssignment_4 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5294:1: ( rule__ATGCDefinition__ArgumentsAssignment_4 )
            {
             before(grammarAccess.getATGCDefinitionAccess().getArgumentsAssignment_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5295:1: ( rule__ATGCDefinition__ArgumentsAssignment_4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5295:2: rule__ATGCDefinition__ArgumentsAssignment_4
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__ArgumentsAssignment_4_in_rule__ATGCDefinition__Group__4__Impl10588);
            rule__ATGCDefinition__ArgumentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getATGCDefinitionAccess().getArgumentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group__4__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group__5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5305:1: rule__ATGCDefinition__Group__5 : rule__ATGCDefinition__Group__5__Impl ;
    public final void rule__ATGCDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5309:1: ( rule__ATGCDefinition__Group__5__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5310:2: rule__ATGCDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group__5__Impl_in_rule__ATGCDefinition__Group__510618);
            rule__ATGCDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__ATGCDefinition__Group__5"


    // $ANTLR start "rule__ATGCDefinition__Group__5__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5316:1: rule__ATGCDefinition__Group__5__Impl : ( ( rule__ATGCDefinition__Group_5__0 )* ) ;
    public final void rule__ATGCDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5320:1: ( ( ( rule__ATGCDefinition__Group_5__0 )* ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5321:1: ( ( rule__ATGCDefinition__Group_5__0 )* )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5321:1: ( ( rule__ATGCDefinition__Group_5__0 )* )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5322:1: ( rule__ATGCDefinition__Group_5__0 )*
            {
             before(grammarAccess.getATGCDefinitionAccess().getGroup_5()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5323:1: ( rule__ATGCDefinition__Group_5__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==33) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5323:2: rule__ATGCDefinition__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ATGCDefinition__Group_5__0_in_rule__ATGCDefinition__Group__5__Impl10645);
            	    rule__ATGCDefinition__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getATGCDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group__5__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group_5__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5345:1: rule__ATGCDefinition__Group_5__0 : rule__ATGCDefinition__Group_5__0__Impl rule__ATGCDefinition__Group_5__1 ;
    public final void rule__ATGCDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5349:1: ( rule__ATGCDefinition__Group_5__0__Impl rule__ATGCDefinition__Group_5__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5350:2: rule__ATGCDefinition__Group_5__0__Impl rule__ATGCDefinition__Group_5__1
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group_5__0__Impl_in_rule__ATGCDefinition__Group_5__010688);
            rule__ATGCDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ATGCDefinition__Group_5__1_in_rule__ATGCDefinition__Group_5__010691);
            rule__ATGCDefinition__Group_5__1();

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
    // $ANTLR end "rule__ATGCDefinition__Group_5__0"


    // $ANTLR start "rule__ATGCDefinition__Group_5__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5357:1: rule__ATGCDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ATGCDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5361:1: ( ( ',' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5362:1: ( ',' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5362:1: ( ',' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5363:1: ','
            {
             before(grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__ATGCDefinition__Group_5__0__Impl10719); 
             after(grammarAccess.getATGCDefinitionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__ATGCDefinition__Group_5__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5376:1: rule__ATGCDefinition__Group_5__1 : rule__ATGCDefinition__Group_5__1__Impl ;
    public final void rule__ATGCDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5380:1: ( rule__ATGCDefinition__Group_5__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5381:2: rule__ATGCDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__Group_5__1__Impl_in_rule__ATGCDefinition__Group_5__110750);
            rule__ATGCDefinition__Group_5__1__Impl();

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
    // $ANTLR end "rule__ATGCDefinition__Group_5__1"


    // $ANTLR start "rule__ATGCDefinition__Group_5__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5387:1: rule__ATGCDefinition__Group_5__1__Impl : ( ( rule__ATGCDefinition__ArgumentsAssignment_5_1 ) ) ;
    public final void rule__ATGCDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5391:1: ( ( ( rule__ATGCDefinition__ArgumentsAssignment_5_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5392:1: ( ( rule__ATGCDefinition__ArgumentsAssignment_5_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5392:1: ( ( rule__ATGCDefinition__ArgumentsAssignment_5_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5393:1: ( rule__ATGCDefinition__ArgumentsAssignment_5_1 )
            {
             before(grammarAccess.getATGCDefinitionAccess().getArgumentsAssignment_5_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5394:1: ( rule__ATGCDefinition__ArgumentsAssignment_5_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5394:2: rule__ATGCDefinition__ArgumentsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ATGCDefinition__ArgumentsAssignment_5_1_in_rule__ATGCDefinition__Group_5__1__Impl10777);
            rule__ATGCDefinition__ArgumentsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getATGCDefinitionAccess().getArgumentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_0__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5408:1: rule__PropertyDefinition__Group_0__0 : rule__PropertyDefinition__Group_0__0__Impl rule__PropertyDefinition__Group_0__1 ;
    public final void rule__PropertyDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5412:1: ( rule__PropertyDefinition__Group_0__0__Impl rule__PropertyDefinition__Group_0__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5413:2: rule__PropertyDefinition__Group_0__0__Impl rule__PropertyDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__0__Impl_in_rule__PropertyDefinition__Group_0__010811);
            rule__PropertyDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__1_in_rule__PropertyDefinition__Group_0__010814);
            rule__PropertyDefinition__Group_0__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_0__0"


    // $ANTLR start "rule__PropertyDefinition__Group_0__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5420:1: rule__PropertyDefinition__Group_0__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5424:1: ( ( () ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5425:1: ( () )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5425:1: ( () )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5426:1: ()
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5427:1: ()
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5429:1: 
            {
            }

             after(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_0__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5439:1: rule__PropertyDefinition__Group_0__1 : rule__PropertyDefinition__Group_0__1__Impl rule__PropertyDefinition__Group_0__2 ;
    public final void rule__PropertyDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5443:1: ( rule__PropertyDefinition__Group_0__1__Impl rule__PropertyDefinition__Group_0__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5444:2: rule__PropertyDefinition__Group_0__1__Impl rule__PropertyDefinition__Group_0__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__1__Impl_in_rule__PropertyDefinition__Group_0__110872);
            rule__PropertyDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__2_in_rule__PropertyDefinition__Group_0__110875);
            rule__PropertyDefinition__Group_0__2();

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
    // $ANTLR end "rule__PropertyDefinition__Group_0__1"


    // $ANTLR start "rule__PropertyDefinition__Group_0__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5451:1: rule__PropertyDefinition__Group_0__1__Impl : ( 'PROPERTY' ) ;
    public final void rule__PropertyDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5455:1: ( ( 'PROPERTY' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5456:1: ( 'PROPERTY' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5456:1: ( 'PROPERTY' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5457:1: 'PROPERTY'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPROPERTYKeyword_0_1()); 
            match(input,42,FOLLOW_42_in_rule__PropertyDefinition__Group_0__1__Impl10903); 
             after(grammarAccess.getPropertyDefinitionAccess().getPROPERTYKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_0__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5470:1: rule__PropertyDefinition__Group_0__2 : rule__PropertyDefinition__Group_0__2__Impl rule__PropertyDefinition__Group_0__3 ;
    public final void rule__PropertyDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5474:1: ( rule__PropertyDefinition__Group_0__2__Impl rule__PropertyDefinition__Group_0__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5475:2: rule__PropertyDefinition__Group_0__2__Impl rule__PropertyDefinition__Group_0__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__2__Impl_in_rule__PropertyDefinition__Group_0__210934);
            rule__PropertyDefinition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__3_in_rule__PropertyDefinition__Group_0__210937);
            rule__PropertyDefinition__Group_0__3();

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
    // $ANTLR end "rule__PropertyDefinition__Group_0__2"


    // $ANTLR start "rule__PropertyDefinition__Group_0__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5482:1: rule__PropertyDefinition__Group_0__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_0_2 ) ) ;
    public final void rule__PropertyDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5486:1: ( ( ( rule__PropertyDefinition__NameAssignment_0_2 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5487:1: ( ( rule__PropertyDefinition__NameAssignment_0_2 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5487:1: ( ( rule__PropertyDefinition__NameAssignment_0_2 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5488:1: ( rule__PropertyDefinition__NameAssignment_0_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_0_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5489:1: ( rule__PropertyDefinition__NameAssignment_0_2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5489:2: rule__PropertyDefinition__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_0_2_in_rule__PropertyDefinition__Group_0__2__Impl10964);
            rule__PropertyDefinition__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_0__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5499:1: rule__PropertyDefinition__Group_0__3 : rule__PropertyDefinition__Group_0__3__Impl rule__PropertyDefinition__Group_0__4 ;
    public final void rule__PropertyDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5503:1: ( rule__PropertyDefinition__Group_0__3__Impl rule__PropertyDefinition__Group_0__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5504:2: rule__PropertyDefinition__Group_0__3__Impl rule__PropertyDefinition__Group_0__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__3__Impl_in_rule__PropertyDefinition__Group_0__310994);
            rule__PropertyDefinition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__4_in_rule__PropertyDefinition__Group_0__310997);
            rule__PropertyDefinition__Group_0__4();

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
    // $ANTLR end "rule__PropertyDefinition__Group_0__3"


    // $ANTLR start "rule__PropertyDefinition__Group_0__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5511:1: rule__PropertyDefinition__Group_0__3__Impl : ( ':' ) ;
    public final void rule__PropertyDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5515:1: ( ( ':' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5516:1: ( ':' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5516:1: ( ':' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5517:1: ':'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_0_3()); 
            match(input,35,FOLLOW_35_in_rule__PropertyDefinition__Group_0__3__Impl11025); 
             after(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_0__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5530:1: rule__PropertyDefinition__Group_0__4 : rule__PropertyDefinition__Group_0__4__Impl ;
    public final void rule__PropertyDefinition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5534:1: ( rule__PropertyDefinition__Group_0__4__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5535:2: rule__PropertyDefinition__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_0__4__Impl_in_rule__PropertyDefinition__Group_0__411056);
            rule__PropertyDefinition__Group_0__4__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_0__4"


    // $ANTLR start "rule__PropertyDefinition__Group_0__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5541:1: rule__PropertyDefinition__Group_0__4__Impl : ( ( rule__PropertyDefinition__ArgumentsAssignment_0_4 ) ) ;
    public final void rule__PropertyDefinition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5545:1: ( ( ( rule__PropertyDefinition__ArgumentsAssignment_0_4 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5546:1: ( ( rule__PropertyDefinition__ArgumentsAssignment_0_4 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5546:1: ( ( rule__PropertyDefinition__ArgumentsAssignment_0_4 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5547:1: ( rule__PropertyDefinition__ArgumentsAssignment_0_4 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getArgumentsAssignment_0_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5548:1: ( rule__PropertyDefinition__ArgumentsAssignment_0_4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5548:2: rule__PropertyDefinition__ArgumentsAssignment_0_4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ArgumentsAssignment_0_4_in_rule__PropertyDefinition__Group_0__4__Impl11083);
            rule__PropertyDefinition__ArgumentsAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getArgumentsAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_0__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_1__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5568:1: rule__PropertyDefinition__Group_1__0 : rule__PropertyDefinition__Group_1__0__Impl rule__PropertyDefinition__Group_1__1 ;
    public final void rule__PropertyDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5572:1: ( rule__PropertyDefinition__Group_1__0__Impl rule__PropertyDefinition__Group_1__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5573:2: rule__PropertyDefinition__Group_1__0__Impl rule__PropertyDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_1__0__Impl_in_rule__PropertyDefinition__Group_1__011123);
            rule__PropertyDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_1__1_in_rule__PropertyDefinition__Group_1__011126);
            rule__PropertyDefinition__Group_1__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_1__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5580:1: rule__PropertyDefinition__Group_1__0__Impl : ( 'VERIFY' ) ;
    public final void rule__PropertyDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5584:1: ( ( 'VERIFY' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5585:1: ( 'VERIFY' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5585:1: ( 'VERIFY' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5586:1: 'VERIFY'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getVERIFYKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__PropertyDefinition__Group_1__0__Impl11154); 
             after(grammarAccess.getPropertyDefinitionAccess().getVERIFYKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_1__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5599:1: rule__PropertyDefinition__Group_1__1 : rule__PropertyDefinition__Group_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5603:1: ( rule__PropertyDefinition__Group_1__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5604:2: rule__PropertyDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_1__1__Impl_in_rule__PropertyDefinition__Group_1__111185);
            rule__PropertyDefinition__Group_1__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_1__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5610:1: rule__PropertyDefinition__Group_1__1__Impl : ( ( rule__PropertyDefinition__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__PropertyDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5614:1: ( ( ( rule__PropertyDefinition__ArgumentsAssignment_1_1 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5615:1: ( ( rule__PropertyDefinition__ArgumentsAssignment_1_1 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5615:1: ( ( rule__PropertyDefinition__ArgumentsAssignment_1_1 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5616:1: ( rule__PropertyDefinition__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getArgumentsAssignment_1_1()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5617:1: ( rule__PropertyDefinition__ArgumentsAssignment_1_1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5617:2: rule__PropertyDefinition__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ArgumentsAssignment_1_1_in_rule__PropertyDefinition__Group_1__1__Impl11212);
            rule__PropertyDefinition__ArgumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5631:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5635:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5636:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__011246);
            rule__Decimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__011249);
            rule__Decimal__Group__1();

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
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5643:1: rule__Decimal__Group__0__Impl : ( ( rule__Decimal__Alternatives_0 )? ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5647:1: ( ( ( rule__Decimal__Alternatives_0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5648:1: ( ( rule__Decimal__Alternatives_0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5648:1: ( ( rule__Decimal__Alternatives_0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5649:1: ( rule__Decimal__Alternatives_0 )?
            {
             before(grammarAccess.getDecimalAccess().getAlternatives_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5650:1: ( rule__Decimal__Alternatives_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=19 && LA44_0<=20)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5650:2: rule__Decimal__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Decimal__Alternatives_0_in_rule__Decimal__Group__0__Impl11276);
                    rule__Decimal__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5660:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl rule__Decimal__Group__2 ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5664:1: ( rule__Decimal__Group__1__Impl rule__Decimal__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5665:2: rule__Decimal__Group__1__Impl rule__Decimal__Group__2
            {
            pushFollow(FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__111307);
            rule__Decimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__111310);
            rule__Decimal__Group__2();

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
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5672:1: rule__Decimal__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5676:1: ( ( RULE_INT ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5677:1: ( RULE_INT )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5677:1: ( RULE_INT )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5678:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Decimal__Group__1__Impl11337); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5689:1: rule__Decimal__Group__2 : rule__Decimal__Group__2__Impl ;
    public final void rule__Decimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5693:1: ( rule__Decimal__Group__2__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5694:2: rule__Decimal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__211366);
            rule__Decimal__Group__2__Impl();

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
    // $ANTLR end "rule__Decimal__Group__2"


    // $ANTLR start "rule__Decimal__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5700:1: rule__Decimal__Group__2__Impl : ( ( rule__Decimal__Group_2__0 )? ) ;
    public final void rule__Decimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5704:1: ( ( ( rule__Decimal__Group_2__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5705:1: ( ( rule__Decimal__Group_2__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5705:1: ( ( rule__Decimal__Group_2__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5706:1: ( rule__Decimal__Group_2__0 )?
            {
             before(grammarAccess.getDecimalAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5707:1: ( rule__Decimal__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==17) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_INT) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5707:2: rule__Decimal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Decimal__Group_2__0_in_rule__Decimal__Group__2__Impl11393);
                    rule__Decimal__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__2__Impl"


    // $ANTLR start "rule__Decimal__Group_2__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5723:1: rule__Decimal__Group_2__0 : rule__Decimal__Group_2__0__Impl rule__Decimal__Group_2__1 ;
    public final void rule__Decimal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5727:1: ( rule__Decimal__Group_2__0__Impl rule__Decimal__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5728:2: rule__Decimal__Group_2__0__Impl rule__Decimal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Decimal__Group_2__0__Impl_in_rule__Decimal__Group_2__011430);
            rule__Decimal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decimal__Group_2__1_in_rule__Decimal__Group_2__011433);
            rule__Decimal__Group_2__1();

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
    // $ANTLR end "rule__Decimal__Group_2__0"


    // $ANTLR start "rule__Decimal__Group_2__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5735:1: rule__Decimal__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Decimal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5739:1: ( ( '.' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5740:1: ( '.' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5740:1: ( '.' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5741:1: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Decimal__Group_2__0__Impl11461); 
             after(grammarAccess.getDecimalAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group_2__0__Impl"


    // $ANTLR start "rule__Decimal__Group_2__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5754:1: rule__Decimal__Group_2__1 : rule__Decimal__Group_2__1__Impl ;
    public final void rule__Decimal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5758:1: ( rule__Decimal__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5759:2: rule__Decimal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Decimal__Group_2__1__Impl_in_rule__Decimal__Group_2__111492);
            rule__Decimal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Decimal__Group_2__1"


    // $ANTLR start "rule__Decimal__Group_2__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5765:1: rule__Decimal__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5769:1: ( ( RULE_INT ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5770:1: ( RULE_INT )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5770:1: ( RULE_INT )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5771:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Decimal__Group_2__1__Impl11519); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group_2__1__Impl"


    // $ANTLR start "rule__DecimalExp__Group__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5786:1: rule__DecimalExp__Group__0 : rule__DecimalExp__Group__0__Impl rule__DecimalExp__Group__1 ;
    public final void rule__DecimalExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5790:1: ( rule__DecimalExp__Group__0__Impl rule__DecimalExp__Group__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5791:2: rule__DecimalExp__Group__0__Impl rule__DecimalExp__Group__1
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group__0__Impl_in_rule__DecimalExp__Group__011552);
            rule__DecimalExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalExp__Group__1_in_rule__DecimalExp__Group__011555);
            rule__DecimalExp__Group__1();

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
    // $ANTLR end "rule__DecimalExp__Group__0"


    // $ANTLR start "rule__DecimalExp__Group__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5798:1: rule__DecimalExp__Group__0__Impl : ( ( rule__DecimalExp__Alternatives_0 )? ) ;
    public final void rule__DecimalExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5802:1: ( ( ( rule__DecimalExp__Alternatives_0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5803:1: ( ( rule__DecimalExp__Alternatives_0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5803:1: ( ( rule__DecimalExp__Alternatives_0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5804:1: ( rule__DecimalExp__Alternatives_0 )?
            {
             before(grammarAccess.getDecimalExpAccess().getAlternatives_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5805:1: ( rule__DecimalExp__Alternatives_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=19 && LA46_0<=20)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5805:2: rule__DecimalExp__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__DecimalExp__Alternatives_0_in_rule__DecimalExp__Group__0__Impl11582);
                    rule__DecimalExp__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalExpAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group__0__Impl"


    // $ANTLR start "rule__DecimalExp__Group__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5815:1: rule__DecimalExp__Group__1 : rule__DecimalExp__Group__1__Impl rule__DecimalExp__Group__2 ;
    public final void rule__DecimalExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5819:1: ( rule__DecimalExp__Group__1__Impl rule__DecimalExp__Group__2 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5820:2: rule__DecimalExp__Group__1__Impl rule__DecimalExp__Group__2
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group__1__Impl_in_rule__DecimalExp__Group__111613);
            rule__DecimalExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalExp__Group__2_in_rule__DecimalExp__Group__111616);
            rule__DecimalExp__Group__2();

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
    // $ANTLR end "rule__DecimalExp__Group__1"


    // $ANTLR start "rule__DecimalExp__Group__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5827:1: rule__DecimalExp__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DecimalExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5831:1: ( ( RULE_INT ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5832:1: ( RULE_INT )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5832:1: ( RULE_INT )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5833:1: RULE_INT
            {
             before(grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalExp__Group__1__Impl11643); 
             after(grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group__1__Impl"


    // $ANTLR start "rule__DecimalExp__Group__2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5844:1: rule__DecimalExp__Group__2 : rule__DecimalExp__Group__2__Impl rule__DecimalExp__Group__3 ;
    public final void rule__DecimalExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5848:1: ( rule__DecimalExp__Group__2__Impl rule__DecimalExp__Group__3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5849:2: rule__DecimalExp__Group__2__Impl rule__DecimalExp__Group__3
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group__2__Impl_in_rule__DecimalExp__Group__211672);
            rule__DecimalExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalExp__Group__3_in_rule__DecimalExp__Group__211675);
            rule__DecimalExp__Group__3();

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
    // $ANTLR end "rule__DecimalExp__Group__2"


    // $ANTLR start "rule__DecimalExp__Group__2__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5856:1: rule__DecimalExp__Group__2__Impl : ( ( rule__DecimalExp__Group_2__0 )? ) ;
    public final void rule__DecimalExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5860:1: ( ( ( rule__DecimalExp__Group_2__0 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5861:1: ( ( rule__DecimalExp__Group_2__0 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5861:1: ( ( rule__DecimalExp__Group_2__0 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5862:1: ( rule__DecimalExp__Group_2__0 )?
            {
             before(grammarAccess.getDecimalExpAccess().getGroup_2()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5863:1: ( rule__DecimalExp__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==17) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5863:2: rule__DecimalExp__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DecimalExp__Group_2__0_in_rule__DecimalExp__Group__2__Impl11702);
                    rule__DecimalExp__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalExpAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group__2__Impl"


    // $ANTLR start "rule__DecimalExp__Group__3"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5873:1: rule__DecimalExp__Group__3 : rule__DecimalExp__Group__3__Impl rule__DecimalExp__Group__4 ;
    public final void rule__DecimalExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5877:1: ( rule__DecimalExp__Group__3__Impl rule__DecimalExp__Group__4 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5878:2: rule__DecimalExp__Group__3__Impl rule__DecimalExp__Group__4
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group__3__Impl_in_rule__DecimalExp__Group__311733);
            rule__DecimalExp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalExp__Group__4_in_rule__DecimalExp__Group__311736);
            rule__DecimalExp__Group__4();

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
    // $ANTLR end "rule__DecimalExp__Group__3"


    // $ANTLR start "rule__DecimalExp__Group__3__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5885:1: rule__DecimalExp__Group__3__Impl : ( ( rule__DecimalExp__Alternatives_3 ) ) ;
    public final void rule__DecimalExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5889:1: ( ( ( rule__DecimalExp__Alternatives_3 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5890:1: ( ( rule__DecimalExp__Alternatives_3 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5890:1: ( ( rule__DecimalExp__Alternatives_3 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5891:1: ( rule__DecimalExp__Alternatives_3 )
            {
             before(grammarAccess.getDecimalExpAccess().getAlternatives_3()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5892:1: ( rule__DecimalExp__Alternatives_3 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5892:2: rule__DecimalExp__Alternatives_3
            {
            pushFollow(FOLLOW_rule__DecimalExp__Alternatives_3_in_rule__DecimalExp__Group__3__Impl11763);
            rule__DecimalExp__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getDecimalExpAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group__3__Impl"


    // $ANTLR start "rule__DecimalExp__Group__4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5902:1: rule__DecimalExp__Group__4 : rule__DecimalExp__Group__4__Impl rule__DecimalExp__Group__5 ;
    public final void rule__DecimalExp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5906:1: ( rule__DecimalExp__Group__4__Impl rule__DecimalExp__Group__5 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5907:2: rule__DecimalExp__Group__4__Impl rule__DecimalExp__Group__5
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group__4__Impl_in_rule__DecimalExp__Group__411793);
            rule__DecimalExp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalExp__Group__5_in_rule__DecimalExp__Group__411796);
            rule__DecimalExp__Group__5();

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
    // $ANTLR end "rule__DecimalExp__Group__4"


    // $ANTLR start "rule__DecimalExp__Group__4__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5914:1: rule__DecimalExp__Group__4__Impl : ( ( rule__DecimalExp__Alternatives_4 )? ) ;
    public final void rule__DecimalExp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5918:1: ( ( ( rule__DecimalExp__Alternatives_4 )? ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5919:1: ( ( rule__DecimalExp__Alternatives_4 )? )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5919:1: ( ( rule__DecimalExp__Alternatives_4 )? )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5920:1: ( rule__DecimalExp__Alternatives_4 )?
            {
             before(grammarAccess.getDecimalExpAccess().getAlternatives_4()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5921:1: ( rule__DecimalExp__Alternatives_4 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=19 && LA48_0<=20)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5921:2: rule__DecimalExp__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__DecimalExp__Alternatives_4_in_rule__DecimalExp__Group__4__Impl11823);
                    rule__DecimalExp__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalExpAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group__4__Impl"


    // $ANTLR start "rule__DecimalExp__Group__5"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5931:1: rule__DecimalExp__Group__5 : rule__DecimalExp__Group__5__Impl ;
    public final void rule__DecimalExp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5935:1: ( rule__DecimalExp__Group__5__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5936:2: rule__DecimalExp__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group__5__Impl_in_rule__DecimalExp__Group__511854);
            rule__DecimalExp__Group__5__Impl();

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
    // $ANTLR end "rule__DecimalExp__Group__5"


    // $ANTLR start "rule__DecimalExp__Group__5__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5942:1: rule__DecimalExp__Group__5__Impl : ( RULE_INT ) ;
    public final void rule__DecimalExp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5946:1: ( ( RULE_INT ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5947:1: ( RULE_INT )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5947:1: ( RULE_INT )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5948:1: RULE_INT
            {
             before(grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_5()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalExp__Group__5__Impl11881); 
             after(grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group__5__Impl"


    // $ANTLR start "rule__DecimalExp__Group_2__0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5971:1: rule__DecimalExp__Group_2__0 : rule__DecimalExp__Group_2__0__Impl rule__DecimalExp__Group_2__1 ;
    public final void rule__DecimalExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5975:1: ( rule__DecimalExp__Group_2__0__Impl rule__DecimalExp__Group_2__1 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5976:2: rule__DecimalExp__Group_2__0__Impl rule__DecimalExp__Group_2__1
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group_2__0__Impl_in_rule__DecimalExp__Group_2__011922);
            rule__DecimalExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalExp__Group_2__1_in_rule__DecimalExp__Group_2__011925);
            rule__DecimalExp__Group_2__1();

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
    // $ANTLR end "rule__DecimalExp__Group_2__0"


    // $ANTLR start "rule__DecimalExp__Group_2__0__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5983:1: rule__DecimalExp__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DecimalExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5987:1: ( ( '.' ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5988:1: ( '.' )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5988:1: ( '.' )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:5989:1: '.'
            {
             before(grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__DecimalExp__Group_2__0__Impl11953); 
             after(grammarAccess.getDecimalExpAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group_2__0__Impl"


    // $ANTLR start "rule__DecimalExp__Group_2__1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6002:1: rule__DecimalExp__Group_2__1 : rule__DecimalExp__Group_2__1__Impl ;
    public final void rule__DecimalExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6006:1: ( rule__DecimalExp__Group_2__1__Impl )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6007:2: rule__DecimalExp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalExp__Group_2__1__Impl_in_rule__DecimalExp__Group_2__111984);
            rule__DecimalExp__Group_2__1__Impl();

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
    // $ANTLR end "rule__DecimalExp__Group_2__1"


    // $ANTLR start "rule__DecimalExp__Group_2__1__Impl"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6013:1: rule__DecimalExp__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DecimalExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6017:1: ( ( RULE_INT ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6018:1: ( RULE_INT )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6018:1: ( RULE_INT )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6019:1: RULE_INT
            {
             before(grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalExp__Group_2__1__Impl12011); 
             after(grammarAccess.getDecimalExpAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalExp__Group_2__1__Impl"


    // $ANTLR start "rule__Model__MembersAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6035:1: rule__Model__MembersAssignment_1 : ( ruleModelMember ) ;
    public final void rule__Model__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6039:1: ( ( ruleModelMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6040:1: ( ruleModelMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6040:1: ( ruleModelMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6041:1: ruleModelMember
            {
             before(grammarAccess.getModelAccess().getMembersModelMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelMember_in_rule__Model__MembersAssignment_112049);
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6050:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6054:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6055:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6055:1: ( ruleQualifiedNameWithWildcard )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6056:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_212080);
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


    // $ANTLR start "rule__VariableDefinition__TypeAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6065:1: rule__VariableDefinition__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6069:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6070:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6070:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6071:1: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDefinition__TypeAssignment_212111); 
             after(grammarAccess.getVariableDefinitionAccess().getTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6080:1: rule__VariableDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6084:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6085:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6085:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6086:1: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDefinition__NameAssignment_312142); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6095:1: rule__VariableDefinition__MembersAssignment_5 : ( ruleVariableDefinitionMember ) ;
    public final void rule__VariableDefinition__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6099:1: ( ( ruleVariableDefinitionMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6100:1: ( ruleVariableDefinitionMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6100:1: ( ruleVariableDefinitionMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6101:1: ruleVariableDefinitionMember
            {
             before(grammarAccess.getVariableDefinitionAccess().getMembersVariableDefinitionMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariableDefinitionMember_in_rule__VariableDefinition__MembersAssignment_512173);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6110:1: rule__FunctionDefinition__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6114:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6115:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6115:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6116:1: RULE_ID
            {
             before(grammarAccess.getFunctionDefinitionAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDefinition__TypeAssignment_212204); 
             after(grammarAccess.getFunctionDefinitionAccess().getTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6125:1: rule__FunctionDefinition__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FunctionDefinition__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6129:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6130:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6130:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6131:1: RULE_ID
            {
             before(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_312235); 
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


    // $ANTLR start "rule__FunctionDefinition__ParametersAssignment_5_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6140:1: rule__FunctionDefinition__ParametersAssignment_5_0 : ( ruleFunctionParameterMember ) ;
    public final void rule__FunctionDefinition__ParametersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6144:1: ( ( ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6145:1: ( ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6145:1: ( ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6146:1: ruleFunctionParameterMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_5_012266);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__ParametersAssignment_5_0"


    // $ANTLR start "rule__FunctionDefinition__ParametersAssignment_5_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6155:1: rule__FunctionDefinition__ParametersAssignment_5_1_1 : ( ruleFunctionParameterMember ) ;
    public final void rule__FunctionDefinition__ParametersAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6159:1: ( ( ruleFunctionParameterMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6160:1: ( ruleFunctionParameterMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6160:1: ( ruleFunctionParameterMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6161:1: ruleFunctionParameterMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_5_1_112297);
            ruleFunctionParameterMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getParametersFunctionParameterMemberParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__ParametersAssignment_5_1_1"


    // $ANTLR start "rule__FunctionDefinition__MembersAssignment_8"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6170:1: rule__FunctionDefinition__MembersAssignment_8 : ( ruleFunctionDefinitionMember ) ;
    public final void rule__FunctionDefinition__MembersAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6174:1: ( ( ruleFunctionDefinitionMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6175:1: ( ruleFunctionDefinitionMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6175:1: ( ruleFunctionDefinitionMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6176:1: ruleFunctionDefinitionMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFunctionDefinitionMember_in_rule__FunctionDefinition__MembersAssignment_812328);
            ruleFunctionDefinitionMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getMembersFunctionDefinitionMemberParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__MembersAssignment_8"


    // $ANTLR start "rule__FunctionDefinition__UsesAssignment_10_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6185:1: rule__FunctionDefinition__UsesAssignment_10_1 : ( ruleFunctionUseMember ) ;
    public final void rule__FunctionDefinition__UsesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6189:1: ( ( ruleFunctionUseMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6190:1: ( ruleFunctionUseMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6190:1: ( ruleFunctionUseMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6191:1: ruleFunctionUseMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_10_112359);
            ruleFunctionUseMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__UsesAssignment_10_1"


    // $ANTLR start "rule__FunctionDefinition__UsesAssignment_10_2_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6200:1: rule__FunctionDefinition__UsesAssignment_10_2_1 : ( ruleFunctionUseMember ) ;
    public final void rule__FunctionDefinition__UsesAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6204:1: ( ( ruleFunctionUseMember ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6205:1: ( ruleFunctionUseMember )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6205:1: ( ruleFunctionUseMember )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6206:1: ruleFunctionUseMember
            {
             before(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_10_2_112390);
            ruleFunctionUseMember();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getUsesFunctionUseMemberParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDefinition__UsesAssignment_10_2_1"


    // $ANTLR start "rule__FunctionParameterMember__TypeAssignment_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6215:1: rule__FunctionParameterMember__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionParameterMember__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6219:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6220:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6220:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6221:1: RULE_ID
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameterMember__TypeAssignment_012421); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6230:1: rule__FunctionParameterMember__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionParameterMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6234:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6235:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6235:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6236:1: RULE_ID
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameterMember__NameAssignment_112452); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6245:1: rule__FunctionParameterMember__ScopeAssignment_3 : ( ruleParameterScope ) ;
    public final void rule__FunctionParameterMember__ScopeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6249:1: ( ( ruleParameterScope ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6250:1: ( ruleParameterScope )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6250:1: ( ruleParameterScope )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6251:1: ruleParameterScope
            {
             before(grammarAccess.getFunctionParameterMemberAccess().getScopeParameterScopeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameterScope_in_rule__FunctionParameterMember__ScopeAssignment_312483);
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


    // $ANTLR start "rule__FunctionUseMember__TypeAssignment_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6260:1: rule__FunctionUseMember__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionUseMember__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6264:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6265:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6265:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6266:1: RULE_ID
            {
             before(grammarAccess.getFunctionUseMemberAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionUseMember__TypeAssignment_012514); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6275:1: rule__FunctionUseMember__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionUseMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6279:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6280:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6280:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6281:1: RULE_ID
            {
             before(grammarAccess.getFunctionUseMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionUseMember__NameAssignment_112545); 
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


    // $ANTLR start "rule__VariableDeclaration__QualifierAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6290:1: rule__VariableDeclaration__QualifierAssignment_1 : ( ruleVariableQualifier ) ;
    public final void rule__VariableDeclaration__QualifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6294:1: ( ( ruleVariableQualifier ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6295:1: ( ruleVariableQualifier )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6295:1: ( ruleVariableQualifier )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6296:1: ruleVariableQualifier
            {
             before(grammarAccess.getVariableDeclarationAccess().getQualifierVariableQualifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableQualifier_in_rule__VariableDeclaration__QualifierAssignment_112576);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6305:1: rule__VariableDeclaration__TypeAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6309:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6310:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6310:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6311:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeIDTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__TypeAssignment_2_0_012607); 
             after(grammarAccess.getVariableDeclarationAccess().getTypeIDTerminalRuleCall_2_0_0_0()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6320:1: rule__VariableDeclaration__NameAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6324:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6325:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6325:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6326:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_0_112638); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6335:1: rule__VariableDeclaration__CollectionAssignment_2_1_0 : ( ruleCollectionID ) ;
    public final void rule__VariableDeclaration__CollectionAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6339:1: ( ( ruleCollectionID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6340:1: ( ruleCollectionID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6340:1: ( ruleCollectionID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6341:1: ruleCollectionID
            {
             before(grammarAccess.getVariableDeclarationAccess().getCollectionCollectionIDParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleCollectionID_in_rule__VariableDeclaration__CollectionAssignment_2_1_012669);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6350:1: rule__VariableDeclaration__TypeAssignment_2_1_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6354:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6355:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6355:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6356:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeIDTerminalRuleCall_2_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__TypeAssignment_2_1_212700); 
             after(grammarAccess.getVariableDeclarationAccess().getTypeIDTerminalRuleCall_2_1_2_0()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6365:1: rule__VariableDeclaration__NameAssignment_2_1_4 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6369:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6370:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6370:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6371:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_1_412731); 
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


    // $ANTLR start "rule__VariableDeclaration__ConstructorAssignment_3_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6380:1: rule__VariableDeclaration__ConstructorAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__ConstructorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6384:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6385:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6385:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6386:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getConstructorIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__ConstructorAssignment_3_112762); 
             after(grammarAccess.getVariableDeclarationAccess().getConstructorIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ConstructorAssignment_3_1"


    // $ANTLR start "rule__VariableDeclaration__ParametersAssignment_3_3_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6395:1: rule__VariableDeclaration__ParametersAssignment_3_3_0 : ( ruleVariableAssignment ) ;
    public final void rule__VariableDeclaration__ParametersAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6399:1: ( ( ruleVariableAssignment ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6400:1: ( ruleVariableAssignment )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6400:1: ( ruleVariableAssignment )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6401:1: ruleVariableAssignment
            {
             before(grammarAccess.getVariableDeclarationAccess().getParametersVariableAssignmentParserRuleCall_3_3_0_0()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_rule__VariableDeclaration__ParametersAssignment_3_3_012793);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getParametersVariableAssignmentParserRuleCall_3_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ParametersAssignment_3_3_0"


    // $ANTLR start "rule__VariableDeclaration__ParametersAssignment_3_3_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6410:1: rule__VariableDeclaration__ParametersAssignment_3_3_1_1 : ( ruleVariableAssignment ) ;
    public final void rule__VariableDeclaration__ParametersAssignment_3_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6414:1: ( ( ruleVariableAssignment ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6415:1: ( ruleVariableAssignment )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6415:1: ( ruleVariableAssignment )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6416:1: ruleVariableAssignment
            {
             before(grammarAccess.getVariableDeclarationAccess().getParametersVariableAssignmentParserRuleCall_3_3_1_1_0()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_rule__VariableDeclaration__ParametersAssignment_3_3_1_112824);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getParametersVariableAssignmentParserRuleCall_3_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ParametersAssignment_3_3_1_1"


    // $ANTLR start "rule__VariableAssignment__VariableAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6425:1: rule__VariableAssignment__VariableAssignment_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableAssignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6429:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6430:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6430:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6431:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableVariableAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableAssignment__VariableAssignment_112855);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6440:1: rule__VariableAssignment__ExpressionAssignment_3 : ( ruleVariableExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6444:1: ( ( ruleVariableExpression ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6445:1: ( ruleVariableExpression )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6445:1: ( ruleVariableExpression )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6446:1: ruleVariableExpression
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionVariableExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVariableExpression_in_rule__VariableAssignment__ExpressionAssignment_312886);
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


    // $ANTLR start "rule__VariableAttribute__NameAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6455:1: rule__VariableAttribute__NameAssignment_1 : ( ( rule__VariableAttribute__NameAlternatives_1_0 ) ) ;
    public final void rule__VariableAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6459:1: ( ( ( rule__VariableAttribute__NameAlternatives_1_0 ) ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6460:1: ( ( rule__VariableAttribute__NameAlternatives_1_0 ) )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6460:1: ( ( rule__VariableAttribute__NameAlternatives_1_0 ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6461:1: ( rule__VariableAttribute__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVariableAttributeAccess().getNameAlternatives_1_0()); 
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6462:1: ( rule__VariableAttribute__NameAlternatives_1_0 )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6462:2: rule__VariableAttribute__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__VariableAttribute__NameAlternatives_1_0_in_rule__VariableAttribute__NameAssignment_112917);
            rule__VariableAttribute__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAttributeAccess().getNameAlternatives_1_0()); 

            }


            }

        }
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6471:1: rule__VariableAttribute__AttributeAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__VariableAttribute__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6475:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6476:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6476:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6477:1: RULE_ID
            {
             before(grammarAccess.getVariableAttributeAccess().getAttributeIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAttribute__AttributeAssignment_2_112950); 
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


    // $ANTLR start "rule__VariableExpression__MembersAssignment_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6486:1: rule__VariableExpression__MembersAssignment_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableExpression__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6490:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6491:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6491:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6492:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_112981);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6501:1: rule__VariableExpression__MembersAssignment_2_1 : ( ruleVariableAttribute ) ;
    public final void rule__VariableExpression__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6505:1: ( ( ruleVariableAttribute ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6506:1: ( ruleVariableAttribute )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6506:1: ( ruleVariableAttribute )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6507:1: ruleVariableAttribute
            {
             before(grammarAccess.getVariableExpressionAccess().getMembersVariableAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_2_113012);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6516:1: rule__RuleDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RuleDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6520:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6521:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6521:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6522:1: RULE_ID
            {
             before(grammarAccess.getRuleDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleDefinition__NameAssignment_213043); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6531:1: rule__RuleDefinition__LhsAssignment_4_0 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__LhsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6535:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6536:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6536:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6537:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_013074);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6546:1: rule__RuleDefinition__LhsAssignment_4_1_1 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__LhsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6550:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6551:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6551:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6552:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getLhsRuleObjectParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_1_113105);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6561:1: rule__RuleDefinition__RhsAssignment_6_0 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__RhsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6565:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6566:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6566:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6567:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_013136);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6576:1: rule__RuleDefinition__RhsAssignment_6_1_1 : ( ruleRuleObject ) ;
    public final void rule__RuleDefinition__RhsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6580:1: ( ( ruleRuleObject ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6581:1: ( ruleRuleObject )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6581:1: ( ruleRuleObject )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6582:1: ruleRuleObject
            {
             before(grammarAccess.getRuleDefinitionAccess().getRhsRuleObjectParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_1_113167);
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6591:1: rule__RuleObject__SubobjectsAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleObject__SubobjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6595:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6596:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6596:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6597:1: RULE_ID
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_113198); 
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
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6606:1: rule__RuleObject__SubobjectsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__RuleObject__SubobjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6610:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6611:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6611:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6612:1: RULE_ID
            {
             before(grammarAccess.getRuleObjectAccess().getSubobjectsIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_2_113229); 
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


    // $ANTLR start "rule__DeviceDefinition__NameAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6621:1: rule__DeviceDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DeviceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6625:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6626:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6626:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6627:1: RULE_ID
            {
             before(grammarAccess.getDeviceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeviceDefinition__NameAssignment_213260); 
             after(grammarAccess.getDeviceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__NameAssignment_2"


    // $ANTLR start "rule__DeviceDefinition__PartsAssignment_6_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6636:1: rule__DeviceDefinition__PartsAssignment_6_0 : ( RULE_ID ) ;
    public final void rule__DeviceDefinition__PartsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6640:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6641:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6641:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6642:1: RULE_ID
            {
             before(grammarAccess.getDeviceDefinitionAccess().getPartsIDTerminalRuleCall_6_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeviceDefinition__PartsAssignment_6_013291); 
             after(grammarAccess.getDeviceDefinitionAccess().getPartsIDTerminalRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__PartsAssignment_6_0"


    // $ANTLR start "rule__DeviceDefinition__PartsAssignment_6_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6651:1: rule__DeviceDefinition__PartsAssignment_6_1_1 : ( RULE_ID ) ;
    public final void rule__DeviceDefinition__PartsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6655:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6656:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6656:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6657:1: RULE_ID
            {
             before(grammarAccess.getDeviceDefinitionAccess().getPartsIDTerminalRuleCall_6_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeviceDefinition__PartsAssignment_6_1_113322); 
             after(grammarAccess.getDeviceDefinitionAccess().getPartsIDTerminalRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__PartsAssignment_6_1_1"


    // $ANTLR start "rule__DeviceDefinition__ParametersAssignment_9_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6666:1: rule__DeviceDefinition__ParametersAssignment_9_0 : ( ruleVariableAssignment ) ;
    public final void rule__DeviceDefinition__ParametersAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6670:1: ( ( ruleVariableAssignment ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6671:1: ( ruleVariableAssignment )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6671:1: ( ruleVariableAssignment )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6672:1: ruleVariableAssignment
            {
             before(grammarAccess.getDeviceDefinitionAccess().getParametersVariableAssignmentParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_rule__DeviceDefinition__ParametersAssignment_9_013353);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getDeviceDefinitionAccess().getParametersVariableAssignmentParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__ParametersAssignment_9_0"


    // $ANTLR start "rule__DeviceDefinition__ParametersAssignment_9_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6681:1: rule__DeviceDefinition__ParametersAssignment_9_1_1 : ( ruleVariableAssignment ) ;
    public final void rule__DeviceDefinition__ParametersAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6685:1: ( ( ruleVariableAssignment ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6686:1: ( ruleVariableAssignment )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6686:1: ( ruleVariableAssignment )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6687:1: ruleVariableAssignment
            {
             before(grammarAccess.getDeviceDefinitionAccess().getParametersVariableAssignmentParserRuleCall_9_1_1_0()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_rule__DeviceDefinition__ParametersAssignment_9_1_113384);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getDeviceDefinitionAccess().getParametersVariableAssignmentParserRuleCall_9_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__ParametersAssignment_9_1_1"


    // $ANTLR start "rule__DeviceDefinition__MembersAssignment_12_0"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6696:1: rule__DeviceDefinition__MembersAssignment_12_0 : ( ruleVariableDeclaration ) ;
    public final void rule__DeviceDefinition__MembersAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6700:1: ( ( ruleVariableDeclaration ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6701:1: ( ruleVariableDeclaration )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6701:1: ( ruleVariableDeclaration )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6702:1: ruleVariableDeclaration
            {
             before(grammarAccess.getDeviceDefinitionAccess().getMembersVariableDeclarationParserRuleCall_12_0_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__DeviceDefinition__MembersAssignment_12_013415);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getDeviceDefinitionAccess().getMembersVariableDeclarationParserRuleCall_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__MembersAssignment_12_0"


    // $ANTLR start "rule__DeviceDefinition__MembersAssignment_12_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6711:1: rule__DeviceDefinition__MembersAssignment_12_1_1 : ( ruleVariableDeclaration ) ;
    public final void rule__DeviceDefinition__MembersAssignment_12_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6715:1: ( ( ruleVariableDeclaration ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6716:1: ( ruleVariableDeclaration )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6716:1: ( ruleVariableDeclaration )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6717:1: ruleVariableDeclaration
            {
             before(grammarAccess.getDeviceDefinitionAccess().getMembersVariableDeclarationParserRuleCall_12_1_1_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__DeviceDefinition__MembersAssignment_12_1_113446);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getDeviceDefinitionAccess().getMembersVariableDeclarationParserRuleCall_12_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceDefinition__MembersAssignment_12_1_1"


    // $ANTLR start "rule__ATGCDefinition__CommandAssignment_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6726:1: rule__ATGCDefinition__CommandAssignment_2 : ( RULE_ID ) ;
    public final void rule__ATGCDefinition__CommandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6730:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6731:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6731:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6732:1: RULE_ID
            {
             before(grammarAccess.getATGCDefinitionAccess().getCommandIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ATGCDefinition__CommandAssignment_213477); 
             after(grammarAccess.getATGCDefinitionAccess().getCommandIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__CommandAssignment_2"


    // $ANTLR start "rule__ATGCDefinition__ArgumentsAssignment_4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6741:1: rule__ATGCDefinition__ArgumentsAssignment_4 : ( RULE_ID ) ;
    public final void rule__ATGCDefinition__ArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6745:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6746:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6746:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6747:1: RULE_ID
            {
             before(grammarAccess.getATGCDefinitionAccess().getArgumentsIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ATGCDefinition__ArgumentsAssignment_413508); 
             after(grammarAccess.getATGCDefinitionAccess().getArgumentsIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__ArgumentsAssignment_4"


    // $ANTLR start "rule__ATGCDefinition__ArgumentsAssignment_5_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6756:1: rule__ATGCDefinition__ArgumentsAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ATGCDefinition__ArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6760:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6761:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6761:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6762:1: RULE_ID
            {
             before(grammarAccess.getATGCDefinitionAccess().getArgumentsIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ATGCDefinition__ArgumentsAssignment_5_113539); 
             after(grammarAccess.getATGCDefinitionAccess().getArgumentsIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATGCDefinition__ArgumentsAssignment_5_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_0_2"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6771:1: rule__PropertyDefinition__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__PropertyDefinition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6775:1: ( ( RULE_ID ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6776:1: ( RULE_ID )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6776:1: ( RULE_ID )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6777:1: RULE_ID
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_0_213570); 
             after(grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_0_2"


    // $ANTLR start "rule__PropertyDefinition__ArgumentsAssignment_0_4"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6786:1: rule__PropertyDefinition__ArgumentsAssignment_0_4 : ( RULE_STRING ) ;
    public final void rule__PropertyDefinition__ArgumentsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6790:1: ( ( RULE_STRING ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6791:1: ( RULE_STRING )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6791:1: ( RULE_STRING )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6792:1: RULE_STRING
            {
             before(grammarAccess.getPropertyDefinitionAccess().getArgumentsSTRINGTerminalRuleCall_0_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyDefinition__ArgumentsAssignment_0_413601); 
             after(grammarAccess.getPropertyDefinitionAccess().getArgumentsSTRINGTerminalRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__ArgumentsAssignment_0_4"


    // $ANTLR start "rule__PropertyDefinition__ArgumentsAssignment_1_1"
    // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6801:1: rule__PropertyDefinition__ArgumentsAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__PropertyDefinition__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6805:1: ( ( RULE_STRING ) )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6806:1: ( RULE_STRING )
            {
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6806:1: ( RULE_STRING )
            // ../roadblock.xtext.ibl.ui/src-gen/roadblock/xtext/ibl/ui/contentassist/antlr/internal/InternalIbl.g:6807:1: RULE_STRING
            {
             before(grammarAccess.getPropertyDefinitionAccess().getArgumentsSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyDefinition__ArgumentsAssignment_1_113632); 
             after(grammarAccess.getPropertyDefinitionAccess().getArgumentsSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__ArgumentsAssignment_1_1"

    // Delegated rules


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA32_eotS =
        "\20\uffff";
    static final String DFA32_eofS =
        "\1\1\4\uffff\1\4\4\uffff\2\4\2\uffff\1\4\1\uffff";
    static final String DFA32_minS =
        "\1\4\1\uffff\2\4\1\uffff\3\4\2\5\2\4\2\5\2\4";
    static final String DFA32_maxS =
        "\1\53\1\uffff\2\24\1\uffff\1\53\1\5\1\4\2\24\2\53\2\5\1\53\1\4";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\13\uffff";
    static final String DFA32_specialS =
        "\20\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\1\5\uffff\1\1\3\uffff\2\1\2\uffff\1\2\1\3\1\4\10\uffff\1"+
            "\1\1\uffff\2\1\5\uffff\5\1",
            "",
            "\1\4\1\5\15\uffff\2\4",
            "\1\4\1\5\15\uffff\2\4",
            "",
            "\2\4\5\uffff\1\4\3\uffff\2\4\1\6\1\7\3\4\2\uffff\1\10\1\11"+
            "\4\uffff\1\4\1\uffff\2\4\4\uffff\1\1\5\4",
            "\1\12\1\13",
            "\1\12",
            "\1\16\15\uffff\1\14\1\15",
            "\1\16\15\uffff\1\14\1\15",
            "\2\4\5\uffff\1\4\3\uffff\2\4\2\uffff\3\4\10\uffff\1\4\1\uffff"+
            "\2\4\4\uffff\1\1\5\4",
            "\2\4\5\uffff\1\4\3\uffff\2\4\1\17\1\7\3\4\2\uffff\1\10\1\11"+
            "\4\uffff\1\4\1\uffff\2\4\4\uffff\1\1\5\4",
            "\1\16",
            "\1\16",
            "\2\4\5\uffff\1\4\3\uffff\2\4\1\17\1\7\3\4\10\uffff\1\4\1\uffff"+
            "\2\4\4\uffff\1\1\5\4",
            "\1\12"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 3625:1: ( rule__VariableExpression__Group_2__0 )*";
        }
    }
    static final String DFA34_eotS =
        "\14\uffff";
    static final String DFA34_eofS =
        "\1\2\1\5\6\uffff\1\5\3\uffff";
    static final String DFA34_minS =
        "\2\4\1\uffff\2\4\1\uffff\6\4";
    static final String DFA34_maxS =
        "\2\53\1\uffff\1\53\1\4\1\uffff\1\53\1\24\1\53\1\24\2\53";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\6\uffff";
    static final String DFA34_specialS =
        "\14\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\1\2\5\uffff\1\2\3\uffff\2\2\2\uffff\2\2\11\uffff\1\2\10"+
            "\uffff\5\2",
            "\1\3\1\5\5\uffff\1\5\3\uffff\2\5\1\2\1\4\2\5\11\uffff\1\5\7"+
            "\uffff\1\2\5\5",
            "",
            "\1\6\1\2\5\uffff\1\2\3\uffff\2\2\2\5\2\2\11\uffff\1\2\7\uffff"+
            "\1\7\5\2",
            "\1\10",
            "",
            "\1\3\1\5\5\uffff\1\5\3\uffff\2\5\2\2\2\5\11\uffff\1\5\7\uffff"+
            "\1\11\5\5",
            "\1\12\1\5\15\uffff\2\5",
            "\2\5\5\uffff\1\5\3\uffff\2\5\1\uffff\3\5\11\uffff\1\5\7\uffff"+
            "\1\2\5\5",
            "\1\13\1\2\15\uffff\2\2",
            "\2\5\5\uffff\1\5\3\uffff\7\5\10\uffff\1\5\1\2\7\uffff\5\5",
            "\2\2\5\uffff\1\2\3\uffff\7\2\10\uffff\1\2\1\5\7\uffff\5\2"
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
            return "3900:1: ( rule__RuleDefinition__Group_6__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_entryRuleModelMember121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMember128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMember__Alternatives_in_ruleModelMember154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__0_in_ruleVariableDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0_in_ruleFunctionDefinition454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_entryRuleFunctionParameterMember481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterMember488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__0_in_ruleFunctionParameterMember514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_entryRuleParameterScope541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterScope548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterScope__Alternatives_in_ruleParameterScope574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_entryRuleFunctionDefinitionMember601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinitionMember608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinitionMember__Alternatives_in_ruleFunctionDefinitionMember634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_entryRuleFunctionUseMember661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUseMember668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__0_in_ruleFunctionUseMember694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_entryRuleVariableDefinitionMember721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinitionMember728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariableDefinitionMember754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_entryRuleVariableQualifier840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableQualifier847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVariableQualifier874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_entryRuleCollectionID902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionID909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionID__Alternatives_in_ruleCollectionID935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__0_in_ruleVariableAttribute1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__0_in_ruleVariableExpression1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_entryRuleVariableExpressionOperator1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpressionOperator1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpressionOperator__Alternatives_in_ruleVariableExpressionOperator1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_entryRuleRuleDefinition1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDefinition1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__0_in_ruleRuleDefinition1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_entryRuleRuleObject1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleObject1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__0_in_ruleRuleObject1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_entryRuleDeviceDefinition1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeviceDefinition1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__0_in_ruleDeviceDefinition1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_entryRuleATGCDefinition1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATGCDefinition1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__0_in_ruleATGCDefinition1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Alternatives_in_rulePropertyDefinition1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REAL__Alternatives_in_ruleREAL1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimal1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Group__0_in_ruleDecimal1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_entryRuleDecimalExp1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalExp1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__0_in_ruleDecimalExp1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ModelMember__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_rule__ModelMember__Alternatives1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_rule__ModelMember__Alternatives1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ParameterScope__Alternatives1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ParameterScope__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ParameterScope__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDefinition_in_rule__FunctionDefinitionMember__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeviceDefinition_in_rule__FunctionDefinitionMember__Alternatives1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__FunctionDefinitionMember__Alternatives1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__FunctionDefinitionMember__Alternatives1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATGCDefinition_in_rule__FunctionDefinitionMember__Alternatives1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__FunctionDefinitionMember__Alternatives1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__0_in_rule__VariableDeclaration__Alternatives_21967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__0_in_rule__VariableDeclaration__Alternatives_21985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CollectionID__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CollectionID__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAttribute__NameAlternatives_1_02073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_rule__VariableAttribute__NameAlternatives_1_02090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VariableAttribute__Alternatives_2_02123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VariableAttribute__Alternatives_2_02143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VariableExpressionOperator__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VariableExpressionOperator__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VariableExpressionOperator__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RuleDefinition__Alternatives_52253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RuleDefinition__Alternatives_52273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__0_in_rule__PropertyDefinition__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_1__0_in_rule__PropertyDefinition__Alternatives2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimal_in_rule__REAL__Alternatives2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalExp_in_rule__REAL__Alternatives2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Decimal__Alternatives_02408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Decimal__Alternatives_02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DecimalExp__Alternatives_02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DecimalExp__Alternatives_02483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DecimalExp__Alternatives_32518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DecimalExp__Alternatives_32538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DecimalExp__Alternatives_42573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DecimalExp__Alternatives_42593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02625 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MembersAssignment_1_in_rule__Model__Group__1__Impl2713 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02748 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Import__Group__1__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__22871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02934 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QualifiedNameWithWildcard__Group__1__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03059 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3145 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__0__Impl_in_rule__VariableDefinition__Group__03302 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__1_in_rule__VariableDefinition__Group__03305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__1__Impl_in_rule__VariableDefinition__Group__13363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__2_in_rule__VariableDefinition__Group__13366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VariableDefinition__Group__1__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__2__Impl_in_rule__VariableDefinition__Group__23425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__3_in_rule__VariableDefinition__Group__23428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__TypeAssignment_2_in_rule__VariableDefinition__Group__2__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__3__Impl_in_rule__VariableDefinition__Group__33486 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__4_in_rule__VariableDefinition__Group__33489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__NameAssignment_3_in_rule__VariableDefinition__Group__3__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__4__Impl_in_rule__VariableDefinition__Group__43546 = new BitSet(new long[]{0x0000000040018810L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__5_in_rule__VariableDefinition__Group__43549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariableDefinition__Group__4__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__5__Impl_in_rule__VariableDefinition__Group__53608 = new BitSet(new long[]{0x0000000040018810L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__6_in_rule__VariableDefinition__Group__53611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDefinition__MembersAssignment_5_in_rule__VariableDefinition__Group__5__Impl3638 = new BitSet(new long[]{0x0000000000018812L});
    public static final BitSet FOLLOW_rule__VariableDefinition__Group__6__Impl_in_rule__VariableDefinition__Group__63669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VariableDefinition__Group__6__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__03742 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__03745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__13803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__13806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionDefinition__Group__1__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__23865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__23868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__TypeAssignment_2_in_rule__FunctionDefinition__Group__2__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__33926 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__33929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__NameAssignment_3_in_rule__FunctionDefinition__Group__3__Impl3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__43986 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__43989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionDefinition__Group__4__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__54048 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__6_in_rule__FunctionDefinition__Group__54051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5__0_in_rule__FunctionDefinition__Group__5__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__6__Impl_in_rule__FunctionDefinition__Group__64109 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__7_in_rule__FunctionDefinition__Group__64112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionDefinition__Group__6__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__7__Impl_in_rule__FunctionDefinition__Group__74171 = new BitSet(new long[]{0x00000F8040198830L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__8_in_rule__FunctionDefinition__Group__74174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDefinition__Group__7__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__8__Impl_in_rule__FunctionDefinition__Group__84233 = new BitSet(new long[]{0x00000F8040198830L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__9_in_rule__FunctionDefinition__Group__84236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__MembersAssignment_8_in_rule__FunctionDefinition__Group__8__Impl4263 = new BitSet(new long[]{0x00000F8000198832L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__9__Impl_in_rule__FunctionDefinition__Group__94294 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__10_in_rule__FunctionDefinition__Group__94297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionDefinition__Group__9__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__10__Impl_in_rule__FunctionDefinition__Group__104356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10__0_in_rule__FunctionDefinition__Group__10__Impl4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5__0__Impl_in_rule__FunctionDefinition__Group_5__04436 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5__1_in_rule__FunctionDefinition__Group_5__04439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_0_in_rule__FunctionDefinition__Group_5__0__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5__1__Impl_in_rule__FunctionDefinition__Group_5__14496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5_1__0_in_rule__FunctionDefinition__Group_5__1__Impl4523 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5_1__0__Impl_in_rule__FunctionDefinition__Group_5_1__04558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5_1__1_in_rule__FunctionDefinition__Group_5_1__04561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionDefinition__Group_5_1__0__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_5_1__1__Impl_in_rule__FunctionDefinition__Group_5_1__14620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ParametersAssignment_5_1_1_in_rule__FunctionDefinition__Group_5_1__1__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10__0__Impl_in_rule__FunctionDefinition__Group_10__04681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10__1_in_rule__FunctionDefinition__Group_10__04684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionDefinition__Group_10__0__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10__1__Impl_in_rule__FunctionDefinition__Group_10__14743 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10__2_in_rule__FunctionDefinition__Group_10__14746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__UsesAssignment_10_1_in_rule__FunctionDefinition__Group_10__1__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10__2__Impl_in_rule__FunctionDefinition__Group_10__24803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10_2__0_in_rule__FunctionDefinition__Group_10__2__Impl4830 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10_2__0__Impl_in_rule__FunctionDefinition__Group_10_2__04867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10_2__1_in_rule__FunctionDefinition__Group_10_2__04870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionDefinition__Group_10_2__0__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_10_2__1__Impl_in_rule__FunctionDefinition__Group_10_2__14929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__UsesAssignment_10_2_1_in_rule__FunctionDefinition__Group_10_2__1__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__0__Impl_in_rule__FunctionParameterMember__Group__04990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__1_in_rule__FunctionParameterMember__Group__04993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__TypeAssignment_0_in_rule__FunctionParameterMember__Group__0__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__1__Impl_in_rule__FunctionParameterMember__Group__15050 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__2_in_rule__FunctionParameterMember__Group__15053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__NameAssignment_1_in_rule__FunctionParameterMember__Group__1__Impl5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__2__Impl_in_rule__FunctionParameterMember__Group__25110 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__3_in_rule__FunctionParameterMember__Group__25113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FunctionParameterMember__Group__2__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__Group__3__Impl_in_rule__FunctionParameterMember__Group__35172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameterMember__ScopeAssignment_3_in_rule__FunctionParameterMember__Group__3__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__0__Impl_in_rule__FunctionUseMember__Group__05237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__1_in_rule__FunctionUseMember__Group__05240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__TypeAssignment_0_in_rule__FunctionUseMember__Group__0__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__Group__1__Impl_in_rule__FunctionUseMember__Group__15297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUseMember__NameAssignment_1_in_rule__FunctionUseMember__Group__1__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__05358 = new BitSet(new long[]{0x0000000000018810L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__05361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__15419 = new BitSet(new long[]{0x0000000000018810L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__15422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__QualifierAssignment_1_in_rule__VariableDeclaration__Group__1__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__25480 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__25483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Alternatives_2_in_rule__VariableDeclaration__Group__2__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__35540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__0__Impl_in_rule__VariableDeclaration__Group_2_0__05606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__1_in_rule__VariableDeclaration__Group_2_0__05609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_2_0_0_in_rule__VariableDeclaration__Group_2_0__0__Impl5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_0__1__Impl_in_rule__VariableDeclaration__Group_2_0__15666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_0_1_in_rule__VariableDeclaration__Group_2_0__1__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__0__Impl_in_rule__VariableDeclaration__Group_2_1__05727 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__1_in_rule__VariableDeclaration__Group_2_1__05730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__CollectionAssignment_2_1_0_in_rule__VariableDeclaration__Group_2_1__0__Impl5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__1__Impl_in_rule__VariableDeclaration__Group_2_1__15787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__2_in_rule__VariableDeclaration__Group_2_1__15790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VariableDeclaration__Group_2_1__1__Impl5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__2__Impl_in_rule__VariableDeclaration__Group_2_1__25849 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__3_in_rule__VariableDeclaration__Group_2_1__25852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_2_1_2_in_rule__VariableDeclaration__Group_2_1__2__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__3__Impl_in_rule__VariableDeclaration__Group_2_1__35909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__4_in_rule__VariableDeclaration__Group_2_1__35912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VariableDeclaration__Group_2_1__3__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_2_1__4__Impl_in_rule__VariableDeclaration__Group_2_1__45971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_1_4_in_rule__VariableDeclaration__Group_2_1__4__Impl5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__06038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__06041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__16100 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__16103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__ConstructorAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__26160 = new BitSet(new long[]{0x0000000100180030L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__26163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VariableDeclaration__Group_3__2__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__36222 = new BitSet(new long[]{0x0000000100180030L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__4_in_rule__VariableDeclaration__Group_3__36225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3__0_in_rule__VariableDeclaration__Group_3__3__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__4__Impl_in_rule__VariableDeclaration__Group_3__46283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VariableDeclaration__Group_3__4__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3__0__Impl_in_rule__VariableDeclaration__Group_3_3__06352 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3__1_in_rule__VariableDeclaration__Group_3_3__06355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__ParametersAssignment_3_3_0_in_rule__VariableDeclaration__Group_3_3__0__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3__1__Impl_in_rule__VariableDeclaration__Group_3_3__16412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3_1__0_in_rule__VariableDeclaration__Group_3_3__1__Impl6439 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3_1__0__Impl_in_rule__VariableDeclaration__Group_3_3_1__06474 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3_1__1_in_rule__VariableDeclaration__Group_3_3_1__06477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VariableDeclaration__Group_3_3_1__0__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_3_1__1__Impl_in_rule__VariableDeclaration__Group_3_3_1__16536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__ParametersAssignment_3_3_1_1_in_rule__VariableDeclaration__Group_3_3_1__1__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__06597 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__06600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__16658 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__16661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__VariableAssignment_1_in_rule__VariableAssignment__Group__1__Impl6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__26718 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__3_in_rule__VariableAssignment__Group__26721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VariableAssignment__Group__2__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__3__Impl_in_rule__VariableAssignment__Group__36780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__ExpressionAssignment_3_in_rule__VariableAssignment__Group__3__Impl6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__0__Impl_in_rule__VariableAttribute__Group__06845 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__1_in_rule__VariableAttribute__Group__06848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__1__Impl_in_rule__VariableAttribute__Group__16906 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__2_in_rule__VariableAttribute__Group__16909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__NameAssignment_1_in_rule__VariableAttribute__Group__1__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group__2__Impl_in_rule__VariableAttribute__Group__26966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__0_in_rule__VariableAttribute__Group__2__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__0__Impl_in_rule__VariableAttribute__Group_2__07030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__1_in_rule__VariableAttribute__Group_2__07033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Alternatives_2_0_in_rule__VariableAttribute__Group_2__0__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__Group_2__1__Impl_in_rule__VariableAttribute__Group_2__17090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__AttributeAssignment_2_1_in_rule__VariableAttribute__Group_2__1__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__0__Impl_in_rule__VariableExpression__Group__07151 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__1_in_rule__VariableExpression__Group__07154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__1__Impl_in_rule__VariableExpression__Group__17212 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__2_in_rule__VariableExpression__Group__17215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__MembersAssignment_1_in_rule__VariableExpression__Group__1__Impl7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group__2__Impl_in_rule__VariableExpression__Group__27272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__0_in_rule__VariableExpression__Group__2__Impl7299 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__0__Impl_in_rule__VariableExpression__Group_2__07336 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__1_in_rule__VariableExpression__Group_2__07339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpressionOperator_in_rule__VariableExpression__Group_2__0__Impl7366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__Group_2__1__Impl_in_rule__VariableExpression__Group_2__17395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableExpression__MembersAssignment_2_1_in_rule__VariableExpression__Group_2__1__Impl7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__0__Impl_in_rule__RuleDefinition__Group__07456 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__1_in_rule__RuleDefinition__Group__07459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__1__Impl_in_rule__RuleDefinition__Group__17517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__2_in_rule__RuleDefinition__Group__17520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RuleDefinition__Group__1__Impl7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__2__Impl_in_rule__RuleDefinition__Group__27579 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__3_in_rule__RuleDefinition__Group__27582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__NameAssignment_2_in_rule__RuleDefinition__Group__2__Impl7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__3__Impl_in_rule__RuleDefinition__Group__37639 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__4_in_rule__RuleDefinition__Group__37642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RuleDefinition__Group__3__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__4__Impl_in_rule__RuleDefinition__Group__47701 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__5_in_rule__RuleDefinition__Group__47704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__0_in_rule__RuleDefinition__Group__4__Impl7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__5__Impl_in_rule__RuleDefinition__Group__57762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__6_in_rule__RuleDefinition__Group__57765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Alternatives_5_in_rule__RuleDefinition__Group__5__Impl7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group__6__Impl_in_rule__RuleDefinition__Group__67822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__0_in_rule__RuleDefinition__Group__6__Impl7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__0__Impl_in_rule__RuleDefinition__Group_4__07894 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__1_in_rule__RuleDefinition__Group_4__07897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__LhsAssignment_4_0_in_rule__RuleDefinition__Group_4__0__Impl7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4__1__Impl_in_rule__RuleDefinition__Group_4__17954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__0_in_rule__RuleDefinition__Group_4__1__Impl7981 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__0__Impl_in_rule__RuleDefinition__Group_4_1__08016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__1_in_rule__RuleDefinition__Group_4_1__08019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RuleDefinition__Group_4_1__0__Impl8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_4_1__1__Impl_in_rule__RuleDefinition__Group_4_1__18078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__LhsAssignment_4_1_1_in_rule__RuleDefinition__Group_4_1__1__Impl8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__0__Impl_in_rule__RuleDefinition__Group_6__08139 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__1_in_rule__RuleDefinition__Group_6__08142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__RhsAssignment_6_0_in_rule__RuleDefinition__Group_6__0__Impl8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6__1__Impl_in_rule__RuleDefinition__Group_6__18199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__0_in_rule__RuleDefinition__Group_6__1__Impl8226 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__0__Impl_in_rule__RuleDefinition__Group_6_1__08261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__1_in_rule__RuleDefinition__Group_6_1__08264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RuleDefinition__Group_6_1__0__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__Group_6_1__1__Impl_in_rule__RuleDefinition__Group_6_1__18323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDefinition__RhsAssignment_6_1_1_in_rule__RuleDefinition__Group_6_1__1__Impl8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__0__Impl_in_rule__RuleObject__Group__08384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__1_in_rule__RuleObject__Group__08387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__1__Impl_in_rule__RuleObject__Group__18445 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__2_in_rule__RuleObject__Group__18448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__SubobjectsAssignment_1_in_rule__RuleObject__Group__1__Impl8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group__2__Impl_in_rule__RuleObject__Group__28505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__0_in_rule__RuleObject__Group__2__Impl8532 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__0__Impl_in_rule__RuleObject__Group_2__08569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__1_in_rule__RuleObject__Group_2__08572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RuleObject__Group_2__0__Impl8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__Group_2__1__Impl_in_rule__RuleObject__Group_2__18631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleObject__SubobjectsAssignment_2_1_in_rule__RuleObject__Group_2__1__Impl8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__0__Impl_in_rule__DeviceDefinition__Group__08692 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__1_in_rule__DeviceDefinition__Group__08695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__1__Impl_in_rule__DeviceDefinition__Group__18753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__2_in_rule__DeviceDefinition__Group__18756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DeviceDefinition__Group__1__Impl8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__2__Impl_in_rule__DeviceDefinition__Group__28815 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__3_in_rule__DeviceDefinition__Group__28818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__NameAssignment_2_in_rule__DeviceDefinition__Group__2__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__3__Impl_in_rule__DeviceDefinition__Group__38875 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__4_in_rule__DeviceDefinition__Group__38878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DeviceDefinition__Group__3__Impl8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__4__Impl_in_rule__DeviceDefinition__Group__48937 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__5_in_rule__DeviceDefinition__Group__48940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DeviceDefinition__Group__4__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__5__Impl_in_rule__DeviceDefinition__Group__58999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__6_in_rule__DeviceDefinition__Group__59002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DeviceDefinition__Group__5__Impl9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__6__Impl_in_rule__DeviceDefinition__Group__69061 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__7_in_rule__DeviceDefinition__Group__69064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6__0_in_rule__DeviceDefinition__Group__6__Impl9091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__7__Impl_in_rule__DeviceDefinition__Group__79121 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__8_in_rule__DeviceDefinition__Group__79124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DeviceDefinition__Group__7__Impl9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__8__Impl_in_rule__DeviceDefinition__Group__89183 = new BitSet(new long[]{0x0000000100180030L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__9_in_rule__DeviceDefinition__Group__89186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DeviceDefinition__Group__8__Impl9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__9__Impl_in_rule__DeviceDefinition__Group__99245 = new BitSet(new long[]{0x0000000100180030L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__10_in_rule__DeviceDefinition__Group__99248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9__0_in_rule__DeviceDefinition__Group__9__Impl9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__10__Impl_in_rule__DeviceDefinition__Group__109306 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__11_in_rule__DeviceDefinition__Group__109309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DeviceDefinition__Group__10__Impl9337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__11__Impl_in_rule__DeviceDefinition__Group__119368 = new BitSet(new long[]{0x0000000040018810L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__12_in_rule__DeviceDefinition__Group__119371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DeviceDefinition__Group__11__Impl9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__12__Impl_in_rule__DeviceDefinition__Group__129430 = new BitSet(new long[]{0x0000000040018810L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__13_in_rule__DeviceDefinition__Group__129433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12__0_in_rule__DeviceDefinition__Group__12__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group__13__Impl_in_rule__DeviceDefinition__Group__139491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DeviceDefinition__Group__13__Impl9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6__0__Impl_in_rule__DeviceDefinition__Group_6__09578 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6__1_in_rule__DeviceDefinition__Group_6__09581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__PartsAssignment_6_0_in_rule__DeviceDefinition__Group_6__0__Impl9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6__1__Impl_in_rule__DeviceDefinition__Group_6__19638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6_1__0_in_rule__DeviceDefinition__Group_6__1__Impl9665 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6_1__0__Impl_in_rule__DeviceDefinition__Group_6_1__09700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6_1__1_in_rule__DeviceDefinition__Group_6_1__09703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DeviceDefinition__Group_6_1__0__Impl9731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_6_1__1__Impl_in_rule__DeviceDefinition__Group_6_1__19762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__PartsAssignment_6_1_1_in_rule__DeviceDefinition__Group_6_1__1__Impl9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9__0__Impl_in_rule__DeviceDefinition__Group_9__09823 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9__1_in_rule__DeviceDefinition__Group_9__09826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__ParametersAssignment_9_0_in_rule__DeviceDefinition__Group_9__0__Impl9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9__1__Impl_in_rule__DeviceDefinition__Group_9__19883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9_1__0_in_rule__DeviceDefinition__Group_9__1__Impl9910 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9_1__0__Impl_in_rule__DeviceDefinition__Group_9_1__09945 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9_1__1_in_rule__DeviceDefinition__Group_9_1__09948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DeviceDefinition__Group_9_1__0__Impl9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_9_1__1__Impl_in_rule__DeviceDefinition__Group_9_1__110007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__ParametersAssignment_9_1_1_in_rule__DeviceDefinition__Group_9_1__1__Impl10034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12__0__Impl_in_rule__DeviceDefinition__Group_12__010068 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12__1_in_rule__DeviceDefinition__Group_12__010071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__MembersAssignment_12_0_in_rule__DeviceDefinition__Group_12__0__Impl10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12__1__Impl_in_rule__DeviceDefinition__Group_12__110128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12_1__0_in_rule__DeviceDefinition__Group_12__1__Impl10155 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12_1__0__Impl_in_rule__DeviceDefinition__Group_12_1__010190 = new BitSet(new long[]{0x0000000000018810L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12_1__1_in_rule__DeviceDefinition__Group_12_1__010193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DeviceDefinition__Group_12_1__0__Impl10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__Group_12_1__1__Impl_in_rule__DeviceDefinition__Group_12_1__110252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeviceDefinition__MembersAssignment_12_1_1_in_rule__DeviceDefinition__Group_12_1__1__Impl10279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__0__Impl_in_rule__ATGCDefinition__Group__010313 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__1_in_rule__ATGCDefinition__Group__010316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__1__Impl_in_rule__ATGCDefinition__Group__110374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__2_in_rule__ATGCDefinition__Group__110377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ATGCDefinition__Group__1__Impl10405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__2__Impl_in_rule__ATGCDefinition__Group__210436 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__3_in_rule__ATGCDefinition__Group__210439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__CommandAssignment_2_in_rule__ATGCDefinition__Group__2__Impl10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__3__Impl_in_rule__ATGCDefinition__Group__310496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__4_in_rule__ATGCDefinition__Group__310499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ATGCDefinition__Group__3__Impl10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__4__Impl_in_rule__ATGCDefinition__Group__410558 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__5_in_rule__ATGCDefinition__Group__410561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__ArgumentsAssignment_4_in_rule__ATGCDefinition__Group__4__Impl10588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group__5__Impl_in_rule__ATGCDefinition__Group__510618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group_5__0_in_rule__ATGCDefinition__Group__5__Impl10645 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group_5__0__Impl_in_rule__ATGCDefinition__Group_5__010688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group_5__1_in_rule__ATGCDefinition__Group_5__010691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ATGCDefinition__Group_5__0__Impl10719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__Group_5__1__Impl_in_rule__ATGCDefinition__Group_5__110750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ATGCDefinition__ArgumentsAssignment_5_1_in_rule__ATGCDefinition__Group_5__1__Impl10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__0__Impl_in_rule__PropertyDefinition__Group_0__010811 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__1_in_rule__PropertyDefinition__Group_0__010814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__1__Impl_in_rule__PropertyDefinition__Group_0__110872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__2_in_rule__PropertyDefinition__Group_0__110875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PropertyDefinition__Group_0__1__Impl10903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__2__Impl_in_rule__PropertyDefinition__Group_0__210934 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__3_in_rule__PropertyDefinition__Group_0__210937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_0_2_in_rule__PropertyDefinition__Group_0__2__Impl10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__3__Impl_in_rule__PropertyDefinition__Group_0__310994 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__4_in_rule__PropertyDefinition__Group_0__310997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PropertyDefinition__Group_0__3__Impl11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_0__4__Impl_in_rule__PropertyDefinition__Group_0__411056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ArgumentsAssignment_0_4_in_rule__PropertyDefinition__Group_0__4__Impl11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_1__0__Impl_in_rule__PropertyDefinition__Group_1__011123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_1__1_in_rule__PropertyDefinition__Group_1__011126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PropertyDefinition__Group_1__0__Impl11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_1__1__Impl_in_rule__PropertyDefinition__Group_1__111185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ArgumentsAssignment_1_1_in_rule__PropertyDefinition__Group_1__1__Impl11212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__011246 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__011249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Alternatives_0_in_rule__Decimal__Group__0__Impl11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__111307 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__111310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group__1__Impl11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__211366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Group_2__0_in_rule__Decimal__Group__2__Impl11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Group_2__0__Impl_in_rule__Decimal__Group_2__011430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Decimal__Group_2__1_in_rule__Decimal__Group_2__011433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Decimal__Group_2__0__Impl11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decimal__Group_2__1__Impl_in_rule__Decimal__Group_2__111492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group_2__1__Impl11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__0__Impl_in_rule__DecimalExp__Group__011552 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__1_in_rule__DecimalExp__Group__011555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Alternatives_0_in_rule__DecimalExp__Group__0__Impl11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__1__Impl_in_rule__DecimalExp__Group__111613 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__2_in_rule__DecimalExp__Group__111616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalExp__Group__1__Impl11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__2__Impl_in_rule__DecimalExp__Group__211672 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__3_in_rule__DecimalExp__Group__211675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group_2__0_in_rule__DecimalExp__Group__2__Impl11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__3__Impl_in_rule__DecimalExp__Group__311733 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__4_in_rule__DecimalExp__Group__311736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Alternatives_3_in_rule__DecimalExp__Group__3__Impl11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__4__Impl_in_rule__DecimalExp__Group__411793 = new BitSet(new long[]{0x0000000000180020L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__5_in_rule__DecimalExp__Group__411796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Alternatives_4_in_rule__DecimalExp__Group__4__Impl11823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group__5__Impl_in_rule__DecimalExp__Group__511854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalExp__Group__5__Impl11881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group_2__0__Impl_in_rule__DecimalExp__Group_2__011922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group_2__1_in_rule__DecimalExp__Group_2__011925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DecimalExp__Group_2__0__Impl11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalExp__Group_2__1__Impl_in_rule__DecimalExp__Group_2__111984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalExp__Group_2__1__Impl12011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMember_in_rule__Model__MembersAssignment_112049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_212080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDefinition__TypeAssignment_212111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDefinition__NameAssignment_312142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinitionMember_in_rule__VariableDefinition__MembersAssignment_512173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDefinition__TypeAssignment_212204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_312235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_5_012266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterMember_in_rule__FunctionDefinition__ParametersAssignment_5_1_112297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinitionMember_in_rule__FunctionDefinition__MembersAssignment_812328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_10_112359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUseMember_in_rule__FunctionDefinition__UsesAssignment_10_2_112390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameterMember__TypeAssignment_012421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameterMember__NameAssignment_112452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterScope_in_rule__FunctionParameterMember__ScopeAssignment_312483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionUseMember__TypeAssignment_012514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionUseMember__NameAssignment_112545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableQualifier_in_rule__VariableDeclaration__QualifierAssignment_112576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__TypeAssignment_2_0_012607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_0_112638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionID_in_rule__VariableDeclaration__CollectionAssignment_2_1_012669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__TypeAssignment_2_1_212700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_2_1_412731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__ConstructorAssignment_3_112762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__VariableDeclaration__ParametersAssignment_3_3_012793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__VariableDeclaration__ParametersAssignment_3_3_1_112824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableAssignment__VariableAssignment_112855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_rule__VariableAssignment__ExpressionAssignment_312886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAttribute__NameAlternatives_1_0_in_rule__VariableAttribute__NameAssignment_112917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAttribute__AttributeAssignment_2_112950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_112981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_rule__VariableExpression__MembersAssignment_2_113012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleDefinition__NameAssignment_213043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_013074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__LhsAssignment_4_1_113105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_013136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleObject_in_rule__RuleDefinition__RhsAssignment_6_1_113167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_113198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleObject__SubobjectsAssignment_2_113229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeviceDefinition__NameAssignment_213260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeviceDefinition__PartsAssignment_6_013291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeviceDefinition__PartsAssignment_6_1_113322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__DeviceDefinition__ParametersAssignment_9_013353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__DeviceDefinition__ParametersAssignment_9_1_113384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__DeviceDefinition__MembersAssignment_12_013415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__DeviceDefinition__MembersAssignment_12_1_113446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ATGCDefinition__CommandAssignment_213477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ATGCDefinition__ArgumentsAssignment_413508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ATGCDefinition__ArgumentsAssignment_5_113539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyDefinition__NameAssignment_0_213570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyDefinition__ArgumentsAssignment_0_413601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyDefinition__ArgumentsAssignment_1_113632 = new BitSet(new long[]{0x0000000000000002L});

}