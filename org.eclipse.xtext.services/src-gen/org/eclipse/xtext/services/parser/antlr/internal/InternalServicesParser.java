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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'component'", "'{'", "'}'", "'service'", "'['", "'GET'", "'POST'", "']'", "'('", "','", "')'", "':'", "'uses'", "'import'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'|'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
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
    public static final int RULE_HEX=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
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
        	return "Component";	
       	}
       	
       	@Override
       	protected ServicesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleComponent"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:67:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:68:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:69:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent75);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent85); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:76:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_services_6_0= ruleService ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_imports_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_services_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_services_6_0= ruleService ) )* otherlv_7= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_services_6_0= ruleService ) )* otherlv_7= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_services_6_0= ruleService ) )* otherlv_7= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'component' ( (lv_name_4_0= ruleValidID ) ) otherlv_5= '{' ( (lv_services_6_0= ruleService ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComponent122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getPackageKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:86:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleComponent143);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleComponent164);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleComponent177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getComponentKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:124:1: ( (lv_name_4_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:125:1: (lv_name_4_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:125:1: (lv_name_4_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:126:3: lv_name_4_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentAccess().getNameValidIDParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleComponent198);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleComponent210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:146:1: ( (lv_services_6_0= ruleService ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:147:1: (lv_services_6_0= ruleService )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:147:1: (lv_services_6_0= ruleService )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:148:3: lv_services_6_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleService_in_ruleComponent231);
            	    lv_services_6_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"services",
            	              		lv_services_6_0, 
            	              		"Service");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleComponent244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:176:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:177:2: (iv_ruleService= ruleService EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:178:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService280);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService290); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:185:1: ruleService returns [EObject current=null] : ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleValidID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleJvmTypeReference ) ) (otherlv_13= 'uses' ( (lv_uses_14_0= ruleJvmTypeReference ) )* )? ( (lv_body_15_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_service_0_0=null;
        Token otherlv_1=null;
        Token lv_get_2_0=null;
        Token lv_post_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_type_12_0 = null;

        EObject lv_uses_14_0 = null;

        EObject lv_body_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:188:28: ( ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleValidID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleJvmTypeReference ) ) (otherlv_13= 'uses' ( (lv_uses_14_0= ruleJvmTypeReference ) )* )? ( (lv_body_15_0= ruleXBlockExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:189:1: ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleValidID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleJvmTypeReference ) ) (otherlv_13= 'uses' ( (lv_uses_14_0= ruleJvmTypeReference ) )* )? ( (lv_body_15_0= ruleXBlockExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:189:1: ( ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleValidID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleJvmTypeReference ) ) (otherlv_13= 'uses' ( (lv_uses_14_0= ruleJvmTypeReference ) )* )? ( (lv_body_15_0= ruleXBlockExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:189:2: ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleValidID ) ) otherlv_6= '(' ( ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_type_12_0= ruleJvmTypeReference ) ) (otherlv_13= 'uses' ( (lv_uses_14_0= ruleJvmTypeReference ) )* )? ( (lv_body_15_0= ruleXBlockExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:189:2: ( ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) ) otherlv_4= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:189:3: ( (lv_service_0_0= 'service' ) ) otherlv_1= '[' ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) ) otherlv_4= ']'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:189:3: ( (lv_service_0_0= 'service' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:190:1: (lv_service_0_0= 'service' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:190:1: (lv_service_0_0= 'service' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:191:3: lv_service_0_0= 'service'
                    {
                    lv_service_0_0=(Token)match(input,17,FOLLOW_17_in_ruleService334); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleService359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_0_1());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:208:1: ( ( (lv_get_2_0= 'GET' ) ) | ( (lv_post_3_0= 'POST' ) ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==19) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==20) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:208:2: ( (lv_get_2_0= 'GET' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:208:2: ( (lv_get_2_0= 'GET' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:209:1: (lv_get_2_0= 'GET' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:209:1: (lv_get_2_0= 'GET' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:210:3: lv_get_2_0= 'GET'
                            {
                            lv_get_2_0=(Token)match(input,19,FOLLOW_19_in_ruleService378); if (state.failed) return current;
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:224:6: ( (lv_post_3_0= 'POST' ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:224:6: ( (lv_post_3_0= 'POST' ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:225:1: (lv_post_3_0= 'POST' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:225:1: (lv_post_3_0= 'POST' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:226:3: lv_post_3_0= 'POST'
                            {
                            lv_post_3_0=(Token)match(input,20,FOLLOW_20_in_ruleService415); if (state.failed) return current;
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

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleService441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:243:3: ( (lv_name_5_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:244:1: (lv_name_5_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:244:1: (lv_name_5_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:245:3: lv_name_5_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleService464);
            lv_name_5_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
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

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleService476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:265:1: ( ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==22||LA6_0==76) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:265:2: ( (lv_params_7_0= ruleFullJvmFormalParameter ) ) (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:265:2: ( (lv_params_7_0= ruleFullJvmFormalParameter ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:266:1: (lv_params_7_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:266:1: (lv_params_7_0= ruleFullJvmFormalParameter )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:267:3: lv_params_7_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getServiceAccess().getParamsFullJvmFormalParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleService498);
                    lv_params_7_0=ruleFullJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getServiceRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_7_0, 
                              		"FullJvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:283:2: (otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:283:4: otherlv_8= ',' ( (lv_params_9_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleService511); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:287:1: ( (lv_params_9_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:288:1: (lv_params_9_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:288:1: (lv_params_9_0= ruleFullJvmFormalParameter )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:289:3: lv_params_9_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getServiceAccess().getParamsFullJvmFormalParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleService532);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleService548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleService560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getColonKeyword_5());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:313:1: ( (lv_type_12_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:314:1: (lv_type_12_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:314:1: (lv_type_12_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:315:3: lv_type_12_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getTypeJvmTypeReferenceParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleService581);
            lv_type_12_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getServiceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_12_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:331:2: (otherlv_13= 'uses' ( (lv_uses_14_0= ruleJvmTypeReference ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:331:4: otherlv_13= 'uses' ( (lv_uses_14_0= ruleJvmTypeReference ) )*
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleService594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getUsesKeyword_7_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:335:1: ( (lv_uses_14_0= ruleJvmTypeReference ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID||LA7_0==22||LA7_0==76) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:336:1: (lv_uses_14_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:336:1: (lv_uses_14_0= ruleJvmTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:337:3: lv_uses_14_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getServiceAccess().getUsesJvmTypeReferenceParserRuleCall_7_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleService615);
                    	    lv_uses_14_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"uses",
                    	              		lv_uses_14_0, 
                    	              		"JvmTypeReference");
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:353:5: ( (lv_body_15_0= ruleXBlockExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:354:1: (lv_body_15_0= ruleXBlockExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:354:1: (lv_body_15_0= ruleXBlockExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:355:3: lv_body_15_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getServiceAccess().getBodyXBlockExpressionParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleService639);
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


    // $ANTLR start "entryRuleImport"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:379:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:380:2: (iv_ruleImport= ruleImport EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:381:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport675);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport685); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:388:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:391:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:392:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:392:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:392:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleImport722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:396:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:397:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:397:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:398:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport743);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:422:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:423:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:424:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression779);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression789); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:431:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:434:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:436:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression835);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:452:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:453:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:454:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment869);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment879); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:461:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:464:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:465:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:465:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==28) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||(LA10_1>=RULE_STRING && LA10_1<=RULE_ID)||(LA10_1>=15 && LA10_1<=16)||LA10_1==18||(LA10_1>=21 && LA10_1<=25)||(LA10_1>=29 && LA10_1<=51)||(LA10_1>=53 && LA10_1<=76)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_DECIMAL)||LA10_0==15||LA10_0==18||LA10_0==22||LA10_0==38||(LA10_0>=41 && LA10_0<=42)||LA10_0==47||LA10_0==54||LA10_0==56||(LA10_0>=59 && LA10_0<=61)||LA10_0==64||(LA10_0>=66 && LA10_0<=73)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:465:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:465:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:465:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:465:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:466:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:471:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:472:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:472:1: ( ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:473:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment937);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment953);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:494:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:495:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:495:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:496:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment973);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:513:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:513:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:514:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1003);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==29) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred1_InternalServices()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:527:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:527:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:527:7: ()
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:528:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:533:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:534:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:534:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:535:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1056);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:548:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:549:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:549:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:550:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1079);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:574:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:575:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:576:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1119);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1130); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:583:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:586:28: (kw= '=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:588:2: kw= '='
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpSingleAssign1167); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:601:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:602:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:603:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1207);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1218); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:610:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:613:28: (kw= '+=' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:615:2: kw= '+='
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpMultiAssign1255); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:628:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:629:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:630:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1294);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1304); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:637:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:640:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:641:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:641:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:642:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1351);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred2_InternalServices()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:655:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:655:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:655:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:656:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:661:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:662:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:662:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:663:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1404);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:676:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:677:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:677:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:678:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1427);
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
            	    break loop11;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:702:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:703:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:704:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1466);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1477); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:711:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:714:28: (kw= '||' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:716:2: kw= '||'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOr1514); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:729:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:730:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:731:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1553);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1563); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:738:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:741:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:742:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:742:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:743:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1610);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred3_InternalServices()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:756:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:756:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:756:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:757:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:762:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:763:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:763:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:764:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1663);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:777:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:778:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:778:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:779:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1686);
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
            	    break loop12;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:803:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:804:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:805:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1725);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1736); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:812:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:815:28: (kw= '&&' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:817:2: kw= '&&'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAnd1773); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:830:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:831:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:832:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1812);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1822); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:839:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:842:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:843:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:843:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:844:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1869);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==33) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred4_InternalServices()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:857:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:857:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:857:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:858:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:863:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:864:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:864:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:865:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1922);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:878:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:879:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:879:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:880:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1945);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:904:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:905:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:906:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1984);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1995); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:913:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:916:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:917:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:917:1: (kw= '==' | kw= '!=' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:918:2: kw= '=='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpEquality2033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:925:2: kw= '!='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpEquality2052); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:938:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:939:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:940:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2092);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2102); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:947:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:950:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:951:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:951:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:952:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2149);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop15:
            do {
                int alt15=3;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (synpred5_InternalServices()) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA15_5 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA15_6 = input.LA(2);

                    if ( (synpred6_InternalServices()) ) {
                        alt15=2;
                    }


                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:962:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:962:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:962:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:963:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleXRelationalExpression2185); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:972:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:973:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:973:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:974:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2208);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:996:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:996:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:996:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:997:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1002:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1003:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1003:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1004:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2269);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1017:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1018:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1018:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1019:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2292);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1043:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1044:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1045:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2332);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2343); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1052:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1055:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1056:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1056:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            case 38:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1057:2: kw= '>='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare2381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1064:2: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare2400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1071:2: kw= '>'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare2419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1078:2: kw= '<'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpCompare2438); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1091:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1092:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1093:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2478);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2488); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1100:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1103:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1104:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1104:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1105:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2535);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==40) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred7_InternalServices()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1118:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1118:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1118:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1119:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1124:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1125:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1125:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1126:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2588);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1139:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1140:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1140:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1141:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2611);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1165:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1166:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1167:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2650);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2661); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1174:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1177:28: ( (kw= '->' | kw= '..' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1178:1: (kw= '->' | kw= '..' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1178:1: (kw= '->' | kw= '..' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            else if ( (LA18_0==40) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1179:2: kw= '->'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther2699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1186:2: kw= '..'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther2718); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1199:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1200:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1201:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2758);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2768); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1208:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1211:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1212:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1212:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1213:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2815);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==42) ) {
                    int LA19_3 = input.LA(2);

                    if ( (synpred8_InternalServices()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1226:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1226:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1226:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1227:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1232:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1233:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1233:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1234:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2868);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1247:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1248:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1248:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1249:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2891);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1273:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1274:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1275:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2930);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2941); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1282:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1285:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1286:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1286:1: (kw= '+' | kw= '-' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            else if ( (LA20_0==42) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1287:2: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpAdd2979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1294:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpAdd2998); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1307:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1308:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1309:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3038);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3048); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1316:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1319:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1320:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1320:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1321:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3095);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA21_5 = input.LA(2);

                    if ( (synpred9_InternalServices()) ) {
                        alt21=1;
                    }


                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1334:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1334:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1334:7: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1335:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1340:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1341:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1341:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1342:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3148);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1355:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1356:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1356:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1357:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3171);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1381:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1382:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1383:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3210);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3221); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1390:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1393:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1394:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1394:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1395:2: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti3259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1402:2: kw= '**'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti3278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1409:2: kw= '/'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti3297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1416:2: kw= '%'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti3316); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1429:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1430:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1431:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3356);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3366); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1438:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1441:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=41 && LA23_0<=42)||LA23_0==47) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||LA23_0==15||LA23_0==18||LA23_0==22||LA23_0==38||LA23_0==54||LA23_0==56||(LA23_0>=59 && LA23_0<=61)||LA23_0==64||(LA23_0>=66 && LA23_0<=73)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1442:3: ()
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1443:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1448:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1449:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1449:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1450:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3424);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1463:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1464:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1464:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1465:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3445);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1483:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3474);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1499:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1500:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1501:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3510);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3521); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1508:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1511:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1512:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1512:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt24=1;
                }
                break;
            case 42:
                {
                alt24=2;
                }
                break;
            case 41:
                {
                alt24=3;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1513:2: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpUnary3559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1520:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary3578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1527:2: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary3597); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1540:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1541:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1542:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3637);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3647); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1549:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1552:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1553:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1553:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1554:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3694);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred10_InternalServices()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1564:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1564:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1564:6: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1565:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXCastedExpression3729); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1574:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1575:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1575:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1576:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3752);
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
            	    break loop25;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1600:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1601:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1602:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3790);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3800); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1609:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1612:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1613:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1613:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1614:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3847);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case 49:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred11_InternalServices()) ) {
                        alt33=1;
                    }
                    else if ( (synpred12_InternalServices()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred12_InternalServices()) ) {
                        alt33=2;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1628:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1628:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1628:26: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1629:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall3896); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1638:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1639:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1639:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1640:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3919);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3935);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1661:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1662:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1662:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1663:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3957);
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
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1696:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1696:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1696:8: ()
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1697:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1702:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 49:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 51:
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
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1702:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4043); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1707:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1707:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1708:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1708:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1709:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4067); if (state.failed) return current;
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
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1723:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1723:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1724:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1724:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1725:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall4104); if (state.failed) return current;
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1738:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==38) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1738:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4133); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1742:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1743:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1743:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1744:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4154);
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1760:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==23) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1760:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall4167); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1764:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1765:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1765:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1766:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4188);
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
            	            	    break loop27;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4202); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1786:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1787:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1787:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1788:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4227);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1801:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1801:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1801:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1801:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1808:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1809:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall4261); if (state.failed) return current;
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

            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt30=3;
            	            alt30 = dfa30.predict(input);
            	            switch (alt30) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1839:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1840:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4346);
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
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1857:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1857:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1857:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1857:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1858:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1858:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1859:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4374);
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

            	                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1875:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop29:
            	                    do {
            	                        int alt29=2;
            	                        int LA29_0 = input.LA(1);

            	                        if ( (LA29_0==23) ) {
            	                            alt29=1;
            	                        }


            	                        switch (alt29) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1875:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall4387); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1879:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1880:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1880:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1881:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4408);
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
            	                    	    break loop29;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall4425); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1901:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1901:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1906:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1907:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4458);
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
            	    break loop33;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1931:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1932:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1933:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4498);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4508); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1940:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1943:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1944:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1944:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt34=13;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt34=1;
                }
                break;
            case 15:
                {
                alt34=2;
                }
                break;
            case 56:
                {
                alt34=3;
                }
                break;
            case RULE_ID:
            case 38:
            case 64:
                {
                alt34=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 18:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt34=5;
                }
                break;
            case 54:
                {
                alt34=6;
                }
                break;
            case 59:
                {
                alt34=7;
                }
                break;
            case 60:
                {
                alt34=8;
                }
                break;
            case 61:
                {
                alt34=9;
                }
                break;
            case 71:
                {
                alt34=10;
                }
                break;
            case 72:
                {
                alt34=11;
                }
                break;
            case 73:
                {
                alt34=12;
                }
                break;
            case 22:
                {
                alt34=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1945:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4555);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1955:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4582);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1965:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4609);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1975:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4636);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1985:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4663);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1995:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4690);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2005:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4717);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2015:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4744);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2025:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4771);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2035:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4798);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2045:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4825);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2055:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4852);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2065:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4879);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2081:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2082:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2083:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4914);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4924); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2090:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2093:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2094:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2094:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt35=1;
                }
                break;
            case 67:
            case 68:
                {
                alt35=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt35=3;
                }
                break;
            case 69:
                {
                alt35=4;
                }
                break;
            case RULE_STRING:
                {
                alt35=5;
                }
                break;
            case 70:
                {
                alt35=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2095:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4971);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2105:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4998);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2115:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5025);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2125:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5052);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2135:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5079);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2145:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5106);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2161:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2162:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2163:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5141);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5151); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2170:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2173:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2174:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2174:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2174:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2174:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2175:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXClosure5197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2199:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2199:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2199:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==22||LA37_0==76) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2199:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2199:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2200:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2200:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2201:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5268);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2217:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==23) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2217:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXClosure5281); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2221:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2222:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2222:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2223:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5302);
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
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2239:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2240:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2240:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2241:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5324); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2254:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2255:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2255:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2256:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5361);
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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleXClosure5373); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2284:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2285:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2286:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5409);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5419); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2293:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2296:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2297:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2297:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2297:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2297:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2298:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2303:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||LA40_0==15||LA40_0==18||LA40_0==22||LA40_0==38||(LA40_0>=41 && LA40_0<=42)||LA40_0==47||LA40_0==54||LA40_0==56||(LA40_0>=59 && LA40_0<=64)||(LA40_0>=66 && LA40_0<=73)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2303:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2303:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2304:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2304:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2305:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5475);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2321:2: (otherlv_2= ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==53) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2321:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXExpressionInClosure5488); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2333:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2334:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2335:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5528);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5538); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2342:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2345:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2346:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2346:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2346:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2346:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2346:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2362:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2362:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2362:7: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2363:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2368:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==22||LA42_0==76) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2368:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2368:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2369:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2369:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2370:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5646);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2386:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==23) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2386:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXShortClosure5659); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2390:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2391:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2391:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2392:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5680);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2408:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2409:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2409:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2410:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,52,FOLLOW_52_in_ruleXShortClosure5702); if (state.failed) return current;
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2423:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2424:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2424:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2425:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5738);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2449:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2450:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2451:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5774);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5784); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2458:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2461:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2462:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2462:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2462:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleXParenthesizedExpression5821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5843);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXParenthesizedExpression5854); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2487:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2488:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2489:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5890);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5900); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2496:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2499:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2500:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2500:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2500:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2500:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2501:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression5946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXIfExpression5958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2514:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2515:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2515:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2516:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5979);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXIfExpression5991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2536:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2537:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2537:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2538:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6012);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2554:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred18_InternalServices()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2554:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2554:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2554:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2559:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2560:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2560:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2561:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6055);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2585:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2586:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2587:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6093);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6103); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2594:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2597:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2598:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2598:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2598:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2598:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2599:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||LA45_0==15||LA45_0==18||LA45_0==38||(LA45_0>=41 && LA45_0<=42)||LA45_0==47||LA45_0==54||LA45_0==56||(LA45_0>=59 && LA45_0<=61)||LA45_0==64||(LA45_0>=66 && LA45_0<=73)) ) {
                alt45=1;
            }
            else if ( (LA45_0==22) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==RULE_ID) ) {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==25) && (synpred20_InternalServices())) {
                        alt45=2;
                    }
                    else if ( (LA45_3==18||LA45_3==22||LA45_3==24||(LA45_3>=28 && LA45_3<=46)||(LA45_3>=48 && LA45_3<=51)||LA45_3==65) ) {
                        alt45=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA45_2>=RULE_STRING && LA45_2<=RULE_DECIMAL)||LA45_2==15||LA45_2==18||LA45_2==22||LA45_2==38||(LA45_2>=41 && LA45_2<=42)||LA45_2==47||LA45_2==54||LA45_2==56||(LA45_2>=59 && LA45_2<=61)||LA45_2==64||(LA45_2>=66 && LA45_2<=73)) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        int LA44_1 = input.LA(2);

                        if ( (LA44_1==25) && (synpred19_InternalServices())) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2613:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2613:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2613:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2614:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2614:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2615:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6192);
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

                            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXSwitchExpression6204); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2635:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2636:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2636:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2637:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6228);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2660:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2660:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleXSwitchExpression6272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2664:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2665:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2665:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2666:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6293);
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

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXSwitchExpression6305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2686:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2687:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2687:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2688:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6328);
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

                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleXSwitchExpression6340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression6354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2712:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==22||LA46_0==25||LA46_0==58||LA46_0==76) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2713:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2713:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2714:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6375);
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
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2730:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2730:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleXSwitchExpression6401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2738:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2739:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2739:1: (lv_default_14_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2740:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6422);
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

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6436); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2768:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2769:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2770:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6472);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6482); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2777:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2780:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2781:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2781:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2781:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2781:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==22||LA48_0==76) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2782:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2782:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2783:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6528);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2799:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2799:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2803:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2804:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2805:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6563);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXCasePart6577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2825:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2826:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2826:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2827:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6598);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2851:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2852:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2853:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6634);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6644); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2860:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2863:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2864:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2864:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2864:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2864:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2865:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression6690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXForLoopExpression6702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2878:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2879:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2879:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2880:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6723);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXForLoopExpression6735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2900:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2901:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2901:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2902:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6756);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXForLoopExpression6768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2922:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2923:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2923:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2924:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6789);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2948:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2949:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2950:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6825);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6835); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2957:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2960:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2961:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2961:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2961:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2961:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2962:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression6881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXWhileExpression6893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2975:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2976:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2976:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2977:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6914);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXWhileExpression6926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2997:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2998:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2998:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2999:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6947);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3023:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3024:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3025:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6983);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6993); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3032:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3035:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3036:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3036:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3036:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3036:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3037:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3046:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3047:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3047:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3048:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7060);
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

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXDoWhileExpression7084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3072:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3073:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3073:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3074:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7105);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXDoWhileExpression7117); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3102:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3103:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3104:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7153);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7163); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3111:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3114:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3115:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3115:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3115:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3115:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3116:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression7209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3125:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)||LA51_0==15||LA51_0==18||LA51_0==22||LA51_0==38||(LA51_0>=41 && LA51_0<=42)||LA51_0==47||LA51_0==54||LA51_0==56||(LA51_0>=59 && LA51_0<=64)||(LA51_0>=66 && LA51_0<=73)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3125:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3125:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3126:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3126:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3127:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7231);
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

            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3143:2: (otherlv_3= ';' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==53) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3143:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7244); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7260); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3159:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3160:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3161:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7296);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7306); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3168:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3171:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3172:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3172:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=62 && LA52_0<=63)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||LA52_0==15||LA52_0==18||LA52_0==22||LA52_0==38||(LA52_0>=41 && LA52_0<=42)||LA52_0==47||LA52_0==54||LA52_0==56||(LA52_0>=59 && LA52_0<=61)||LA52_0==64||(LA52_0>=66 && LA52_0<=73)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3173:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7353);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3183:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7380);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3199:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3200:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3201:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7415);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7425); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3208:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3211:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3212:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3212:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3212:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3212:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3213:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3218:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            else if ( (LA53_0==63) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3218:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3218:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3219:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3219:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3220:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7478); if (state.failed) return current;
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3234:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred21_InternalServices()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==22) && (synpred21_InternalServices())) {
                alt54=1;
            }
            else if ( (LA54_0==76) && (synpred21_InternalServices())) {
                alt54=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3246:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3246:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3246:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3247:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3247:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3248:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7557);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3264:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3265:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3265:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3266:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7578);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3283:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3283:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3284:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3284:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3285:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7607);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3301:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3301:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXVariableDeclaration7621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3305:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3306:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3306:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3307:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7642);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3331:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3332:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3333:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7680);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7690); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3340:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3343:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3344:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3344:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3344:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3344:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_ID||LA56_1==18||LA56_1==38||LA56_1==49) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==22||LA56_0==76) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3345:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3345:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3346:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7736);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3362:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3363:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3363:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3364:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7758);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3388:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3389:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3390:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7794);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7804); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3397:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3400:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3401:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3401:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3401:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3401:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3402:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3402:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3403:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7850);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3419:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3420:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3420:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3421:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7871);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3445:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3446:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3447:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7907);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7917); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3454:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3457:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3458:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3458:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3458:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3458:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3459:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3464:2: ( ( ruleStaticQualifier ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==65) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3465:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3465:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3466:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7974);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3479:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==38) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3479:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXFeatureCall7988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3483:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3484:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3484:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3485:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8009);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3501:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==23) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3501:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall8022); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3505:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3506:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3506:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3507:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8043);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleXFeatureCall8057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3527:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3528:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3528:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3529:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8082);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3542:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3542:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3542:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3542:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3549:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3550:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall8116); if (state.failed) return current;
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt61=3;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3580:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3581:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8201);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3598:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3598:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3598:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3598:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3599:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3599:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3600:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8229);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3616:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==23) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3616:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall8242); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3620:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3621:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3621:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3622:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8263);
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
                            	    break loop60;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall8280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3642:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3642:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3647:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3648:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8313);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3672:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3673:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3674:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8351);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8362); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3681:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3684:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3685:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3685:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==64) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3686:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8409);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3698:2: kw= 'super'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleIdOrSuper8433); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3711:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3712:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3713:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8474);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8485); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3720:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3723:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3724:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3724:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==65) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3725:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8532);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier8550); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3749:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3750:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3751:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8591);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8601); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3758:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3761:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3762:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3762:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3762:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3762:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3763:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall8647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3772:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3773:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3773:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3774:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8670);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3787:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3787:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3787:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3787:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleXConstructorCall8691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3792:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3793:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3793:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3794:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8713);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3810:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==23) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3810:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall8726); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3814:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3815:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3815:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3816:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8747);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleXConstructorCall8761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall8784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt69=3;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3858:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3859:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8857);
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3876:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3876:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3876:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3876:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3877:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3877:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3878:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8885);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3894:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==23) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3894:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall8898); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3898:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3899:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3899:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3900:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8919);
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
                            	    break loop68;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3920:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3920:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3925:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3926:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8969);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3950:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3951:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3952:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9006);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9016); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3959:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3962:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3963:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3963:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3963:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3963:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3964:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3969:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==67) ) {
                alt72=1;
            }
            else if ( (LA72_0==68) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3969:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3974:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3974:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3975:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3975:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3976:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9087); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3997:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3998:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3999:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9137);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9147); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4006:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4009:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4010:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4010:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4010:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4010:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4011:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral9193); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4028:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4029:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4030:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9229);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9239); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4037:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4040:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4041:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4041:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4041:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4041:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4047:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4048:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4048:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4049:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9294);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4073:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4074:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4075:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9330);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9340); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4082:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4085:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4086:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4086:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4086:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4086:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4087:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4092:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4093:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4093:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4094:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9391); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4118:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4119:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4120:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9432);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9442); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4127:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4130:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4131:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4131:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4131:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4131:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4132:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral9488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXTypeLiteral9500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4145:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4146:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4146:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4147:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9523);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXTypeLiteral9535); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4172:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4173:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4174:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9571);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9581); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4181:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4184:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4185:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4185:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4185:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4185:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4186:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression9627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4195:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4196:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4196:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4197:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9648);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4221:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4222:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4223:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9684);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9694); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4230:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4233:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4234:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4234:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4234:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4234:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4235:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression9740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4244:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4244:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4249:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4250:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9771);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4274:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4275:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4276:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9808);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9818); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4283:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4286:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4287:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4287:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4287:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4287:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4288:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4297:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4298:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4298:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4299:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9885);
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

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==75) ) {
                alt76=1;
            }
            else if ( (LA76_0==74) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==75) ) {
                            int LA74_2 = input.LA(2);

                            if ( (synpred30_InternalServices()) ) {
                                alt74=1;
                            }


                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4317:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4318:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9915);
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
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==74) ) {
                        int LA75_1 = input.LA(2);

                        if ( (synpred31_InternalServices()) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9937); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4339:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4340:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4340:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4341:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9959);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4358:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4358:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4358:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4362:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4363:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4363:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4364:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10002);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4388:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4389:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4390:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10040);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10050); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4397:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4400:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4401:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4401:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4401:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4401:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4401:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause10095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleXCatchClause10108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4410:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4411:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4411:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4412:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10129);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXCatchClause10141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4432:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4433:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4433:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4434:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10162);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4458:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4459:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4460:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10199);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10210); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4467:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4470:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4471:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4471:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4472:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10257);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4482:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==49) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==RULE_ID) ) {
                        int LA77_3 = input.LA(3);

                        if ( (synpred33_InternalServices()) ) {
                            alt77=1;
                        }


                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4482:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4482:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4482:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,49,FOLLOW_49_in_ruleQualifiedName10285); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10308);
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
            	    break loop77;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4509:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4513:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4514:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10362);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10373); if (state.failed) return current;

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4524:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4528:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4529:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4529:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_HEX) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=RULE_INT && LA81_0<=RULE_DECIMAL)) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4529:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4537:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4537:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4537:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4537:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_INT) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==RULE_DECIMAL) ) {
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
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4537:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10445); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4545:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10471); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4552:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==49) ) {
                        int LA80_1 = input.LA(2);

                        if ( ((LA80_1>=RULE_INT && LA80_1<=RULE_DECIMAL)) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4553:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleNumber10491); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4558:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==RULE_INT) ) {
                                alt79=1;
                            }
                            else if ( (LA79_0==RULE_DECIMAL) ) {
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
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4558:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10507); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4566:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10533); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4584:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4585:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4586:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10586);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10596); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4593:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4596:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4597:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4597:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==22||LA83_0==76) ) {
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4597:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4597:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4598:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10644);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==18) ) {
                            int LA82_2 = input.LA(2);

                            if ( (LA82_2==21) ) {
                                int LA82_3 = input.LA(3);

                                if ( (synpred34_InternalServices()) ) {
                                    alt82=1;
                                }


                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4609:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4609:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4609:6: ()
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4610:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleJvmTypeReference10682); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleJvmTypeReference10694); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4625:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10726);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4641:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4642:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4643:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10761);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10771); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4650:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4653:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4654:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4654:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4654:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4654:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==22) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4654:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleXFunctionTypeRef10809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4658:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_ID||LA85_0==22||LA85_0==76) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4658:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4658:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4659:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4659:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4660:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10831);
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

                            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4676:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==23) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4676:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXFunctionTypeRef10844); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4680:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4681:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4681:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4682:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10865);
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
                            	    break loop84;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleXFunctionTypeRef10881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleXFunctionTypeRef10895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4706:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4707:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4707:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4708:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10916);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4732:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4733:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4734:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10952);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10962); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4741:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4744:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4745:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4745:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4745:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4745:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4746:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4746:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4747:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11010);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleJvmParameterizedTypeReference11031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4765:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4766:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4766:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4767:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11053);
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

                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4783:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==23) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4783:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleJvmParameterizedTypeReference11066); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4787:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4788:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4788:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4789:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11087);
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
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleJvmParameterizedTypeReference11101); if (state.failed) return current;
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4817:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4818:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4819:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11139);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11149); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4826:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4829:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4830:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4830:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID||LA89_0==22||LA89_0==76) ) {
                alt89=1;
            }
            else if ( (LA89_0==77) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4831:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11196);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4841:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11223);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4857:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4858:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4859:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11258);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11268); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4866:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4869:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4870:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4870:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4870:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4870:2: ()
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4871:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleJvmWildcardTypeReference11314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4880:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt90=3;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==78) ) {
                alt90=1;
            }
            else if ( (LA90_0==64) ) {
                alt90=2;
            }
            switch (alt90) {
                case 1 :
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4880:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4880:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4881:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4881:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4882:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11336);
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
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4899:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4899:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4900:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4900:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4901:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11363);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4925:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4926:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4927:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11401);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11411); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4934:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4937:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4938:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4938:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4938:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBound11448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4942:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4943:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4943:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4944:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11469);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4968:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4969:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4970:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11505);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11515); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4977:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4980:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4981:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4981:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4981:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBoundAnded11552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4985:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4986:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4986:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4987:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11573);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5011:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5012:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5013:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11609);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11619); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5020:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5023:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5024:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5024:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5024:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmLowerBound11656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5028:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5029:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5029:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5030:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11677);
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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5056:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5057:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5058:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11716);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11727); if (state.failed) return current;

            }

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
    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5065:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5068:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:5069:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11766); if (state.failed) return current;
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:522:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:523:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:523:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:524:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:524:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:525:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1024);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:650:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:651:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:651:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:652:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:652:1: ( ruleOpOr )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:653:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalServices1372);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:751:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:752:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:752:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:753:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:753:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:754:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalServices1631);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:852:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:853:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:853:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:854:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:854:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:855:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalServices1890);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:960:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:961:1: 
        {
        }

        match(input,34,FOLLOW_34_in_synpred5_InternalServices2166); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalServices

    // $ANTLR start synpred6_InternalServices
    public final void synpred6_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:991:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:992:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:992:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:993:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:993:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:994:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalServices2237);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1113:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1114:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1114:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1115:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1115:1: ( ruleOpOther )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1116:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalServices2556);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1221:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1222:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1222:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1223:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1224:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalServices2836);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1329:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1330:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1330:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1331:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1332:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalServices3116);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:4: ( () 'as' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:5: () 'as'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1562:5: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1563:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred10_InternalServices3710); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalServices

    // $ANTLR start synpred11_InternalServices
    public final void synpred11_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1622:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1623:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred11_InternalServices3864); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1624:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1625:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1625:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1626:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalServices3873);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices3879);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalServices

    // $ANTLR start synpred12_InternalServices
    public final void synpred12_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1680:10: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1681:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1681:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt91=3;
        switch ( input.LA(1) ) {
        case 49:
            {
            alt91=1;
            }
            break;
        case 50:
            {
            alt91=2;
            }
            break;
        case 51:
            {
            alt91=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 91, 0, input);

            throw nvae;
        }

        switch (alt91) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1681:4: '.'
                {
                match(input,49,FOLLOW_49_in_synpred12_InternalServices3982); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1683:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1683:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1684:1: ( '?.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1684:1: ( '?.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1685:2: '?.'
                {
                match(input,50,FOLLOW_50_in_synpred12_InternalServices3996); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1690:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1690:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1691:1: ( '*.' )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1691:1: ( '*.' )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1692:2: '*.'
                {
                match(input,51,FOLLOW_51_in_synpred12_InternalServices4016); if (state.failed) return ;

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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1801:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1802:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1802:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1803:2: '('
        {
        match(input,22,FOLLOW_22_in_synpred13_InternalServices4243); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalServices

    // $ANTLR start synpred14_InternalServices
    public final void synpred14_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1822:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1823:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1823:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==22||LA93_0==76) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1823:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1823:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1824:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1824:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1825:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4295);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1827:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==23) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1827:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,23,FOLLOW_23_in_synpred14_InternalServices4302); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1828:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1829:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1829:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1830:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4309);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1832:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1833:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1833:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1834:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred14_InternalServices4323); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalServices

    // $ANTLR start synpred15_InternalServices
    public final void synpred15_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1901:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1902:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1902:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:1903:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalServices4441);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalServices

    // $ANTLR start synpred16_InternalServices
    public final void synpred16_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==22||LA95_0==76) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2184:5: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2185:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2185:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2186:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5214);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2188:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==23) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2188:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,23,FOLLOW_23_in_synpred16_InternalServices5221); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2189:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2190:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2190:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2191:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5228);
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

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2193:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2194:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2194:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2195:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred16_InternalServices5242); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalServices

    // $ANTLR start synpred18_InternalServices
    public final void synpred18_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2554:4: ( 'else' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2554:6: 'else'
        {
        match(input,55,FOLLOW_55_in_synpred18_InternalServices6025); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalServices

    // $ANTLR start synpred19_InternalServices
    public final void synpred19_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2608:6: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2609:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2609:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2610:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalServices6167);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,25,FOLLOW_25_in_synpred19_InternalServices6173); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalServices

    // $ANTLR start synpred20_InternalServices
    public final void synpred20_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2654:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,22,FOLLOW_22_in_synpred20_InternalServices6249); if (state.failed) return ;
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2655:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2656:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2656:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:2657:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalServices6256);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,25,FOLLOW_25_in_synpred20_InternalServices6262); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalServices

    // $ANTLR start synpred21_InternalServices
    public final void synpred21_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3238:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3239:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3239:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3240:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices7527);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3242:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3243:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3243:1: ( ruleValidID )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3244:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalServices7536);
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
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3542:4: ( ( '(' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3543:1: ( '(' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3543:1: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3544:2: '('
        {
        match(input,22,FOLLOW_22_in_synpred22_InternalServices8098); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalServices

    // $ANTLR start synpred23_InternalServices
    public final void synpred23_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3563:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3564:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3564:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==22||LA99_0==76) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3564:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3564:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3565:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3565:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3566:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8150);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3568:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==23) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3568:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,23,FOLLOW_23_in_synpred23_InternalServices8157); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3569:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3570:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3570:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3571:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8164);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3573:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3574:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3574:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3575:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred23_InternalServices8178); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalServices

    // $ANTLR start synpred24_InternalServices
    public final void synpred24_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3642:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3643:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3643:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3644:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalServices8296);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalServices

    // $ANTLR start synpred25_InternalServices
    public final void synpred25_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3787:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3787:6: '<'
        {
        match(input,38,FOLLOW_38_in_synpred25_InternalServices8683); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalServices

    // $ANTLR start synpred26_InternalServices
    public final void synpred26_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:5: ( '(' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3836:7: '('
        {
        match(input,22,FOLLOW_22_in_synpred26_InternalServices8776); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalServices

    // $ANTLR start synpred27_InternalServices
    public final void synpred27_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3841:6: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3842:1: 
        {
        }

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3842:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==22||LA101_0==76) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3842:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3842:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3843:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3843:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3844:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices8806);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3846:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==23) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3846:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,23,FOLLOW_23_in_synpred27_InternalServices8813); if (state.failed) return ;
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3847:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3848:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3848:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3849:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices8820);
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

        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3851:6: ( ( '|' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3852:1: ( '|' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3852:1: ( '|' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3853:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred27_InternalServices8834); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalServices

    // $ANTLR start synpred28_InternalServices
    public final void synpred28_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3920:4: ( ( ruleXClosure ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3921:1: ( ruleXClosure )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3921:1: ( ruleXClosure )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:3922:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred28_InternalServices8952);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalServices

    // $ANTLR start synpred29_InternalServices
    public final void synpred29_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4244:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4245:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4245:1: ( ruleXExpression )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4246:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred29_InternalServices9754);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalServices

    // $ANTLR start synpred30_InternalServices
    public final void synpred30_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:5: ( 'catch' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4315:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred30_InternalServices9899); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalServices

    // $ANTLR start synpred31_InternalServices
    public final void synpred31_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:5: ( 'finally' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4334:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred31_InternalServices9929); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalServices

    // $ANTLR start synpred33_InternalServices
    public final void synpred33_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4482:3: ( '.' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4483:2: '.'
        {
        match(input,49,FOLLOW_49_in_synpred33_InternalServices10276); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalServices

    // $ANTLR start synpred34_InternalServices
    public final void synpred34_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:2: ( ( () '[' ']' ) )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:3: ( () '[' ']' )
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:3: ( () '[' ']' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:4: () '[' ']'
        {
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4606:4: ()
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4607:1: 
        {
        }

        match(input,18,FOLLOW_18_in_synpred34_InternalServices10659); if (state.failed) return ;
        match(input,21,FOLLOW_21_in_synpred34_InternalServices10663); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalServices

    // $ANTLR start synpred35_InternalServices
    public final void synpred35_InternalServices_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:4: ( '<' )
        // ../org.eclipse.xtext.services/src-gen/org/eclipse/xtext/services/parser/antlr/internal/InternalServices.g:4760:6: '<'
        {
        match(input,38,FOLLOW_38_in_synpred35_InternalServices11023); if (state.failed) return ;

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


    protected DFA31 dfa31 = new DFA31(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA31_eotS =
        "\76\uffff";
    static final String DFA31_eofS =
        "\1\2\75\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA31_maxS =
        "\1\114\1\0\74\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA31_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\2\2\uffff\1\2\1\1\3\2\3\uffff\27"+
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
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1801:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\36\uffff";
    static final String DFA30_eofS =
        "\36\uffff";
    static final String DFA30_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA30_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA30_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA30_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\5\3\uffff\1\2\1\uffff\1\35\15"+
            "\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\4\1\uffff\1\5\1"+
            "\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "1822:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==RULE_ID) ) {s = 1;}

                        else if ( (LA30_0==22) ) {s = 2;}

                        else if ( (LA30_0==76) && (synpred14_InternalServices())) {s = 3;}

                        else if ( (LA30_0==52) && (synpred14_InternalServices())) {s = 4;}

                        else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_DECIMAL)||LA30_0==15||LA30_0==18||LA30_0==38||(LA30_0>=41 && LA30_0<=42)||LA30_0==47||LA30_0==54||LA30_0==56||(LA30_0>=59 && LA30_0<=61)||LA30_0==64||(LA30_0>=66 && LA30_0<=73)) ) {s = 5;}

                        else if ( (LA30_0==24) ) {s = 29;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\76\uffff";
    static final String DFA32_eofS =
        "\1\2\75\uffff";
    static final String DFA32_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA32_maxS =
        "\1\114\1\0\74\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA32_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\1\2\uffff\5\2\3\uffff\27\2\1\uffff"+
            "\14\2\1\uffff\13\2",
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
            return "1901:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_1);
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
    static final String DFA38_eotS =
        "\40\uffff";
    static final String DFA38_eofS =
        "\40\uffff";
    static final String DFA38_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA38_maxS =
        "\1\114\2\0\35\uffff";
    static final String DFA38_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA38_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA38_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\5\2\uffff\1\5\1\2\17\uffff\1"+
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2184:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_0 = input.LA(1);

                         
                        int index38_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA38_0==RULE_ID) ) {s = 1;}

                        else if ( (LA38_0==22) ) {s = 2;}

                        else if ( (LA38_0==76) && (synpred16_InternalServices())) {s = 3;}

                        else if ( (LA38_0==52) && (synpred16_InternalServices())) {s = 4;}

                        else if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_DECIMAL)||LA38_0==15||LA38_0==18||LA38_0==21||LA38_0==38||(LA38_0>=41 && LA38_0<=42)||LA38_0==47||LA38_0==54||LA38_0==56||(LA38_0>=59 && LA38_0<=64)||(LA38_0>=66 && LA38_0<=73)) ) {s = 5;}

                         
                        input.seek(index38_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\76\uffff";
    static final String DFA62_eofS =
        "\1\2\75\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA62_maxS =
        "\1\114\1\0\74\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA62_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\2\2\uffff\1\2\1\1\3\2\3\uffff\27"+
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
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3542:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\36\uffff";
    static final String DFA61_eofS =
        "\36\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA61_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA61_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\5\3\uffff\1\2\1\uffff\1\35\15"+
            "\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\4\1\uffff\1\5\1"+
            "\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3563:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==22) ) {s = 2;}

                        else if ( (LA61_0==76) && (synpred23_InternalServices())) {s = 3;}

                        else if ( (LA61_0==52) && (synpred23_InternalServices())) {s = 4;}

                        else if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_DECIMAL)||LA61_0==15||LA61_0==18||LA61_0==38||(LA61_0>=41 && LA61_0<=42)||LA61_0==47||LA61_0==54||LA61_0==56||(LA61_0>=59 && LA61_0<=61)||LA61_0==64||(LA61_0>=66 && LA61_0<=73)) ) {s = 5;}

                        else if ( (LA61_0==24) ) {s = 29;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\76\uffff";
    static final String DFA63_eofS =
        "\1\2\75\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA63_maxS =
        "\1\114\1\0\74\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\1\2\uffff\5\2\3\uffff\27\2\1\uffff"+
            "\14\2\1\uffff\13\2",
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
            return "3642:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index63_1);
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
    static final String DFA67_eotS =
        "\76\uffff";
    static final String DFA67_eofS =
        "\1\2\75\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA67_maxS =
        "\1\114\1\0\74\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\2\2\uffff\5\2\3\uffff\11\2\1\1\15"+
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
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3787:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
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
        "\1\114\1\0\74\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\2\2\uffff\1\2\1\1\3\2\3\uffff\27"+
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
            return "3836:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalServices()) ) {s = 61;}

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
    static final String DFA69_eotS =
        "\36\uffff";
    static final String DFA69_eofS =
        "\36\uffff";
    static final String DFA69_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA69_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA69_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA69_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA69_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\5\3\uffff\1\2\1\uffff\1\35\15"+
            "\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\4\1\uffff\1\5\1"+
            "\uffff\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3841:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_0 = input.LA(1);

                         
                        int index69_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_0==RULE_ID) ) {s = 1;}

                        else if ( (LA69_0==22) ) {s = 2;}

                        else if ( (LA69_0==76) && (synpred27_InternalServices())) {s = 3;}

                        else if ( (LA69_0==52) && (synpred27_InternalServices())) {s = 4;}

                        else if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_DECIMAL)||LA69_0==15||LA69_0==18||LA69_0==38||(LA69_0>=41 && LA69_0<=42)||LA69_0==47||LA69_0==54||LA69_0==56||(LA69_0>=59 && LA69_0<=61)||LA69_0==64||(LA69_0>=66 && LA69_0<=73)) ) {s = 5;}

                        else if ( (LA69_0==24) ) {s = 29;}

                         
                        input.seek(index69_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalServices()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index69_2);
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
    static final String DFA71_eotS =
        "\76\uffff";
    static final String DFA71_eofS =
        "\1\2\75\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA71_maxS =
        "\1\114\1\0\74\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA71_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\1\2\uffff\5\2\3\uffff\27\2\1\uffff"+
            "\14\2\1\uffff\13\2",
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
            return "3920:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
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
        "\1\33\75\uffff";
    static final String DFA73_minS =
        "\1\4\32\0\43\uffff";
    static final String DFA73_maxS =
        "\1\114\32\0\43\uffff";
    static final String DFA73_acceptS =
        "\33\uffff\1\2\41\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\43\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\6\uffff\1\6\1\33\1\uffff\1\12\2\uffff"+
            "\1\33\1\32\3\33\3\uffff\11\33\1\10\2\33\1\4\1\3\4\33\1\2\4\33"+
            "\1\uffff\1\33\1\23\1\33\1\7\2\33\1\24\1\25\1\26\2\33\1\11\1"+
            "\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\3\33",
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
            return "4244:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalServices()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_26);
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
    static final String DFA88_eotS =
        "\77\uffff";
    static final String DFA88_eofS =
        "\1\2\76\uffff";
    static final String DFA88_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA88_maxS =
        "\1\114\1\0\75\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA88_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\1\2\2\uffff\6\2\2\uffff\11\2\1\1\15"+
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

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "4760:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalServices()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComponent122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponent143 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleComponent164 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_14_in_ruleComponent177 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleComponent198 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent210 = new BitSet(new long[]{0x0000000000030100L});
    public static final BitSet FOLLOW_ruleService_in_ruleComponent231 = new BitSet(new long[]{0x0000000000030100L});
    public static final BitSet FOLLOW_16_in_ruleComponent244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleService334 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleService359 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleService378 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20_in_ruleService415 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleService441 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleService464 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleService476 = new BitSet(new long[]{0x0000000001400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleService498 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleService511 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleService532 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleService548 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleService560 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleService581 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_26_in_ruleService594 = new BitSet(new long[]{0x0000000004408100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleService615 = new BitSet(new long[]{0x0000000004408100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleService639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleImport722 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment937 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment953 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1003 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1056 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpSingleAssign1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpMultiAssign1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1351 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1404 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1427 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOr1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1610 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1663 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1686 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAnd1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1869 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1922 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1945 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpEquality2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpEquality2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2149 = new BitSet(new long[]{0x0000007C00000002L});
    public static final BitSet FOLLOW_34_in_ruleXRelationalExpression2185 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2208 = new BitSet(new long[]{0x0000007C00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2269 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2292 = new BitSet(new long[]{0x0000007C00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpCompare2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2535 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2588 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2611 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2815 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2868 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2891 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpAdd2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpAdd2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3095 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3148 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3171 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3424 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpUnary3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3694 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXCastedExpression3729 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3752 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3847 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall3896 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3919 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3935 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3957 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4043 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4067 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall4104 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4133 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4154 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall4167 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4188 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4202 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4227 = new BitSet(new long[]{0x000E000000440002L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall4261 = new BitSet(new long[]{0x39508640054481F0L,0x00000000000013FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4346 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4374 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall4387 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4408 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall4425 = new BitSet(new long[]{0x000E000000040002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4458 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXClosure5197 = new BitSet(new long[]{0xF9508640046481F0L,0x00000000000013FDL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5268 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXClosure5281 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5302 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5324 = new BitSet(new long[]{0xF9408640046481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5361 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXClosure5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5475 = new BitSet(new long[]{0xF9608640044481F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_53_in_ruleXExpressionInClosure5488 = new BitSet(new long[]{0xF9408640044481F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5646 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXShortClosure5659 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5680 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_52_in_ruleXShortClosure5702 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleXParenthesizedExpression5821 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5843 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXParenthesizedExpression5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression5946 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXIfExpression5958 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5979 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXIfExpression5991 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6012 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6033 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6149 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6192 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXSwitchExpression6204 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6228 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_22_in_ruleXSwitchExpression6272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6293 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXSwitchExpression6305 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6328 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXSwitchExpression6340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression6354 = new BitSet(new long[]{0x0400000002400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6375 = new BitSet(new long[]{0x0600000002410100L,0x0000000000001000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6389 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXSwitchExpression6401 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6422 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6528 = new BitSet(new long[]{0x0400000002000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6542 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6563 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXCasePart6577 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression6690 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXForLoopExpression6702 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6723 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXForLoopExpression6735 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6756 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXForLoopExpression6768 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression6881 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXWhileExpression6893 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6914 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXWhileExpression6926 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7039 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7060 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7072 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXDoWhileExpression7084 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7105 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXDoWhileExpression7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression7209 = new BitSet(new long[]{0xF9408640044581F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7231 = new BitSet(new long[]{0xF9608640044581F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7244 = new BitSet(new long[]{0xF9408640044581F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7478 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7509 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7557 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7578 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7607 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleXVariableDeclaration7621 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7736 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7850 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7974 = new BitSet(new long[]{0x0000004000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_38_in_ruleXFeatureCall7988 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8009 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall8022 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8043 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleXFeatureCall8057 = new BitSet(new long[]{0x0000004000000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8082 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall8116 = new BitSet(new long[]{0x39508640054481F0L,0x00000000000013FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8201 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8229 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall8242 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8263 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall8280 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIdOrSuper8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier8550 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall8647 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8670 = new BitSet(new long[]{0x0000004000440002L});
    public static final BitSet FOLLOW_38_in_ruleXConstructorCall8691 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8713 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall8726 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8747 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleXConstructorCall8761 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall8784 = new BitSet(new long[]{0x39508640054481F0L,0x00000000000013FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8857 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8885 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall8898 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8919 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8936 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral9488 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXTypeLiteral9500 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9523 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXTypeLiteral9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression9627 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression9740 = new BitSet(new long[]{0x39408640044481F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9864 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9937 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9981 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause10095 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXCatchClause10108 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10129 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXCatchClause10141 = new BitSet(new long[]{0x39408640044481F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10257 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleQualifiedName10285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10308 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10445 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10471 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumber10491 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10644 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleJvmTypeReference10682 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleJvmTypeReference10694 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleXFunctionTypeRef10809 = new BitSet(new long[]{0x0000000001400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10831 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleXFunctionTypeRef10844 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10865 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleXFunctionTypeRef10881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXFunctionTypeRef10895 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11010 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleJvmParameterizedTypeReference11031 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11053 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleJvmParameterizedTypeReference11066 = new BitSet(new long[]{0x0000000000400100L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11087 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleJvmParameterizedTypeReference11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmWildcardTypeReference11314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004001L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBound11448 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBoundAnded11552 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmLowerBound11656 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalServices1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalServices1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalServices1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalServices1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred5_InternalServices2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalServices2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalServices2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalServices2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalServices3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred10_InternalServices3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred11_InternalServices3864 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalServices3873 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalServices3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred12_InternalServices3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred12_InternalServices3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred12_InternalServices4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred13_InternalServices4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4295 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_23_in_synpred14_InternalServices4302 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalServices4309 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_52_in_synpred14_InternalServices4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalServices4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5214 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_23_in_synpred16_InternalServices5221 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalServices5228 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_52_in_synpred16_InternalServices5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred18_InternalServices6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalServices6167 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred19_InternalServices6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred20_InternalServices6249 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalServices6256 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred20_InternalServices6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalServices7527 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalServices7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred22_InternalServices8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8150 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_23_in_synpred23_InternalServices8157 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalServices8164 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_52_in_synpred23_InternalServices8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalServices8296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred25_InternalServices8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred26_InternalServices8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices8806 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_23_in_synpred27_InternalServices8813 = new BitSet(new long[]{0x0000000000400100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalServices8820 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_52_in_synpred27_InternalServices8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred28_InternalServices8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred29_InternalServices9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred30_InternalServices9899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred31_InternalServices9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred33_InternalServices10276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred34_InternalServices10659 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred34_InternalServices10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred35_InternalServices11023 = new BitSet(new long[]{0x0000000000000002L});

}