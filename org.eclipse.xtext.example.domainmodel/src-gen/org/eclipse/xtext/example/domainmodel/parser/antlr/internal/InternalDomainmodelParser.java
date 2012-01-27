package org.eclipse.xtext.example.domainmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'{'", "'}'", "'entity'", "'extends'", "':'", "'->'", "'<-'", "'op'", "'('", "','", "')'", "'.'", "'*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
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
    public static final int T__59=59;
    public static final int RULE_INT=4;
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
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;
     	
        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainModelRule()); 
            }
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:76:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainModel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:106:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:107:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:108:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:115:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Import_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:118:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Entity_1= ruleEntity | this_Import_2= ruleImport )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:120:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleAbstractElement223);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PackageDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:130:5: this_Entity_1= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractElement250);
                    this_Entity_1=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entity_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:140:5: this_Import_2= ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement277);
                    this_Import_2=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Import_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:156:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:157:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:158:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport312);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport322); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:165:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:168:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:169:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:169:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:169:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:173:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:174:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:174:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:175:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport380);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:199:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:200:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:201:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration416);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration426); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:208:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:211:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:212:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:212:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:212:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:216:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:217:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:217:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:218:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration484);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:238:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:239:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:239:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:240:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration517);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleEntity"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:268:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:269:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:270:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity566);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity576); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:277:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_superType_3_0 = null;

        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:280:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:281:1: (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:281:1: (otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:281:3: otherlv_0= 'entity' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEntity613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:285:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:286:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:286:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:287:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleEntity634);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntityRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:303:2: (otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:303:4: otherlv_2= 'extends' ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEntity647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:307:1: ( (lv_superType_3_0= ruleJvmParameterizedTypeReference ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:308:1: (lv_superType_3_0= ruleJvmParameterizedTypeReference )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:308:1: (lv_superType_3_0= ruleJvmParameterizedTypeReference )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:309:3: lv_superType_3_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeJvmParameterizedTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleEntity668);
                    lv_superType_3_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"superType",
                              		lv_superType_3_0, 
                              		"JvmParameterizedTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:329:1: ( (lv_features_5_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:330:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:330:1: (lv_features_5_0= ruleFeature )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:331:3: lv_features_5_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity703);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_5_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEntity716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:359:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:360:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:361:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature752);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature762); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:368:1: ruleFeature returns [EObject current=null] : (this_Property_0= ruleProperty | this_Operation_1= ruleOperation ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Property_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:371:28: ( (this_Property_0= ruleProperty | this_Operation_1= ruleOperation ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:372:1: (this_Property_0= ruleProperty | this_Operation_1= ruleOperation )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:372:1: (this_Property_0= ruleProperty | this_Operation_1= ruleOperation )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:373:5: this_Property_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleFeature809);
                    this_Property_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Property_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:383:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleFeature836);
                    this_Operation_1=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleProperty"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:399:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:400:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:401:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty871);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty881); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:408:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '->' ( ( ruleQualifiedName ) ) )? (otherlv_5= '<-' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:411:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '->' ( ( ruleQualifiedName ) ) )? (otherlv_5= '<-' ( ( ruleQualifiedName ) ) )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:412:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '->' ( ( ruleQualifiedName ) ) )? (otherlv_5= '<-' ( ( ruleQualifiedName ) ) )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:412:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '->' ( ( ruleQualifiedName ) ) )? (otherlv_5= '<-' ( ( ruleQualifiedName ) ) )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:412:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) (otherlv_3= '->' ( ( ruleQualifiedName ) ) )? (otherlv_5= '<-' ( ( ruleQualifiedName ) ) )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:412:2: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:413:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:413:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:414:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleProperty927);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleProperty939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:434:1: ( (lv_type_2_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:435:1: (lv_type_2_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:435:1: (lv_type_2_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:436:3: lv_type_2_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleProperty960);
            lv_type_2_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:452:2: (otherlv_3= '->' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:452:4: otherlv_3= '->' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleProperty973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:456:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:457:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:457:1: ( ruleQualifiedName )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:458:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getMappedByPropertyCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProperty996);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:471:4: (otherlv_5= '<-' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:471:6: otherlv_5= '<-' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleProperty1011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getLessThanSignHyphenMinusKeyword_4_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:475:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:476:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:476:1: ( ruleQualifiedName )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:477:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getReflectsOnPropertyCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProperty1034);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleOperation"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:498:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:499:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:500:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1072);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1082); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:507:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleJvmTypeReference ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:510:28: ( (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleJvmTypeReference ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:511:1: (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleJvmTypeReference ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:511:1: (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleJvmTypeReference ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:511:3: otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleJvmTypeReference ) ) ( (lv_body_9_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOperation1119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:515:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:516:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:516:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:517:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleOperation1140);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleOperation1152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:537:1: ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==21||LA10_0==73) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:537:2: ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:537:2: ( (lv_params_3_0= ruleFullJvmFormalParameter ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:538:1: (lv_params_3_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:538:1: (lv_params_3_0= ruleFullJvmFormalParameter )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:539:3: lv_params_3_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsFullJvmFormalParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation1174);
                    lv_params_3_0=ruleFullJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"FullJvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:555:2: (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:555:4: otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleOperation1187); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:559:1: ( (lv_params_5_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:560:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:560:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:561:3: lv_params_5_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsFullJvmFormalParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation1208);
                    	    lv_params_5_0=ruleFullJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"FullJvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleOperation1224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleOperation1236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getColonKeyword_5());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:585:1: ( (lv_type_8_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:586:1: (lv_type_8_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:586:1: (lv_type_8_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:587:3: lv_type_8_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getTypeJvmTypeReferenceParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleOperation1257);
            lv_type_8_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_8_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:603:2: ( (lv_body_9_0= ruleXBlockExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:604:1: (lv_body_9_0= ruleXBlockExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:604:1: (lv_body_9_0= ruleXBlockExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:605:3: lv_body_9_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBodyXBlockExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleOperation1278);
            lv_body_9_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_9_0, 
                      		"XBlockExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:629:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:630:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:631:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1315);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:638:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:641:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:642:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:642:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:643:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1373);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:653:1: (kw= '.' kw= '*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:654:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifiedNameWithWildCard1392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifiedNameWithWildCard1405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:673:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:674:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:675:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1447);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:682:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:685:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:687:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1503);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:703:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:704:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:705:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1537);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1547); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:712:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:715:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:716:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:716:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_INT && LA13_1<=RULE_ID)||(LA13_1>=13 && LA13_1<=14)||(LA13_1>=17 && LA13_1<=18)||(LA13_1>=21 && LA13_1<=25)||(LA13_1>=27 && LA13_1<=47)||(LA13_1>=49 && LA13_1<=73)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==26) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||LA13_0==13||LA13_0==21||LA13_0==36||(LA13_0>=38 && LA13_0<=39)||LA13_0==43||LA13_0==47||LA13_0==51||LA13_0==53||(LA13_0>=56 && LA13_0<=58)||LA13_0==61||(LA13_0>=63 && LA13_0<=70)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:716:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:716:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:716:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:716:3: ()
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:717:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:722:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:723:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:723:1: ( ruleValidID )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:724:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1605);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1621);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:745:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:746:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:746:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:747:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1641);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:764:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:764:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:765:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1671);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==27) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred1_InternalDomainmodel()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:778:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:778:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:778:7: ()
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:779:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:784:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:785:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:785:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:786:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1724);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:799:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:800:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:800:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:801:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1747);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:825:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:826:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:827:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1787);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:834:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:837:28: (kw= '=' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:839:2: kw= '='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpSingleAssign1835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:852:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:853:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:854:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1875);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:861:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:864:28: (kw= '+=' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:866:2: kw= '+='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign1923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:879:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:880:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:881:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1962);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1972); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:888:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:891:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:892:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:892:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:893:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2019);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred2_InternalDomainmodel()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:906:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:906:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:906:7: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:907:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:912:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:913:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:913:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:914:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2072);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:927:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:928:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:928:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:929:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2095);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:953:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:954:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:955:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2134);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2145); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:962:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:965:28: (kw= '||' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:967:2: kw= '||'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOr2182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:980:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:981:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:982:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2221);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2231); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:989:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:992:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:993:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:993:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:994:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2278);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred3_InternalDomainmodel()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1007:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1007:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1007:7: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1008:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1013:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1014:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1014:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1015:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2331);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1028:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1029:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1029:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1030:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2354);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1054:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1055:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1056:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2393);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2404); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1063:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1066:28: (kw= '&&' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1068:2: kw= '&&'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAnd2441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1081:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1082:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1083:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2480);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1090:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1093:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1094:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1094:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1095:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2537);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred4_InternalDomainmodel()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==31) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred4_InternalDomainmodel()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1108:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1108:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1108:7: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1114:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1115:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1115:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1116:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2590);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1129:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1130:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1130:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1131:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2613);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1155:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1156:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1157:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2652);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2663); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1164:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1167:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1168:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1168:1: (kw= '==' | kw= '!=' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1169:2: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality2701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1176:2: kw= '!='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1189:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1190:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1191:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2760);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2770); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1198:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1201:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1202:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1202:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1203:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2817);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop18:
            do {
                int alt18=3;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred5_InternalDomainmodel()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred6_InternalDomainmodel()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred6_InternalDomainmodel()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred6_InternalDomainmodel()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA18_6 = input.LA(2);

                    if ( (synpred6_InternalDomainmodel()) ) {
                        alt18=2;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1213:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1213:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1213:6: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1214:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression2853); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1223:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1224:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1224:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1225:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2876);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1247:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1247:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1247:7: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1248:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1253:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1254:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1254:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1255:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2937);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1268:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1269:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1269:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1270:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2960);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1294:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1295:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1296:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3000);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3011); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1303:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1306:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1307:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1307:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1308:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare3049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1315:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1322:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1329:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1342:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1343:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1344:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3146);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3156); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1351:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1354:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1355:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1355:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1356:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3203);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred7_InternalDomainmodel()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==37) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred7_InternalDomainmodel()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1369:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1369:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1369:7: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1370:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1375:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1376:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1376:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1377:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3256);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1390:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1391:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1391:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1392:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3279);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1416:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1417:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1418:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3318);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3329); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1425:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1428:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1429:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1429:1: (kw= '->' | kw= '..' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1430:2: kw= '->'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpOther3367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1437:2: kw= '..'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1450:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1451:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1452:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3426);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3436); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1459:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1462:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1463:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1463:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1464:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3483);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred8_InternalDomainmodel()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==39) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred8_InternalDomainmodel()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1477:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1477:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1477:7: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1478:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1483:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1484:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1484:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1485:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3536);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1498:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1499:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1499:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1500:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3559);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1524:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1525:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1526:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3598);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3609); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1533:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1536:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1537:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1537:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            else if ( (LA23_0==39) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1538:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpAdd3647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1545:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1558:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1559:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1560:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3706);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3716); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1567:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1570:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1571:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1571:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1572:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3763);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred9_InternalDomainmodel()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred9_InternalDomainmodel()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred9_InternalDomainmodel()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred9_InternalDomainmodel()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1585:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1585:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1585:7: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1586:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1591:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1592:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1592:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1593:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3816);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1606:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1607:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1607:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1608:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3839);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1632:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1633:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1634:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3878);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3889); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1641:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1644:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1645:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1645:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case 42:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1646:2: kw= '*'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpMulti3927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1653:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1660:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1667:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1680:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1681:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1682:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4024);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4034); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1689:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1692:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1693:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1693:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=38 && LA26_0<=39)||LA26_0==43) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_ID)||LA26_0==13||LA26_0==21||LA26_0==36||LA26_0==47||LA26_0==51||LA26_0==53||(LA26_0>=56 && LA26_0<=58)||LA26_0==61||(LA26_0>=63 && LA26_0<=70)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1693:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1693:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1693:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1693:3: ()
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1694:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1699:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1700:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1700:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1701:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4092);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1714:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1715:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1715:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1716:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4113);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1734:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4142);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1750:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1751:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1752:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4178);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4189); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1759:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1762:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1763:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1763:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 38:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1764:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1771:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1778:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary4265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1791:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1792:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1793:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4305);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4315); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1800:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1803:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1804:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1804:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1805:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4362);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred10_InternalDomainmodel()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1815:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1815:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1815:6: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1816:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression4397); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1825:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1826:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1826:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1827:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4420);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1851:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1852:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1853:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4458);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1860:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1863:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1864:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1864:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1865:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4515);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred11_InternalDomainmodel()) ) {
                        alt36=1;
                    }
                    else if ( (synpred12_InternalDomainmodel()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred12_InternalDomainmodel()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred12_InternalDomainmodel()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1879:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1879:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1879:26: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1880:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall4564); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1889:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1890:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1890:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1891:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4587);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4603);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1912:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1913:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1913:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1914:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4625);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1947:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1947:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1947:8: ()
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1948:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1953:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 24:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1953:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall4711); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1958:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1958:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1959:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1959:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1960:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4735); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1974:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1974:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1975:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1975:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1976:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4772); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1989:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==36) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1989:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall4801); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1993:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1994:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1994:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1995:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4822);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2011:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==22) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2011:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall4835); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2015:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2016:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2016:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2017:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4856);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall4870); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2037:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2038:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2038:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2039:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4895);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2052:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2052:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2052:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2052:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2059:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2060:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall4929); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2090:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2091:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5014);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2108:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2108:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2108:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2108:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2109:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2109:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2110:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5042);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2126:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==22) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2126:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall5055); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2130:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2131:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2131:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2132:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5076);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

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
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall5093); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2152:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2152:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2157:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2158:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5126);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2182:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2183:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2184:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5166);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2191:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2194:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2195:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2195:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt37=1;
                }
                break;
            case 13:
                {
                alt37=2;
                }
                break;
            case 53:
                {
                alt37=3;
                }
                break;
            case RULE_ID:
            case 36:
            case 61:
                {
                alt37=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 47:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt37=5;
                }
                break;
            case 51:
                {
                alt37=6;
                }
                break;
            case 56:
                {
                alt37=7;
                }
                break;
            case 57:
                {
                alt37=8;
                }
                break;
            case 58:
                {
                alt37=9;
                }
                break;
            case 68:
                {
                alt37=10;
                }
                break;
            case 69:
                {
                alt37=11;
                }
                break;
            case 70:
                {
                alt37=12;
                }
                break;
            case 21:
                {
                alt37=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2196:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5223);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2206:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5250);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2216:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5277);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2226:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5304);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2236:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5331);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2246:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5358);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2256:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5385);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2266:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5412);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2276:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5439);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2286:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5466);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2296:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5493);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2306:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5520);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2316:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5547);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2332:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2333:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2334:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5582);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5592); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2341:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2344:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2345:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2345:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt38=1;
                }
                break;
            case 64:
            case 65:
                {
                alt38=2;
                }
                break;
            case RULE_INT:
                {
                alt38=3;
                }
                break;
            case 66:
                {
                alt38=4;
                }
                break;
            case RULE_STRING:
                {
                alt38=5;
                }
                break;
            case 67:
                {
                alt38=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2346:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5639);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2356:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5666);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2366:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5693);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2376:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5720);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2386:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5747);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2396:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5774);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2412:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2413:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2414:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5809);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5819); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2421:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2424:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2425:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2425:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2425:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2425:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2426:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2450:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2450:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2450:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==21||LA40_0==73) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2450:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2450:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2451:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2451:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2452:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5936);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2468:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==22) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2468:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXClosure5949); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2472:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2473:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2473:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2474:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5970);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

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

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2490:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2491:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2491:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2492:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2505:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2506:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2506:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2507:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6029);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXClosure6041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2535:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2536:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2537:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6077);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6087); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2544:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2547:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2548:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2548:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2548:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2548:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2549:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2554:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_ID)||LA43_0==13||LA43_0==21||LA43_0==36||(LA43_0>=38 && LA43_0<=39)||LA43_0==43||LA43_0==47||LA43_0==51||LA43_0==53||(LA43_0>=56 && LA43_0<=61)||(LA43_0>=63 && LA43_0<=70)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2554:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2554:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2555:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2555:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2556:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6143);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2572:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==50) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2572:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXExpressionInClosure6156); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2584:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2585:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2586:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6196);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6206); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2593:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2596:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2597:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2597:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2597:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2597:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2597:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2613:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2613:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2613:7: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2614:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2619:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==21||LA45_0==73) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2619:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2619:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2620:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2620:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2621:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6314);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2637:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==22) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2637:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXShortClosure6327); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2641:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2642:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2642:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2643:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6348);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2659:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2660:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2660:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2661:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure6370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2674:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2675:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2675:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2676:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6406);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2700:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2701:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2702:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6442);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2709:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2712:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2713:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2713:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2713:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleXParenthesizedExpression6489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6511);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXParenthesizedExpression6522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2738:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2739:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2740:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6558);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6568); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2747:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2750:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2751:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2751:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2751:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2751:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2752:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression6626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2765:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2766:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2766:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2767:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6647);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXIfExpression6659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2787:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2788:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2788:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2789:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6680);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2805:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred18_InternalDomainmodel()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2805:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2805:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2805:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2810:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2811:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2811:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2812:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6723);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2836:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2837:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2838:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6761);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6771); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2845:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2848:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2849:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2849:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2849:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2849:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2850:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2859:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==17) && (synpred19_InternalDomainmodel())) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2859:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2864:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2864:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2864:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2865:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2865:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2866:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6858);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2886:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2887:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2887:1: (lv_switch_4_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2888:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6894);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression6906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2908:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID||LA48_0==17||LA48_0==21||LA48_0==55||LA48_0==73) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2909:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2909:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2910:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6927);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2926:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2926:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2934:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2935:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2935:1: (lv_default_9_0= ruleXExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2936:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6974);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleXSwitchExpression6988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2964:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2965:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2966:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7024);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7034); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2973:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2976:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2977:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2977:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2977:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2977:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==21||LA50_0==73) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2978:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2978:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2979:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7080);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2995:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2995:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart7094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2999:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3000:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3000:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3001:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7115);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleXCasePart7129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3021:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3022:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3022:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3023:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7150);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3047:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3048:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3049:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7186);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3056:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3059:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3060:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3060:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3060:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3060:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3061:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression7242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3074:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3075:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3075:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3076:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7275);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXForLoopExpression7287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3096:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3097:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3097:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3098:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7308);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXForLoopExpression7320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3118:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3119:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3119:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3120:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7341);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3144:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3145:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3146:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7377);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3153:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3156:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3157:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3157:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3157:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3157:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3158:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression7433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXWhileExpression7445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3171:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3172:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3172:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3173:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7466);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXWhileExpression7478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3193:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3194:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3194:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3195:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7499);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3219:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3220:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3221:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7535);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7545); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3228:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3231:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3232:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3232:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3232:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3232:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3233:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression7591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3242:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3243:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3243:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3244:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7612);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression7624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXDoWhileExpression7636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3268:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3269:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3269:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3270:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7657);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXDoWhileExpression7669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3298:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3299:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3300:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7705);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7715); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3307:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3310:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3311:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3311:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3311:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3311:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3312:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3321:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_INT && LA53_0<=RULE_ID)||LA53_0==13||LA53_0==21||LA53_0==36||(LA53_0>=38 && LA53_0<=39)||LA53_0==43||LA53_0==47||LA53_0==51||LA53_0==53||(LA53_0>=56 && LA53_0<=61)||(LA53_0>=63 && LA53_0<=70)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3321:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3321:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3322:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3322:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3323:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7783);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3339:2: (otherlv_3= ';' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==50) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3339:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression7796); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression7812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3355:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3356:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3357:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7848);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7858); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3364:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3367:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3368:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3368:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=59 && LA54_0<=60)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_ID)||LA54_0==13||LA54_0==21||LA54_0==36||(LA54_0>=38 && LA54_0<=39)||LA54_0==43||LA54_0==47||LA54_0==51||LA54_0==53||(LA54_0>=56 && LA54_0<=58)||LA54_0==61||(LA54_0>=63 && LA54_0<=70)) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3369:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7905);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3379:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7932);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3395:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3396:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3397:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7967);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7977); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3404:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3407:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3408:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3408:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3408:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3408:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3409:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3414:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==59) ) {
                alt55=1;
            }
            else if ( (LA55_0==60) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3414:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3414:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3415:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3415:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3416:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration8030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3430:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration8061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred20_InternalDomainmodel()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA56_0==21) && (synpred20_InternalDomainmodel())) {
                alt56=1;
            }
            else if ( (LA56_0==73) && (synpred20_InternalDomainmodel())) {
                alt56=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3442:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3442:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3442:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3443:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3443:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3444:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8109);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3460:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3461:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3461:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3462:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8130);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3479:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3479:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3480:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3480:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3481:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8159);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3497:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==26) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3497:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXVariableDeclaration8173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3501:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3502:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3502:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3503:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8194);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3527:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3528:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3529:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8232);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8242); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3536:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3539:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3540:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3540:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3540:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3540:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_ID||LA58_1==24||LA58_1==36||LA58_1==47) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==21||LA58_0==73) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3541:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3541:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3542:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8288);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3558:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3559:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3559:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3560:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8310);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3584:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3585:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3586:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8346);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8356); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3593:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3596:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3597:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3597:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3597:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3597:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3598:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3598:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3599:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8402);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3615:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3616:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3616:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3617:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8423);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3641:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3642:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3643:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8459);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8469); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3650:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3653:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3654:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3654:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3654:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3654:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3655:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3660:2: ( ( ruleStaticQualifier ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==62) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3661:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3661:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3662:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8526);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3675:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==36) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3675:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall8540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3679:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3680:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3680:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3681:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8561);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3697:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==22) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3697:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall8574); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3701:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3702:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3702:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3703:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8595);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall8609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3723:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3724:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3724:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3725:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8634);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3738:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3738:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3738:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3738:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3745:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3746:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall8668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt63=3;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3776:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3777:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8753);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3794:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3794:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3794:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3794:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3795:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3795:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3796:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8781);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3812:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==22) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3812:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall8794); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3816:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3817:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3817:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3818:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8815);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop62;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall8832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3838:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3838:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3843:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3844:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8865);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3868:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3869:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3870:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8903);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8914); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3877:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3880:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3881:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3881:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==61) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3882:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8961);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3894:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3907:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3908:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3909:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9026);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9037); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3916:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3919:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3920:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3920:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID) ) {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==62) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3921:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9084);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier9102); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3945:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3946:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3947:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9143);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9153); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3954:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3957:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3958:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3958:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3958:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3958:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3959:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall9199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3968:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3969:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3969:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3970:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9222);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3983:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==36) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3983:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall9235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3987:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3988:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3988:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3989:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9256);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4005:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==22) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4005:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9269); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4009:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4010:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4010:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4011:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9290);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall9304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt71=3;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4052:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4053:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9390);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4070:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4070:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4070:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4070:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4071:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4071:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4072:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9418);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4088:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==22) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4088:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9431); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4092:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4093:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4093:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4094:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9452);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall9469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4114:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4114:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4119:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4120:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9500);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4144:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4145:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4146:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9537);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9547); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4153:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4156:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4157:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4157:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4157:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4157:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4158:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4163:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==64) ) {
                alt73=1;
            }
            else if ( (LA73_0==65) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4163:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral9594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4168:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4168:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4169:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4169:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4170:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4191:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4192:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4193:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9668);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9678); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4200:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4203:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4204:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4204:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4204:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4204:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4205:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral9724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4222:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4223:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4224:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9760);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9770); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4231:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4234:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4235:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4235:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4235:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4235:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4236:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4241:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4242:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4242:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4243:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4267:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4268:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4269:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9862);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9872); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4276:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4279:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4280:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4280:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4280:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4280:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4281:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4286:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4287:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4287:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4288:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4312:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4313:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4314:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9964);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9974); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4321:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4324:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4325:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4325:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4325:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4325:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4326:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral10020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXTypeLiteral10032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4339:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4340:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4340:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4341:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10055);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXTypeLiteral10067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4366:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4367:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4368:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10103);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10113); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4375:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4378:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4379:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4379:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4379:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4379:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4380:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression10159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4389:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4390:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4390:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4391:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10180);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4415:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4416:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4417:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10216);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4424:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4427:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4428:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4428:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4428:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4428:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4429:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression10272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4438:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4438:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4443:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4444:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10303);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4468:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4469:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4470:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10340);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10350); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4477:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4480:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4481:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4481:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4481:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4481:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4482:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4491:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4492:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4492:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4493:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10417);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==72) ) {
                alt77=1;
            }
            else if ( (LA77_0==71) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==72) ) {
                            int LA75_2 = input.LA(2);

                            if ( (synpred27_InternalDomainmodel()) ) {
                                alt75=1;
                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4511:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4512:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10447);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4528:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==71) ) {
                        int LA76_1 = input.LA(2);

                        if ( (synpred28_InternalDomainmodel()) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4528:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4528:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4528:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10469); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4533:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4534:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4534:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4535:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10491);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4552:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4552:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4552:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4556:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4557:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4557:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4558:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10534);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4582:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4583:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4584:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10572);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4591:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4594:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4595:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4595:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4595:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4595:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4595:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause10627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleXCatchClause10640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4604:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4605:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4605:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4606:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10661);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXCatchClause10673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4626:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4627:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4627:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4628:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10694);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4652:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4653:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4654:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10731);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10742); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4661:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4664:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4665:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4665:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4666:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10789);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4676:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==24) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==RULE_ID) ) {
                        int LA78_3 = input.LA(3);

                        if ( (synpred30_InternalDomainmodel()) ) {
                            alt78=1;
                        }


                    }


                }


                switch (alt78) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4676:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4676:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4676:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifiedName10817); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10840);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4703:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4704:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4705:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10887);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10897); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4712:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4715:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4716:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4716:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==21||LA80_0==73) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4716:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4716:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4717:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10945);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4725:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==47) ) {
                            int LA79_2 = input.LA(2);

                            if ( (LA79_2==49) ) {
                                int LA79_3 = input.LA(3);

                                if ( (synpred31_InternalDomainmodel()) ) {
                                    alt79=1;
                                }


                            }


                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4725:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4728:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4728:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4728:6: ()
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4729:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference10983); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference10995); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4744:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11027);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4760:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4761:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4762:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11062);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11072); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4769:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4772:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4773:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4773:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4773:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4773:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==21) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4773:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef11110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4777:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_ID||LA82_0==21||LA82_0==73) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4777:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4777:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4778:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4778:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4779:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11132);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4795:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==22) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4795:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXFunctionTypeRef11145); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4799:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4800:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4800:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4801:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11166);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

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

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXFunctionTypeRef11182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleXFunctionTypeRef11196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4825:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4826:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4826:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4827:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11217);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4851:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4852:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4853:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11253);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11263); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4860:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4863:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4864:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4864:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4864:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4864:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4865:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4865:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4866:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11311);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4879:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4879:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4879:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4879:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference11332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4884:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4885:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4885:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4886:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11354);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4902:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==22) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4902:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleJvmParameterizedTypeReference11367); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4906:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4907:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4907:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4908:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11388);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference11402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4936:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4937:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4938:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11440);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11450); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4945:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4948:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4949:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4949:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==21||LA86_0==73) ) {
                alt86=1;
            }
            else if ( (LA86_0==74) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4950:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11497);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4960:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11524);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4976:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4977:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4978:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11559);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11569); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4985:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4988:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4989:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4989:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4989:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4989:2: ()
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4990:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4999:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==16) ) {
                alt87=1;
            }
            else if ( (LA87_0==61) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4999:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4999:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5000:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5000:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5001:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11637);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5018:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5018:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5019:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5019:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5020:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11664);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5044:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5045:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5046:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11702);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11712); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5053:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5056:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5057:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5057:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5057:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleJvmUpperBound11749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5061:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5062:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5062:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5063:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11770);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5087:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5088:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5089:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11806);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11816); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5096:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5099:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5100:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5100:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5100:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBoundAnded11853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5104:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5105:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5105:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5106:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11874);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5130:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5131:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5132:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11910);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11920); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5139:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5142:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5143:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5143:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5143:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5147:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5148:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5148:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5149:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11978);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5175:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5176:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5177:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12017);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12028); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5184:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5187:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:5188:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalDomainmodel
    public final void synpred1_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:773:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:774:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:774:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:775:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:775:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:776:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalDomainmodel1692);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalDomainmodel

    // $ANTLR start synpred2_InternalDomainmodel
    public final void synpred2_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:901:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:902:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:902:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:903:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:903:1: ( ruleOpOr )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:904:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalDomainmodel2040);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalDomainmodel

    // $ANTLR start synpred3_InternalDomainmodel
    public final void synpred3_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1002:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1003:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1003:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1004:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1004:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1005:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalDomainmodel2299);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalDomainmodel

    // $ANTLR start synpred4_InternalDomainmodel
    public final void synpred4_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1103:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1104:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1104:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1105:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1105:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1106:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalDomainmodel2558);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalDomainmodel

    // $ANTLR start synpred5_InternalDomainmodel
    public final void synpred5_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1211:6: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1212:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred5_InternalDomainmodel2834); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalDomainmodel

    // $ANTLR start synpred6_InternalDomainmodel
    public final void synpred6_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1242:10: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1243:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1243:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1244:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1244:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1245:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalDomainmodel2905);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalDomainmodel

    // $ANTLR start synpred7_InternalDomainmodel
    public final void synpred7_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1364:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1365:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1365:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1366:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1366:1: ( ruleOpOther )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1367:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalDomainmodel3224);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalDomainmodel

    // $ANTLR start synpred8_InternalDomainmodel
    public final void synpred8_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1472:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1473:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1473:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1474:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1474:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1475:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalDomainmodel3504);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalDomainmodel

    // $ANTLR start synpred9_InternalDomainmodel
    public final void synpred9_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1580:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1581:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1581:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1582:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1582:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1583:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalDomainmodel3784);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalDomainmodel

    // $ANTLR start synpred10_InternalDomainmodel
    public final void synpred10_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:4: ( () 'as' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:5: () 'as'
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1813:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1814:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred10_InternalDomainmodel4378); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDomainmodel

    // $ANTLR start synpred11_InternalDomainmodel
    public final void synpred11_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1873:6: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1874:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred11_InternalDomainmodel4532); if (state.failed) return ;
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1875:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1876:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1876:1: ( ruleValidID )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1877:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalDomainmodel4541);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalDomainmodel4547);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDomainmodel

    // $ANTLR start synpred12_InternalDomainmodel
    public final void synpred12_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1931:10: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1932:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1932:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt88=3;
        switch ( input.LA(1) ) {
        case 24:
            {
            alt88=1;
            }
            break;
        case 45:
            {
            alt88=2;
            }
            break;
        case 46:
            {
            alt88=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 88, 0, input);

            throw nvae;
        }

        switch (alt88) {
            case 1 :
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1932:4: '.'
                {
                match(input,24,FOLLOW_24_in_synpred12_InternalDomainmodel4650); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1934:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1934:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1935:1: ( '?.' )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1935:1: ( '?.' )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1936:2: '?.'
                {
                match(input,45,FOLLOW_45_in_synpred12_InternalDomainmodel4664); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1941:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1941:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1942:1: ( '*.' )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1942:1: ( '*.' )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:1943:2: '*.'
                {
                match(input,46,FOLLOW_46_in_synpred12_InternalDomainmodel4684); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalDomainmodel

    // $ANTLR start synpred13_InternalDomainmodel
    public final void synpred13_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2052:4: ( ( '(' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2053:1: ( '(' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2053:1: ( '(' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2054:2: '('
        {
        match(input,21,FOLLOW_21_in_synpred13_InternalDomainmodel4911); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalDomainmodel

    // $ANTLR start synpred14_InternalDomainmodel
    public final void synpred14_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2073:6: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2074:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2074:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==21||LA90_0==73) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2074:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2074:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2075:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2075:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2076:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalDomainmodel4963);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2078:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==22) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2078:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred14_InternalDomainmodel4970); if (state.failed) return ;
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2079:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2080:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2080:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2081:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalDomainmodel4977);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2083:6: ( ( '|' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2084:1: ( '|' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2084:1: ( '|' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2085:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred14_InternalDomainmodel4991); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalDomainmodel

    // $ANTLR start synpred15_InternalDomainmodel
    public final void synpred15_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2152:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2153:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2153:1: ( ruleXClosure )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2154:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalDomainmodel5109);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalDomainmodel

    // $ANTLR start synpred16_InternalDomainmodel
    public final void synpred16_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==21||LA92_0==73) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2435:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2436:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2436:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2437:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalDomainmodel5882);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2439:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==22) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2439:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred16_InternalDomainmodel5889); if (state.failed) return ;
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2440:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2441:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2441:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2442:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalDomainmodel5896);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2444:6: ( ( '|' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2445:1: ( '|' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2445:1: ( '|' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2446:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred16_InternalDomainmodel5910); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalDomainmodel

    // $ANTLR start synpred18_InternalDomainmodel
    public final void synpred18_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2805:4: ( 'else' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2805:6: 'else'
        {
        match(input,52,FOLLOW_52_in_synpred18_InternalDomainmodel6693); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalDomainmodel

    // $ANTLR start synpred19_InternalDomainmodel
    public final void synpred19_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2859:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2859:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2859:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2859:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2859:4: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2860:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2860:1: ( ruleValidID )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:2861:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalDomainmodel6833);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,17,FOLLOW_17_in_synpred19_InternalDomainmodel6839); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalDomainmodel

    // $ANTLR start synpred20_InternalDomainmodel
    public final void synpred20_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3434:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3435:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3435:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3436:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalDomainmodel8079);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3438:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3439:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3439:1: ( ruleValidID )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3440:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalDomainmodel8088);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalDomainmodel

    // $ANTLR start synpred21_InternalDomainmodel
    public final void synpred21_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3738:4: ( ( '(' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3739:1: ( '(' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3739:1: ( '(' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3740:2: '('
        {
        match(input,21,FOLLOW_21_in_synpred21_InternalDomainmodel8650); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalDomainmodel

    // $ANTLR start synpred22_InternalDomainmodel
    public final void synpred22_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3759:6: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3760:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3760:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==21||LA96_0==73) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3760:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3760:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3761:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3761:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3762:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalDomainmodel8702);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3764:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==22) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3764:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred22_InternalDomainmodel8709); if (state.failed) return ;
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3765:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3766:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3766:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3767:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalDomainmodel8716);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3769:6: ( ( '|' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3770:1: ( '|' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3770:1: ( '|' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3771:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred22_InternalDomainmodel8730); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalDomainmodel

    // $ANTLR start synpred23_InternalDomainmodel
    public final void synpred23_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3838:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3839:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3839:1: ( ruleXClosure )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:3840:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalDomainmodel8848);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalDomainmodel

    // $ANTLR start synpred24_InternalDomainmodel
    public final void synpred24_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4035:5: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4036:1: 
        {
        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4036:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==21||LA98_0==73) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4036:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4036:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4037:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4037:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4038:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalDomainmodel9339);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4040:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==22) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4040:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred24_InternalDomainmodel9346); if (state.failed) return ;
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4041:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4042:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4042:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4043:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalDomainmodel9353);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4045:6: ( ( '|' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4046:1: ( '|' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4046:1: ( '|' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4047:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred24_InternalDomainmodel9367); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalDomainmodel

    // $ANTLR start synpred25_InternalDomainmodel
    public final void synpred25_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4114:2: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4115:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4115:1: ( ruleXClosure )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4116:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalDomainmodel9483);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalDomainmodel

    // $ANTLR start synpred26_InternalDomainmodel
    public final void synpred26_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4438:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4439:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4439:1: ( ruleXExpression )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4440:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalDomainmodel10286);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalDomainmodel

    // $ANTLR start synpred27_InternalDomainmodel
    public final void synpred27_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:5: ( 'catch' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4509:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred27_InternalDomainmodel10431); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalDomainmodel

    // $ANTLR start synpred28_InternalDomainmodel
    public final void synpred28_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4528:5: ( 'finally' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4528:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred28_InternalDomainmodel10461); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalDomainmodel

    // $ANTLR start synpred30_InternalDomainmodel
    public final void synpred30_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4676:3: ( '.' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4677:2: '.'
        {
        match(input,24,FOLLOW_24_in_synpred30_InternalDomainmodel10808); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalDomainmodel

    // $ANTLR start synpred31_InternalDomainmodel
    public final void synpred31_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4725:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4725:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4725:3: ( () '[' ']' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4725:4: () '[' ']'
        {
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4725:4: ()
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4726:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred31_InternalDomainmodel10960); if (state.failed) return ;
        match(input,49,FOLLOW_49_in_synpred31_InternalDomainmodel10964); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalDomainmodel

    // $ANTLR start synpred32_InternalDomainmodel
    public final void synpred32_InternalDomainmodel_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4879:4: ( '<' )
        // ../org.eclipse.xtext.example.domainmodel/src-gen/org/eclipse/xtext/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:4879:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred32_InternalDomainmodel11324); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalDomainmodel

    // Delegated rules

    public final boolean synpred7_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDomainmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDomainmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA34_eotS =
        "\74\uffff";
    static final String DFA34_eofS =
        "\1\2\73\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA34_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\6\uffff\2\2\2\uffff\2\2\2\uffff\1\1\4\2\1\uffff\25\2\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "2052:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\34\uffff";
    static final String DFA33_eofS =
        "\34\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA33_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\5\1\1\6\uffff\1\5\7\uffff\1\2\1\uffff\1\33\14\uffff\1\5\1"+
            "\uffff\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "2073:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==21) ) {s = 2;}

                        else if ( (LA33_0==73) && (synpred14_InternalDomainmodel())) {s = 3;}

                        else if ( (LA33_0==48) && (synpred14_InternalDomainmodel())) {s = 4;}

                        else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||LA33_0==13||LA33_0==36||(LA33_0>=38 && LA33_0<=39)||LA33_0==43||LA33_0==47||LA33_0==51||LA33_0==53||(LA33_0>=56 && LA33_0<=58)||LA33_0==61||(LA33_0>=63 && LA33_0<=70)) ) {s = 5;}

                        else if ( (LA33_0==23) ) {s = 27;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\74\uffff";
    static final String DFA35_eofS =
        "\1\2\73\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA35_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA35_transitionS = {
            "\3\2\6\uffff\2\2\2\uffff\2\2\2\uffff\5\2\1\uffff\24\2\1\1\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "2152:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\36\uffff";
    static final String DFA41_eofS =
        "\36\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA41_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\5\1\1\6\uffff\1\5\7\uffff\1\2\16\uffff\1\5\1\uffff\2\5\3"+
            "\uffff\1\5\3\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2435:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_ID) ) {s = 1;}

                        else if ( (LA41_0==21) ) {s = 2;}

                        else if ( (LA41_0==73) && (synpred16_InternalDomainmodel())) {s = 3;}

                        else if ( (LA41_0==48) && (synpred16_InternalDomainmodel())) {s = 4;}

                        else if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_STRING)||LA41_0==13||LA41_0==36||(LA41_0>=38 && LA41_0<=39)||LA41_0==43||LA41_0==47||LA41_0==49||LA41_0==51||LA41_0==53||(LA41_0>=56 && LA41_0<=61)||(LA41_0>=63 && LA41_0<=70)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\74\uffff";
    static final String DFA64_eofS =
        "\1\2\73\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA64_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA64_transitionS = {
            "\3\2\6\uffff\2\2\2\uffff\2\2\2\uffff\1\1\4\2\1\uffff\25\2\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3738:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\34\uffff";
    static final String DFA63_eofS =
        "\34\uffff";
    static final String DFA63_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA63_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA63_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA63_transitionS = {
            "\2\5\1\1\6\uffff\1\5\7\uffff\1\2\1\uffff\1\33\14\uffff\1\5\1"+
            "\uffff\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3759:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==RULE_ID) ) {s = 1;}

                        else if ( (LA63_0==21) ) {s = 2;}

                        else if ( (LA63_0==73) && (synpred22_InternalDomainmodel())) {s = 3;}

                        else if ( (LA63_0==48) && (synpred22_InternalDomainmodel())) {s = 4;}

                        else if ( ((LA63_0>=RULE_INT && LA63_0<=RULE_STRING)||LA63_0==13||LA63_0==36||(LA63_0>=38 && LA63_0<=39)||LA63_0==43||LA63_0==47||LA63_0==51||LA63_0==53||(LA63_0>=56 && LA63_0<=58)||LA63_0==61||(LA63_0>=63 && LA63_0<=70)) ) {s = 5;}

                        else if ( (LA63_0==23) ) {s = 27;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\74\uffff";
    static final String DFA65_eofS =
        "\1\2\73\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA65_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA65_transitionS = {
            "\3\2\6\uffff\2\2\2\uffff\2\2\2\uffff\5\2\1\uffff\24\2\1\1\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3838:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\34\uffff";
    static final String DFA71_eofS =
        "\34\uffff";
    static final String DFA71_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA71_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA71_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA71_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA71_transitionS = {
            "\2\5\1\1\6\uffff\1\5\7\uffff\1\2\1\uffff\1\33\14\uffff\1\5\1"+
            "\uffff\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff\1"+
            "\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4035:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_0 = input.LA(1);

                         
                        int index71_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA71_0==RULE_ID) ) {s = 1;}

                        else if ( (LA71_0==21) ) {s = 2;}

                        else if ( (LA71_0==73) && (synpred24_InternalDomainmodel())) {s = 3;}

                        else if ( (LA71_0==48) && (synpred24_InternalDomainmodel())) {s = 4;}

                        else if ( ((LA71_0>=RULE_INT && LA71_0<=RULE_STRING)||LA71_0==13||LA71_0==36||(LA71_0>=38 && LA71_0<=39)||LA71_0==43||LA71_0==47||LA71_0==51||LA71_0==53||(LA71_0>=56 && LA71_0<=58)||LA71_0==61||(LA71_0>=63 && LA71_0<=70)) ) {s = 5;}

                        else if ( (LA71_0==23) ) {s = 27;}

                         
                        input.seek(index71_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalDomainmodel()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\74\uffff";
    static final String DFA72_eofS =
        "\1\2\73\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA72_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA72_transitionS = {
            "\3\2\6\uffff\2\2\2\uffff\2\2\2\uffff\5\2\1\uffff\24\2\1\1\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4114:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\74\uffff";
    static final String DFA74_eofS =
        "\1\31\73\uffff";
    static final String DFA74_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA74_maxS =
        "\1\111\30\0\43\uffff";
    static final String DFA74_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\15\1\17\1\1\6\uffff\1\6\1\31\2\uffff\2\31\2\uffff\1\30\4"+
            "\31\1\uffff\11\31\1\10\1\31\1\4\1\3\3\31\1\2\3\31\1\12\1\uffff"+
            "\2\31\1\21\1\31\1\7\2\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1"+
            "\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4438:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA74_17 = input.LA(1);

                         
                        int index74_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA74_18 = input.LA(1);

                         
                        int index74_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA74_19 = input.LA(1);

                         
                        int index74_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA74_20 = input.LA(1);

                         
                        int index74_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA74_21 = input.LA(1);

                         
                        int index74_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA74_22 = input.LA(1);

                         
                        int index74_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA74_23 = input.LA(1);

                         
                        int index74_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA74_24 = input.LA(1);

                         
                        int index74_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalDomainmodel()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index74_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\76\uffff";
    static final String DFA85_eofS =
        "\1\2\75\uffff";
    static final String DFA85_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA85_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA85_transitionS = {
            "\3\2\6\uffff\2\2\2\uffff\11\2\1\uffff\11\2\1\1\13\2\1\uffff"+
            "\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "4879:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalDomainmodel()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000000009802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration484 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration496 = new BitSet(new long[]{0x000000000000D800L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration517 = new BitSet(new long[]{0x000000000000D800L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity613 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleEntity634 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleEntity647 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleEntity668 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity682 = new BitSet(new long[]{0x0000000000104040L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity703 = new BitSet(new long[]{0x0000000000104040L});
    public static final BitSet FOLLOW_14_in_ruleEntity716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFeature809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFeature836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleProperty927 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProperty939 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleProperty960 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleProperty973 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProperty996 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleProperty1011 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProperty1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOperation1119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleOperation1140 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOperation1152 = new BitSet(new long[]{0x0000000000A00040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation1174 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleOperation1187 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation1208 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleOperation1224 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation1236 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleOperation1257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleOperation1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1373 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifiedNameWithWildCard1392 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedNameWithWildCard1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1605 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1621 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1671 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1724 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpSingleAssign1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2019 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2072 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2095 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOr2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2278 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2331 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2354 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAnd2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2537 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2590 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2613 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2817 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression2853 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2876 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2937 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2960 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3203 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3256 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3279 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpOther3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3483 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3536 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3559 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpAdd3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3763 = new BitSet(new long[]{0x0000070002000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3816 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3839 = new BitSet(new long[]{0x0000070002000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpMulti3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4092 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4362 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression4397 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4420 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4515 = new BitSet(new long[]{0x0000600001000002L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall4564 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4587 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4603 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4625 = new BitSet(new long[]{0x0000600001000002L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall4711 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4735 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4772 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall4801 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4822 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall4835 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4856 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall4870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4895 = new BitSet(new long[]{0x0000E00001200002L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall4929 = new BitSet(new long[]{0xA72988D000A02070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5014 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5042 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall5055 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5076 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall5093 = new BitSet(new long[]{0x0000E00001000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5126 = new BitSet(new long[]{0x0000600001000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5865 = new BitSet(new long[]{0xBF2B88D000202070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5936 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXClosure5949 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5970 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5992 = new BitSet(new long[]{0xBF2A88D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6029 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6143 = new BitSet(new long[]{0xBF2C88D000202072L,0x000000000000007FL});
    public static final BitSet FOLLOW_50_in_ruleXExpressionInClosure6156 = new BitSet(new long[]{0xBF2888D000202072L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6314 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXShortClosure6327 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6348 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure6370 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleXParenthesizedExpression6489 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXParenthesizedExpression6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6614 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression6626 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6647 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXIfExpression6659 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6680 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6701 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6817 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6858 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6870 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6894 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression6906 = new BitSet(new long[]{0x0080000000220040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6927 = new BitSet(new long[]{0x00C0000000224040L,0x0000000000000200L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6953 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6974 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXSwitchExpression6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7080 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart7094 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXCasePart7129 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression7242 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7254 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7275 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXForLoopExpression7287 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7308 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXForLoopExpression7320 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression7433 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXWhileExpression7445 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7466 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXWhileExpression7478 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression7591 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7612 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression7624 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXDoWhileExpression7636 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7657 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXDoWhileExpression7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7761 = new BitSet(new long[]{0xBF2888D000206070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7783 = new BitSet(new long[]{0xBF2C88D000206070L,0x000000000000007FL});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression7796 = new BitSet(new long[]{0xBF2888D000206070L,0x000000000000007FL});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration8030 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration8061 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8130 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8159 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXVariableDeclaration8173 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8288 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8402 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8526 = new BitSet(new long[]{0x2000001000000040L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall8540 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8561 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall8574 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8595 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall8609 = new BitSet(new long[]{0x2000001000000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8634 = new BitSet(new long[]{0x0000800000200002L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall8668 = new BitSet(new long[]{0xA72988D000A02070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8753 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8781 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall8794 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8815 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall8832 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9084 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier9102 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall9199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9222 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall9235 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9256 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9269 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9290 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall9304 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9318 = new BitSet(new long[]{0xA72988D000A02070L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9390 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9418 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9431 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9452 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall9469 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral10020 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXTypeLiteral10032 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10055 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXTypeLiteral10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression10159 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression10272 = new BitSet(new long[]{0xA72888D000202072L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10396 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10469 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10513 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause10627 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCatchClause10640 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10661 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXCatchClause10673 = new BitSet(new long[]{0xA72888D000202070L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10789 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifiedName10817 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10840 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10945 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference10983 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference10995 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef11110 = new BitSet(new long[]{0x0000000000A00040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11132 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleXFunctionTypeRef11145 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11166 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleXFunctionTypeRef11182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXFunctionTypeRef11196 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11311 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference11332 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11354 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_22_in_ruleJvmParameterizedTypeReference11367 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11388 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference11402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11615 = new BitSet(new long[]{0x2000000000010002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleJvmUpperBound11749 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBoundAnded11853 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11957 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalDomainmodel1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalDomainmodel2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalDomainmodel2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalDomainmodel2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalDomainmodel2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalDomainmodel2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalDomainmodel3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalDomainmodel3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalDomainmodel3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred10_InternalDomainmodel4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred11_InternalDomainmodel4532 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalDomainmodel4541 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalDomainmodel4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred12_InternalDomainmodel4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred12_InternalDomainmodel4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalDomainmodel4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred13_InternalDomainmodel4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalDomainmodel4963 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_22_in_synpred14_InternalDomainmodel4970 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalDomainmodel4977 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalDomainmodel4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalDomainmodel5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalDomainmodel5882 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_22_in_synpred16_InternalDomainmodel5889 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalDomainmodel5896 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalDomainmodel5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred18_InternalDomainmodel6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalDomainmodel6833 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred19_InternalDomainmodel6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalDomainmodel8079 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalDomainmodel8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred21_InternalDomainmodel8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalDomainmodel8702 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_22_in_synpred22_InternalDomainmodel8709 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalDomainmodel8716 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_synpred22_InternalDomainmodel8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalDomainmodel8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalDomainmodel9339 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_22_in_synpred24_InternalDomainmodel9346 = new BitSet(new long[]{0x0000000000200040L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalDomainmodel9353 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_48_in_synpred24_InternalDomainmodel9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalDomainmodel9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalDomainmodel10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred27_InternalDomainmodel10431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred28_InternalDomainmodel10461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred30_InternalDomainmodel10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalDomainmodel10960 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred31_InternalDomainmodel10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred32_InternalDomainmodel11324 = new BitSet(new long[]{0x0000000000000002L});

}