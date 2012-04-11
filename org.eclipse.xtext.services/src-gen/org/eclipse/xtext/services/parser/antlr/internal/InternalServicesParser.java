package org.eclipse.xtext.services.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.services.services.ServicesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalServicesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'component'", "'conforms'", "','", "'{'", "'requires'", "'}'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "':'", "'import'", "'/'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
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
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalServicesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalServicesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalServicesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g"; }



     	private ServicesGrammarAccess grammarAccess;
     	
        public InternalServicesParser(TokenStream input, ServicesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ServicesFile";	
       	}
       	
       	@Override
       	protected ServicesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleServicesFile"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:67:1: entryRuleServicesFile returns [EObject current=null] : iv_ruleServicesFile= ruleServicesFile EOF ;
    public final EObject entryRuleServicesFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicesFile = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:68:2: (iv_ruleServicesFile= ruleServicesFile EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:69:2: iv_ruleServicesFile= ruleServicesFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServicesFileRule()); 
            }
            pushFollow(FOLLOW_ruleServicesFile_in_entryRuleServicesFile75);
            iv_ruleServicesFile=ruleServicesFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServicesFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicesFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServicesFile"


    // $ANTLR start "ruleServicesFile"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:76:1: ruleServicesFile returns [EObject current=null] : ( (lv_component_0_0= ruleComponent ) ) ;
    public final EObject ruleServicesFile() throws RecognitionException {
        EObject current = null;

        EObject lv_component_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:79:28: ( ( (lv_component_0_0= ruleComponent ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:80:1: ( (lv_component_0_0= ruleComponent ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:80:1: ( (lv_component_0_0= ruleComponent ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:81:1: (lv_component_0_0= ruleComponent )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:81:1: (lv_component_0_0= ruleComponent )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:82:3: lv_component_0_0= ruleComponent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServicesFileAccess().getComponentComponentParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComponent_in_ruleServicesFile130);
            lv_component_0_0=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServicesFileRule());
              	        }
                     		set(
                     			current, 
                     			"component",
                      		lv_component_0_0, 
                      		"Component");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleServicesFile"


    // $ANTLR start "entryRuleComponent"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:106:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:107:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:108:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent165);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:115:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'conforms' ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )* )? otherlv_9= '{' (otherlv_10= 'requires' ( (lv_requires_11_0= ruleRequireDeclaration ) ) (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_14_0= ruleService ) )* otherlv_15= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_imports_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_implements_6_0 = null;

        EObject lv_implements_8_0 = null;

        EObject lv_requires_11_0 = null;

        EObject lv_requires_13_0 = null;

        EObject lv_services_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:118:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'conforms' ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )* )? otherlv_9= '{' (otherlv_10= 'requires' ( (lv_requires_11_0= ruleRequireDeclaration ) ) (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_14_0= ruleService ) )* otherlv_15= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:119:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'conforms' ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )* )? otherlv_9= '{' (otherlv_10= 'requires' ( (lv_requires_11_0= ruleRequireDeclaration ) ) (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_14_0= ruleService ) )* otherlv_15= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:119:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'conforms' ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )* )? otherlv_9= '{' (otherlv_10= 'requires' ( (lv_requires_11_0= ruleRequireDeclaration ) ) (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_14_0= ruleService ) )* otherlv_15= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:119:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) (otherlv_5= 'conforms' ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )* )? otherlv_9= '{' (otherlv_10= 'requires' ( (lv_requires_11_0= ruleRequireDeclaration ) ) (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )* )? ( (lv_services_14_0= ruleService ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComponent212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getPackageKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:123:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:124:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:124:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:125:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleComponent233);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentRule());
              	        }
                     		set(
                     			current, 
                     			"packageName",
                      		lv_packageName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:141:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:142:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:142:1: (lv_imports_2_0= ruleImport )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:143:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleComponent254);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleComponent267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getComponentKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:163:1: ( (lv_name_4_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:164:1: (lv_name_4_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:164:1: (lv_name_4_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:165:3: lv_name_4_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleComponent288);
            lv_name_4_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComponentRule());
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:181:2: (otherlv_5= 'conforms' ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:181:4: otherlv_5= 'conforms' ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) ) (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )*
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleComponent301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getConformsKeyword_5_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:185:1: ( (lv_implements_6_0= ruleJvmParameterizedTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:186:1: (lv_implements_6_0= ruleJvmParameterizedTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:186:1: (lv_implements_6_0= ruleJvmParameterizedTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:187:3: lv_implements_6_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentAccess().getImplementsJvmParameterizedTypeReferenceParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleComponent322);
                    lv_implements_6_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                      	        }
                             		add(
                             			current, 
                             			"implements",
                              		lv_implements_6_0, 
                              		"JvmParameterizedTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:203:2: (otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:203:4: otherlv_7= ',' ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleComponent335); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:207:1: ( (lv_implements_8_0= ruleJvmParameterizedTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:208:1: (lv_implements_8_0= ruleJvmParameterizedTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:208:1: (lv_implements_8_0= ruleJvmParameterizedTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:209:3: lv_implements_8_0= ruleJvmParameterizedTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentAccess().getImplementsJvmParameterizedTypeReferenceParserRuleCall_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleComponent356);
                    	    lv_implements_8_0=ruleJvmParameterizedTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"implements",
                    	              		lv_implements_8_0, 
                    	              		"JvmParameterizedTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleComponent372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:229:1: (otherlv_10= 'requires' ( (lv_requires_11_0= ruleRequireDeclaration ) ) (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:229:3: otherlv_10= 'requires' ( (lv_requires_11_0= ruleRequireDeclaration ) ) (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )*
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleComponent385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getRequiresKeyword_7_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:233:1: ( (lv_requires_11_0= ruleRequireDeclaration ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:234:1: (lv_requires_11_0= ruleRequireDeclaration )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:234:1: (lv_requires_11_0= ruleRequireDeclaration )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:235:3: lv_requires_11_0= ruleRequireDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentAccess().getRequiresRequireDeclarationParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRequireDeclaration_in_ruleComponent406);
                    lv_requires_11_0=ruleRequireDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                      	        }
                             		add(
                             			current, 
                             			"requires",
                              		lv_requires_11_0, 
                              		"RequireDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:251:2: (otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:251:4: otherlv_12= ',' ( (lv_requires_13_0= ruleRequireDeclaration ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleComponent419); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:255:1: ( (lv_requires_13_0= ruleRequireDeclaration ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:256:1: (lv_requires_13_0= ruleRequireDeclaration )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:256:1: (lv_requires_13_0= ruleRequireDeclaration )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:257:3: lv_requires_13_0= ruleRequireDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentAccess().getRequiresRequireDeclarationParserRuleCall_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRequireDeclaration_in_ruleComponent440);
                    	    lv_requires_13_0=ruleRequireDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"requires",
                    	              		lv_requires_13_0, 
                    	              		"RequireDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:273:6: ( (lv_services_14_0= ruleService ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==17||(LA6_0>=20 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:274:1: (lv_services_14_0= ruleService )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:274:1: (lv_services_14_0= ruleService )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:275:3: lv_services_14_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleService_in_ruleComponent465);
            	    lv_services_14_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"services",
            	              		lv_services_14_0, 
            	              		"Service");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleComponent478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9());
                  
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleService"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:303:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:304:2: (iv_ruleService= ruleService EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:305:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService514);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService524); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:312:1: ruleService returns [EObject current=null] : ( ( ( (lv_get_0_0= 'GET' ) ) | ( (lv_post_1_0= 'POST' ) ) | ( (lv_put_2_0= 'PUT' ) ) | ( (lv_delete_3_0= 'DELETE' ) ) )? ( (lv_name_4_0= rulePath ) ) otherlv_5= ':' ( (lv_type_6_0= ruleJvmTypeReference ) ) ( (lv_body_7_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_get_0_0=null;
        Token lv_post_1_0=null;
        Token lv_put_2_0=null;
        Token lv_delete_3_0=null;
        Token otherlv_5=null;
        EObject lv_name_4_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:315:28: ( ( ( ( (lv_get_0_0= 'GET' ) ) | ( (lv_post_1_0= 'POST' ) ) | ( (lv_put_2_0= 'PUT' ) ) | ( (lv_delete_3_0= 'DELETE' ) ) )? ( (lv_name_4_0= rulePath ) ) otherlv_5= ':' ( (lv_type_6_0= ruleJvmTypeReference ) ) ( (lv_body_7_0= ruleXBlockExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:1: ( ( ( (lv_get_0_0= 'GET' ) ) | ( (lv_post_1_0= 'POST' ) ) | ( (lv_put_2_0= 'PUT' ) ) | ( (lv_delete_3_0= 'DELETE' ) ) )? ( (lv_name_4_0= rulePath ) ) otherlv_5= ':' ( (lv_type_6_0= ruleJvmTypeReference ) ) ( (lv_body_7_0= ruleXBlockExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:1: ( ( ( (lv_get_0_0= 'GET' ) ) | ( (lv_post_1_0= 'POST' ) ) | ( (lv_put_2_0= 'PUT' ) ) | ( (lv_delete_3_0= 'DELETE' ) ) )? ( (lv_name_4_0= rulePath ) ) otherlv_5= ':' ( (lv_type_6_0= ruleJvmTypeReference ) ) ( (lv_body_7_0= ruleXBlockExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:2: ( ( (lv_get_0_0= 'GET' ) ) | ( (lv_post_1_0= 'POST' ) ) | ( (lv_put_2_0= 'PUT' ) ) | ( (lv_delete_3_0= 'DELETE' ) ) )? ( (lv_name_4_0= rulePath ) ) otherlv_5= ':' ( (lv_type_6_0= ruleJvmTypeReference ) ) ( (lv_body_7_0= ruleXBlockExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:2: ( ( (lv_get_0_0= 'GET' ) ) | ( (lv_post_1_0= 'POST' ) ) | ( (lv_put_2_0= 'PUT' ) ) | ( (lv_delete_3_0= 'DELETE' ) ) )?
            int alt7=5;
            switch ( input.LA(1) ) {
                case 20:
                    {
                    alt7=1;
                    }
                    break;
                case 21:
                    {
                    alt7=2;
                    }
                    break;
                case 22:
                    {
                    alt7=3;
                    }
                    break;
                case 23:
                    {
                    alt7=4;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:3: ( (lv_get_0_0= 'GET' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:3: ( (lv_get_0_0= 'GET' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:317:1: (lv_get_0_0= 'GET' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:317:1: (lv_get_0_0= 'GET' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:318:3: lv_get_0_0= 'GET'
                    {
                    lv_get_0_0=(Token)match(input,20,FOLLOW_20_in_ruleService568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_get_0_0, grammarAccess.getServiceAccess().getGetGETKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getServiceRule());
                      	        }
                             		setWithLastConsumed(current, "get", true, "GET");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:332:6: ( (lv_post_1_0= 'POST' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:332:6: ( (lv_post_1_0= 'POST' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:333:1: (lv_post_1_0= 'POST' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:333:1: (lv_post_1_0= 'POST' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:334:3: lv_post_1_0= 'POST'
                    {
                    lv_post_1_0=(Token)match(input,21,FOLLOW_21_in_ruleService605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_post_1_0, grammarAccess.getServiceAccess().getPostPOSTKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getServiceRule());
                      	        }
                             		setWithLastConsumed(current, "post", true, "POST");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:348:6: ( (lv_put_2_0= 'PUT' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:348:6: ( (lv_put_2_0= 'PUT' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:349:1: (lv_put_2_0= 'PUT' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:349:1: (lv_put_2_0= 'PUT' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:350:3: lv_put_2_0= 'PUT'
                    {
                    lv_put_2_0=(Token)match(input,22,FOLLOW_22_in_ruleService642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_put_2_0, grammarAccess.getServiceAccess().getPutPUTKeyword_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getServiceRule());
                      	        }
                             		setWithLastConsumed(current, "put", true, "PUT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:364:6: ( (lv_delete_3_0= 'DELETE' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:364:6: ( (lv_delete_3_0= 'DELETE' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:365:1: (lv_delete_3_0= 'DELETE' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:365:1: (lv_delete_3_0= 'DELETE' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:366:3: lv_delete_3_0= 'DELETE'
                    {
                    lv_delete_3_0=(Token)match(input,23,FOLLOW_23_in_ruleService679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_delete_3_0, grammarAccess.getServiceAccess().getDeleteDELETEKeyword_0_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getServiceRule());
                      	        }
                             		setWithLastConsumed(current, "delete", true, "DELETE");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:379:4: ( (lv_name_4_0= rulePath ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:380:1: (lv_name_4_0= rulePath )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:380:1: (lv_name_4_0= rulePath )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:381:3: lv_name_4_0= rulePath
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getNamePathParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePath_in_ruleService715);
            lv_name_4_0=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"Path");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleService727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:401:1: ( (lv_type_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:402:1: (lv_type_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:402:1: (lv_type_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:403:3: lv_type_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getTypeJvmTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleService748);
            lv_type_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:419:2: ( (lv_body_7_0= ruleXBlockExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:420:1: (lv_body_7_0= ruleXBlockExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:420:1: (lv_body_7_0= ruleXBlockExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:421:3: lv_body_7_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getBodyXBlockExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleService769);
            lv_body_7_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRequireDeclaration"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:445:1: entryRuleRequireDeclaration returns [EObject current=null] : iv_ruleRequireDeclaration= ruleRequireDeclaration EOF ;
    public final EObject entryRuleRequireDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireDeclaration = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:446:2: (iv_ruleRequireDeclaration= ruleRequireDeclaration EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:447:2: iv_ruleRequireDeclaration= ruleRequireDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequireDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRequireDeclaration_in_entryRuleRequireDeclaration805);
            iv_ruleRequireDeclaration=ruleRequireDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequireDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequireDeclaration815); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequireDeclaration"


    // $ANTLR start "ruleRequireDeclaration"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:454:1: ruleRequireDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleRequireDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:457:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:458:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:458:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:458:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:458:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:459:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:459:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:460:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequireDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleRequireDeclaration861);
            lv_type_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRequireDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:476:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||(LA8_1>=16 && LA8_1<=17)||(LA8_1>=19 && LA8_1<=23)) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:477:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:477:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:478:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequireDeclaration878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getRequireDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequireDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
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
    // $ANTLR end "ruleRequireDeclaration"


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:502:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:503:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:504:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport920);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport930); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:511:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:514:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:515:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:515:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:515:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleImport967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:519:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:520:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:520:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:521:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport988);
            lv_importedNamespace_1_0=ruleQualifiedName();

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
                      		"QualifiedName");
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


    // $ANTLR start "entryRulePath"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:545:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:546:2: (iv_rulePath= rulePath EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:547:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath1024);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath1034); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:554:1: rulePath returns [EObject current=null] : ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '/' ( (lv_segments_2_0= rulePathSegment ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_segments_0_0 = null;

        EObject lv_segments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:557:28: ( ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '/' ( (lv_segments_2_0= rulePathSegment ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:558:1: ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '/' ( (lv_segments_2_0= rulePathSegment ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:558:1: ( ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '/' ( (lv_segments_2_0= rulePathSegment ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:558:2: ( (lv_segments_0_0= rulePathSegment ) ) (otherlv_1= '/' ( (lv_segments_2_0= rulePathSegment ) ) )*
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:558:2: ( (lv_segments_0_0= rulePathSegment ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:559:1: (lv_segments_0_0= rulePathSegment )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:559:1: (lv_segments_0_0= rulePathSegment )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:560:3: lv_segments_0_0= rulePathSegment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePathSegment_in_rulePath1080);
            lv_segments_0_0=rulePathSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPathRule());
              	        }
                     		add(
                     			current, 
                     			"segments",
                      		lv_segments_0_0, 
                      		"PathSegment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:576:2: (otherlv_1= '/' ( (lv_segments_2_0= rulePathSegment ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:576:4: otherlv_1= '/' ( (lv_segments_2_0= rulePathSegment ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePath1093); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getSolidusKeyword_1_0());
            	          
            	    }
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:580:1: ( (lv_segments_2_0= rulePathSegment ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:581:1: (lv_segments_2_0= rulePathSegment )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:581:1: (lv_segments_2_0= rulePathSegment )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:582:3: lv_segments_2_0= rulePathSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePathSegment_in_rulePath1114);
            	    lv_segments_2_0=rulePathSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPathRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_2_0, 
            	              		"PathSegment");
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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRulePathSegment"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:606:1: entryRulePathSegment returns [EObject current=null] : iv_rulePathSegment= rulePathSegment EOF ;
    public final EObject entryRulePathSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathSegment = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:607:2: (iv_rulePathSegment= rulePathSegment EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:608:2: iv_rulePathSegment= rulePathSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathSegmentRule()); 
            }
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment1152);
            iv_rulePathSegment=rulePathSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment1162); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathSegment"


    // $ANTLR start "rulePathSegment"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:1: rulePathSegment returns [EObject current=null] : (this_ParameterSegment_0= ruleParameterSegment | this_SimpleSegment_1= ruleSimpleSegment ) ;
    public final EObject rulePathSegment() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterSegment_0 = null;

        EObject this_SimpleSegment_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:618:28: ( (this_ParameterSegment_0= ruleParameterSegment | this_SimpleSegment_1= ruleSimpleSegment ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:619:1: (this_ParameterSegment_0= ruleParameterSegment | this_SimpleSegment_1= ruleSimpleSegment )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:619:1: (this_ParameterSegment_0= ruleParameterSegment | this_SimpleSegment_1= ruleSimpleSegment )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:620:5: this_ParameterSegment_0= ruleParameterSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPathSegmentAccess().getParameterSegmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterSegment_in_rulePathSegment1209);
                    this_ParameterSegment_0=ruleParameterSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterSegment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:630:5: this_SimpleSegment_1= ruleSimpleSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPathSegmentAccess().getSimpleSegmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleSegment_in_rulePathSegment1236);
                    this_SimpleSegment_1=ruleSimpleSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleSegment_1; 
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
    // $ANTLR end "rulePathSegment"


    // $ANTLR start "entryRuleParameterSegment"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:646:1: entryRuleParameterSegment returns [EObject current=null] : iv_ruleParameterSegment= ruleParameterSegment EOF ;
    public final EObject entryRuleParameterSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSegment = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:647:2: (iv_ruleParameterSegment= ruleParameterSegment EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:648:2: iv_ruleParameterSegment= ruleParameterSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleParameterSegment_in_entryRuleParameterSegment1271);
            iv_ruleParameterSegment=ruleParameterSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSegment1281); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSegment"


    // $ANTLR start "ruleParameterSegment"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:655:1: ruleParameterSegment returns [EObject current=null] : (otherlv_0= '{' ( (lv_param_1_0= ruleParameter ) ) otherlv_2= '}' ) ;
    public final EObject ruleParameterSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_param_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:658:28: ( (otherlv_0= '{' ( (lv_param_1_0= ruleParameter ) ) otherlv_2= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:1: (otherlv_0= '{' ( (lv_param_1_0= ruleParameter ) ) otherlv_2= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:1: (otherlv_0= '{' ( (lv_param_1_0= ruleParameter ) ) otherlv_2= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:3: otherlv_0= '{' ( (lv_param_1_0= ruleParameter ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleParameterSegment1318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterSegmentAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:663:1: ( (lv_param_1_0= ruleParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:664:1: (lv_param_1_0= ruleParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:664:1: (lv_param_1_0= ruleParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:665:3: lv_param_1_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterSegmentAccess().getParamParameterParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterSegment1339);
            lv_param_1_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterSegmentRule());
              	        }
                     		set(
                     			current, 
                     			"param",
                      		lv_param_1_0, 
                      		"Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleParameterSegment1351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterSegmentAccess().getRightCurlyBracketKeyword_2());
                  
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
    // $ANTLR end "ruleParameterSegment"


    // $ANTLR start "entryRuleParameter"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:693:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:694:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:695:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1387);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:702:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameterType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:705:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:706:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:706:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:706:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:706:2: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:707:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:707:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:708:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleParameter1443);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleParameter1455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:728:1: ( (lv_parameterType_2_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:729:1: (lv_parameterType_2_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:729:1: (lv_parameterType_2_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:730:3: lv_parameterType_2_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleParameter1476);
            lv_parameterType_2_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_2_0, 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSimpleSegment"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:754:1: entryRuleSimpleSegment returns [EObject current=null] : iv_ruleSimpleSegment= ruleSimpleSegment EOF ;
    public final EObject entryRuleSimpleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSegment = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:755:2: (iv_ruleSimpleSegment= ruleSimpleSegment EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:756:2: iv_ruleSimpleSegment= ruleSimpleSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleSegment_in_entryRuleSimpleSegment1512);
            iv_ruleSimpleSegment=ruleSimpleSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSegment1522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSegment"


    // $ANTLR start "ruleSimpleSegment"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:763:1: ruleSimpleSegment returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleSimpleSegment() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:766:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:767:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:767:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:768:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:768:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:769:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleSegmentAccess().getNameValidIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleSimpleSegment1567);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleSegmentRule());
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
    // $ANTLR end "ruleSimpleSegment"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:793:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:794:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:795:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1602);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1612); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:802:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:805:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:807:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1658);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:823:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:824:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:825:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1692);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1702); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:832:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:835:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:836:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:836:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=RULE_ID && LA12_1<=RULE_DECIMAL)||(LA12_1>=16 && LA12_1<=17)||LA12_1==19||LA12_1==24||LA12_1==26||(LA12_1>=28 && LA12_1<=52)||(LA12_1>=54 && LA12_1<=78)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==27) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_DECIMAL)||LA12_0==17||LA12_0==37||(LA12_0>=40 && LA12_0<=41)||LA12_0==45||LA12_0==50||LA12_0==52||LA12_0==56||LA12_0==58||(LA12_0>=61 && LA12_0<=63)||LA12_0==66||(LA12_0>=68 && LA12_0<=75)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:836:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:836:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:836:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:836:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:837:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:842:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:843:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:843:1: ( ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1760);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1776);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:865:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:866:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:866:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:867:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1796);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:884:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:884:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:885:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1826);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==28) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred1_InternalServices()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:898:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:898:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:898:7: ()
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:899:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:904:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:905:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:905:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:906:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1879);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:919:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:920:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:920:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:921:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1902);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:946:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:947:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1942);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1953); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:954:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:957:28: (kw= '=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:959:2: kw= '='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpSingleAssign1990); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:972:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:973:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:974:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2030);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2041); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:981:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:984:28: (kw= '+=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:986:2: kw= '+='
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpMultiAssign2078); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:999:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1000:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1001:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2117);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2127); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1008:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1011:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1012:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1012:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1013:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2174);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred2_InternalServices()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1026:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1026:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1026:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1027:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1032:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1033:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1033:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1034:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2227);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1047:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1048:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1048:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1049:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2250);
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
            	    break loop13;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1073:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1074:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1075:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2289);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2300); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1082:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1085:28: (kw= '||' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1087:2: kw= '||'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOr2337); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1100:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1101:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1102:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2376);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2386); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1109:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1112:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1114:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2433);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred3_InternalServices()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1127:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1127:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1127:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1128:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1133:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1134:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1134:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1135:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2486);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1148:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1149:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1149:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1150:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2509);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1174:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1175:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1176:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2548);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2559); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1183:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1186:28: (kw= '&&' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1188:2: kw= '&&'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAnd2596); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1201:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1202:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1203:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2635);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2645); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1210:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1213:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1214:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1214:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1215:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2692);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==32) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1228:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1228:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1228:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1229:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1234:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1235:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1235:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1236:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2745);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1249:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1250:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1250:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1251:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2768);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1275:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1276:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1277:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2807);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2818); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1284:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1287:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1288:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1288:1: (kw= '==' | kw= '!=' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1289:2: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1296:2: kw= '!='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpEquality2875); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1309:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1310:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1311:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2915);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2925); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1318:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1321:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1322:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1322:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1323:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2972);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop17:
            do {
                int alt17=3;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred5_InternalServices()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA17_6 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt17=2;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1333:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1333:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1333:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1334:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXRelationalExpression3008); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1343:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1344:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1344:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1345:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3031);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1367:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1367:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1367:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1368:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1373:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1374:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1374:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1375:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3092);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1388:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1389:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1389:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1390:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3115);
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
            	    break loop17;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1414:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1416:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3155);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3166); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1423:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1426:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1427:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1427:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1428:2: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1435:2: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:2: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1449:2: kw= '<'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare3261); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1462:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1463:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1464:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3301);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3311); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1471:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1474:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1475:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1475:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1476:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3358);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==39) ) {
                    int LA19_3 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1489:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1489:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1489:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1490:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1495:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1496:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1496:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1497:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3411);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1510:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1511:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1511:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1512:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3434);
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
            	    break loop19;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1536:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1537:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1538:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3473);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3484); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1545:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1548:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1549:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1549:1: (kw= '->' | kw= '..' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==39) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1550:2: kw= '->'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1557:2: kw= '..'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3541); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1570:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1571:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1572:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3581);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3591); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1579:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1582:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1583:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1583:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1584:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3638);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==40) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==41) ) {
                    int LA21_3 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1597:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1597:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1597:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1598:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1603:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1604:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1604:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1605:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3691);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1618:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1619:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1619:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1620:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3714);
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
            	    break loop21;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1644:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1645:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1646:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3753);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3764); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1653:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1656:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1657:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1657:1: (kw= '+' | kw= '-' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1658:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd3802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1665:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpAdd3821); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1678:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1679:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3861);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3871); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1687:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1690:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1691:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1691:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1692:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3918);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt23=1;
                    }


                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1705:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1705:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1705:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1706:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1711:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1712:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1713:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3971);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1726:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1727:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1727:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1728:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3994);
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
            	    break loop23;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1752:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1753:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1754:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4033);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4044); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1761:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1764:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1765:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1765:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt24=1;
                }
                break;
            case 43:
                {
                alt24=2;
                }
                break;
            case 26:
                {
                alt24=3;
                }
                break;
            case 44:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1766:2: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti4082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1773:2: kw= '**'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti4101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1780:2: kw= '/'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpMulti4120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1787:2: kw= '%'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti4139); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1800:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1801:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1802:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4179);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4189); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1809:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1812:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1813:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1813:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=40 && LA25_0<=41)||LA25_0==45) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_DECIMAL)||LA25_0==17||LA25_0==37||LA25_0==50||LA25_0==52||LA25_0==56||LA25_0==58||(LA25_0>=61 && LA25_0<=63)||LA25_0==66||(LA25_0>=68 && LA25_0<=75)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1813:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1813:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1813:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1813:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1814:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1819:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1820:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1820:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1821:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4247);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1834:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1835:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1835:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1836:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4268);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1854:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4297);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1870:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1871:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1872:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4333);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4344); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1879:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1882:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1883:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1883:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case 40:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1884:2: kw= '!'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary4382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1891:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary4401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1898:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary4420); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1911:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1912:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1913:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4460);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4470); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1920:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1923:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1924:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1924:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1925:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4517);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred10_InternalServices()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1935:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1935:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1935:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1936:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXCastedExpression4552); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1945:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1946:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1946:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1947:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4575);
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
            	    break loop27;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1971:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1972:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1973:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4613);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4623); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1980:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1983:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1984:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1984:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1985:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4670);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop35:
            do {
                int alt35=3;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred11_InternalServices()) ) {
                        alt35=1;
                    }
                    else if ( (synpred12_InternalServices()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt35=2;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1999:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1999:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1999:26: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2000:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4719); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2009:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2010:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2010:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2011:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4742);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4758);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2032:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2033:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2033:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2034:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4780);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2067:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2067:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2067:8: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2068:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2073:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2073:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4866); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2078:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2078:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2079:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2079:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2080:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4890); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2094:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2094:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2095:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2095:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2096:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4927); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2109:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==37) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2109:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4956); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2113:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2114:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2114:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2115:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4977);
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2131:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==16) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2131:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4990); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2135:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2136:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2136:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2137:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5011);
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
            	            	    break loop29;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall5025); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2157:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2158:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2158:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2159:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5050);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2172:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt33=2;
            	    alt33 = dfa33.predict(input);
            	    switch (alt33) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2172:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2172:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2172:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2179:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2180:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall5084); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt32=3;
            	            alt32 = dfa32.predict(input);
            	            switch (alt32) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2210:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2211:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5169);
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
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2228:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2228:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2228:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2228:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2229:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2229:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2230:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5197);
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

            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2246:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop31:
            	                    do {
            	                        int alt31=2;
            	                        int LA31_0 = input.LA(1);

            	                        if ( (LA31_0==16) ) {
            	                            alt31=1;
            	                        }


            	                        switch (alt31) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2246:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall5210); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2250:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2251:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2251:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2252:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5231);
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
            	                    	    break loop31;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall5248); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2272:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2272:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2277:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2278:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5281);
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
            	    break loop35;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2302:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2303:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2304:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5321);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5331); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2311:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2314:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2315:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2315:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt36=13;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt36=1;
                }
                break;
            case 17:
                {
                alt36=2;
                }
                break;
            case 58:
                {
                alt36=3;
                }
                break;
            case RULE_ID:
            case 37:
            case 66:
                {
                alt36=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 52:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt36=5;
                }
                break;
            case 56:
                {
                alt36=6;
                }
                break;
            case 61:
                {
                alt36=7;
                }
                break;
            case 62:
                {
                alt36=8;
                }
                break;
            case 63:
                {
                alt36=9;
                }
                break;
            case 73:
                {
                alt36=10;
                }
                break;
            case 74:
                {
                alt36=11;
                }
                break;
            case 75:
                {
                alt36=12;
                }
                break;
            case 50:
                {
                alt36=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2316:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5378);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2326:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5405);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2336:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5432);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2346:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5459);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2356:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5486);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2366:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5513);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2376:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5540);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2386:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5567);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2396:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5594);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2406:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5621);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2416:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5648);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2426:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5675);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2436:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5702);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2452:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2453:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2454:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5737);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5747); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2461:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2464:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2465:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2465:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt37=1;
                }
                break;
            case 69:
            case 70:
                {
                alt37=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt37=3;
                }
                break;
            case 71:
                {
                alt37=4;
                }
                break;
            case RULE_STRING:
                {
                alt37=5;
                }
                break;
            case 72:
                {
                alt37=6;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2466:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5794);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2476:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5821);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2486:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5848);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2496:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5875);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2506:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5902);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2516:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5929);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2532:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2533:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2534:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5964);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5974); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2541:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2544:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2545:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2545:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2545:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2545:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2546:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXClosure6020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2570:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2570:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2570:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID||LA39_0==50||LA39_0==78) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2570:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2570:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2571:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2571:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2572:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6091);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2588:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==16) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2588:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXClosure6104); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2592:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2593:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2593:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2594:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6125);
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
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2610:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2611:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2611:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2612:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,53,FOLLOW_53_in_ruleXClosure6147); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2625:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2626:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2626:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2627:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6184);
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

            otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXClosure6196); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2655:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2656:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2657:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6232);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6242); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2664:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2667:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2668:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2668:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2668:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2668:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2669:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2674:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_DECIMAL)||LA42_0==17||LA42_0==37||(LA42_0>=40 && LA42_0<=41)||LA42_0==45||LA42_0==50||LA42_0==52||LA42_0==56||LA42_0==58||(LA42_0>=61 && LA42_0<=66)||(LA42_0>=68 && LA42_0<=75)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2674:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2674:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2675:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2675:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2676:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6298);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2692:2: (otherlv_2= ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==55) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2692:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleXExpressionInClosure6311); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2704:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2705:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2706:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6351);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6361); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2713:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2716:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2717:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2717:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2717:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2717:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2717:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2733:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2733:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2733:7: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2734:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2739:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==50||LA44_0==78) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2739:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2739:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2740:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2740:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2741:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6469);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2757:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2757:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXShortClosure6482); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2761:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2762:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2762:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2763:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6503);
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2779:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2780:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2780:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2781:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,53,FOLLOW_53_in_ruleXShortClosure6525); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2794:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2795:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2795:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2796:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6561);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2820:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2821:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2822:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6597);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6607); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2829:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2832:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2833:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2833:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2833:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleXParenthesizedExpression6644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6666);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXParenthesizedExpression6677); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2858:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2859:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2860:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6713);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6723); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2867:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2870:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2871:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2871:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2871:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2871:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2872:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression6769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2885:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2886:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2886:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2887:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6802);
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

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2907:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2908:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2908:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2909:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6835);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2925:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred18_InternalServices()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2925:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2925:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2925:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleXIfExpression6856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2930:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2931:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2931:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2932:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6878);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2956:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2957:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2958:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6916);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6926); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2965:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2968:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2969:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2969:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2969:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2969:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2970:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_DECIMAL)||LA47_0==17||LA47_0==37||(LA47_0>=40 && LA47_0<=41)||LA47_0==45||LA47_0==52||LA47_0==56||LA47_0==58||(LA47_0>=61 && LA47_0<=63)||LA47_0==66||(LA47_0>=68 && LA47_0<=75)) ) {
                alt47=1;
            }
            else if ( (LA47_0==50) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==RULE_ID) ) {
                    int LA47_3 = input.LA(3);

                    if ( (LA47_3==24) && (synpred20_InternalServices())) {
                        alt47=2;
                    }
                    else if ( ((LA47_3>=26 && LA47_3<=44)||(LA47_3>=46 && LA47_3<=52)||LA47_3==67) ) {
                        alt47=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA47_2>=RULE_STRING && LA47_2<=RULE_DECIMAL)||LA47_2==17||LA47_2==37||(LA47_2>=40 && LA47_2<=41)||LA47_2==45||LA47_2==50||LA47_2==52||LA47_2==56||LA47_2==58||(LA47_2>=61 && LA47_2<=63)||LA47_2==66||(LA47_2>=68 && LA47_2<=75)) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        int LA46_1 = input.LA(2);

                        if ( (LA46_1==24) && (synpred19_InternalServices())) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2984:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2984:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2984:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2985:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2985:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2986:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7015);
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

                            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression7027); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3006:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3007:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3007:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3008:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7051);
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


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3031:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3031:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression7095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3035:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3036:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3036:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3037:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7116);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression7128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3057:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3058:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3058:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3059:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7151);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression7163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3083:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID||LA48_0==24||LA48_0==50||LA48_0==60||LA48_0==78) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3084:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3084:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3085:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7198);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3101:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==59) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3101:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression7212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression7224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3109:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3110:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3110:1: (lv_default_14_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3111:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7245);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression7259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3139:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3140:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3141:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7295);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7305); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3148:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3151:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3152:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3152:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3152:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3152:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==50||LA50_0==78) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3153:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3153:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3154:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7351);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3170:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3170:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart7365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3174:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3175:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3175:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3176:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7386);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXCasePart7400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3196:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3197:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3197:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3198:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7421);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3222:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3223:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3224:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7457);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7467); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3231:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3234:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3235:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3235:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3235:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3235:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3236:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXForLoopExpression7513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression7525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3249:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3250:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3250:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3251:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7546);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXForLoopExpression7558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3271:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3272:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3272:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3273:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7579);
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

            otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression7591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3293:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3294:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3294:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3295:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7612);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3319:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3320:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3321:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7648);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7658); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3328:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3331:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3332:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3332:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3332:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3332:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3333:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXWhileExpression7704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXWhileExpression7716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3346:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3347:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3347:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3348:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7737);
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

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXWhileExpression7749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3368:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3369:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3369:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3370:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7770);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3394:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3395:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3396:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7806);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7816); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3403:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3406:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3407:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3407:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3407:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3407:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3408:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3417:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3418:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3418:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3419:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7883);
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

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXDoWhileExpression7907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3443:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3444:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3444:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3445:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7928);
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

            otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXDoWhileExpression7940); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3473:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3474:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3475:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7976);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7986); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3482:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3485:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3486:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3486:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3486:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3486:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3487:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression8032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3496:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_DECIMAL)||LA53_0==17||LA53_0==37||(LA53_0>=40 && LA53_0<=41)||LA53_0==45||LA53_0==50||LA53_0==52||LA53_0==56||LA53_0==58||(LA53_0>=61 && LA53_0<=66)||(LA53_0>=68 && LA53_0<=75)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3496:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3496:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3497:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3497:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3498:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8054);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3514:2: (otherlv_3= ';' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==55) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3514:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression8067); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXBlockExpression8083); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3530:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3531:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3532:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8119);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8129); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3539:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3542:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3543:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3543:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=64 && LA54_0<=65)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_DECIMAL)||LA54_0==17||LA54_0==37||(LA54_0>=40 && LA54_0<=41)||LA54_0==45||LA54_0==50||LA54_0==52||LA54_0==56||LA54_0==58||(LA54_0>=61 && LA54_0<=63)||LA54_0==66||(LA54_0>=68 && LA54_0<=75)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3544:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8176);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3554:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8203);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3570:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3571:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3572:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8238);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8248); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3579:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3582:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3583:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3583:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3583:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3583:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3584:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3589:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==64) ) {
                alt55=1;
            }
            else if ( (LA55_0==65) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3589:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3589:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3590:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3590:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3591:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration8301); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3605:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration8332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred21_InternalServices()) ) {
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
            else if ( (LA56_0==50) && (synpred21_InternalServices())) {
                alt56=1;
            }
            else if ( (LA56_0==78) && (synpred21_InternalServices())) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3617:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3617:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3617:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3618:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3618:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3619:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8380);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3635:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3636:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3636:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3637:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8401);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3654:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3654:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3655:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3655:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3656:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8430);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3672:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3672:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXVariableDeclaration8444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3676:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3677:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3677:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3678:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8465);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3702:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3703:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3704:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8503);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8513); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3711:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3714:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3715:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3715:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3715:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3715:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_ID||LA58_1==37||LA58_1==47||LA58_1==52) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==50||LA58_0==78) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3716:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3716:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3717:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8559);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3733:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3734:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3734:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3735:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8581);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3759:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3760:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3761:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8617);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8627); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3768:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3771:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3772:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3772:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3772:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3772:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3773:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3773:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3774:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8673);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3790:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3791:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3791:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8694);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3816:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3817:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3818:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8730);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8740); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3825:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3828:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3829:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3829:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3829:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3829:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3830:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3835:2: ( ( ruleStaticQualifier ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==67) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3837:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8797);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3850:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3850:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall8811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3854:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3855:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3855:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3856:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8832);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3872:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==16) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3872:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall8845); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3876:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3877:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3877:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3878:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8866);
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

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall8880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3898:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3899:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3899:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3900:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8905);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3913:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3913:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3913:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3913:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3920:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3921:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,50,FOLLOW_50_in_ruleXFeatureCall8939); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt63=3;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3951:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3952:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9024);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3969:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3969:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3969:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3969:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3970:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3970:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3971:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9052);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3987:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==16) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3987:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall9065); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3991:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3992:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3992:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3993:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9086);
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

                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXFeatureCall9103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4013:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4013:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4018:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4019:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9136);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4043:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4044:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4045:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9174);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9185); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4052:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4055:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4056:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4056:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==66) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4057:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9232);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4069:2: kw= 'super'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleIdOrSuper9256); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4082:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4083:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4084:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9297);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9308); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4091:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4094:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4095:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4095:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID) ) {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==67) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4096:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9355);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleStaticQualifier9373); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4120:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4121:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4122:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9414);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9424); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4129:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4132:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4133:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4133:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4133:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4133:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4134:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall9470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4143:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4144:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4144:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4145:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9493);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4158:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4158:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4158:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4158:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall9514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4163:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4164:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4164:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4165:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9536);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4181:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==16) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4181:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall9549); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4185:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4186:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4186:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4187:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9570);
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

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall9584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4207:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4207:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4207:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4207:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleXConstructorCall9607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt71=3;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4229:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4230:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9680);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4247:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4247:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4247:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4247:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4248:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4248:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4249:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9708);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4265:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==16) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4265:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall9721); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4269:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4270:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4270:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4271:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9742);
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

                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXConstructorCall9759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4291:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4291:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4296:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4297:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9792);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4321:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4322:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4323:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9829);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9839); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4330:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4333:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4335:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4340:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==69) ) {
                alt74=1;
            }
            else if ( (LA74_0==70) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4340:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4345:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4345:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4346:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4346:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4347:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9910); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4368:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4369:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4370:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9960);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9970); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4377:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4380:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4381:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4381:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4381:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4381:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4382:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXNullLiteral10016); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4399:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4400:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4401:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10052);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10062); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4408:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4411:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4412:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4412:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4412:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4412:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4413:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4418:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4419:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4419:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4420:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10117);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4444:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4445:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4446:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10153);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10163); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4453:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4456:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4457:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4457:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4457:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4457:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4458:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4463:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4464:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4464:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4465:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10214); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4489:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4490:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4491:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10255);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10265); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4498:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4501:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4502:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4502:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4502:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4502:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4503:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTypeLiteral10311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXTypeLiteral10323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4516:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4517:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4517:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4518:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10346);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXTypeLiteral10358); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4543:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4544:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4545:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10394);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10404); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4552:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4555:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4556:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4556:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4556:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4556:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXThrowExpression10450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4566:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4567:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4567:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4568:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10471);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4592:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4593:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4594:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10507);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10517); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4601:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4604:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4605:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4605:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4605:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4605:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXReturnExpression10563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4615:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4615:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4620:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4621:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10594);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4645:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4646:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4647:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10631);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10641); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4654:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4657:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4658:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4658:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4658:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4658:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4668:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4669:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4669:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4670:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10708);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==77) ) {
                alt78=1;
            }
            else if ( (LA78_0==76) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==77) ) {
                            int LA76_2 = input.LA(2);

                            if ( (synpred30_InternalServices()) ) {
                                alt76=1;
                            }


                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4688:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4689:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10738);
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
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4705:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==76) ) {
                        int LA77_1 = input.LA(2);

                        if ( (synpred31_InternalServices()) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4705:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4705:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4705:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10760); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4710:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4711:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4711:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4712:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10782);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4729:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4729:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4729:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4733:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4734:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4734:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4735:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10825);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4759:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4761:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10863);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10873); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4768:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4771:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4772:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4772:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4772:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4772:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4772:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleXCatchClause10918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXCatchClause10931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4781:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4782:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4782:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4783:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10952);
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

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXCatchClause10964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4803:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4805:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10985);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4829:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4830:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4831:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11022);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11033); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4838:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4841:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4842:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4842:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4843:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11080);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4853:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==47) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==RULE_ID) ) {
                        int LA79_3 = input.LA(3);

                        if ( (synpred33_InternalServices()) ) {
                            alt79=1;
                        }


                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4853:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4853:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4853:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47_in_ruleQualifiedName11108); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11131);
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
            	    break loop79;
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


    // $ANTLR start "entryRuleNumber"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4880:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4884:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4885:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11185);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11196); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4895:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4899:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4900:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4900:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_HEX) ) {
                alt83=1;
            }
            else if ( ((LA83_0>=RULE_INT && LA83_0<=RULE_DECIMAL)) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4900:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4908:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4908:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4908:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4908:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_INT) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==RULE_DECIMAL) ) {
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4908:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11268); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4916:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11294); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4923:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==47) ) {
                        int LA82_1 = input.LA(2);

                        if ( ((LA82_1>=RULE_INT && LA82_1<=RULE_DECIMAL)) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4924:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleNumber11314); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4929:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==RULE_INT) ) {
                                alt81=1;
                            }
                            else if ( (LA81_0==RULE_DECIMAL) ) {
                                alt81=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 81, 0, input);

                                throw nvae;
                            }
                            switch (alt81) {
                                case 1 :
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4929:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11330); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4937:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11356); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4955:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4956:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4957:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11409);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11419); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4964:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4967:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4968:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4968:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID) ) {
                alt85=1;
            }
            else if ( (LA85_0==50||LA85_0==78) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4968:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4968:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4969:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11467);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==52) ) {
                            int LA84_2 = input.LA(2);

                            if ( (LA84_2==54) ) {
                                int LA84_3 = input.LA(3);

                                if ( (synpred34_InternalServices()) ) {
                                    alt84=1;
                                }


                            }


                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4980:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4980:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4980:6: ()
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4981:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleJvmTypeReference11505); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleJvmTypeReference11517); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4996:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11549);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5012:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5013:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5014:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11584);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11594); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5021:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5024:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5025:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5025:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5025:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5025:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==50) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5025:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleXFunctionTypeRef11632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5029:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_ID||LA87_0==50||LA87_0==78) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5029:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5029:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5030:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5030:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5031:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11654);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5047:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==16) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5047:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXFunctionTypeRef11667); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5051:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5052:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5052:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5053:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11688);
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
                            	    break loop86;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXFunctionTypeRef11704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleXFunctionTypeRef11718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5077:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5078:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5078:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5079:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11739);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5103:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5104:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5105:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11775);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11785); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5112:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5115:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5116:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5116:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5116:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5116:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5117:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5117:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5118:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11833);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleJvmParameterizedTypeReference11854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5136:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5137:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5137:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5138:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11876);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5154:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==16) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5154:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJvmParameterizedTypeReference11889); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5158:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5159:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5159:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5160:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11910);
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
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference11924); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5188:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5189:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5190:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11962);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11972); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5197:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5200:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5201:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5201:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID||LA91_0==50||LA91_0==78) ) {
                alt91=1;
            }
            else if ( (LA91_0==79) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5202:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12019);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5212:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12046);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5228:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5229:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5230:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12081);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12091); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5237:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5240:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5241:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5241:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5241:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5241:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5242:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleJvmWildcardTypeReference12137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5251:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==80) ) {
                alt92=1;
            }
            else if ( (LA92_0==66) ) {
                alt92=2;
            }
            switch (alt92) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5251:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5251:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5252:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5252:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5253:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12159);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5270:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5270:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5271:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5271:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5272:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12186);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5296:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5297:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5298:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12224);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12234); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5305:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5308:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5309:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5309:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5309:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBound12271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5313:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5314:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5314:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5315:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12292);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5339:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5340:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5341:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12328);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12338); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5348:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5351:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5352:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5352:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5352:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded12375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5356:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5357:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5357:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5358:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12396);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5382:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5383:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5384:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12432);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12442); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5391:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5394:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5395:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5395:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5395:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleJvmLowerBound12479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5399:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5400:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5400:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5401:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12500);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5427:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5428:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5429:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12539);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12550); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5436:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5439:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5440:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12589); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalServices
    public final void synpred1_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:893:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:894:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:894:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:895:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:895:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:896:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1847);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalServices

    // $ANTLR start synpred2_InternalServices
    public final void synpred2_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1021:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1022:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1022:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1023:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1023:1: ( ruleOpOr )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1024:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalServices2195);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalServices

    // $ANTLR start synpred3_InternalServices
    public final void synpred3_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1122:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1123:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1123:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1124:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1124:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1125:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalServices2454);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalServices

    // $ANTLR start synpred4_InternalServices
    public final void synpred4_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1224:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1224:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1225:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1225:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1226:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalServices2713);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalServices

    // $ANTLR start synpred5_InternalServices
    public final void synpred5_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1332:1: 
        {
        }

        match(input,33,FOLLOW_33_in_synpred5_InternalServices2989); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalServices

    // $ANTLR start synpred6_InternalServices
    public final void synpred6_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1362:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1363:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1363:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1364:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1364:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1365:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalServices3060);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalServices

    // $ANTLR start synpred7_InternalServices
    public final void synpred7_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1484:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1485:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1485:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1486:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1486:1: ( ruleOpOther )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1487:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalServices3379);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalServices

    // $ANTLR start synpred8_InternalServices
    public final void synpred8_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1592:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1593:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1593:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1594:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1594:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1595:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalServices3659);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalServices

    // $ANTLR start synpred9_InternalServices
    public final void synpred9_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1700:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1701:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1701:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1702:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1702:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1703:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalServices3939);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalServices

    // $ANTLR start synpred10_InternalServices
    public final void synpred10_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:4: ( () 'as' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:5: () 'as'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1934:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred10_InternalServices4533); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalServices

    // $ANTLR start synpred11_InternalServices
    public final void synpred11_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1993:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1994:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred11_InternalServices4687); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1995:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1996:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1996:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1997:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalServices4696);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices4702);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalServices

    // $ANTLR start synpred12_InternalServices
    public final void synpred12_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2052:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2052:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt93=3;
        switch ( input.LA(1) ) {
        case 47:
            {
            alt93=1;
            }
            break;
        case 48:
            {
            alt93=2;
            }
            break;
        case 49:
            {
            alt93=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2052:4: '.'
                {
                match(input,47,FOLLOW_47_in_synpred12_InternalServices4805); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2054:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2054:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2055:1: ( '?.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2055:1: ( '?.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2056:2: '?.'
                {
                match(input,48,FOLLOW_48_in_synpred12_InternalServices4819); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2061:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2061:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2062:1: ( '*.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2062:1: ( '*.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2063:2: '*.'
                {
                match(input,49,FOLLOW_49_in_synpred12_InternalServices4839); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalServices

    // $ANTLR start synpred13_InternalServices
    public final void synpred13_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2172:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2173:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2173:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2174:2: '('
        {
        match(input,50,FOLLOW_50_in_synpred13_InternalServices5066); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalServices

    // $ANTLR start synpred14_InternalServices
    public final void synpred14_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2194:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2194:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==50||LA95_0==78) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2194:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2194:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2195:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2195:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2196:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices5118);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2198:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==16) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2198:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred14_InternalServices5125); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2199:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2200:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2200:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2201:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices5132);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2203:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2204:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2204:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2205:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred14_InternalServices5146); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalServices

    // $ANTLR start synpred15_InternalServices
    public final void synpred15_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2272:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2273:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2273:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2274:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalServices5264);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalServices

    // $ANTLR start synpred16_InternalServices
    public final void synpred16_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==50||LA97_0==78) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2555:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2556:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2556:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2557:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices6037);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2559:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==16) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2559:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred16_InternalServices6044); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2560:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2561:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2561:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2562:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices6051);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2564:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2565:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2565:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2566:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred16_InternalServices6065); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalServices

    // $ANTLR start synpred18_InternalServices
    public final void synpred18_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2925:4: ( 'else' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2925:6: 'else'
        {
        match(input,57,FOLLOW_57_in_synpred18_InternalServices6848); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalServices

    // $ANTLR start synpred19_InternalServices
    public final void synpred19_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2979:6: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2980:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2980:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2981:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalServices6990);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,24,FOLLOW_24_in_synpred19_InternalServices6996); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalServices

    // $ANTLR start synpred20_InternalServices
    public final void synpred20_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,50,FOLLOW_50_in_synpred20_InternalServices7072); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3026:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3027:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3027:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3028:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalServices7079);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,24,FOLLOW_24_in_synpred20_InternalServices7085); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalServices

    // $ANTLR start synpred21_InternalServices
    public final void synpred21_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3609:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3610:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3610:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3611:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices8350);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3613:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3614:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3614:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3615:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalServices8359);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalServices

    // $ANTLR start synpred22_InternalServices
    public final void synpred22_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3913:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3914:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3914:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3915:2: '('
        {
        match(input,50,FOLLOW_50_in_synpred22_InternalServices8921); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalServices

    // $ANTLR start synpred23_InternalServices
    public final void synpred23_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3934:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3935:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3935:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==50||LA101_0==78) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3935:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3935:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3936:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3936:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3937:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8973);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3939:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==16) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3939:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred23_InternalServices8980); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3940:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3941:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3941:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3942:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8987);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3944:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3945:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3945:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3946:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred23_InternalServices9001); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalServices

    // $ANTLR start synpred24_InternalServices
    public final void synpred24_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4013:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4014:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4014:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4015:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalServices9119);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalServices

    // $ANTLR start synpred25_InternalServices
    public final void synpred25_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4158:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4158:6: '<'
        {
        match(input,37,FOLLOW_37_in_synpred25_InternalServices9506); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalServices

    // $ANTLR start synpred26_InternalServices
    public final void synpred26_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4207:5: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4207:7: '('
        {
        match(input,50,FOLLOW_50_in_synpred26_InternalServices9599); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalServices

    // $ANTLR start synpred27_InternalServices
    public final void synpred27_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4212:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4213:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4213:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==50||LA103_0==78) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4213:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4213:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4214:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4214:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4215:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9629);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4217:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==16) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4217:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred27_InternalServices9636); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4218:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4219:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4219:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4220:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9643);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop102;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4222:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4223:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4223:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4224:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred27_InternalServices9657); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalServices

    // $ANTLR start synpred28_InternalServices
    public final void synpred28_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4291:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4292:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4292:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4293:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred28_InternalServices9775);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalServices

    // $ANTLR start synpred29_InternalServices
    public final void synpred29_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4615:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4616:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4616:1: ( ruleXExpression )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4617:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred29_InternalServices10577);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalServices

    // $ANTLR start synpred30_InternalServices
    public final void synpred30_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:5: ( 'catch' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4686:7: 'catch'
        {
        match(input,77,FOLLOW_77_in_synpred30_InternalServices10722); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalServices

    // $ANTLR start synpred31_InternalServices
    public final void synpred31_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4705:5: ( 'finally' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4705:7: 'finally'
        {
        match(input,76,FOLLOW_76_in_synpred31_InternalServices10752); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalServices

    // $ANTLR start synpred33_InternalServices
    public final void synpred33_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4853:3: ( '.' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4854:2: '.'
        {
        match(input,47,FOLLOW_47_in_synpred33_InternalServices11099); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalServices

    // $ANTLR start synpred34_InternalServices
    public final void synpred34_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:3: ( () '[' ']' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:4: () '[' ']'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:4: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4978:1: 
        {
        }

        match(input,52,FOLLOW_52_in_synpred34_InternalServices11482); if (state.failed) return ;
        match(input,54,FOLLOW_54_in_synpred34_InternalServices11486); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalServices

    // $ANTLR start synpred35_InternalServices
    public final void synpred35_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:6: '<'
        {
        match(input,37,FOLLOW_37_in_synpred35_InternalServices11846); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalServices

    // Delegated rules

    public final boolean synpred33_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalServices() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalServices_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String DFA33_eotS =
        "\76\uffff";
    static final String DFA33_eofS =
        "\1\2\75\uffff";
    static final String DFA33_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA33_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA33_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA33_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\26\2\1\1\2\2\1\uffff\15\2\1\uffff\13\2",
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
            return "2172:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_1);
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
    static final String DFA32_eotS =
        "\36\uffff";
    static final String DFA32_eofS =
        "\36\uffff";
    static final String DFA32_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA32_maxS =
        "\1\116\2\0\33\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA32_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\4\5\10\uffff\1\5\23\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\2\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "2193:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==RULE_ID) ) {s = 1;}

                        else if ( (LA32_0==50) ) {s = 2;}

                        else if ( (LA32_0==78) && (synpred14_InternalServices())) {s = 3;}

                        else if ( (LA32_0==53) && (synpred14_InternalServices())) {s = 4;}

                        else if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_DECIMAL)||LA32_0==17||LA32_0==37||(LA32_0>=40 && LA32_0<=41)||LA32_0==45||LA32_0==52||LA32_0==56||LA32_0==58||(LA32_0>=61 && LA32_0<=63)||LA32_0==66||(LA32_0>=68 && LA32_0<=75)) ) {s = 5;}

                        else if ( (LA32_0==51) ) {s = 29;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\76\uffff";
    static final String DFA34_eofS =
        "\1\2\75\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA34_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\30\2\1\1\1\uffff\15\2\1\uffff\13\2",
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
            return "2272:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalServices()) ) {s = 61;}

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
    static final String DFA40_eotS =
        "\40\uffff";
    static final String DFA40_eofS =
        "\40\uffff";
    static final String DFA40_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA40_maxS =
        "\1\116\2\0\35\uffff";
    static final String DFA40_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA40_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\4\5\10\uffff\1\5\23\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\2\uffff"+
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
            "",
            "",
            ""
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
            return "2555:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==RULE_ID) ) {s = 1;}

                        else if ( (LA40_0==50) ) {s = 2;}

                        else if ( (LA40_0==78) && (synpred16_InternalServices())) {s = 3;}

                        else if ( (LA40_0==53) && (synpred16_InternalServices())) {s = 4;}

                        else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_DECIMAL)||LA40_0==17||LA40_0==37||(LA40_0>=40 && LA40_0<=41)||LA40_0==45||LA40_0==52||LA40_0==54||LA40_0==56||LA40_0==58||(LA40_0>=61 && LA40_0<=66)||(LA40_0>=68 && LA40_0<=75)) ) {s = 5;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\76\uffff";
    static final String DFA64_eofS =
        "\1\2\75\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA64_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA64_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\26\2\1\1\2\2\1\uffff\15\2\1\uffff\13\2",
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
            return "3913:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred22_InternalServices()) ) {s = 61;}

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
        "\36\uffff";
    static final String DFA63_eofS =
        "\36\uffff";
    static final String DFA63_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA63_maxS =
        "\1\116\2\0\33\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA63_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\1\4\5\10\uffff\1\5\23\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\2\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3934:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA63_0==50) ) {s = 2;}

                        else if ( (LA63_0==78) && (synpred23_InternalServices())) {s = 3;}

                        else if ( (LA63_0==53) && (synpred23_InternalServices())) {s = 4;}

                        else if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_DECIMAL)||LA63_0==17||LA63_0==37||(LA63_0>=40 && LA63_0<=41)||LA63_0==45||LA63_0==52||LA63_0==56||LA63_0==58||(LA63_0>=61 && LA63_0<=63)||LA63_0==66||(LA63_0>=68 && LA63_0<=75)) ) {s = 5;}

                        else if ( (LA63_0==51) ) {s = 29;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA65_eofS =
        "\1\2\75\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA65_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\30\2\1\1\1\uffff\15\2\1\uffff\13\2",
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
            return "4013:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred24_InternalServices()) ) {s = 61;}

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
    static final String DFA69_eotS =
        "\76\uffff";
    static final String DFA69_eofS =
        "\1\2\75\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA69_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\11\2\1\1\17\2\1\uffff\15\2\1\uffff\13\2",
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

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "4158:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\76\uffff";
    static final String DFA72_eofS =
        "\1\2\75\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA72_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA72_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\26\2\1\1\2\2\1\uffff\15\2\1\uffff\13\2",
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
            return "4207:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalServices()) ) {s = 61;}

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
    static final String DFA71_eotS =
        "\36\uffff";
    static final String DFA71_eofS =
        "\36\uffff";
    static final String DFA71_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA71_maxS =
        "\1\116\2\0\33\uffff";
    static final String DFA71_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA71_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\4\5\10\uffff\1\5\23\uffff\1\5\2\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\2\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "4212:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA71_0==50) ) {s = 2;}

                        else if ( (LA71_0==78) && (synpred27_InternalServices())) {s = 3;}

                        else if ( (LA71_0==53) && (synpred27_InternalServices())) {s = 4;}

                        else if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_DECIMAL)||LA71_0==17||LA71_0==37||(LA71_0>=40 && LA71_0<=41)||LA71_0==45||LA71_0==52||LA71_0==56||LA71_0==58||(LA71_0>=61 && LA71_0<=63)||LA71_0==66||(LA71_0>=68 && LA71_0<=75)) ) {s = 5;}

                        else if ( (LA71_0==51) ) {s = 29;}

                         
                        input.seek(index71_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

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
    static final String DFA73_eotS =
        "\76\uffff";
    static final String DFA73_eofS =
        "\1\2\75\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA73_maxS =
        "\1\116\1\0\74\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\30\2\1\1\1\uffff\15\2\1\uffff\13\2",
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

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4291:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\76\uffff";
    static final String DFA75_eofS =
        "\1\33\75\uffff";
    static final String DFA75_minS =
        "\1\4\32\0\43\uffff";
    static final String DFA75_maxS =
        "\1\116\32\0\43\uffff";
    static final String DFA75_acceptS =
        "\33\uffff\1\2\41\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\43\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\7\uffff\1\33\1\6\1\uffff\1\33\4\uffff"+
            "\1\33\1\uffff\1\33\1\uffff\11\33\1\10\2\33\1\4\1\3\3\33\1\2"+
            "\4\33\1\32\1\33\1\12\1\uffff\2\33\1\23\1\33\1\7\2\33\1\24\1"+
            "\25\1\26\2\33\1\11\1\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30"+
            "\1\31\3\33",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4615:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_3 = input.LA(1);

                         
                        int index75_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA75_4 = input.LA(1);

                         
                        int index75_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA75_5 = input.LA(1);

                         
                        int index75_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA75_6 = input.LA(1);

                         
                        int index75_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA75_7 = input.LA(1);

                         
                        int index75_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA75_8 = input.LA(1);

                         
                        int index75_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA75_9 = input.LA(1);

                         
                        int index75_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA75_10 = input.LA(1);

                         
                        int index75_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA75_11 = input.LA(1);

                         
                        int index75_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA75_12 = input.LA(1);

                         
                        int index75_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA75_13 = input.LA(1);

                         
                        int index75_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA75_14 = input.LA(1);

                         
                        int index75_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA75_15 = input.LA(1);

                         
                        int index75_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA75_16 = input.LA(1);

                         
                        int index75_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA75_17 = input.LA(1);

                         
                        int index75_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA75_18 = input.LA(1);

                         
                        int index75_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA75_19 = input.LA(1);

                         
                        int index75_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA75_20 = input.LA(1);

                         
                        int index75_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA75_21 = input.LA(1);

                         
                        int index75_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA75_22 = input.LA(1);

                         
                        int index75_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA75_23 = input.LA(1);

                         
                        int index75_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA75_24 = input.LA(1);

                         
                        int index75_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA75_25 = input.LA(1);

                         
                        int index75_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA75_26 = input.LA(1);

                         
                        int index75_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\102\uffff";
    static final String DFA90_eofS =
        "\1\2\101\uffff";
    static final String DFA90_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA90_maxS =
        "\1\116\1\0\100\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA90_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA90_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\6\2\1\uffff\1\2\1\uffff\11\2\1\1\17"+
            "\2\1\uffff\15\2\1\uffff\13\2",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "5131:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalServices()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index90_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleServicesFile_in_entryRuleServicesFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicesFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleServicesFile130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComponent212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponent233 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleComponent254 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_14_in_ruleComponent267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleComponent288 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleComponent301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleComponent322 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleComponent335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleComponent356 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleComponent372 = new BitSet(new long[]{0x0000000000FE0010L});
    public static final BitSet FOLLOW_18_in_ruleComponent385 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_ruleComponent406 = new BitSet(new long[]{0x0000000000FB0010L});
    public static final BitSet FOLLOW_16_in_ruleComponent419 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_ruleComponent440 = new BitSet(new long[]{0x0000000000FB0010L});
    public static final BitSet FOLLOW_ruleService_in_ruleComponent465 = new BitSet(new long[]{0x0000000000FA0010L});
    public static final BitSet FOLLOW_19_in_ruleComponent478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleService568 = new BitSet(new long[]{0x0000000000F20010L});
    public static final BitSet FOLLOW_21_in_ruleService605 = new BitSet(new long[]{0x0000000000F20010L});
    public static final BitSet FOLLOW_22_in_ruleService642 = new BitSet(new long[]{0x0000000000F20010L});
    public static final BitSet FOLLOW_23_in_ruleService679 = new BitSet(new long[]{0x0000000000F20010L});
    public static final BitSet FOLLOW_rulePath_in_ruleService715 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleService727 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleService748 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleService769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_entryRuleRequireDeclaration805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequireDeclaration815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleRequireDeclaration861 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequireDeclaration878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleImport967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePath1080 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulePath1093 = new BitSet(new long[]{0x0000000000F20010L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePath1114 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSegment_in_rulePathSegment1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSegment_in_rulePathSegment1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSegment_in_entryRuleParameterSegment1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSegment1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParameterSegment1318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterSegment1339 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleParameterSegment1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParameter1443 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParameter1455 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleParameter1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSegment_in_entryRuleSimpleSegment1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSegment1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleSimpleSegment1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1776 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1826 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1879 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpSingleAssign1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2174 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2227 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2250 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOr2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2433 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2486 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2509 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAnd2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2692 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2745 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2768 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpEquality2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2972 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_33_in_ruleXRelationalExpression3008 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3031 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3092 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3115 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3358 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3411 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3434 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3638 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3691 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3714 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpAdd3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3918 = new BitSet(new long[]{0x00001C0004000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3971 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3994 = new BitSet(new long[]{0x00001C0004000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpMulti4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4247 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4517 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXCastedExpression4552 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4575 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4670 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4742 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4758 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4780 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4866 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4890 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4927 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4956 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4977 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4990 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5011 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall5025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5050 = new BitSet(new long[]{0x0017800000000002L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall5084 = new BitSet(new long[]{0xE53C2320000201F0L,0x0000000000004FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5169 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5197 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall5210 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5231 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall5248 = new BitSet(new long[]{0x0013800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5281 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXClosure6020 = new BitSet(new long[]{0xE5742320000201F0L,0x0000000000004FF7L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6091 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXClosure6104 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6125 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure6147 = new BitSet(new long[]{0xE5542320000201F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6184 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXClosure6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6298 = new BitSet(new long[]{0xE5942320000201F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_55_in_ruleXExpressionInClosure6311 = new BitSet(new long[]{0xE5142320000201F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6469 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXShortClosure6482 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6503 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_53_in_ruleXShortClosure6525 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXParenthesizedExpression6644 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6666 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXParenthesizedExpression6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression6769 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6781 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6802 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6814 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6835 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXIfExpression6856 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6972 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7015 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression7027 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7051 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression7095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7116 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression7128 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7151 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression7163 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7177 = new BitSet(new long[]{0x1004000001000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7198 = new BitSet(new long[]{0x1804000001080010L,0x0000000000004000L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression7212 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression7224 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7245 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7351 = new BitSet(new long[]{0x1000000001000000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart7365 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7386 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXCasePart7400 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXForLoopExpression7513 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression7525 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7546 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXForLoopExpression7558 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7579 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression7591 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXWhileExpression7704 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXWhileExpression7716 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7737 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXWhileExpression7749 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7862 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7883 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7895 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXDoWhileExpression7907 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7928 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXDoWhileExpression7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression8032 = new BitSet(new long[]{0xE5142320000A01F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8054 = new BitSet(new long[]{0xE5942320000A01F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression8067 = new BitSet(new long[]{0xE5142320000A01F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_19_in_ruleXBlockExpression8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration8301 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration8332 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8401 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8430 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXVariableDeclaration8444 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8797 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall8811 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8832 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall8845 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8866 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall8880 = new BitSet(new long[]{0x0000002000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8905 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXFeatureCall8939 = new BitSet(new long[]{0xE53C2320000201F0L,0x0000000000004FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9024 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9052 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall9065 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9086 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_51_in_ruleXFeatureCall9103 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIdOrSuper9256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStaticQualifier9373 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall9470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9493 = new BitSet(new long[]{0x0014002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall9514 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9536 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall9549 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9570 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall9584 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXConstructorCall9607 = new BitSet(new long[]{0xE53C2320000201F0L,0x0000000000004FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9680 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9708 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall9721 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9742 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_51_in_ruleXConstructorCall9759 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXNullLiteral10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTypeLiteral10311 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXTypeLiteral10323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10346 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXTypeLiteral10358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXThrowExpression10450 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXReturnExpression10563 = new BitSet(new long[]{0xE5142320000201F2L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10687 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10760 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10804 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXCatchClause10918 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCatchClause10931 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10952 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXCatchClause10964 = new BitSet(new long[]{0xE5142320000201F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11080 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleQualifiedName11108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11131 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11268 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11294 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleNumber11314 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11467 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleJvmTypeReference11505 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleJvmTypeReference11517 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXFunctionTypeRef11632 = new BitSet(new long[]{0x000C000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11654 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFunctionTypeRef11667 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11688 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_51_in_ruleXFunctionTypeRef11704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleXFunctionTypeRef11718 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11833 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleJvmParameterizedTypeReference11854 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11876 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleJvmParameterizedTypeReference11889 = new BitSet(new long[]{0x0004000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11910 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmWildcardTypeReference12137 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010004L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBound12271 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded12375 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleJvmLowerBound12479 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalServices2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalServices2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalServices2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred5_InternalServices2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalServices3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalServices3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalServices3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalServices3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred10_InternalServices4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred11_InternalServices4687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalServices4696 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred12_InternalServices4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred12_InternalServices4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred12_InternalServices4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred13_InternalServices5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices5118 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_16_in_synpred14_InternalServices5125 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices5132 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_53_in_synpred14_InternalServices5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalServices5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices6037 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_16_in_synpred16_InternalServices6044 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices6051 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_53_in_synpred16_InternalServices6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred18_InternalServices6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalServices6990 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred19_InternalServices6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred20_InternalServices7072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalServices7079 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred20_InternalServices7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices8350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalServices8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred22_InternalServices8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8973 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_16_in_synpred23_InternalServices8980 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8987 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_53_in_synpred23_InternalServices9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalServices9119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred25_InternalServices9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred26_InternalServices9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9629 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_16_in_synpred27_InternalServices9636 = new BitSet(new long[]{0x0004000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9643 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_53_in_synpred27_InternalServices9657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred28_InternalServices9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred29_InternalServices10577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred30_InternalServices10722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred31_InternalServices10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred33_InternalServices11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred34_InternalServices11482 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred34_InternalServices11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred35_InternalServices11846 = new BitSet(new long[]{0x0000000000000002L});

}