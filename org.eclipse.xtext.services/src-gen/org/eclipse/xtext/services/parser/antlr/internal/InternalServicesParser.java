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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'component'", "'conforms'", "','", "'{'", "'requires'", "'}'", "'service'", "'['", "'GET'", "'POST'", "'PUT'", "'DELETE'", "']'", "'('", "')'", "':'", "'import'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'|'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    public static final int T__82=82;
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

                if ( (LA1_0==30) ) {
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

                if ( (LA6_0==RULE_ID||LA6_0==20) ) {
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:312:1: ruleService returns [EObject current=null] : ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_service_0_0=null;
        Token otherlv_1=null;
        Token lv_get_2_0=null;
        Token lv_post_3_0=null;
        Token lv_put_4_0=null;
        Token lv_delete_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_params_11_0 = null;

        EObject lv_type_14_0 = null;

        EObject lv_body_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:315:28: ( ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:1: ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:1: ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:2: ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )? ( (lv_name_7_0= ruleValidID ) ) otherlv_8= '(' ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_type_14_0= ruleJvmTypeReference ) ) ( (lv_body_15_0= ruleXBlockExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:2: ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:3: ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) ) otherlv_6= ']'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:316:3: ( (lv_service_0_0= 'service' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:317:1: (lv_service_0_0= 'service' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:317:1: (lv_service_0_0= 'service' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:318:3: lv_service_0_0= 'service'
                    {
                    lv_service_0_0=(Token)match(input,20,FOLLOW_20_in_ruleService568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_service_0_0, grammarAccess.getServiceAccess().getServiceServiceKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getServiceRule());
                      	        }
                             		setWithLastConsumed(current, "service", true, "service");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleService593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_0_1());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:335:1: ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) | ( (lv_put_4_0= 'PUT' ) ) | ( (lv_delete_5_0= 'DELETE' ) ) )
                    int alt7=4;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt7=1;
                        }
                        break;
                    case 23:
                        {
                        alt7=2;
                        }
                        break;
                    case 24:
                        {
                        alt7=3;
                        }
                        break;
                    case 25:
                        {
                        alt7=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:335:2: ( (lv_get_2_0= 'GET' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:335:2: ( (lv_get_2_0= 'GET' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:336:1: (lv_get_2_0= 'GET' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:336:1: (lv_get_2_0= 'GET' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:337:3: lv_get_2_0= 'GET'
                            {
                            lv_get_2_0=(Token)match(input,22,FOLLOW_22_in_ruleService612); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_get_2_0, grammarAccess.getServiceAccess().getGetGETKeyword_0_2_0_0());
                                  
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:351:6: ( (lv_post_3_0= 'POST' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:351:6: ( (lv_post_3_0= 'POST' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:352:1: (lv_post_3_0= 'POST' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:352:1: (lv_post_3_0= 'POST' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:353:3: lv_post_3_0= 'POST'
                            {
                            lv_post_3_0=(Token)match(input,23,FOLLOW_23_in_ruleService649); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_post_3_0, grammarAccess.getServiceAccess().getPostPOSTKeyword_0_2_1_0());
                                  
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:367:6: ( (lv_put_4_0= 'PUT' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:367:6: ( (lv_put_4_0= 'PUT' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:368:1: (lv_put_4_0= 'PUT' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:368:1: (lv_put_4_0= 'PUT' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:369:3: lv_put_4_0= 'PUT'
                            {
                            lv_put_4_0=(Token)match(input,24,FOLLOW_24_in_ruleService686); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_put_4_0, grammarAccess.getServiceAccess().getPutPUTKeyword_0_2_2_0());
                                  
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:383:6: ( (lv_delete_5_0= 'DELETE' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:383:6: ( (lv_delete_5_0= 'DELETE' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:384:1: (lv_delete_5_0= 'DELETE' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:384:1: (lv_delete_5_0= 'DELETE' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:385:3: lv_delete_5_0= 'DELETE'
                            {
                            lv_delete_5_0=(Token)match(input,25,FOLLOW_25_in_ruleService723); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_delete_5_0, grammarAccess.getServiceAccess().getDeleteDELETEKeyword_0_2_3_0());
                                  
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

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleService749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:402:3: ( (lv_name_7_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:403:1: (lv_name_7_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:403:1: (lv_name_7_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:404:3: lv_name_7_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleService772);
            lv_name_7_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_7_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleService784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:424:1: ( ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==27||LA10_0==79) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:424:2: ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:424:2: ( (lv_params_9_0= ruleFullJvmFormalParameter ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:425:1: (lv_params_9_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:425:1: (lv_params_9_0= ruleFullJvmFormalParameter )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:426:3: lv_params_9_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getServiceAccess().getParamsFullJvmFormalParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleService806);
                    lv_params_9_0=ruleFullJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getServiceRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_9_0, 
                              		"FullJvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:442:2: (otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:442:4: otherlv_10= ',' ( (lv_params_11_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleService819); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:446:1: ( (lv_params_11_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:447:1: (lv_params_11_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:447:1: (lv_params_11_0= ruleFullJvmFormalParameter )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:448:3: lv_params_11_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getServiceAccess().getParamsFullJvmFormalParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleService840);
                    	    lv_params_11_0=ruleFullJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_11_0, 
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

            otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleService856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleService868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getColonKeyword_5());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:472:1: ( (lv_type_14_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:473:1: (lv_type_14_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:473:1: (lv_type_14_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:474:3: lv_type_14_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getTypeJvmTypeReferenceParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleService889);
            lv_type_14_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_14_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:490:2: ( (lv_body_15_0= ruleXBlockExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:491:1: (lv_body_15_0= ruleXBlockExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:491:1: (lv_body_15_0= ruleXBlockExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:492:3: lv_body_15_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getBodyXBlockExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleService910);
            lv_body_15_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_15_0, 
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:516:1: entryRuleRequireDeclaration returns [EObject current=null] : iv_ruleRequireDeclaration= ruleRequireDeclaration EOF ;
    public final EObject entryRuleRequireDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireDeclaration = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:517:2: (iv_ruleRequireDeclaration= ruleRequireDeclaration EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:518:2: iv_ruleRequireDeclaration= ruleRequireDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequireDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRequireDeclaration_in_entryRuleRequireDeclaration946);
            iv_ruleRequireDeclaration=ruleRequireDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequireDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequireDeclaration956); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:525:1: ruleRequireDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleRequireDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:528:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:529:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:529:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:529:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:529:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:530:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:530:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:531:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequireDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleRequireDeclaration1002);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:547:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||LA11_1==RULE_ID||LA11_1==16||(LA11_1>=19 && LA11_1<=20)) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:548:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:548:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:549:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequireDeclaration1019); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:573:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:574:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:575:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1061);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1071); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:582:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:585:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:586:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:586:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:586:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleImport1108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:590:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:591:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:591:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:592:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport1129);
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


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:616:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:617:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:618:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1165);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1175); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:625:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:628:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:630:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1221);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:646:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:647:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:648:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1255);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1265); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:655:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:658:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_DECIMAL)||(LA13_1>=16 && LA13_1<=17)||LA13_1==19||LA13_1==21||(LA13_1>=26 && LA13_1<=29)||(LA13_1>=32 && LA13_1<=54)||(LA13_1>=56 && LA13_1<=79)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==31) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_DECIMAL)||LA13_0==17||LA13_0==21||LA13_0==27||LA13_0==41||(LA13_0>=44 && LA13_0<=45)||LA13_0==50||LA13_0==57||LA13_0==59||(LA13_0>=62 && LA13_0<=64)||LA13_0==67||(LA13_0>=69 && LA13_0<=76)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:659:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:660:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:665:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:666:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:666:1: ( ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:667:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1323);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1339);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:688:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:689:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:689:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:690:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1359);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:707:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:707:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:708:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1389);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==32) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred1_InternalServices()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:721:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:721:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:721:7: ()
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:722:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:727:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:728:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:728:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:729:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1442);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:742:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:743:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:743:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:744:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1465);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:768:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:769:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:770:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1505);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1516); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:777:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:780:28: (kw= '=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:782:2: kw= '='
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpSingleAssign1553); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:795:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:796:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:797:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1593);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1604); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:804:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:807:28: (kw= '+=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:809:2: kw= '+='
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMultiAssign1641); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:822:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:823:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:824:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1680);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1690); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:831:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:834:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:835:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:835:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:836:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1737);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred2_InternalServices()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:849:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:849:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:849:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:850:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:855:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:856:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:856:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:857:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1790);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:870:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:871:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:871:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:872:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1813);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:896:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:897:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:898:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1852);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1863); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:905:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:908:28: (kw= '||' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:910:2: kw= '||'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOr1900); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:923:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:924:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:925:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1939);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1949); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:932:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:935:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:936:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:936:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:937:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1996);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred3_InternalServices()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:950:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:950:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:950:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:951:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:956:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:957:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:957:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:958:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2049);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:971:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:972:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:972:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:973:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2072);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:997:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:998:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:999:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2111);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2122); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1006:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1009:28: (kw= '&&' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1011:2: kw= '&&'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAnd2159); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1024:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1025:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1026:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2198);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2208); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1033:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1036:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1037:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1037:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1038:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2255);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==36) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1051:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1051:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1051:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1052:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1057:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1058:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1058:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1059:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2308);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1072:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1073:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1073:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1074:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2331);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1098:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1099:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1100:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2370);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2381); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1107:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1110:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1111:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1111:1: (kw= '==' | kw= '!=' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1112:2: kw= '=='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpEquality2419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1119:2: kw= '!='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpEquality2438); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1132:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1133:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1134:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2478);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2488); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1144:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1145:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1145:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1146:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2535);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop18:
            do {
                int alt18=3;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred5_InternalServices()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA18_6 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt18=2;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1156:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1156:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1156:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1157:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXRelationalExpression2571); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1166:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1167:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1167:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1168:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2594);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1190:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1190:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1190:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1191:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1196:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1197:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1197:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1198:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2655);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1211:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1212:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1212:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1213:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2678);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1237:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1238:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1239:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2718);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2729); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1246:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1249:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1250:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1250:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1251:2: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpCompare2767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1258:2: kw= '<='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare2786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1265:2: kw= '>'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare2805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1272:2: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare2824); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1285:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1286:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1287:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2864);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2874); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1294:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1297:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1298:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1298:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1299:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2921);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==43) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1312:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1312:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1312:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1313:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1318:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1319:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1319:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1320:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2974);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1333:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1334:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1334:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1335:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2997);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1359:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1360:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1361:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3036);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3047); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1368:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1371:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1372:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1372:1: (kw= '->' | kw= '..' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            else if ( (LA21_0==43) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1373:2: kw= '->'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther3085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1380:2: kw= '..'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpOther3104); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1393:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1394:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1395:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3144);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3154); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1402:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1405:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1406:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1406:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1407:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3201);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==45) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1420:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1420:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1420:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1421:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1426:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1427:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1427:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1428:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3254);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1441:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1443:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3277);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1467:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1468:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1469:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3316);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3327); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1476:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1479:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1480:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1480:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            else if ( (LA23_0==45) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1481:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd3365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1488:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpAdd3384); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1501:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1502:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1503:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3424);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3434); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1510:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1513:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1514:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1514:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1515:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3481);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1528:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1528:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1528:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1529:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1534:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1535:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1535:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1536:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3534);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1549:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1550:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1550:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1551:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3557);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1575:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1576:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1577:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3596);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3607); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1584:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1587:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1588:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1588:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt25=1;
                }
                break;
            case 47:
                {
                alt25=2;
                }
                break;
            case 48:
                {
                alt25=3;
                }
                break;
            case 49:
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1589:2: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti3645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1596:2: kw= '**'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti3664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1603:2: kw= '/'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti3683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1610:2: kw= '%'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpMulti3702); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1623:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1624:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1625:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3742);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3752); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1632:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1635:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1636:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1636:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=44 && LA26_0<=45)||LA26_0==50) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_DECIMAL)||LA26_0==17||LA26_0==21||LA26_0==27||LA26_0==41||LA26_0==57||LA26_0==59||(LA26_0>=62 && LA26_0<=64)||LA26_0==67||(LA26_0>=69 && LA26_0<=76)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1636:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1636:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1636:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1636:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1637:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1642:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1643:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1643:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1644:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3810);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1657:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1658:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1658:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1659:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3831);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1677:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3860);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1693:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1694:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1695:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3896);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3907); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1702:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1705:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1706:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1706:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 44:
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1707:2: kw= '!'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpUnary3945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1714:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary3964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1721:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary3983); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1734:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1735:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1736:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4023);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4033); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1743:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1746:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1747:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1747:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1748:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4080);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==51) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred10_InternalServices()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1758:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1758:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1758:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1759:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXCastedExpression4115); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1768:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1769:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1769:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1770:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4138);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1794:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1795:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1796:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4176);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4186); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1803:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1806:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1807:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1807:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1808:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4233);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred11_InternalServices()) ) {
                        alt36=1;
                    }
                    else if ( (synpred12_InternalServices()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:26: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1823:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4282); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1832:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1833:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1833:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1834:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4305);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4321);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1855:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1856:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1856:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1857:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4343);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1890:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1890:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1890:8: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1891:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1896:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 54:
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
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1896:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4429); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1901:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1901:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1902:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1902:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1903:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall4453); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1917:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1917:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1918:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1918:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1919:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall4490); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1932:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==41) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1932:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4519); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1936:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1937:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1937:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1938:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4540);
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1954:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==16) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1954:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4553); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1958:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1959:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1959:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1960:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4574);
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

            	            otherlv_14=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4588); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1980:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1981:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1981:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1982:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4613);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1995:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1995:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1995:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1995:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2002:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2003:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4647); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2033:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2034:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4732);
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
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2051:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2052:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2052:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2053:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4760);
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

            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2069:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==16) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2069:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4773); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2073:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2074:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2074:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2075:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4794);
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

            	            otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4811); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2095:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2095:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2100:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2101:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4844);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2125:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2126:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2127:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4884);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4894); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2134:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2137:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2138:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2138:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt37=1;
                }
                break;
            case 17:
                {
                alt37=2;
                }
                break;
            case 59:
                {
                alt37=3;
                }
                break;
            case RULE_ID:
            case 41:
            case 67:
                {
                alt37=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 21:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt37=5;
                }
                break;
            case 57:
                {
                alt37=6;
                }
                break;
            case 62:
                {
                alt37=7;
                }
                break;
            case 63:
                {
                alt37=8;
                }
                break;
            case 64:
                {
                alt37=9;
                }
                break;
            case 74:
                {
                alt37=10;
                }
                break;
            case 75:
                {
                alt37=11;
                }
                break;
            case 76:
                {
                alt37=12;
                }
                break;
            case 27:
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2139:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4941);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2149:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4968);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2159:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4995);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2169:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5022);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2179:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5049);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2189:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5076);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2199:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5103);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2209:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5130);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2219:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5157);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2229:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5184);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2239:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5211);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2249:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5238);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2259:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5265);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2275:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2276:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2277:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5300);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5310); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2284:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2287:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2288:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2288:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt38=1;
                }
                break;
            case 70:
            case 71:
                {
                alt38=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt38=3;
                }
                break;
            case 72:
                {
                alt38=4;
                }
                break;
            case RULE_STRING:
                {
                alt38=5;
                }
                break;
            case 73:
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2289:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5357);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2299:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5384);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2309:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5411);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2319:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5438);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2329:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5465);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2339:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5492);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2355:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2356:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2357:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5527);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5537); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2364:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2367:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2368:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2368:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2368:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2368:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2369:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleXClosure5583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2393:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2393:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2393:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==27||LA40_0==79) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2393:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2393:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2394:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2394:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2395:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5654);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2411:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==16) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2411:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXClosure5667); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2415:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2416:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2416:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2417:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5688);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2433:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2434:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2434:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2435:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,55,FOLLOW_55_in_ruleXClosure5710); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2448:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2449:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2449:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2450:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5747);
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

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleXClosure5759); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2478:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2479:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2480:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5795);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5805); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2487:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2490:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2491:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2491:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2491:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2491:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2492:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2497:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_DECIMAL)||LA43_0==17||LA43_0==21||LA43_0==27||LA43_0==41||(LA43_0>=44 && LA43_0<=45)||LA43_0==50||LA43_0==57||LA43_0==59||(LA43_0>=62 && LA43_0<=67)||(LA43_0>=69 && LA43_0<=76)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2497:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2497:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2498:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2498:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2499:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5861);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2515:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==56) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2515:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleXExpressionInClosure5874); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2527:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2528:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2529:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5914);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5924); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2536:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2539:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2540:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2540:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2540:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2540:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2540:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2556:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2556:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2556:7: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2562:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==27||LA45_0==79) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2562:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2562:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2563:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2563:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2564:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6032);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2580:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==16) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2580:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXShortClosure6045); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2584:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2585:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2585:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2586:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6066);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2602:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2603:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2603:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2604:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,55,FOLLOW_55_in_ruleXShortClosure6088); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2617:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2618:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2618:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2619:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6124);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2643:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2644:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2645:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6160);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6170); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2652:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2655:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2656:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2656:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2656:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXParenthesizedExpression6207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6229);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXParenthesizedExpression6240); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2681:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2682:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2683:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6276);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6286); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2690:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2693:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2694:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2694:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2694:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2694:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2695:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXIfExpression6332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXIfExpression6344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2708:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2709:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2709:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2710:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6365);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXIfExpression6377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2730:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2731:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2731:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2732:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6398);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred18_InternalServices()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleXIfExpression6419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2753:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2754:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2754:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2755:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6441);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2779:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2780:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2781:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6479);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6489); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2788:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2791:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2792:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2792:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2792:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2792:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2793:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==17||LA48_0==21||LA48_0==41||(LA48_0>=44 && LA48_0<=45)||LA48_0==50||LA48_0==57||LA48_0==59||(LA48_0>=62 && LA48_0<=64)||LA48_0==67||(LA48_0>=69 && LA48_0<=76)) ) {
                alt48=1;
            }
            else if ( (LA48_0==27) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==21||(LA48_3>=27 && LA48_3<=28)||(LA48_3>=31 && LA48_3<=49)||(LA48_3>=51 && LA48_3<=54)||LA48_3==68) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==29) && (synpred20_InternalServices())) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_STRING && LA48_2<=RULE_DECIMAL)||LA48_2==17||LA48_2==21||LA48_2==27||LA48_2==41||(LA48_2>=44 && LA48_2<=45)||LA48_2==50||LA48_2==57||LA48_2==59||(LA48_2>=62 && LA48_2<=64)||LA48_2==67||(LA48_2>=69 && LA48_2<=76)) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==29) && (synpred19_InternalServices())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2807:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2807:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2807:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2808:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2808:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2809:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6578);
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

                            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXSwitchExpression6590); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2829:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2830:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2830:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2831:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6614);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2854:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2854:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleXSwitchExpression6658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2858:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2859:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2859:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2860:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6679);
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

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleXSwitchExpression6691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2880:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2881:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2881:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2882:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6714);
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

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleXSwitchExpression6726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2906:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==27||LA49_0==29||LA49_0==61||LA49_0==79) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2907:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2907:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2908:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6761);
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
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2924:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==60) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2924:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression6775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleXSwitchExpression6787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2932:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2933:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2933:1: (lv_default_14_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2934:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6808);
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

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression6822); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2962:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2963:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2964:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6858);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6868); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2971:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2974:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2975:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2975:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2975:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2975:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==27||LA51_0==79) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2976:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2976:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2977:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6914);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2993:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==61) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2993:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXCasePart6928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2997:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2998:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2998:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2999:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6949);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXCasePart6963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3019:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3020:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3020:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3021:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6984);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3045:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3046:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3047:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7020);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7030); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3054:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3057:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3058:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3058:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3058:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3058:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3059:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXForLoopExpression7076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXForLoopExpression7088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3072:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3073:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3073:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3074:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7109);
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleXForLoopExpression7121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3094:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3095:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3095:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3096:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7142);
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

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXForLoopExpression7154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3116:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3117:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3117:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3118:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7175);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3142:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3143:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3144:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7211);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7221); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3151:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3154:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3155:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3155:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3155:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3155:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3156:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXWhileExpression7267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXWhileExpression7279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3169:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3170:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3170:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3171:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7300);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXWhileExpression7312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3191:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3192:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3192:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3193:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7333);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3217:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3218:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3219:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7369);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7379); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3226:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3229:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3230:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3230:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3230:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3230:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3231:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression7425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3240:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3241:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3241:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3242:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7446);
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

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXDoWhileExpression7470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3266:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3267:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3267:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3268:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7491);
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

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXDoWhileExpression7503); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3296:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3297:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3298:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7539);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7549); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3305:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3308:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3309:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3309:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3309:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3309:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3310:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3319:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_DECIMAL)||LA54_0==17||LA54_0==21||LA54_0==27||LA54_0==41||(LA54_0>=44 && LA54_0<=45)||LA54_0==50||LA54_0==57||LA54_0==59||(LA54_0>=62 && LA54_0<=67)||(LA54_0>=69 && LA54_0<=76)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3319:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3319:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3320:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3320:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3321:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7617);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3337:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==56) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3337:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression7630); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXBlockExpression7646); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3353:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3354:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3355:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7682);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7692); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3362:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3365:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3366:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3366:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=65 && LA55_0<=66)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_DECIMAL)||LA55_0==17||LA55_0==21||LA55_0==27||LA55_0==41||(LA55_0>=44 && LA55_0<=45)||LA55_0==50||LA55_0==57||LA55_0==59||(LA55_0>=62 && LA55_0<=64)||LA55_0==67||(LA55_0>=69 && LA55_0<=76)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3367:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7739);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3377:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7766);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3393:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3394:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3395:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7801);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7811); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3402:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3405:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3406:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3406:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3406:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3406:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3407:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3412:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==65) ) {
                alt56=1;
            }
            else if ( (LA56_0==66) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3412:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3412:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3413:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3413:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3414:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration7864); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3428:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration7895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred21_InternalServices()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==27) && (synpred21_InternalServices())) {
                alt57=1;
            }
            else if ( (LA57_0==79) && (synpred21_InternalServices())) {
                alt57=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3440:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3440:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3440:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3441:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3441:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3442:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7943);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3458:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3459:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3459:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3460:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7964);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3477:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3477:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3478:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3478:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3479:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7993);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3495:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==31) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3495:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXVariableDeclaration8007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3499:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3500:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3500:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3501:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8028);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3525:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3526:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3527:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8066);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8076); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3534:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3537:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3538:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3538:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3538:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3538:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==21||LA59_1==41||LA59_1==52) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==27||LA59_0==79) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3539:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3539:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3540:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8122);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3556:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3557:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3557:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3558:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8144);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3582:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3583:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3584:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8180);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8190); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3591:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3594:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3595:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3595:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3595:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3595:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3596:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3596:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3597:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8236);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3613:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3614:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3614:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3615:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8257);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3639:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3640:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3641:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8293);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8303); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3648:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3651:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3652:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3652:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3652:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3652:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3653:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3658:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==68) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3659:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3659:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3660:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8360);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3673:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==41) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3673:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall8374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3677:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3678:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3678:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3679:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8395);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3695:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==16) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3695:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall8408); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3699:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3700:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3700:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3701:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8429);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall8443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3721:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3722:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3722:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3723:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8468);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3736:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3736:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3736:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3736:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3743:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3744:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8502); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3774:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3775:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8587);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3793:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3793:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3794:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8615);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3810:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==16) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3810:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall8628); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3814:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3815:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3815:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3816:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8649);
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
                            	    break loop63;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3842:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8699);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3866:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3867:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3868:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8737);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8748); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3875:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3878:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3879:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3879:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==67) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3880:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8795);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3892:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper8819); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3905:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3906:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3907:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8860);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8871); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3914:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3917:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3918:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3918:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==68) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3919:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8918);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier8936); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3943:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3944:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3945:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8977);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8987); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3952:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3955:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3956:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3956:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3956:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3956:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3957:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall9033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3966:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3967:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3967:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3968:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9056);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3981:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3981:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3981:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3981:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall9077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3986:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3987:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3987:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3988:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9099);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4004:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==16) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4004:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall9112); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4008:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4009:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4009:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4010:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9133);
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall9147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4030:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4030:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4030:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4030:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall9170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4052:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4053:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9243);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4070:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4070:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4070:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4070:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4071:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4071:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4072:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9271);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4088:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==16) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4088:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall9284); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4092:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4093:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4093:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4094:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9305);
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
                            	    break loop71;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall9322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4114:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4114:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4119:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4120:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9355);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4144:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4145:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4146:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9392);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9402); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4153:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4156:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4157:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4157:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4157:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4157:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4158:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4163:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==70) ) {
                alt75=1;
            }
            else if ( (LA75_0==71) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4163:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4168:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4168:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4169:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4169:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4170:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9473); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4191:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4192:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4193:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9523);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9533); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4200:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4203:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4204:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4204:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4204:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4204:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4205:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral9579); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4222:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4223:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4224:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9615);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9625); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4231:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4234:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4235:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4235:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4235:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4235:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4236:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4241:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4242:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4242:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4243:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9680);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4267:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4268:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4269:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9716);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9726); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4276:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4279:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4280:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4280:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4280:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4280:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4281:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4286:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4287:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4287:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4288:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9777); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4312:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4313:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4314:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9818);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9828); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4321:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4324:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4325:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4325:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4325:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4325:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4326:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral9874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXTypeLiteral9886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4339:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4340:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4340:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4341:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9909);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXTypeLiteral9921); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4366:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4367:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4368:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9957);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9967); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4375:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4378:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4379:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4379:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4379:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4379:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4380:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression10013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4389:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4390:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4390:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4391:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10034);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4415:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4416:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4417:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10070);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10080); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4424:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4427:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4428:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4428:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4428:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4428:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4429:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression10126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4438:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4438:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4443:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4444:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10157);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4468:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4469:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4470:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10194);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10204); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4477:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4480:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4481:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4481:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4481:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4481:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4482:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4491:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4492:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4492:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4493:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10271);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==78) ) {
                alt79=1;
            }
            else if ( (LA79_0==77) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==78) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred30_InternalServices()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4511:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4512:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10301);
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
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4528:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==77) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred31_InternalServices()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4528:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4528:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4528:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10323); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4533:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4534:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4534:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4535:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10345);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4552:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4552:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4552:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4556:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4557:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4557:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4558:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10388);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4582:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4583:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4584:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10426);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10436); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4591:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4594:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4595:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4595:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4595:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4595:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4595:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause10481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleXCatchClause10494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4604:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4605:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4605:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10515);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXCatchClause10527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4626:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4627:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4627:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4628:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10548);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4652:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4653:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4654:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10585);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10596); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4661:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4664:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4665:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4665:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4666:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10643);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4676:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==52) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred33_InternalServices()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4676:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4676:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4676:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleQualifiedName10671); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10694);
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
            	    break loop80;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4703:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4707:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4708:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10748);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10759); if (state.failed) return current;

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4718:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4722:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4723:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4723:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_HEX) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=RULE_INT && LA84_0<=RULE_DECIMAL)) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4723:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4731:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4731:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4731:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4731:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4731:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10831); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4739:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10857); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4746:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==52) ) {
                        int LA83_1 = input.LA(2);

                        if ( ((LA83_1>=RULE_INT && LA83_1<=RULE_DECIMAL)) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4747:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,52,FOLLOW_52_in_ruleNumber10877); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4752:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==RULE_INT) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==RULE_DECIMAL) ) {
                                alt82=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 0, input);

                                throw nvae;
                            }
                            switch (alt82) {
                                case 1 :
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4752:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10893); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10919); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4778:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4779:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4780:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10972);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10982); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4787:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4790:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4791:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4791:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==27||LA86_0==79) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4791:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4791:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4792:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11030);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==21) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==26) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred34_InternalServices()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4803:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4803:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4803:6: ()
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4804:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleJvmTypeReference11068); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleJvmTypeReference11080); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4819:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11112);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4835:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4836:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4837:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11147);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11157); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4844:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4847:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4848:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4848:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4848:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4848:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==27) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4848:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXFunctionTypeRef11195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4852:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==27||LA88_0==79) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4852:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4852:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4853:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4853:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4854:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11217);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4870:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==16) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4870:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXFunctionTypeRef11230); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4874:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4875:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4875:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4876:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11251);
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
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXFunctionTypeRef11267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleXFunctionTypeRef11281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4900:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4901:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4901:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4902:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11302);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4926:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4927:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4928:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11338);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11348); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4935:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4938:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4939:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4939:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4939:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4939:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4940:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4940:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4941:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11396);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4954:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4954:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4954:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4954:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference11417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4959:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4960:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4960:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4961:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11439);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==16) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJvmParameterizedTypeReference11452); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4981:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4982:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4982:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4983:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11473);
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleJvmParameterizedTypeReference11487); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5011:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5012:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5013:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11525);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11535); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5020:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5023:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5024:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5024:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==27||LA92_0==79) ) {
                alt92=1;
            }
            else if ( (LA92_0==80) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5025:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11582);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5035:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11609);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5051:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5052:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5053:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11644);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11654); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5060:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5063:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5064:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5064:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5064:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5064:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5065:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleJvmWildcardTypeReference11700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5074:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==81) ) {
                alt93=1;
            }
            else if ( (LA93_0==67) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5074:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5074:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5075:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5075:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5076:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11722);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5093:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5093:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5094:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5094:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5095:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11749);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5119:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5120:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5121:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11787);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11797); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5128:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5131:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5132:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5132:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5132:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBound11834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5136:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5137:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5137:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5138:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11855);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5162:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5163:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5164:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11891);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11901); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5171:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5174:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5175:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5175:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5175:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleJvmUpperBoundAnded11938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5179:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5180:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5180:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5181:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11959);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5205:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5206:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5207:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11995);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12005); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5214:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5217:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5218:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5218:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5218:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound12042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5222:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5223:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5223:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5224:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12063);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5250:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5251:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5252:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12102);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12113); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5259:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5262:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5263:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12152); if (state.failed) return current;
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:717:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:717:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:718:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:718:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:719:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1410);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:845:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:845:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:846:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:846:1: ( ruleOpOr )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:847:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalServices1758);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:945:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:946:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:946:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:947:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:947:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:948:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalServices2017);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1046:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1047:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1047:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1048:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1048:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1049:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalServices2276);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1154:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1155:1: 
        {
        }

        match(input,37,FOLLOW_37_in_synpred5_InternalServices2552); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalServices

    // $ANTLR start synpred6_InternalServices
    public final void synpred6_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1185:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1186:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1186:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1187:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1187:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1188:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalServices2623);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1308:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1308:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1309:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1309:1: ( ruleOpOther )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1310:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalServices2942);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1415:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1416:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1416:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1417:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1417:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1418:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalServices3222);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1523:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1524:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1524:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1525:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1525:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1526:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalServices3502);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:4: ( () 'as' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:5: () 'as'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1756:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1757:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred10_InternalServices4096); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalServices

    // $ANTLR start synpred11_InternalServices
    public final void synpred11_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1816:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1817:1: 
        {
        }

        match(input,52,FOLLOW_52_in_synpred11_InternalServices4250); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1818:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1819:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1819:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1820:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalServices4259);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices4265);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalServices

    // $ANTLR start synpred12_InternalServices
    public final void synpred12_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1874:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1875:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1875:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 52:
            {
            alt94=1;
            }
            break;
        case 53:
            {
            alt94=2;
            }
            break;
        case 54:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1875:4: '.'
                {
                match(input,52,FOLLOW_52_in_synpred12_InternalServices4368); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1877:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1877:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1878:1: ( '?.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1878:1: ( '?.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1879:2: '?.'
                {
                match(input,53,FOLLOW_53_in_synpred12_InternalServices4382); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1884:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1884:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1885:1: ( '*.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1885:1: ( '*.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1886:2: '*.'
                {
                match(input,54,FOLLOW_54_in_synpred12_InternalServices4402); if (state.failed) return ;

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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1995:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1996:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1996:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1997:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred13_InternalServices4629); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalServices

    // $ANTLR start synpred14_InternalServices
    public final void synpred14_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2016:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2017:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2017:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==27||LA96_0==79) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2017:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2017:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2018:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2018:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2019:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4681);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2021:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==16) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2021:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred14_InternalServices4688); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2022:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2023:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2023:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2024:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4695);
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

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2026:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2027:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2027:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2028:2: '|'
        {
        match(input,55,FOLLOW_55_in_synpred14_InternalServices4709); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalServices

    // $ANTLR start synpred15_InternalServices
    public final void synpred15_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2095:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2096:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2096:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2097:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalServices4827);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalServices

    // $ANTLR start synpred16_InternalServices
    public final void synpred16_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==27||LA98_0==79) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2378:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2379:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2379:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2380:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5600);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2382:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==16) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2382:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred16_InternalServices5607); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2383:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2384:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2384:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2385:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5614);
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

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2387:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2388:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2388:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2389:2: '|'
        {
        match(input,55,FOLLOW_55_in_synpred16_InternalServices5628); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalServices

    // $ANTLR start synpred18_InternalServices
    public final void synpred18_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:4: ( 'else' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2748:6: 'else'
        {
        match(input,58,FOLLOW_58_in_synpred18_InternalServices6411); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalServices

    // $ANTLR start synpred19_InternalServices
    public final void synpred19_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2802:6: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2803:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2803:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalServices6553);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,29,FOLLOW_29_in_synpred19_InternalServices6559); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalServices

    // $ANTLR start synpred20_InternalServices
    public final void synpred20_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2848:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,27,FOLLOW_27_in_synpred20_InternalServices6635); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2849:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2850:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2850:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2851:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalServices6642);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,29,FOLLOW_29_in_synpred20_InternalServices6648); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalServices

    // $ANTLR start synpred21_InternalServices
    public final void synpred21_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3432:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3433:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3433:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3434:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices7913);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3436:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3437:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3437:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3438:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalServices7922);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3736:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3737:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3737:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3738:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred22_InternalServices8484); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalServices

    // $ANTLR start synpred23_InternalServices
    public final void synpred23_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3757:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3758:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3758:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==27||LA102_0==79) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3758:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3758:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3759:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3759:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3760:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8536);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3762:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==16) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3762:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred23_InternalServices8543); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3763:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3764:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3764:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3765:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8550);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3767:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3768:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3768:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3769:2: '|'
        {
        match(input,55,FOLLOW_55_in_synpred23_InternalServices8564); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalServices

    // $ANTLR start synpred24_InternalServices
    public final void synpred24_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3837:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3837:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3838:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalServices8682);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalServices

    // $ANTLR start synpred25_InternalServices
    public final void synpred25_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3981:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3981:6: '<'
        {
        match(input,41,FOLLOW_41_in_synpred25_InternalServices9069); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalServices

    // $ANTLR start synpred26_InternalServices
    public final void synpred26_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4030:5: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4030:7: '('
        {
        match(input,27,FOLLOW_27_in_synpred26_InternalServices9162); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalServices

    // $ANTLR start synpred27_InternalServices
    public final void synpred27_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4035:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4036:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4036:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==27||LA104_0==79) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4036:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4036:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4037:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4037:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4038:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9192);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4040:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==16) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4040:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred27_InternalServices9199); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4041:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4042:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4042:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4043:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9206);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4045:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4046:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4046:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4047:2: '|'
        {
        match(input,55,FOLLOW_55_in_synpred27_InternalServices9220); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalServices

    // $ANTLR start synpred28_InternalServices
    public final void synpred28_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4114:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4115:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4115:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4116:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred28_InternalServices9338);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalServices

    // $ANTLR start synpred29_InternalServices
    public final void synpred29_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4438:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4439:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4439:1: ( ruleXExpression )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4440:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred29_InternalServices10140);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalServices

    // $ANTLR start synpred30_InternalServices
    public final void synpred30_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:5: ( 'catch' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred30_InternalServices10285); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalServices

    // $ANTLR start synpred31_InternalServices
    public final void synpred31_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4528:5: ( 'finally' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4528:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred31_InternalServices10315); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalServices

    // $ANTLR start synpred33_InternalServices
    public final void synpred33_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4676:3: ( '.' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4677:2: '.'
        {
        match(input,52,FOLLOW_52_in_synpred33_InternalServices10662); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalServices

    // $ANTLR start synpred34_InternalServices
    public final void synpred34_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:3: ( () '[' ']' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:4: () '[' ']'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4800:4: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4801:1: 
        {
        }

        match(input,21,FOLLOW_21_in_synpred34_InternalServices11045); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred34_InternalServices11049); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalServices

    // $ANTLR start synpred35_InternalServices
    public final void synpred35_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4954:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4954:6: '<'
        {
        match(input,41,FOLLOW_41_in_synpred35_InternalServices11409); if (state.failed) return ;

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


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA34_eotS =
        "\76\uffff";
    static final String DFA34_eofS =
        "\1\2\75\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA34_maxS =
        "\1\117\1\0\74\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\1\uffff\1\2\4\uffff\1\2\1\1\2\2"+
            "\2\uffff\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "1995:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalServices()) ) {s = 61;}

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
        "\36\uffff";
    static final String DFA33_eofS =
        "\36\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA33_maxS =
        "\1\117\2\0\33\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\4\5\10\uffff\1\5\3\uffff\1\5\5\uffff\1\2\1\35\14\uffff"+
            "\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\4\1\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "2016:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA33_0==27) ) {s = 2;}

                        else if ( (LA33_0==79) && (synpred14_InternalServices())) {s = 3;}

                        else if ( (LA33_0==55) && (synpred14_InternalServices())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||LA33_0==17||LA33_0==21||LA33_0==41||(LA33_0>=44 && LA33_0<=45)||LA33_0==50||LA33_0==57||LA33_0==59||(LA33_0>=62 && LA33_0<=64)||LA33_0==67||(LA33_0>=69 && LA33_0<=76)) ) {s = 5;}

                        else if ( (LA33_0==28) ) {s = 29;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA35_eofS =
        "\1\2\75\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA35_maxS =
        "\1\117\1\0\74\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\1\uffff\1\1\4\uffff\4\2\2\uffff"+
            "\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "2095:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalServices()) ) {s = 61;}

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
        "\40\uffff";
    static final String DFA41_eofS =
        "\40\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA41_maxS =
        "\1\117\2\0\35\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\4\5\10\uffff\1\5\3\uffff\1\5\4\uffff\1\5\1\2\15\uffff\1"+
            "\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\4\1\uffff\1\5\1\uffff\1"+
            "\5\2\uffff\6\5\1\uffff\10\5\2\uffff\1\3",
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
            return "2378:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA41_0==27) ) {s = 2;}

                        else if ( (LA41_0==79) && (synpred16_InternalServices())) {s = 3;}

                        else if ( (LA41_0==55) && (synpred16_InternalServices())) {s = 4;}

                        else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_DECIMAL)||LA41_0==17||LA41_0==21||LA41_0==26||LA41_0==41||(LA41_0>=44 && LA41_0<=45)||LA41_0==50||LA41_0==57||LA41_0==59||(LA41_0>=62 && LA41_0<=67)||(LA41_0>=69 && LA41_0<=76)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

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
    static final String DFA65_eotS =
        "\76\uffff";
    static final String DFA65_eofS =
        "\1\2\75\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA65_maxS =
        "\1\117\1\0\74\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\1\uffff\1\2\4\uffff\1\2\1\1\2\2"+
            "\2\uffff\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "3736:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred22_InternalServices()) ) {s = 61;}

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
    static final String DFA64_eotS =
        "\36\uffff";
    static final String DFA64_eofS =
        "\36\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA64_maxS =
        "\1\117\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\4\5\10\uffff\1\5\3\uffff\1\5\5\uffff\1\2\1\35\14\uffff"+
            "\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\4\1\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3757:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==27) ) {s = 2;}

                        else if ( (LA64_0==79) && (synpred23_InternalServices())) {s = 3;}

                        else if ( (LA64_0==55) && (synpred23_InternalServices())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==17||LA64_0==21||LA64_0==41||(LA64_0>=44 && LA64_0<=45)||LA64_0==50||LA64_0==57||LA64_0==59||(LA64_0>=62 && LA64_0<=64)||LA64_0==67||(LA64_0>=69 && LA64_0<=76)) ) {s = 5;}

                        else if ( (LA64_0==28) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
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
    static final String DFA66_eotS =
        "\76\uffff";
    static final String DFA66_eofS =
        "\1\2\75\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA66_maxS =
        "\1\117\1\0\74\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\1\uffff\1\1\4\uffff\4\2\2\uffff"+
            "\27\2\1\uffff\14\2\1\uffff\13\2",
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

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3836:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\76\uffff";
    static final String DFA70_eofS =
        "\1\2\75\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA70_maxS =
        "\1\117\1\0\74\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\1\uffff\1\2\4\uffff\4\2\2\uffff"+
            "\11\2\1\1\15\2\1\uffff\14\2\1\uffff\13\2",
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
            return "3981:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
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
        "\1\117\1\0\74\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\1\uffff\1\2\4\uffff\1\2\1\1\2\2"+
            "\2\uffff\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "4030:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalServices()) ) {s = 61;}

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
    static final String DFA72_eotS =
        "\36\uffff";
    static final String DFA72_eofS =
        "\36\uffff";
    static final String DFA72_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA72_maxS =
        "\1\117\2\0\33\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\4\5\10\uffff\1\5\3\uffff\1\5\5\uffff\1\2\1\35\14\uffff"+
            "\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\4\1\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "4035:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_ID) ) {s = 1;}

                        else if ( (LA72_0==27) ) {s = 2;}

                        else if ( (LA72_0==79) && (synpred27_InternalServices())) {s = 3;}

                        else if ( (LA72_0==55) && (synpred27_InternalServices())) {s = 4;}

                        else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_DECIMAL)||LA72_0==17||LA72_0==21||LA72_0==41||(LA72_0>=44 && LA72_0<=45)||LA72_0==50||LA72_0==57||LA72_0==59||(LA72_0>=62 && LA72_0<=64)||LA72_0==67||(LA72_0>=69 && LA72_0<=76)) ) {s = 5;}

                        else if ( (LA72_0==28) ) {s = 29;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
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
        "\76\uffff";
    static final String DFA74_eofS =
        "\1\2\75\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA74_maxS =
        "\1\117\1\0\74\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\2\1\uffff\1\1\4\uffff\4\2\2\uffff"+
            "\27\2\1\uffff\14\2\1\uffff\13\2",
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
            return "4114:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
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
    static final String DFA76_eotS =
        "\76\uffff";
    static final String DFA76_eofS =
        "\1\33\75\uffff";
    static final String DFA76_minS =
        "\1\4\32\0\43\uffff";
    static final String DFA76_maxS =
        "\1\117\32\0\43\uffff";
    static final String DFA76_acceptS =
        "\33\uffff\1\2\41\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\43\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\7\uffff\1\33\1\6\1\uffff\1\33\1\uffff"+
            "\1\12\4\uffff\1\33\1\32\2\33\2\uffff\11\33\1\10\2\33\1\4\1\3"+
            "\4\33\1\2\4\33\1\uffff\1\33\1\23\1\33\1\7\2\33\1\24\1\25\1\26"+
            "\2\33\1\11\1\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\3"+
            "\33",
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
            return "4438:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_26 = input.LA(1);

                         
                        int index76_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\77\uffff";
    static final String DFA91_eofS =
        "\1\2\76\uffff";
    static final String DFA91_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA91_maxS =
        "\1\117\1\0\75\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA91_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\4\uffff\4\2\2\uffff\11\2\1\1\15"+
            "\2\1\uffff\14\2\1\uffff\13\2",
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
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "4954:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalServices()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
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
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponent233 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleComponent254 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleComponent267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleComponent288 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleComponent301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleComponent322 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleComponent335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleComponent356 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleComponent372 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_18_in_ruleComponent385 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_ruleComponent406 = new BitSet(new long[]{0x0000000000190010L});
    public static final BitSet FOLLOW_16_in_ruleComponent419 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_ruleComponent440 = new BitSet(new long[]{0x0000000000190010L});
    public static final BitSet FOLLOW_ruleService_in_ruleComponent465 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_19_in_ruleComponent478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleService568 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleService593 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_22_in_ruleService612 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23_in_ruleService649 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24_in_ruleService686 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25_in_ruleService723 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleService772 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleService784 = new BitSet(new long[]{0x0000000018000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleService806 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleService819 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleService840 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleService856 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleService868 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleService889 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleService910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequireDeclaration_in_entryRuleRequireDeclaration946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequireDeclaration956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleRequireDeclaration1002 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequireDeclaration1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleImport1108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1323 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1339 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1389 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1442 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpSingleAssign1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMultiAssign1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1737 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1790 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1813 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOr1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1996 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2049 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2072 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAnd2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2255 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2308 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2331 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpEquality2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpEquality2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2535 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_37_in_ruleXRelationalExpression2571 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2594 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2655 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2678 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpCompare2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2921 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2974 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2997 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpOther3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3201 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3254 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3277 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpAdd3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3481 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3534 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3557 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpMulti3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3810 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpUnary3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4080 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXCastedExpression4115 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4138 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4233 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4305 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4321 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4343 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4429 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall4453 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall4490 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4519 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4540 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4553 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4574 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4613 = new BitSet(new long[]{0x0070000008200002L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4647 = new BitSet(new long[]{0xCA843200182201F0L,0x0000000000009FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4732 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4760 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4773 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4794 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4811 = new BitSet(new long[]{0x0070000000200002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4844 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleXClosure5583 = new BitSet(new long[]{0xCA8432000C2201F0L,0x0000000000009FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5654 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXClosure5667 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5688 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_55_in_ruleXClosure5710 = new BitSet(new long[]{0xCA0432000C2201F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5747 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXClosure5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5861 = new BitSet(new long[]{0xCB043200082201F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_56_in_ruleXExpressionInClosure5874 = new BitSet(new long[]{0xCA043200082201F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6032 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXShortClosure6045 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6066 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_55_in_ruleXShortClosure6088 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXParenthesizedExpression6207 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6229 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXParenthesizedExpression6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXIfExpression6332 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXIfExpression6344 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6365 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXIfExpression6377 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6398 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXIfExpression6419 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6535 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6578 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXSwitchExpression6590 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27_in_ruleXSwitchExpression6658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6679 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXSwitchExpression6691 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6714 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXSwitchExpression6726 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6740 = new BitSet(new long[]{0x2000000028000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6761 = new BitSet(new long[]{0x3000000028080010L,0x0000000000008000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression6775 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXSwitchExpression6787 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6808 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6914 = new BitSet(new long[]{0x2000000020000000L});
    public static final BitSet FOLLOW_61_in_ruleXCasePart6928 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6949 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXCasePart6963 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXForLoopExpression7076 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXForLoopExpression7088 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7109 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXForLoopExpression7121 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7142 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXForLoopExpression7154 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXWhileExpression7267 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXWhileExpression7279 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7300 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXWhileExpression7312 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression7425 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7446 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7458 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXDoWhileExpression7470 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7491 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXDoWhileExpression7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7595 = new BitSet(new long[]{0xCA043200082A01F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7617 = new BitSet(new long[]{0xCB043200082A01F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression7630 = new BitSet(new long[]{0xCA043200082A01F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_19_in_ruleXBlockExpression7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration7864 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration7895 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7964 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7993 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleXVariableDeclaration8007 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8360 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall8374 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8395 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall8408 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8429 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall8443 = new BitSet(new long[]{0x0000020000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8468 = new BitSet(new long[]{0x0000000008200002L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8502 = new BitSet(new long[]{0xCA843200182201F0L,0x0000000000009FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8587 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8615 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall8628 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8649 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8666 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper8819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier8936 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall9033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9056 = new BitSet(new long[]{0x0000020008200002L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall9077 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9099 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall9112 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9133 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall9147 = new BitSet(new long[]{0x0000000008200002L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall9170 = new BitSet(new long[]{0xCA843200182201F0L,0x0000000000009FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9243 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9271 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall9284 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9305 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall9322 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral9874 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXTypeLiteral9886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9909 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXTypeLiteral9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression10013 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression10126 = new BitSet(new long[]{0xCA043200082201F2L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10250 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10301 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10323 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10367 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause10481 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXCatchClause10494 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10515 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXCatchClause10527 = new BitSet(new long[]{0xCA043200082201F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10643 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleQualifiedName10671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10694 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10831 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10857 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumber10877 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11030 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleJvmTypeReference11068 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleJvmTypeReference11080 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXFunctionTypeRef11195 = new BitSet(new long[]{0x0000000018000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11217 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleXFunctionTypeRef11230 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11251 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleXFunctionTypeRef11267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleXFunctionTypeRef11281 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11396 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference11417 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11439 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleJvmParameterizedTypeReference11452 = new BitSet(new long[]{0x0000000008000010L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11473 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleJvmParameterizedTypeReference11487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmWildcardTypeReference11700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBound11834 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmUpperBoundAnded11938 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound12042 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalServices1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalServices2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalServices2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred5_InternalServices2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalServices2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalServices2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalServices3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalServices3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred10_InternalServices4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred11_InternalServices4250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalServices4259 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred12_InternalServices4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred12_InternalServices4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred12_InternalServices4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred13_InternalServices4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4681 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_16_in_synpred14_InternalServices4688 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4695 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_55_in_synpred14_InternalServices4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalServices4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5600 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_16_in_synpred16_InternalServices5607 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5614 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_55_in_synpred16_InternalServices5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred18_InternalServices6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalServices6553 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred19_InternalServices6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred20_InternalServices6635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalServices6642 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred20_InternalServices6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices7913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalServices7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred22_InternalServices8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8536 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_16_in_synpred23_InternalServices8543 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8550 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_55_in_synpred23_InternalServices8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalServices8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred25_InternalServices9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred26_InternalServices9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9192 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_16_in_synpred27_InternalServices9199 = new BitSet(new long[]{0x0000000008000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices9206 = new BitSet(new long[]{0x0080000000010000L});
    public static final BitSet FOLLOW_55_in_synpred27_InternalServices9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred28_InternalServices9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred29_InternalServices10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred30_InternalServices10285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred31_InternalServices10315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred33_InternalServices10662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred34_InternalServices11045 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred34_InternalServices11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred35_InternalServices11409 = new BitSet(new long[]{0x0000000000000002L});

}